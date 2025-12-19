package com.yuri.persona_im_maker.chat.session.editor.ui

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.yuri.im.ui.resource.icon.MyIconPack
import com.yuri.im.ui.resource.icon.myiconpack.DragIndicator
import com.yuri.persona_im_maker.chat.session.ChatSessionRes
import com.yuri.persona_im_maker.chat.session.drag_handle
import org.jetbrains.compose.resources.stringResource
import sh.calvin.reorderable.ReorderableCollectionItemScope

@Composable
internal fun DraggableIndicator(
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