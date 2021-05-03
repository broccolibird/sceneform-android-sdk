plugins {
    id("com.android.library")
    kotlin("android")
    `maven-publish`
    signing
}

base {
    group = "pro.streem.sceneform.ux"
    archivesBaseName = "sceneform-ux"
}

dependencies {
    // Use the Sceneform SDK built from the source files included in the sceneform folder.
    api(project(":sceneform"))

    implementation("androidx.appcompat:appcompat:${Versions.androidxAppcompat}")
    implementation("com.google.android.material:material:${Versions.androidMaterial}")
}