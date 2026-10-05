import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.wire)
    alias(libs.plugins.kotlinxSerialization)
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

    android.apply {
        namespace = "com.yuri.persona_im_maker.schema_parser"
        compileSdk = libs.versions.android.compileSdk.get().toInt()
        minSdk = libs.versions.android.minSdk.get().toInt()
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
        withHostTest {}
    }
    // Add other targets as needed, e.g., js(), iosX64(), etc.

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(libs.wire.runtime)
                implementation(libs.kotlinx.serialization.json)
                api(projects.schema)
            }
        }
    }
}

wire {
    kotlin {
        javaInterop = false

        sourcePath {
            srcDir("src/main/proto")
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
