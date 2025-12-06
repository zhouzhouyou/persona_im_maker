import org.jetbrains.compose.resources.ResourcesExtension
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
    alias(libs.plugins.composeHotReload)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinxSerialization)
}

compose.resources {
    generateResClass = ResourcesExtension.ResourceClassGeneration.Auto
    publicResClass = true
    nameOfResClass = "ChatSessionRes"
    packageOfResClass = "com.yuri.persona_im_maker.chat.session"
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
        commonMain {
            dependencies {
                implementation(libs.compose.runtime)
                implementation(libs.compose.foundation)
                implementation(libs.compose.ui)
                implementation(libs.compose.material3)
                implementation(libs.compose.components.resources)
                implementation(libs.compose.ui.tooling.preview)
                implementation(libs.androidx.lifecycle.viewmodelCompose)
                implementation(libs.androidx.lifecycle.runtimeCompose)
                implementation(libs.androidx.navigation.compose)
                implementation(libs.kotlinx.coroutines)
                implementation(libs.reorderable)
                implementation(libs.kotlinx.serialization.json)
                api(libs.multiplatform.settings)
                implementation(libs.multiplatform.settings.serialization)
                implementation(libs.multiplatform.settings.noArg)
                implementation(libs.filekit.core)
                implementation(libs.compose.material3.adaptive)
                implementation(libs.compose.material3.adaptive.nav3)



                implementation(projects.mvi)
                implementation(projects.uiResource)
                implementation(projects.uiWidget)
                implementation(projects.schema)
                implementation(projects.schemaParser)
                implementation(projects.taskState)
                implementation(projects.utils)
            }
        }

        jvmMain.dependencies {

        }

        androidMain.dependencies {

        }
    }
}

android {
    namespace = "com.yuri.persona_im_maker.chat.session"
    compileSdk = libs.versions.android.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }

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