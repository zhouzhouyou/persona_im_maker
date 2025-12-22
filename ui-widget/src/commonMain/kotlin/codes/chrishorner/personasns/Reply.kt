package codes.chrishorner.personasns

import androidx.compose.animation.core.animateOffsetAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.center
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.scale
import androidx.compose.ui.input.key.*
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import com.yuri.im.schema.PlainText
import com.yuri.im.schema.ReplyOptions
import kotlinx.coroutines.delay
import kotlin.random.Random

/**
 * A message sent in chat by the player.
 */
@Composable
fun Reply(entry: Entry, modifier: Modifier = Modifier, selectOption: (Int) -> Unit) {
    val message = entry.message
    val determined by remember(entry) { mutableStateOf(message is PlainText) }
    var currentIndex by remember { mutableStateOf(0) }
    val optionCount by remember(entry) { mutableStateOf((message as? ReplyOptions)?.options?.size ?: 0) }
    val focusRequester = remember { FocusRequester() }

    val keyboardListenerModifier = if (determined) {
        Modifier
    } else {
        Modifier.onKeyEvent(
            onKeyEvent = {
                if (it.type != KeyEventType.KeyUp) {
                    return@onKeyEvent false
                }

                when (it.key) {
                    Key.DirectionUp -> {
                        if (currentIndex > 0) {
                            currentIndex--
                        } else {
                            currentIndex = optionCount - 1
                        }
                        true
                    }
                    Key.DirectionDown -> {
                        if (currentIndex < optionCount - 1) {
                            currentIndex++
                        } else {
                            currentIndex = 0
                        }
                        true
                    }
                    Key.Enter -> {
                        selectOption(currentIndex)
                        true
                    }
                    else -> {
                        false
                    }
                }
            }
        )
    }

    Box(
        contentAlignment = Alignment.CenterEnd,
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 4.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .drawWithCache {
                    val outerStem = Outline(replyOuterStem())
                    val outerBoxShape = replyOuterBox()
                    val outerBox = Outline(outerBoxShape)
                    val innerStem = Outline(replyInnerStem())
                    val innerBox = Outline(replyInnerBox())

                    onDrawBehind {
                        scale(
                            scaleX = entry.messageHorizontalScale.value,
                            scaleY = entry.messageVerticalScale.value,
                            pivot = Offset(size.width, size.center.y)
                        ) {
                            drawOutline(outerBox, color = Color.Black)
                            drawOutline(outerStem, color = Color.Black)
                            drawOutline(innerStem, color = Color.White)
                            drawOutline(innerBox, color = Color.White)
                        }
                    }
                }
                .alpha(entry.messageTextAlpha.value)
                .padding(start = 44.dp, top = 20.dp, end = 40.dp, bottom = 20.dp)
                .then(if (determined) Modifier else Modifier.focusRequester(focusRequester).focusable().then(keyboardListenerModifier))
        ) {
            if (determined) {
                Text(
                    text = message.text ?: "",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Black,
                )
            } else {
                val options = message as ReplyOptions

                options.options.forEachIndexed { index, string ->
                    if (index == currentIndex) {
                        DynamicQuadBackgroundText(
                            string, modifier = Modifier.clickable(
                                onClick = {
                                    selectOption(currentIndex)
                                },
                                interactionSource = remember { MutableInteractionSource() },
                                indication = null,
                            ).focusRequester(focusRequester).focusable().then(keyboardListenerModifier)
                        )
                    } else {
                        Text(
                            text = string, style = MaterialTheme.typography.bodyMedium, color = Color.Black,
                            modifier = Modifier.clickable(
                                onClick = {
                                    currentIndex = index
                                    focusRequester.requestFocus()
                                },
                                interactionSource = remember { MutableInteractionSource() },
                                indication = null
                            ).focusRequester(focusRequester).focusable().then(keyboardListenerModifier)
                        )
                    }
                }
            }
        }
    }

    LaunchedEffect(Unit) {
        focusRequester.requestFocus()
    }
}

