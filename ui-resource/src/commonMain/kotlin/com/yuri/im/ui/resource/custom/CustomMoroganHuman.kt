package com.yuri.im.ui.resource.custom

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yuri.im.ui.resource.BuildInCustomSenderAvatar

public val BuildInCustomSenderAvatar.CustomMoroganHuman: ImageVector
    get() {
        if (_CustomMoroganHuman != null) {
            return _CustomMoroganHuman!!
        }
        _CustomMoroganHuman = ImageVector.Builder(
            name = "CustomMoroganHuman",
            defaultWidth = 256.dp,
            defaultHeight = 256.dp,
            viewportWidth = 1024f,
            viewportHeight = 1024f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF020202)),
                strokeLineWidth = 1.19602f,
            ) {
                moveToRelative(439.3f, 24.7f)
                lineToRelative(29.6f, 1.2f)
                lineToRelative(26.1f, 2.4f)
                lineToRelative(15.4f, 2.4f)
                lineToRelative(23.7f, 8.4f)
                lineToRelative(21.3f, 9.7f)
                lineToRelative(19f, 9.7f)
                lineToRelative(20.1f, 14.5f)
                lineToRelative(14.2f, 13.3f)
                lineToRelative(10.7f, 12.1f)
                lineToRelative(14.2f, 16.9f)
                lineToRelative(15.4f, 24.1f)
                lineToRelative(13f, 20.5f)
                lineToRelative(9.5f, 19.3f)
                lineToRelative(19f, 39.8f)
                lineToRelative(4.7f, 10.9f)
                lineToRelative(19f, 41f)
                lineToRelative(10.7f, 25.3f)
                lineToRelative(4.7f, 20.5f)
                verticalLineToRelative(15.7f)
                lineToRelative(-1.2f, 16.9f)
                lineToRelative(-3.6f, 12.1f)
                lineToRelative(-8.3f, 12.1f)
                lineToRelative(-3.6f, 2.4f)
                lineToRelative(2.4f, -7.2f)
                verticalLineToRelative(-33.8f)
                lineToRelative(-3.6f, 30.2f)
                lineToRelative(-3.6f, 13.3f)
                horizontalLineTo(705.9f)
                lineToRelative(-1.2f, 6f)
                lineToRelative(-10.7f, 22.9f)
                lineToRelative(-4.7f, 9.7f)
                lineToRelative(-7.1f, 37.4f)
                lineToRelative(-9.5f, 31.4f)
                lineToRelative(-8.3f, 12.1f)
                lineToRelative(-15.4f, 21.7f)
                lineToRelative(-9.5f, 12.1f)
                lineToRelative(-9.5f, 18.1f)
                lineToRelative(-5.9f, 18.1f)
                lineToRelative(-2.4f, 13.3f)
                lineToRelative(-2.4f, -2.4f)
                lineToRelative(-2.4f, -9.7f)
                lineToRelative(-2.4f, -1.2f)
                lineToRelative(-3.6f, 20.5f)
                lineToRelative(-3.6f, 25.3f)
                curveToRelative(-5.4f, 39f, -1.7f, 89.4f, -1.2f, 129.1f)
                lineToRelative(7.1f, 24.1f)
                lineToRelative(3.6f, 3.6f)
                verticalLineToRelative(2.4f)
                lineToRelative(29.6f, 6f)
                lineToRelative(30.8f, 12.1f)
                lineToRelative(17.8f, 10.9f)
                lineToRelative(14.2f, 14.5f)
                lineToRelative(7.1f, 8.4f)
                lineToRelative(9.5f, 8.4f)
                lineToRelative(19f, 15.7f)
                lineToRelative(15.4f, 9.7f)
                lineToRelative(22.5f, 13.3f)
                lineToRelative(14.2f, 8.4f)
                lineToRelative(26.1f, 10.9f)
                lineToRelative(47.4f, 21.7f)
                lineToRelative(42.7f, 19.3f)
                lineToRelative(47.4f, 21.7f)
                lineToRelative(20.1f, 9.7f)
                lineToRelative(19f, 13.3f)
                curveToRelative(5.1f, 9.3f, 10.2f, 18.5f, 15.4f, 27.8f)
                lineToRelative(-1.5f, 20.2f)
                lineToRelative(-999.5f, -0.7f)
                lineToRelative(5.5f, -30.4f)
                lineToRelative(11.9f, -18.1f)
                lineToRelative(15.4f, -21.7f)
                lineToRelative(11.9f, -18.1f)
                lineToRelative(19f, -14.5f)
                lineToRelative(55.7f, -18.1f)
                lineToRelative(46.2f, -14.5f)
                lineToRelative(39.1f, -13.3f)
                lineToRelative(33.2f, -13.3f)
                lineToRelative(17.8f, -8.4f)
                lineToRelative(10.7f, -9.7f)
                lineToRelative(19f, -14.5f)
                lineToRelative(15.4f, -12.1f)
                lineToRelative(8.3f, -8.4f)
                lineToRelative(11.9f, -9.7f)
                lineToRelative(19f, -10.9f)
                lineToRelative(15.4f, -4.8f)
                lineToRelative(-2.4f, -22.9f)
                lineToRelative(-3.6f, -6f)
                lineToRelative(-9.5f, -8.4f)
                lineToRelative(-19f, -19.3f)
                lineToRelative(-15.4f, -12.1f)
                lineToRelative(-16.6f, -13.3f)
                lineToRelative(-14.2f, -13.3f)
                lineToRelative(-9.5f, -8.4f)
                lineToRelative(-15.4f, -16.9f)
                lineToRelative(-16.6f, -22.9f)
                lineToRelative(-8.3f, -12.1f)
                lineToRelative(-9.5f, -16.9f)
                lineToRelative(-13f, -30.2f)
                lineToRelative(-7.1f, -10.9f)
                lineToRelative(-20.1f, -19.3f)
                lineToRelative(-1.2f, -2.4f)
                horizontalLineToRelative(-2.4f)
                lineToRelative(-4.7f, 10.9f)
                lineToRelative(-5.9f, 4.8f)
                horizontalLineToRelative(-4.7f)
                lineToRelative(2.4f, -4.8f)
                lineToRelative(1.2f, -2.4f)
                verticalLineToRelative(-10.9f)
                lineToRelative(-2.4f, -10.9f)
                lineToRelative(-10.7f, -19.3f)
                lineToRelative(-20.1f, -33.8f)
                lineToRelative(-3.6f, -6f)
                lineToRelative(-1.2f, 4.8f)
                verticalLineToRelative(10.9f)
                lineToRelative(9.5f, 10.9f)
                lineToRelative(-2.4f, 1.2f)
                lineToRelative(-4.7f, -2.4f)
                lineToRelative(10.7f, 14.5f)
                lineToRelative(-2.4f, 1.2f)
                lineToRelative(-15.4f, -8.4f)
                lineToRelative(-10.7f, -10.9f)
                lineToRelative(-5.9f, -13.3f)
                lineToRelative(-5.9f, -27.8f)
                lineToRelative(-1.2f, -132.8f)
                lineToRelative(4.7f, -29f)
                lineToRelative(14.2f, -51.9f)
                lineToRelative(10.7f, -30.2f)
                lineToRelative(1.2f, -2.4f)
                lineToRelative(1.2f, -32.6f)
                lineToRelative(7.1f, -20.5f)
                lineToRelative(10.7f, -16.9f)
                lineToRelative(10.7f, -12.1f)
                lineToRelative(15.4f, -14.5f)
                lineToRelative(14.2f, -14.5f)
                lineToRelative(27.3f, -19.3f)
                lineToRelative(21.3f, -13.3f)
                lineToRelative(20.1f, -9.7f)
                lineToRelative(4.7f, -2.4f)
                lineToRelative(28.4f, -14.5f)
                lineToRelative(23.7f, -9.7f)
                lineToRelative(21.3f, -1.2f)
                lineToRelative(54.5f, -1.2f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                strokeLineWidth = 1.19602f,
            ) {
                moveToRelative(435.8f, 387.3f)
                lineToRelative(5.9f, 1.2f)
                lineToRelative(9.5f, 4.8f)
                verticalLineToRelative(1.2f)
                lineToRelative(-24.9f, 3.6f)
                lineToRelative(-23.7f, 9.7f)
                lineToRelative(-14.2f, 6f)
                lineToRelative(-4.7f, 3.6f)
                lineToRelative(15.4f, -4.8f)
                lineToRelative(15.4f, -6f)
                lineToRelative(36.7f, -8.4f)
                lineToRelative(4.7f, -2.4f)
                lineToRelative(5.9f, 3.6f)
                verticalLineToRelative(2.4f)
                lineToRelative(5.9f, 2.4f)
                lineToRelative(1.2f, 3.6f)
                lineToRelative(-10.7f, 2.4f)
                lineToRelative(-26.1f, 3.6f)
                lineToRelative(-11.9f, 6f)
                lineToRelative(-13f, 8.4f)
                lineToRelative(-1.2f, 4.8f)
                lineToRelative(5.9f, -2.4f)
                horizontalLineToRelative(5.9f)
                lineToRelative(-1.2f, 7.2f)
                lineToRelative(3.6f, -2.4f)
                verticalLineToRelative(21.7f)
                lineToRelative(-2.4f, 4.8f)
                verticalLineToRelative(3.6f)
                horizontalLineToRelative(7.1f)
                lineToRelative(-1.2f, -2.4f)
                verticalLineTo(450.1f)
                lineToRelative(4.7f, -15.7f)
                lineToRelative(4.7f, -7.2f)
                lineToRelative(9.5f, -4.8f)
                lineToRelative(3.6f, -1.2f)
                horizontalLineToRelative(8.3f)
                lineToRelative(-7.1f, 9.7f)
                curveToRelative(0f, 0f, -3f, 18.6f, 3.1f, 25.3f)
                curveToRelative(8.1f, 8.8f, 33.6f, 6.1f, 33.6f, 6.1f)
                lineToRelative(5.9f, -4.8f)
                curveToRelative(4.6f, -7.7f, 3.6f, -15.5f, 3.6f, -24.1f)
                lineToRelative(-3.6f, -7.2f)
                lineToRelative(-2.4f, -3.6f)
                lineToRelative(5.9f, 2.4f)
                lineToRelative(11.9f, 7.2f)
                lineToRelative(1.2f, 1.2f)
                lineToRelative(-1.2f, 12.1f)
                lineToRelative(-1.2f, 3.6f)
                lineToRelative(3.6f, 1.2f)
                lineToRelative(2.4f, 7.2f)
                verticalLineToRelative(22.9f)
                lineToRelative(-1.2f, 10.9f)
                lineToRelative(4.7f, -6f)
                lineToRelative(3.6f, -8.4f)
                horizontalLineToRelative(1.2f)
                verticalLineToRelative(7.2f)
                lineToRelative(-2.4f, 4.8f)
                horizontalLineToRelative(2.4f)
                lineToRelative(1.2f, -7.2f)
                lineToRelative(3.6f, -12.1f)
                lineToRelative(2.4f, -12.1f)
                horizontalLineToRelative(4.7f)
                lineToRelative(5.9f, 18.1f)
                lineToRelative(2.4f, 27.8f)
                lineToRelative(5.9f, -21.7f)
                lineToRelative(4.7f, 4.8f)
                lineToRelative(2.4f, 12.1f)
                verticalLineToRelative(19.3f)
                lineToRelative(2.4f, -1.2f)
                verticalLineToRelative(9.7f)
                lineToRelative(4.7f, -12.1f)
                lineToRelative(4.7f, -12.1f)
                lineToRelative(2.4f, -2.4f)
                lineToRelative(3.6f, 4.8f)
                lineToRelative(3.6f, 9.7f)
                verticalLineTo(504.4f)
                lineToRelative(3.6f, 2.4f)
                verticalLineToRelative(-13.3f)
                lineToRelative(4.7f, -13.3f)
                lineToRelative(3.6f, -10.9f)
                lineToRelative(2.4f, 1.2f)
                lineToRelative(1.2f, 10.9f)
                lineToRelative(1.2f, 27.8f)
                lineToRelative(7.1f, -12.1f)
                lineToRelative(3.6f, -4.8f)
                horizontalLineToRelative(2.4f)
                lineToRelative(2.4f, -4.8f)
                lineToRelative(15.4f, -19.3f)
                lineToRelative(2.4f, -1.2f)
                verticalLineToRelative(8.4f)
                lineToRelative(-16.6f, 33.8f)
                lineToRelative(-4.7f, 14.5f)
                lineToRelative(-4.7f, 7.2f)
                lineToRelative(-7.1f, 4.8f)
                lineToRelative(-10.7f, 3.6f)
                lineToRelative(-3.6f, 7.2f)
                lineToRelative(-5.9f, 27.8f)
                lineToRelative(-4.7f, 19.3f)
                lineToRelative(-4.7f, 12.1f)
                lineToRelative(-3.6f, 6f)
                lineToRelative(-9.5f, 14.5f)
                lineToRelative(-8.3f, 10.9f)
                lineToRelative(-16.6f, 18.1f)
                lineToRelative(-16.6f, 18.1f)
                lineToRelative(-19f, 19.3f)
                lineToRelative(-9.5f, 8.4f)
                lineToRelative(-13f, 12.1f)
                lineToRelative(-15.4f, 12.1f)
                lineToRelative(-10.7f, 8.4f)
                lineToRelative(-27.3f, 12.1f)
                lineToRelative(-7.1f, 2.4f)
                horizontalLineToRelative(-24.9f)
                lineToRelative(-9.5f, -2.4f)
                lineToRelative(-13f, -10.9f)
                lineToRelative(-9.5f, -8.4f)
                lineToRelative(-13f, -10.9f)
                lineToRelative(-17.8f, -15.7f)
                lineToRelative(-16.6f, -14.5f)
                lineToRelative(-13f, -10.9f)
                lineToRelative(-9.5f, -8.4f)
                lineToRelative(-13f, -16.9f)
                lineToRelative(-10.7f, -13.3f)
                lineToRelative(-14.2f, -25.3f)
                lineToRelative(-14.2f, -32.6f)
                lineToRelative(-7.1f, -20.5f)
                lineToRelative(-3.6f, -16.9f)
                lineToRelative(-3.6f, -8.4f)
                lineToRelative(1.2f, -3.6f)
                lineToRelative(4.7f, 2.4f)
                verticalLineToRelative(-3.6f)
                lineToRelative(4.7f, -1.2f)
                verticalLineToRelative(-2.4f)
                lineToRelative(-5.9f, -1.2f)
                lineToRelative(-9.5f, -10.9f)
                lineToRelative(-3.6f, -7.2f)
                lineToRelative(-2.4f, -8.4f)
                lineToRelative(11.9f, 2.4f)
                lineToRelative(-3.6f, -6f)
                lineToRelative(-3.6f, -6f)
                lineToRelative(5.9f, 1.2f)
                verticalLineToRelative(-2.4f)
                lineToRelative(-7.1f, -2.4f)
                lineToRelative(-9.5f, -12.1f)
                lineToRelative(-3.6f, -6f)
                lineToRelative(-2.4f, -7.2f)
                lineToRelative(-1.2f, -20.5f)
                horizontalLineToRelative(3.6f)
                lineToRelative(1.2f, -3.6f)
                lineToRelative(8.3f, -3.6f)
                lineToRelative(10.7f, -3.6f)
                lineToRelative(2.4f, -1.2f)
                lineToRelative(11.9f, -1.2f)
                horizontalLineToRelative(13f)
                lineToRelative(10.7f, 6f)
                lineToRelative(39.1f, 26.6f)
                lineToRelative(26.1f, 16.9f)
                lineToRelative(13f, 12.1f)
                lineToRelative(-5.9f, -15.7f)
                lineToRelative(-8.3f, -12.1f)
                lineToRelative(-2.4f, -4.8f)
                lineToRelative(5.9f, 2.4f)
                lineToRelative(9.5f, 8.4f)
                lineToRelative(3.6f, 4.8f)
                lineToRelative(2.4f, 8.4f)
                lineToRelative(1.2f, -3.6f)
                lineToRelative(3.6f, 1.2f)
                lineToRelative(1.2f, 10.9f)
                lineToRelative(2.4f, -1.2f)
                lineToRelative(1.2f, 4.8f)
                lineToRelative(5.9f, -31.4f)
                verticalLineToRelative(-14.5f)
                lineToRelative(-3.6f, -12.1f)
                lineToRelative(-2.4f, -8.4f)
                lineToRelative(7.1f, 2.4f)
                horizontalLineToRelative(16.6f)
                lineToRelative(-10.7f, -6f)
                verticalLineToRelative(-1.2f)
                lineToRelative(11.9f, -1.2f)
                lineToRelative(-17.8f, -6f)
                lineToRelative(-4.7f, -2.4f)
                verticalLineToRelative(-2.4f)
                horizontalLineToRelative(27.3f)
                lineToRelative(2.4f, 2.4f)
                lineToRelative(8.3f, 2.4f)
                horizontalLineToRelative(7.1f)
                lineToRelative(7.1f, -4.8f)
                horizontalLineToRelative(2.4f)
                verticalLineToRelative(-2.4f)
                lineToRelative(15.4f, -9.7f)
                lineToRelative(13f, -4.8f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                strokeLineWidth = 1.19602f,
            ) {
                moveToRelative(606.4f, 565.9f)
                lineToRelative(2.4f, 2.4f)
                verticalLineToRelative(19.3f)
                lineToRelative(-3.6f, 18.1f)
                lineToRelative(-2.4f, 24.1f)
                verticalLineTo(730.1f)
                lineToRelative(1.2f, 14.5f)
                lineToRelative(7.1f, 24.1f)
                lineToRelative(10.7f, 16.9f)
                lineToRelative(21.3f, 21.7f)
                lineToRelative(8.3f, 7.2f)
                lineToRelative(10.7f, 19.3f)
                lineToRelative(9.5f, 14.5f)
                lineToRelative(7.1f, 8.4f)
                lineToRelative(13f, 10.9f)
                lineToRelative(2.4f, 3.6f)
                lineToRelative(2.4f, 27.8f)
                verticalLineToRelative(13.3f)
                lineToRelative(-17.8f, 16.9f)
                lineToRelative(-9.5f, 9.7f)
                lineToRelative(-16.6f, 12.1f)
                lineToRelative(-21.3f, 14.5f)
                lineToRelative(-13f, 8.4f)
                lineToRelative(-14.2f, 4.8f)
                lineToRelative(-22.5f, 4.8f)
                lineToRelative(-30.8f, 4.8f)
                lineToRelative(-33.2f, 2.4f)
                horizontalLineToRelative(-73.5f)
                lineToRelative(-27.3f, -1.2f)
                lineToRelative(-27.3f, -4.8f)
                lineToRelative(-34.4f, -16.9f)
                lineToRelative(-7.1f, -3.6f)
                lineToRelative(-4.7f, -4.8f)
                lineToRelative(-3.6f, -1.2f)
                verticalLineToRelative(-2.4f)
                lineToRelative(17.8f, -9.7f)
                lineToRelative(11.9f, -6f)
                lineToRelative(10.7f, -7.2f)
                lineToRelative(9.5f, -8.4f)
                lineToRelative(3.6f, -4.8f)
                lineToRelative(8.3f, -1.2f)
                lineToRelative(10.7f, 2.4f)
                lineToRelative(9.5f, 8.4f)
                lineToRelative(3.6f, 3.6f)
                lineToRelative(3.6f, 1.2f)
                horizontalLineToRelative(10.7f)
                lineToRelative(-22.5f, -13.3f)
                lineToRelative(-8.3f, -3.6f)
                lineToRelative(2.4f, -4.8f)
                lineToRelative(7.1f, -6f)
                lineToRelative(5.9f, -8.4f)
                lineToRelative(5.9f, -13.3f)
                lineToRelative(3.6f, 4.8f)
                lineToRelative(4.7f, 8.4f)
                lineToRelative(-1.2f, -27.8f)
                lineToRelative(-1.2f, -14.5f)
                lineToRelative(15.4f, -27.8f)
                lineToRelative(17.8f, -33.8f)
                lineToRelative(15.4f, -27.8f)
                lineToRelative(20.1f, -38.6f)
                lineToRelative(15.4f, -27.8f)
                lineToRelative(20.1f, -38.6f)
                lineToRelative(14.2f, -27.8f)
                lineToRelative(7.1f, -14.5f)
                lineToRelative(17.8f, -10.9f)
                lineToRelative(8.3f, -7.2f)
                lineToRelative(9.5f, -14.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF070707)),
                strokeLineWidth = 1.19602f,
            ) {
                moveToRelative(329.1f, 489.9f)
                lineToRelative(2.4f, 3.6f)
                lineToRelative(5.9f, 25.3f)
                lineToRelative(2.4f, 21.7f)
                lineToRelative(3.6f, 56.7f)
                lineToRelative(4.7f, 4.8f)
                lineToRelative(2.4f, 1.2f)
                horizontalLineToRelative(14.2f)
                lineToRelative(3.6f, -2.4f)
                horizontalLineToRelative(8.3f)
                lineToRelative(7.1f, 2.4f)
                lineToRelative(-5.9f, 10.9f)
                lineToRelative(-5.9f, 7.2f)
                lineToRelative(-5.9f, 3.6f)
                horizontalLineToRelative(-8.3f)
                lineToRelative(-16.6f, -9.7f)
                lineToRelative(-11.9f, -10.9f)
                lineToRelative(-2.4f, -4.8f)
                verticalLineToRelative(-13.3f)
                lineToRelative(1.2f, -1.2f)
                lineToRelative(3.6f, -32.6f)
                lineToRelative(1.2f, -8.4f)
                verticalLineToRelative(-30.2f)
                lineToRelative(-3.6f, -19.3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0B0B0B)),
                strokeLineWidth = 1.19602f,
            ) {
                moveToRelative(248.6f, 491.7f)
                lineToRelative(-0.1f, -21.1f)
                lineToRelative(5.9f, -6f)
                horizontalLineToRelative(9.5f)
                lineToRelative(2.4f, 1.2f)
                lineToRelative(5.9f, 4.8f)
                lineToRelative(4.7f, 7.2f)
                verticalLineToRelative(15.7f)
                lineToRelative(-5.9f, 6f)
                horizontalLineToRelative(-9.5f)
                lineToRelative(-7.1f, -4.8f)
                lineToRelative(-5.3f, -2.1f)
                lineToRelative(-4.2f, -6.3f)
                lineToRelative(-1.2f, -2.4f)
                verticalLineToRelative(-13.3f)
                lineToRelative(4.7f, -7.2f)
                lineToRelative(3.6f, -2.4f)
                lineToRelative(-10.7f, 1.2f)
                lineToRelative(-9.5f, 6f)
                lineToRelative(-7.1f, 8.4f)
                lineToRelative(-2.4f, 3.6f)
                lineToRelative(1.2f, 10.9f)
                lineToRelative(3.6f, 4.8f)
                verticalLineToRelative(2.4f)
                lineToRelative(-4.7f, -2.4f)
                lineToRelative(-4.7f, -6f)
                lineToRelative(-2.4f, -1.2f)
                lineToRelative(-1.2f, 4.8f)
                lineToRelative(-1.2f, -1.2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2.4f)
                verticalLineToRelative(-8.4f)
                lineToRelative(4.7f, -7.2f)
                lineToRelative(2.4f, -6f)
                lineToRelative(-10.7f, 2.4f)
                lineToRelative(5.9f, -6f)
                lineToRelative(7.1f, -4.8f)
                lineToRelative(14.2f, -3.6f)
                horizontalLineToRelative(22.5f)
                lineToRelative(17.8f, 2.4f)
                lineToRelative(9.5f, 10.9f)
                lineToRelative(4.7f, 7.2f)
                lineToRelative(-1.2f, 2.4f)
                horizontalLineToRelative(-2.4f)
                lineToRelative(7.1f, 9.7f)
                lineToRelative(-1.2f, 8.4f)
                lineToRelative(-7.1f, 2.4f)
                verticalLineToRelative(-10.9f)
                lineToRelative(-9.5f, -13.3f)
                verticalLineToRelative(1.2f)
                lineToRelative(2.4f, 4.8f)
                verticalLineToRelative(14.5f)
                lineToRelative(-3.6f, 8.4f)
                lineToRelative(-3.6f, 2.4f)
                horizontalLineToRelative(-15.4f)
                lineToRelative(-7.1f, -4.8f)
                lineToRelative(-2.4f, -4.8f)
            }
            path(
                fill = SolidColor(Color(0xFF0A0A0A)),
                strokeLineWidth = 1.19602f,
            ) {
                moveToRelative(670.4f, 888.2f)
                horizontalLineToRelative(16.6f)
                lineToRelative(-4.7f, 7.2f)
                lineToRelative(-8.3f, 8.4f)
                lineToRelative(-9.5f, 6f)
                lineToRelative(-15.4f, 4.8f)
                lineToRelative(-17.8f, 3.6f)
                lineToRelative(-15.4f, 2.4f)
                lineToRelative(-19f, 1.2f)
                horizontalLineToRelative(-73.5f)
                lineToRelative(-11.9f, 2.4f)
                lineToRelative(-13f, 10.9f)
                lineToRelative(-7.1f, 4.8f)
                lineToRelative(-3.6f, 1.2f)
                horizontalLineToRelative(-20.1f)
                lineToRelative(-1.2f, -4.8f)
                lineToRelative(42.7f, -14.5f)
                lineToRelative(4.7f, -2.4f)
                lineToRelative(85.3f, -1.2f)
                lineToRelative(20.1f, -2.4f)
                lineToRelative(15.4f, -6f)
                lineToRelative(20.1f, -13.3f)
                lineToRelative(10.7f, -6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF10100F)),
                strokeLineWidth = 1.19602f,
            ) {
                moveToRelative(363.5f, 639.6f)
                horizontalLineToRelative(22.5f)
                lineToRelative(14.2f, 3.6f)
                lineToRelative(19f, 2.4f)
                lineToRelative(5.9f, 2.4f)
                lineToRelative(-1.2f, 3.6f)
                lineToRelative(-21.3f, 6f)
                lineToRelative(-14.2f, 3.6f)
                lineToRelative(-8.3f, 1.2f)
                horizontalLineToRelative(-15.4f)
                lineToRelative(-13f, -7.2f)
                lineToRelative(-2.4f, -4.8f)
                lineToRelative(8.3f, -7.2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0A0A0A)),
                strokeLineWidth = 1.19602f,
            ) {
                moveToRelative(561.4f, 771.1f)
                lineToRelative(1.2f, 3.6f)
                lineToRelative(-8.3f, 24.1f)
                lineToRelative(-11.9f, 49.5f)
                lineToRelative(-4.7f, 12.1f)
                lineToRelative(-13f, 14.5f)
                lineToRelative(-8.3f, 8.4f)
                lineToRelative(-5.9f, 6f)
                lineToRelative(-2.4f, 1.2f)
                lineToRelative(3.6f, -10.9f)
                lineToRelative(15.4f, -33.8f)
                lineToRelative(14.2f, -31.4f)
                lineToRelative(16.6f, -35f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7F7F7)),
                strokeLineWidth = 1.19602f,
            ) {
                moveToRelative(191.6f, 392.1f)
                lineToRelative(4.7f, 2.4f)
                lineToRelative(7.1f, 8.4f)
                lineToRelative(10.7f, 8.4f)
                lineToRelative(4.7f, 4.8f)
                lineToRelative(-15.4f, 4.8f)
                lineToRelative(-9.5f, 6f)
                lineToRelative(-4.7f, 4.8f)
                horizontalLineToRelative(-2.4f)
                verticalLineToRelative(-9.7f)
                lineToRelative(1.2f, -3.6f)
                lineToRelative(2.4f, -20.5f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                strokeLineWidth = 1.19602f,
            ) {
                moveToRelative(376.5f, 646.8f)
                horizontalLineToRelative(29.6f)
                lineToRelative(10.7f, 2.4f)
                verticalLineToRelative(2.4f)
                lineToRelative(-16.6f, 4.8f)
                lineToRelative(-14.2f, 2.4f)
                horizontalLineToRelative(-17.8f)
                lineToRelative(-5.9f, -6f)
                lineToRelative(1.2f, -3.6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF3F3F3)),
                strokeLineWidth = 1.19602f,
            ) {
                moveToRelative(435.8f, 387.3f)
                lineToRelative(5.9f, 1.2f)
                lineToRelative(9.5f, 4.8f)
                verticalLineToRelative(1.2f)
                lineToRelative(-24.9f, 3.6f)
                lineToRelative(-23.7f, 9.7f)
                lineToRelative(-13f, 4.8f)
                lineToRelative(-1.2f, -2.4f)
                lineToRelative(7.1f, -4.8f)
                horizontalLineToRelative(2.4f)
                verticalLineToRelative(-2.4f)
                lineToRelative(15.4f, -9.7f)
                lineToRelative(13f, -4.8f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                strokeLineWidth = 1.19602f,
            ) {
                moveToRelative(369.4f, 674.6f)
                lineToRelative(24.9f, 2.4f)
                lineToRelative(7.1f, 3.6f)
                lineToRelative(3.6f, 4.8f)
                lineToRelative(-1.2f, 6f)
                lineToRelative(-7.1f, 4.8f)
                lineToRelative(-5.9f, -1.2f)
                lineToRelative(-9.5f, -8.4f)
                lineToRelative(-4.7f, -4.8f)
                lineToRelative(-7.1f, -4.8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF161616)),
                strokeLineWidth = 1.19602f,
            ) {
                moveToRelative(514f, 919.6f)
                lineToRelative(9.5f, 1.2f)
                verticalLineToRelative(1.2f)
                lineToRelative(-11.9f, 2.4f)
                lineToRelative(-13f, 10.9f)
                lineToRelative(-7.1f, 4.8f)
                lineToRelative(-3.6f, 1.2f)
                horizontalLineToRelative(-20.1f)
                lineToRelative(-1.2f, -4.8f)
                lineToRelative(42.7f, -14.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF171717)),
                strokeLineWidth = 1.19602f,
            ) {
                moveToRelative(444.1f, 394.5f)
                horizontalLineToRelative(10.7f)
                verticalLineToRelative(3.6f)
                lineToRelative(-29.6f, 7.2f)
                lineToRelative(-15.4f, 3.6f)
                lineToRelative(-16.6f, 7.2f)
                lineToRelative(-9.5f, 2.4f)
                lineToRelative(-4.7f, -1.2f)
                lineToRelative(20.1f, -9.7f)
                lineToRelative(24.9f, -9.7f)
                lineToRelative(11.9f, -2.4f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                strokeLineWidth = 1.19602f,
            ) {
                moveToRelative(376.5f, 762.7f)
                lineToRelative(2.4f, 1.2f)
                lineToRelative(5.9f, 22.9f)
                verticalLineToRelative(10.9f)
                lineToRelative(-3.6f, 12.1f)
                lineToRelative(-7.1f, 9.7f)
                horizontalLineToRelative(-3.6f)
                lineToRelative(4.7f, -6f)
                lineToRelative(2.4f, -10.9f)
                verticalLineToRelative(-29f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF121212)),
                strokeLineWidth = 1.19602f,
            ) {
                moveToRelative(407.3f, 916f)
                lineToRelative(8.3f, 2.4f)
                lineToRelative(15.4f, 9.7f)
                lineToRelative(9.5f, 6f)
                verticalLineToRelative(1.2f)
                horizontalLineTo(428.7f)
                lineToRelative(-5.9f, -3.6f)
                lineToRelative(-8.3f, -8.4f)
                lineToRelative(-4.7f, -2.4f)
                verticalLineToRelative(-2.4f)
                horizontalLineToRelative(-2.4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF232424)),
                strokeLineWidth = 1.19602f,
            ) {
                moveToRelative(478.4f, 471.8f)
                lineToRelative(1.2f, 2.4f)
                lineToRelative(-4.7f, 1.2f)
                verticalLineToRelative(4.8f)
                horizontalLineToRelative(-2.4f)
                verticalLineToRelative(-2.4f)
                lineToRelative(-13f, 3.6f)
                lineToRelative(-2.4f, 6f)
                horizontalLineToRelative(-1.2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-4.7f)
                verticalLineToRelative(-2.4f)
                lineToRelative(23.7f, -6f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                strokeLineWidth = 1.19602f,
            ) {
                moveToRelative(619.5f, 916f)
                lineToRelative(3.6f, 1.2f)
                verticalLineToRelative(2.4f)
                lineToRelative(-7.1f, 1.2f)
                lineToRelative(-23.7f, 1.2f)
                lineToRelative(-19f, -1.2f)
                verticalLineToRelative(-1.2f)
                lineToRelative(39.1f, -2.4f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                strokeLineWidth = 1.19602f,
            ) {
                moveToRelative(413.3f, 651.6f)
                lineToRelative(1.2f, 2.4f)
                lineToRelative(-26.1f, 7.2f)
                lineToRelative(-17.8f, -1.2f)
                verticalLineToRelative(-1.2f)
                lineToRelative(21.3f, -2.4f)
                lineToRelative(16.6f, -3.6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF181818)),
                strokeLineWidth = 1.19602f,
            ) {
                moveToRelative(402.6f, 644.4f)
                lineToRelative(16.6f, 1.2f)
                lineToRelative(5.9f, 2.4f)
                lineToRelative(-1.2f, 3.6f)
                lineToRelative(-2.4f, 1.2f)
                horizontalLineToRelative(-7.1f)
                lineToRelative(2.4f, -1.2f)
                verticalLineToRelative(-2.4f)
                lineToRelative(-10.7f, -1.2f)
                lineToRelative(-3.6f, -1.2f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                strokeLineWidth = 1.19602f,
            ) {
                moveToRelative(329.1f, 489.9f)
                lineToRelative(2.4f, 3.6f)
                lineToRelative(4.7f, 18.1f)
                lineToRelative(-1.2f, 19.3f)
                horizontalLineToRelative(-1.2f)
                lineToRelative(-1.2f, -16.9f)
                lineToRelative(-3.6f, -19.3f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                strokeLineWidth = 1.19602f,
            ) {
                moveToRelative(551.9f, 502f)
                horizontalLineToRelative(1.2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2.4f)
                lineToRelative(1.2f, -2.4f)
                lineToRelative(-1.2f, 14.5f)
                lineToRelative(-2.4f, -2.4f)
                lineToRelative(-2.4f, 2.4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF242424)),
                strokeLineWidth = 1.19602f,
            ) {
                moveToRelative(561.4f, 771.1f)
                lineToRelative(1.2f, 3.6f)
                lineToRelative(-5.9f, 18.1f)
                lineToRelative(-3.6f, -1.2f)
                lineToRelative(2.4f, -7.2f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                strokeLineWidth = 1.19602f,
            ) {
                moveToRelative(247.3f, 511.6f)
                horizontalLineToRelative(14.2f)
                lineToRelative(-1.2f, 2.4f)
                lineToRelative(-9.5f, 1.2f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                strokeLineWidth = 1.19602f,
            ) {
                moveToRelative(478.4f, 471.8f)
                lineToRelative(1.2f, 2.4f)
                lineToRelative(-4.7f, 1.2f)
                verticalLineToRelative(4.8f)
                horizontalLineToRelative(-2.4f)
                verticalLineToRelative(-2.4f)
                lineToRelative(-5.9f, -1.2f)
                lineToRelative(4.7f, -2.4f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                strokeLineWidth = 1.19602f,
            ) {
                moveToRelative(290f, 488.7f)
                lineToRelative(4.7f, 1.2f)
                lineToRelative(1.2f, 3.6f)
                lineToRelative(-7.1f, 2.4f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                strokeLineWidth = 1.19602f,
            ) {
                moveToRelative(619.5f, 916f)
                lineToRelative(3.6f, 1.2f)
                verticalLineToRelative(2.4f)
                horizontalLineToRelative(-13f)
                lineToRelative(2.4f, -2.4f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                strokeLineWidth = 1.19602f,
            ) {
                moveToRelative(451.2f, 479f)
                lineToRelative(10.7f, 1.2f)
                lineToRelative(-2.4f, 1.2f)
                lineToRelative(-2.4f, 6f)
                horizontalLineToRelative(-1.2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-4.7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3B3B3B)),
                strokeLineWidth = 1.19602f,
            ) {
                moveToRelative(407.3f, 916f)
                lineToRelative(8.3f, 2.4f)
                lineToRelative(-2.4f, 1.2f)
                lineToRelative(-1.2f, 2.4f)
                lineToRelative(-2.4f, -1.2f)
                verticalLineToRelative(-2.4f)
                horizontalLineToRelative(-2.4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF353636)),
                strokeLineWidth = 1.19602f,
            ) {
                moveToRelative(336.2f, 475.4f)
                horizontalLineToRelative(1.2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2.4f)
                lineToRelative(-2.4f, 6f)
                horizontalLineToRelative(-1.2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF111111)),
                strokeLineWidth = 1.19602f,
            ) {
                moveToRelative(554.3f, 790.4f)
                lineToRelative(1.2f, 4.8f)
                lineToRelative(-4.7f, 2.4f)
                lineToRelative(1.2f, -6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF111111)),
                strokeLineWidth = 1.19602f,
            ) {
                moveToRelative(719f, 368f)
                lineToRelative(2.4f, 2.4f)
                lineToRelative(-5.9f, 4.8f)
                lineToRelative(2.4f, -6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF151515)),
                strokeLineWidth = 1.02688f,
            ) {
                moveTo(656.2f, 386.2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF555555)),
                strokeLineWidth = 1.02688f,
            ) {
                moveTo(190.2f, 547.9f)
                close()
            }
            group(
                clipPathData = PathData {
                    moveToRelative(259f, 173.1f)
                    lineToRelative(3.7f, 21.1f)
                    lineToRelative(11.5f, 18.3f)
                    curveToRelative(0f, 0f, -9.5f, -8.5f, -9.9f, -2.5f)
                    curveToRelative(-0.7f, 9.3f, 18f, 19.9f, 18f, 19.9f)
                    lineToRelative(-16.4f, -5f)
                    curveToRelative(0f, 0f, -7.5f, 7.8f, -7.4f, 14.6f)
                    curveToRelative(0.1f, 15.2f, 22.3f, 39.4f, 22.3f, 39.4f)
                    curveToRelative(0f, 0f, 3.5f, -11.6f, 1.2f, -16.8f)
                    curveToRelative(-3.7f, -8.4f, -7.1f, -21.4f, -7.1f, -21.4f)
                    lineToRelative(18.3f, 23.6f)
                    curveToRelative(0f, 0f, 10.5f, 14.2f, 18f, 11.5f)
                    curveToRelative(1.4f, -0.5f, 3.1f, -2.5f, 3.1f, -2.5f)
                    lineToRelative(2.8f, -0.3f)
                    lineToRelative(-1.9f, -5.3f)
                    lineToRelative(17.1f, 16.4f)
                    lineToRelative(-15.5f, -22.6f)
                    lineToRelative(2.5f, -0.3f)
                    lineToRelative(-20.2f, -54.6f)
                    curveToRelative(0f, 0f, -6.4f, -7.5f, -16.8f, -9.6f)
                    curveToRelative(-10.9f, -2.2f, -23.3f, -23.9f, -23.3f, -23.9f)
                    close()
                    moveTo(0f, 0f)
                    moveToRelative(318.9f, 134f)
                    lineToRelative(-1.9f, 60.8f)
                    lineToRelative(2.2f, 31.6f)
                    lineToRelative(-8.4f, -12.7f)
                    lineToRelative(7.4f, 21.4f)
                    curveToRelative(0f, 0f, 9.1f, 9.3f, 14.6f, 12.4f)
                    curveToRelative(5.5f, 3.1f, 18.3f, 6.2f, 18.3f, 6.2f)
                    lineToRelative(-9.9f, -20.5f)
                    lineToRelative(30.1f, 41f)
                    lineToRelative(-7.4f, -17.1f)
                    lineToRelative(25.4f, 27.9f)
                    curveToRelative(0f, 0f, -36.5f, -48.3f, -47.6f, -72.3f)
                    curveToRelative(-11.1f, -24f, -22.8f, -78.8f, -22.8f, -78.8f)
                    close()
                    moveTo(0f, 0f)
                    moveToRelative(363.3f, 215f)
                    curveToRelative(0f, 0f, 1.4f, 18f, 6.5f, 24.8f)
                    curveToRelative(4.2f, 5.7f, 19.2f, 18.9f, 19.2f, 18.9f)
                    lineToRelative(-6.2f, -16.1f)
                    curveToRelative(0f, 0f, 10.3f, 10.1f, 19.9f, 14f)
                    curveToRelative(13.7f, 5.5f, 48.1f, 10.2f, 48.1f, 10.2f)
                    lineToRelative(-29.2f, -22f)
                    lineToRelative(15.2f, -0.3f)
                    lineToRelative(-16.8f, -33.8f)
                    curveToRelative(0f, 0f, 13f, 17.1f, 21.6f, 24.4f)
                    curveToRelative(8.5f, 7.3f, 29.6f, 19.4f, 29.6f, 19.4f)
                    lineToRelative(11.8f, -6.5f)
                    lineToRelative(-1.6f, -6.5f)
                    lineToRelative(31.3f, 5.6f)
                    curveToRelative(0f, 0f, -32.3f, -20.2f, -45.9f, -34.7f)
                    curveToRelative(-15.4f, -16.5f, -39.1f, -58f, -39.1f, -58f)
                    lineToRelative(2.8f, 16.4f)
                    curveToRelative(0f, 0f, -1.9f, 4.1f, -5f, 7.8f)
                    curveToRelative(-3.7f, 4.4f, -15.5f, 16.1f, -15.5f, 16.1f)
                    lineToRelative(-3.1f, -4.3f)
                    lineToRelative(-4.7f, 8.1f)
                    lineToRelative(0.6f, 20.5f)
                    curveToRelative(0f, 0f, -7.2f, -8.1f, -10.9f, -12.4f)
                    curveToRelative(-3.6f, -4.2f, -7.6f, -9.3f, -10.2f, -14.3f)
                    curveToRelative(-2.7f, -5.1f, -5.6f, -15.5f, -5.6f, -15.5f)
                    lineToRelative(-4f, 13f)
                    curveToRelative(0f, 0f, -2.8f, 9.3f, -3.1f, 14.9f)
                    curveToRelative(-0.3f, 5.7f, 1.6f, 18.6f, 1.6f, 18.6f)
                    close()
                    moveTo(0f, 0f)
                    moveToRelative(453.9f, 164.4f)
                    curveToRelative(0f, 0f, 4.5f, 28.5f, 9.3f, 37.8f)
                    curveToRelative(4.2f, 8.2f, 15.8f, 13f, 15.8f, 13f)
                    lineToRelative(0.9f, -3.1f)
                    lineToRelative(30.4f, 18f)
                    curveToRelative(0f, 0f, -24.2f, -18.3f, -34.1f, -30.1f)
                    curveTo(467.3f, 189.6f, 453.9f, 164.4f, 453.9f, 164.4f)
                    close()
                    moveTo(0f, 0f)
                    moveToRelative(486.4f, 150.2f)
                    curveToRelative(0f, 0f, 25.3f, 25.2f, 37.5f, 38.2f)
                    curveToRelative(9.7f, 10.3f, 28.5f, 31.6f, 28.5f, 31.6f)
                    lineToRelative(-1.2f, -6.8f)
                    curveToRelative(0f, 0f, 16.6f, 4.2f, 22f, -0.9f)
                    curveToRelative(3.4f, -3.3f, 0.9f, -13.3f, 0.9f, -13.3f)
                    lineToRelative(11.5f, -5.6f)
                    lineToRelative(5.6f, 14.3f)
                    lineToRelative(-0.9f, -13.3f)
                    curveToRelative(0f, 0f, -5.7f, -12.2f, -9.9f, -17.4f)
                    curveToRelative(-4.8f, -5.8f, -10.4f, -11.4f, -17.1f, -14.9f)
                    curveToRelative(-2.7f, -1.4f, -9f, -2.2f, -9f, -2.2f)
                    lineToRelative(-14f, 0.6f)
                    lineToRelative(9.3f, 9.6f)
                    lineToRelative(-18.6f, -3.4f)
                    lineToRelative(0.9f, 4.7f)
                    curveToRelative(0f, 0f, -10.1f, -7.2f, -15.8f, -9.3f)
                    curveToRelative(-4.2f, -1.5f, -9.1f, -0.6f, -13.3f, -2.2f)
                    curveToRelative(-6f, -2.1f, -16.4f, -9.6f, -16.4f, -9.6f)
                    close()
                    moveTo(0f, 0f)
                    moveToRelative(569f, 144.9f)
                    curveToRelative(0f, 0f, 16.4f, 19f, 23.6f, 29.2f)
                    curveToRelative(5.8f, 8.2f, 15.8f, 25.7f, 15.8f, 25.7f)
                    curveToRelative(0f, 0f, 1.9f, -19.2f, -2.8f, -30.1f)
                    curveToRelative(-2.8f, -6.6f, -15.8f, -22f, -15.8f, -22f)
                    lineToRelative(-10.5f, 3.1f)
                    close()
                    moveTo(0f, 0f)
                    moveToRelative(531.7f, 307.1f)
                    lineToRelative(3.4f, 10.9f)
                    lineToRelative(-0.9f, 3.4f)
                    lineToRelative(7.8f, 14.9f)
                    lineToRelative(-10.2f, -9.3f)
                    lineToRelative(3.7f, 8.7f)
                    lineToRelative(-3.1f, -0.3f)
                    lineToRelative(11.2f, 15.8f)
                    lineToRelative(0.3f, -6.5f)
                    lineToRelative(4.7f, 2.8f)
                    lineToRelative(2.8f, -1.6f)
                    lineToRelative(3.4f, 5.9f)
                    lineToRelative(3.1f, -3.1f)
                    lineToRelative(0f, -5.9f)
                    lineToRelative(2.2f, -4f)
                    lineToRelative(0.3f, -3.7f)
                    lineToRelative(-5.6f, -10.9f)
                    lineToRelative(-4f, -2.8f)
                    lineToRelative(-3.4f, 2.8f)
                    close()
                }
            ) {
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(355.5f, 169.6f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(356.4f, 204.6f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(357.2f, 241.6f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(357.6f, 275.8f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(387.9f, 189.7f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(387.7f, 224.1f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(389.8f, 258.7f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(419.5f, 207f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(422.1f, 241.4f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(422.6f, 278.7f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(447.7f, 185.7f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(450f, 224f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(451.6f, 259.1f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(454f, 294.6f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(321.6f, 154.9f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(323.5f, 190.2f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(324.9f, 226.1f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(325.2f, 261.5f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(481.3f, 276f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(543.6f, 312.8f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(391f, 294.7f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(394f, 329.2f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(359.9f, 311.4f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(423.3f, 312.2f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(325.8f, 296.6f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(296f, 281.6f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(298.4f, 321.5f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(331.3f, 335.4f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(260.7f, 194.1f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(456.1f, 330.1f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(545.2f, 348.1f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(606.7f, 275.2f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(604.3f, 237.9f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(484.5f, 312.2f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(541.7f, 275.9f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(511.4f, 259.8f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(541f, 238.9f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(538f, 203.7f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(568.7f, 181.3f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(538.3f, 162.7f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(597.5f, 157.9f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(418.4f, 170.2f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(261.6f, 228.7f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(294.8f, 209.9f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(572.3f, 220.9f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(602.1f, 203.1f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(573f, 258.2f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(576f, 297.6f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(290.8f, 174.7f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(264.8f, 263.5f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(294.7f, 243.1f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(512.4f, 295.9f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(481.1f, 241.3f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(479.6f, 205.4f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(508.1f, 181.6f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
                path(
                    fill = SolidColor(Color.White),
                    strokeLineWidth = 6.2f,
                ) {
                    moveTo(510f, 223.9f)
                    moveToRelative(-14.3f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, 28.6f, 0f)
                    arcToRelative(14.6f, 14.3f, 90f, isMoreThanHalf = true, isPositiveArc = true, -28.6f, 0f)
                }
            }
            path(
                fill = SolidColor(Color.White),
                strokeLineWidth = 5.51812f,
            ) {
                moveToRelative(139.5f, 221.6f)
                lineToRelative(-28.5f, 96.5f)
                lineToRelative(0.9f, 125.5f)
                lineToRelative(5.3f, 34.2f)
                lineToRelative(-1.8f, -57.5f)
                lineToRelative(1.8f, -29.4f)
                lineToRelative(-5.3f, -39.5f)
                lineToRelative(16.2f, -75f)
                lineToRelative(4.8f, 32.9f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                strokeLineWidth = 5.51812f,
            ) {
                moveToRelative(146.5f, 240.9f)
                curveToRelative(0f, 0f, -0.1f, -47.2f, 8.8f, -68.9f)
                curveToRelative(7.4f, -18.2f, 20.6f, -32.9f, 34.2f, -47.4f)
                curveToRelative(15.9f, -16.9f, 54.4f, -45.2f, 54.4f, -45.2f)
                lineToRelative(27.6f, -15.4f)
                lineToRelative(-29.8f, 25.9f)
                curveToRelative(0f, 0f, -6.6f, 12.7f, -8.8f, 20.2f)
                curveToRelative(-2.8f, 9.6f, -4.8f, 30.7f, -4.8f, 30.7f)
                curveToRelative(0f, 0f, 11.1f, -37.3f, 21.9f, -53.1f)
                curveToRelative(5.8f, -8.4f, 22.4f, -21.1f, 22.4f, -21.1f)
                curveToRelative(0f, 0f, 9.5f, -0.9f, 14.5f, -3.1f)
                curveToRelative(7.9f, -3.4f, 11.3f, -9.9f, 18.9f, -13.6f)
                curveToRelative(10.9f, -5.3f, 36.9f, -11.8f, 36.9f, -11.8f)
                lineToRelative(-39.5f, 7.9f)
                lineToRelative(-62.3f, 32f)
                curveToRelative(0f, 0f, -33.4f, 21f, -49.1f, 36f)
                curveToRelative(-14.3f, 13.6f, -31.9f, 29.9f, -40.8f, 48.7f)
                curveToRelative(-3.5f, 7.3f, -7f, 25.9f, -7f, 25.9f)
                lineToRelative(0.4f, 17.5f)
                close()
            }
        }.build()

        return _CustomMoroganHuman!!
    }

@Suppress("ObjectPropertyName")
private var _CustomMoroganHuman: ImageVector? = null

@Preview
@Composable
private fun CustomMoroganHumanPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = BuildInCustomSenderAvatar.CustomMoroganHuman, contentDescription = null)
    }
}
