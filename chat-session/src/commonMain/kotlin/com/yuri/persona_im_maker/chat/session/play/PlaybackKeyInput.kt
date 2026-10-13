package com.yuri.persona_im_maker.chat.session.play

import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onPreviewKeyEvent
import androidx.compose.ui.input.key.type

/** Routes playback shortcuts around an active reply so it can confirm its highlighted option. */
internal fun Modifier.onPlaybackKey(
    hasReplyOptions: () -> Boolean,
    advance: () -> Unit,
): Modifier = onPreviewKeyEvent { event ->
    val isAdvanceKey = event.key == Key.Enter || event.key == Key.Spacebar
    if (!isAdvanceKey || event.type != KeyEventType.KeyUp) {
        false
    } else if (hasReplyOptions()) {
        false
    } else {
        advance()
        true
    }
}
