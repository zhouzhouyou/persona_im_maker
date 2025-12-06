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

public val EmotionMarkerImage.EmotionMarkerExclamation: ImageVector
    get() {
        if (_emotionMarkerExclamation != null) {
            return _emotionMarkerExclamation!!
        }
        _emotionMarkerExclamation = Builder(name = "EmotionMarkerExclamation", defaultWidth =
                256.0.dp, defaultHeight = 294.0.dp, viewportWidth = 1024.0f, viewportHeight =
                1176.0f).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(415.9f, 0.0f)
                lineTo(902.6f, 0.0f)
                curveTo(902.9f, 7.1f, 900.5f, 5.9f, 901.8f, 8.7f)
                curveTo(911.1f, 11.4f, 921.3f, 10.5f, 930.7f, 12.8f)
                curveTo(936.8f, 14.3f, 943.1f, 16.3f, 949.2f, 18.0f)
                curveTo(971.6f, 24.1f, 994.5f, 26.9f, 1016.1f, 36.0f)
                curveTo(1018.5f, 37.0f, 1021.5f, 38.0f, 1024.0f, 38.6f)
                lineTo(1024.0f, 196.9f)
                curveTo(1019.3f, 198.4f, 1020.1f, 197.7f, 1016.8f, 201.7f)
                curveTo(1008.1f, 212.0f, 1002.8f, 224.7f, 996.0f, 235.6f)
                curveTo(989.1f, 246.6f, 983.0f, 257.4f, 976.4f, 268.4f)
                curveTo(968.1f, 282.2f, 958.4f, 295.9f, 949.7f, 309.9f)
                lineTo(737.5f, 649.1f)
                lineTo(679.3f, 741.4f)
                curveTo(669.5f, 756.7f, 653.9f, 778.6f, 645.9f, 794.0f)
                curveTo(645.0f, 795.7f, 644.2f, 797.3f, 643.4f, 799.0f)
                curveTo(646.5f, 806.4f, 649.4f, 813.9f, 652.1f, 821.4f)
                curveTo(646.0f, 850.8f, 624.5f, 871.0f, 610.0f, 896.2f)
                curveTo(603.2f, 908.0f, 595.6f, 920.7f, 590.1f, 933.0f)
                curveTo(581.1f, 952.6f, 567.3f, 968.6f, 555.8f, 986.7f)
                curveTo(551.6f, 993.3f, 548.7f, 1001.1f, 544.8f, 1007.8f)
                curveTo(518.6f, 1052.5f, 490.0f, 1095.4f, 465.8f, 1141.3f)
                curveTo(459.6f, 1153.0f, 451.1f, 1163.3f, 444.8f, 1176.0f)
                lineTo(336.0f, 1176.0f)
                curveTo(335.6f, 1173.4f, 334.9f, 1169.3f, 332.4f, 1168.4f)
                curveTo(320.2f, 1164.2f, 303.6f, 1164.6f, 291.6f, 1161.2f)
                curveTo(280.6f, 1158.0f, 269.2f, 1152.9f, 258.2f, 1149.7f)
                lineTo(119.7f, 1110.2f)
                curveTo(114.0f, 1108.6f, 87.6f, 1103.4f, 84.9f, 1101.9f)
                curveTo(71.5f, 1094.8f, 14.4f, 1084.9f, 7.6f, 1077.3f)
                curveTo(5.2f, 1056.8f, 6.1f, 1060.1f, 8.9f, 1041.1f)
                curveTo(19.3f, 1016.1f, 18.1f, 999.4f, 24.7f, 974.2f)
                curveTo(26.1f, 969.1f, 34.9f, 957.2f, 37.2f, 949.9f)
                curveTo(41.3f, 939.8f, 42.1f, 926.7f, 45.7f, 916.7f)
                curveTo(53.5f, 894.8f, 59.1f, 873.1f, 64.7f, 850.7f)
                curveTo(67.0f, 841.5f, 74.8f, 831.4f, 77.7f, 822.2f)
                curveTo(80.9f, 811.6f, 81.0f, 800.2f, 84.2f, 789.6f)
                curveTo(85.9f, 781.8f, 94.6f, 768.6f, 95.7f, 761.5f)
                curveTo(100.1f, 734.5f, 106.7f, 712.4f, 118.1f, 687.5f)
                curveTo(120.9f, 681.2f, 120.8f, 668.0f, 122.8f, 660.4f)
                curveTo(125.4f, 650.0f, 141.2f, 651.4f, 148.7f, 645.0f)
                curveTo(171.0f, 628.0f, 182.0f, 590.6f, 194.1f, 565.6f)
                curveTo(196.2f, 561.3f, 198.0f, 549.2f, 200.6f, 543.6f)
                curveTo(203.5f, 537.3f, 210.6f, 528.5f, 212.4f, 523.7f)
                curveTo(221.1f, 500.5f, 232.0f, 479.3f, 240.7f, 456.1f)
                curveTo(243.1f, 449.9f, 248.7f, 440.6f, 251.6f, 433.9f)
                curveTo(255.4f, 425.3f, 258.6f, 415.1f, 262.5f, 407.0f)
                curveTo(272.6f, 384.3f, 282.6f, 361.6f, 292.2f, 338.7f)
                curveTo(299.4f, 321.7f, 304.3f, 300.8f, 312.3f, 283.7f)
                curveTo(315.6f, 276.6f, 317.3f, 263.3f, 320.8f, 256.6f)
                curveTo(329.2f, 240.2f, 335.1f, 225.7f, 339.5f, 207.8f)
                curveTo(341.5f, 199.9f, 347.1f, 190.4f, 349.4f, 182.3f)
                curveTo(354.3f, 164.5f, 359.9f, 148.1f, 368.6f, 131.7f)
                curveTo(371.7f, 125.7f, 373.8f, 114.1f, 376.7f, 107.2f)
                curveTo(380.5f, 98.0f, 383.8f, 88.0f, 387.6f, 78.7f)
                curveTo(390.2f, 71.8f, 393.3f, 58.9f, 396.0f, 52.9f)
                curveTo(405.6f, 31.7f, 411.0f, 23.4f, 415.9f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(544.3f, 64.2f)
                curveTo(565.9f, 62.7f, 573.1f, 72.0f, 591.5f, 76.2f)
                curveTo(620.0f, 82.8f, 644.6f, 93.0f, 672.0f, 102.1f)
                curveTo(716.4f, 117.0f, 761.1f, 131.1f, 805.9f, 144.5f)
                curveTo(821.2f, 149.0f, 832.9f, 154.4f, 847.4f, 159.3f)
                curveTo(856.0f, 162.1f, 873.6f, 163.0f, 883.1f, 163.6f)
                curveTo(883.3f, 171.9f, 883.4f, 179.6f, 878.9f, 186.8f)
                curveTo(866.6f, 207.0f, 853.7f, 226.2f, 840.1f, 245.5f)
                curveTo(832.9f, 256.2f, 826.7f, 267.9f, 819.3f, 278.4f)
                curveTo(802.3f, 302.6f, 785.2f, 326.3f, 766.1f, 348.8f)
                curveTo(760.1f, 356.0f, 755.0f, 368.0f, 749.0f, 375.8f)
                curveTo(735.3f, 393.5f, 723.0f, 411.8f, 711.4f, 431.0f)
                curveTo(705.8f, 440.4f, 697.8f, 449.4f, 692.0f, 458.8f)
                curveTo(685.8f, 468.8f, 679.8f, 479.0f, 673.6f, 489.0f)
                curveTo(656.7f, 512.7f, 641.0f, 536.6f, 625.6f, 561.3f)
                curveTo(621.0f, 568.5f, 617.0f, 580.3f, 612.8f, 586.9f)
                curveTo(595.0f, 614.1f, 578.6f, 642.1f, 559.7f, 668.6f)
                curveTo(555.7f, 674.1f, 551.8f, 681.4f, 548.4f, 687.3f)
                curveTo(543.3f, 696.1f, 538.3f, 704.1f, 532.5f, 712.4f)
                curveTo(519.6f, 731.5f, 510.1f, 757.2f, 495.6f, 776.3f)
                curveTo(491.7f, 781.4f, 488.8f, 792.7f, 484.4f, 798.0f)
                curveTo(469.5f, 799.9f, 445.4f, 788.9f, 430.5f, 788.8f)
                curveTo(414.9f, 788.7f, 411.1f, 779.4f, 401.6f, 777.0f)
                curveTo(377.5f, 772.0f, 355.6f, 761.1f, 332.8f, 753.4f)
                curveTo(308.4f, 745.2f, 294.5f, 746.9f, 277.7f, 723.4f)
                curveTo(299.9f, 681.4f, 302.0f, 625.3f, 316.3f, 580.2f)
                curveTo(319.6f, 569.8f, 323.9f, 558.8f, 326.5f, 548.3f)
                lineTo(346.2f, 468.5f)
                curveTo(353.4f, 439.1f, 354.1f, 424.0f, 372.9f, 398.9f)
                curveTo(378.6f, 389.3f, 382.8f, 375.6f, 388.4f, 366.5f)
                curveTo(404.0f, 340.6f, 415.3f, 313.6f, 428.6f, 286.7f)
                curveTo(456.6f, 229.0f, 485.5f, 171.7f, 515.4f, 114.8f)
                curveTo(523.2f, 99.7f, 528.7f, 82.8f, 536.7f, 67.7f)
                curveTo(538.0f, 65.3f, 541.6f, 64.8f, 544.3f, 64.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.5f, 778.6f)
                lineTo(226.7f, 779.9f)
                curveTo(227.0f, 782.6f, 226.9f, 783.3f, 228.5f, 785.4f)
                curveTo(250.8f, 797.8f, 259.2f, 775.7f, 288.0f, 807.4f)
                curveTo(300.3f, 811.3f, 313.2f, 810.9f, 326.0f, 811.7f)
                curveTo(342.6f, 812.8f, 346.1f, 816.7f, 356.2f, 828.0f)
                curveTo(368.9f, 831.3f, 384.6f, 832.0f, 396.8f, 836.0f)
                curveTo(404.5f, 838.7f, 415.1f, 847.5f, 423.0f, 848.9f)
                curveTo(444.9f, 852.5f, 461.4f, 854.2f, 479.9f, 867.9f)
                curveTo(483.4f, 870.5f, 488.9f, 871.4f, 492.4f, 875.0f)
                curveTo(489.0f, 887.8f, 479.3f, 895.8f, 475.6f, 904.9f)
                curveTo(467.6f, 924.6f, 458.7f, 943.7f, 449.4f, 962.9f)
                curveTo(444.3f, 973.5f, 433.8f, 985.0f, 428.5f, 996.3f)
                curveTo(418.2f, 1018.4f, 405.3f, 1047.6f, 392.3f, 1068.2f)
                curveTo(382.3f, 1078.0f, 320.1f, 1051.1f, 305.7f, 1046.2f)
                lineTo(194.3f, 1008.0f)
                curveTo(179.9f, 1003.2f, 163.0f, 1000.9f, 148.9f, 995.1f)
                curveTo(143.6f, 992.8f, 133.1f, 983.7f, 128.4f, 979.7f)
                curveTo(145.6f, 961.3f, 156.1f, 924.8f, 164.4f, 902.0f)
                curveTo(166.9f, 895.2f, 174.7f, 884.3f, 177.9f, 876.6f)
                curveTo(182.4f, 865.9f, 186.4f, 854.8f, 191.0f, 844.3f)
                curveTo(200.9f, 821.6f, 212.5f, 799.7f, 225.5f, 778.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, fillAlpha = 0.945098f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 1043.6f)
                curveTo(3.9f, 1045.2f, 5.3f, 1043.1f, 8.9f, 1041.1f)
                curveTo(6.1f, 1060.1f, 5.2f, 1056.8f, 7.6f, 1077.3f)
                curveTo(4.0f, 1073.4f, 4.3f, 1073.4f, 0.0f, 1073.0f)
                lineTo(0.0f, 1043.6f)
                close()
            }
        }
        .build()
        return _emotionMarkerExclamation!!
    }

private var _emotionMarkerExclamation: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = EmotionMarkerImage.EmotionMarkerExclamation, contentDescription = "")
    }
}
