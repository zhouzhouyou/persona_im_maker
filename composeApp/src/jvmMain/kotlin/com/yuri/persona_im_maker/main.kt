package com.yuri.persona_im_maker

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import io.github.vinceglb.filekit.FileKit

fun main() {
    FileKit.init(appId = "com.yuri.persona_im_maker")

    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "personal_im_maker",
        ) {
            App()
        }
    }
}