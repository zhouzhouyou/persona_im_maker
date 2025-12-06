package com.yuri.im.ui.resource.emotion

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yuri.im.ui.resource.EmotionMarkerImage
import kotlin.Unit

public val EmotionMarkerImage.EmotionMarkerQuestion: ImageVector
    get() {
        if (_emotionMarkerQuestion != null) {
            return _emotionMarkerQuestion!!
        }
        _emotionMarkerQuestion = Builder(name = "EmotionMarkerQuestion", defaultWidth = 256.0.dp,
                defaultHeight = 293.0.dp, viewportWidth = 1024.0f, viewportHeight = 1172.0f).apply {
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(592.6f, 28.4f)
                curveTo(621.8f, 25.2f, 631.3f, 45.0f, 652.6f, 60.8f)
                curveTo(661.5f, 67.3f, 672.0f, 74.8f, 680.0f, 81.9f)
                curveTo(741.3f, 135.8f, 805.1f, 186.7f, 867.7f, 239.0f)
                curveTo(884.9f, 255.4f, 867.9f, 283.4f, 866.0f, 301.9f)
                curveTo(862.1f, 341.1f, 852.7f, 377.6f, 847.4f, 416.5f)
                curveTo(846.6f, 422.8f, 845.5f, 436.8f, 843.8f, 442.3f)
                curveTo(835.9f, 468.1f, 833.3f, 492.3f, 830.7f, 518.9f)
                curveTo(829.3f, 531.4f, 823.9f, 546.3f, 821.7f, 559.5f)
                curveTo(819.5f, 573.1f, 819.2f, 593.4f, 809.3f, 603.4f)
                curveTo(777.5f, 631.4f, 743.6f, 656.3f, 711.0f, 683.1f)
                curveTo(677.5f, 710.6f, 642.5f, 736.1f, 610.1f, 764.8f)
                curveTo(590.9f, 781.9f, 587.5f, 805.8f, 577.4f, 828.3f)
                lineTo(528.1f, 938.9f)
                curveTo(513.3f, 971.6f, 497.1f, 1003.2f, 485.0f, 1037.1f)
                curveTo(483.7f, 1040.8f, 482.7f, 1044.4f, 479.8f, 1047.2f)
                curveTo(466.5f, 1052.0f, 395.0f, 1031.0f, 377.1f, 1026.4f)
                curveTo(342.3f, 1017.3f, 304.3f, 1009.5f, 269.8f, 999.8f)
                curveTo(253.9f, 995.2f, 237.9f, 991.1f, 221.8f, 987.4f)
                curveTo(197.9f, 982.1f, 155.8f, 974.7f, 135.8f, 963.4f)
                curveTo(131.1f, 941.7f, 143.5f, 906.4f, 148.1f, 884.3f)
                lineTo(179.6f, 733.4f)
                curveTo(181.9f, 722.9f, 182.8f, 712.0f, 185.0f, 701.5f)
                curveTo(187.8f, 686.2f, 192.8f, 670.6f, 195.6f, 655.4f)
                curveTo(200.2f, 629.4f, 214.2f, 610.9f, 227.6f, 588.8f)
                lineTo(263.5f, 528.3f)
                curveTo(272.9f, 512.5f, 290.9f, 478.4f, 301.6f, 464.5f)
                curveTo(293.1f, 459.6f, 284.4f, 454.5f, 275.2f, 450.8f)
                curveTo(268.3f, 448.1f, 261.1f, 446.2f, 254.1f, 443.7f)
                curveTo(244.4f, 440.3f, 234.8f, 436.2f, 224.9f, 433.0f)
                curveTo(201.5f, 425.5f, 118.1f, 401.5f, 104.0f, 389.0f)
                curveTo(101.9f, 387.1f, 100.7f, 385.0f, 100.6f, 382.2f)
                curveTo(100.4f, 378.0f, 102.4f, 373.2f, 104.1f, 369.4f)
                curveTo(107.3f, 361.7f, 112.6f, 355.1f, 116.0f, 347.5f)
                curveTo(126.4f, 323.9f, 136.9f, 300.0f, 147.0f, 276.2f)
                curveTo(150.9f, 267.1f, 154.0f, 257.5f, 158.0f, 248.5f)
                curveTo(163.8f, 235.6f, 171.3f, 223.5f, 177.2f, 210.7f)
                curveTo(181.8f, 200.9f, 185.5f, 190.7f, 189.9f, 180.8f)
                curveTo(195.2f, 168.9f, 201.3f, 157.3f, 206.5f, 145.3f)
                curveTo(210.9f, 135.3f, 214.5f, 125.0f, 219.4f, 115.2f)
                curveTo(224.2f, 105.3f, 229.5f, 95.0f, 236.9f, 86.7f)
                curveTo(252.7f, 80.3f, 267.2f, 82.5f, 283.5f, 79.5f)
                curveTo(310.2f, 74.5f, 336.7f, 70.2f, 363.6f, 66.5f)
                curveTo(385.9f, 63.4f, 408.3f, 57.6f, 430.5f, 54.0f)
                curveTo(444.2f, 51.9f, 458.3f, 51.6f, 471.9f, 49.2f)
                lineTo(548.5f, 36.1f)
                curveTo(563.4f, 33.5f, 577.5f, 30.2f, 592.6f, 28.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(475.1f, 129.4f)
                curveTo(476.0f, 129.4f, 477.0f, 129.4f, 477.9f, 129.5f)
                curveTo(503.5f, 130.4f, 545.4f, 138.6f, 570.8f, 145.0f)
                curveTo(591.2f, 150.1f, 632.0f, 164.6f, 650.6f, 173.6f)
                curveTo(679.7f, 189.4f, 698.0f, 204.0f, 721.9f, 227.5f)
                curveTo(773.9f, 278.5f, 784.7f, 353.2f, 772.7f, 421.9f)
                curveTo(770.1f, 436.8f, 745.1f, 497.1f, 736.0f, 509.0f)
                curveTo(717.5f, 532.8f, 679.9f, 569.6f, 652.0f, 582.0f)
                curveTo(634.5f, 589.0f, 611.0f, 599.0f, 594.2f, 605.0f)
                curveTo(566.5f, 614.8f, 555.8f, 617.8f, 531.8f, 633.0f)
                curveTo(505.3f, 649.8f, 501.2f, 704.8f, 495.0f, 710.4f)
                curveTo(487.1f, 708.2f, 479.3f, 706.6f, 471.3f, 704.8f)
                curveTo(443.8f, 698.6f, 414.9f, 688.1f, 387.8f, 681.5f)
                curveTo(319.1f, 664.8f, 315.5f, 679.6f, 332.8f, 607.3f)
                curveTo(338.3f, 586.1f, 355.2f, 550.9f, 369.7f, 535.0f)
                curveTo(391.7f, 511.0f, 418.4f, 487.5f, 448.2f, 473.9f)
                curveTo(461.8f, 467.7f, 478.1f, 463.9f, 492.1f, 458.3f)
                curveTo(508.4f, 453.0f, 521.9f, 442.2f, 536.1f, 433.6f)
                curveTo(554.9f, 422.3f, 558.7f, 406.1f, 566.2f, 387.0f)
                curveTo(570.6f, 375.6f, 571.1f, 367.4f, 566.3f, 355.8f)
                curveTo(558.7f, 337.1f, 546.4f, 316.8f, 525.9f, 310.8f)
                curveTo(515.0f, 307.6f, 503.5f, 305.3f, 493.5f, 300.8f)
                curveTo(476.2f, 305.0f, 459.1f, 310.8f, 444.7f, 321.6f)
                curveTo(439.9f, 325.2f, 435.6f, 329.5f, 432.0f, 334.3f)
                curveTo(427.1f, 340.9f, 414.5f, 366.9f, 409.7f, 376.1f)
                curveTo(409.0f, 377.3f, 407.7f, 386.2f, 407.4f, 388.3f)
                curveTo(383.4f, 384.7f, 345.8f, 362.0f, 321.5f, 352.2f)
                curveTo(295.0f, 341.5f, 275.7f, 325.7f, 245.0f, 322.3f)
                curveTo(244.3f, 317.7f, 243.8f, 313.0f, 243.5f, 308.4f)
                curveTo(242.2f, 288.2f, 270.3f, 237.0f, 284.0f, 221.5f)
                curveTo(317.2f, 184.1f, 350.6f, 157.8f, 399.4f, 144.2f)
                curveTo(408.9f, 141.5f, 418.7f, 140.1f, 428.3f, 138.0f)
                curveTo(443.6f, 134.7f, 459.4f, 130.3f, 475.1f, 129.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(290.9f, 729.0f)
                curveTo(305.4f, 730.4f, 318.4f, 730.3f, 333.5f, 733.0f)
                curveTo(349.0f, 735.8f, 361.7f, 743.3f, 376.6f, 747.3f)
                curveTo(409.1f, 755.8f, 449.9f, 761.5f, 479.5f, 777.6f)
                curveTo(482.4f, 779.2f, 485.4f, 783.5f, 485.7f, 787.1f)
                curveTo(488.7f, 801.8f, 472.4f, 793.8f, 473.4f, 803.5f)
                curveTo(475.9f, 820.8f, 467.0f, 835.9f, 464.0f, 851.9f)
                curveTo(459.4f, 877.3f, 453.2f, 900.7f, 444.0f, 924.8f)
                curveTo(441.0f, 932.6f, 436.6f, 956.4f, 432.4f, 961.6f)
                curveTo(414.6f, 963.7f, 351.5f, 946.2f, 331.9f, 940.3f)
                curveTo(315.7f, 935.4f, 297.0f, 932.4f, 280.6f, 927.3f)
                curveTo(265.9f, 922.8f, 250.3f, 916.6f, 235.2f, 913.7f)
                curveTo(246.4f, 892.8f, 254.6f, 857.8f, 263.0f, 834.9f)
                curveTo(266.8f, 824.6f, 267.5f, 806.7f, 271.5f, 796.6f)
                curveTo(280.9f, 772.8f, 287.3f, 754.4f, 290.9f, 729.0f)
                close()
            }
        }
        .build()
        return _emotionMarkerQuestion!!
    }

private var _emotionMarkerQuestion: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = EmotionMarkerImage.EmotionMarkerQuestion, contentDescription = "")
    }
}
