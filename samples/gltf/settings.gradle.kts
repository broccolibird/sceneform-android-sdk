pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
    }
    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "com.android.application", "com.android.library" -> {
                    useModule("com.android.tools.build:gradle:${requested.version}")
                }
            }
        }
    }
}

include(":app")

include(":sceneform")
project(":sceneform").projectDir = File("../../sceneform")

include(":sceneformux")
project(":sceneformux").projectDir = File("../../ux")
