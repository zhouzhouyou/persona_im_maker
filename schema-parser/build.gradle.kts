import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.wire)
    alias(libs.plugins.kotlinxSerialization)
    alias(libs.plugins.androidLibrary)
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

    androidTarget {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
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

android {
    namespace = "com.yuri.persona_im_maker.schema_parser"
    compileSdk = libs.versions.android.compileSdk.get().toInt()

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    commonTestImplementation(libs.kotlin.test)
}