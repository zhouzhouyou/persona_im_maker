package com.yuri.im.ui.resource.drawable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yuri.im.ui.resource.MyResourcePack
import kotlin.Unit

public val MyResourcePack.TypingBubble: ImageVector
    get() {
        if (_typingBubble != null) {
            return _typingBubble!!
        }
        _typingBubble = Builder(name = "TypingBubble", defaultWidth = 90.0.dp, defaultHeight =
                45.39.dp, viewportWidth = 230.0f, viewportHeight = 116.0f).apply {
            path(fill = SolidColor(Color(0xFF6C0100)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 113.32f)
                lineTo(57.06f, 69.28f)
                lineTo(62.57f, 81.2f)
                lineTo(71.44f, 68.68f)
                lineTo(58.43f, 34.59f)
                lineTo(222.6f, 0.0f)
                lineTo(229.6f, 98.05f)
                lineTo(88.69f, 115.1f)
                lineTo(84.25f, 102.98f)
                lineTo(52.92f, 114.9f)
                lineTo(47.89f, 95.68f)
                lineTo(0.0f, 113.32f)
                close()
            }
        }
        .build()
        return _typingBubble!!
    }

private var _typingBubble: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MyResourcePack.TypingBubble, contentDescription = "")
    }
}
