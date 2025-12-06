package codes.chrishorner.personasns

import androidx.compose.animation.core.tween
import androidx.compose.foundation.gestures.animateScrollBy
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.add
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.unit.dp

/**
 * Scrollable list of messages - including the background line connecting each entry.
 */
@Composable
fun Transcript(entries: List<Entry>, modifier: Modifier = Modifier) {
  val listState = rememberLazyListState()
  val totalItemCount by remember { derivedStateOf { listState.layoutInfo.totalItemsCount } }

  LaunchedEffect(totalItemCount) {
    val lastVisibleItem = listState.layoutInfo.visibleItemsInfo.lastOrNull() ?: return@LaunchedEffect
    // animateScrollToItem isn't super smooth, so if the newly added item is visible, then animate
    // manually with a tween.
    if (lastVisibleItem.index == totalItemCount - 1) {
      listState.animateScrollBy(
        value = lastVisibleItem.size.toFloat() + listState.layoutInfo.afterContentPadding,
        animationSpec = tween(durationMillis = 280),
      )
    } else {
      listState.animateScrollToItem(totalItemCount - 1)
    }
  }

  var globalWidth by remember { mutableStateOf(0) }
  LazyColumn(
    verticalArrangement = Arrangement.spacedBy(TranscriptSizes.EntrySpacing),
    state = listState,
    contentPadding = WindowInsets.systemBars
      .add(WindowInsets(top = 100.dp, bottom = 100.dp))
      .asPaddingValues(),
    modifier = Modifier.fillMaxSize().onGloballyPositioned {
        globalWidth = it.size.width
    }.then(modifier)
  ) {
    itemsIndexed(
      items = entries,
    ) { index, entry ->
        if (entry.message.fromSelf) {
            Reply(
                entry = entry,
                modifier = Modifier.drawConnectingLine(entry, entries.getOrNull(index + 1), globalWidth)
            )
        } else {
            Entry(
                entry,
                modifier = Modifier.drawConnectingLine(entry, entries.getOrNull(index + 1), globalWidth)
            )
        }
    }

    item {
      TypingIndicator()
    }
  }
}
