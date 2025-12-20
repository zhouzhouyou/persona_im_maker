package com.yuri.persona_im_maker.chat.session.editor.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import com.yuri.im.schema.EmotionMarker
import com.yuri.im.schema.MessageSender
import com.yuri.im.schema.MessageSenderSelf
import com.yuri.im.ui.resource.utils.ResourceUtil
import com.yuri.persona_im_maker.chat.session.ChatSessionRes
import com.yuri.persona_im_maker.chat.session.btn_cancel
import com.yuri.persona_im_maker.chat.session.btn_save
import com.yuri.persona_im_maker.chat.session.dialog_title_edit_entry
import com.yuri.persona_im_maker.chat.session.dialog_title_new_entry
import com.yuri.persona_im_maker.chat.session.editor.ChatSessionEditorUIEvent
import com.yuri.persona_im_maker.chat.session.editor.ChatSessionEntry
import com.yuri.persona_im_maker.chat.session.hint_message_content
import com.yuri.persona_im_maker.chat.session.label_message_content
import org.jetbrains.compose.resources.stringResource

internal sealed interface ChatMessageDialogState {
    data object None : ChatMessageDialogState

    data class New(val sender: MessageSender) : ChatMessageDialogState

    data class Modify(val entry: ChatSessionEntry) : ChatMessageDialogState
}

@Composable
internal fun ChatMessageDialogWrapper(
    dialogState: ChatMessageDialogState,
    allSenders: List<MessageSender>,
    closeEntryDialog: () -> Unit,
    sendUIEvent: (ChatSessionEditorUIEvent) -> Unit
) {
    when (dialogState) {
        is ChatMessageDialogState.None -> {}
        is ChatMessageDialogState.New -> {
            EntryDialog(
                isCreate = true,
                initialSender = dialogState.sender,
                text = "",
                emotionMarker = EmotionMarker.EMOTION_MARKER_NONE,
                allSenders = allSenders,
                onDismiss = closeEntryDialog,
                onSave = { sender, string, emotionMarker ->
                    sendUIEvent(ChatSessionEditorUIEvent.AddEntry(sender, string, emotionMarker))
                    closeEntryDialog()
                }
            )
        }

        is ChatMessageDialogState.Modify -> {
            EntryDialog(
                isCreate = false,
                initialSender = dialogState.entry.sender,
                text = dialogState.entry.text,
                emotionMarker = dialogState.entry.emotionMarker,
                allSenders = allSenders,
                onDismiss = closeEntryDialog,
                onSave = { sender, string, emotionMarker ->
                    sendUIEvent(
                        ChatSessionEditorUIEvent.ModifyEntry(
                            dialogState.entry.id,
                            sender,
                            string,
                            emotionMarker
                        )
                    )
                    closeEntryDialog()
                }
            )
        }
    }
}

@Composable
private fun EntryDialog(
    isCreate: Boolean,
    initialSender: MessageSender,
    text: String,
    emotionMarker: EmotionMarker,
    allSenders: List<MessageSender>,
    onDismiss: () -> Unit,
    onSave: (MessageSender, String, EmotionMarker) -> Unit,
) {
    var localText by remember {
        mutableStateOf(text)
    }

    var sender by remember(initialSender) {
        mutableStateOf(initialSender)
    }

    var emotionMarker by remember(emotionMarker) {
        mutableStateOf(emotionMarker)
    }

    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Row {
                Text(
                    if (isCreate) stringResource(ChatSessionRes.string.dialog_title_new_entry) else stringResource(
                        ChatSessionRes.string.dialog_title_edit_entry
                    ),
                    modifier = Modifier.weight(1f)
                )

                if (sender != MessageSenderSelf) {
                    when (emotionMarker) {
                        EmotionMarker.EMOTION_MARKER_UNKNOWN, EmotionMarker.EMOTION_MARKER_NONE -> {

                        }

                        else -> {
                            Image(
                                painter = rememberVectorPainter(
                                    requireNotNull(
                                        ResourceUtil.getEmotionalMarkerImageVector(
                                            emotionMarker
                                        )
                                    )
                                ),
                                modifier = Modifier.size(24.dp),
                                contentDescription = null
                            )
                        }
                    }
                }
            }
        },
        text = {
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                // 发送者选择
                SenderPicker(
                    modifier = Modifier.weight(1f, fill = false),
                    senderList = allSenders,
                    selected = sender,
                    onSelect = { sender = it }
                )

                MessageEditor(
                    localText,
                ) {
                    if (it.length > 140) {
                        return@MessageEditor
                    }
                    localText = it
                    emotionMarker = getEmotionMarker(it)
                }

            }
        },
        confirmButton = {
            Button(onClick = {
                onSave(sender, localText, emotionMarker)
                localText = ""
                emotionMarker = EmotionMarker.EMOTION_MARKER_UNKNOWN
            }) {
                Text(stringResource(ChatSessionRes.string.btn_save))
            }
        },
        dismissButton = {
            Button(onClick = onDismiss) {
                Text(stringResource(ChatSessionRes.string.btn_cancel))
            }
        }
    )
}

@Composable
private fun SenderPicker(
    modifier: Modifier,
    senderList: List<MessageSender>,
    selected: MessageSender,
    onSelect: (MessageSender) -> Unit
) {
    MyAdaptiveLazyVerticalGrid(modifier = modifier) {
        items(senderList) {
            val isSelected = selected == it

            SenderDisplay(
                messageSender = it,
                modifier = Modifier.clickable {
                    onSelect(it)
                }.background(
                    if (isSelected) MaterialTheme.colorScheme.primaryContainer
                    else MaterialTheme.colorScheme.surfaceVariant,
                    shape = MaterialTheme.shapes.medium
                )
            )
        }
    }
}

private fun getEmotionMarker(message: String): EmotionMarker {
    return if (message.endsWith("!?") || message.endsWith("！？")) {
        EmotionMarker.EMOTION_MARKER_EXCLAMATION_AND_QUESTION_MARK
    } else if (message.endsWith("!!") || message.endsWith("！！")) {
        EmotionMarker.EMOTION_MARKER_DOUBLE_EXCLAMATION_MARK
    } else if (message.endsWith("!") || message.endsWith("！")) {
        EmotionMarker.EMOTION_MARKER_EXCLAMATION_MARK
    } else if (message.endsWith("?") || message.endsWith("？")) {
        EmotionMarker.EMOTION_MARKER_QUESTION_MARK
    } else {
        EmotionMarker.EMOTION_MARKER_UNKNOWN
    }
}

@Composable
private fun MessageEditor(
    message: String,
    onTextChange: (String) -> Unit,
) {
    TextField(
        value = message,
        onValueChange = onTextChange,
        label = { Text(stringResource(ChatSessionRes.string.label_message_content)) },
        modifier = Modifier.fillMaxWidth(),
        maxLines = 5,
        placeholder = { Text(stringResource(ChatSessionRes.string.hint_message_content)) },
        trailingIcon = {
            Text(
                text = "${message.length}/140",
                style = MaterialTheme.typography.bodySmall
            )
        }
    )
}