package com.yuri.persona_im_maker.chat.session.editor

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyGridScope
import androidx.compose.foundation.lazy.grid.LazyGridState
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.*
import androidx.compose.material3.FloatingActionButtonMenuItem
import androidx.compose.material3.ToggleFloatingActionButtonDefaults.animateIcon
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.input.key.*
import androidx.compose.ui.platform.LocalClipboard
import androidx.compose.ui.semantics.*
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.yuri.im.schema.*
import com.yuri.im.ui.resource.UiResources
import com.yuri.im.ui.resource.fab_collapsed
import com.yuri.im.ui.resource.fab_expanded
import com.yuri.im.ui.resource.icon.MyIconPack
import com.yuri.im.ui.resource.icon.myiconpack.*
import com.yuri.im.ui.resource.utils.ResourceUtil
import com.yuri.im.ui.resource.utils.ResourceUtil.getSenderStringResource
import com.yuri.persona.im.task.state.Cancelled
import com.yuri.persona.im.task.state.DataOf
import com.yuri.persona.im.task.state.ErrorOf
import com.yuri.persona.im.task.state.Idle
import com.yuri.persona.im.task.state.ProgressOf
import com.yuri.persona.im.task.state.TaskState
import com.yuri.persona_im_maker.chat.session.*
import com.yuri.persona_im_maker.utils.createClipEntryWithPlainText
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.getString
import org.jetbrains.compose.resources.stringResource
import sh.calvin.reorderable.ReorderableCollectionItemScope
import sh.calvin.reorderable.ReorderableItem
import sh.calvin.reorderable.rememberReorderableLazyGridState
import sh.calvin.reorderable.rememberReorderableLazyListState

sealed interface EntryDialogState {
    data object None : EntryDialogState

    data class New(val sender: MessageSender) : EntryDialogState

    data class Modify(val entry: ChatSessionEntry) : EntryDialogState
}

sealed interface FavoriteSenderEditDialogState {
    data object None : FavoriteSenderEditDialogState

    data class Modify(val senders: List<MessageSender>) : FavoriteSenderEditDialogState
}

sealed interface ImportSessionDialogState {
    data object None: ImportSessionDialogState

