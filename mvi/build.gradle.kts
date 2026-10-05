import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
    alias(libs.plugins.composeHotReload)
    alias(libs.plugins.androidMultiplatformLibrary)
}

kotlin {
    jvm()

    js {
        browser()
        binaries.executable()
    }

    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        browser()
        binaries.executable()
    }

    android {
        namespace = "com.yuri.persona_im_maker.mvi"
        compileSdk = libs.versions.android.compileSdk.get().toInt()
        minSdk = libs.versions.android.minSdk.get().toInt()
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
        withHostTest {}
        androidResources {
            enable = true
        }
    }
    // Add other targets as needed, e.g., js(), iosX64(), etc.

    sourceSets {
        commonMain {
            dependencies {
                implementation(libs.compose.runtime)
                implementation(libs.compose.foundation)
                implementation(libs.compose.ui)
                api(libs.androidx.lifecycle.viewmodelCompose)
                api(libs.androidx.lifecycle.runtimeCompose)
            }
        }

        jvmMain.dependencies {
            implementation(libs.compose.ui.tooling)
        }

        androidMain.dependencies {
            implementation(libs.compose.ui.tooling.preview)
        }
    }
}

kotlin {
    sourceSets {
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}
