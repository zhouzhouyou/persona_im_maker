package com.yuri.persona_im_maker.chat.session.editor.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import com.yuri.im.ui.resource.icon.MyIconPack
import com.yuri.im.ui.resource.icon.myiconpack.Play
import com.yuri.persona_im_maker.chat.session.*
import org.jetbrains.compose.resources.stringResource

@OptIn(ExperimentalMaterial3ExpressiveApi::class, ExperimentalMaterial3Api::class)
@Composable
internal fun PlaybackButton(enabled: Boolean, onPlay: (PlaybackLayout) -> Unit) {
    var expanded by remember { mutableStateOf(false) }
    val optionsDescription = stringResource(ChatSessionRes.string.playback_options)

    Box {
        SplitButtonLayout(
            leadingButton = {
                SplitButtonDefaults.LeadingButton(
                    enabled = enabled,
                    onClick = { onPlay(PlaybackLayout.AUTO) },
                ) {
                    Icon(MyIconPack.Play, stringResource(ChatSessionRes.string.playback_auto))
                }
            },
            trailingButton = {
                SplitButtonDefaults.TrailingButton(
                    checked = expanded,
                    onCheckedChange = { expanded = it },
                    enabled = enabled,
                    modifier = Modifier.semantics { contentDescription = optionsDescription },
                ) {
                    ExposedDropdownMenuDefaults.TrailingIcon(expanded)
                }
            },
        )
        DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
            DropdownMenuItem(
                text = { Text(stringResource(ChatSessionRes.string.playback_auto)) },
                onClick = {
                    expanded = false
                    onPlay(PlaybackLayout.AUTO)
                },
            )
            DropdownMenuItem(
                text = { Text(stringResource(ChatSessionRes.string.playback_full_screen)) },
                onClick = {
                    expanded = false
                    onPlay(PlaybackLayout.FULL_SCREEN)
                },
            )
        }
    }
}
