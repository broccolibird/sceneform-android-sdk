/*
 * Copyright 2018 Google LLC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Top-level build file where you can add configuration options common to
// all sub-projects/modules.

plugins {
    id("com.jfrog.bintray") version Versions.gradleBintrayPlugin apply false
}

buildscript {
    repositories {
        google()
        jcenter()
        mavenLocal()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:${Versions.androidGradle}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

project(":sceneform") {
    version = Versions.sceneformVersion
}

project(":ux") {
    version = Versions.sceneformVersion
}

val bintrayProperties = java.util.Properties()
val bintrayPropertiesFile = file("bintray.properties")
if (bintrayPropertiesFile.exists()) {
    bintrayProperties.load(java.io.FileInputStream(bintrayPropertiesFile))
}
val bintrayUser by extra(bintrayProperties["bintrayUser"] as String?)
val bintrayApiKey by extra(bintrayProperties["bintrayApiKey"] as String?)

subprojects {
    val subproject = this

    repositories {
        google()
        jcenter()
        mavenLocal()
    }

    plugins.withType<com.jfrog.bintray.gradle.BintrayPlugin> {
        subproject.afterEvaluate {
            configure<com.jfrog.bintray.gradle.BintrayExtension> {
                user = bintrayUser
                key = bintrayApiKey
                setPublications("sceneformArtifact")
                pkg(closureOf<com.jfrog.bintray.gradle.BintrayExtension.PackageConfig> {
                    repo = "sceneform-android-sdk"
                    name =
                            "${subproject.group}:${subproject.convention.getPlugin<BasePluginConvention>().archivesBaseName}"
                    userOrg = "streem"
                    publish = true
                    dryRun = false
                    version.apply {
                        name = subproject.version.toString()
                        desc = "Sceneform Android SDK"
                        released = java.util.Date().toString()
                    }
                })
            }
        }
    }
}
