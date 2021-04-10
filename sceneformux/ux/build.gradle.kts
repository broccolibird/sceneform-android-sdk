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
plugins {
    id("com.android.library")
    `maven-publish`
    id("com.jfrog.bintray")
}

base {
    group = "pro.streem.sceneform.ux"
    archivesBaseName = "sceneform-ux"
}

android {
    compileSdkVersion(Versions.compileSdkVersion)

    defaultConfig {
        minSdkVersion(Versions.minSdkVersion)
        targetSdkVersion(Versions.compileSdkVersion)
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
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

    resourcePrefix = "streem_sceneform_"
}

dependencies {
    // Use the Sceneform SDK built from the source files included in the sceneformsrc folder.
    api(project(":sceneform"))

    implementation("androidx.appcompat:appcompat:${Versions.androidxAppcompatVersion}")
    implementation("com.google.android.material:material:${Versions.androidMaterialVersion}")
}

afterEvaluate {
    publishing {
        publications {
            val sceneformArtifact by creating(MavenPublication::class) {
                from(components["release"])
                //artifact(javadocJar.get()) // TODO
                artifactId = base.archivesBaseName
            }
        }
    }
}

val compileUxAssets = tasks.registering {
}
