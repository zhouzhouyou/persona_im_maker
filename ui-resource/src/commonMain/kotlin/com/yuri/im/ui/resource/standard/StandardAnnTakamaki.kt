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

public val StandardSenderAvatar.StandardAnnTakamaki: ImageVector
    get() {
        if (_standardAnnTakamaki != null) {
            return _standardAnnTakamaki!!
        }
        _standardAnnTakamaki = Builder(name = "StandardAnnTakamaki", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 1024.0f, viewportHeight = 1024.0f).apply {
            path(fill = SolidColor(Color(0xFF060407)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(514.0f, 84.3f)
                curveTo(546.5f, 80.8f, 640.5f, 118.2f, 667.9f, 139.9f)
                curveTo(688.4f, 156.2f, 724.3f, 206.0f, 734.8f, 232.2f)
                curveTo(736.2f, 235.9f, 737.0f, 242.9f, 737.6f, 247.3f)
                curveTo(743.6f, 239.5f, 752.9f, 230.4f, 762.1f, 227.9f)
                curveTo(797.6f, 219.2f, 821.1f, 222.2f, 849.0f, 245.8f)
                curveTo(881.3f, 273.1f, 887.2f, 291.9f, 901.1f, 330.3f)
                curveTo(908.9f, 336.8f, 921.9f, 342.9f, 929.5f, 349.1f)
                curveTo(951.3f, 366.6f, 967.2f, 395.6f, 977.9f, 421.0f)
                curveTo(986.0f, 440.0f, 991.3f, 468.0f, 994.2f, 488.7f)
                curveTo(995.9f, 511.0f, 994.6f, 529.1f, 995.1f, 552.3f)
                curveTo(995.7f, 582.2f, 1008.6f, 628.5f, 998.2f, 656.2f)
                curveTo(992.5f, 671.4f, 974.2f, 694.1f, 965.4f, 708.0f)
                curveTo(957.6f, 720.1f, 944.8f, 728.8f, 938.9f, 743.4f)
                curveTo(939.0f, 748.2f, 941.8f, 754.4f, 944.5f, 758.3f)
                curveTo(964.4f, 786.9f, 970.2f, 786.8f, 1000.8f, 794.2f)
                curveTo(994.3f, 795.6f, 988.2f, 797.3f, 981.8f, 798.7f)
                curveTo(959.1f, 803.9f, 942.3f, 790.0f, 924.3f, 778.0f)
                curveTo(922.5f, 787.4f, 920.9f, 795.1f, 918.4f, 804.3f)
                curveTo(923.9f, 808.0f, 940.6f, 815.0f, 944.3f, 819.0f)
                curveTo(980.4f, 858.6f, 982.9f, 917.9f, 999.6f, 966.9f)
                curveTo(1002.8f, 976.2f, 1006.7f, 992.9f, 1007.6f, 1001.9f)
                curveTo(992.3f, 1003.0f, 976.0f, 1002.5f, 960.6f, 1002.5f)
                lineTo(887.3f, 1002.5f)
                lineTo(664.5f, 1002.7f)
                curveTo(470.4f, 1002.5f, 274.9f, 1004.8f, 81.0f, 1002.7f)
                curveTo(90.8f, 976.8f, 98.6f, 948.7f, 107.8f, 922.5f)
                curveTo(112.2f, 910.1f, 116.7f, 892.7f, 123.4f, 881.7f)
                curveTo(132.9f, 866.2f, 159.5f, 861.7f, 166.8f, 843.8f)
                curveTo(169.7f, 836.7f, 170.0f, 831.2f, 170.7f, 824.0f)
                curveTo(173.2f, 793.6f, 153.9f, 784.8f, 138.0f, 763.4f)
                curveTo(129.4f, 751.9f, 123.5f, 740.5f, 118.4f, 726.8f)
                curveTo(98.7f, 674.7f, 104.7f, 624.4f, 134.9f, 577.9f)
                curveTo(142.8f, 565.7f, 153.4f, 559.2f, 154.8f, 543.6f)
                curveTo(155.9f, 529.8f, 149.6f, 517.4f, 146.7f, 505.0f)
                curveTo(139.7f, 475.6f, 125.6f, 447.5f, 134.5f, 417.2f)
                curveTo(138.3f, 404.4f, 141.9f, 394.5f, 146.1f, 382.0f)
                curveTo(150.3f, 369.7f, 151.2f, 355.8f, 156.8f, 343.5f)
                curveTo(161.3f, 333.5f, 165.6f, 328.4f, 172.0f, 320.1f)
                curveTo(186.4f, 301.4f, 197.4f, 294.5f, 219.5f, 286.2f)
                curveTo(231.7f, 281.6f, 249.9f, 275.7f, 263.0f, 278.9f)
                curveTo(267.5f, 280.0f, 278.6f, 285.2f, 283.3f, 287.2f)
                curveTo(299.3f, 206.8f, 336.3f, 147.4f, 412.6f, 112.5f)
                curveTo(447.6f, 96.4f, 477.2f, 92.8f, 514.0f, 84.3f)
                close()
                moveTo(703.2f, 738.7f)
                curveTo(704.2f, 732.8f, 705.9f, 725.8f, 704.7f, 720.0f)
                curveTo(699.8f, 695.8f, 684.4f, 678.5f, 684.6f, 652.1f)
                curveTo(684.7f, 646.1f, 684.6f, 619.0f, 682.3f, 615.6f)
                curveTo(678.3f, 620.1f, 675.9f, 628.3f, 673.7f, 634.9f)
                curveTo(665.2f, 661.5f, 652.7f, 704.4f, 670.8f, 728.9f)
                curveTo(672.8f, 731.5f, 687.0f, 734.7f, 690.8f, 735.6f)
                curveTo(694.7f, 736.6f, 699.2f, 737.8f, 703.2f, 738.7f)
                close()
                moveTo(436.1f, 734.6f)
                curveTo(439.1f, 728.0f, 439.6f, 727.0f, 445.9f, 723.3f)
                curveTo(440.7f, 706.4f, 438.2f, 687.5f, 421.7f, 680.9f)
                curveTo(420.7f, 680.4f, 418.3f, 678.9f, 417.3f, 678.3f)
                curveTo(417.0f, 685.3f, 416.8f, 692.6f, 416.0f, 700.7f)
                curveTo(414.7f, 714.6f, 407.7f, 749.6f, 434.8f, 736.6f)
                curveTo(435.1f, 736.5f, 435.9f, 735.1f, 436.1f, 734.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(599.2f, 274.6f)
                curveTo(609.6f, 279.1f, 607.5f, 289.9f, 609.8f, 300.2f)
                curveTo(613.8f, 319.1f, 631.1f, 321.7f, 644.8f, 331.2f)
                curveTo(650.3f, 335.0f, 671.4f, 348.9f, 672.6f, 354.7f)
                curveTo(668.5f, 359.4f, 653.5f, 355.1f, 666.7f, 368.7f)
                curveTo(681.0f, 383.5f, 696.8f, 400.9f, 699.7f, 422.1f)
                curveTo(701.0f, 431.0f, 696.1f, 429.7f, 691.8f, 434.4f)
                curveTo(691.4f, 438.6f, 691.5f, 442.8f, 691.8f, 447.0f)
                curveTo(693.7f, 468.0f, 693.1f, 489.3f, 695.8f, 510.2f)
                curveTo(697.6f, 492.6f, 702.5f, 481.3f, 709.3f, 465.1f)
                curveTo(715.0f, 451.5f, 718.3f, 432.8f, 727.8f, 421.3f)
                curveTo(741.1f, 405.0f, 748.0f, 425.4f, 747.6f, 437.3f)
                curveTo(747.4f, 475.5f, 735.8f, 507.7f, 708.2f, 534.8f)
                curveTo(706.6f, 536.4f, 694.6f, 535.0f, 691.3f, 534.9f)
                curveTo(687.3f, 566.5f, 668.4f, 609.2f, 651.2f, 635.8f)
                curveTo(632.7f, 664.3f, 603.4f, 684.0f, 579.7f, 707.2f)
                curveTo(555.8f, 730.6f, 535.8f, 733.2f, 507.6f, 715.8f)
                curveTo(488.4f, 704.0f, 470.2f, 692.4f, 451.5f, 679.4f)
                curveTo(424.5f, 661.9f, 404.0f, 638.0f, 387.5f, 610.6f)
                curveTo(379.2f, 596.8f, 378.9f, 586.8f, 362.6f, 579.8f)
                curveTo(348.4f, 573.7f, 338.4f, 565.2f, 330.1f, 551.6f)
                curveTo(317.9f, 531.6f, 303.8f, 504.3f, 302.8f, 480.4f)
                curveTo(302.9f, 476.2f, 310.9f, 471.9f, 314.6f, 469.7f)
                curveTo(327.8f, 489.1f, 335.0f, 500.1f, 350.4f, 517.6f)
                curveTo(346.7f, 503.2f, 343.5f, 455.3f, 343.4f, 439.9f)
                curveTo(360.9f, 436.5f, 381.5f, 432.5f, 399.4f, 432.9f)
                curveTo(411.4f, 433.1f, 423.4f, 442.3f, 433.6f, 444.9f)
                curveTo(460.6f, 451.8f, 473.6f, 448.8f, 498.0f, 463.3f)
                curveTo(475.5f, 435.9f, 447.7f, 432.8f, 414.3f, 424.2f)
                curveTo(465.9f, 415.4f, 553.7f, 372.1f, 578.4f, 323.0f)
                curveTo(586.2f, 307.6f, 588.5f, 283.9f, 599.2f, 274.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF060407)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(364.1f, 456.7f)
                curveTo(372.6f, 461.3f, 373.9f, 463.3f, 383.3f, 466.9f)
                curveTo(403.7f, 458.4f, 438.8f, 461.4f, 456.2f, 476.5f)
                curveTo(460.1f, 474.9f, 465.8f, 471.9f, 469.8f, 474.0f)
                curveTo(469.5f, 477.4f, 467.1f, 479.7f, 465.1f, 483.4f)
                curveTo(467.6f, 487.4f, 470.1f, 491.4f, 472.4f, 495.5f)
                curveTo(469.6f, 504.6f, 469.7f, 505.0f, 461.2f, 509.6f)
                curveTo(452.6f, 502.0f, 452.8f, 500.5f, 449.5f, 489.3f)
                curveTo(448.9f, 496.7f, 448.3f, 504.0f, 447.4f, 511.4f)
                curveTo(438.0f, 523.6f, 423.6f, 531.2f, 410.0f, 518.8f)
                curveTo(400.6f, 510.2f, 399.9f, 496.9f, 399.8f, 484.9f)
                lineTo(388.1f, 486.4f)
                curveTo(385.1f, 488.2f, 381.3f, 491.6f, 378.5f, 494.0f)
                curveTo(382.1f, 501.1f, 387.5f, 517.1f, 391.9f, 521.1f)
                lineTo(390.7f, 521.8f)
                curveTo(385.3f, 521.3f, 385.8f, 523.7f, 381.2f, 524.2f)
                curveTo(375.7f, 515.4f, 357.4f, 490.3f, 364.2f, 480.8f)
                curveTo(367.7f, 481.3f, 365.8f, 483.6f, 369.9f, 486.2f)
                curveTo(371.5f, 485.5f, 377.3f, 477.2f, 379.4f, 474.8f)
                curveTo(373.5f, 468.3f, 369.3f, 463.7f, 364.1f, 456.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(412.4f, 496.4f)
                curveTo(413.5f, 496.7f, 415.2f, 497.4f, 416.2f, 497.8f)
                curveTo(418.4f, 500.6f, 418.8f, 502.1f, 420.0f, 505.3f)
                curveTo(427.5f, 509.4f, 432.4f, 499.4f, 438.0f, 500.4f)
                curveTo(439.8f, 503.6f, 438.9f, 508.8f, 438.4f, 512.2f)
                curveTo(426.7f, 526.5f, 401.7f, 515.3f, 412.4f, 496.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF060407)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(542.5f, 637.0f)
                curveTo(551.6f, 636.1f, 578.7f, 637.8f, 581.7f, 647.3f)
                curveTo(579.2f, 651.9f, 576.0f, 650.5f, 571.5f, 653.7f)
                curveTo(566.3f, 657.4f, 570.9f, 663.1f, 569.8f, 667.8f)
                curveTo(566.7f, 680.7f, 551.2f, 689.1f, 541.4f, 695.8f)
                curveTo(534.7f, 692.8f, 527.9f, 687.9f, 520.0f, 684.2f)
                lineTo(536.9f, 680.7f)
                lineTo(542.7f, 670.5f)
                curveTo(539.9f, 667.9f, 536.4f, 670.6f, 528.3f, 664.2f)
                lineTo(528.6f, 663.0f)
                curveTo(540.2f, 662.4f, 539.3f, 660.8f, 544.4f, 651.1f)
                curveTo(538.4f, 650.9f, 523.3f, 649.7f, 519.1f, 652.8f)
                curveTo(522.0f, 657.2f, 524.4f, 655.8f, 524.9f, 659.8f)
                lineTo(523.4f, 660.6f)
                curveTo(517.4f, 660.1f, 497.3f, 651.8f, 492.4f, 648.1f)
                curveTo(493.5f, 645.9f, 498.8f, 647.6f, 505.7f, 642.4f)
                lineTo(506.0f, 642.1f)
                curveTo(516.2f, 641.6f, 526.6f, 641.5f, 536.7f, 640.8f)
                curveTo(537.5f, 640.8f, 541.6f, 637.7f, 542.5f, 637.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF060407)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(662.5f, 470.2f)
                curveTo(665.0f, 469.7f, 665.9f, 469.8f, 668.4f, 469.9f)
                curveTo(671.5f, 471.7f, 672.5f, 472.1f, 674.5f, 475.0f)
                curveTo(673.8f, 480.4f, 671.7f, 477.6f, 669.4f, 483.0f)
                curveTo(673.2f, 486.3f, 678.9f, 483.8f, 680.6f, 488.6f)
                curveTo(674.8f, 492.6f, 663.9f, 487.1f, 658.7f, 494.4f)
                curveTo(659.0f, 499.0f, 663.4f, 499.6f, 665.2f, 504.5f)
                curveTo(663.9f, 506.8f, 664.7f, 506.1f, 662.1f, 507.0f)
                curveTo(659.5f, 506.0f, 657.7f, 502.1f, 653.7f, 499.5f)
                curveTo(648.0f, 500.6f, 645.6f, 510.4f, 637.9f, 512.0f)
                curveTo(626.8f, 514.3f, 635.8f, 519.1f, 632.6f, 525.4f)
                curveTo(630.6f, 524.7f, 628.0f, 521.4f, 626.5f, 519.6f)
                curveTo(611.0f, 501.8f, 601.8f, 510.6f, 584.7f, 499.6f)
                curveTo(583.4f, 498.7f, 583.8f, 496.7f, 584.0f, 495.3f)
                curveTo(585.8f, 491.9f, 589.3f, 489.9f, 592.5f, 487.6f)
                curveTo(599.1f, 487.0f, 607.9f, 487.0f, 614.9f, 486.4f)
                curveTo(634.3f, 484.8f, 645.7f, 478.7f, 662.5f, 470.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF060407)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(540.9f, 561.8f)
                curveTo(550.9f, 571.3f, 552.6f, 588.4f, 562.7f, 600.3f)
                curveTo(556.7f, 612.2f, 553.5f, 616.1f, 542.6f, 623.3f)
                curveTo(539.9f, 624.8f, 536.1f, 627.7f, 533.5f, 629.6f)
                curveTo(528.6f, 623.0f, 526.9f, 617.8f, 524.2f, 610.2f)
                curveTo(530.7f, 608.2f, 532.1f, 607.6f, 537.9f, 604.1f)
                curveTo(538.4f, 596.0f, 537.5f, 566.9f, 540.9f, 561.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF060407)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(635.5f, 416.5f)
                lineTo(636.8f, 416.6f)
                lineTo(637.2f, 417.9f)
                curveTo(599.4f, 433.0f, 572.6f, 443.2f, 547.0f, 477.4f)
                lineTo(545.6f, 477.9f)
                curveTo(544.6f, 473.2f, 558.3f, 450.7f, 562.8f, 446.2f)
                curveTo(581.5f, 427.5f, 609.5f, 417.4f, 635.5f, 416.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF060407)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(729.4f, 437.4f)
                curveTo(733.4f, 438.0f, 732.4f, 437.3f, 734.3f, 439.6f)
                curveTo(734.3f, 453.5f, 735.5f, 477.4f, 731.4f, 490.4f)
                curveTo(730.9f, 492.1f, 724.1f, 499.5f, 722.5f, 501.3f)
                lineTo(721.4f, 500.1f)
                curveTo(719.6f, 493.7f, 717.2f, 460.0f, 723.9f, 455.3f)
                curveTo(735.0f, 447.5f, 725.3f, 446.5f, 729.4f, 437.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF060407)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.9f, 503.6f)
                curveTo(327.1f, 505.0f, 351.0f, 533.5f, 353.3f, 540.7f)
                curveTo(354.7f, 545.1f, 355.9f, 549.6f, 356.4f, 554.2f)
                curveTo(340.2f, 554.1f, 328.2f, 516.9f, 320.9f, 503.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF060407)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(421.1f, 452.6f)
                curveTo(429.5f, 451.5f, 454.6f, 453.2f, 457.3f, 463.2f)
                lineTo(456.1f, 464.8f)
                curveTo(449.7f, 466.5f, 445.1f, 464.2f, 438.8f, 462.2f)
                curveTo(427.5f, 458.3f, 402.8f, 459.8f, 399.3f, 456.3f)
                curveTo(403.8f, 451.9f, 414.9f, 452.6f, 421.1f, 452.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF060407)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(600.3f, 473.2f)
                lineTo(602.5f, 473.7f)
                lineTo(602.6f, 475.6f)
                curveTo(598.2f, 480.7f, 586.2f, 484.6f, 579.4f, 487.2f)
                curveTo(579.1f, 487.3f, 578.4f, 487.0f, 577.9f, 486.9f)
                lineTo(578.2f, 484.9f)
                curveTo(583.1f, 478.8f, 592.5f, 474.2f, 600.3f, 473.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF060407)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(391.9f, 521.1f)
                curveTo(397.0f, 524.3f, 400.1f, 527.0f, 404.7f, 530.8f)
                lineTo(399.2f, 534.5f)
                lineTo(397.6f, 533.9f)
                curveTo(394.6f, 527.0f, 395.8f, 527.5f, 390.7f, 521.8f)
                lineTo(391.9f, 521.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(494.7f, 121.4f)
                lineTo(510.3f, 121.0f)
                curveTo(501.4f, 125.5f, 486.6f, 130.0f, 477.7f, 132.9f)
                curveTo(431.5f, 148.3f, 407.9f, 182.9f, 388.2f, 224.7f)
                curveTo(385.4f, 230.8f, 375.5f, 223.4f, 369.1f, 224.3f)
                lineTo(368.0f, 226.0f)
                curveTo(371.0f, 229.7f, 379.5f, 229.0f, 384.2f, 236.0f)
                curveTo(386.7f, 244.7f, 377.9f, 253.1f, 369.1f, 250.9f)
                curveTo(361.1f, 249.0f, 363.4f, 242.9f, 358.9f, 241.4f)
                curveTo(357.3f, 244.9f, 358.6f, 246.7f, 358.5f, 250.1f)
                curveTo(358.4f, 256.0f, 364.1f, 253.1f, 367.5f, 255.4f)
                curveTo(370.5f, 257.5f, 373.5f, 261.2f, 375.8f, 263.9f)
                lineTo(377.0f, 263.3f)
                curveTo(377.1f, 262.8f, 377.2f, 262.3f, 377.3f, 261.7f)
                curveTo(379.6f, 251.8f, 416.2f, 220.3f, 425.8f, 211.8f)
                curveTo(430.2f, 207.9f, 441.7f, 200.5f, 447.1f, 197.1f)
                curveTo(441.3f, 208.0f, 413.7f, 236.9f, 418.6f, 247.4f)
                curveTo(425.1f, 253.7f, 437.4f, 246.7f, 444.4f, 245.0f)
                curveTo(446.5f, 244.5f, 452.3f, 244.4f, 454.7f, 244.4f)
                curveTo(454.6f, 251.9f, 454.5f, 258.0f, 454.1f, 265.7f)
                curveTo(459.4f, 269.3f, 463.2f, 264.6f, 469.6f, 269.7f)
                curveTo(471.7f, 273.9f, 471.3f, 279.7f, 470.1f, 284.0f)
                curveTo(467.7f, 293.0f, 457.8f, 288.8f, 451.9f, 287.0f)
                curveTo(453.7f, 283.5f, 457.1f, 278.3f, 456.6f, 274.6f)
                curveTo(453.6f, 272.6f, 454.9f, 276.6f, 450.5f, 276.1f)
                lineTo(449.7f, 274.1f)
                curveTo(451.3f, 271.8f, 451.8f, 271.4f, 452.0f, 268.7f)
                curveTo(448.3f, 267.2f, 432.9f, 265.3f, 429.3f, 268.3f)
                curveTo(432.1f, 270.4f, 439.0f, 271.3f, 442.7f, 272.0f)
                curveTo(448.1f, 283.1f, 433.3f, 291.8f, 422.9f, 288.3f)
                curveTo(421.0f, 285.0f, 422.1f, 282.1f, 419.7f, 277.3f)
                lineTo(418.1f, 277.2f)
                curveTo(415.9f, 280.1f, 416.6f, 282.5f, 415.5f, 286.9f)
                curveTo(412.5f, 289.4f, 411.0f, 289.8f, 411.2f, 293.7f)
                curveTo(414.3f, 293.5f, 414.9f, 293.4f, 417.8f, 294.2f)
                lineTo(418.7f, 296.0f)
                curveTo(417.2f, 298.3f, 417.0f, 298.6f, 414.6f, 299.7f)
                curveTo(408.8f, 298.3f, 409.2f, 292.5f, 403.0f, 294.2f)
                curveTo(396.9f, 301.3f, 405.2f, 301.6f, 403.2f, 308.3f)
                curveTo(400.1f, 313.4f, 394.1f, 315.5f, 388.8f, 317.5f)
                curveTo(383.3f, 328.1f, 382.6f, 329.2f, 372.6f, 335.5f)
                curveTo(378.6f, 314.3f, 384.9f, 307.5f, 394.3f, 289.9f)
                lineTo(393.5f, 288.3f)
                curveTo(388.1f, 288.2f, 358.7f, 306.8f, 351.4f, 308.6f)
                curveTo(347.2f, 309.7f, 344.8f, 309.8f, 340.5f, 310.1f)
                curveTo(333.0f, 322.2f, 322.3f, 339.0f, 314.1f, 350.3f)
                curveTo(315.1f, 340.5f, 325.5f, 308.2f, 318.5f, 304.1f)
                curveTo(316.3f, 305.0f, 316.7f, 304.5f, 315.5f, 306.1f)
                lineTo(318.4f, 310.3f)
                curveTo(318.7f, 315.0f, 317.5f, 320.5f, 315.0f, 324.5f)
                curveTo(310.8f, 326.9f, 305.5f, 327.4f, 302.2f, 323.5f)
                curveTo(305.9f, 286.2f, 341.8f, 223.1f, 366.8f, 195.0f)
                curveTo(402.4f, 154.9f, 439.2f, 125.7f, 494.7f, 121.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(167.9f, 623.8f)
                curveTo(170.1f, 626.6f, 167.1f, 648.2f, 168.1f, 655.3f)
                curveTo(169.6f, 665.3f, 169.4f, 668.9f, 173.4f, 678.6f)
                curveTo(185.4f, 707.8f, 207.4f, 702.9f, 229.5f, 712.2f)
                curveTo(224.2f, 702.5f, 220.3f, 698.8f, 212.6f, 691.1f)
                curveTo(223.2f, 695.4f, 238.9f, 698.9f, 250.6f, 703.0f)
                curveTo(271.4f, 710.5f, 291.0f, 725.4f, 309.2f, 738.6f)
                lineTo(305.1f, 750.8f)
                curveTo(305.8f, 751.0f, 306.6f, 751.1f, 307.3f, 751.3f)
                curveTo(313.5f, 752.8f, 320.5f, 754.0f, 323.8f, 759.5f)
                curveTo(325.1f, 765.7f, 319.0f, 767.2f, 322.0f, 773.5f)
                curveTo(325.8f, 774.1f, 331.1f, 774.3f, 332.8f, 777.9f)
                lineTo(331.9f, 780.3f)
                curveTo(325.3f, 782.3f, 320.0f, 775.4f, 312.4f, 774.4f)
                curveTo(312.0f, 774.8f, 311.6f, 775.1f, 311.2f, 775.5f)
                curveTo(310.5f, 786.5f, 308.4f, 799.3f, 305.9f, 809.8f)
                curveTo(303.8f, 818.7f, 302.0f, 822.5f, 297.9f, 830.1f)
                curveTo(301.9f, 798.2f, 304.1f, 763.1f, 272.6f, 744.1f)
                curveTo(280.0f, 764.6f, 281.2f, 775.5f, 273.6f, 796.3f)
                curveTo(265.7f, 816.3f, 240.0f, 848.6f, 259.7f, 869.6f)
                curveTo(269.2f, 879.7f, 284.4f, 879.1f, 297.2f, 879.0f)
                curveTo(283.9f, 887.3f, 271.7f, 892.4f, 255.6f, 893.3f)
                curveTo(231.5f, 894.6f, 204.2f, 877.5f, 202.4f, 852.0f)
                curveTo(200.3f, 821.7f, 230.7f, 800.0f, 239.9f, 773.3f)
                curveTo(242.7f, 765.2f, 242.1f, 757.5f, 242.0f, 749.0f)
                curveTo(216.2f, 713.5f, 176.9f, 728.0f, 157.2f, 688.4f)
                curveTo(145.3f, 664.5f, 159.7f, 645.6f, 167.9f, 623.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.9f, 321.5f)
                lineTo(238.9f, 321.5f)
                lineTo(239.3f, 323.0f)
                curveTo(233.6f, 333.7f, 234.3f, 332.8f, 223.2f, 338.0f)
                curveTo(221.2f, 341.9f, 229.6f, 350.5f, 222.9f, 358.3f)
                curveTo(213.7f, 369.0f, 210.0f, 358.3f, 203.7f, 358.8f)
                curveTo(204.8f, 362.4f, 210.8f, 365.3f, 213.4f, 369.4f)
                curveTo(218.2f, 377.0f, 205.5f, 380.6f, 201.9f, 385.9f)
                curveTo(192.3f, 400.0f, 196.0f, 417.9f, 204.4f, 431.4f)
                curveTo(216.7f, 451.1f, 229.2f, 452.4f, 249.8f, 457.1f)
                curveTo(250.7f, 462.7f, 251.2f, 466.7f, 248.9f, 471.9f)
                curveTo(246.0f, 475.3f, 243.2f, 475.0f, 238.6f, 476.7f)
                curveTo(235.8f, 481.3f, 241.1f, 486.6f, 239.5f, 488.9f)
                curveTo(235.2f, 495.1f, 224.5f, 527.5f, 220.0f, 530.2f)
                curveTo(218.5f, 532.3f, 217.9f, 533.6f, 216.8f, 535.9f)
                lineTo(215.6f, 535.9f)
                curveTo(214.5f, 533.7f, 216.0f, 527.0f, 216.5f, 524.2f)
                curveTo(218.4f, 512.3f, 217.9f, 504.0f, 216.8f, 492.1f)
                curveTo(209.6f, 482.9f, 203.7f, 476.3f, 198.2f, 465.7f)
                curveTo(184.7f, 439.8f, 183.0f, 397.8f, 192.1f, 370.4f)
                curveTo(180.4f, 379.4f, 179.9f, 384.8f, 170.9f, 396.0f)
                curveTo(179.4f, 373.1f, 187.8f, 350.2f, 199.6f, 328.7f)
                curveTo(210.7f, 325.0f, 225.1f, 323.1f, 236.9f, 321.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 336.2f)
                lineTo(248.1f, 335.7f)
                curveTo(251.2f, 339.8f, 254.3f, 344.6f, 257.2f, 348.9f)
                curveTo(253.5f, 353.5f, 250.9f, 356.2f, 246.8f, 360.3f)
                curveTo(244.2f, 360.9f, 234.1f, 357.7f, 229.2f, 356.9f)
                curveTo(227.9f, 346.3f, 225.7f, 342.4f, 236.0f, 336.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(335.1f, 701.9f)
                curveTo(346.0f, 701.4f, 356.4f, 722.0f, 338.1f, 728.0f)
                curveTo(334.0f, 726.9f, 329.8f, 725.4f, 325.8f, 724.0f)
                curveTo(324.8f, 719.5f, 324.2f, 711.7f, 323.7f, 706.9f)
                lineTo(335.1f, 701.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(306.2f, 702.6f)
                lineTo(307.0f, 702.9f)
                curveTo(323.4f, 708.3f, 326.3f, 720.9f, 309.1f, 729.0f)
                curveTo(305.5f, 729.4f, 299.4f, 727.8f, 297.5f, 724.8f)
                curveTo(291.4f, 715.1f, 300.6f, 707.3f, 306.2f, 702.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(475.1f, 241.3f)
                curveTo(487.4f, 244.2f, 494.0f, 261.8f, 472.6f, 265.6f)
                curveTo(465.8f, 263.4f, 463.8f, 261.0f, 458.8f, 256.1f)
                curveTo(460.2f, 252.8f, 461.1f, 248.8f, 462.0f, 245.4f)
                curveTo(466.8f, 243.5f, 470.2f, 242.6f, 475.1f, 241.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.8f, 361.1f)
                curveTo(232.2f, 360.9f, 234.3f, 361.1f, 241.5f, 362.7f)
                lineTo(241.6f, 378.4f)
                curveTo(239.5f, 380.5f, 236.1f, 383.2f, 233.7f, 385.2f)
                curveTo(219.8f, 389.0f, 211.2f, 373.1f, 224.8f, 361.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(321.0f, 728.9f)
                curveTo(324.9f, 728.1f, 330.9f, 729.9f, 335.0f, 730.7f)
                curveTo(336.5f, 741.3f, 338.6f, 745.1f, 329.2f, 751.9f)
                curveTo(312.4f, 754.2f, 308.6f, 736.4f, 321.0f, 728.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.0f, 752.0f)
                curveTo(359.3f, 751.2f, 346.2f, 765.4f, 348.6f, 776.1f)
                lineTo(347.5f, 776.2f)
                curveTo(339.7f, 775.3f, 334.3f, 774.5f, 329.8f, 767.2f)
                curveTo(325.8f, 760.6f, 330.3f, 754.9f, 336.0f, 752.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(434.1f, 313.9f)
                curveTo(441.2f, 314.3f, 445.0f, 315.9f, 448.2f, 322.6f)
                curveTo(449.6f, 325.6f, 449.8f, 329.0f, 448.6f, 332.1f)
                curveTo(447.2f, 335.7f, 445.6f, 335.7f, 442.3f, 337.2f)
                curveTo(435.5f, 337.2f, 430.6f, 338.2f, 426.6f, 332.3f)
                curveTo(425.5f, 325.9f, 430.6f, 319.5f, 434.1f, 313.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(469.2f, 288.3f)
                curveTo(472.9f, 288.0f, 478.4f, 287.2f, 481.8f, 289.1f)
                curveTo(489.7f, 293.6f, 487.3f, 302.2f, 482.9f, 308.6f)
                curveTo(465.3f, 311.7f, 461.6f, 302.6f, 469.2f, 288.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(317.1f, 680.8f)
                curveTo(325.6f, 681.5f, 330.2f, 689.2f, 329.7f, 697.3f)
                curveTo(328.5f, 700.5f, 325.6f, 701.4f, 322.5f, 703.0f)
                curveTo(316.6f, 707.9f, 298.8f, 690.6f, 317.1f, 680.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.6f, 265.6f)
                curveTo(483.3f, 265.7f, 484.0f, 265.5f, 486.0f, 267.0f)
                curveTo(488.9f, 276.8f, 490.9f, 279.4f, 497.5f, 286.4f)
                curveTo(500.9f, 286.4f, 503.7f, 286.0f, 505.7f, 289.0f)
                curveTo(504.5f, 292.3f, 497.6f, 296.4f, 494.5f, 298.6f)
                curveTo(493.3f, 299.4f, 492.8f, 299.3f, 491.5f, 299.7f)
                lineTo(490.7f, 298.0f)
                curveTo(491.2f, 295.0f, 492.7f, 293.5f, 494.7f, 291.1f)
                curveTo(488.6f, 285.1f, 483.6f, 286.4f, 474.2f, 276.1f)
                curveTo(476.2f, 272.7f, 478.5f, 269.0f, 480.6f, 265.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(482.7f, 216.2f)
                curveTo(490.2f, 217.6f, 490.8f, 220.0f, 495.2f, 226.5f)
                curveTo(491.2f, 231.0f, 491.6f, 234.6f, 486.8f, 240.1f)
                curveTo(475.0f, 234.2f, 463.6f, 223.9f, 482.7f, 216.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(294.0f, 660.3f)
                curveTo(294.5f, 660.5f, 295.0f, 660.7f, 295.5f, 660.9f)
                curveTo(302.6f, 664.0f, 311.1f, 667.0f, 314.0f, 674.1f)
                curveTo(313.7f, 678.1f, 313.0f, 677.6f, 309.9f, 681.3f)
                curveTo(306.7f, 682.9f, 303.0f, 683.5f, 299.4f, 683.1f)
                curveTo(289.5f, 682.1f, 292.8f, 666.4f, 294.0f, 660.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.8f, 384.5f)
                curveTo(219.9f, 385.4f, 225.0f, 387.9f, 229.8f, 389.9f)
                curveTo(229.9f, 391.6f, 230.0f, 393.2f, 230.0f, 394.9f)
                curveTo(230.3f, 400.9f, 230.7f, 402.3f, 226.5f, 406.8f)
                curveTo(211.4f, 412.3f, 209.4f, 395.3f, 214.8f, 384.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.9f, 382.5f)
                curveTo(245.7f, 383.5f, 253.1f, 393.7f, 255.7f, 397.1f)
                curveTo(253.2f, 401.4f, 252.6f, 402.7f, 249.0f, 406.1f)
                curveTo(230.2f, 406.1f, 231.7f, 393.7f, 241.9f, 382.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(291.9f, 684.0f)
                curveTo(301.9f, 683.7f, 310.8f, 697.6f, 294.4f, 706.5f)
                curveTo(292.9f, 707.7f, 293.8f, 707.2f, 291.5f, 707.3f)
                curveTo(286.8f, 702.4f, 283.9f, 694.5f, 285.1f, 687.7f)
                curveTo(287.7f, 684.5f, 287.3f, 685.4f, 291.9f, 684.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(459.4f, 223.9f)
                curveTo(462.9f, 224.1f, 463.7f, 224.3f, 467.1f, 225.2f)
                curveTo(470.2f, 228.9f, 469.6f, 233.5f, 469.7f, 238.6f)
                curveTo(465.2f, 240.4f, 462.7f, 241.5f, 457.8f, 241.9f)
                curveTo(454.3f, 241.1f, 447.3f, 240.7f, 443.4f, 240.4f)
                curveTo(449.0f, 231.1f, 450.0f, 229.4f, 459.4f, 223.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(449.6f, 291.0f)
                curveTo(456.0f, 294.1f, 458.2f, 295.6f, 459.2f, 303.1f)
                curveTo(460.0f, 310.0f, 455.7f, 312.9f, 449.6f, 313.2f)
                curveTo(446.1f, 311.1f, 441.0f, 309.0f, 437.2f, 307.2f)
                curveTo(441.5f, 300.2f, 443.3f, 296.4f, 449.6f, 291.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(498.6f, 194.1f)
                curveTo(499.9f, 195.3f, 501.3f, 200.9f, 506.1f, 205.9f)
                curveTo(502.5f, 211.4f, 501.5f, 217.6f, 495.1f, 218.2f)
                curveTo(476.5f, 208.3f, 488.0f, 203.7f, 498.6f, 194.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(297.5f, 329.5f)
                curveTo(307.4f, 332.5f, 316.0f, 341.1f, 307.7f, 350.6f)
                curveTo(288.9f, 354.5f, 294.7f, 342.9f, 297.5f, 329.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.9f, 406.9f)
                curveTo(244.0f, 406.6f, 250.0f, 417.4f, 243.0f, 423.4f)
                lineTo(239.7f, 422.2f)
                curveTo(234.7f, 420.8f, 224.7f, 418.3f, 224.0f, 412.8f)
                curveTo(225.5f, 409.6f, 229.5f, 408.4f, 232.9f, 406.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(466.1f, 310.1f)
                curveTo(467.3f, 310.7f, 472.2f, 315.1f, 472.8f, 316.7f)
                curveTo(471.6f, 319.7f, 464.5f, 324.0f, 461.2f, 326.6f)
                lineTo(457.0f, 329.3f)
                curveTo(453.1f, 328.6f, 452.9f, 325.5f, 453.4f, 321.9f)
                curveTo(454.6f, 314.1f, 459.7f, 314.4f, 465.4f, 310.6f)
                lineTo(466.1f, 310.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(418.9f, 341.5f)
                curveTo(424.9f, 341.2f, 431.1f, 341.7f, 437.1f, 342.1f)
                curveTo(433.0f, 345.2f, 428.1f, 349.8f, 424.2f, 353.3f)
                curveTo(421.4f, 356.2f, 419.9f, 357.7f, 416.0f, 356.9f)
                lineTo(414.7f, 354.4f)
                curveTo(414.2f, 348.6f, 415.4f, 346.2f, 418.9f, 341.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.2f, 498.6f)
                curveTo(244.3f, 499.4f, 245.0f, 499.9f, 246.2f, 502.6f)
                curveTo(245.4f, 509.2f, 241.4f, 514.7f, 237.9f, 520.5f)
                curveTo(234.8f, 518.6f, 233.3f, 515.5f, 231.4f, 512.3f)
                curveTo(235.1f, 506.0f, 236.4f, 504.0f, 241.2f, 498.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(349.6f, 725.8f)
                curveTo(352.4f, 729.0f, 353.6f, 742.8f, 349.3f, 746.5f)
                lineTo(344.7f, 746.0f)
                curveTo(335.4f, 738.4f, 342.7f, 730.7f, 349.6f, 725.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfdfdfd)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.7f, 548.8f)
                lineTo(222.0f, 549.6f)
                curveTo(223.0f, 553.0f, 217.7f, 569.2f, 214.1f, 570.8f)
                lineTo(207.4f, 559.4f)
                curveTo(211.9f, 553.9f, 214.2f, 551.6f, 220.7f, 548.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(253.1f, 474.8f)
                curveTo(254.8f, 475.8f, 257.7f, 480.6f, 258.9f, 482.5f)
                lineTo(248.8f, 494.1f)
                curveTo(247.2f, 495.0f, 248.1f, 494.7f, 245.9f, 494.5f)
                curveTo(244.8f, 491.5f, 245.9f, 486.5f, 246.4f, 483.1f)
                curveTo(249.4f, 480.0f, 250.6f, 478.3f, 253.1f, 474.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(273.0f, 661.9f)
                curveTo(278.6f, 661.6f, 283.9f, 664.0f, 286.5f, 669.2f)
                lineTo(286.7f, 669.6f)
                curveTo(288.6f, 673.4f, 287.4f, 676.1f, 286.4f, 680.2f)
                lineTo(285.7f, 680.4f)
                curveTo(283.0f, 678.7f, 275.2f, 665.4f, 273.0f, 661.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(310.3f, 353.8f)
                lineTo(311.3f, 354.2f)
                curveTo(312.3f, 356.9f, 308.9f, 369.1f, 306.5f, 371.4f)
                curveTo(303.5f, 367.6f, 301.1f, 365.2f, 302.3f, 360.1f)
                curveTo(304.3f, 356.6f, 306.8f, 355.7f, 310.3f, 353.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.9f, 525.5f)
                curveTo(232.5f, 526.0f, 231.7f, 525.5f, 233.3f, 527.3f)
                curveTo(233.1f, 530.1f, 228.8f, 537.9f, 227.3f, 541.4f)
                curveTo(223.1f, 540.4f, 221.8f, 535.7f, 223.1f, 531.9f)
                curveTo(224.7f, 527.5f, 226.1f, 527.5f, 229.9f, 525.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(334.6f, 780.2f)
                curveTo(337.5f, 781.1f, 337.8f, 781.3f, 339.6f, 783.7f)
                curveTo(340.7f, 787.1f, 339.5f, 790.2f, 338.5f, 793.7f)
                curveTo(336.5f, 793.5f, 336.6f, 793.4f, 334.8f, 792.2f)
                curveTo(333.3f, 788.9f, 334.3f, 784.0f, 334.6f, 780.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfdfdfd)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(276.4f, 651.9f)
                curveTo(279.4f, 652.1f, 286.5f, 656.5f, 289.3f, 658.1f)
                lineTo(289.6f, 660.5f)
                curveTo(282.6f, 661.8f, 277.8f, 659.1f, 276.4f, 651.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfdfdfd)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(391.7f, 370.7f)
                lineTo(393.5f, 371.5f)
                lineTo(393.9f, 373.5f)
                curveTo(392.8f, 376.5f, 389.2f, 379.5f, 386.7f, 381.8f)
                curveTo(385.2f, 381.7f, 386.0f, 381.9f, 384.5f, 380.6f)
                curveTo(384.5f, 376.3f, 388.7f, 373.3f, 391.7f, 370.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfdfdfd)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(261.4f, 645.8f)
                curveTo(267.1f, 645.8f, 270.6f, 650.7f, 273.1f, 655.2f)
                curveTo(266.6f, 655.3f, 262.5f, 652.2f, 261.4f, 645.8f)
                close()
            }
        }
        .build()
        return _standardAnnTakamaki!!
    }

private var _standardAnnTakamaki: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = StandardSenderAvatar.StandardAnnTakamaki, contentDescription = "")
    }
}
