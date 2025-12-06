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
import androidx.compose.ui.unit.dp
import com.yuri.im.ui.resource.icon.MyIconPack
import androidx.compose.ui.tooling.preview.Preview

public val MyIconPack.BookmarkAdd: ImageVector
    get() {
        if (_BookmarkAdd != null) {
            return _BookmarkAdd!!
        }
        _BookmarkAdd = ImageVector.Builder(
            name = "BookmarkAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f,
        ).apply {
            path(fill = SolidColor(Color(0xFF1F1F1F))) {
                moveTo(200f, 840f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 120f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                lineTo(280f, 200f)
                verticalLineToRelative(518f)
                lineToRelative(200f, -86f)
                lineToRelative(200f, 86f)
                verticalLineToRelative(-278f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(400f)
                lineTo(480f, 720f)
                lineTo(200f, 840f)
                close()
                moveTo(280f, 200f)
                horizontalLineToRelative(240f)
                horizontalLineToRelative(-240f)
                close()
                moveTo(680f, 360f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()

        return _BookmarkAdd!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkAdd: ImageVector? = null

@Preview
@Composable
private fun BookmarkAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MyIconPack.BookmarkAdd, contentDescription = null)
    }
}