    data object Show: ImportSessionDialogState
}

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

    var dialogState: EntryDialogState by remember {
        mutableStateOf(EntryDialogState.None)
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
                snackbarHostState.showSnackbar(getString(ChatSessionRes.string.failed_to_export_session, taskState.error))
            }
            else -> {

            }
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    TextField(
                        value = state.name,
                        onValueChange = { model.sendUIEvent(ChatSessionEditorUIEvent.UpdateName(it)) },
                        label = { Text(stringResource(ChatSessionRes.string.chat_session_name)) },
                        modifier = Modifier.fillMaxWidth(),
                        singleLine = true
                    )
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
                        dialogState = EntryDialogState.New(MessageSenderSelf)
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
                    dialogState = EntryDialogState.New(it)
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Text(
                text = stringResource(ChatSessionRes.string.list_title_conversations),
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier.padding(16.dp)
            )
            EntryList(
                listState = { entriesLazyListState },
                entries = state.entries,
                isManagementMode = isManagementMode,
                onDelete = { model.sendUIEvent(ChatSessionEditorUIEvent.DeleteEntry(it.id)) },
                onEdit = {
                    dialogState = EntryDialogState.Modify(it)
                },
                onMove = { startIndex, endIndex ->
                    state.entries.getOrNull(startIndex)?.let {
                        model.sendUIEvent(ChatSessionEditorUIEvent.MoveEntry(it.id, startIndex, endIndex))
                    }
                }
            )

        }
    }

    EntryDialogWrapper(
        dialogState = dialogState,
        closeEntryDialog = { dialogState = EntryDialogState.None },
        sendUIEvent = model::sendUIEvent
    )

    FavoriteSenderEditDialog(
        dialogState = favoriteSenderEditDialogState,
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

@Composable
private fun EntryDialogWrapper(
    dialogState: EntryDialogState,
    closeEntryDialog: () -> Unit,
    sendUIEvent: (ChatSessionEditorUIEvent) -> Unit
) {
    when (dialogState) {
        is EntryDialogState.None -> {}
        is EntryDialogState.New -> {
            EntryDialog(
                isCreate = true,
                initialSender = dialogState.sender,
                text = "",
                emotionMarker = EmotionMarker.EMOTION_MARKER_NONE,
                onDismiss = closeEntryDialog,
                onSave = { sender, string, emotionMarker ->
                    sendUIEvent(ChatSessionEditorUIEvent.AddEntry(sender, string, emotionMarker))
                    closeEntryDialog()
                }
            )
        }

        is EntryDialogState.Modify -> {
            EntryDialog(
                isCreate = false,
                initialSender = dialogState.entry.sender,
                text = dialogState.entry.text,
                emotionMarker = dialogState.entry.emotionMarker,
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

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3ExpressiveApi::class)
@Composable
private fun FloatingActionButton(
    senders: List<MessageSender>,
    fabVisible: Boolean,
    focusRequester: FocusRequester,
    onClickManage: () -> Unit,
    onClick: (MessageSender) -> Unit
) {
    if (!fabVisible) {
        return
    }

    var fabMenuExpanded by rememberSaveable {
        mutableStateOf(false)
    }

    val cs = rememberCoroutineScope()

    FloatingActionButtonMenu(
        modifier = Modifier,
        expanded = fabMenuExpanded,
        button = {
            TooltipBox(
                positionProvider = TooltipDefaults.rememberTooltipPositionProvider(
                    if (fabMenuExpanded) {
                        TooltipAnchorPosition.Start
                    } else {
                        TooltipAnchorPosition.Above
                    }
                ),
                tooltip = {
                    Text(stringResource(ChatSessionRes.string.btn_new))
                },
                state = rememberTooltipState()
            ) {
                ToggleFloatingActionButton(
                    modifier = Modifier.semantics {
                        traversalIndex = -1f
                        cs.launch(Dispatchers.Default) {
                            stateDescription = getString(
                                if (fabMenuExpanded) {
                                    UiResources.string.fab_expanded
                                } else {
                                    UiResources.string.fab_collapsed
                                }
                            )

                            contentDescription = getString(ChatSessionRes.string.btn_new)
                        }
                    }.animateFloatingActionButton(
                        visible = fabVisible || fabMenuExpanded,
                        alignment = Alignment.BottomEnd
                    ).focusRequester(focusRequester),
                    checked = fabMenuExpanded,
                    onCheckedChange = {
                        fabMenuExpanded = !fabMenuExpanded
                    }
                ) {
                    val imageVector by remember {
                        derivedStateOf {
                            if (fabMenuExpanded) {
                                MyIconPack.Close
                            } else {
                                MyIconPack.Add
                            }
                        }
                    }
                    Icon(
                        painter = rememberVectorPainter(imageVector),
                        contentDescription = null,
                        modifier = Modifier.animateIcon({ checkedProgress })
                    )
                }
            }
        }
    ) {
        val fabItemList by remember(senders) {
            mutableStateOf(senders.map {
                FABItem.FavoriteSender(it)
            } + FABItem.Manage)
        }

        fabItemList.forEachIndexed { i, item ->
            FABItem(
                scope = this,
                index = i,
                fabItem = item,
                modifier = Modifier,
                focusRequester = focusRequester,
                closeFabMenu = { fabMenuExpanded = false },
                onClick = {
                    fabMenuExpanded = false
                    when (item) {
                        is FABItem.FavoriteSender -> onClick(item.sender)
                        FABItem.Manage -> onClickManage()
                    }
                },
            )
        }
    }
}

private sealed interface FABItem {
    val isLast: Boolean

    data object Manage : FABItem {
        override val isLast: Boolean
            get() = true
    }

    data class FavoriteSender(
        val sender: MessageSender,
    ) : FABItem {
        override val isLast: Boolean
            get() = false
    }
}

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
private fun FABItem(
    scope: FloatingActionButtonMenuScope,
    index: Int,
    fabItem: FABItem,
    focusRequester: FocusRequester,
    closeFabMenu: () -> Unit,
    modifier: Modifier,
    onClick: () -> Unit,
) {
    with(scope) {
        FloatingActionButtonMenuItem(
            modifier = modifier.semantics {
                isTraversalGroup = true
                // Add a custom a11y action to allow closing the menu when focusing
                // the last menu item, since the close button comes before the first
                // menu item in the traversal order.
                if (fabItem.isLast) {
                    customActions =
                        listOf(
                            CustomAccessibilityAction(
                                label = "Close menu",
                                action = {
                                    closeFabMenu()
                                    true
                                },
                            )
                        )
                }
            }
                .then(
                    if (index == 0) {
                        Modifier.onKeyEvent {
                            // Navigating back from the first item should go back to the
                            // FAB menu button.
                            if (
                                it.type == KeyEventType.KeyDown &&
                                (it.key == Key.DirectionUp ||
                                        (it.isShiftPressed && it.key == Key.Tab))
                            ) {
                                focusRequester.requestFocus()
                                return@onKeyEvent true
                            }
                            return@onKeyEvent false
                        }
                    } else {
                        Modifier
                    }
                ),
            onClick = { onClick() },
            icon = {
                when (fabItem) {
                    is FABItem.FavoriteSender -> {
                        SenderImage(fabItem.sender)
                    }

                    is FABItem.Manage -> {
                        Icon(MyIconPack.Bookmark, contentDescription = null, modifier = Modifier.size(24.dp))
                    }
                }
            },
            text = {
                when (fabItem) {
                    is FABItem.FavoriteSender -> {
                        Text(text = getSenderStringResource(fabItem.sender))
                    }

                    is FABItem.Manage -> {
                        Text(text = stringResource(ChatSessionRes.string.title_favorite_sender_edit))
                    }
                }
            }
        )
    }

}

@Composable
fun EntryList(
    listState: () -> LazyListState,
    entries: List<ChatSessionEntry>,
    isManagementMode: Boolean,
    onDelete: (ChatSessionEntry) -> Unit,
    onEdit: (ChatSessionEntry) -> Unit,
    onMove: (Int, Int) -> Unit
) {
    val reorderableLazyListState = rememberReorderableLazyListState(listState()) { from, to ->
        onMove(from.index, to.index)
    }

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        state = listState(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(entries, key = { it.id }) {
            ReorderableItem(reorderableLazyListState, key = it.id) { isDragging ->
                EntryItem(
                    entry = it,
                    isManagementMode = isManagementMode,
                    scope = this,
                    onDelete = { onDelete(it) },
                    onEdit = { onEdit(it) }
                )
            }
        }
    }
}

@Composable
fun EntryItem(
    entry: ChatSessionEntry,
    isManagementMode: Boolean,
    scope: ReorderableCollectionItemScope,
    onDelete: () -> Unit,
    onEdit: () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (isManagementMode) {
                DraggableIndicator(scope)
                Spacer(modifier = Modifier.width(16.dp))
            }

            Box {
                SenderImage(
                    messageSender = entry.sender,
                    modifier = Modifier.clip(MaterialTheme.shapes.medium).align(Alignment.Center)
                )

                if (entry.sender != MessageSenderSelf) {
                    val emotionMarkerImageVector = ResourceUtil.getEmotionalMarkerImageVector(entry.emotionMarker)
                    if (emotionMarkerImageVector != null) {
                        Image(
                            painter = rememberVectorPainter(emotionMarkerImageVector),
                            contentDescription = null,
                            modifier = Modifier
                                .size(24.dp)
                                .align(Alignment.TopEnd)
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.width(16.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {
                // 发送者名称
                Text(
                    text = getSenderStringResource(entry.sender),
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = entry.text,
                    style = MaterialTheme.typography.bodyMedium,
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis
                )
            }

            Row {
                IconButton(onClick = onEdit) {
                    Icon(MyIconPack.Edit, contentDescription = stringResource(ChatSessionRes.string.btn_edit))
                }
                IconButton(onClick = onDelete) {
                    Icon(MyIconPack.Delete, contentDescription = stringResource(ChatSessionRes.string.btn_delete))
                }
            }
        }
    }
}

@Composable
private fun getMessageSenderPainter(sender: MessageSender): Painter {
    return when (sender) {
        is ReceivedMessageSender -> ResourceUtil.getReceivedMessageSenderAvatarPainter(sender)
        MessageSenderSelf -> rememberVectorPainter(MyIconPack.Glasses)
    }
}

@Composable
fun EntryDialog(
    isCreate: Boolean,
    initialSender: MessageSender,
    text: String,
    emotionMarker: EmotionMarker,
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

@Composable
private fun FavoriteSenderEditDialog(
    dialogState: FavoriteSenderEditDialogState,
    onUpdate: (List<MessageSender>) -> Unit,
    onDismiss: () -> Unit
) {
    when (dialogState) {
        is FavoriteSenderEditDialogState.Modify -> {
            var favoriteSenders by mutableStateOf(dialogState.senders)

            AlertDialog(
                onDismissRequest = onDismiss,
                title = {
                    Text(stringResource(ChatSessionRes.string.title_favorite_sender_edit))
                },
                confirmButton = {
                    Button(onClick = {
                        onUpdate(favoriteSenders)
                        onDismiss()
                    }) {
                        Text(stringResource(ChatSessionRes.string.btn_save))
                    }
                },
                dismissButton = {
                    Button(onClick = onDismiss) {
                        Text(stringResource(ChatSessionRes.string.btn_cancel))
                    }
                },
                text = {
                    Column {
                        Text(
                            stringResource(
                                ChatSessionRes.string.favorite_senders_edit_favorite_senders, favoriteSenders.size,
                                ChatSessionEditorViewModel.MAX_FAVORITE_SENDERS
                            )
                        )
                        FavoriteSenderEditFavoriteSenders(
                            favoriteSenders = favoriteSenders,
                            update = { favoriteSenders = it }
                        )

                        HorizontalDivider(Modifier.fillMaxWidth())

                        Text(stringResource(ChatSessionRes.string.favorite_senders_edit_all_senders))
                        FavoriteSendersEditAllSenders(
                            modifier = Modifier.weight(1f),
                            favoriteSenders = favoriteSenders,
                            add = { favoriteSenders = favoriteSenders + it },
                            remove = { favoriteSenders = favoriteSenders - it }
                        )
                    }
                }
            )
        }

        FavoriteSenderEditDialogState.None -> {}
    }
}

@Composable
private fun FavoriteSenderEditFavoriteSenders(
    favoriteSenders: List<MessageSender>,
    update: (List<MessageSender>) -> Unit
) {
    val lazyGridState = rememberLazyGridState()
    val reorderableLazyGridState = rememberReorderableLazyGridState(lazyGridState) { from, to ->
        val newList = favoriteSenders.toMutableList()
        val item = newList.removeAt(from.index)
        newList.add(to.index, item)
        update(newList)
    }

    MyAdaptiveLazyVerticalGrid(state = lazyGridState) {
        items(favoriteSenders, key = { it.hashKey() }) {
            ReorderableItem(reorderableLazyGridState, key = it.hashKey()) { isDragging ->
                Row {
                    DraggableIndicator(scope = this@ReorderableItem)
                    Spacer(modifier = Modifier.width(12.dp))
                    SenderDisplay(messageSender = it)
                }
            }
        }
    }
}

@Composable
private fun FavoriteSendersEditAllSenders(
    modifier: Modifier = Modifier,
    favoriteSenders: List<MessageSender>,
    add: (MessageSender) -> Unit,
    remove: (MessageSender) -> Unit,
) {
    val addEnabled by derivedStateOf {
        favoriteSenders.size < ChatSessionEditorViewModel.MAX_FAVORITE_SENDERS
    }

    MyAdaptiveLazyVerticalGrid(modifier = modifier) {
        items(allSenders) {
            val selected by remember(favoriteSenders) {
                mutableStateOf(it in favoriteSenders)
            }

            Box {
                SenderDisplay(messageSender = it)
                if (selected) {
                    Icon(
                        MyIconPack.Delete,
                        contentDescription = stringResource(ChatSessionRes.string.btn_remove_favorite_sender),
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .size(24.dp)
                            .clickable(onClick = { remove(it) }),
                        tint = MaterialTheme.colorScheme.error
                    )
                } else {
                    Icon(
                        MyIconPack.BookmarkAdd,
                        contentDescription = stringResource(ChatSessionRes.string.btn_add_favorite_sender),
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .size(24.dp)
                            .clickable(enabled = addEnabled, onClick = { add(it) }),
                        tint = MaterialTheme.colorScheme.secondary
                    )
                }
            }
        }
    }
}

@Composable
private fun SenderDisplay(
    messageSender: MessageSender,
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues = PaddingValues(8.dp)
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .padding(paddingValues)
    ) {
        SenderImage(messageSender = messageSender)
        Spacer(modifier = Modifier.height(4.dp))
        SenderDesc(messageSender = messageSender)
    }
}

@Composable
private fun SenderImage(
    messageSender: MessageSender,
    modifier: Modifier = Modifier
) {
    Image(
        painter = getMessageSenderPainter(sender = messageSender),
        contentDescription = null,
        modifier = modifier.size(48.dp)
    )
}

@Composable
private fun SenderDesc(
    messageSender: MessageSender
) {
    Text(
        text = getSenderStringResource(messageSender),
        style = MaterialTheme.typography.bodySmall,
        maxLines = 1,
        modifier = Modifier.basicMarquee()
    )
}

@Composable
private fun MyAdaptiveLazyVerticalGrid(
    state: LazyGridState = rememberLazyGridState(),
    modifier: Modifier = Modifier,
    content: LazyGridScope.() -> Unit,
) {
    LazyVerticalGrid(
        columns = ADAPTIVE_SENDER_COLUMNS,
        state = state,
        modifier = modifier,
        contentPadding = PaddingValues(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        content = content
    )
}

@Composable
private fun ImportSessionDialog(
    dialogState: ImportSessionDialogState,
    validState: TaskState<Unit, Unit, String>,
    importSessionFromJson: (String) -> Unit,
    onDismiss: () -> Unit,
) {
    if (dialogState == ImportSessionDialogState.None) {
        return
    }

    var jsonString by mutableStateOf("")

    AlertDialog(
        onDismissRequest = onDismiss,
        text = {
            TextField(
                value = jsonString,
                onValueChange = { jsonString = it },
                label = {
                    Text(stringResource(ChatSessionRes.string.label_json_string))
                },
                placeholder = {
                    Text(stringResource(ChatSessionRes.string.paste_previous_exported_json_here))
                },
                isError = validState is ErrorOf,
                supportingText = {
                    if (validState is ErrorOf) {
                        Text(validState.error, color = MaterialTheme.colorScheme.error)
                    }
                }
            )
        },
        confirmButton = {
            TextButton(
                onClick = {
                    importSessionFromJson(jsonString)
                }
            ) {
                Text(stringResource(ChatSessionRes.string.btn_save))
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(stringResource(ChatSessionRes.string.btn_cancel))
            }
        }
    )
}

@Composable
private fun DraggableIndicator(
    scope: ReorderableCollectionItemScope
) {
    Icon(
        MyIconPack.DragIndicator,
        contentDescription = stringResource(ChatSessionRes.string.drag_handle),
        modifier = with(scope) {
            Modifier.draggableHandle()
        }
    )
}

private val ADAPTIVE_SENDER_COLUMNS = GridCells.Adaptive(100.dp)

private val allSenders = buildList {
    add(MessageSenderSelf)
    addAll(StandardMessageSender.entries.filterNot { it == StandardMessageSender.SENDER_UNKNOWN })
    addAll(BuildInCustomMessageSender.entries.filterNot { it == BuildInCustomMessageSender.CUSTOM_SENDER_UNKNOWN })
}