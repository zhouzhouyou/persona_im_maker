package com.yuri.persona_im_maker.chat.session.editor.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.yuri.im.schema.MessageSenderSelf
import com.yuri.im.ui.resource.icon.MyIconPack
import com.yuri.im.ui.resource.icon.myiconpack.Delete
import com.yuri.im.ui.resource.icon.myiconpack.Edit
import com.yuri.im.ui.resource.utils.ResourceUtil
import com.yuri.persona_im_maker.chat.session.ChatSessionRes
import com.yuri.persona_im_maker.chat.session.btn_delete
import com.yuri.persona_im_maker.chat.session.btn_edit
import com.yuri.persona_im_maker.chat.session.editor.ChatSessionEntry
import org.jetbrains.compose.resources.stringResource
import sh.calvin.reorderable.ReorderableCollectionItemScope
import sh.calvin.reorderable.ReorderableItem
import sh.calvin.reorderable.rememberReorderableLazyListState

@Composable
fun ChatMessageList(
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
                ChatMessageCard(
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
fun ChatMessageCard(
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
                            modifier = Modifier.Companion
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
                    text = ResourceUtil.getSenderStringResource(entry.sender),
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