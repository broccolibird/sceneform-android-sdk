import org.gradle.api.publish.maven.MavenPublication

fun MavenPublication.configureSceneformPom(pomDescription: String) {
    val pomName = artifactId
    pom {
        name.set(pomName)
        description.set(pomDescription)
        url.set("https://github.com/streem/sceneform-android-sdk")

        licenses {
            license {
                name.set("Apache License, Version 2.0")
                url.set("https://opensource.org/licenses/Apache-2.0")
            }
        }

        organization {
            name.set("Streem, LLC")
            url.set("https://github.com/streem")
        }

        developers {
            developer {
                id.set("streem")
                name.set("Streem, LLC")
                url.set("https://github.com/streem")
            }
        }

        scm {
            connection.set("scm:git:git@github.com:streem/sceneform-android-sdk.git")
            developerConnection.set("scm:git:git@github.com:streem/sceneform-android-sdk.git")
            url.set("git@github.com:streem/sceneform-android-sdk.git")
        }
    }
}