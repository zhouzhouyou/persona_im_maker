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
import androidx.compose.ui.unit.dp
import com.yuri.im.ui.resource.MyResourcePack
import androidx.compose.ui.tooling.preview.Preview

public val MyResourcePack.LogoIm: ImageVector
    get() {
        if (_logoIm != null) {
            return _logoIm!!
        }
        _logoIm = Builder(name = "LogoIm", defaultWidth = 218.0.dp, defaultHeight = 170.0.dp,
                viewportWidth = 218.0f, viewportHeight = 170.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(99.21f, 144.84f)
                lineTo(106.92f, 156.2f)
                lineTo(217.91f, 120.69f)
                lineTo(189.27f, 5.3f)
                lineTo(126.27f, 0.17f)
                lineTo(122.65f, 28.67f)
                lineTo(112.78f, 13.51f)
                lineTo(109.09f, 2.71f)
                lineTo(71.34f, 18.62f)
                lineTo(68.67f, 6.05f)
                lineTo(0.09f, 20.15f)
                lineTo(40.77f, 170.0f)
                lineTo(99.21f, 144.84f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFD1700)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.15f, 42.43f)
                lineTo(60.07f, 27.32f)
                lineTo(84.34f, 140.52f)
                lineTo(56.85f, 146.21f)
                lineTo(24.15f, 42.43f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(108.11f, 134.34f)
                lineTo(129.92f, 128.56f)
                lineTo(105.98f, 48.61f)
                lineTo(139.36f, 97.31f)
                lineTo(141.89f, 34.0f)
                lineTo(167.26f, 120.75f)
                lineTo(189.27f, 115.07f)
                lineTo(171.01f, 16.86f)
                lineTo(136.41f, 13.51f)
                lineTo(132.05f, 63.83f)
                lineTo(107.72f, 29.39f)
                lineTo(103.92f, 19.02f)
                lineTo(73.0f, 31.27f)
                lineTo(108.11f, 134.34f)
                close()
            }
        }
        .build()
        return _logoIm!!
    }

private var _logoIm: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MyResourcePack.LogoIm, contentDescription = "")
    }
}
