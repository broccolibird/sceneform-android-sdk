import com.android.build.gradle.LibraryExtension
import com.android.build.gradle.LibraryPlugin
import io.github.gradlenexus.publishplugin.NexusPublishExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

// Top-level build file where you can add configuration options common to
// all sub-projects/modules.

plugins {
    kotlin("android") version Versions.kotlin apply false
    id("com.android.library") version Versions.androidGradlePlugin apply false

    id("io.github.gradle-nexus.publish-plugin") version Versions.nexusPublishGradlePlugin
}

val sonatypeApiUser = providers.gradlePropertyOrEnvironmentVariable("sonatypeApiUser")
val sonatypeApiKey = providers.gradlePropertyOrEnvironmentVariable("sonatypeApiKey")
if (sonatypeApiUser.isPresent && sonatypeApiKey.isPresent) {
    configure<NexusPublishExtension> {
        repositories {
            sonatype {
                nexusUrl.set(uri("https://s01.oss.sonatype.org/service/local/"))
                snapshotRepositoryUrl.set(uri("https://s01.oss.sonatype.org/content/repositories/snapshots/"))
                username.set(sonatypeApiUser)
                password.set(sonatypeApiKey)
            }
        }
    }
} else {
    logger.info("Sonatype API key not defined, skipping configuration of Maven Central publishing repository")
}

val signingKeyAsciiArmored = providers.gradlePropertyOrEnvironmentVariable("signingKeyAsciiArmored")
if (signingKeyAsciiArmored.isPresent) {
    subprojects {
        plugins.withType<SigningPlugin> {
            configure<SigningExtension> {
                @Suppress("UnstableApiUsage")
                useInMemoryPgpKeys(signingKeyAsciiArmored.get(), "")
                sign(extensions.getByType<PublishingExtension>().publications)
            }
        }
    }
} else {
    logger.info("PGP signing key not defined, skipping signing configuration")
}

subprojects {
    repositories {
        google()
        mavenCentral()
    }

    plugins.withType<LibraryPlugin> {
        configure<LibraryExtension> {
            compileSdkVersion(Versions.compileSdkVersion)

            defaultConfig {
                minSdkVersion(Versions.minSdkVersion)
                targetSdkVersion(Versions.targetSdkVersion)
                versionCode = 1
                versionName = "1.0"
            }

            compileOptions {
                sourceCompatibility = JavaVersion.VERSION_1_8
                targetCompatibility = JavaVersion.VERSION_1_8
            }

            buildTypes {
                val release by getting {
                    isMinifyEnabled = false
                    proguardFiles(
                        getDefaultProguardFile("proguard-android.txt"),
                        "proguard-rules.pro"
                    )
                }
            }

            resourcePrefix = "streem_sceneform_"

            val android = extensions.getByType<LibraryExtension>()

            libraryVariants
                .matching { it.name == "release" }
                .all {
                    val srcDirs = getSourceFolders(com.android.build.gradle.api.SourceKind.JAVA)

                    val sourcesJar by tasks.registering(Jar::class) {
                        archiveClassifier.set("sources")
                        from(srcDirs)
                    }

                    val javadoc by tasks.registering(Javadoc::class) {
                        isFailOnError = false
                        source(srcDirs)
                        classpath += files(android.bootClasspath)
                        classpath += javaCompileProvider.map { it.classpath }.get()
                    }

                    val javadocJar by tasks.registering(Jar::class) {
                        archiveClassifier.set("javadoc")
                        from(javadoc)
                    }
                }
        }

        plugins.withType<MavenPublishPlugin> {
            afterEvaluate {
                configure<PublishingExtension> {
                    val release by publications.creating(MavenPublication::class) {
                        from(components["release"])
                        artifact(tasks.named("sourcesJar"))
                        artifact(tasks.named("javadocJar"))
                        artifactId = convention.getPlugin<BasePluginConvention>().archivesBaseName
                        configureSceneformPom(project.description!!)
                    }
                }
            }
        }
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }
}