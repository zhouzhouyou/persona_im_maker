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

public val MyResourcePack.IM_Next: ImageVector
    get() {
        if (_next != null) {
            return _next!!
        }
        _next = Builder(name = "Next", defaultWidth = 130.0.dp, defaultHeight = 57.0.dp,
                viewportWidth = 130.0f, viewportHeight = 57.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(47.24f, 3.82f)
                lineTo(60.8f, 4.69f)
                lineTo(64.65f, 10.83f)
                lineTo(65.92f, 4.01f)
                lineTo(77.18f, 7.1f)
                lineTo(78.38f, 12.84f)
                lineTo(87.26f, 9.16f)
                lineTo(91.69f, 15.31f)
                lineTo(101.05f, 15.47f)
                lineTo(101.93f, 8.47f)
                lineTo(114.0f, 4.01f)
                lineTo(115.68f, 12.37f)
                lineTo(119.69f, 12.49f)
                lineTo(122.13f, 20.81f)
                lineTo(119.08f, 23.79f)
                lineTo(119.38f, 29.48f)
                lineTo(126.33f, 34.4f)
                lineTo(117.97f, 47.66f)
                lineTo(109.87f, 42.77f)
                lineTo(105.98f, 44.83f)
                lineTo(100.63f, 44.72f)
                lineTo(98.64f, 43.38f)
                lineTo(95.89f, 44.98f)
                lineTo(85.81f, 45.22f)
                lineTo(84.4f, 41.66f)
                lineTo(80.18f, 43.05f)
                lineTo(78.37f, 48.19f)
                lineTo(79.97f, 51.67f)
                lineTo(65.42f, 52.2f)
                lineTo(63.17f, 47.24f)
                lineTo(60.61f, 51.21f)
                lineTo(46.67f, 51.51f)
                lineTo(47.24f, 3.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(63.07f, 2.22f)
                curveTo(63.34f, 1.79f, 63.7f, 1.43f, 64.13f, 1.16f)
                curveTo(64.93f, 0.66f, 65.9f, 0.52f, 66.81f, 0.77f)
                lineTo(78.07f, 3.86f)
                curveTo(79.29f, 4.19f, 80.22f, 5.18f, 80.47f, 6.41f)
                curveTo(80.47f, 6.41f, 80.84f, 8.18f, 80.84f, 8.18f)
                lineTo(85.98f, 6.06f)
                curveTo(87.42f, 5.46f, 89.08f, 5.93f, 89.99f, 7.19f)
                curveTo(89.99f, 7.19f, 93.44f, 11.97f, 93.44f, 11.97f)
                curveTo(93.44f, 11.97f, 98.09f, 12.05f, 98.09f, 12.05f)
                lineTo(98.59f, 8.06f)
                curveTo(98.75f, 6.81f, 99.58f, 5.76f, 100.76f, 5.32f)
                lineTo(112.83f, 0.85f)
                curveTo(113.75f, 0.51f, 114.78f, 0.59f, 115.64f, 1.07f)
                curveTo(116.49f, 1.55f, 117.1f, 2.38f, 117.29f, 3.35f)
                lineTo(118.45f, 9.09f)
                lineTo(119.78f, 9.12f)
                curveTo(121.24f, 9.17f, 122.5f, 10.14f, 122.91f, 11.54f)
                lineTo(125.36f, 19.86f)
                curveTo(125.71f, 21.06f, 125.37f, 22.35f, 124.48f, 23.22f)
                lineTo(122.52f, 25.13f)
                lineTo(122.65f, 27.67f)
                lineTo(128.28f, 31.66f)
                curveTo(129.73f, 32.69f, 130.13f, 34.69f, 129.18f, 36.2f)
                lineTo(120.81f, 49.45f)
                curveTo(119.84f, 51.0f, 117.8f, 51.49f, 116.23f, 50.54f)
                lineTo(109.76f, 46.63f)
                lineTo(107.55f, 47.8f)
                curveTo(107.04f, 48.07f, 106.48f, 48.21f, 105.91f, 48.19f)
                lineTo(100.56f, 48.08f)
                curveTo(99.91f, 48.06f, 99.29f, 47.86f, 98.75f, 47.51f)
                lineTo(98.52f, 47.35f)
                lineTo(97.59f, 47.89f)
                curveTo(97.1f, 48.18f, 96.54f, 48.33f, 95.97f, 48.35f)
                lineTo(85.89f, 48.58f)
                curveTo(84.48f, 48.61f, 83.21f, 47.76f, 82.69f, 46.46f)
                lineTo(82.61f, 46.27f)
                lineTo(81.99f, 48.02f)
                lineTo(83.02f, 50.26f)
                curveTo(83.49f, 51.28f, 83.42f, 52.47f, 82.84f, 53.43f)
                curveTo(82.25f, 54.38f, 81.22f, 54.99f, 80.09f, 55.03f)
                lineTo(65.54f, 55.56f)
                curveTo(64.32f, 55.61f, 63.18f, 54.98f, 62.55f, 53.95f)
                curveTo(62.01f, 54.34f, 61.36f, 54.56f, 60.68f, 54.57f)
                lineTo(46.74f, 54.88f)
                curveTo(45.83f, 54.9f, 44.95f, 54.54f, 44.3f, 53.91f)
                curveTo(43.65f, 53.26f, 43.29f, 52.38f, 43.31f, 51.47f)
                lineTo(43.88f, 3.78f)
                curveTo(43.89f, 2.85f, 44.28f, 1.98f, 44.96f, 1.35f)
                curveTo(45.63f, 0.72f, 46.54f, 0.4f, 47.46f, 0.46f)
                lineTo(61.02f, 1.34f)
                curveTo(61.79f, 1.39f, 62.51f, 1.7f, 63.07f, 2.22f)
                close()
                moveTo(47.24f, 3.82f)
                lineTo(46.67f, 51.51f)
                lineTo(60.61f, 51.21f)
                lineTo(63.17f, 47.24f)
                lineTo(65.42f, 52.2f)
                lineTo(79.97f, 51.67f)
                lineTo(78.37f, 48.19f)
                lineTo(80.18f, 43.05f)
                lineTo(84.4f, 41.66f)
                lineTo(85.81f, 45.22f)
                lineTo(95.89f, 44.98f)
                lineTo(98.64f, 43.38f)
                lineTo(100.63f, 44.72f)
                lineTo(105.98f, 44.83f)
                lineTo(109.87f, 42.77f)
                lineTo(117.97f, 47.66f)
                lineTo(126.33f, 34.4f)
                lineTo(119.38f, 29.48f)
                lineTo(119.08f, 23.79f)
                lineTo(122.13f, 20.81f)
                lineTo(119.69f, 12.49f)
                lineTo(115.68f, 12.37f)
                lineTo(114.0f, 4.01f)
                lineTo(101.93f, 8.47f)
                lineTo(101.05f, 15.47f)
                lineTo(91.69f, 15.31f)
                lineTo(87.26f, 9.16f)
                lineTo(78.38f, 12.84f)
                lineTo(77.18f, 7.1f)
                lineTo(65.92f, 4.01f)
                lineTo(64.65f, 10.83f)
                lineTo(60.8f, 4.69f)
                lineTo(47.24f, 3.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.04f, 11.57f)
                curveTo(53.07f, 10.22f, 55.26f, 9.14f, 56.87f, 9.14f)
                curveTo(58.49f, 9.14f, 60.49f, 9.25f, 61.11f, 11.42f)
                curveTo(61.72f, 13.59f, 68.5f, 34.73f, 68.5f, 34.73f)
                lineTo(67.84f, 10.76f)
                curveTo(67.83f, 9.42f, 69.95f, 8.78f, 71.11f, 8.78f)
                curveTo(72.27f, 8.78f, 74.5f, 9.51f, 74.5f, 11.8f)
                curveTo(74.5f, 14.1f, 74.79f, 22.54f, 74.79f, 22.54f)
                curveTo(75.98f, 19.06f, 79.39f, 15.19f, 82.66f, 15.19f)
                curveTo(85.92f, 15.19f, 88.94f, 16.86f, 90.1f, 19.0f)
                curveTo(92.48f, 19.0f, 95.81f, 19.36f, 95.81f, 19.36f)
                lineTo(98.01f, 23.43f)
                lineTo(100.76f, 19.4f)
                lineTo(103.66f, 19.27f)
                lineTo(106.26f, 17.84f)
                lineTo(106.29f, 11.24f)
                curveTo(106.3f, 9.74f, 108.37f, 8.76f, 109.53f, 8.76f)
                curveTo(110.69f, 8.76f, 112.16f, 9.47f, 112.16f, 10.96f)
                curveTo(112.16f, 12.46f, 112.74f, 15.55f, 112.74f, 15.55f)
                curveTo(112.74f, 15.55f, 114.2f, 16.08f, 114.94f, 15.97f)
                curveTo(115.67f, 15.85f, 116.22f, 17.6f, 116.22f, 18.94f)
                curveTo(116.22f, 20.29f, 115.76f, 22.0f, 113.74f, 22.73f)
                curveTo(113.74f, 24.22f, 113.86f, 28.88f, 113.96f, 30.46f)
                curveTo(114.06f, 32.03f, 115.12f, 33.51f, 116.8f, 33.51f)
                curveTo(118.48f, 33.51f, 118.82f, 33.79f, 118.82f, 34.8f)
                curveTo(118.82f, 35.8f, 119.52f, 41.03f, 114.94f, 41.03f)
                curveTo(110.35f, 41.03f, 108.43f, 35.5f, 108.43f, 32.42f)
                curveTo(108.43f, 29.33f, 108.98f, 25.36f, 106.72f, 24.96f)
                curveTo(106.24f, 24.88f, 105.76f, 23.47f, 105.4f, 23.62f)
                curveTo(104.06f, 24.14f, 103.61f, 26.63f, 102.41f, 28.01f)
                curveTo(102.07f, 28.71f, 102.13f, 29.2f, 102.13f, 29.2f)
                curveTo(102.13f, 29.2f, 106.53f, 36.68f, 108.46f, 38.99f)
                curveTo(108.46f, 40.14f, 107.85f, 40.78f, 104.46f, 40.78f)
                curveTo(101.06f, 40.78f, 101.53f, 40.16f, 100.36f, 38.99f)
                curveTo(99.2f, 37.83f, 98.41f, 35.25f, 98.41f, 35.25f)
                curveTo(97.25f, 36.94f, 96.4f, 38.05f, 95.97f, 38.99f)
                curveTo(95.55f, 39.93f, 94.99f, 41.15f, 93.12f, 41.15f)
                curveTo(91.26f, 41.15f, 88.34f, 41.08f, 87.9f, 38.41f)
                curveTo(87.04f, 40.13f, 84.44f, 40.2f, 82.46f, 40.2f)
                curveTo(80.47f, 40.2f, 77.45f, 40.23f, 75.16f, 35.16f)
                curveTo(75.16f, 37.18f, 75.0f, 42.98f, 75.0f, 44.48f)
                curveTo(75.0f, 45.98f, 74.27f, 47.6f, 71.61f, 47.6f)
                curveTo(68.96f, 47.6f, 69.2f, 47.36f, 67.95f, 47.29f)
                curveTo(64.98f, 47.11f, 61.61f, 28.79f, 59.07f, 21.42f)
                curveTo(59.16f, 25.99f, 59.26f, 42.5f, 59.26f, 43.79f)
                curveTo(59.25f, 45.07f, 59.64f, 47.69f, 57.13f, 47.69f)
                curveTo(54.63f, 47.69f, 53.37f, 47.47f, 53.37f, 44.63f)
                curveTo(53.37f, 41.79f, 53.0f, 13.82f, 53.04f, 11.57f)
                close()
                moveTo(94.49f, 29.31f)
                curveTo(94.25f, 28.35f, 92.44f, 25.51f, 91.9f, 24.98f)
                curveTo(91.75f, 26.3f, 91.14f, 28.82f, 88.4f, 28.82f)
                curveTo(85.67f, 28.82f, 80.94f, 29.86f, 79.28f, 29.15f)
                curveTo(79.72f, 30.3f, 80.81f, 33.84f, 82.83f, 33.84f)
                curveTo(84.85f, 33.84f, 85.35f, 31.81f, 87.07f, 31.81f)
                curveTo(89.44f, 31.81f, 90.98f, 33.55f, 89.85f, 35.77f)
                curveTo(90.9f, 34.33f, 93.61f, 31.11f, 94.49f, 29.31f)
                close()
                moveTo(82.87f, 20.97f)
                curveTo(81.86f, 20.97f, 80.83f, 22.46f, 80.83f, 23.2f)
                curveTo(80.83f, 23.93f, 82.15f, 24.29f, 82.95f, 24.29f)
                curveTo(83.76f, 24.29f, 84.91f, 23.8f, 84.91f, 23.02f)
                curveTo(84.91f, 22.24f, 84.11f, 20.97f, 82.87f, 20.97f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.72f, 27.48f)
                moveToRelative(-21.36f, 0.0f)
                arcToRelative(21.36f, 21.36f, 93.07f, true, true, 42.71f, 0.0f)
                arcToRelative(21.36f, 21.36f, 93.07f, true, true, -42.71f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.72f, 2.75f)
                curveTo(38.36f, 2.75f, 49.44f, 13.83f, 49.44f, 27.48f)
                curveTo(49.44f, 41.12f, 38.36f, 52.19f, 24.72f, 52.19f)
                curveTo(11.08f, 52.19f, -0.0f, 41.12f, -0.0f, 27.48f)
                curveTo(-0.0f, 13.83f, 11.08f, 2.75f, 24.72f, 2.75f)
                close()
                moveTo(24.72f, 6.12f)
                curveTo(12.93f, 6.12f, 3.36f, 15.69f, 3.36f, 27.48f)
                curveTo(3.36f, 39.26f, 12.93f, 48.83f, 24.72f, 48.83f)
                curveTo(36.51f, 48.83f, 46.08f, 39.26f, 46.08f, 27.48f)
                curveTo(46.08f, 15.69f, 36.51f, 6.12f, 24.72f, 6.12f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.02f, 38.99f)
                lineTo(16.91f, 36.94f)
                lineTo(26.37f, 27.48f)
                lineTo(16.91f, 18.02f)
                lineTo(21.02f, 15.96f)
                lineTo(32.53f, 27.48f)
                lineTo(21.02f, 38.99f)
                close()
            }
        }
        .build()
        return _next!!
    }

private var _next: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MyResourcePack.IM_Next, contentDescription = "")
    }
}
