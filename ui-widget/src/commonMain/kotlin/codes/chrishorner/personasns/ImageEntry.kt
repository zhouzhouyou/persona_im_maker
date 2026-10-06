package codes.chrishorner.personasns

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import com.yuri.im.ui.resource.utils.EmbeddedImage

/** Received photos retain a sender portrait; player photos align right without a portrait. */
@Composable
fun ImageEntry(entry: Entry, modifier: Modifier = Modifier) {
    val image = requireNotNull(entry.image)
    val progress = entry.imageProgress.value
    val fromSelf = entry.message.fromSelf
    BoxWithConstraints(modifier.fillMaxWidth().padding(horizontal = 8.dp)) {
        val contentWidth = maxWidth
        val photoWidth = TranscriptSizes.imagePhotoWidth(contentWidth + 16.dp, image)
        val photoHeight = (photoWidth * image.height.toFloat() / image.width).coerceIn(90.dp, 360.dp)
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
                    .offset(x = if (fromSelf) contentWidth - panelWidth - 8.dp else 8.dp, y = 8.dp)
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
                    EmbeddedImage(image, null, Modifier.fillMaxSize().clip(revealShape))
                }
            }
            if (!fromSelf) Box(Modifier.offset(
                x = (photoWidth - 96.dp).coerceAtLeast(0.dp) * progress,
                y = (height - 90.dp).coerceAtLeast(0.dp),
            )) {
                Avatar(entry)
                if (progress == 0f) {
                    CameraMarker(Modifier.offset(x = 22.dp, y = 10.dp).size(36.dp).graphicsLayer { rotationZ = -12f })
                }
            }
            if (fromSelf && progress == 0f) {
                CameraMarker(Modifier.align(Alignment.TopEnd).offset(x = (-34).dp, y = 10.dp)
                    .size(36.dp).graphicsLayer { rotationZ = -12f })
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
