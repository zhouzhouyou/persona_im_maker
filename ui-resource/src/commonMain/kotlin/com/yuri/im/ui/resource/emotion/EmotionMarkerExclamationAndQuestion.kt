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

public val EmotionMarkerImage.EmotionMarkerExclamationAndQuestion: ImageVector
    get() {
        if (_emotionMarkerExclamationAndQuestion != null) {
            return _emotionMarkerExclamationAndQuestion!!
        }
        _emotionMarkerExclamationAndQuestion = Builder(name = "EmotionMarkerExclamationAndQuestion",
                defaultWidth = 281.0.dp, defaultHeight = 256.0.dp, viewportWidth = 1124.0f,
                viewportHeight = 1024.0f).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.5f, 0.0f)
                lineTo(487.7f, 0.0f)
                curveTo(494.5f, 4.2f, 496.5f, 6.6f, 505.0f, 6.9f)
                curveTo(518.3f, 7.5f, 536.2f, 9.0f, 549.2f, 7.1f)
                curveTo(554.7f, 7.4f, 560.0f, 7.6f, 565.6f, 8.1f)
                curveTo(576.1f, 11.8f, 582.5f, 16.3f, 592.2f, 21.6f)
                curveTo(609.4f, 20.5f, 629.5f, 11.5f, 647.5f, 9.2f)
                curveTo(655.1f, 8.2f, 681.9f, 9.0f, 686.2f, 5.5f)
                curveTo(685.6f, 3.3f, 685.6f, 2.8f, 685.6f, 0.6f)
                lineTo(685.6f, 0.0f)
                lineTo(794.0f, 0.0f)
                curveTo(801.8f, 11.2f, 829.8f, 26.3f, 841.8f, 34.4f)
                lineTo(908.1f, 79.7f)
                curveTo(931.9f, 96.0f, 955.2f, 112.7f, 978.7f, 129.5f)
                curveTo(988.4f, 136.5f, 999.4f, 142.5f, 1009.3f, 149.4f)
                curveTo(1019.5f, 156.5f, 1030.0f, 163.9f, 1039.9f, 171.5f)
                curveTo(1045.7f, 176.0f, 1058.3f, 180.5f, 1062.4f, 185.3f)
                curveTo(1067.1f, 190.7f, 1065.6f, 204.9f, 1064.5f, 211.8f)
                lineTo(1029.6f, 440.1f)
                curveTo(1025.6f, 467.0f, 1023.6f, 500.3f, 1017.0f, 525.9f)
                curveTo(1014.3f, 536.3f, 965.8f, 567.5f, 955.8f, 574.7f)
                lineTo(853.9f, 647.9f)
                curveTo(840.4f, 657.5f, 811.0f, 676.0f, 798.2f, 688.4f)
                curveTo(779.7f, 706.3f, 772.2f, 774.2f, 762.4f, 800.1f)
                curveTo(759.3f, 808.2f, 759.8f, 823.2f, 756.7f, 831.9f)
                curveTo(755.1f, 840.7f, 748.2f, 854.1f, 747.3f, 862.1f)
                curveTo(744.4f, 886.4f, 735.2f, 909.3f, 730.1f, 932.3f)
                lineTo(716.0f, 993.6f)
                curveTo(714.1f, 1002.1f, 711.6f, 1016.4f, 708.4f, 1024.0f)
                lineTo(645.4f, 1024.0f)
                curveTo(644.2f, 1018.1f, 638.3f, 1018.7f, 633.4f, 1018.5f)
                curveTo(609.0f, 1017.7f, 584.8f, 1010.9f, 560.8f, 1008.3f)
                curveTo(520.8f, 1002.7f, 477.5f, 1002.9f, 438.0f, 995.8f)
                curveTo(402.0f, 989.3f, 368.1f, 989.1f, 332.5f, 983.5f)
                curveTo(327.2f, 982.6f, 322.7f, 971.3f, 320.3f, 966.5f)
                curveTo(301.5f, 962.7f, 264.5f, 963.1f, 243.8f, 961.8f)
                curveTo(163.1f, 956.8f, 80.5f, 958.8f, 0.0f, 955.4f)
                lineTo(0.0f, 596.4f)
                curveTo(7.8f, 596.5f, 20.7f, 598.6f, 27.2f, 595.3f)
                curveTo(31.3f, 589.5f, 32.7f, 556.2f, 33.7f, 547.6f)
                curveTo(45.3f, 446.5f, 41.2f, 344.8f, 45.9f, 243.4f)
                curveTo(46.8f, 222.8f, 45.5f, 201.3f, 46.2f, 180.6f)
                lineTo(50.6f, 53.5f)
                curveTo(51.4f, 35.3f, 53.1f, 18.7f, 53.5f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(651.2f, 92.4f)
                curveTo(668.2f, 89.0f, 724.4f, 95.4f, 743.2f, 99.7f)
                curveTo(753.8f, 102.1f, 778.3f, 110.5f, 789.2f, 114.5f)
                curveTo(849.1f, 136.7f, 903.5f, 179.0f, 931.1f, 237.7f)
                curveTo(935.9f, 248.0f, 945.2f, 272.1f, 947.0f, 283.6f)
                curveTo(952.1f, 316.5f, 951.2f, 359.6f, 944.4f, 392.3f)
                curveTo(942.9f, 399.2f, 939.1f, 401.8f, 937.1f, 407.2f)
                curveTo(934.3f, 414.6f, 931.7f, 425.7f, 928.9f, 432.8f)
                curveTo(925.4f, 441.9f, 914.3f, 466.5f, 908.5f, 474.0f)
                curveTo(887.5f, 500.8f, 857.3f, 533.6f, 826.4f, 548.5f)
                curveTo(815.7f, 553.7f, 804.0f, 556.3f, 793.4f, 560.7f)
                curveTo(777.8f, 567.1f, 760.9f, 574.6f, 745.9f, 581.5f)
                curveTo(689.7f, 607.1f, 698.0f, 626.0f, 680.7f, 673.2f)
                curveTo(659.9f, 669.5f, 637.3f, 661.2f, 617.2f, 654.9f)
                curveTo(596.5f, 648.5f, 575.9f, 643.4f, 555.1f, 637.7f)
                curveTo(541.7f, 634.0f, 532.4f, 628.8f, 517.5f, 626.5f)
                curveTo(520.1f, 612.6f, 522.4f, 600.7f, 525.8f, 587.0f)
                curveTo(531.1f, 571.3f, 536.0f, 554.7f, 541.6f, 539.0f)
                curveTo(550.3f, 514.1f, 555.5f, 511.6f, 568.9f, 492.8f)
                curveTo(602.0f, 446.3f, 651.1f, 432.9f, 700.9f, 411.0f)
                curveTo(722.1f, 401.6f, 741.7f, 382.3f, 750.0f, 360.0f)
                curveTo(755.1f, 344.6f, 756.6f, 317.8f, 749.2f, 303.6f)
                curveTo(734.1f, 274.8f, 686.5f, 250.9f, 655.9f, 267.6f)
                curveTo(621.5f, 286.5f, 611.1f, 316.7f, 599.8f, 351.6f)
                curveTo(592.2f, 348.3f, 581.8f, 341.7f, 573.9f, 337.6f)
                lineTo(505.9f, 302.7f)
                curveTo(488.7f, 293.8f, 468.7f, 286.7f, 453.0f, 275.4f)
                curveTo(450.5f, 273.7f, 449.7f, 270.0f, 449.4f, 267.0f)
                curveTo(448.5f, 259.4f, 451.9f, 252.8f, 453.6f, 245.9f)
                curveTo(459.6f, 220.7f, 477.0f, 192.7f, 494.2f, 172.5f)
                curveTo(520.2f, 141.8f, 564.4f, 112.4f, 602.8f, 99.9f)
                curveTo(613.7f, 96.3f, 639.3f, 93.5f, 651.2f, 92.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.4f, 87.9f)
                curveTo(245.4f, 93.4f, 304.5f, 97.8f, 363.7f, 101.1f)
                curveTo(394.0f, 102.6f, 417.6f, 105.3f, 448.1f, 103.7f)
                curveTo(449.5f, 139.3f, 443.1f, 137.1f, 433.2f, 167.5f)
                lineTo(388.4f, 306.5f)
                curveTo(382.1f, 325.3f, 373.3f, 345.7f, 368.1f, 364.5f)
                curveTo(359.7f, 395.0f, 354.6f, 426.3f, 343.1f, 456.3f)
                curveTo(339.3f, 466.2f, 338.9f, 486.5f, 334.9f, 495.9f)
                curveTo(322.6f, 524.6f, 320.1f, 555.1f, 311.4f, 584.1f)
                curveTo(300.4f, 614.0f, 291.6f, 629.2f, 292.1f, 661.2f)
                curveTo(237.6f, 657.9f, 191.2f, 646.5f, 137.1f, 644.4f)
                curveTo(130.0f, 602.4f, 132.6f, 559.1f, 132.4f, 516.4f)
                curveTo(132.3f, 485.0f, 125.6f, 459.1f, 126.1f, 428.8f)
                curveTo(126.5f, 405.2f, 133.3f, 376.4f, 137.5f, 352.8f)
                lineTo(162.1f, 219.5f)
                curveTo(166.7f, 195.3f, 170.4f, 171.3f, 175.2f, 147.1f)
                curveTo(178.3f, 131.5f, 185.9f, 102.4f, 186.4f, 87.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(500.9f, 683.7f)
                curveTo(507.3f, 692.2f, 541.5f, 699.5f, 553.5f, 703.5f)
                curveTo(587.9f, 715.1f, 622.7f, 725.6f, 657.9f, 734.9f)
                curveTo(662.5f, 736.1f, 678.3f, 746.2f, 683.4f, 749.3f)
                curveTo(677.9f, 748.8f, 671.8f, 748.0f, 666.2f, 747.4f)
                curveTo(664.1f, 785.9f, 651.7f, 821.3f, 639.7f, 857.4f)
                curveTo(636.2f, 867.8f, 634.8f, 880.3f, 631.7f, 890.3f)
                curveTo(627.8f, 902.5f, 623.2f, 915.0f, 619.2f, 927.4f)
                curveTo(618.3f, 928.1f, 615.5f, 930.9f, 614.6f, 930.6f)
                curveTo(568.6f, 914.1f, 521.4f, 902.0f, 475.2f, 886.1f)
                curveTo(458.5f, 882.0f, 434.2f, 881.7f, 444.2f, 855.5f)
                curveTo(461.1f, 810.8f, 472.8f, 719.3f, 500.9f, 683.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(114.3f, 678.7f)
                curveTo(116.8f, 681.0f, 116.8f, 687.5f, 117.2f, 691.3f)
                curveTo(131.6f, 692.9f, 148.0f, 692.0f, 162.9f, 693.1f)
                curveTo(187.2f, 694.9f, 212.3f, 697.4f, 236.4f, 700.3f)
                curveTo(257.4f, 702.9f, 302.9f, 701.5f, 320.3f, 714.0f)
                lineTo(320.4f, 715.3f)
                curveTo(316.4f, 716.9f, 313.5f, 716.5f, 309.2f, 716.4f)
                curveTo(308.1f, 754.4f, 302.5f, 777.5f, 292.6f, 813.6f)
                curveTo(288.7f, 827.9f, 286.0f, 859.5f, 284.4f, 874.8f)
                curveTo(284.1f, 875.2f, 284.1f, 875.2f, 283.6f, 875.6f)
                curveTo(274.0f, 883.2f, 157.1f, 867.4f, 136.7f, 865.5f)
                curveTo(117.7f, 863.7f, 98.5f, 863.5f, 79.6f, 861.2f)
                curveTo(86.7f, 819.0f, 89.3f, 777.2f, 96.6f, 735.1f)
                curveTo(101.1f, 708.9f, 100.2f, 701.5f, 114.3f, 678.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, fillAlpha = 0.0117647f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(561.3f, 0.0f)
                lineTo(685.6f, 0.0f)
                lineTo(685.6f, 0.6f)
                curveTo(685.6f, 2.8f, 685.6f, 3.3f, 686.2f, 5.5f)
                curveTo(681.9f, 9.0f, 655.1f, 8.2f, 647.5f, 9.2f)
                curveTo(629.5f, 11.5f, 609.4f, 20.5f, 592.2f, 21.6f)
                curveTo(582.5f, 16.3f, 576.1f, 11.8f, 565.6f, 8.1f)
                curveTo(557.5f, 5.0f, 554.6f, 4.6f, 546.3f, 4.6f)
                curveTo(552.0f, 2.7f, 556.2f, 4.5f, 561.3f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, fillAlpha = 0.603922f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(487.7f, 0.0f)
                lineTo(529.7f, 0.0f)
                curveTo(528.4f, 2.2f, 528.0f, 3.0f, 525.7f, 4.3f)
                lineTo(525.9f, 5.6f)
                curveTo(531.2f, 7.3f, 542.6f, 6.5f, 549.2f, 7.1f)
                curveTo(536.2f, 9.0f, 518.3f, 7.5f, 505.0f, 6.9f)
                curveTo(496.5f, 6.6f, 494.5f, 4.2f, 487.7f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, fillAlpha = 0.352941f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(529.7f, 0.0f)
                lineTo(561.3f, 0.0f)
                curveTo(556.2f, 4.5f, 552.0f, 2.7f, 546.3f, 4.6f)
                curveTo(554.6f, 4.6f, 557.5f, 5.0f, 565.6f, 8.1f)
                curveTo(560.0f, 7.6f, 554.7f, 7.4f, 549.2f, 7.1f)
                curveTo(542.6f, 6.5f, 531.2f, 7.3f, 525.9f, 5.6f)
                lineTo(525.7f, 4.3f)
                curveTo(528.0f, 3.0f, 528.4f, 2.2f, 529.7f, 0.0f)
                close()
            }
        }
        .build()
        return _emotionMarkerExclamationAndQuestion!!
    }

private var _emotionMarkerExclamationAndQuestion: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = EmotionMarkerImage.EmotionMarkerExclamationAndQuestion, contentDescription = "")
    }
}
