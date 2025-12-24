package com.yuri.persona_im_maker.chat.session.editor.ui

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.PrimaryTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties
import com.yuri.im.schema.ChatMessage
import com.yuri.im.schema.EmotionMarker
import com.yuri.im.schema.MessageSender
import com.yuri.im.schema.MessageSenderSelf
import com.yuri.im.schema.PlainText
import com.yuri.im.schema.ReceiveMessage
import com.yuri.im.schema.ReceivedMessageSender
import com.yuri.im.schema.ReplyOptions
import com.yuri.im.ui.resource.icon.MyIconPack
import com.yuri.im.ui.resource.icon.myiconpack.Add
import com.yuri.im.ui.resource.icon.myiconpack.Delete
import com.yuri.im.ui.resource.utils.ResourceUtil
import com.yuri.persona_im_maker.chat.session.ChatSessionRes
import com.yuri.persona_im_maker.chat.session.editor.ChatSessionEditorUIEvent
import com.yuri.persona_im_maker.chat.session.editor.ChatSessionEntry
import com.yuri.persona_im_maker.chat.session.*
import org.jetbrains.compose.resources.stringResource

private const val MESSAGE_MAX_LENGTH = 140
private const val OPTION_MAX_LENGTH = 40

internal sealed interface ChatMessageEditScreenState {
    data object None : ChatMessageEditScreenState

    data class New(val sender: MessageSender) : ChatMessageEditScreenState

    data class Modify(val entry: ChatSessionEntry) : ChatMessageEditScreenState
}

@Composable
internal fun ChatMessageEditScreenWrapper(
    dialogState: ChatMessageEditScreenState,
    allSenders: List<MessageSender>,
    closeEntryDialog: () -> Unit,
    sendUIEvent: (ChatSessionEditorUIEvent) -> Unit
) {
    BoxWithConstraints {
        val isCompact = maxWidth < 600.dp // 定义“空间不足”的阈值

        val dialogProperties = DialogProperties(
            usePlatformDefaultWidth = false,
            dismissOnBackPress = true,
            dismissOnClickOutside = false
        )

        val modifier = if (isCompact) {
            Modifier.fillMaxSize()
        } else {
            Modifier
                .fillMaxWidth(0.8f)
                .wrapContentHeight()
        }

        when (dialogState) {
            is ChatMessageEditScreenState.None -> {}
            is ChatMessageEditScreenState.New -> {
                ChatMessageEditView(
                    modifier = modifier,
                    isCreate = true,
                    dialogProperties = dialogProperties,
                    chatMessage = when (dialogState.sender) {
                        MessageSenderSelf -> PlainText("")
                        is ReceivedMessageSender -> ReceiveMessage(
                            sender = dialogState.sender,
                            content = ""
                        )

                    },
                    allSenders = allSenders,
                    onDismiss = closeEntryDialog,
                    onSave = { chatMessage ->
                        sendUIEvent(ChatSessionEditorUIEvent.AddEntry(chatMessage))
                        closeEntryDialog()
                    }
                )
            }

            is ChatMessageEditScreenState.Modify -> {
                ChatMessageEditView(
                    modifier = modifier,
                    isCreate = false,
                    dialogProperties = dialogProperties,
                    chatMessage = dialogState.entry.chatMessage,
                    allSenders = allSenders,
                    onDismiss = closeEntryDialog,
                    onSave = { chatMessage ->
                        sendUIEvent(
                            ChatSessionEditorUIEvent.ModifyEntry(
                                dialogState.entry.id,
                                chatMessage
                            )
                        )
                        closeEntryDialog()
                    }
                )
            }
        }
    }


}

