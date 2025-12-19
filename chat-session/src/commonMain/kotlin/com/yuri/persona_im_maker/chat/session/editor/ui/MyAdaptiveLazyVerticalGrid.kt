package com.yuri.persona_im_maker.chat.session.editor.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyGridScope
import androidx.compose.foundation.lazy.grid.LazyGridState
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
internal fun MyAdaptiveLazyVerticalGrid(
    state: LazyGridState = rememberLazyGridState(),
    modifier: Modifier = Modifier.Companion,
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

private val ADAPTIVE_SENDER_COLUMNS = GridCells.Adaptive(100.dp)