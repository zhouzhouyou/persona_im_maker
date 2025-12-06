package com.yuri.im.ui.resource.icon.myiconpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yuri.im.ui.resource.icon.MyIconPack

public val MyIconPack.Reorder: ImageVector
    get() {
        if (_Reorder != null) {
            return _Reorder!!
        }
        _Reorder = ImageVector.Builder(
            name = "Reorder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f,
        ).apply {
            path(fill = SolidColor(Color(0xFF1F1F1F))) {
                moveTo(120f, 760f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(80f)
                lineTo(120f, 760f)
                close()
                moveTo(120f, 600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(80f)
                lineTo(120f, 600f)
                close()
                moveTo(120f, 440f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(80f)
                lineTo(120f, 440f)
                close()
                moveTo(120f, 280f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(80f)
                lineTo(120f, 280f)
                close()
            }
        }.build()

        return _Reorder!!
    }

@Suppress("ObjectPropertyName")
private var _Reorder: ImageVector? = null

@Preview
@Composable
private fun ReorderPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MyIconPack.Reorder, contentDescription = null)
    }
}
