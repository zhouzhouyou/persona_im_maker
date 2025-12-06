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

public val MyIconPack.Edit: ImageVector
    get() {
        if (_edit != null) {
            return _edit!!
        }
        _edit = Builder(name = "Edit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 960.0f, viewportHeight = 960.0f).apply {
            path(fill = SolidColor(Color(0xFF1f1f1f)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 760.0f)
                horizontalLineToRelative(57.0f)
                lineToRelative(391.0f, -391.0f)
                lineToRelative(-57.0f, -57.0f)
                lineToRelative(-391.0f, 391.0f)
                verticalLineToRelative(57.0f)
                close()
                moveTo(120.0f, 840.0f)
                verticalLineToRelative(-170.0f)
                lineToRelative(528.0f, -527.0f)
                quadToRelative(12.0f, -11.0f, 26.5f, -17.0f)
                reflectiveQuadToRelative(30.5f, -6.0f)
                quadToRelative(16.0f, 0.0f, 31.0f, 6.0f)
                reflectiveQuadToRelative(26.0f, 18.0f)
                lineToRelative(55.0f, 56.0f)
                quadToRelative(12.0f, 11.0f, 17.5f, 26.0f)
                reflectiveQuadToRelative(5.5f, 30.0f)
                quadToRelative(0.0f, 16.0f, -5.5f, 30.5f)
                reflectiveQuadTo(817.0f, 313.0f)
                lineTo(290.0f, 840.0f)
                lineTo(120.0f, 840.0f)
                close()
                moveTo(760.0f, 256.0f)
                lineTo(704.0f, 200.0f)
                lineTo(760.0f, 256.0f)
                close()
                moveTo(619.0f, 341.0f)
                lineTo(591.0f, 312.0f)
                lineTo(648.0f, 369.0f)
                lineTo(619.0f, 341.0f)
                close()
            }
        }
        .build()
        return _edit!!
    }

private var _edit: ImageVector? = null
