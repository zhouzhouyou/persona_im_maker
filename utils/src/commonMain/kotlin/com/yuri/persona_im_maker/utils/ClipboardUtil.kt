package com.yuri.persona_im_maker.utils

import androidx.compose.ui.platform.ClipEntry

expect suspend fun ClipEntry?.getPlainText(): String?

expect fun createClipEntryWithPlainText(text: String): ClipEntry