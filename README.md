# Streem's Sceneform Android SDK fork

This repository contains Streem's fork of Google's Sceneform Android SDK. Google
is no longer developing Sceneform, and released most of the source.

The original contents of this README from the 1.16.0 open source release from
Google are preserved at the bottom of this document, though users of Streem's 
fork should follow the installation instructions below.

The current version of Streem's fork is 2.0.5. We incremented the version number
to 2.0.x in a recent release because it contains breaking changes, specifically that
all classes are now in the "pro.streem" namespace rather than "com.google". This
is to allow usage in apps that have a dependency on other versions of Sceneform.

## Installation

Add the Maven Central repository to your project `build.gradle` file:

```gradle
repositories {
    ...
    // This repository is only needed if using a SNAPSHOT version of Sceneform
    maven { url "https://s01.oss.sonatype.org/content/repositories/snapshots/" }

    mavenCentral()
    ...
}
```

Add sceneform-ux and core to your dependencies in your module `build.gradle` file:

```gradle
dependencies {
    ...
    implementation "pro.streem.sceneform:core:2.0.5"
    implementation "pro.streem.sceneform:sceneform-ux:2.0.5"
    ...
}
```

If your project's minimum SDK version is less than 24, add this to your AndroidManifest:

```
    <uses-sdk tools:overrideLibrary="pro.streem.ar.sceneform, pro.streem.ar.sceneform.ux"/>
```
In this case it is your responsibility to check the current device's SDK level at runtime
before using Sceneform functionality. If you try to use Sceneform on a device with SDK
less than 24 it may crash your app.

## Changelog

### 2.0.6 (Unreleased)

### 2.0.5

* Added optional support for continuing AR features in multi-window and picture in picture
  scenarios, through a protected flag in BaseArFragment. When enabled, AR starting and stopping
  are moved to onStart()/onStop() from onResume()/onPause().

### 2.0.4

* Update Filament version from 1.7.0 to 1.8.0 and recompile .mat files accordingly

### 2.0.3

* Published to Maven Central.
* Renamed the `pro.streem.sceneform.ux:sceneform-ux` maven artifact to `pro.streem.sceneform:sceneform-ux`.

### 2.0.2

* Prefixed all resources with "streem_" to prevent resource collisions when used alongside
  other Sceneform libraries.
* Reverted Filament dependency to version 1.7.0 to maintain backward compatibility with
  apps that also use Google's Sceneform 1.17.1 release.

### 2.0.1

* Removed libs/libsceneform_runtime_schemas.jar and replaced with decompiled source files
  refactored into pro.streem namespace, allowing move of com.google.flatbuffers into
  pro.streem namespace as well.

### 2.0.0

* Moved all classes from "com.google" package to "pro.streem" package. This is a breaking
  change, and you will need to update your references to classes accordingly.
* Updated to ARCore 1.22.0 and Filament 1.9.11.
* Generated new .matc material files.
* Updated Google Material library to 1.3.0.

### 1.18.0

* Updated to ARCore 1.21.0 and Filament 1.9.9.
* Generated new .matc material files.
* Migrated to AndroidX
* Updated to latest Gradle and build tools.
* Updated build target SDK to 30.
* Converted build.gradle and settings.gradle files to Kotlin.
* Added publishing of sceneform-ux and core AAR artifacts to JCenter, eliminating
  the need to add the corresponding source trees to your project as Google
  describes in the 1.16.0 release notes.
  
## Deploying to Maven Central

Releases are handled automatically via CI once the git tag is created. We use semantic versioning.

Setup a couple shell variables to simplify the rest of the commands below:

```sh
export VERSION="2.0.4"
export NEXT_VERSION="2.0.5"
```

To create a new release:
1. Update the Sceneform version number in `gradle.properties` to remove the `SNAPSHOT` suffix. For example, if the current version is `2.0.1-SNAPSHOT`, then update it to be `2.0.1`.
1. Update `README.md`:
    * Update the version number in the instructions to the same version as in `gradle.properties` from the previous step.
    * Add/update the changelog entry for this version with release notes and remove the "(Unreleased)" comment next to it.