@Composable
fun DynamicQuadBackgroundText(
    text: String,
    modifier: Modifier = Modifier
) {
    // 1. 定义四个顶点的偏移量状态
    var targetOffsets by remember {
        mutableStateOf(List(4) { Offset.Zero })
    }

    // 2. 持续随机逻辑：每隔 500ms 生成一组新的随机目标点
    LaunchedEffect(Unit) {
        val random = Random(0)
        while (true) {
            targetOffsets = List(4) {
                Offset(
                    x = random.nextFloat(), // 存储 0.0 ~ 1.0 的比例
                    y = random.nextFloat()
                )
            }
            delay(200) // 随机变化的频率
        }
    }

    // 3. 为四个顶点创建平滑动画，确保随机点之间是滑动过去的，而不是闪现
    val p1 by animateOffsetAsState(targetOffsets[0], spring())
    val p2 by animateOffsetAsState(targetOffsets[1], spring())
    val p3 by animateOffsetAsState(targetOffsets[2], spring())
    val p4 by animateOffsetAsState(targetOffsets[3], spring())

    Text(
        text = text,
        color = Color.White,
        modifier = modifier
            .drawWithCache {
                val w = size.width
                val h = size.height

                // 限制抖动范围
                val maxJitter = 8.dp.toPx() * 0.8f

                onDrawBehind {
                    val paddingPx = 4.dp.toPx()

                    val path = Path().apply {
                        moveTo(-paddingPx - p1.x * maxJitter, -paddingPx - p1.y * maxJitter)
                        lineTo(w + paddingPx + p2.x * maxJitter, -paddingPx - p2.y * maxJitter)
                        lineTo(w +paddingPx + p3.x * maxJitter, h + paddingPx + p3.y * maxJitter)
                        lineTo(-paddingPx - p4.x * maxJitter, h + paddingPx + p4.y * maxJitter)
                        close()
                    }

                    drawPath(path, Color.Red.copy(alpha = 0.8f))
                }
            }
    )
}

private fun Density.replyOuterBox(): Shape = GenericShape { size, _ ->
    moveTo(0f, 0f)
    lineTo(size.width - 35.dp.toPx(), 4.dp.toPx())
    lineTo(size.width - 10.7.dp.toPx(), size.height - 6.6.dp.toPx())
    lineTo(35.5.dp.toPx(), size.height)
    close()
}

private fun Density.replyInnerBox(): Shape = GenericShape { size, _ ->
    moveTo(12.dp.toPx(), 5.dp.toPx())
    lineTo(size.width - 36.dp.toPx(), 9.5.dp.toPx())
    lineTo(size.width - 16.4.dp.toPx(), size.height - 11.7.dp.toPx())
    lineTo(36.5.dp.toPx(), size.height - 3.5.dp.toPx())
    close()
}

private fun Density.replyOuterStem(): Shape = GenericShape { size, _ ->
    val verticalOrigin = size.height
    moveTo(size.width - 37.6.dp.toPx(), verticalOrigin - 42.3.dp.toPx())
    lineTo(size.width - 20.8.dp.toPx(), verticalOrigin - 30.2.dp.toPx())
    lineTo(size.width - 19.4.dp.toPx(), verticalOrigin - 36.8.dp.toPx())
    lineTo(size.width, verticalOrigin - 19.6.dp.toPx())
    lineTo(size.width - 10.3.dp.toPx(), verticalOrigin - 19.6.dp.toPx())
    lineTo(size.width - 12.dp.toPx(), verticalOrigin - 12.3.dp.toPx())
    lineTo(size.width - 27.6.dp.toPx(), verticalOrigin - 15.2.dp.toPx())
    close()
}

private fun Density.replyInnerStem(): Shape = GenericShape { size, _ ->
    val verticalOrigin = size.height
    moveTo(size.width - 33.1.dp.toPx(), verticalOrigin - 33.2.dp.toPx())
    lineTo(size.width - 19.3.dp.toPx(), verticalOrigin - 26.3.dp.toPx())
    lineTo(size.width - 16.4.dp.toPx(), verticalOrigin - 31.6.dp.toPx())
    lineTo(size.width - 4.2.dp.toPx(), verticalOrigin - 21.dp.toPx())
    lineTo(size.width - 12.4.dp.toPx(), verticalOrigin - 23.4.dp.toPx())
    lineTo(size.width - 14.dp.toPx(), verticalOrigin - 17.2.dp.toPx())
    lineTo(size.width - 28.6.dp.toPx(), verticalOrigin - 21.2.dp.toPx())
    close()
}
