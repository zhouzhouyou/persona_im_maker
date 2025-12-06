package com.yuri.im.ui.resource.standard

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
import com.yuri.im.ui.resource.StandardSenderAvatar
import kotlin.Unit

public val StandardSenderAvatar.StandardJustine: ImageVector
    get() {
        if (_standardJustine != null) {
            return _standardJustine!!
        }
        _standardJustine = Builder(name = "StandardJustine", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 1024.0f, viewportHeight = 1024.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(345.7f, 50.4f)
                curveTo(375.3f, 49.0f, 409.3f, 50.5f, 439.1f, 50.7f)
                curveTo(460.0f, 50.9f, 493.2f, 50.7f, 513.5f, 54.5f)
                curveTo(530.2f, 57.5f, 552.8f, 64.2f, 570.0f, 68.1f)
                lineTo(661.1f, 89.4f)
                curveTo(698.4f, 98.4f, 737.2f, 104.8f, 770.0f, 126.9f)
                curveTo(786.3f, 137.9f, 808.9f, 169.4f, 820.5f, 186.1f)
                curveTo(814.8f, 206.6f, 809.2f, 225.9f, 802.5f, 246.2f)
                curveTo(799.3f, 255.9f, 797.0f, 267.1f, 793.8f, 277.1f)
                lineTo(773.1f, 343.9f)
                curveTo(768.0f, 360.4f, 755.9f, 393.6f, 756.2f, 409.2f)
                curveTo(756.6f, 435.3f, 769.4f, 468.0f, 777.7f, 493.3f)
                curveTo(776.3f, 500.9f, 758.2f, 545.1f, 754.5f, 551.6f)
                curveTo(753.1f, 554.1f, 751.6f, 555.6f, 749.1f, 557.1f)
                curveTo(740.5f, 562.2f, 729.6f, 561.8f, 721.5f, 568.2f)
                curveTo(705.3f, 581.0f, 673.6f, 695.4f, 655.7f, 723.3f)
                curveTo(648.5f, 734.4f, 636.8f, 743.6f, 627.3f, 752.6f)
                curveTo(615.3f, 764.2f, 603.0f, 775.7f, 590.6f, 786.9f)
                curveTo(583.4f, 793.3f, 563.4f, 806.8f, 562.5f, 816.7f)
                curveTo(560.9f, 833.7f, 659.5f, 862.7f, 673.3f, 880.7f)
                curveTo(688.2f, 899.9f, 700.3f, 922.3f, 713.9f, 942.5f)
                lineTo(742.0f, 984.5f)
                curveTo(745.8f, 990.0f, 754.9f, 1002.5f, 757.3f, 1007.8f)
                curveTo(769.4f, 1034.4f, 780.8f, 1061.2f, 791.6f, 1088.4f)
                curveTo(794.5f, 1095.7f, 801.6f, 1119.7f, 804.9f, 1123.8f)
                curveTo(814.2f, 1135.3f, 825.0f, 1139.2f, 836.6f, 1153.1f)
                curveTo(823.6f, 1151.3f, 802.2f, 1152.1f, 788.3f, 1152.0f)
                lineTo(704.5f, 1152.0f)
                lineTo(294.8f, 1152.8f)
                lineTo(179.3f, 1152.8f)
                curveTo(167.5f, 1152.8f, 135.9f, 1151.7f, 126.1f, 1153.2f)
                curveTo(139.8f, 1133.2f, 156.8f, 1095.4f, 167.9f, 1072.8f)
                lineTo(188.6f, 1029.6f)
                curveTo(194.8f, 1017.1f, 199.8f, 1007.6f, 205.3f, 994.5f)
                curveTo(213.2f, 975.4f, 216.8f, 941.1f, 227.0f, 925.1f)
                curveTo(233.9f, 914.2f, 266.0f, 896.4f, 276.0f, 886.7f)
                curveTo(300.3f, 863.3f, 320.5f, 814.8f, 322.4f, 781.5f)
                curveTo(307.2f, 769.3f, 305.2f, 762.1f, 292.9f, 747.8f)
                curveTo(293.5f, 740.3f, 298.6f, 722.5f, 300.3f, 713.2f)
                curveTo(293.7f, 705.3f, 281.2f, 693.2f, 273.7f, 685.6f)
                lineTo(227.2f, 638.8f)
                curveTo(220.6f, 632.2f, 200.7f, 613.9f, 197.2f, 605.6f)
                curveTo(185.4f, 576.1f, 168.8f, 540.5f, 160.2f, 511.0f)
                curveTo(156.4f, 497.8f, 187.3f, 420.8f, 189.7f, 403.1f)
                curveTo(190.6f, 396.0f, 205.6f, 378.3f, 205.1f, 367.3f)
                curveTo(201.9f, 293.1f, 187.9f, 219.7f, 184.0f, 145.4f)
                curveTo(183.6f, 139.0f, 180.1f, 122.4f, 183.6f, 117.5f)
                curveTo(194.3f, 102.4f, 207.5f, 81.5f, 219.9f, 68.4f)
                curveTo(232.5f, 64.6f, 252.2f, 62.2f, 265.5f, 60.1f)
                curveTo(292.3f, 55.9f, 318.6f, 52.2f, 345.7f, 50.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(373.1f, 647.5f)
                curveTo(352.5f, 627.7f, 346.2f, 618.4f, 340.1f, 589.7f)
                curveTo(329.2f, 538.0f, 336.5f, 501.7f, 377.6f, 466.3f)
                curveTo(385.9f, 476.5f, 396.7f, 490.3f, 405.8f, 499.5f)
                curveTo(398.5f, 502.4f, 371.0f, 508.5f, 368.5f, 512.1f)
                curveTo(373.7f, 514.0f, 400.2f, 510.0f, 408.0f, 509.5f)
                curveTo(414.2f, 512.6f, 418.1f, 516.3f, 423.5f, 520.7f)
                curveTo(416.2f, 521.0f, 401.7f, 520.6f, 394.8f, 523.2f)
                curveTo(392.6f, 524.1f, 392.5f, 526.5f, 391.7f, 529.0f)
                curveTo(391.5f, 531.4f, 391.5f, 535.3f, 390.8f, 537.4f)
                lineTo(390.4f, 538.9f)
                curveTo(391.3f, 542.0f, 395.1f, 545.5f, 397.4f, 548.0f)
                curveTo(385.1f, 554.4f, 379.5f, 559.3f, 371.0f, 570.0f)
                curveTo(373.2f, 576.1f, 379.4f, 590.7f, 385.1f, 593.7f)
                lineTo(386.7f, 592.9f)
                curveTo(388.9f, 587.3f, 382.3f, 574.0f, 387.6f, 567.9f)
                curveTo(390.2f, 568.2f, 390.1f, 568.5f, 390.2f, 572.8f)
                curveTo(390.7f, 589.4f, 395.5f, 606.7f, 407.8f, 618.5f)
                curveTo(415.6f, 626.0f, 434.8f, 627.4f, 441.1f, 617.6f)
                curveTo(454.1f, 597.5f, 450.4f, 573.0f, 448.1f, 550.7f)
                curveTo(469.8f, 563.2f, 467.4f, 569.5f, 471.4f, 592.2f)
                curveTo(471.8f, 594.6f, 472.1f, 597.0f, 473.6f, 598.7f)
                lineTo(475.8f, 598.4f)
                curveTo(480.1f, 593.8f, 478.1f, 585.3f, 478.4f, 577.1f)
                curveTo(488.6f, 580.0f, 500.2f, 586.2f, 510.0f, 590.9f)
                curveTo(530.7f, 600.6f, 557.8f, 605.0f, 580.4f, 603.2f)
                curveTo(585.6f, 628.9f, 596.9f, 660.1f, 626.9f, 664.5f)
                curveTo(644.2f, 667.0f, 654.9f, 659.1f, 668.0f, 649.4f)
                curveTo(650.6f, 717.8f, 650.1f, 712.4f, 593.7f, 759.0f)
                curveTo(582.4f, 768.4f, 569.7f, 782.9f, 557.2f, 791.7f)
                curveTo(549.8f, 796.9f, 539.1f, 798.2f, 530.5f, 795.9f)
                curveTo(514.1f, 791.6f, 495.7f, 780.7f, 479.8f, 773.8f)
                curveTo(439.8f, 756.2f, 394.4f, 727.9f, 366.7f, 693.5f)
                curveTo(353.3f, 677.0f, 336.7f, 649.2f, 324.4f, 630.3f)
                curveTo(345.4f, 646.5f, 347.8f, 649.8f, 373.1f, 647.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(550.0f, 726.3f)
                curveTo(559.5f, 725.1f, 562.6f, 727.0f, 571.4f, 730.5f)
                curveTo(564.8f, 748.0f, 561.9f, 753.8f, 543.0f, 750.9f)
                curveTo(533.6f, 748.5f, 527.5f, 744.6f, 519.0f, 739.9f)
                curveTo(531.0f, 730.4f, 534.8f, 729.1f, 550.0f, 726.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(590.5f, 688.8f)
                lineTo(591.1f, 689.7f)
                curveTo(592.8f, 697.8f, 584.0f, 704.6f, 577.0f, 706.5f)
                curveTo(572.4f, 696.7f, 583.3f, 693.0f, 590.5f, 688.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(539.4f, 762.9f)
                curveTo(544.8f, 763.3f, 554.0f, 762.0f, 557.7f, 764.0f)
                curveTo(558.2f, 766.7f, 557.7f, 766.4f, 555.7f, 769.2f)
                curveTo(547.2f, 773.2f, 541.9f, 773.4f, 539.4f, 762.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(266.6f, 144.6f)
                curveTo(278.0f, 147.4f, 292.0f, 153.0f, 302.9f, 155.4f)
                curveTo(334.5f, 162.3f, 367.6f, 171.8f, 399.2f, 177.7f)
                curveTo(424.4f, 182.3f, 454.2f, 184.0f, 480.0f, 187.2f)
                curveTo(565.5f, 197.8f, 646.6f, 202.5f, 732.7f, 203.1f)
                curveTo(727.5f, 205.7f, 719.5f, 209.8f, 713.9f, 210.8f)
                curveTo(666.7f, 219.6f, 609.3f, 205.4f, 564.5f, 222.3f)
                curveTo(563.2f, 222.8f, 552.6f, 232.3f, 550.1f, 234.4f)
                curveTo(545.1f, 231.0f, 540.9f, 228.0f, 537.1f, 223.2f)
                curveTo(535.1f, 220.7f, 535.4f, 219.8f, 532.8f, 217.3f)
                lineTo(531.2f, 217.8f)
                curveTo(527.1f, 224.9f, 521.0f, 229.2f, 514.6f, 234.3f)
                curveTo(509.5f, 231.1f, 505.6f, 228.1f, 500.9f, 224.5f)
                curveTo(500.4f, 220.1f, 500.5f, 215.7f, 497.3f, 212.8f)
                lineTo(495.4f, 213.4f)
                curveTo(493.0f, 216.7f, 493.0f, 221.8f, 492.5f, 226.1f)
                curveTo(499.3f, 231.9f, 506.0f, 235.9f, 511.4f, 243.0f)
                curveTo(506.2f, 262.8f, 488.7f, 268.5f, 491.2f, 291.5f)
                curveTo(494.7f, 293.6f, 495.9f, 290.3f, 499.1f, 290.7f)
                curveTo(506.9f, 291.7f, 510.9f, 299.4f, 509.7f, 306.5f)
                curveTo(508.5f, 313.9f, 503.8f, 316.1f, 498.4f, 320.0f)
                curveTo(493.8f, 318.1f, 489.8f, 316.3f, 484.8f, 315.4f)
                lineTo(483.8f, 316.6f)
                curveTo(484.0f, 320.5f, 489.9f, 326.8f, 492.4f, 330.7f)
                curveTo(497.9f, 339.4f, 483.7f, 345.7f, 479.4f, 351.9f)
                curveTo(478.1f, 353.9f, 476.9f, 358.2f, 476.2f, 360.6f)
                curveTo(472.1f, 359.7f, 468.0f, 359.3f, 463.8f, 359.0f)
                curveTo(426.8f, 356.2f, 390.5f, 349.4f, 354.1f, 342.6f)
                curveTo(330.6f, 338.2f, 307.9f, 334.7f, 285.0f, 327.3f)
                curveTo(283.2f, 286.8f, 278.2f, 247.9f, 273.5f, 207.6f)
                curveTo(271.0f, 186.5f, 269.4f, 165.7f, 266.6f, 144.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.3f, 116.6f)
                curveTo(254.2f, 99.8f, 291.4f, 93.0f, 325.7f, 88.0f)
                curveTo(446.2f, 70.3f, 558.7f, 85.6f, 674.4f, 120.2f)
                curveTo(687.6f, 124.1f, 708.2f, 132.4f, 720.3f, 139.0f)
                curveTo(712.3f, 141.4f, 710.7f, 141.5f, 705.6f, 148.1f)
                lineTo(705.8f, 150.1f)
                curveTo(711.2f, 151.4f, 717.4f, 146.7f, 722.3f, 143.8f)
                curveTo(742.4f, 156.6f, 738.1f, 162.8f, 723.2f, 177.7f)
                curveTo(719.2f, 173.4f, 714.0f, 168.2f, 707.7f, 171.0f)
                curveTo(706.1f, 176.2f, 712.7f, 178.5f, 716.7f, 180.5f)
                curveTo(717.2f, 185.1f, 717.6f, 189.9f, 718.2f, 194.5f)
                lineTo(691.9f, 194.2f)
                curveTo(692.4f, 185.4f, 693.3f, 182.8f, 696.4f, 174.2f)
                curveTo(685.9f, 181.2f, 680.4f, 181.2f, 683.0f, 195.0f)
                curveTo(675.1f, 194.4f, 664.2f, 194.1f, 656.4f, 192.1f)
                curveTo(655.3f, 191.9f, 653.1f, 187.7f, 652.6f, 186.5f)
                lineTo(650.9f, 186.9f)
                lineTo(649.9f, 191.3f)
                curveTo(645.3f, 193.6f, 605.1f, 190.0f, 600.7f, 184.1f)
                lineTo(601.8f, 179.6f)
                curveTo(571.4f, 180.6f, 542.5f, 180.5f, 512.3f, 176.4f)
                curveTo(434.2f, 166.1f, 357.6f, 154.9f, 281.4f, 134.3f)
                curveTo(262.0f, 129.0f, 242.8f, 122.1f, 223.3f, 116.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfdfdfd)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(601.8f, 179.6f)
                curveTo(608.9f, 178.5f, 614.1f, 177.6f, 621.3f, 177.5f)
                curveTo(616.9f, 182.4f, 605.0f, 182.6f, 600.7f, 184.1f)
                lineTo(601.8f, 179.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(425.6f, 457.7f)
                curveTo(426.3f, 457.8f, 426.9f, 457.8f, 427.6f, 457.8f)
                curveTo(438.6f, 458.6f, 449.7f, 460.9f, 460.8f, 462.1f)
                curveTo(478.5f, 464.0f, 496.4f, 465.0f, 514.3f, 466.4f)
                curveTo(518.1f, 466.8f, 524.5f, 466.9f, 527.8f, 468.5f)
                curveTo(529.2f, 469.2f, 598.2f, 548.1f, 606.1f, 557.2f)
                curveTo(587.3f, 560.3f, 532.9f, 546.6f, 512.8f, 543.9f)
                curveTo(475.3f, 538.8f, 444.9f, 488.7f, 425.6f, 457.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.8f, 444.2f)
                curveTo(274.1f, 440.8f, 284.2f, 461.2f, 281.8f, 483.4f)
                curveTo(279.8f, 503.0f, 269.5f, 520.8f, 254.7f, 533.5f)
                curveTo(251.3f, 532.1f, 247.8f, 530.2f, 244.5f, 528.5f)
                curveTo(239.7f, 516.3f, 241.1f, 494.2f, 241.3f, 480.8f)
                curveTo(241.7f, 477.3f, 242.6f, 473.3f, 240.6f, 470.7f)
                lineTo(238.8f, 470.7f)
                curveTo(227.5f, 483.2f, 234.2f, 519.3f, 229.4f, 529.7f)
                curveTo(223.5f, 531.3f, 219.4f, 528.5f, 217.6f, 522.8f)
                curveTo(208.0f, 492.1f, 217.6f, 456.9f, 248.8f, 444.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(335.0f, 426.7f)
                curveTo(348.4f, 437.4f, 358.2f, 448.9f, 373.7f, 459.6f)
                curveTo(364.6f, 465.3f, 321.1f, 493.8f, 318.5f, 501.4f)
                curveTo(320.1f, 503.0f, 324.2f, 502.4f, 327.0f, 502.4f)
                curveTo(335.7f, 509.4f, 325.1f, 546.7f, 326.6f, 561.1f)
                curveTo(329.2f, 585.9f, 332.6f, 608.2f, 347.1f, 629.1f)
                curveTo(349.3f, 632.3f, 352.6f, 636.3f, 355.1f, 639.4f)
                curveTo(287.6f, 608.2f, 327.3f, 523.9f, 317.1f, 515.2f)
                curveTo(312.4f, 516.9f, 308.9f, 524.8f, 306.3f, 529.4f)
                curveTo(304.4f, 494.4f, 320.3f, 458.5f, 335.0f, 426.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(280.9f, 526.2f)
                curveTo(292.5f, 527.6f, 296.0f, 530.3f, 306.3f, 535.7f)
                curveTo(306.9f, 540.7f, 307.6f, 545.8f, 308.1f, 550.8f)
                curveTo(308.6f, 554.6f, 309.5f, 562.9f, 307.1f, 565.9f)
                curveTo(299.6f, 561.9f, 297.2f, 538.5f, 286.3f, 533.5f)
                curveTo(269.1f, 534.6f, 264.4f, 567.9f, 270.3f, 575.9f)
                curveTo(272.6f, 574.3f, 273.6f, 566.8f, 275.5f, 562.8f)
                curveTo(278.4f, 556.6f, 281.4f, 550.8f, 284.6f, 544.7f)
                curveTo(293.2f, 554.9f, 295.0f, 558.6f, 301.2f, 570.5f)
                curveTo(301.3f, 570.8f, 301.6f, 572.4f, 301.5f, 572.6f)
                curveTo(300.2f, 576.1f, 289.0f, 582.4f, 286.8f, 590.8f)
                curveTo(285.1f, 597.2f, 307.0f, 623.3f, 311.3f, 631.4f)
                curveTo(295.0f, 623.4f, 273.6f, 614.0f, 265.7f, 596.4f)
                curveTo(255.5f, 573.5f, 253.6f, 538.0f, 280.9f, 526.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.5f, 162.2f)
                curveTo(231.4f, 163.3f, 238.8f, 164.1f, 244.0f, 164.7f)
                curveTo(245.6f, 193.6f, 251.0f, 224.9f, 254.5f, 253.9f)
                curveTo(256.1f, 267.2f, 260.4f, 306.2f, 263.5f, 317.2f)
                curveTo(259.2f, 315.6f, 252.6f, 313.4f, 249.5f, 310.0f)
                curveTo(244.5f, 304.4f, 225.9f, 176.2f, 226.5f, 162.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.1f, 383.0f)
                curveTo(230.9f, 388.2f, 241.2f, 394.1f, 250.9f, 399.6f)
                curveTo(254.0f, 426.2f, 250.8f, 434.7f, 229.6f, 450.2f)
                lineTo(222.1f, 456.0f)
                curveTo(196.3f, 425.4f, 201.4f, 413.3f, 221.1f, 383.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(434.4f, 566.6f)
                curveTo(437.2f, 566.6f, 440.2f, 567.0f, 441.3f, 570.2f)
                curveTo(446.0f, 584.1f, 438.4f, 619.8f, 418.4f, 615.2f)
                curveTo(411.6f, 613.7f, 406.8f, 604.9f, 403.7f, 599.0f)
                curveTo(401.7f, 592.6f, 399.1f, 581.1f, 399.8f, 574.4f)
                curveTo(401.6f, 567.0f, 414.4f, 568.9f, 415.7f, 575.6f)
                curveTo(416.9f, 581.6f, 413.8f, 590.5f, 421.0f, 592.2f)
                curveTo(421.8f, 591.9f, 422.8f, 591.6f, 424.0f, 591.2f)
                curveTo(426.9f, 580.4f, 424.8f, 573.8f, 434.4f, 566.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(367.9f, 436.7f)
                curveTo(373.3f, 437.3f, 387.4f, 445.3f, 397.7f, 447.2f)
                curveTo(405.3f, 455.3f, 432.2f, 505.6f, 433.0f, 513.9f)
                curveTo(424.4f, 511.5f, 377.2f, 447.8f, 367.9f, 436.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(262.5f, 403.3f)
                curveTo(277.8f, 408.7f, 292.9f, 414.4f, 308.0f, 420.4f)
                curveTo(300.5f, 422.4f, 296.0f, 424.1f, 288.7f, 427.0f)
                curveTo(274.2f, 433.5f, 271.6f, 434.3f, 255.8f, 436.3f)
                curveTo(261.8f, 426.4f, 261.9f, 414.6f, 262.5f, 403.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.7f, 560.8f)
                curveTo(229.9f, 563.0f, 234.1f, 567.5f, 237.1f, 570.4f)
                lineTo(239.4f, 583.8f)
                curveTo(243.4f, 576.2f, 244.1f, 574.7f, 249.8f, 568.4f)
                curveTo(250.8f, 576.3f, 258.3f, 595.4f, 252.6f, 600.4f)
                curveTo(251.1f, 596.5f, 250.3f, 593.4f, 247.7f, 590.2f)
                lineTo(245.6f, 590.1f)
                curveTo(242.8f, 593.3f, 245.2f, 596.9f, 242.8f, 602.3f)
                lineTo(241.0f, 602.7f)
                curveTo(225.0f, 596.1f, 224.5f, 575.3f, 226.7f, 560.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.6f, 317.6f)
                curveTo(519.3f, 318.5f, 522.0f, 322.3f, 526.6f, 327.2f)
                lineTo(527.6f, 341.3f)
                curveTo(523.7f, 344.0f, 519.5f, 347.4f, 515.7f, 350.3f)
                curveTo(511.4f, 349.8f, 504.4f, 344.2f, 500.5f, 341.5f)
                curveTo(500.8f, 335.7f, 501.4f, 332.3f, 502.4f, 326.7f)
                curveTo(506.4f, 322.1f, 507.4f, 320.9f, 512.6f, 317.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(529.1f, 231.7f)
                curveTo(536.7f, 232.3f, 546.8f, 237.8f, 545.1f, 247.1f)
                curveTo(543.6f, 256.0f, 539.5f, 258.0f, 532.6f, 263.1f)
                curveTo(532.0f, 263.8f, 531.6f, 263.9f, 530.6f, 264.4f)
                curveTo(514.5f, 255.9f, 515.6f, 242.1f, 529.1f, 231.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(514.2f, 261.0f)
                curveTo(527.0f, 262.5f, 534.7f, 283.4f, 514.2f, 292.2f)
                curveTo(494.1f, 284.6f, 497.5f, 270.4f, 514.2f, 261.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(193.3f, 450.6f)
                curveTo(198.1f, 453.3f, 209.2f, 463.8f, 213.8f, 467.9f)
                curveTo(210.8f, 473.0f, 207.5f, 480.1f, 204.8f, 485.4f)
                curveTo(203.5f, 488.4f, 202.8f, 491.1f, 199.8f, 492.6f)
                curveTo(196.5f, 493.3f, 193.0f, 491.2f, 189.7f, 489.7f)
                curveTo(191.8f, 477.1f, 192.2f, 463.5f, 193.3f, 450.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(754.5f, 143.9f)
                curveTo(758.8f, 145.1f, 769.2f, 157.9f, 773.2f, 162.4f)
                curveTo(768.3f, 167.2f, 765.1f, 170.1f, 759.7f, 174.4f)
                curveTo(748.7f, 178.6f, 733.2f, 160.7f, 754.5f, 143.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(528.6f, 289.8f)
                curveTo(532.4f, 290.8f, 541.7f, 295.2f, 545.4f, 296.9f)
                curveTo(541.5f, 304.5f, 538.1f, 312.0f, 533.9f, 319.7f)
                curveTo(523.4f, 322.6f, 508.6f, 300.7f, 528.6f, 289.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(547.5f, 260.8f)
                curveTo(550.5f, 261.6f, 554.8f, 263.6f, 556.7f, 266.2f)
                curveTo(558.5f, 273.5f, 550.3f, 286.0f, 546.6f, 293.5f)
                curveTo(530.4f, 283.0f, 533.0f, 270.8f, 547.5f, 260.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(559.6f, 349.3f)
                curveTo(565.3f, 350.5f, 582.3f, 358.2f, 582.2f, 365.4f)
                curveTo(580.6f, 368.0f, 578.8f, 368.4f, 576.0f, 369.6f)
                curveTo(571.2f, 370.8f, 560.9f, 372.1f, 556.6f, 369.4f)
                curveTo(548.0f, 364.0f, 555.8f, 354.7f, 559.6f, 349.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(530.6f, 347.7f)
                curveTo(536.7f, 348.5f, 540.7f, 354.0f, 544.9f, 358.6f)
                curveTo(545.1f, 361.9f, 545.8f, 366.8f, 544.2f, 369.5f)
                curveTo(540.5f, 371.1f, 539.5f, 370.2f, 534.8f, 369.7f)
                curveTo(530.0f, 368.9f, 522.1f, 368.3f, 517.1f, 367.7f)
                curveTo(520.2f, 357.7f, 521.8f, 353.3f, 530.6f, 347.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(321.7f, 424.0f)
                lineTo(323.2f, 424.4f)
                lineTo(323.6f, 426.1f)
                curveTo(320.0f, 433.1f, 290.9f, 453.8f, 284.6f, 453.5f)
                curveTo(282.2f, 450.6f, 281.6f, 449.7f, 279.8f, 446.4f)
                lineTo(280.3f, 444.8f)
                curveTo(288.0f, 439.6f, 312.9f, 427.1f, 321.7f, 424.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(494.0f, 347.7f)
                curveTo(501.3f, 349.7f, 507.5f, 353.7f, 510.5f, 360.8f)
                curveTo(510.4f, 364.6f, 510.9f, 363.2f, 508.5f, 366.0f)
                curveTo(505.2f, 367.7f, 500.1f, 366.7f, 496.2f, 366.3f)
                curveTo(490.2f, 365.9f, 484.1f, 365.4f, 478.1f, 365.0f)
                curveTo(483.6f, 358.4f, 487.9f, 353.7f, 494.0f, 347.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(736.7f, 174.8f)
                curveTo(742.5f, 175.2f, 755.0f, 180.7f, 753.1f, 188.4f)
                curveTo(750.9f, 190.8f, 746.9f, 191.1f, 743.6f, 191.8f)
                curveTo(736.8f, 192.6f, 727.2f, 194.7f, 725.7f, 186.0f)
                curveTo(727.6f, 180.4f, 731.9f, 177.8f, 736.7f, 174.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(564.4f, 232.9f)
                curveTo(568.2f, 233.1f, 568.9f, 232.3f, 571.1f, 234.5f)
                curveTo(572.4f, 241.0f, 563.5f, 255.6f, 560.2f, 262.7f)
                curveTo(556.2f, 258.8f, 551.1f, 249.6f, 552.8f, 244.0f)
                curveTo(554.7f, 237.8f, 559.3f, 235.8f, 564.4f, 232.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(391.7f, 529.0f)
                curveTo(397.5f, 531.1f, 421.8f, 524.1f, 429.9f, 532.2f)
                lineTo(430.7f, 534.8f)
                lineTo(429.7f, 536.5f)
                curveTo(418.6f, 536.9f, 401.1f, 538.8f, 390.8f, 537.4f)
                curveTo(391.5f, 535.3f, 391.5f, 531.4f, 391.7f, 529.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(316.9f, 446.9f)
                lineTo(317.9f, 448.5f)
                curveTo(316.2f, 456.9f, 309.8f, 466.7f, 304.2f, 473.0f)
                curveTo(301.2f, 476.3f, 300.0f, 475.8f, 296.2f, 475.9f)
                curveTo(293.7f, 472.7f, 294.0f, 473.9f, 293.6f, 470.6f)
                curveTo(296.6f, 463.3f, 310.4f, 452.4f, 316.9f, 446.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(774.3f, 173.1f)
                curveTo(776.6f, 173.8f, 785.4f, 181.5f, 787.7f, 183.4f)
                curveTo(780.8f, 185.9f, 776.7f, 186.7f, 769.5f, 187.8f)
                curveTo(765.5f, 188.8f, 762.5f, 190.0f, 758.9f, 187.5f)
                lineTo(758.8f, 185.5f)
                curveTo(762.5f, 178.7f, 767.6f, 176.6f, 774.3f, 173.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(535.6f, 330.4f)
                curveTo(540.1f, 331.6f, 550.0f, 339.7f, 554.1f, 342.9f)
                curveTo(556.8f, 345.0f, 556.3f, 344.8f, 556.5f, 347.6f)
                curveTo(542.3f, 352.7f, 536.4f, 343.9f, 535.6f, 330.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(722.0f, 130.9f)
                curveTo(728.4f, 131.6f, 742.2f, 134.2f, 746.9f, 138.4f)
                lineTo(746.9f, 140.3f)
                lineTo(743.8f, 143.3f)
                curveTo(742.4f, 145.2f, 742.2f, 145.4f, 740.3f, 146.8f)
                curveTo(734.6f, 146.1f, 726.4f, 135.4f, 722.0f, 130.9f)
                close()
            }
        }
        .build()
        return _standardJustine!!
    }

private var _standardJustine: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = StandardSenderAvatar.StandardJustine, contentDescription = "")
    }
}
