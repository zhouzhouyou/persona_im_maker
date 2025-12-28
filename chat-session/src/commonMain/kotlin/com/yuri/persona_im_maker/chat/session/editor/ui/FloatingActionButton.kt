package com.yuri.persona_im_maker.chat.session.editor.ui

import androidx.compose.foundation.layout.size
import androidx.compose.material3.*
import androidx.compose.material3.ToggleFloatingActionButtonDefaults.animateIcon
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.input.key.*
import androidx.compose.ui.semantics.*
import androidx.compose.ui.unit.dp
import com.yuri.im.schema.MessageSender
import com.yuri.im.ui.resource.UiResources
import com.yuri.im.ui.resource.fab_collapsed
import com.yuri.im.ui.resource.fab_expanded
import com.yuri.im.ui.resource.icon.MyIconPack
import com.yuri.im.ui.resource.icon.myiconpack.Add
import com.yuri.im.ui.resource.icon.myiconpack.Bookmark
import com.yuri.im.ui.resource.icon.myiconpack.Close
import com.yuri.im.ui.resource.utils.ResourceUtil
import com.yuri.persona_im_maker.chat.session.ChatSessionRes
import com.yuri.persona_im_maker.chat.session.btn_new
import com.yuri.persona_im_maker.chat.session.title_favorite_sender_edit
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.getString
import org.jetbrains.compose.resources.stringResource

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3ExpressiveApi::class)
@Composable
internal fun FloatingActionButton(
    senders: List<MessageSender>,
    fabVisible: Boolean,
    focusRequester: FocusRequester,
    onClickManage: () -> Unit,
    onClick: (MessageSender) -> Unit
) {
    if (!fabVisible) {
        return
    }

    var fabMenuExpanded by remember {
        mutableStateOf(false)
    }

    val cs = rememberCoroutineScope()

    FloatingActionButtonMenu(
        modifier = Modifier.Companion,
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
                modifier = Modifier.Companion,
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

internal sealed interface FABItem {
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
                        Modifier.Companion
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
                        Text(text = ResourceUtil.getSenderStringResource(fabItem.sender))
                    }

                    is FABItem.Manage -> {
                        Text(text = stringResource(ChatSessionRes.string.title_favorite_sender_edit))
                    }
                }
            }
        )
    }

}