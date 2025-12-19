package com.yuri.persona_im_maker.chat.session.editor.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.yuri.im.schema.MessageSender
import com.yuri.im.ui.resource.icon.MyIconPack
import com.yuri.im.ui.resource.icon.myiconpack.BookmarkAdd
import com.yuri.im.ui.resource.icon.myiconpack.Delete
import com.yuri.persona_im_maker.chat.session.ChatSessionRes
import com.yuri.persona_im_maker.chat.session.btn_add_favorite_sender
import com.yuri.persona_im_maker.chat.session.btn_cancel
import com.yuri.persona_im_maker.chat.session.btn_remove_favorite_sender
import com.yuri.persona_im_maker.chat.session.btn_save
import com.yuri.persona_im_maker.chat.session.editor.ChatSessionEditorViewModel
import com.yuri.persona_im_maker.chat.session.favorite_senders_edit_all_senders
import com.yuri.persona_im_maker.chat.session.favorite_senders_edit_favorite_senders
import com.yuri.persona_im_maker.chat.session.title_favorite_sender_edit
import org.jetbrains.compose.resources.stringResource
import sh.calvin.reorderable.ReorderableItem
import sh.calvin.reorderable.rememberReorderableLazyGridState
import kotlin.collections.minus
import kotlin.collections.plus

internal sealed interface FavoriteSenderEditDialogState {
    data object None : FavoriteSenderEditDialogState

    data class Modify(val senders: List<MessageSender>) : FavoriteSenderEditDialogState
}

@Composable
internal fun FavoriteSenderEditDialog(
    dialogState: FavoriteSenderEditDialogState,
    allSenders: List<MessageSender>,
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
                                ChatSessionEditorViewModel.Companion.MAX_FAVORITE_SENDERS
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
                            allSenders = allSenders,
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
                    Spacer(modifier = Modifier.Companion.width(12.dp))
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
    allSenders: List<MessageSender>,
    add: (MessageSender) -> Unit,
    remove: (MessageSender) -> Unit,
) {
    val addEnabled by derivedStateOf {
        favoriteSenders.size < ChatSessionEditorViewModel.Companion.MAX_FAVORITE_SENDERS
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