package com.yuri.persona_im_maker


import com.yuri.persona_im_maker.ui.loadResource
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.platform.LocalFontFamilyResolver
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.platform.Font
import androidx.compose.ui.window.ComposeViewport
import androidx.navigation.ExperimentalBrowserHistoryApi
import androidx.navigation.bindToBrowserNavigation
import androidx.navigation.compose.rememberNavController
import kotlin.js.ExperimentalJsReflectionCreateInstance
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.decodeFromString

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    ComposeViewport() {
        val fontFamilyResolver = LocalFontFamilyResolver.current
        val fontsLoaded = remember { mutableStateOf(false) }
        val app = remember {
            AppWrapper()
        }

        if (fontsLoaded.value) {
            println("Fonts loaded.")
            app.Content()
        }

        LaunchedEffect(Unit) {
            println("Loading fonts...")
            val manifestString = async { loadResource("./fonts-manifest.json") !! }.await().decodeToString()

            val manifest = Json.decodeFromString<FontsManifest>(manifestString)

            awaitAll(*manifest.fonts.map { async { loadResource("./$it.ttf")!! } }.toTypedArray())
                .forEachIndexed { index, font ->
                    val fontFamily = FontFamily(listOf(Font(manifest.fonts[index], font)))
                    fontFamilyResolver.preload(fontFamily)
                }

            fontsLoaded.value = true
        }

    }
}

@Serializable
private data class FontsManifest(val fonts: List<String>)