1. Commit the change. E.g.: `git commit -m "Bump to ${VERSION}" -a`.
1. Tag the new version. E.g.: `git tag -a -m "See https://github.com/streem/sceneform-android-sdk/blob/v${VERSION}/README.md#changelog" "v${VERSION}"`.

Then prepare the repository for development of the next version:
1. Update the Sceneform version number in `gradle.properties` to `${NEXT_VERSION}-SNAPSHOT`. For example, `2.0.5-SNAPSHOT`.
1. Update `README.md`: add an empty changelog entry for "NEXT\_VERSION (Unreleased)" that will follow the released version (e.g. if releasing `2.0.4` then add a section for `2.0.5`).
1. Commit the change. E.g.: `git commit -m "Bump to ${NEXT_VERSION}-SNAPSHOT" -a`.

GitHub will build and publish the new release once it sees the new tag:
1. Push the changes to GitHub: `git push origin --follow-tags master`.
1. Wait for CI to notice the new tag, build it, and upload it to Maven Central.
1. Create a new release on GitHub. Use the contents of the tag description as the release description. E.g.: `gh release create "v${VERSION}" -F <(git tag -l --format='%(contents)' "v${VERSION}")`.

 

Sceneform SDK for Android
=========================
Copyright (c) 2018 Google Inc.  All rights reserved.

Sceneform is a 3D framework with a physically based renderer that's optimized
for mobile devices and that makes it easy for you to build augmented reality
apps without requiring OpenGL.


## Choosing the right Sceneform SDK version for your project

As of ARCore release 1.16.0, Google open-sourced the implementation of Sceneform
allowing you to extend Sceneform's features and capabilities. As part of the
1.16.0 release, support for `SFA` and `SFB` assets was removed in favor of
adding `glTF` support

You can continue to use Sceneform 1.15.0 (or earlier). There is no requirement
that you migrate to Sceneform 1.16.0.

Do not use Sceneform 1.17.0 as that release will not work correctly. (Sceneform
1.17.1 can be used, but is otherwise identical to Sceneform 1.15.0.)


<table>
  <tr>
    <th>Sceneform SDK</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>Sceneform SDK<br>versions <b>1.0.0 - 1.15.0</b></td>
    <td>
      <ul>
        <li>Closed source</li>
        <li>Included in your project as an external Gradle dependency</li>
        <li>
          <code>FBX</code> and <code>OBJ</code> files can be converted to
          Sceneform's <code>SFA</code> and <code>SFB</code> Sceneform
          formats
        </li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>Sceneform SDK<br>version <b>1.16.0</b></td>
    <td>
      <ul>
        <li>Open source</li>
        <li>Built alongside an application as a Gradle module</li>
        <li>
          Supports <a href="https://www.khronos.org/gltf/">glTF</a> instead of
          <code>SFA</code> and <code>SFB</code> Sceneform formats
        </li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>Sceneform SDK<br>version <b>1.17.0</b></td>
    <td>Do not use</td>
  </tr>
  <tr>
    <td>Sceneform SDK<br>version <b>1.17.1</b></td>
    <td>Identical to version 1.15.0</td>
  </tr>
</table>


## Getting started with Sceneform 1.16.0

Use the following steps to include and build the Sceneform 1.16.0 SDK with your
app:

1. Download `sceneform-android-sdk-1.16.0.zip` from the Sceneform SDK
   [releases](https://github.com/google-ar/sceneform-android-sdk/releases/tag/v1.16.0)
   page.
2. Extract the `sceneformsrc` and `sceneformux` directories into your project's
   top-level directory. The resulting directory structure should be similar to
   the following:
```
project
+-- app
|   +-- build.gradle
|   +-- ...
+-- sceneformsrc
+-- sceneformux
+-- build.gradle
+-- settings.gradle
+-- ...
```

3. Modify your project's `settings.gradle` to include the Sceneform projects:
```
include ':app'

// Add these lines:
include ':sceneform'
project(':sceneform').projectDir=new File('sceneformsrc/sceneform')

include ':sceneformux'
project(':sceneformux').projectDir=new File('sceneformux/ux')
```

4. Finally, add a reference to the Sceneform SDK to your app's `build.gradle`:
```
dependencies {
    api project(":sceneformux")
}
```

To get started with the Sceneform SDK, check out the
[Sceneform sample](https://github.com/google-ar/sceneform-android-sdk/tree/master/samples/gltf/app).


## Archived Sceneform 1.15.0 content

Documentation for the Sceneform SDK for Android 1.15.0 is available from
https://developers.google.com/sceneform.

* [Getting started](https://developers.google.com/sceneform/develop/getting-started)
* [API reference](https://developers.google.com/sceneform/reference)
* [Samples](https://github.com/google-ar/sceneform-android-sdk/tree/v1.15.0/samples)


## Release notes

The SDK release notes are available on the
[releases](https://github.com/google-ar/sceneform-android-sdk/releases) page.


## License

Please see the
[LICENSE](https://github.com/google-ar/sceneform-android-sdk/blob/master/LICENSE)
file.


## Brand Guidelines

The Sceneform trademark is a trademark of Google, and is not subject to the
copyright or patent license grants contained in the Apache 2.0-licensed
Sceneform repositories on GitHub. Any uses of the Sceneform trademark other than
those permitted in these guidelines must be approved by Google in advance.

### Purpose of the Brand Guidelines

These guidelines exist to ensure that the Sceneform project can share its
technology under open source licenses while making sure that the "Sceneform"
brand is protected as a meaningful source identifier in a way that's consistent
with trademark law. By adhering to these guidelines, you help to promote the
freedom to use and develop high-quality Sceneform technology.

### Acceptable uses

Because we are open-sourcing the Sceneform technology, you may use the Sceneform
trademark to refer to the project without prior written permission. Examples of
these approved references include the following:

* To refer to the Sceneform project itself;
* To refer to unmodified source code or other files shared by the Sceneform
  repositories on GitHub;
* To accurately identify that your design or implementation is based on, is for
  use with, or is compatible with the Sceneform technology.

Examples:

* "[Your Product] for Sceneform."
* "[Your Product] is a fork of the Sceneform project."
* "[Your Product] is compatible with Sceneform."


### Usage guidelines

* The Sceneform name may never be used or registered in a manner that would
  cause confusion as to Google's sponsorship, affiliation, or endorsement.
* Don't use the Sceneform name, or a confusingly similar term, as part of your
  company name, product name, domain name, or social media profile.
* Other than as permitted by these guidelines, the Sceneform name should not be
  combined with other trademarks, terms, or source identifiers.
* Don't remove, distort or alter the Sceneform name. That includes modifying the
  Sceneform name, for example, through hyphenation, combination, or
  abbreviation. Do not shorten, abbreviate, or create acronyms out of the
  Sceneform name.
* Don't display the Sceneform name using any different stylization, color, or
  font from the surrounding text.
* Don't use the term Sceneform as a verb, or use it in possessive form.


## Terms & Conditions

By downloading the Sceneform SDK for Android, you agree that the
[Google APIs Terms of Service](https://developers.google.com/terms/) governs
your use thereof.


## User privacy requirements

You must disclose the use of Google Play Services for AR (ARCore) and how it
collects and processes data, prominently in your application, easily accessible
to users. You can do this by adding the following text on your main menu or
notice screen: "This application runs on
[Google Play Services for AR](https://play.google.com/store/apps/details?id=com.google.ar.core)
(ARCore), which is provided by Google LLC and governed by the
[Google Privacy Policy](https://policies.google.com/privacy)".
