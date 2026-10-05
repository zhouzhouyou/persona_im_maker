package codes.chrishorner.personasns

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import com.yuri.im.schema.ImageMessage
import com.yuri.im.ui.resource.utils.EmbeddedImage

/** Camera-tagged sender card unfolds into a photo, with its sender anchored at the lower right. */
@Composable
fun ImageEntry(entry: Entry, modifier: Modifier = Modifier) {
    val message = entry.message as ImageMessage
    val progress = entry.imageProgress.value
    BoxWithConstraints(modifier.fillMaxWidth().padding(horizontal = 8.dp)) {
        val photoWidth = (maxWidth - 16.dp).coerceAtMost(520.dp)
        val photoHeight = (photoWidth * message.image.height.toFloat() / message.image.width).coerceIn(90.dp, 360.dp)
        val height = 90.dp + (photoHeight + 24.dp - 90.dp) * progress
        val rotation = when {
            progress < 0.3f -> -38f * progress / 0.3f
            progress < 0.7f -> -38f + 48f * (progress - 0.3f) / 0.4f
            else -> 10f - 13f * (progress - 0.7f) / 0.3f
        }
        Box(Modifier.fillMaxWidth().height(height)) {
            if (progress > 0f) {
                val panelWidth = 64.dp + (photoWidth - 64.dp) * progress
                val panelHeight = 64.dp + (photoHeight - 64.dp) * progress
                Box(Modifier
                    .offset(x = 8.dp, y = 8.dp)
                    .size(panelWidth, panelHeight)
                    .graphicsLayer {
                        transformOrigin = TransformOrigin(0.85f, 0.95f)
                        rotationZ = rotation
                    }
                    .background(Color.Black)
                    .padding(8.dp)
                ) {
                    val revealShape = GenericShape { size, _ ->
                        val inset = (1f - progress) * size.width * 0.42f
                        moveTo(inset, size.height * (1f - progress) * 0.3f)
                        lineTo(size.width - inset, 0f)
                        lineTo(size.width, size.height * progress)
                        lineTo(inset, size.height)
                        close()
                    }
                    EmbeddedImage(message.image, null, Modifier.fillMaxSize().clip(revealShape))
                }
            }
            Box(Modifier.offset(
                x = (photoWidth - 96.dp).coerceAtLeast(0.dp) * progress,
                y = (height - 90.dp).coerceAtLeast(0.dp),
            )) {
                Avatar(entry)
                if (progress == 0f) {
                    CameraMarker(Modifier.offset(x = 22.dp, y = 10.dp).size(36.dp).graphicsLayer { rotationZ = -12f })
                }
            }
            if (progress > 0f) Canvas(Modifier.fillMaxSize()) {
                val x = (photoWidth - 102.dp).toPx() * progress
                drawLine(Color.Black, Offset(x, size.height - 3.dp.toPx()), Offset(photoWidth.toPx(), size.height - 13.dp.toPx()), 9.dp.toPx())
                drawLine(Color.White, Offset(x, size.height - 3.dp.toPx()), Offset(photoWidth.toPx(), size.height - 13.dp.toPx()), 3.dp.toPx())
            }
        }
    }
}

@Composable
private fun CameraMarker(modifier: Modifier) {
    Canvas(modifier) {
        drawRect(Color.Black, Offset(0f, size.height * .18f), Size(size.width, size.height * .72f))
        drawRect(Color.White, Offset(size.width * .07f, size.height * .25f), Size(size.width * .86f, size.height * .56f))
        drawRect(Color.Black, Offset(size.width * .22f, size.height * .07f), Size(size.width * .4f, size.height * .2f))
        drawCircle(Color.Black, size.minDimension * .19f, Offset(size.width * .52f, size.height * .53f))
    }
}
