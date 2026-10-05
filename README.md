# Persona IM Maker
This project's idea is **stolen** (Phantom Thieves should steal things) from https://github.com/chris-horner/Persona-IM, 
I just make it multiplatform and configurable for users.


"Maker" is from super mario maker.

I don't have other devices, so I only test the project on my Windows.

## Project structure

The app edits and plays Persona-style chat sessions, with JSON import/export,
custom senders, favorite senders, and animated backgrounds. Shared Kotlin and
Compose code targets Android, desktop JVM, JavaScript, and Wasm; no iOS target
is currently configured.

| Module | Responsibility |
| --- | --- |
| `androidApp` | Android Activity, manifest, icons, signing, and app packaging |
| `composeApp` | Shared app UI, desktop/web entry points, and desktop packaging |
| `chat-session` | Editor, playback, navigation, and session repository |
| `ui-widget` | Chat rendering, portraits, particles, and animations |
| `ui-resource` | Shared artwork, icons, and Compose resources |
| `schema` | Chat session and message domain models |
| `schema-parser` | JSON serialization and Wire/protobuf generation |
| `mvi` | ViewModel state and reducer infrastructure |
| `task-state` | Progress, success, failure, and cancellation states |
| `utils` | Platform clipboard and application utilities |

Sessions currently use `TemporaryMemoryCache`; favorite senders use
Multiplatform Settings. The session management navigation entry is unfinished
(`TODO()`), and existing meaningful tests focus on JSON round trips.
Custom sender JSON conversion and custom avatar lookup also contain `TODO()`
branches. The existing `JsonTest.testSerialize` omits the required
`backgroundParticle` constructor argument and cannot compile. It also exercises
a custom sender, whose JSON conversion must be implemented before it can pass.

## Build and Compose versions

Compose Multiplatform is pinned to **1.12.1**, the latest stable release checked
on October 5, 2026. Kotlin and the Compose compiler plugin share version
**2.4.10**, satisfying the
[Kotlin 2.3.20 minimum for Compose's JS/Wasm targets](https://github.com/JetBrains/compose-multiplatform/releases/tag/v1.11.0).
Gradle **9.3.1** and Android Gradle Plugin **9.1.1** are required for the Android
dependency set. The Compose Android artifacts require AGP 9.1.0 or newer and
`compileSdk` 37. `targetSdk` remains 36 and `minSdk` remains 24.

Material3 and Adaptive are versioned independently of the Compose plugin.
This project uses the components listed in the
[Compose 1.12.1 release notes](https://github.com/JetBrains/compose-multiplatform/releases/tag/v1.12.1):
Material3 **1.12.0-alpha03** and Adaptive **1.3.0-rc01**. These two components
remain prereleases. Compose Hot Reload uses **1.2.0**, bundled with the 1.12 line.

Use JDK 21 to run Gradle and package the desktop app. Android builds additionally
require Android SDK Platform 37.0 and Build Tools 36.0.0, configured through
`ANDROID_HOME` or `local.properties`. Google provides the
[official command-line tools](https://developer.android.com/studio#command-tools).
Use the included Android CLI to install the required packages:

```sh
android sdk install 'platforms/android-37.0'
android sdk install 'build-tools/36.0.0'
android sdk install 'platform-tools'
```

From the project root, run:

```sh
sh ./gradlew :composeApp:compileKotlinJvm :composeApp:compileKotlinJs :composeApp:compileKotlinWasmJs
sh ./gradlew jvmTest
sh ./gradlew :androidApp:assembleDebug
```

The Android entry point is separated from shared code following the
[official Android/KMP migration guide](https://kotlinlang.org/docs/multiplatform/multiplatform-project-agp-9-migration.html).
All nine KMP modules use `com.android.kotlin.multiplatform.library` and the
`kotlin.android` DSL provided by AGP 9.1.1. The Android application uses AGP's
built-in Kotlin support instead of `org.jetbrains.kotlin.android`. Compose modules explicitly enable
Android resources, and host tests are enabled. Android-specific `actual`
implementations remain in the shared modules. Select `androidApp` in Android
Studio's run configuration; desktop and web commands still use `composeApp`.

The upgrade also adapts Navigation3's `NavDisplay.sceneStrategies` list and
Material3's `DropdownMenuItem.selectedLeadingIcon` parameter.

Validation on October 5, 2026 with Temurin JDK 21.0.12.1:

- JVM, JS, and Wasm Kotlin compilation completed successfully.
- `composeApp:jvmTest` passed.
- Full `jvmTest` is blocked by the existing missing `backgroundParticle`
  argument in `schema-parser`'s `JsonTest`.
- `androidApp:assembleDebug` passed and generated
  `androidApp/build/outputs/apk/debug/androidApp-debug.apk`; its APK signature was
  verified using Build Tools' `apksigner`.
- Wasm browser development build and UI smoke checks passed at 1280×720 and
  390×844: Chinese fonts and avatars, background selection, message editing and
  saving, adding a message, scrolling the character picker, desktop two-pane
  playback, and mobile single-pane playback. Edited content appeared in playback
  and cherry-blossom particles animated. No browser console warnings or errors
  were captured during these checks. Import/export, persistence across restarts,
  and Android device UI were not covered by this browser check.

### Copyright

©ATLUS ©SEGA

All art and character designs in this repository are the property of Atlus Co., Ltd. Material is used for educational purposes only.
## License

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
