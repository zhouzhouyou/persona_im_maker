package com.yuri.persona_im_maker.chat.session.editor

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.yuri.im.schema.BackgroundParticle
import com.yuri.im.schema.BuildInCustomMessageSender
import com.yuri.im.schema.MessageSenderSelf
import com.yuri.im.schema.StandardMessageSender
import com.yuri.im.ui.resource.icon.MyIconPack
import com.yuri.im.ui.resource.icon.myiconpack.*
import com.yuri.persona.im.task.state.*
import com.yuri.persona_im_maker.chat.session.*
import com.yuri.persona_im_maker.chat.session.editor.ui.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.withContext
import kotlinx.coroutines.CancellationException
import io.github.vinceglb.filekit.dialogs.FileKitType
import io.github.vinceglb.filekit.dialogs.compose.rememberFilePickerLauncher
import io.github.vinceglb.filekit.readBytes
import io.github.vinceglb.filekit.size
import com.yuri.im.json.PimSessionFile
import com.yuri.im.schema.ImageAsset
import com.yuri.im.ui.resource.utils.prepareImage
import org.jetbrains.compose.resources.getString
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.stringResource

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3ExpressiveApi::class)
@Composable
fun ChatSessionEditorView(
    model: ChatSessionEditorViewModel,
    navToPlay: (id: String, layout: PlaybackLayout) -> Unit,
    back: () -> Unit
) {
    val coroutineScope = rememberCoroutineScope()
    val state by model.state.collectAsStateWithLifecycle()
    var isManagementMode by remember {
        mutableStateOf(false)
    }

    var dialogState: ChatMessageEditScreenState by remember {
        mutableStateOf(ChatMessageEditScreenState.None)
    }

    var favoriteSenderEditDialogState: FavoriteSenderEditDialogState by remember {
        mutableStateOf(FavoriteSenderEditDialogState.None)
    }

    var fileBusy by remember { mutableStateOf(false) }
    var exportBytes by remember { mutableStateOf<ByteArray?>(null) }
    var exportFilename by remember { mutableStateOf("") }
    val filePicker = rememberFilePickerLauncher(type = FileKitType.File(listOf("pim"))) { file ->
        if (file != null && !fileBusy) coroutineScope.launch {
            fileBusy = true
            try {
                val session = withContext(Dispatchers.Default) {
                    require(file.size() <= PimSessionFile.MAX_BYTES) { "Session exceeds 100 MB" }
                    val parsed = PimSessionFile.decode(file.readBytes())
                    val images = parsed.images.mapValues { (id, asset) -> prepareImage(id, asset.bytes) }
                    parsed.copy(images = images)
                }
                model.replaceSession(session)
                model.showFileResult(getString(ChatSessionRes.string.import_session_success))
            } catch (e: CancellationException) { throw e }
            catch (e: Exception) { model.showFileResult(getString(ChatSessionRes.string.file_import_failed, e.message ?: "")) }
            finally { fileBusy = false }
        }
    }
    val exportSession: () -> Unit = {
        if (!fileBusy && exportBytes == null) coroutineScope.launch {
            fileBusy = true
            try {
                val session = model.buildChatSession()
                val bytes = withContext(Dispatchers.Default) { PimSessionFile.encode(session) }
                val filename = session.alias.map { if (it < ' ' || it in "\\/:*?\"<>|") '_' else it }.joinToString("").trim().take(80).ifBlank { "persona-chat" }
                exportFilename = filename
                exportBytes = bytes
            } catch (e: CancellationException) { throw e }
            catch (e: Exception) { model.showFileResult(getString(ChatSessionRes.string.failed_to_export_session, e.message ?: "")) }
            finally { fileBusy = false }
        }
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

    if (state.initializing) {
        ContainedLoadingIndicator(modifier = Modifier.fillMaxSize(0.8f))
    } else {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Text(stringResource(ChatSessionRes.string.chat_session_editor))
                    },
                    actions = {
                        ChatSessionEditorMenuActions(
                            rowScope = this,
                            id = state.id,
                            isManagementMode = isManagementMode,
                            updateManagementMode = { isManagementMode = it },
                            sendUIEvent = model::sendUIEvent,
                            updateChatMessageEditScreenState = { dialogState = it },
                            importSessionFile = { if (!fileBusy) filePicker.launch() },
                            exportSessionFile = exportSession,
                            navToPlay = navToPlay,
                            saveEnabled = state.entries.isNotEmpty(),
                        )
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
                        dialogState = ChatMessageEditScreenState.New(it)
                    }
                )
            }
        ) { paddingValues ->
            ChatSessionEditorContent(
                paddingValues = paddingValues,
                name = state.name,
                backgroundParticle = state.backgroundParticle,
                sendUIEvent = model::sendUIEvent,
                getEntriesLazyListState = { entriesLazyListState },
                entries = state.entries,
                images = state.images,
                isManagementMode = isManagementMode,
                updateChatMessageEditDialogState = { dialogState = it },
            )
        }
    }

    ChatMessageEditScreenWrapper(
        dialogState = dialogState,
        allSenders = allSenders,
        images = state.images,
        closeEntryDialog = { dialogState = ChatMessageEditScreenState.None },
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

    exportBytes?.let { bytes ->
        val name = exportFilename.trim().removeSuffix(".pim").trim()
        val validName = name.isNotEmpty() && name.length <= 80 && name.none { it < ' ' || it in "\\/:*?\"<>|" }
        AlertDialog(
            onDismissRequest = { exportBytes = null },
            title = { Text(stringResource(ChatSessionRes.string.export_file_title)) },
            text = {
                Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    OutlinedTextField(
                        value = exportFilename,
                        onValueChange = { exportFilename = it },
                        label = { Text(stringResource(ChatSessionRes.string.export_file_name)) },
                        suffix = { Text(".pim") },
                        singleLine = true,
                        isError = !validName,
                    )
                    Text(stringResource(if (sessionSaveUsesDownload()) ChatSessionRes.string.export_download_notice else ChatSessionRes.string.export_save_notice))
                }
            },
            dismissButton = { TextButton(onClick = { exportBytes = null }) { Text(stringResource(ChatSessionRes.string.export_cancel)) } },
            confirmButton = {
                TextButton(enabled = validName, onClick = {
                    exportBytes = null
                    fileBusy = true
                    // Invoke the browser picker in this click's user-activation scope.
                    coroutineScope.launch(start = CoroutineStart.UNDISPATCHED) {
                        try {
                            if (saveSessionFile(bytes, name)) model.showFileResult(getString(ChatSessionRes.string.export_session_success))
                        } catch (e: CancellationException) { throw e }
                        catch (e: Exception) { model.showFileResult(getString(ChatSessionRes.string.failed_to_export_session, e.message ?: "")) }
                        finally { fileBusy = false }
                    }
                }) { Text(stringResource(if (sessionSaveUsesDownload()) ChatSessionRes.string.export_download_confirm else ChatSessionRes.string.export_save_confirm)) }
            },
        )
    }

    if (fileBusy) AlertDialog(
        onDismissRequest = {},
        confirmButton = {},
        title = { Text(stringResource(ChatSessionRes.string.session_file_processing)) },
        text = { LinearProgressIndicator(Modifier.fillMaxWidth()) },
    )

}

