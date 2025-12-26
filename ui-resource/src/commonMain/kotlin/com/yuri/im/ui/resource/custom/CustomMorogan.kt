package com.yuri.im.ui.resource.custom

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
import com.yuri.im.ui.resource.BuildInCustomSenderAvatar
import androidx.compose.ui.tooling.preview.Preview

public val BuildInCustomSenderAvatar.CustomMorogan: ImageVector
    get() {
        if (_customMorogan != null) {
            return _customMorogan!!
        }
        _customMorogan = ImageVector.Builder(
            name = "CustomMorogan",
            defaultWidth = 256.dp,
            defaultHeight = 256.dp,
            viewportWidth = 739.48f,
            viewportHeight = 739.48f,
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(517.31f, 4.74f)
                curveToRelative(2.08f, -1.13f, 4.62f, -2.61f, 6.74f, -3.55f)
                curveToRelative(21.45f, 35.28f, 46.31f, 68.57f, 68.46f, 103.47f)
                curveToRelative(9.88f, 15.72f, 18.76f, 32.17f, 28.53f, 47.94f)
                curveToRelative(2.86f, 4.62f, 11.1f, 9.84f, 15.21f, 13.68f)
                curveToRelative(13.21f, 12.3f, 22.73f, 27.04f, 33.3f, 41.5f)
                curveToRelative(3.41f, 4.67f, 7.99f, 10.02f, 10.95f, 14.92f)
                curveToRelative(25.15f, 41.6f, 41.11f, 88.04f, 46.8f, 136.24f)
                curveToRelative(1.68f, 14.99f, 2.21f, 25.73f, 0.93f, 40.94f)
                curveToRelative(-0.14f, 5.76f, -2.98f, 12.56f, -3.68f, 17.96f)
                curveToRelative(-0.36f, 7.11f, -7.46f, 10.84f, -9.35f, 16.39f)
                curveToRelative(-2.93f, 8.61f, -4.65f, 18.75f, -8.93f, 27f)
                curveToRelative(-4.38f, 8.42f, -9.61f, 17.99f, -14.67f, 26.03f)
                curveToRelative(-4.49f, 7.13f, -11.39f, 14.11f, -16.66f, 20.74f)
                curveToRelative(-4.37f, 4.83f, -10.53f, 12.6f, -14.99f, 16.88f)
                curveToRelative(-16.88f, 16.2f, -35.35f, 30.94f, -55.6f, 42.79f)
                curveToRelative(-9.59f, 5.61f, -20.17f, 10.39f, -29.97f, 15.79f)
                curveToRelative(0.92f, 1.48f, 1.75f, 2.9f, 2.86f, 4.24f)
                curveToRelative(6.77f, -0.16f, 13.24f, -0.86f, 19.81f, -1.05f)
                curveToRelative(0.03f, 4.78f, 0.21f, 10.78f, -0.12f, 15.46f)
                curveToRelative(6.89f, -0.66f, 17.5f, -1.43f, 24.12f, -2.58f)
                curveToRelative(-2.48f, 3.78f, -5.96f, 10.89f, -8.15f, 13.83f)
                curveToRelative(8.33f, 1.83f, 82.73f, 126.15f, 82.73f, 126.15f)
                curveToRelative(-176.15f, 0.57f, -412.83f, 0.09f, -588.97f, -0.17f)
                curveToRelative(0f, 0f, 121.97f, -173.23f, 108.6f, -180.16f)
                curveToRelative(-3.95f, -2.05f, -7.46f, -5.09f, -11.12f, -7.5f)
                curveToRelative(-14.38f, -9.46f, -25.98f, -22.17f, -38.75f, -33.54f)
                curveToRelative(-3.02f, -2.69f, -10.01f, -4.94f, -11.83f, -8.35f)
                curveToRelative(-12.92f, -24.17f, -23.12f, -49.43f, -31.17f, -75.62f)
                curveToRelative(-2.38f, -7.74f, -3.9f, -15.57f, -5.77f, -23.43f)
                curveToRelative(-6.14f, -24.26f, -10.27f, -50f, -9.54f, -75.07f)
                curveToRelative(0.41f, -14.01f, 4.2f, -30.89f, 4.71f, -44.81f)
                lineTo(55.71f, 248.33f)
                curveTo(44.76f, 240.18f, 33.68f, 232.06f, 22.78f, 223.84f)
                curveTo(16.59f, 219.18f, 9.79f, 210.62f, 3.75f, 205.92f)
                curveToRelative(8.05f, -3f, 16.96f, -4.95f, 25.08f, -7.58f)
                curveToRelative(23.64f, -7.67f, 46.93f, -13.02f, 71.49f, -16.75f)
                curveToRelative(9.51f, -1.45f, 19.35f, -3.81f, 28.97f, -4.81f)
                curveToRelative(15.42f, -1.36f, 31.54f, -1.85f, 47.02f, -3.14f)
                curveToRelative(5.94f, -0.49f, 14.22f, -0.67f, 19.91f, -1.57f)
                curveToRelative(3.89f, -3.67f, 8.67f, -8.34f, 12.89f, -11.66f)
                curveToRelative(27.9f, -22f, 60.35f, -35f, 93.96f, -45.67f)
                curveToRelative(5.14f, -1.63f, 15.92f, -4.3f, 21.2f, -5.5f)
                curveToRelative(10.21f, -2.32f, 25.16f, -6.91f, 35.1f, -8.38f)
                curveToRelative(30.37f, -4.46f, 60.17f, -7.04f, 90.9f, -5.6f)
                curveToRelative(10.74f, 0.5f, 25.48f, 2.36f, 36.25f, 3.8f)
                curveToRelative(1.26f, -1.45f, 4.9f, -5.5f, 5.35f, -7.14f)
                curveToRelative(7.2f, -25.87f, 14.55f, -51.87f, 23.57f, -77.19f)
                curveToRelative(1.06f, -2.98f, 1.41f, -6.84f, 1.87f, -10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(429.15f, 615.33f)
                curveToRelative(9.83f, 1.29f, 20.62f, 0.43f, 30.4f, 1.04f)
                curveToRelative(32.76f, 2.07f, 64.64f, -1.51f, 96.37f, -9.69f)
                curveToRelative(7.01f, -1.81f, 14.58f, -2.68f, 21.62f, -4.39f)
                curveToRelative(-3.21f, 5.98f, -7.96f, 18.08f, -13.17f, 20.88f)
                horizontalLineTo(451.78f)
                curveToRelative(-6.3f, -2.25f, -17.03f, -5.4f, -22.63f, -7.85f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(307.71f, 240.79f)
                curveToRelative(0.91f, -0.09f, 1.82f, -0.13f, 2.73f, -0.12f)
                curveToRelative(58.26f, 0.96f, 96.41f, 58.64f, 113.8f, 107.61f)
                curveToRelative(13.41f, 37.74f, 22.97f, 73.09f, 20.51f, 113.49f)
                curveToRelative(-2.14f, 35.09f, -22.61f, 54.46f, -58f, 53.04f)
                curveToRelative(-14.55f, -0.82f, -39.95f, -9.94f, -51.02f, -19.34f)
                curveToRelative(-21.96f, -18.64f, -41.46f, -47.46f, -56.88f, -71.99f)
                curveToRelative(-14.81f, -23.57f, -23.62f, -58.03f, -28.43f, -85.15f)
                curveToRelative(-2.36f, -13.31f, -1.45f, -32.62f, 1.43f, -45.94f)
                curveToRelative(2.81f, -9.97f, 10.39f, -25.83f, 16.29f, -34.2f)
                curveToRelative(6.92f, -9.83f, 27.92f, -15.94f, 39.57f, -17.4f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(318.81f, 284.83f)
                curveToRelative(46.23f, -2.92f, 84.59f, 69.47f, 91.57f, 107.19f)
                curveToRelative(4.67f, 25.25f, 7.33f, 69.34f, -25.92f, 75.73f)
                curveToRelative(-12.59f, 1.56f, -24.82f, -3.89f, -34.82f, -11.25f)
                curveToRelative(-31.53f, -23.74f, -52.17f, -64.28f, -58.74f, -102.44f)
                curveToRelative(-4.09f, -23.77f, -2.58f, -64.7f, 27.91f, -69.23f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(325.03f, 299.75f)
                curveToRelative(24.05f, -1.22f, 43.75f, 23.9f, 55.11f, 42.25f)
                curveToRelative(9.49f, 15.32f, 16.6f, 33.2f, 20.5f, 50.77f)
                curveToRelative(4.32f, 19.48f, 7f, 57.59f, -18.77f, 62.99f)
                curveToRelative(-34.68f, 2.46f, -64.18f, -52.79f, -72.3f, -80.46f)
                curveToRelative(-6.06f, -20.67f, -14.44f, -69.16f, 15.47f, -75.55f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(327.84f, 327.14f)
                curveToRelative(0.63f, -0.05f, 1.26f, -0.08f, 1.88f, -0.09f)
                curveToRelative(14.5f, -0.22f, 22.56f, 14.18f, 28.82f, 24.8f)
                curveToRelative(10.94f, 18.55f, 19.3f, 38.66f, 22.65f, 60f)
                curveToRelative(0.84f, 5.36f, 1.93f, 10.3f, 1.97f, 15.75f)
                curveToRelative(-2.09f, 2.39f, -3.33f, 3.29f, -5.98f, 4.96f)
                curveToRelative(-2.45f, 0.75f, -4.75f, 1.26f, -7.32f, 0.8f)
                curveToRelative(-8.92f, -1.58f, -15.89f, -10.89f, -20.71f, -17.87f)
                curveToRelative(-11.27f, -16.31f, -29.69f, -63.24f, -25.94f, -82.17f)
                curveToRelative(0.59f, -3f, 2.17f, -4.57f, 4.63f, -6.19f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(700.02f, 446.42f)
                lineToRelative(0.35f, 0.33f)
                curveToRelative(-0.3f, 4.78f, -4.76f, 15.68f, -6.62f, 20.38f)
                curveToRelative(-8.14f, 20.68f, -21.22f, 35.98f, -36.53f, 51.66f)
                curveToRelative(-14.4f, 14.74f, -28.6f, 27.55f, -46.57f, 38.02f)
                curveToRelative(-14.13f, 9.42f, -29.64f, 16.03f, -44.75f, 23.49f)
                curveToRelative(-19.92f, 9.82f, -41.01f, 13.68f, -62.56f, 18.54f)
                curveToRelative(-9.16f, 2.07f, -20.67f, 5.22f, -29.84f, 6.15f)
                curveToRelative(-20.5f, 2.1f, -41.1f, 1.04f, -61.6f, -0.42f)
                curveToRelative(-34.85f, -1.53f, -67.49f, -6.41f, -97.59f, -25.19f)
                curveToRelative(-4.77f, -2.98f, -11.11f, -5.52f, -16.14f, -8.5f)
                curveToRelative(-5.8f, -3.43f, -10.01f, -8.73f, -16.81f, -10.25f)
                lineToRelative(-0.52f, -0.11f)
                curveToRelative(-4.63f, -1.02f, -10.48f, -2.48f, -15.09f, -2.83f)
                curveToRelative(3.38f, -2.41f, 5.97f, -4.13f, 9.54f, -6.26f)
                lineTo(249.94f, 542.77f)
                curveToRelative(2.42f, -0.32f, 7.6f, -0.21f, 8.8f, -2.21f)
                curveToRelative(-0.3f, -1.54f, -1.74f, -2.51f, -3f, -3.65f)
                curveToRelative(3.72f, 0.5f, 8.73f, 1.34f, 12.41f, 2.06f)
                curveToRelative(11.46f, 2.26f, 22.57f, 1.72f, 34.2f, 2.38f)
                curveToRelative(9.86f, 0.57f, 20.47f, 1.84f, 30.28f, 2.02f)
                curveToRelative(54.64f, 0.99f, 110.17f, -5.47f, 163.63f, -16.62f)
                curveToRelative(11.96f, -2.49f, 24.7f, -4.93f, 36.55f, -7.8f)
                curveToRelative(9.07f, -2.2f, 19.02f, -5.43f, 28.15f, -7.91f)
                curveToRelative(23.92f, -6.51f, 49.38f, -14.36f, 72.14f, -24.13f)
                curveToRelative(24.43f, -10.48f, 45.39f, -25.31f, 66.92f, -40.48f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(642.26f, 512.7f)
                curveToRelative(3.08f, 4.55f, -7.96f, 16.81f, -11.17f, 19.31f)
                curveToRelative(-11.06f, 8.61f, -30.95f, 17.96f, -44.86f, 13.22f)
                curveToRelative(-9.54f, 19.03f, -50.5f, 30.72f, -68.45f, 19.39f)
                curveToRelative(-3.62f, -2.29f, -8.49f, -6.32f, -12f, -9.03f)
                curveToRelative(-0.22f, -0.57f, -0.14f, -0.28f, 0.11f, -1.07f)
                curveToRelative(2.11f, -0.71f, 28.99f, 10.84f, 37.25f, 9.31f)
                curveToRelative(13.21f, -2.44f, 19.65f, -6.32f, 29.69f, -15.83f)
                curveToRelative(3.72f, -3.52f, 7.2f, -5.94f, 10.13f, -10.43f)
                curveToRelative(0.33f, -0.51f, 2.55f, -2.55f, 2.96f, -2.49f)
                curveToRelative(6.08f, 0.93f, 11.23f, 5.28f, 17.9f, 4.25f)
                curveToRelative(19.92f, -2.86f, 27.15f, -13.1f, 38.45f, -26.65f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(605.68f, 188.73f)
                curveToRelative(2.46f, -0.27f, 10.08f, 1.8f, 12.42f, 3.08f)
                curveToRelative(21.44f, 12.62f, 39.62f, 42.38f, 49.75f, 64.81f)
                curveToRelative(12.92f, 30.87f, 22.83f, 64.32f, 26.05f, 97.69f)
                curveToRelative(1.81f, 18.77f, 2.01f, 40.97f, -5.89f, 58.13f)
                curveToRelative(-2.58f, 1.7f, -4.16f, 2.55f, -6.95f, 3.92f)
                curveToRelative(-0.88f, -0.13f, -3.68f, -0.56f, -4.4f, -0.79f)
                curveToRelative(-14.49f, -4.74f, -26.76f, -28.4f, -33.85f, -40.53f)
                lineToRelative(-2.68f, -4.81f)
                curveToRelative(6.17f, 5.65f, 10.61f, 8.87f, 18.65f, 11.1f)
                curveToRelative(9.61f, -3.77f, 14.79f, -8.95f, 15.32f, -19.57f)
                curveToRelative(1.5f, -30.67f, -7.99f, -61.94f, -20.93f, -89.49f)
                curveToRelative(-7.28f, -15.49f, -13.92f, -30.55f, -33.46f, -31.9f)
                curveToRelative(-2.76f, 1.04f, -4.14f, 1.74f, -6.18f, 3.92f)
                curveToRelative(-1.87f, 1.98f, -3.19f, 4.41f, -3.84f, 7.05f)
                curveToRelative(-1.09f, 4.65f, 0.3f, 26.34f, 0.54f, 32.07f)
                curveToRelative(-1.38f, -4.39f, -2.76f, -11.95f, -3.91f, -16.68f)
                curveToRelative(-5.61f, -23.01f, -8.65f, -44.88f, -9.17f, -68.55f)
                curveToRelative(2.73f, -4.64f, 4.04f, -6.49f, 8.52f, -9.43f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(70.26f, 212.12f)
                curveToRelative(3.18f, -0.54f, 13.94f, 0.54f, 17.55f, 0.86f)
                lineToRelative(31.7f, 3.08f)
                curveToRelative(17.72f, 1.63f, 35.42f, 3.44f, 53.11f, 5.43f)
                curveToRelative(6.54f, 0.76f, 16.57f, 1.79f, 22.87f, 3.16f)
                curveToRelative(3.63f, 0.79f, 13.97f, 7.77f, 18.27f, 10.18f)
                curveToRelative(-11.07f, 7.69f, -22.17f, 15.65f, -33.19f, 23.34f)
                curveToRelative(-11.68f, 8.15f, -32.99f, 5.98f, -46.19f, 3.51f)
                curveToRelative(4.86f, -3.02f, 11.1f, -6.97f, 16.1f, -9.54f)
                curveToRelative(-5.53f, -1.59f, -12.31f, -2.99f, -17.95f, -4.27f)
                curveToRelative(4.79f, -1.69f, 12.07f, -4.01f, 16.53f, -6.02f)
                curveToRelative(5.06f, 1.21f, 9.41f, 2.58f, 14.39f, 4.16f)
                curveToRelative(-9.34f, -8.12f, -25.74f, -21.01f, -38.63f, -21.4f)
                curveToRelative(-3.08f, -0.26f, -5.3f, -0.64f, -8.3f, -1.19f)
                curveToRelative(5.39f, 4.3f, 13.12f, 9.56f, 18.85f, 13.74f)
                curveToRelative(-9.62f, 3.54f, -19.61f, 7.89f, -29.24f, 11.09f)
                curveToRelative(6.29f, 2.09f, 13.09f, 4.07f, 19.46f, 6.03f)
                curveToRelative(-2.52f, 2.93f, -5.28f, 6.66f, -7.69f, 9.77f)
                curveToRelative(12.9f, 5.98f, 22.48f, 9.9f, 35.98f, 14.39f)
                curveToRelative(-2.2f, 1.78f, -4.73f, 4.16f, -6.88f, 6.07f)
                curveToRelative(-4.2f, -2.43f, -7.4f, -3.96f, -11.83f, -6f)
                curveToRelative(1.65f, 3.23f, 2.42f, 4.87f, 3.66f, 8.34f)
                lineToRelative(-7.21f, 0.44f)
                curveToRelative(-2.66f, -3.91f, -8.94f, -14.6f, -11.63f, -17.4f)
                curveToRelative(-18.29f, -19.01f, -42.85f, -33.56f, -66.19f, -45.67f)
                curveToRelative(-5.24f, -2.72f, -11.49f, -6.1f, -16.81f, -8.19f)
                curveToRelative(7.37f, -1.49f, 25.43f, -3.16f, 33.26f, -3.9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(631.13f, 255.33f)
                lineToRelative(1.11f, 0.01f)
                curveToRelative(1.65f, 0.88f, 4.35f, 2.69f, 5.41f, 4.31f)
                curveToRelative(17.66f, 27.01f, 30.06f, 62.31f, 29f, 94.81f)
                curveToRelative(-0.23f, 7.15f, -2.44f, 12.6f, -9.04f, 15.15f)
                curveToRelative(-6.64f, -2.88f, -9.9f, -5.75f, -13.13f, -11.9f)
                curveToRelative(-2.26f, -3.77f, -4.05f, -6.19f, -6.71f, -9.72f)
                curveToRelative(1.84f, -0.42f, 2.76f, -0.83f, 4.46f, -1.53f)
                curveToRelative(3.73f, 6.41f, 6.72f, 13.1f, 15.5f, 10.25f)
                curveToRelative(2.08f, -19.96f, -5.26f, -41.88f, -12.65f, -60.17f)
                curveToRelative(-4.2f, -10.39f, -7.61f, -21.03f, -13.62f, -30.61f)
                curveToRelative(-1.48f, -2.35f, -4.37f, -6.79f, -3.98f, -9.49f)
                curveToRelative(0.94f, -0.86f, 2.35f, -0.9f, 3.67f, -1.12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(364.31f, 128.99f)
                curveToRelative(2.22f, -0.6f, 4.59f, 0.04f, 6.2f, 1.67f)
                curveToRelative(1.61f, 1.63f, 2.21f, 4f, 1.57f, 6.19f)
                curveToRelative(-0.64f, 2.19f, -2.43f, 3.87f, -4.67f, 4.39f)
                curveToRelative(-3.38f, 0.78f, -6.76f, -1.28f, -7.6f, -4.62f)
                curveToRelative(-0.84f, -3.34f, 1.16f, -6.74f, 4.5f, -7.64f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(308.48f, 166.01f)
                curveToRelative(2.26f, -0.55f, 4.65f, 0.18f, 6.21f, 1.89f)
                curveToRelative(1.56f, 1.71f, 2.06f, 4.14f, 1.29f, 6.33f)
                curveToRelative(-0.77f, 2.18f, -2.68f, 3.78f, -4.98f, 4.15f)
                curveToRelative(-1.95f, 0.32f, -3.93f, -0.29f, -5.37f, -1.63f)
                curveToRelative(-1.44f, -1.34f, -2.17f, -3.27f, -1.98f, -5.22f)
                curveToRelative(0.26f, -2.67f, 2.2f, -4.89f, 4.82f, -5.52f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(289.76f, 166.02f)
                curveToRelative(3.39f, -0.85f, 6.84f, 1.18f, 7.71f, 4.55f)
                curveToRelative(0.87f, 3.37f, -1.16f, 6.8f, -4.55f, 7.68f)
                curveToRelative(-2.01f, 0.52f, -4.15f, 0.04f, -5.73f, -1.3f)
                curveToRelative(-1.58f, -1.34f, -2.4f, -3.36f, -2.2f, -5.41f)
                curveToRelative(0.26f, -2.65f, 2.17f, -4.86f, 4.77f, -5.51f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(233.83f, 166.01f)
                curveToRelative(1.89f, -0.46f, 3.9f, -0.03f, 5.43f, 1.17f)
                curveToRelative(1.53f, 1.2f, 2.43f, 3.03f, 2.42f, 4.97f)
                curveToRelative(-0f, 2.87f, -1.95f, 5.37f, -4.74f, 6.1f)
                curveToRelative(-3.42f, 0.89f, -6.91f, -1.16f, -7.77f, -4.56f)
                curveToRelative(-0.86f, -3.4f, 1.23f, -6.85f, 4.66f, -7.68f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(252.53f, 166f)
                curveToRelative(2.26f, -0.53f, 4.63f, 0.21f, 6.18f, 1.93f)
                curveToRelative(1.55f, 1.72f, 2.03f, 4.13f, 1.26f, 6.31f)
                curveToRelative(-0.77f, 2.17f, -2.67f, 3.76f, -4.96f, 4.13f)
                curveToRelative(-1.91f, 0.31f, -3.86f, -0.26f, -5.29f, -1.55f)
                curveToRelative(-1.43f, -1.29f, -2.2f, -3.16f, -2.07f, -5.08f)
                curveToRelative(0.18f, -2.77f, 2.16f, -5.1f, 4.89f, -5.74f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(271.14f, 166.02f)
                curveToRelative(2.24f, -0.54f, 4.61f, 0.16f, 6.17f, 1.85f)
                curveToRelative(1.57f, 1.69f, 2.09f, 4.08f, 1.36f, 6.26f)
                curveToRelative(-0.73f, 2.18f, -2.59f, 3.79f, -4.86f, 4.21f)
                curveToRelative(-3.38f, 0.63f, -6.65f, -1.53f, -7.37f, -4.87f)
                curveToRelative(-0.72f, -3.34f, 1.36f, -6.64f, 4.7f, -7.45f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(326.33f, 129.19f)
                curveToRelative(3.28f, -1.27f, 6.97f, 0.36f, 8.22f, 3.63f)
                curveToRelative(1.25f, 3.27f, -0.41f, 6.92f, -3.7f, 8.15f)
                curveToRelative(-2.11f, 0.78f, -4.47f, 0.4f, -6.22f, -1.01f)
                curveToRelative(-1.75f, -1.41f, -2.61f, -3.63f, -2.27f, -5.84f)
                curveToRelative(0.34f, -2.23f, 1.86f, -4.11f, 3.97f, -4.93f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(251.91f, 203.24f)
                curveToRelative(2.18f, -0.74f, 4.6f, -0.24f, 6.31f, 1.3f)
                curveToRelative(1.71f, 1.54f, 2.44f, 3.88f, 1.91f, 6.11f)
                curveToRelative(-0.53f, 2.23f, -2.24f, 4f, -4.46f, 4.62f)
                curveToRelative(-1.95f, 0.54f, -4.05f, 0.13f, -5.64f, -1.12f)
                curveToRelative(-1.59f, -1.25f, -2.49f, -3.18f, -2.41f, -5.19f)
                curveToRelative(0.1f, -2.61f, 1.81f, -4.88f, 4.29f, -5.72f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(345.73f, 129.03f)
                curveToRelative(2.68f, -0.68f, 5.49f, 0.44f, 6.95f, 2.77f)
                curveToRelative(1.46f, 2.33f, 1.23f, 5.33f, -0.56f, 7.42f)
                curveToRelative(-0.85f, 0.98f, -1.97f, 1.68f, -3.23f, 2f)
                curveToRelative(-2.31f, 0.59f, -4.76f, -0.16f, -6.34f, -1.93f)
                curveToRelative(-1.11f, -1.26f, -1.68f, -2.9f, -1.57f, -4.57f)
                curveToRelative(0.18f, -2.72f, 2.1f, -5.02f, 4.75f, -5.69f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(205.38f, 184.7f)
                curveToRelative(2.38f, -0.74f, 4.97f, -0.03f, 6.63f, 1.82f)
                curveToRelative(1.66f, 1.85f, 2.07f, 4.49f, 1.05f, 6.75f)
                curveToRelative(-0.78f, 1.74f, -2.32f, 3.03f, -4.17f, 3.52f)
                curveToRelative(-3.33f, 0.87f, -6.75f, -1.06f, -7.7f, -4.34f)
                curveToRelative(-0.95f, -3.29f, 0.91f, -6.73f, 4.19f, -7.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(280f, 184.7f)
                curveToRelative(2.44f, -0.78f, 5.12f, -0.01f, 6.77f, 1.93f)
                curveToRelative(1.65f, 1.95f, 1.96f, 4.69f, 0.78f, 6.96f)
                curveToRelative(-0.92f, 1.76f, -2.61f, 2.98f, -4.57f, 3.31f)
                curveToRelative(-3.28f, 0.55f, -6.42f, -1.51f, -7.2f, -4.72f)
                curveToRelative(-0.78f, -3.21f, 1.06f, -6.47f, 4.22f, -7.48f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(242.54f, 184.76f)
                curveToRelative(2.16f, -0.74f, 4.57f, -0.27f, 6.27f, 1.25f)
                curveToRelative(1.71f, 1.51f, 2.46f, 3.83f, 1.97f, 6.05f)
                curveToRelative(-0.5f, 2.22f, -2.16f, 4f, -4.36f, 4.66f)
                curveToRelative(-3.3f, 0.98f, -6.78f, -0.83f, -7.84f, -4.09f)
                curveToRelative(-1.06f, -3.25f, 0.7f, -6.75f, 3.95f, -7.87f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(561.2f, 110.32f)
                curveToRelative(3.4f, -0.38f, 6.49f, 2.01f, 6.96f, 5.38f)
                curveToRelative(0.47f, 3.37f, -1.84f, 6.5f, -5.22f, 7.06f)
                curveToRelative(-2.27f, 0.38f, -4.56f, -0.5f, -5.99f, -2.29f)
                curveToRelative(-1.43f, -1.79f, -1.77f, -4.21f, -0.88f, -6.32f)
                curveToRelative(0.88f, -2.11f, 2.85f, -3.58f, 5.14f, -3.83f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(167.84f, 184.77f)
                curveToRelative(2.15f, -0.75f, 4.55f, -0.3f, 6.27f, 1.2f)
                curveToRelative(1.72f, 1.49f, 2.49f, 3.79f, 2.03f, 6.01f)
                curveToRelative(-0.47f, 2.22f, -2.1f, 4.02f, -4.28f, 4.7f)
                curveToRelative(-3.29f, 1.04f, -6.81f, -0.74f, -7.91f, -3.99f)
                curveToRelative(-1.1f, -3.25f, 0.64f, -6.78f, 3.89f, -7.92f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(261.28f, 184.73f)
                curveToRelative(2.16f, -0.71f, 4.54f, -0.2f, 6.23f, 1.32f)
                curveToRelative(1.68f, 1.52f, 2.41f, 3.83f, 1.91f, 6.04f)
                curveToRelative(-0.51f, 2.21f, -2.17f, 3.97f, -4.35f, 4.62f)
                curveToRelative(-3.31f, 0.98f, -6.81f, -0.86f, -7.84f, -4.14f)
                curveToRelative(-1.03f, -3.28f, 0.77f, -6.77f, 4.06f, -7.84f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(186.62f, 184.74f)
                curveToRelative(2.16f, -0.71f, 4.55f, -0.21f, 6.23f, 1.31f)
                curveToRelative(1.69f, 1.52f, 2.42f, 3.83f, 1.91f, 6.04f)
                curveToRelative(-0.5f, 2.21f, -2.17f, 3.98f, -4.35f, 4.62f)
                curveToRelative(-3.31f, 0.98f, -6.8f, -0.86f, -7.84f, -4.13f)
                curveToRelative(-1.04f, -3.27f, 0.76f, -6.77f, 4.04f, -7.85f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(412.01f, 110.32f)
                curveToRelative(3.41f, -0.31f, 6.45f, 2.14f, 6.85f, 5.52f)
                curveToRelative(0.4f, 3.38f, -1.99f, 6.46f, -5.38f, 6.94f)
                curveToRelative(-2.27f, 0.32f, -4.54f, -0.6f, -5.93f, -2.42f)
                curveToRelative(-1.39f, -1.82f, -1.67f, -4.24f, -0.75f, -6.33f)
                curveToRelative(0.93f, -2.09f, 2.92f, -3.51f, 5.21f, -3.72f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(429.06f, 110.71f)
                curveToRelative(2.39f, -0.87f, 5.07f, -0.24f, 6.8f, 1.61f)
                curveToRelative(1.73f, 1.85f, 2.18f, 4.55f, 1.15f, 6.85f)
                curveToRelative(-0.78f, 1.72f, -2.3f, 3.01f, -4.13f, 3.49f)
                curveToRelative(-3.26f, 0.87f, -6.63f, -0.97f, -7.65f, -4.17f)
                curveToRelative(-1.02f, -3.2f, 0.67f, -6.63f, 3.84f, -7.78f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(223.83f, 184.79f)
                curveToRelative(2.15f, -0.77f, 4.55f, -0.32f, 6.27f, 1.17f)
                curveToRelative(1.72f, 1.49f, 2.51f, 3.78f, 2.05f, 6f)
                curveToRelative(-0.46f, 2.22f, -2.09f, 4.02f, -4.26f, 4.71f)
                curveToRelative(-3.28f, 1.04f, -6.79f, -0.72f, -7.9f, -3.96f)
                curveToRelative(-1.11f, -3.24f, 0.61f, -6.76f, 3.85f, -7.92f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(149.15f, 184.8f)
                curveToRelative(2.15f, -0.77f, 4.55f, -0.33f, 6.28f, 1.15f)
                curveToRelative(1.73f, 1.49f, 2.51f, 3.79f, 2.05f, 6.01f)
                curveToRelative(-0.46f, 2.22f, -2.1f, 4.03f, -4.28f, 4.71f)
                curveToRelative(-3.28f, 1.03f, -6.78f, -0.73f, -7.88f, -3.97f)
                curveToRelative(-1.1f, -3.23f, 0.6f, -6.75f, 3.83f, -7.91f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(280.54f, 147.52f)
                curveToRelative(2.39f, -0.54f, 4.87f, 0.35f, 6.37f, 2.26f)
                curveToRelative(1.5f, 1.92f, 1.76f, 4.52f, 0.65f, 6.69f)
                curveToRelative(-0.97f, 1.91f, -2.86f, 3.19f, -5f, 3.4f)
                curveToRelative(-3.32f, 0.33f, -6.33f, -1.96f, -6.86f, -5.23f)
                curveToRelative(-0.54f, -3.27f, 1.58f, -6.39f, 4.84f, -7.12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(298.51f, 184.79f)
                curveToRelative(2.15f, -0.76f, 4.55f, -0.3f, 6.26f, 1.19f)
                curveToRelative(1.72f, 1.49f, 2.49f, 3.79f, 2.02f, 6.01f)
                curveToRelative(-0.47f, 2.22f, -2.11f, 4.01f, -4.28f, 4.69f)
                curveToRelative(-3.28f, 1.02f, -6.79f, -0.75f, -7.88f, -3.99f)
                curveToRelative(-1.09f, -3.24f, 0.63f, -6.75f, 3.87f, -7.9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(336.5f, 147.51f)
                curveToRelative(2.24f, -0.52f, 4.58f, 0.22f, 6.12f, 1.91f)
                curveToRelative(1.54f, 1.7f, 2.02f, 4.09f, 1.27f, 6.25f)
                curveToRelative(-0.76f, 2.16f, -2.63f, 3.73f, -4.9f, 4.12f)
                curveToRelative(-1.84f, 0.31f, -3.73f, -0.2f, -5.15f, -1.41f)
                curveToRelative(-1.42f, -1.21f, -2.23f, -2.98f, -2.21f, -4.84f)
                curveToRelative(0.03f, -2.89f, 2.05f, -5.38f, 4.88f, -6.03f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(317.84f, 147.51f)
                curveToRelative(2.22f, -0.52f, 4.54f, 0.2f, 6.08f, 1.87f)
                curveToRelative(1.54f, 1.67f, 2.05f, 4.04f, 1.33f, 6.19f)
                curveToRelative(-0.72f, 2.15f, -2.55f, 3.74f, -4.79f, 4.17f)
                curveToRelative(-3.36f, 0.64f, -6.62f, -1.51f, -7.34f, -4.83f)
                curveToRelative(-0.71f, -3.33f, 1.38f, -6.61f, 4.71f, -7.39f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(299.33f, 147.5f)
                curveToRelative(3.4f, -0.72f, 6.74f, 1.43f, 7.46f, 4.81f)
                curveToRelative(0.72f, 3.37f, -1.44f, 6.69f, -4.84f, 7.41f)
                curveToRelative(-3.4f, 0.72f, -6.73f, -1.43f, -7.46f, -4.81f)
                curveToRelative(-0.72f, -3.37f, 1.44f, -6.69f, 4.84f, -7.41f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(215.8f, 202.99f)
                curveToRelative(7.64f, -0.63f, 10.44f, 8.89f, 2.4f, 12.28f)
                curveToRelative(-10.04f, -1.11f, -10.53f, -10.22f, -2.4f, -12.28f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(319.02f, 184.2f)
                curveToRelative(5.17f, 0.92f, 8.72f, 5.52f, 5.07f, 10.59f)
                curveToRelative(-1.21f, 1.67f, -2.84f, 1.62f, -4.73f, 1.67f)
                curveToRelative(-7.79f, 0.12f, -9.31f, -9.67f, -0.34f, -12.26f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(233.75f, 202.9f)
                curveToRelative(8.43f, -0.36f, 11.01f, 8.96f, 3.95f, 12.09f)
                curveToRelative(-1.21f, -0.13f, -3.09f, -0.3f, -4.22f, -0.59f)
                curveToRelative(-1.78f, -0.46f, -3.3f, -1.64f, -4.18f, -3.25f)
                curveToRelative(-1.99f, -3.62f, 1.61f, -6.65f, 4.45f, -8.26f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(312.06f, 129.42f)
                curveToRelative(7.35f, 2.49f, 4.75f, 12.25f, -3.09f, 11.98f)
                curveToRelative(-3.16f, -1.17f, -7.14f, -4.2f, -4.89f, -7.95f)
                curveToRelative(1.72f, -2.87f, 4.95f, -3.27f, 7.98f, -4.04f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(446.53f, 110.78f)
                curveToRelative(2.9f, 0.71f, 6.35f, 0.73f, 8.57f, 2.85f)
                curveToRelative(3.19f, 3.05f, -0.03f, 6.61f, -2.38f, 8.85f)
                curveToRelative(-0.32f, 0.09f, -0.65f, 0.17f, -0.97f, 0.24f)
                curveToRelative(-3.85f, 0.87f, -7.37f, -1.21f, -7.86f, -5.23f)
                curveToRelative(-0.39f, -3.14f, 0.81f, -4.44f, 2.65f, -6.71f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(264.32f, 147.68f)
                curveToRelative(6.93f, 0.71f, 7.55f, 9.99f, -1.13f, 12.47f)
                curveToRelative(-3.41f, -0.99f, -7.61f, -3.5f, -5.81f, -7.72f)
                curveToRelative(1.25f, -2.92f, 4.16f, -3.68f, 6.94f, -4.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(580.32f, 110.09f)
                lineToRelative(1.52f, 0.23f)
                curveToRelative(2.73f, 1.7f, 3.73f, 5.61f, 4.92f, 8.69f)
                curveToRelative(-2.38f, 2.65f, -2.83f, 3.09f, -6.14f, 4.26f)
                curveToRelative(-0.63f, -0.2f, -1.25f, -0.41f, -1.86f, -0.65f)
                curveToRelative(-6.58f, -2.58f, -6.24f, -10.08f, 1.55f, -12.53f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(393.77f, 111.99f)
                curveToRelative(5.41f, -0.62f, 7.76f, 1.24f, 5.62f, 7.38f)
                curveToRelative(-0.71f, 2.04f, -2.9f, 3.04f, -4.88f, 3.74f)
                curveToRelative(-4.67f, -0.7f, -9.35f, -4.74f, -5.87f, -9.6f)
                curveToRelative(1.11f, -1.55f, 3.28f, -1.42f, 5.13f, -1.53f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(569.54f, 91.55f)
                curveToRelative(3.36f, 0.05f, 6.33f, 6.64f, 7.89f, 9.33f)
                curveToRelative(-2.11f, 1.94f, -2.58f, 2.32f, -5.15f, 3.55f)
                curveToRelative(-8.16f, 0.14f, -9.92f, -7.81f, -2.74f, -12.88f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(326.98f, 165.79f)
                curveToRelative(2.8f, -0.06f, 6.54f, 0.47f, 7.3f, 3.51f)
                curveToRelative(-0.71f, 3.19f, -3.56f, 5.27f, -5.99f, 7.56f)
                curveToRelative(-0.55f, 0.63f, -0.79f, 0.62f, -1.58f, 0.96f)
                curveToRelative(-3.5f, -0.26f, -4.66f, -4.04f, -4.14f, -7.04f)
                curveToRelative(0.42f, -2.41f, 2.49f, -3.76f, 4.4f, -4.99f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(382.71f, 128.88f)
                curveToRelative(5.64f, -0.33f, 6.87f, 1.38f, 8.78f, 6.32f)
                curveToRelative(-2.23f, 0.61f, -4.68f, 1.49f, -6.9f, 2.24f)
                lineToRelative(-4.83f, 2.16f)
                curveToRelative(-2.51f, -5.36f, -2.13f, -7.5f, 2.96f, -10.72f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(136.49f, 186.35f)
                curveToRelative(4.59f, 1.54f, 2f, 6.96f, -0.25f, 9.51f)
                lineToRelative(-6.31f, -1.08f)
                curveToRelative(-2.02f, -0.4f, -1.79f, -0.04f, -3.06f, -1.23f)
                curveToRelative(-0.49f, -1.57f, -0.58f, -1.79f, -0.2f, -3.37f)
                curveToRelative(1.69f, -2.69f, 6.34f, -3.01f, 9.82f, -3.83f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(376.88f, 114.21f)
                curveToRelative(0.48f, -0.07f, 0.96f, -0.14f, 1.44f, -0.2f)
                curveToRelative(1.74f, -0.2f, 1.69f, -0.13f, 2.81f, 0.77f)
                curveToRelative(2.21f, 4.57f, -2.81f, 8.6f, -7.79f, 8.05f)
                curveToRelative(-1.82f, -1.05f, -3.53f, -2.84f, -4.62f, -4.62f)
                curveToRelative(-0.29f, -3.86f, 5.32f, -3.7f, 8.15f, -3.99f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(333.67f, 185.64f)
                curveToRelative(3.31f, 1.34f, 8.1f, 4.95f, 10.82f, 7.19f)
                lineToRelative(-3.32f, 3.4f)
                curveToRelative(-0.73f, 0.2f, -5.68f, 0.03f, -6.77f, 0.01f)
                curveToRelative(-3.47f, -4.46f, -3.72f, -5.85f, -0.73f, -10.6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(462.41f, 113.79f)
                curveToRelative(3.65f, 0.62f, 10.94f, 0.2f, 12.3f, 3.7f)
                curveToRelative(-0.25f, 1.77f, -0.92f, 2.43f, -1.97f, 3.89f)
                curveToRelative(-6.44f, 4.63f, -10.69f, -0.9f, -10.33f, -7.6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(558.95f, 73.58f)
                curveToRelative(1.8f, 0.94f, 6.74f, 8.6f, 7.34f, 10.41f)
                curveToRelative(-1.03f, 1.15f, -2.34f, 1.37f, -3.86f, 1.86f)
                curveToRelative(-4.19f, 0.51f, -6.04f, -3.43f, -7.27f, -6.57f)
                curveToRelative(1.16f, -2.88f, 1.53f, -3.75f, 3.78f, -5.71f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(221.25f, 168.74f)
                curveToRelative(4.3f, 1.37f, 1.04f, 11.33f, -6.85f, 9.37f)
                lineToRelative(-3.53f, -2.43f)
                curveToRelative(3.59f, -3.25f, 6f, -4.82f, 10.38f, -6.94f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(355.29f, 147.34f)
                curveToRelative(1.81f, -0.09f, 3.89f, 0.31f, 5.48f, 1.21f)
                curveToRelative(1.77f, 2.87f, -3.29f, 5.2f, -5.47f, 6.59f)
                curveToRelative(-1.17f, 0.83f, -1.53f, 1.04f, -2.84f, 1.63f)
                curveToRelative(-1.56f, -0.26f, -0.92f, 0.08f, -1.99f, -1.12f)
                curveToRelative(-1.12f, -3.98f, 1.4f, -6.81f, 4.82f, -8.31f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(588.9f, 128.94f)
                curveToRelative(1.76f, 0f, 1.34f, -0.27f, 2.33f, 0.65f)
                curveToRelative(0.77f, 2.78f, 0.35f, 6.98f, 0.24f, 10.01f)
                lineToRelative(-3.86f, -1.15f)
                curveToRelative(-1.58f, -0.59f, -3.58f, -1.04f, -3.97f, -2.87f)
                curveToRelative(-0.74f, -3.46f, 2.19f, -5.94f, 5.26f, -6.64f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(548.32f, 114.8f)
                curveToRelative(0.53f, 0.02f, 0.38f, 0.07f, 0.95f, 0.44f)
                curveToRelative(0.64f, 3.16f, -0.74f, 5.69f, -3.71f, 7.14f)
                curveToRelative(-1.87f, 0.91f, -3.67f, 0.03f, -5.5f, -0.66f)
                curveToRelative(-1.12f, -0.82f, -2.51f, -2.09f, -3.6f, -3.02f)
                curveToRelative(3.41f, -1.35f, 8.25f, -2.76f, 11.85f, -3.91f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(360.9f, 116.18f)
                curveToRelative(0.76f, -0.14f, 0.67f, -0.05f, 1.48f, 0.1f)
                curveToRelative(1.68f, 3.96f, -3.64f, 7.71f, -8.52f, 6.08f)
                curveToRelative(-1.05f, -0.84f, -2.81f, -2.68f, -3.84f, -3.7f)
                curveToRelative(3.71f, -0.7f, 7.21f, -1.58f, 10.87f, -2.48f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(272.03f, 202.99f)
                curveToRelative(3.19f, -0.2f, 3.63f, 0.55f, 6.13f, 2.61f)
                lineToRelative(-7.74f, 4.06f)
                curveToRelative(-1.68f, 0.88f, -2.58f, 1.8f, -4.06f, 0.39f)
                curveToRelative(-0.91f, -3.71f, 2.42f, -6.22f, 5.66f, -7.06f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(296.61f, 134.48f)
                lineToRelative(0.59f, -0.06f)
                lineToRelative(0.57f, 0.48f)
                curveToRelative(-0.04f, 1.6f, -0.86f, 2.95f, -1.56f, 4.45f)
                curveToRelative(-2.49f, 1.63f, -3.82f, 2.76f, -6.84f, 1.81f)
                curveToRelative(-1.24f, -0.71f, -2.67f, -1.67f, -3.9f, -2.44f)
                curveToRelative(3.76f, -1.56f, 7.31f, -2.86f, 11.14f, -4.24f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(195.99f, 203.01f)
                curveToRelative(4.2f, -0.6f, 8.9f, 1.93f, 8.18f, 6.41f)
                lineToRelative(-0.77f, 0.1f)
                curveToRelative(-2.75f, -0.97f, -7.81f, -2.32f, -9.4f, -4.5f)
                curveToRelative(0.26f, -1.24f, 0.51f, -1.02f, 1.98f, -2.01f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(547.65f, 56.12f)
                curveToRelative(1.76f, 1.2f, 6.29f, 8.65f, 7.6f, 10.86f)
                curveToRelative(-7.87f, 1.7f, -7.34f, -5.07f, -7.6f, -10.86f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(569.44f, 128.86f)
                curveToRelative(3.4f, -0.16f, 8.41f, 1.37f, 7.85f, 5.54f)
                horizontalLineToRelative(-0.88f)
                curveToRelative(-2.75f, -1.02f, -7.8f, -1.69f, -9.17f, -3.48f)
                curveToRelative(0.39f, -1.23f, 0.88f, -1.21f, 2.21f, -2.06f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(554.5f, 91.96f)
                curveToRelative(4.41f, 2.03f, 5.8f, 5.26f, 3.5f, 9.53f)
                curveToRelative(-0.68f, 0.65f, -0.73f, 0.63f, -1.59f, 1.04f)
                lineToRelative(-0.7f, -0.56f)
                curveToRelative(-0.97f, -2.91f, -0.99f, -6.88f, -1.21f, -10.02f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(249.87f, 154.11f)
                lineToRelative(0.62f, 0.03f)
                lineToRelative(0.33f, 0.65f)
                curveToRelative(-0.73f, 3.14f, -3.79f, 5.29f, -7f, 5.3f)
                curveToRelative(-0.97f, -0.32f, -1.62f, -0.43f, -2.32f, -1.17f)
                lineToRelative(0.2f, -0.82f)
                curveToRelative(1.38f, -1.22f, 6.17f, -3.06f, 8.17f, -3.99f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(480.61f, 117.82f)
                curveToRelative(2.81f, 0.45f, 7.87f, 1.78f, 10.27f, 3.22f)
                lineToRelative(0.12f, 0.8f)
                curveToRelative(-5.07f, 2.1f, -7.85f, 0.79f, -10.4f, -4.02f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(402.44f, 128.52f)
                curveToRelative(1.27f, 0.16f, 3.48f, 0.32f, 4.13f, 1.46f)
                curveToRelative(-1.3f, 1.09f, -3.3f, 1.39f, -5.02f, 1.84f)
                lineToRelative(-5.39f, 1.93f)
                curveToRelative(2.18f, -2.67f, 3.11f, -3.89f, 6.28f, -5.22f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(119.34f, 190.71f)
                curveToRelative(0.26f, 0.01f, 0.49f, 0.23f, 0.78f, 0.42f)
                curveToRelative(0.22f, 1.25f, 0.32f, 0.67f, -0.36f, 1.78f)
                curveToRelative(-1.69f, 0.7f, -2.76f, 0.31f, -4.6f, -0f)
                curveToRelative(-1.17f, -0.34f, -0.81f, 0f, -1.4f, -0.78f)
                curveToRelative(1.19f, -0.83f, 3.99f, -1.14f, 5.59f, -1.42f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFEFE)),
                strokeLineWidth = 0.429312f,
            ) {
                moveToRelative(340.58f, 120.78f)
                lineToRelative(1.5f, -0.06f)
                lineToRelative(0.3f, 0.39f)
                curveToRelative(-1.37f, 1.13f, -2.23f, 1.3f, -3.9f, 1.89f)
                curveToRelative(-0.92f, 0.02f, -1.41f, 0.14f, -2.14f, -0.4f)
                curveToRelative(0.88f, -0.93f, 2.93f, -1.4f, 4.24f, -1.82f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0f,
                strokeLineWidth = 1.23993f,
            ) {
                moveToRelative(113.81f, 622.63f)
                lineToRelative(-0.55f, 44.34f)
                lineToRelative(550.07f, 1.09f)
                lineToRelative(-26.46f, -48.18f)
                lineToRelative(-526.92f, 2.19f)
                close()
            }
        }.build()
        return _customMorogan!!
    }

private var _customMorogan: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = BuildInCustomSenderAvatar.CustomMorogan, contentDescription = "")
    }
}
