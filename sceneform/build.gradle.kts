plugins {
    id("com.android.library")
    kotlin("android")
    `maven-publish`
    signing
}

base {
    group = "pro.streem.sceneform"
    archivesBaseName = "core"
}

dependencies {
    api("com.google.android.filament:filament-android:${Versions.filament}")
    api("com.google.android.filament:gltfio-android:${Versions.filament}")

    api("com.google.ar:core:${Versions.arCore}")

    implementation("androidx.appcompat:appcompat:${Versions.androidxAppcompat}")
    implementation("com.google.android.material:material:${Versions.androidMaterial}")
}