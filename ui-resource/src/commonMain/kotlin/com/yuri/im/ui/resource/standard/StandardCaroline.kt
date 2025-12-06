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

public val StandardSenderAvatar.StandardCaroline: ImageVector
    get() {
        if (_standardCaroline != null) {
            return _standardCaroline!!
        }
        _standardCaroline = Builder(name = "StandardCaroline", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 1024.0f, viewportHeight = 1024.0f).apply {
            path(fill = SolidColor(Color(0xFF010200)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(820.7f, 1001.4f)
                curveTo(776.0f, 1000.3f, 725.5f, 1001.4f, 680.3f, 1001.4f)
                lineTo(394.1f, 1001.5f)
                curveTo(366.1f, 1001.5f, 338.2f, 1001.8f, 310.2f, 1000.4f)
                curveTo(309.4f, 1000.3f, 307.9f, 1001.2f, 307.2f, 1001.6f)
                lineTo(305.8f, 1000.5f)
                curveTo(303.2f, 994.0f, 315.3f, 961.2f, 317.9f, 953.4f)
                lineTo(336.7f, 894.4f)
                lineTo(355.1f, 837.2f)
                curveTo(358.3f, 826.7f, 367.5f, 792.1f, 374.7f, 786.3f)
                curveTo(396.4f, 768.6f, 431.0f, 762.6f, 452.1f, 743.8f)
                curveTo(454.6f, 741.5f, 463.0f, 729.7f, 463.6f, 727.0f)
                curveTo(463.0f, 725.1f, 461.4f, 723.1f, 459.6f, 722.3f)
                curveTo(442.5f, 715.2f, 428.4f, 704.9f, 412.7f, 695.3f)
                curveTo(384.4f, 678.0f, 354.5f, 660.3f, 341.1f, 628.3f)
                curveTo(336.7f, 617.8f, 328.9f, 603.5f, 322.8f, 593.7f)
                curveTo(316.6f, 586.0f, 298.1f, 572.4f, 289.6f, 565.3f)
                curveTo(276.6f, 554.6f, 248.1f, 553.7f, 236.3f, 542.1f)
                curveTo(217.1f, 523.2f, 219.3f, 503.8f, 226.1f, 480.4f)
                curveTo(232.7f, 458.2f, 240.7f, 429.3f, 240.3f, 406.6f)
                curveTo(240.1f, 398.3f, 228.1f, 374.5f, 224.4f, 365.6f)
                curveTo(211.2f, 333.2f, 197.5f, 301.0f, 183.2f, 269.0f)
                curveTo(180.3f, 262.4f, 168.0f, 237.8f, 168.3f, 232.7f)
                curveTo(169.3f, 221.8f, 171.6f, 193.0f, 179.9f, 185.6f)
                curveTo(194.0f, 173.2f, 208.6f, 156.2f, 223.7f, 145.3f)
                curveTo(238.6f, 135.2f, 254.5f, 126.3f, 270.0f, 117.2f)
                curveTo(290.4f, 105.3f, 310.2f, 92.4f, 332.7f, 84.7f)
                curveTo(362.1f, 74.7f, 391.1f, 63.5f, 420.1f, 52.6f)
                curveTo(432.9f, 47.8f, 445.9f, 41.8f, 459.6f, 40.5f)
                curveTo(509.4f, 35.4f, 558.8f, 27.2f, 608.6f, 22.5f)
                curveTo(625.3f, 20.9f, 631.8f, 25.7f, 644.6f, 35.1f)
                curveTo(652.8f, 41.3f, 661.1f, 46.6f, 669.0f, 53.4f)
                curveTo(675.3f, 71.5f, 680.7f, 120.1f, 684.3f, 141.7f)
                lineTo(697.0f, 218.0f)
                curveTo(698.8f, 228.8f, 701.9f, 241.9f, 702.3f, 252.5f)
                curveTo(719.6f, 250.2f, 750.3f, 244.0f, 765.2f, 244.9f)
                curveTo(784.4f, 246.9f, 808.4f, 268.9f, 817.9f, 284.6f)
                curveTo(843.7f, 327.0f, 834.4f, 392.1f, 831.7f, 439.7f)
                curveTo(830.3f, 465.1f, 800.8f, 488.2f, 783.4f, 503.6f)
                curveTo(765.2f, 519.8f, 729.2f, 518.2f, 706.5f, 514.7f)
                curveTo(701.8f, 520.0f, 652.8f, 596.3f, 652.3f, 598.4f)
                curveTo(653.5f, 602.1f, 653.6f, 601.3f, 657.0f, 604.3f)
                curveTo(658.2f, 608.0f, 659.8f, 611.6f, 659.5f, 615.4f)
                curveTo(654.9f, 620.2f, 634.2f, 617.5f, 627.2f, 619.2f)
                curveTo(626.3f, 623.4f, 625.0f, 638.7f, 624.4f, 643.9f)
                curveTo(628.9f, 651.6f, 642.3f, 676.9f, 646.6f, 682.5f)
                curveTo(661.4f, 702.1f, 685.8f, 727.6f, 704.0f, 744.8f)
                curveTo(707.7f, 748.2f, 718.8f, 755.0f, 723.3f, 758.1f)
                curveTo(740.9f, 770.1f, 760.8f, 780.3f, 777.6f, 793.0f)
                curveTo(784.1f, 798.4f, 785.5f, 808.5f, 789.0f, 815.7f)
                curveTo(804.2f, 847.8f, 809.5f, 873.6f, 813.3f, 908.6f)
                curveTo(816.4f, 939.5f, 818.9f, 970.4f, 820.7f, 1001.4f)
                close()
                moveTo(436.4f, 661.6f)
                curveTo(440.6f, 665.9f, 444.8f, 670.1f, 449.1f, 674.3f)
                curveTo(461.8f, 684.6f, 476.9f, 683.0f, 492.3f, 679.5f)
                curveTo(498.8f, 673.9f, 516.4f, 657.0f, 517.2f, 648.4f)
                curveTo(516.0f, 647.4f, 516.4f, 647.3f, 515.4f, 647.3f)
                curveTo(489.3f, 653.3f, 462.9f, 658.1f, 436.4f, 661.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(574.4f, 385.6f)
                curveTo(577.1f, 386.1f, 580.0f, 389.1f, 582.4f, 390.5f)
                curveTo(602.1f, 402.2f, 611.5f, 420.8f, 628.6f, 435.2f)
                curveTo(625.2f, 451.6f, 637.8f, 450.4f, 639.5f, 466.9f)
                curveTo(642.2f, 492.3f, 646.7f, 520.5f, 640.1f, 545.4f)
                curveTo(657.0f, 534.7f, 667.9f, 520.3f, 672.3f, 500.9f)
                curveTo(670.6f, 492.2f, 668.7f, 488.8f, 664.2f, 481.5f)
                curveTo(665.1f, 475.7f, 665.6f, 462.5f, 672.7f, 461.5f)
                curveTo(680.6f, 466.2f, 684.1f, 488.7f, 684.5f, 497.3f)
                curveTo(689.3f, 484.5f, 696.9f, 476.9f, 693.3f, 461.9f)
                curveTo(691.5f, 454.8f, 685.0f, 439.4f, 674.7f, 442.7f)
                curveTo(660.5f, 447.2f, 661.1f, 464.6f, 657.5f, 476.3f)
                curveTo(656.2f, 480.5f, 653.8f, 484.6f, 651.5f, 488.5f)
                curveTo(650.6f, 472.3f, 653.2f, 426.6f, 683.9f, 434.7f)
                curveTo(690.7f, 437.5f, 696.8f, 449.5f, 698.1f, 455.2f)
                curveTo(708.7f, 503.1f, 670.0f, 545.2f, 634.1f, 570.7f)
                curveTo(629.7f, 573.8f, 624.3f, 596.0f, 620.2f, 602.5f)
                curveTo(607.5f, 622.5f, 590.7f, 639.7f, 572.9f, 655.3f)
                curveTo(542.9f, 682.1f, 519.6f, 705.7f, 479.9f, 717.0f)
                curveTo(457.6f, 711.1f, 443.3f, 698.5f, 423.5f, 686.2f)
                curveTo(384.7f, 663.0f, 372.7f, 657.4f, 352.4f, 614.8f)
                curveTo(382.4f, 627.4f, 406.8f, 624.2f, 411.6f, 587.1f)
                curveTo(411.9f, 584.8f, 413.2f, 569.6f, 414.6f, 568.6f)
                curveTo(436.9f, 552.9f, 457.8f, 532.4f, 477.7f, 513.6f)
                curveTo(481.0f, 510.4f, 486.3f, 510.8f, 487.7f, 509.6f)
                curveTo(492.6f, 505.3f, 497.0f, 499.9f, 501.2f, 495.2f)
                curveTo(497.5f, 510.9f, 497.3f, 511.7f, 503.0f, 528.0f)
                curveTo(504.5f, 532.2f, 505.7f, 533.8f, 509.6f, 535.4f)
                curveTo(513.2f, 531.1f, 512.0f, 510.9f, 512.1f, 503.7f)
                curveTo(518.5f, 497.7f, 519.5f, 496.8f, 527.0f, 492.5f)
                curveTo(528.3f, 516.2f, 527.9f, 539.4f, 555.5f, 546.5f)
                curveTo(564.3f, 543.3f, 576.9f, 537.5f, 578.2f, 527.0f)
                curveTo(577.2f, 524.1f, 577.9f, 525.1f, 575.4f, 523.2f)
                curveTo(571.7f, 524.2f, 573.1f, 527.7f, 569.0f, 531.3f)
                curveTo(564.8f, 534.8f, 561.0f, 536.7f, 556.3f, 539.3f)
                curveTo(540.4f, 531.9f, 537.8f, 519.1f, 534.0f, 503.1f)
                curveTo(533.5f, 500.9f, 534.3f, 500.3f, 535.6f, 498.8f)
                lineTo(537.4f, 499.2f)
                lineTo(540.4f, 504.2f)
                lineTo(542.9f, 504.7f)
                curveTo(544.8f, 503.9f, 545.6f, 503.4f, 547.6f, 503.3f)
                curveTo(550.5f, 506.6f, 553.9f, 515.3f, 555.9f, 519.8f)
                curveTo(558.2f, 514.9f, 566.9f, 499.3f, 573.1f, 503.5f)
                curveTo(568.9f, 511.4f, 574.6f, 515.2f, 579.7f, 520.4f)
                curveTo(581.4f, 513.2f, 582.4f, 506.0f, 583.6f, 498.7f)
                curveTo(596.3f, 509.0f, 587.3f, 506.3f, 591.0f, 515.6f)
                lineTo(593.4f, 515.9f)
                curveTo(595.0f, 514.4f, 595.3f, 514.2f, 595.7f, 511.9f)
                curveTo(602.9f, 469.8f, 550.6f, 456.2f, 522.5f, 475.3f)
                curveTo(522.2f, 472.4f, 522.2f, 471.0f, 520.5f, 468.4f)
                lineTo(518.7f, 468.4f)
                lineTo(515.2f, 472.3f)
                lineTo(513.6f, 471.9f)
                curveTo(509.9f, 463.2f, 534.7f, 458.7f, 537.4f, 450.6f)
                lineTo(536.4f, 449.1f)
                curveTo(531.5f, 448.0f, 528.9f, 451.6f, 525.6f, 450.9f)
                curveTo(543.3f, 432.2f, 558.5f, 405.0f, 574.4f, 385.6f)
                close()
                moveTo(436.4f, 661.6f)
                curveTo(440.6f, 665.9f, 444.8f, 670.1f, 449.1f, 674.3f)
                curveTo(461.8f, 684.6f, 476.9f, 683.0f, 492.3f, 679.5f)
                curveTo(498.8f, 673.9f, 516.4f, 657.0f, 517.2f, 648.4f)
                curveTo(516.0f, 647.4f, 516.4f, 647.3f, 515.4f, 647.3f)
                curveTo(489.3f, 653.3f, 462.9f, 658.1f, 436.4f, 661.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF010200)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(515.4f, 647.3f)
                curveTo(516.4f, 647.3f, 516.0f, 647.4f, 517.2f, 648.4f)
                curveTo(516.4f, 657.0f, 498.8f, 673.9f, 492.3f, 679.5f)
                curveTo(476.9f, 683.0f, 461.8f, 684.6f, 449.1f, 674.3f)
                curveTo(444.8f, 670.1f, 440.6f, 665.9f, 436.4f, 661.6f)
                curveTo(462.9f, 658.1f, 489.3f, 653.3f, 515.4f, 647.3f)
                close()
                moveTo(463.8f, 677.0f)
                curveTo(471.6f, 676.9f, 487.4f, 675.5f, 493.9f, 671.3f)
                lineTo(494.6f, 669.7f)
                curveTo(493.2f, 669.1f, 492.8f, 668.8f, 491.3f, 668.7f)
                curveTo(480.5f, 675.0f, 467.6f, 671.2f, 461.2f, 674.8f)
                lineTo(461.4f, 676.3f)
                lineTo(463.8f, 677.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, fillAlpha = 0.988235f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(491.3f, 668.7f)
                curveTo(492.8f, 668.8f, 493.2f, 669.1f, 494.6f, 669.7f)
                lineTo(493.9f, 671.3f)
                curveTo(487.4f, 675.5f, 471.6f, 676.9f, 463.8f, 677.0f)
                lineTo(461.4f, 676.3f)
                lineTo(461.2f, 674.8f)
                curveTo(467.6f, 671.2f, 480.5f, 675.0f, 491.3f, 668.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF010200)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(576.9f, 544.7f)
                curveTo(578.3f, 545.5f, 577.7f, 544.9f, 578.4f, 546.7f)
                curveTo(565.9f, 559.5f, 557.8f, 561.0f, 540.9f, 564.7f)
                curveTo(538.9f, 563.1f, 539.5f, 563.8f, 539.1f, 560.5f)
                curveTo(542.2f, 554.3f, 556.1f, 556.3f, 564.1f, 552.5f)
                curveTo(570.3f, 549.6f, 571.5f, 548.6f, 576.9f, 544.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF010200)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(417.2f, 626.6f)
                curveTo(423.1f, 626.9f, 427.6f, 630.8f, 431.5f, 635.0f)
                curveTo(434.1f, 637.8f, 433.8f, 637.9f, 433.4f, 641.5f)
                curveTo(424.1f, 643.0f, 418.1f, 635.1f, 417.2f, 626.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF010200)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(487.8f, 691.5f)
                lineTo(488.3f, 691.3f)
                lineTo(489.3f, 692.0f)
                curveTo(487.4f, 696.8f, 480.8f, 700.4f, 475.6f, 699.6f)
                curveTo(472.6f, 697.9f, 471.2f, 697.8f, 470.0f, 695.2f)
                curveTo(472.7f, 693.5f, 480.7f, 694.1f, 487.3f, 691.7f)
                lineTo(487.8f, 691.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(461.7f, 173.1f)
                curveTo(463.1f, 173.2f, 462.6f, 173.2f, 464.0f, 174.0f)
                curveTo(465.6f, 181.4f, 467.0f, 189.7f, 468.0f, 197.3f)
                curveTo(473.5f, 240.8f, 479.8f, 284.7f, 482.4f, 328.5f)
                curveTo(482.6f, 330.5f, 480.9f, 334.6f, 480.0f, 336.5f)
                curveTo(467.0f, 339.5f, 442.0f, 348.7f, 426.6f, 352.8f)
                curveTo(372.1f, 367.3f, 328.8f, 372.2f, 272.9f, 371.8f)
                curveTo(268.6f, 363.4f, 264.6f, 354.0f, 260.8f, 345.3f)
                curveTo(246.3f, 309.2f, 225.4f, 270.3f, 211.9f, 233.7f)
                curveTo(246.0f, 231.0f, 270.3f, 226.0f, 303.3f, 219.0f)
                curveTo(357.2f, 207.9f, 410.2f, 192.6f, 461.7f, 173.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(552.1f, 55.4f)
                curveTo(553.7f, 57.8f, 550.9f, 56.7f, 552.5f, 61.5f)
                curveTo(558.8f, 64.1f, 565.0f, 66.9f, 571.1f, 69.8f)
                lineTo(571.1f, 83.2f)
                lineTo(558.4f, 91.7f)
                lineTo(545.9f, 84.7f)
                curveTo(549.2f, 89.6f, 551.8f, 94.1f, 554.8f, 99.2f)
                lineTo(554.8f, 109.7f)
                curveTo(551.2f, 112.3f, 547.4f, 115.4f, 543.8f, 118.1f)
                curveTo(537.0f, 113.8f, 534.2f, 111.0f, 528.9f, 105.3f)
                curveTo(522.0f, 111.5f, 517.5f, 115.7f, 511.2f, 122.5f)
                curveTo(510.3f, 127.4f, 509.3f, 132.2f, 508.4f, 137.1f)
                curveTo(498.3f, 140.6f, 494.0f, 138.0f, 489.9f, 139.7f)
                curveTo(488.9f, 141.7f, 489.0f, 142.0f, 488.8f, 144.2f)
                lineTo(488.7f, 144.9f)
                curveTo(483.7f, 147.8f, 465.3f, 153.5f, 458.5f, 156.2f)
                curveTo(390.4f, 183.3f, 302.1f, 207.4f, 229.2f, 216.9f)
                curveTo(212.5f, 218.9f, 205.0f, 221.2f, 188.6f, 217.3f)
                curveTo(198.8f, 198.8f, 207.2f, 191.4f, 223.7f, 177.7f)
                curveTo(287.3f, 125.0f, 367.9f, 94.9f, 447.1f, 74.4f)
                curveTo(481.5f, 65.5f, 517.8f, 63.5f, 552.1f, 55.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(744.8f, 257.5f)
                curveTo(792.7f, 257.5f, 803.3f, 275.9f, 801.1f, 318.3f)
                curveTo(801.0f, 320.3f, 801.3f, 322.6f, 802.8f, 323.9f)
                curveTo(804.7f, 322.5f, 805.1f, 321.7f, 805.6f, 319.4f)
                lineTo(805.8f, 318.8f)
                curveTo(807.9f, 309.7f, 805.3f, 302.8f, 806.9f, 294.2f)
                lineTo(808.4f, 293.4f)
                curveTo(814.5f, 296.5f, 824.1f, 329.8f, 822.8f, 334.2f)
                curveTo(819.1f, 345.9f, 815.4f, 351.6f, 819.6f, 367.9f)
                curveTo(820.7f, 372.1f, 814.6f, 399.2f, 813.1f, 405.5f)
                curveTo(808.4f, 397.9f, 799.8f, 386.2f, 800.3f, 377.6f)
                curveTo(802.8f, 374.6f, 810.4f, 372.0f, 815.0f, 368.3f)
                lineTo(814.7f, 367.2f)
                curveTo(810.3f, 365.7f, 804.0f, 366.4f, 799.2f, 366.6f)
                curveTo(801.7f, 357.3f, 807.7f, 341.8f, 811.2f, 332.2f)
                curveTo(805.3f, 335.9f, 797.5f, 342.7f, 791.8f, 347.3f)
                curveTo(790.1f, 339.4f, 782.4f, 321.0f, 776.1f, 316.7f)
                lineTo(773.2f, 319.7f)
                curveTo(770.9f, 320.4f, 756.5f, 315.6f, 752.2f, 314.5f)
                curveTo(762.0f, 323.7f, 771.7f, 327.7f, 779.9f, 335.5f)
                curveTo(780.4f, 344.3f, 781.0f, 353.8f, 779.4f, 362.4f)
                curveTo(778.2f, 368.8f, 774.7f, 370.6f, 771.2f, 375.6f)
                lineTo(771.5f, 377.4f)
                curveTo(773.7f, 377.9f, 775.9f, 378.4f, 777.8f, 379.9f)
                curveTo(781.3f, 382.8f, 757.8f, 411.8f, 758.3f, 419.6f)
                lineTo(759.6f, 420.4f)
                curveTo(765.8f, 414.4f, 768.8f, 407.2f, 775.8f, 400.5f)
                lineTo(776.1f, 400.2f)
                curveTo(775.6f, 424.2f, 781.1f, 445.0f, 783.5f, 470.0f)
                curveTo(775.8f, 465.2f, 774.8f, 463.4f, 767.2f, 468.4f)
                curveTo(763.1f, 468.2f, 765.5f, 468.4f, 761.5f, 464.4f)
                lineTo(759.6f, 464.8f)
                curveTo(758.1f, 467.0f, 757.7f, 467.8f, 755.6f, 469.5f)
                curveTo(752.9f, 468.9f, 745.6f, 460.1f, 743.7f, 457.5f)
                curveTo(741.6f, 454.5f, 746.9f, 448.5f, 742.0f, 445.0f)
                curveTo(735.6f, 446.7f, 736.8f, 452.6f, 729.3f, 452.7f)
                curveTo(733.8f, 429.3f, 741.2f, 418.1f, 757.4f, 401.2f)
                curveTo(759.7f, 398.8f, 762.7f, 394.7f, 762.4f, 391.3f)
                lineTo(761.1f, 391.3f)
                curveTo(745.0f, 399.5f, 725.1f, 429.2f, 713.1f, 443.5f)
                curveTo(678.8f, 419.7f, 712.0f, 394.6f, 724.9f, 364.8f)
                curveTo(711.6f, 373.0f, 689.4f, 396.0f, 678.6f, 407.1f)
                curveTo(677.4f, 389.9f, 677.7f, 370.2f, 677.7f, 353.0f)
                curveTo(692.0f, 334.1f, 720.0f, 323.4f, 738.9f, 309.7f)
                curveTo(713.2f, 312.7f, 693.2f, 325.2f, 674.0f, 341.9f)
                curveTo(674.8f, 334.1f, 675.7f, 323.1f, 678.0f, 315.9f)
                curveTo(686.7f, 288.9f, 723.6f, 277.6f, 747.0f, 266.1f)
                curveTo(735.0f, 267.3f, 727.7f, 269.8f, 716.9f, 275.0f)
                curveTo(711.6f, 277.5f, 698.6f, 284.7f, 693.7f, 284.2f)
                curveTo(693.6f, 282.6f, 694.0f, 282.1f, 695.3f, 280.6f)
                curveTo(710.6f, 263.2f, 723.4f, 260.0f, 744.8f, 257.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(401.7f, 449.3f)
                curveTo(402.1f, 449.2f, 403.8f, 449.4f, 404.3f, 449.4f)
                curveTo(405.8f, 452.4f, 405.6f, 458.1f, 405.7f, 461.7f)
                curveTo(404.7f, 462.3f, 402.6f, 463.6f, 401.7f, 464.2f)
                curveTo(396.7f, 467.5f, 386.5f, 490.7f, 385.5f, 496.0f)
                curveTo(388.0f, 500.3f, 403.3f, 489.4f, 406.0f, 507.1f)
                curveTo(405.1f, 513.0f, 400.1f, 516.6f, 395.7f, 520.4f)
                curveTo(382.6f, 517.2f, 387.6f, 514.9f, 378.7f, 510.2f)
                lineTo(376.7f, 511.0f)
                curveTo(372.9f, 518.1f, 388.3f, 525.8f, 393.8f, 529.6f)
                curveTo(384.6f, 535.2f, 378.7f, 537.4f, 368.6f, 541.0f)
                curveTo(368.1f, 536.3f, 368.0f, 534.1f, 365.9f, 529.8f)
                curveTo(363.4f, 532.3f, 360.6f, 536.4f, 357.6f, 538.7f)
                curveTo(347.4f, 546.5f, 331.6f, 548.7f, 319.1f, 551.5f)
                curveTo(320.9f, 549.0f, 322.3f, 546.7f, 323.8f, 544.1f)
                curveTo(340.1f, 516.1f, 357.0f, 488.3f, 374.3f, 460.9f)
                curveTo(375.8f, 458.5f, 379.0f, 455.2f, 381.1f, 453.2f)
                curveTo(385.7f, 451.8f, 396.5f, 450.2f, 401.7f, 449.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(492.7f, 158.1f)
                lineTo(493.4f, 158.7f)
                curveTo(489.9f, 163.2f, 486.6f, 166.5f, 482.7f, 170.7f)
                curveTo(486.3f, 170.2f, 498.5f, 166.6f, 500.2f, 167.2f)
                curveTo(517.0f, 173.1f, 508.5f, 187.7f, 498.8f, 192.7f)
                curveTo(493.9f, 192.5f, 497.2f, 189.8f, 491.5f, 187.1f)
                lineTo(489.7f, 188.4f)
                curveTo(489.7f, 192.3f, 493.8f, 198.9f, 495.3f, 202.9f)
                curveTo(496.7f, 206.7f, 493.4f, 209.3f, 491.4f, 214.0f)
                curveTo(492.7f, 218.3f, 502.5f, 216.5f, 506.4f, 220.2f)
                curveTo(507.9f, 220.9f, 510.6f, 224.3f, 510.4f, 226.0f)
                curveTo(507.4f, 249.7f, 492.0f, 232.2f, 497.3f, 262.6f)
                curveTo(500.0f, 265.9f, 504.4f, 270.2f, 507.4f, 273.6f)
                curveTo(516.3f, 283.6f, 502.4f, 287.6f, 501.6f, 295.9f)
                lineTo(502.9f, 297.2f)
                curveTo(511.8f, 288.4f, 519.4f, 293.2f, 525.6f, 301.7f)
                lineTo(522.4f, 313.5f)
                curveTo(513.4f, 322.3f, 515.9f, 319.2f, 504.8f, 313.9f)
                curveTo(502.2f, 312.6f, 500.6f, 312.7f, 498.4f, 311.9f)
                curveTo(496.2f, 311.2f, 494.0f, 301.7f, 493.6f, 299.8f)
                curveTo(487.0f, 266.7f, 483.8f, 233.0f, 476.9f, 200.0f)
                curveTo(474.8f, 189.9f, 473.0f, 179.6f, 471.1f, 169.5f)
                curveTo(478.1f, 167.0f, 486.1f, 162.0f, 492.7f, 158.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(274.0f, 446.6f)
                lineTo(295.9f, 458.6f)
                curveTo(290.2f, 477.6f, 270.8f, 525.8f, 260.1f, 542.3f)
                curveTo(242.3f, 532.1f, 231.4f, 521.6f, 234.3f, 499.7f)
                curveTo(236.2f, 489.9f, 237.8f, 466.7f, 246.1f, 460.6f)
                curveTo(250.3f, 465.5f, 232.7f, 509.3f, 243.3f, 517.6f)
                curveTo(244.9f, 516.9f, 246.2f, 515.0f, 246.7f, 513.3f)
                curveTo(254.3f, 490.3f, 264.7f, 468.9f, 274.0f, 446.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(600.8f, 364.8f)
                curveTo(607.4f, 366.2f, 631.0f, 379.4f, 637.7f, 383.0f)
                curveTo(631.8f, 381.6f, 606.9f, 376.5f, 602.4f, 379.0f)
                curveTo(602.3f, 389.7f, 653.3f, 382.3f, 660.9f, 392.0f)
                curveTo(657.0f, 396.5f, 631.5f, 392.8f, 625.0f, 396.4f)
                lineTo(625.3f, 398.1f)
                lineTo(628.8f, 400.0f)
                curveTo(642.1f, 406.9f, 652.2f, 404.1f, 660.2f, 407.7f)
                curveTo(662.2f, 415.9f, 630.4f, 420.5f, 620.8f, 414.8f)
                curveTo(621.6f, 411.5f, 625.2f, 413.8f, 628.3f, 410.0f)
                curveTo(627.1f, 408.0f, 612.1f, 400.7f, 608.6f, 398.7f)
                curveTo(596.9f, 391.7f, 590.2f, 386.6f, 581.8f, 375.9f)
                curveTo(588.1f, 372.2f, 594.4f, 368.5f, 600.8f, 364.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(625.7f, 348.0f)
                curveTo(635.4f, 347.9f, 650.4f, 354.6f, 660.0f, 358.3f)
                lineTo(659.9f, 381.6f)
                curveTo(654.8f, 379.1f, 649.6f, 377.5f, 644.2f, 375.6f)
                curveTo(634.6f, 372.5f, 625.2f, 369.4f, 615.4f, 367.0f)
                curveTo(611.5f, 366.1f, 608.5f, 366.0f, 607.3f, 361.9f)
                curveTo(609.8f, 356.5f, 620.3f, 351.2f, 625.7f, 348.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(585.2f, 64.8f)
                curveTo(603.0f, 66.4f, 606.7f, 83.2f, 591.1f, 91.0f)
                curveTo(585.8f, 89.9f, 580.2f, 87.6f, 577.2f, 82.8f)
                curveTo(575.7f, 80.4f, 575.3f, 77.4f, 576.1f, 74.7f)
                curveTo(577.4f, 69.9f, 581.3f, 67.2f, 585.2f, 64.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(510.2f, 191.0f)
                curveTo(529.7f, 192.8f, 527.9f, 207.7f, 514.9f, 218.0f)
                curveTo(511.0f, 217.0f, 504.8f, 212.7f, 501.1f, 210.4f)
                curveTo(500.7f, 198.9f, 499.5f, 197.3f, 510.2f, 191.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(513.4f, 241.0f)
                curveTo(529.9f, 246.0f, 526.2f, 261.8f, 512.2f, 268.7f)
                curveTo(506.6f, 265.8f, 502.6f, 261.7f, 498.4f, 257.2f)
                lineTo(502.4f, 247.2f)
                lineTo(513.4f, 241.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(527.7f, 165.9f)
                curveTo(545.3f, 168.8f, 541.7f, 183.5f, 530.9f, 193.2f)
                curveTo(516.5f, 192.7f, 516.8f, 182.0f, 517.5f, 171.2f)
                lineTo(527.7f, 165.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(801.6f, 401.4f)
                curveTo(805.9f, 405.7f, 805.1f, 406.8f, 811.6f, 412.3f)
                curveTo(807.9f, 429.2f, 807.0f, 437.8f, 797.9f, 452.4f)
                curveTo(796.2f, 454.3f, 795.9f, 455.1f, 793.6f, 455.7f)
                curveTo(792.8f, 450.6f, 800.1f, 408.4f, 801.6f, 401.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(404.0f, 468.7f)
                curveTo(411.1f, 469.0f, 420.9f, 473.4f, 420.7f, 481.6f)
                curveTo(420.6f, 486.6f, 416.1f, 489.9f, 412.7f, 492.9f)
                curveTo(404.7f, 496.4f, 400.9f, 491.2f, 395.4f, 486.1f)
                curveTo(397.5f, 478.4f, 398.8f, 474.7f, 404.0f, 468.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(527.3f, 265.7f)
                curveTo(529.5f, 265.9f, 536.7f, 271.2f, 537.8f, 273.4f)
                curveTo(542.9f, 283.3f, 537.1f, 288.6f, 530.0f, 293.1f)
                curveTo(526.2f, 292.9f, 520.4f, 288.6f, 517.0f, 286.4f)
                lineTo(517.0f, 273.8f)
                lineTo(527.3f, 265.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(526.6f, 215.9f)
                curveTo(540.8f, 220.1f, 539.6f, 223.7f, 538.3f, 236.8f)
                curveTo(535.1f, 238.8f, 531.8f, 241.0f, 528.6f, 243.1f)
                lineTo(527.0f, 243.0f)
                curveTo(515.0f, 235.2f, 513.0f, 223.0f, 526.6f, 215.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(433.2f, 439.2f)
                curveTo(430.5f, 448.2f, 433.2f, 464.6f, 424.6f, 469.7f)
                curveTo(421.2f, 469.6f, 420.2f, 468.7f, 417.4f, 466.8f)
                curveTo(407.4f, 458.6f, 409.0f, 452.7f, 417.9f, 444.5f)
                curveTo(419.9f, 444.4f, 422.0f, 444.3f, 424.0f, 444.1f)
                curveTo(429.1f, 443.7f, 430.0f, 443.0f, 433.2f, 439.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(541.7f, 290.9f)
                curveTo(549.6f, 291.5f, 557.4f, 298.7f, 553.6f, 307.0f)
                curveTo(551.8f, 310.9f, 547.9f, 311.9f, 544.2f, 313.4f)
                lineTo(537.9f, 314.6f)
                curveTo(526.7f, 310.8f, 532.2f, 295.0f, 541.7f, 290.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(571.2f, 89.6f)
                curveTo(577.5f, 89.8f, 580.9f, 94.0f, 585.6f, 98.1f)
                lineTo(571.6f, 106.9f)
                curveTo(567.8f, 109.7f, 566.9f, 111.1f, 562.3f, 109.6f)
                curveTo(557.9f, 101.0f, 565.0f, 94.4f, 571.2f, 89.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(431.6f, 497.4f)
                lineTo(433.4f, 497.6f)
                curveTo(436.7f, 507.4f, 421.9f, 513.4f, 414.5f, 517.6f)
                curveTo(413.2f, 517.6f, 413.8f, 517.7f, 412.4f, 516.4f)
                curveTo(412.1f, 510.6f, 412.1f, 505.1f, 412.1f, 499.3f)
                curveTo(420.0f, 500.0f, 424.2f, 500.0f, 431.6f, 497.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(606.9f, 49.4f)
                curveTo(611.4f, 49.0f, 613.4f, 48.2f, 615.7f, 52.2f)
                curveTo(615.2f, 58.7f, 608.5f, 63.0f, 603.0f, 65.2f)
                curveTo(598.4f, 63.7f, 594.0f, 62.1f, 592.3f, 57.1f)
                curveTo(593.8f, 48.7f, 600.0f, 49.7f, 606.9f, 49.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(554.8f, 216.6f)
                curveTo(556.7f, 216.6f, 556.8f, 216.8f, 558.5f, 217.5f)
                curveTo(561.1f, 222.0f, 559.6f, 238.8f, 557.5f, 243.3f)
                lineTo(556.1f, 242.9f)
                curveTo(545.3f, 236.4f, 542.6f, 222.5f, 554.8f, 216.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(497.4f, 317.6f)
                curveTo(502.4f, 319.3f, 510.3f, 321.1f, 509.5f, 327.2f)
                curveTo(507.2f, 330.3f, 501.6f, 331.7f, 497.7f, 333.1f)
                curveTo(494.4f, 334.4f, 489.7f, 336.6f, 486.5f, 335.4f)
                lineTo(485.9f, 333.7f)
                curveTo(487.6f, 329.6f, 494.2f, 322.5f, 497.4f, 317.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(525.3f, 115.8f)
                curveTo(530.4f, 116.6f, 537.8f, 116.9f, 537.9f, 123.2f)
                curveTo(536.5f, 126.2f, 532.6f, 127.5f, 529.4f, 129.0f)
                curveTo(526.1f, 130.7f, 523.5f, 132.3f, 519.8f, 132.4f)
                curveTo(516.9f, 130.7f, 517.7f, 131.7f, 516.8f, 128.4f)
                curveTo(517.9f, 122.2f, 520.6f, 119.7f, 525.3f, 115.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(542.9f, 259.1f)
                lineTo(543.7f, 242.8f)
                curveTo(550.1f, 241.1f, 563.0f, 256.2f, 547.8f, 266.8f)
                curveTo(546.5f, 265.9f, 543.9f, 264.6f, 542.4f, 263.7f)
                curveTo(542.7f, 262.0f, 542.8f, 260.9f, 542.9f, 259.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(663.9f, 324.7f)
                curveTo(666.1f, 325.5f, 665.4f, 325.1f, 667.0f, 327.5f)
                curveTo(665.7f, 334.6f, 662.7f, 333.6f, 657.6f, 337.2f)
                curveTo(655.1f, 339.0f, 659.9f, 341.3f, 659.5f, 345.6f)
                curveTo(656.9f, 347.0f, 655.5f, 346.4f, 652.5f, 345.8f)
                curveTo(649.0f, 343.6f, 643.9f, 341.2f, 640.1f, 339.2f)
                curveTo(651.9f, 335.6f, 654.0f, 332.6f, 663.9f, 324.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(558.4f, 166.4f)
                curveTo(561.1f, 166.4f, 561.4f, 166.2f, 563.6f, 167.4f)
                curveTo(566.4f, 173.5f, 562.9f, 185.8f, 561.3f, 192.3f)
                curveTo(559.0f, 192.2f, 558.5f, 192.1f, 556.4f, 191.4f)
                curveTo(552.5f, 186.2f, 554.1f, 171.6f, 558.4f, 166.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(560.0f, 54.4f)
                lineTo(568.9f, 53.8f)
                curveTo(573.4f, 53.5f, 581.7f, 52.3f, 585.0f, 55.2f)
                curveTo(584.4f, 58.3f, 583.4f, 58.2f, 580.6f, 60.7f)
                curveTo(571.7f, 68.4f, 565.6f, 62.5f, 560.0f, 54.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(556.1f, 266.9f)
                curveTo(558.3f, 269.3f, 555.2f, 287.8f, 552.4f, 290.4f)
                lineTo(549.9f, 289.4f)
                curveTo(540.9f, 277.7f, 546.6f, 274.9f, 556.1f, 266.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(520.7f, 155.5f)
                curveTo(522.0f, 155.1f, 522.9f, 155.2f, 524.3f, 155.3f)
                lineTo(525.1f, 156.6f)
                curveTo(523.9f, 162.4f, 516.0f, 165.2f, 510.9f, 166.3f)
                curveTo(507.4f, 165.0f, 505.0f, 163.7f, 503.7f, 160.1f)
                lineTo(504.9f, 158.5f)
                curveTo(509.5f, 156.1f, 515.5f, 156.0f, 520.7f, 155.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(542.2f, 147.3f)
                lineTo(543.1f, 148.1f)
                curveTo(543.6f, 153.5f, 545.4f, 163.2f, 540.6f, 166.5f)
                lineTo(537.2f, 165.3f)
                curveTo(534.9f, 161.8f, 532.5f, 155.1f, 530.9f, 151.1f)
                curveTo(535.9f, 149.9f, 537.5f, 149.4f, 542.2f, 147.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(615.3f, 63.6f)
                curveTo(627.7f, 64.8f, 613.5f, 79.1f, 609.7f, 83.0f)
                curveTo(609.4f, 83.2f, 607.9f, 83.9f, 607.5f, 84.1f)
                lineTo(606.5f, 83.0f)
                curveTo(606.2f, 74.4f, 608.6f, 68.8f, 615.3f, 63.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(530.5f, 255.5f)
                curveTo(532.0f, 251.4f, 533.9f, 246.7f, 537.9f, 244.4f)
                curveTo(541.3f, 249.1f, 536.7f, 256.2f, 542.9f, 259.1f)
                curveTo(542.8f, 260.9f, 542.7f, 262.0f, 542.4f, 263.7f)
                curveTo(543.9f, 264.6f, 546.5f, 265.9f, 547.8f, 266.8f)
                curveTo(538.8f, 267.4f, 535.7f, 261.9f, 530.5f, 255.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(538.6f, 191.7f)
                lineTo(540.3f, 193.4f)
                curveTo(540.6f, 198.8f, 541.2f, 208.6f, 539.4f, 213.4f)
                lineTo(536.8f, 214.5f)
                curveTo(529.0f, 208.1f, 531.3f, 197.1f, 538.6f, 191.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(658.6f, 422.0f)
                curveTo(659.3f, 422.2f, 659.8f, 422.7f, 660.5f, 423.2f)
                curveTo(661.3f, 427.7f, 661.8f, 431.7f, 660.0f, 436.0f)
                lineTo(658.1f, 436.7f)
                lineTo(655.7f, 435.2f)
                curveTo(652.7f, 433.1f, 649.8f, 430.9f, 646.9f, 428.7f)
                curveTo(651.3f, 426.5f, 654.4f, 424.6f, 658.6f, 422.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(551.4f, 198.5f)
                curveTo(554.1f, 199.1f, 554.8f, 199.2f, 557.1f, 200.7f)
                curveTo(557.8f, 204.6f, 555.3f, 208.1f, 553.4f, 212.4f)
                curveTo(551.4f, 213.3f, 552.4f, 213.2f, 550.2f, 212.9f)
                curveTo(549.2f, 210.2f, 550.9f, 202.1f, 551.4f, 198.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(526.4f, 315.6f)
                curveTo(528.7f, 316.2f, 529.0f, 316.5f, 530.6f, 318.3f)
                lineTo(530.1f, 320.5f)
                curveTo(527.0f, 323.6f, 525.3f, 324.1f, 521.3f, 325.7f)
                lineTo(519.4f, 326.1f)
                lineTo(518.5f, 325.0f)
                curveTo(519.6f, 322.0f, 524.0f, 318.1f, 526.4f, 315.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF010200)), stroke = null, fillAlpha = 0.894118f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(657.0f, 604.3f)
                curveTo(660.5f, 607.8f, 673.2f, 618.5f, 674.1f, 622.0f)
                curveTo(671.6f, 623.5f, 632.0f, 620.3f, 627.2f, 619.2f)
                curveTo(634.2f, 617.5f, 654.9f, 620.2f, 659.5f, 615.4f)
                curveTo(659.8f, 611.6f, 658.2f, 608.0f, 657.0f, 604.3f)
                close()
            }
        }
        .build()
        return _standardCaroline!!
    }

private var _standardCaroline: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = StandardSenderAvatar.StandardCaroline, contentDescription = "")
    }
}
