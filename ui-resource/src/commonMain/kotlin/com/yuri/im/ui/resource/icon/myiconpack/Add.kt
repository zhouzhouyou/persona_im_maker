package com.yuri.im.ui.resource.icon.myiconpack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yuri.im.ui.resource.icon.MyIconPack

public val MyIconPack.Add: ImageVector
    get() {
        if (_add != null) {
            return _add!!
        }
        _add = Builder(name = "Add", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 960.0f, viewportHeight = 960.0f).apply {
            path(fill = SolidColor(Color(0xFF1f1f1f)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(440.0f, 520.0f)
                lineTo(200.0f, 520.0f)
                verticalLineToRelative(-80.0f)
                horizontalLineToRelative(240.0f)
                verticalLineToRelative(-240.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(240.0f)
                horizontalLineToRelative(240.0f)
                verticalLineToRelative(80.0f)
                lineTo(520.0f, 520.0f)
                verticalLineToRelative(240.0f)
                horizontalLineToRelative(-80.0f)
                verticalLineToRelative(-240.0f)
                close()
            }
        }
        .build()
        return _add!!
    }

private var _add: ImageVector? = null