@Composable
private fun ChatSessionEditorMenuActions(
    rowScope: RowScope,
    id: String,
    isManagementMode: Boolean,
    updateManagementMode: (Boolean) -> Unit,
    sendUIEvent: (ChatSessionEditorUIEvent) -> Unit,
    updateChatMessageEditScreenState: (ChatMessageEditScreenState) -> Unit,
    importSessionFile: () -> Unit,
    exportSessionFile: () -> Unit,
    saveEnabled: Boolean,
    navToPlay: (String, PlaybackLayout) -> Unit,
) {
    with(rowScope) {
        PlaybackButton(
            enabled = saveEnabled,
            onPlay = { layout ->
                sendUIEvent(ChatSessionEditorUIEvent.Save)
                navToPlay(id, layout)
            },
        )
        IconButton(onClick = {
            updateChatMessageEditScreenState(ChatMessageEditScreenState.New(MessageSenderSelf))
        }) {
            Icon(MyIconPack.Add, contentDescription = stringResource(ChatSessionRes.string.btn_new))
        }
        IconButton(onClick = { updateManagementMode(!isManagementMode) }) {
            Icon(
                if (isManagementMode) MyIconPack.Check else MyIconPack.Reorder,
                contentDescription = if (isManagementMode) stringResource(ChatSessionRes.string.btn_exit_management_mode) else stringResource(
                    ChatSessionRes.string.btn_management_mode
                )
            )
        }

        MoreMenuActions(
            listOf(
                MoreMenuAction.Action(
                    text = ChatSessionRes.string.btn_export,
                    leadingIcon = MyIconPack.Export,
                    onClick = {
                        exportSessionFile()
                    }
                ),
                MoreMenuAction.Action(
                    text = ChatSessionRes.string.btn_import,
                    leadingIcon = MyIconPack.Import,
                    onClick = {
                        importSessionFile()
                    }
                ),
                MoreMenuAction.HorizontalDivider,
                MoreMenuAction.Action(
                    text = ChatSessionRes.string.btn_delete_all,
                    leadingIcon = MyIconPack.Delete,
                    onClick = {
                        sendUIEvent(ChatSessionEditorUIEvent.DeleteAll)
                    }
                )
            )
        )
    }
}