@Composable
private fun ChatMessageEditView(
    modifier: Modifier,
    isCreate: Boolean,
    dialogProperties: DialogProperties,
    chatMessage: ChatMessage,
    allSenders: List<MessageSender>,
    onDismiss: () -> Unit,
    onSave: (ChatMessage) -> Unit,
) {
    var localText by remember {
        when (chatMessage) {
            is ReplyOptions -> mutableStateOf("")
            else -> mutableStateOf(requireNotNull(chatMessage.text))
        }
    }

    val localOptions: SnapshotStateList<String> by remember {
        mutableStateOf(SnapshotStateList<String>().apply {
            addAll(
                when (chatMessage) {
                    is ReplyOptions -> chatMessage.options
                    else -> emptyList()
                }
            )
        }.apply {
            if (isEmpty()) add("")
        })
    }

    var currentMessageTypeIsOptions: Boolean by remember {
        mutableStateOf(chatMessage is ReplyOptions)
    }

    var sender by mutableStateOf(chatMessage.sender)

    var emotionMarker by mutableStateOf(chatMessage.emotionMarker)

    AlertDialog(
        modifier = modifier,
        onDismissRequest = onDismiss,
        properties = dialogProperties,
        title = {
            Row {
                Text(
                    if (isCreate) stringResource(ChatSessionRes.string.dialog_title_new_entry) else stringResource(
                        ChatSessionRes.string.dialog_title_edit_entry
                    ),
                    modifier = Modifier.weight(1f)
                )

                if (sender != MessageSenderSelf) {
                    ResourceUtil.getEmotionalMarkerImageVector(emotionMarker)?.let {
                        Image(
                            painter = rememberVectorPainter(it),
                            modifier = Modifier.size(24.dp),
                            contentDescription = null
                        )
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
                    modifier = Modifier.weight(1f, fill = false).fillMaxWidth(),
                    senderList = allSenders,
                    selected = sender,
                    onSelect = { sender = it }
                )

                AnimatedContent(
                    targetState = sender is MessageSenderSelf,
                    transitionSpec = {
                        if (targetState) {
                            slideInHorizontally() + fadeIn() togetherWith slideOutHorizontally() + fadeOut()
                        } else {
                            slideInHorizontally() + fadeIn() togetherWith slideOutHorizontally() + fadeOut()
                        }
                    },
                    label = "Editor"
                ) { isSenderSelf ->
                    if (isSenderSelf) {
                        SelfMessageEditor(
                            isOptionsMode = currentMessageTypeIsOptions,
                            changeIsOptionsMode = { currentMessageTypeIsOptions = it },
                            messageOptionEditor = {
                                MessageOptionsEditor(
                                    localOptions,
                                    onAddOption = { index ->
                                        localOptions.add(index, "")
                                    },
                                    onModifyOption = { index, text ->
                                        localOptions[index] = text
                                    },
                                    onDeleteOption = { index ->
                                        localOptions.removeAt(index)
                                    },
                                )
                            },
                            messageEditor = {
                                MessageEditor(
                                    localText,
                                ) {
                                    localText = it
                                    emotionMarker = getEmotionMarker(it)
                                }
                            },
                        )
                    } else {
                        MessageEditor(
                            localText,
                        ) {
                            localText = it
                            emotionMarker = getEmotionMarker(it)
                        }
                    }
                }
            }
        },
        confirmButton = {
            Button(onClick = {
                onSave(
                    when (sender) {
                        MessageSenderSelf -> {
                            if (currentMessageTypeIsOptions) {
                                ReplyOptions(options = localOptions)
                            } else {
                                PlainText(localText)
                            }
                        }

                        is ReceivedMessageSender -> ReceiveMessage(
                            sender = sender as ReceivedMessageSender,
                            content = localText,
                            emotionMarker = emotionMarker,
                        )
                    }
                )
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
private fun SelfMessageEditor(
    isOptionsMode: Boolean,
    changeIsOptionsMode: (Boolean) -> Unit,
    messageOptionEditor: @Composable () -> Unit,
    messageEditor: @Composable () -> Unit
) {
    Column {
        PrimaryTabRow(
            selectedTabIndex = if (isOptionsMode) 0 else 1,
            tabs = {
                Tab(
                    selected = isOptionsMode,
                    onClick = { changeIsOptionsMode(true) },
                    text = {
                        Text(stringResource(ChatSessionRes.string.label_message_options))
                    }
                )
                Tab(
                    selected = !isOptionsMode,
                    onClick = { changeIsOptionsMode(false) },
                    text = {
                        Text(stringResource(ChatSessionRes.string.label_message_content))
                    }
                )
            }
        )
        AnimatedContent(
            targetState = if (isOptionsMode) 0 else 1,
            transitionSpec = {
                slideInHorizontally() togetherWith slideOutHorizontally()
            }
        ) {
            if (it == 0) {
                messageOptionEditor()
            } else {
                messageEditor()
            }
        }
    }
}

@Composable
private fun MessageOptionsEditor(
    options: List<String>,
    onAddOption: (index: Int) -> Unit,
    onModifyOption: (index: Int, content: String) -> Unit,
    onDeleteOption: (index: Int) -> Unit,
) {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        options.forEachIndexed { index, string ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                TextField(
                    value = string,
                    onValueChange = {
                        if (it.length > OPTION_MAX_LENGTH) {
                            return@TextField
                        }
                        onModifyOption(index, it)
                    },
                    modifier = Modifier.weight(1f),
                    trailingIcon = {
                        Text(
                            text = "${string.length}/${OPTION_MAX_LENGTH}",
                            style = MaterialTheme.typography.bodySmall
                        )
                    }
                )

                IconButton(
                    onClick = { onAddOption(index + 1) }
                ) {
                    Icon(MyIconPack.Add, contentDescription = null)
                }

                IconButton(
                    onClick = { onDeleteOption(index) },
                    enabled = options.size > 1 || index != 0
                ) {
                    Icon(MyIconPack.Delete, contentDescription = null)
                }
            }
        }
    }
}

@Composable
private fun MessageEditor(
    message: String,
    onTextChange: (String) -> Unit,
) {
    TextField(
        value = message,
        onValueChange = {
            if (it.length > MESSAGE_MAX_LENGTH) {
                return@TextField
            }
            onTextChange(it)
        },
        label = { Text(stringResource(ChatSessionRes.string.label_message_content)) },
        modifier = Modifier.fillMaxWidth(),
        maxLines = 5,
        placeholder = { Text(stringResource(ChatSessionRes.string.hint_message_content)) },
        trailingIcon = {
            Text(
                text = "${message.length}/${MESSAGE_MAX_LENGTH}",
                style = MaterialTheme.typography.bodySmall
            )
        }
    )
}