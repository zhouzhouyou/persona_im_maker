package com.yuri.im.ui.resource.icon.myiconpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import com.yuri.im.ui.resource.icon.MyIconPack
import androidx.compose.ui.tooling.preview.Preview

public val MyIconPack.Play: ImageVector
    get() {
        if (_play != null) return _play!!
        
        _play = ImageVector.Builder(
            name = "play",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(fill = SolidColor(Color(0xFF1F1F1F))) {
                moveToRelative(380f, 620f)
                lineToRelative(280f, -180f)
                lineToRelative(-280f, -180f)
                verticalLineToRelative(360f)
                close()
                moveTo(320f, 840f)
                verticalLineToRelative(-80f)
                lineTo(160f, 760f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 680f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 120f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 760f)
                lineTo(640f, 760f)
                verticalLineToRelative(80f)
                lineTo(320f, 840f)
                close()
                moveTo(160f, 680f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-480f)
                lineTo(160f, 200f)
                verticalLineToRelative(480f)
                close()
                moveTo(160f, 680f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _play!!
    }

private var _play: ImageVector? = null


@Preview
@Composable
fun PreviewPlay() {
    Box {
        Image(
            painter = rememberVectorPainter(MyIconPack.Play),
            contentDescription = null
        )
    }
}
