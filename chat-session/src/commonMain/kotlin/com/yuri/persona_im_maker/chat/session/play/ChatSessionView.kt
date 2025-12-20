package com.yuri.persona_im_maker.chat.session.play

import Sns
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onPreviewKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.unit.dp
import codes.chrishorner.personasns.PersonaRed
import codes.chrishorner.personasns.Portraits
import codes.chrishorner.personasns.Transcript
import codes.chrishorner.personasns.rememberTranscriptState
import com.yuri.im.schema.ChatSession
import com.yuri.im.schema.ReceiveMessage
import com.yuri.im.ui.resource.MyResourcePack

@Composable
fun ChatSessionView(
    chatSession: ChatSession,
    navBack: () -> Unit,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    val transcriptState = rememberTranscriptState(
        chatSession
    )

    val focusRequester = remember { FocusRequester() }

    val modifier = Modifier.onPreviewKeyEvent {
        when {
            ((it.key == Key.Enter || it.key == Key.Spacebar) && it.type == KeyEventType.KeyUp) -> {
                transcriptState.advance()
                true
            }
            else -> {
                false
            }
        }
    }

    LaunchedEffect(focusRequester) {
        focusRequester.requestFocus()
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = PersonaRed)
            .then(modifier)
            .focusRequester(focusRequester)
            .clickable(onClick = transcriptState::advance, indication = null, interactionSource = interactionSource)
    ) {
        Transcript(
            transcriptState.entries,
        )

        Row(modifier = Modifier.statusBarsPadding()) {
            Image(
                painter = rememberVectorPainter(MyResourcePack.Sns),
                contentDescription = null,
                modifier = Modifier.height(100.dp).offset(x = 8.dp, y = (-4).dp).clickable(onClick = navBack)
            )

            Portraits(
                senders = chatSession.messages.filterIsInstance<ReceiveMessage>().map { it.sender }.distinct(),
                modifier = Modifier.weight(1f),
            )
        }

//        NextButton(
//            onClick = { transcriptState.advance() },
//            modifier = Modifier
//                .align(Alignment.BottomEnd)
//                .systemBarsPadding()
//                .padding(16.dp)
//        )
    }
}