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
                    moveToRelative(278.5f, 156.2f)
                    curveToRelative(0f, 0f, -3.7f, 62.2f, 27.3f, 98.5f)
                    curveToRelative(32.7f, 38.4f, 92.6f, 97.5f, 92.6f, 97.5f)
                    lineToRelative(17f, -88.1f)
                    lineToRelative(49f, 91.2f)
                    lineToRelative(54.4f, -78.2f)
                    lineToRelative(30.2f, 95.1f)
                    curveToRelative(0f, 0f, 69.9f, -100.3f, 69.9f, -108.8f)
                    curveToRelative(0f, -8.5f, -18.1f, -96.4f, -18.1f, -96.4f)
                    curveToRelative(0f, 0f, -34.5f, 18.3f, -73.4f, 7.6f)
                    curveToRelative(-41.1f, -11.3f, -83.1f, 25f, -114.3f, 12f)
                    curveToRelative(-64.9f, -27.2f, -134.6f, -30.5f, -134.6f, -30.5f)
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
                    moveTo(293.3f, 208.6f)
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