@Composable
private fun ChatSessionEditorContent(
    paddingValues: PaddingValues,
    name: String,
    backgroundParticle: BackgroundParticle,
    sendUIEvent: (ChatSessionEditorUIEvent) -> Unit,
    getEntriesLazyListState: () -> LazyListState,
    entries: List<ChatSessionEntry>,
    images: Map<String, ImageAsset>,
    isManagementMode: Boolean,
    updateChatMessageEditDialogState: (ChatMessageEditScreenState) -> Unit,
) {
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
                    value = name,
                    onValueChange = { sendUIEvent(ChatSessionEditorUIEvent.UpdateName(it)) },
                    label = { Text(stringResource(ChatSessionRes.string.chat_session_name)) },
                    modifier = Modifier,
                    singleLine = true
                )
            }

            item {
                BackgroundParticleSelector(
                    current = backgroundParticle,
                    select = {
                        sendUIEvent(ChatSessionEditorUIEvent.UpdateBackgroundParticle(it))
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
            listState = getEntriesLazyListState,
            entries = entries,
            images = images,
            isManagementMode = isManagementMode,
            onDelete = { sendUIEvent(ChatSessionEditorUIEvent.DeleteEntry(it.id)) },
            onEdit = {
                updateChatMessageEditDialogState(ChatMessageEditScreenState.Modify(it))
            },
            onMove = { startIndex, endIndex ->
                entries.getOrNull(startIndex)?.let {
                    sendUIEvent(ChatSessionEditorUIEvent.MoveEntry(it.id, startIndex, endIndex))
                }
            }
        )
    }
}

sealed interface MoreMenuAction {
    data class Action(
        val text: StringResource,
        val leadingIcon: ImageVector? = null,
        val trailingIcon: ImageVector? = null,
        val onClick: () -> Unit,
    ) : MoreMenuAction

    data object HorizontalDivider : MoreMenuAction
}


@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3ExpressiveApi::class)
@Composable
private fun MoreMenuActions(menuActionList: List<MoreMenuAction>) {
    var expanded by remember { mutableStateOf(false) }

    Box(modifier = Modifier.wrapContentSize(Alignment.TopStart)) {
        IconButton(onClick = { expanded = true }) {
            Icon(MyIconPack.MoreVert, contentDescription = null)
        }

        DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
            menuActionList.forEach {
                when (it) {
                    is MoreMenuAction.Action -> {
                        DropdownMenuItem(
                            text = { Text(stringResource(it.text)) },
                            onClick = { expanded = false; it.onClick() },
                            leadingIcon = it.leadingIcon?.run {
                                {
                                    Icon(this, contentDescription = null)
                                }
                            },
                            trailingIcon = it.trailingIcon?.run {
                                {
                                    Icon(this, contentDescription = null)
                                }
                            }
                        )
                    }

                    MoreMenuAction.HorizontalDivider -> HorizontalDivider()
                }
            }
        }
    }
}

private val allSenders = buildList {
    add(MessageSenderSelf)
    addAll(StandardMessageSender.entries.filterNot { it == StandardMessageSender.SENDER_UNKNOWN })
    addAll(BuildInCustomMessageSender.entries.filterNot { it == BuildInCustomMessageSender.CUSTOM_SENDER_UNKNOWN })
}
