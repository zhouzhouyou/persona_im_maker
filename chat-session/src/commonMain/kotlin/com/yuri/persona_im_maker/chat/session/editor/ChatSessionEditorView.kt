package com.yuri.persona_im_maker.chat.session.editor

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.platform.LocalClipboard
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.yuri.im.schema.*
import com.yuri.im.ui.resource.icon.MyIconPack
import com.yuri.im.ui.resource.icon.myiconpack.*
import com.yuri.persona.im.task.state.Cancelled
import com.yuri.persona.im.task.state.DataOf
import com.yuri.persona.im.task.state.ErrorOf
import com.yuri.persona.im.task.state.Idle
import com.yuri.persona.im.task.state.ProgressOf
import com.yuri.persona_im_maker.chat.session.*
import com.yuri.persona_im_maker.chat.session.editor.ui.BackgroundParticleSelector
import com.yuri.persona_im_maker.chat.session.editor.ui.ChatMessageDialogState
import com.yuri.persona_im_maker.chat.session.editor.ui.ChatMessageDialogWrapper
import com.yuri.persona_im_maker.chat.session.editor.ui.ChatMessageList
import com.yuri.persona_im_maker.chat.session.editor.ui.FavoriteSenderEditDialog
import com.yuri.persona_im_maker.chat.session.editor.ui.FavoriteSenderEditDialogState
import com.yuri.persona_im_maker.chat.session.editor.ui.FloatingActionButton
import com.yuri.persona_im_maker.chat.session.editor.ui.ImportSessionDialog
import com.yuri.persona_im_maker.chat.session.editor.ui.ImportSessionDialogState
import com.yuri.persona_im_maker.chat.session.editor.ui.MyAdaptiveLazyVerticalGrid
import com.yuri.persona_im_maker.utils.createClipEntryWithPlainText
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.getString
import org.jetbrains.compose.resources.stringResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChatSessionEditorView(
    model: ChatSessionEditorViewModel,
    navToPlay: (id: String) -> Unit,
    back: () -> Unit
) {
    val coroutineScope = rememberCoroutineScope()
    val clipboard = LocalClipboard.current
    val state by model.state.collectAsStateWithLifecycle()
    var isManagementMode by remember {
        mutableStateOf(false)
    }

    var dialogState: ChatMessageDialogState by remember {
        mutableStateOf(ChatMessageDialogState.None)
    }

    var favoriteSenderEditDialogState: FavoriteSenderEditDialogState by remember {
        mutableStateOf(FavoriteSenderEditDialogState.None)
    }

    var importSessionDialogState: ImportSessionDialogState by remember {
        mutableStateOf(ImportSessionDialogState.None)
    }

    val entriesLazyListState = rememberLazyListState()
    val fabVisible by remember {
        derivedStateOf {
            !isManagementMode && (entriesLazyListState.firstVisibleItemIndex == 0 || entriesLazyListState.canScrollForward)
        }
    }

    val focusRequester = FocusRequester()

    val snackbarHostState = remember { SnackbarHostState() }

    LaunchedEffect(state.snackbarMessage) {
        state.snackbarMessage?.let {
            snackbarHostState.showSnackbar(it.message)
            model.sendUIEvent(ChatSessionEditorUIEvent.ClearSnackbar)
        }
    }

    LaunchedEffect(state.setToClipboardContent) {
        if (state.setToClipboardContent != null) {
            coroutineScope.launch(Dispatchers.Main) {
                clipboard.setClipEntry(createClipEntryWithPlainText(state.setToClipboardContent!!))
                model.sendUIEvent(ChatSessionEditorUIEvent.ClearSetToClipboardContent)
            }
        }
    }

    LaunchedEffect(state.importSessionJsonValidateTaskState) {
        when (val taskState = state.importSessionJsonValidateTaskState) {
            Cancelled -> {
                importSessionDialogState = ImportSessionDialogState.None
            }

            Idle -> {}
            is ProgressOf<*> -> {}
            is DataOf<*> -> {
                importSessionDialogState = ImportSessionDialogState.None
                snackbarHostState.showSnackbar(getString(ChatSessionRes.string.import_session_success))
            }

            is ErrorOf<*> -> {}
        }
    }

    LaunchedEffect(state.exportSessionJsonValidateTaskState) {
        when (val taskState = state.exportSessionJsonValidateTaskState) {
            is DataOf -> {
                snackbarHostState.showSnackbar(getString(ChatSessionRes.string.export_session_success))
            }

            is ErrorOf -> {
                snackbarHostState.showSnackbar(
                    getString(
                        ChatSessionRes.string.failed_to_export_session,
                        taskState.error
                    )
                )
            }

            else -> {

            }
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(stringResource(ChatSessionRes.string.chat_session_editor))
                },
                actions = {
                    IconButton(
                        onClick = {
                            model.sendUIEvent(ChatSessionEditorUIEvent.Save)
                            navToPlay(state.id)
                        },
                        enabled = state.entries.isNotEmpty()
                    ) {
                        Icon(MyIconPack.Play, contentDescription = null)
                    }
                    IconButton(onClick = {
                        dialogState = ChatMessageDialogState.New(MessageSenderSelf)
                    }) {
                        Icon(MyIconPack.Add, contentDescription = stringResource(ChatSessionRes.string.btn_new))
                    }
                    IconButton(onClick = { isManagementMode = !isManagementMode }) {
                        Icon(
                            if (isManagementMode) MyIconPack.Check else MyIconPack.Reorder,
                            contentDescription = if (isManagementMode) stringResource(ChatSessionRes.string.btn_exit_management_mode) else stringResource(
                                ChatSessionRes.string.btn_management_mode
                            )
                        )
                    }
//                    IconButton(onClick = {
//                        model.sendUIEvent(ChatSessionEditorUIEvent.Save)
//                    }) {
//                        Icon(MyIconPack.Save, contentDescription = stringResource(ChatSessionRes.string.btn_save))
//                    }
                    IconButton(onClick = {
                        model.sendUIEvent(ChatSessionEditorUIEvent.ExportSession)
                    }, enabled = state.exportSessionJsonValidateTaskState !is ProgressOf) {
                        Icon(MyIconPack.Export, contentDescription = stringResource(ChatSessionRes.string.btn_export))
                    }
                    IconButton(onClick = {
                        importSessionDialogState = ImportSessionDialogState.Show
                    }) {
                        Icon(MyIconPack.Import, contentDescription = stringResource(ChatSessionRes.string.btn_import))
                    }
                }
            )
        },
        snackbarHost = {
            SnackbarHost(hostState = snackbarHostState)
        },
        floatingActionButton = {
            FloatingActionButton(
                senders = state.favoriteSenders,
                fabVisible = fabVisible,
                focusRequester = focusRequester,
                onClickManage = {
                    favoriteSenderEditDialogState = FavoriteSenderEditDialogState.Modify(state.favoriteSenders)
                },
                onClick = {
                    dialogState = ChatMessageDialogState.New(it)
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            LazyVerticalGrid(
                columns = GridCells.Adaptive(minSize = 200.dp),
                contentPadding = PaddingValues(8.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                item {
                    TextField(
                        value = state.name,
                        onValueChange = { model.sendUIEvent(ChatSessionEditorUIEvent.UpdateName(it)) },
                        label = { Text(stringResource(ChatSessionRes.string.chat_session_name)) },
                        modifier = Modifier,
                        singleLine = true
                    )
                }

                item {
                    BackgroundParticleSelector(
                        current = state.backgroundParticle,
                        select = {
                            model.sendUIEvent(ChatSessionEditorUIEvent.UpdateBackgroundParticle(it))
                        }
                    )
                }
            }

            Text(
                text = stringResource(ChatSessionRes.string.list_title_conversations),
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier.padding(16.dp)
            )
            ChatMessageList(
                listState = { entriesLazyListState },
                entries = state.entries,
                isManagementMode = isManagementMode,
                onDelete = { model.sendUIEvent(ChatSessionEditorUIEvent.DeleteEntry(it.id)) },
                onEdit = {
                    dialogState = ChatMessageDialogState.Modify(it)
                },
                onMove = { startIndex, endIndex ->
                    state.entries.getOrNull(startIndex)?.let {
                        model.sendUIEvent(ChatSessionEditorUIEvent.MoveEntry(it.id, startIndex, endIndex))
                    }
                }
            )
        }
    }

    ChatMessageDialogWrapper(
        dialogState = dialogState,
        allSenders = allSenders,
        closeEntryDialog = { dialogState = ChatMessageDialogState.None },
        sendUIEvent = model::sendUIEvent
    )

    FavoriteSenderEditDialog(
        dialogState = favoriteSenderEditDialogState,
        allSenders = allSenders,
        onDismiss = { favoriteSenderEditDialogState = FavoriteSenderEditDialogState.None },
        onUpdate = {
            model.sendUIEvent(ChatSessionEditorUIEvent.UpdateFavoriteSender(it))
        }
    )

    ImportSessionDialog(
        dialogState = importSessionDialogState,
        validState = state.importSessionJsonValidateTaskState,
        importSessionFromJson = {
            model.sendUIEvent(ChatSessionEditorUIEvent.ImportSession(it))
        },
        onDismiss = {
            importSessionDialogState = ImportSessionDialogState.None
            model.sendUIEvent(ChatSessionEditorUIEvent.IdleImportSessionValidate)
        }
    )
}

private val allSenders = buildList {
    add(MessageSenderSelf)
    addAll(StandardMessageSender.entries.filterNot { it == StandardMessageSender.SENDER_UNKNOWN })
    addAll(BuildInCustomMessageSender.entries.filterNot { it == BuildInCustomMessageSender.CUSTOM_SENDER_UNKNOWN })
}