package com.yuri.persona_im_maker.chat.session

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.performKeyInput
import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.v2.runComposeUiTest
import codes.chrishorner.personasns.Entry
import codes.chrishorner.personasns.LineCoordinates
import codes.chrishorner.personasns.Reply
import com.yuri.im.schema.EmotionMarker
import com.yuri.im.schema.ReplyOptions
import com.yuri.persona_im_maker.chat.session.play.onPlaybackKey
import kotlin.test.Test
import kotlin.test.assertEquals

class ReplyOptionKeyboardTest {
    @Test
    @OptIn(ExperimentalTestApi::class)
    fun enterSelectsHighlightedReplyOptionInsteadOfAdvancingPlayback() = runComposeUiTest {
        val selectedOption = mutableStateOf<Int?>(null)
        var playbackAdvanced = false

        setContent {
            Box(
                Modifier.onPlaybackKey(
                    hasReplyOptions = { true },
                    advance = { playbackAdvanced = true },
                )
            ) {
                Reply(
                    entry = replyOptionsEntry(),
                    selectOption = { selectedOption.value = it },
                )
            }
        }

        waitForIdle()
        onRoot().performKeyInput {
            keyDown(Key.DirectionDown)
            keyUp(Key.DirectionDown)
            keyDown(Key.Enter)
            keyUp(Key.Enter)
        }

        assertEquals(1, selectedOption.value)
        assertEquals(false, playbackAdvanced)
    }

    private fun replyOptionsEntry() = Entry(
        message = ReplyOptions(listOf("Option one", "Option two")),
        image = null,
        lineCoordinates = LineCoordinates(Offset.Zero, Offset.Zero),
        emotionMarker = EmotionMarker.EMOTION_MARKER_NONE,
        lineProgress = mutableStateOf(1f),
        avatarBackgroundScale = mutableStateOf(1f),
        avatarForegroundScale = mutableStateOf(1f),
        messageHorizontalScale = mutableStateOf(1f),
        messageVerticalScale = mutableStateOf(1f),
        messageTextAlpha = mutableStateOf(1f),
        punctuationScale = mutableStateOf(1f),
        imageProgress = mutableStateOf(1f),
    )
}
