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

public val StandardSenderAvatar.StandardTakutoMaruki: ImageVector
    get() {
        if (_standardTakutoMaruki != null) {
            return _standardTakutoMaruki!!
        }
        _standardTakutoMaruki = Builder(name = "StandardTakutoMaruki", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 1024.0f, viewportHeight = 1024.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(300.5f, 117.6f)
                curveTo(316.7f, 97.6f, 319.9f, 100.6f, 341.8f, 90.1f)
                curveTo(349.7f, 86.3f, 358.7f, 77.1f, 368.4f, 72.8f)
                lineTo(369.1f, 72.5f)
                curveTo(375.7f, 69.6f, 386.1f, 70.9f, 391.4f, 68.1f)
                curveTo(405.4f, 60.5f, 417.8f, 47.2f, 431.3f, 39.1f)
                curveTo(446.3f, 30.1f, 467.8f, 24.4f, 484.9f, 21.2f)
                curveTo(495.9f, 19.2f, 503.9f, 14.4f, 515.4f, 19.1f)
                curveTo(540.7f, 29.7f, 558.9f, 46.0f, 578.1f, 65.0f)
                curveTo(583.8f, 70.5f, 594.2f, 75.4f, 600.2f, 80.6f)
                curveTo(611.9f, 90.6f, 618.3f, 92.9f, 632.3f, 97.8f)
                curveTo(635.1f, 102.8f, 636.7f, 106.0f, 642.6f, 107.1f)
                curveTo(661.5f, 110.4f, 678.2f, 112.1f, 692.6f, 126.5f)
                curveTo(695.4f, 129.3f, 701.8f, 134.4f, 703.3f, 138.0f)
                curveTo(715.0f, 167.4f, 721.3f, 199.4f, 730.4f, 229.3f)
                curveTo(739.2f, 258.4f, 770.5f, 281.5f, 777.6f, 312.1f)
                curveTo(780.3f, 321.4f, 781.1f, 329.7f, 782.4f, 339.3f)
                curveTo(774.7f, 360.8f, 757.7f, 382.7f, 748.0f, 403.5f)
                curveTo(741.1f, 418.4f, 736.1f, 443.4f, 735.0f, 460.1f)
                curveTo(734.5f, 467.2f, 743.8f, 485.4f, 739.5f, 490.9f)
                curveTo(736.1f, 491.4f, 730.1f, 491.9f, 728.5f, 495.1f)
                curveTo(717.8f, 517.1f, 725.6f, 547.3f, 721.1f, 570.2f)
                curveTo(719.8f, 576.8f, 713.0f, 589.8f, 710.7f, 596.8f)
                curveTo(698.3f, 633.5f, 686.6f, 670.3f, 673.6f, 706.7f)
                curveTo(670.2f, 716.3f, 666.5f, 730.9f, 661.4f, 739.2f)
                curveTo(656.5f, 747.1f, 640.1f, 754.8f, 633.7f, 762.1f)
                curveTo(635.2f, 766.6f, 641.7f, 768.0f, 646.9f, 771.3f)
                curveTo(659.8f, 779.6f, 686.1f, 787.3f, 695.7f, 798.3f)
                curveTo(696.7f, 799.5f, 693.2f, 808.8f, 693.1f, 812.0f)
                curveTo(693.0f, 824.6f, 691.7f, 840.2f, 692.2f, 852.6f)
                curveTo(745.2f, 877.2f, 798.5f, 907.2f, 851.4f, 932.8f)
                curveTo(864.6f, 939.3f, 881.3f, 939.1f, 890.8f, 948.0f)
                curveTo(900.4f, 957.0f, 909.1f, 978.8f, 916.2f, 989.6f)
                curveTo(921.6f, 997.7f, 939.0f, 1017.3f, 946.4f, 1024.0f)
                lineTo(0.0f, 1024.0f)
                lineTo(0.0f, 974.4f)
                curveTo(11.2f, 964.6f, 7.7f, 942.3f, 30.8f, 927.9f)
                curveTo(56.4f, 908.6f, 88.9f, 909.2f, 116.0f, 897.4f)
                curveTo(173.6f, 872.3f, 231.7f, 845.0f, 286.9f, 815.0f)
                curveTo(291.6f, 812.4f, 285.8f, 763.8f, 284.5f, 756.8f)
                curveTo(290.3f, 756.2f, 314.9f, 754.0f, 312.4f, 746.2f)
                curveTo(306.9f, 728.4f, 319.6f, 725.3f, 336.2f, 718.9f)
                curveTo(332.0f, 696.4f, 331.4f, 692.5f, 317.7f, 674.3f)
                curveTo(315.7f, 671.7f, 315.8f, 666.5f, 311.9f, 662.8f)
                curveTo(307.0f, 663.7f, 287.8f, 680.3f, 283.2f, 680.5f)
                curveTo(281.8f, 676.8f, 291.5f, 660.1f, 293.0f, 655.1f)
                curveTo(294.3f, 650.9f, 295.0f, 647.4f, 295.9f, 643.0f)
                curveTo(287.7f, 624.4f, 273.2f, 623.7f, 263.6f, 608.6f)
                lineTo(263.7f, 593.6f)
                curveTo(251.2f, 588.6f, 238.3f, 579.5f, 226.4f, 573.0f)
                curveTo(212.8f, 565.7f, 208.7f, 551.8f, 204.1f, 538.1f)
                curveTo(205.1f, 534.0f, 206.0f, 529.6f, 207.1f, 525.5f)
                curveTo(198.5f, 508.1f, 181.0f, 486.8f, 172.0f, 468.2f)
                curveTo(167.0f, 457.9f, 162.8f, 426.9f, 151.3f, 422.4f)
                lineTo(149.4f, 422.9f)
                curveTo(146.9f, 431.7f, 166.2f, 458.9f, 159.6f, 463.1f)
                curveTo(155.9f, 462.0f, 132.2f, 427.0f, 130.9f, 423.5f)
                curveTo(120.7f, 396.1f, 120.5f, 363.4f, 127.8f, 335.4f)
                curveTo(130.0f, 326.8f, 142.0f, 310.7f, 145.5f, 300.8f)
                curveTo(149.0f, 290.5f, 147.8f, 280.9f, 150.4f, 270.2f)
                curveTo(152.7f, 260.6f, 167.6f, 244.2f, 169.6f, 237.0f)
                curveTo(177.6f, 209.2f, 176.7f, 205.3f, 197.0f, 183.6f)
                curveTo(219.0f, 160.2f, 240.9f, 138.0f, 271.3f, 125.1f)
                curveTo(284.2f, 119.4f, 286.6f, 119.3f, 300.5f, 117.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(399.0f, 475.5f)
                curveTo(406.0f, 491.5f, 405.4f, 504.7f, 415.9f, 520.7f)
                curveTo(430.6f, 543.2f, 449.0f, 541.0f, 473.1f, 541.2f)
                curveTo(477.1f, 541.3f, 481.2f, 540.1f, 485.1f, 539.6f)
                curveTo(512.4f, 533.1f, 549.4f, 532.6f, 571.8f, 514.7f)
                curveTo(586.0f, 503.4f, 578.3f, 476.3f, 585.1f, 461.4f)
                curveTo(588.6f, 453.6f, 593.6f, 452.2f, 600.9f, 449.4f)
                curveTo(600.6f, 479.7f, 615.9f, 534.9f, 626.5f, 563.9f)
                curveTo(612.8f, 577.3f, 615.7f, 573.9f, 597.6f, 574.1f)
                curveTo(597.0f, 574.1f, 588.5f, 579.3f, 587.1f, 580.2f)
                curveTo(595.8f, 585.6f, 600.1f, 593.0f, 610.6f, 599.4f)
                curveTo(635.5f, 597.7f, 643.0f, 587.5f, 647.7f, 564.1f)
                curveTo(644.7f, 555.9f, 637.9f, 543.4f, 633.7f, 535.2f)
                curveTo(625.0f, 518.7f, 619.3f, 506.0f, 613.5f, 488.2f)
                curveTo(624.0f, 499.3f, 626.7f, 503.6f, 640.8f, 509.9f)
                curveTo(643.2f, 509.5f, 645.6f, 509.3f, 648.0f, 509.0f)
                curveTo(668.5f, 506.6f, 687.1f, 498.0f, 707.0f, 492.9f)
                curveTo(710.4f, 531.7f, 705.4f, 541.1f, 693.8f, 577.6f)
                lineTo(674.3f, 641.8f)
                curveTo(666.6f, 667.3f, 661.4f, 694.8f, 653.4f, 720.9f)
                curveTo(647.5f, 716.9f, 639.1f, 713.2f, 632.3f, 710.8f)
                lineTo(631.2f, 710.3f)
                curveTo(624.4f, 710.3f, 625.0f, 710.9f, 621.7f, 717.1f)
                curveTo(622.9f, 723.4f, 624.4f, 729.7f, 625.0f, 735.9f)
                curveTo(621.0f, 736.7f, 615.6f, 728.1f, 612.6f, 726.2f)
                curveTo(610.7f, 737.2f, 609.8f, 738.6f, 603.4f, 747.6f)
                curveTo(603.2f, 742.7f, 603.5f, 727.7f, 599.4f, 725.3f)
                curveTo(593.6f, 728.6f, 593.6f, 742.8f, 589.3f, 745.3f)
                curveTo(574.8f, 740.6f, 587.1f, 735.8f, 584.1f, 728.8f)
                curveTo(581.4f, 727.1f, 576.2f, 726.4f, 573.6f, 728.3f)
                curveTo(571.8f, 731.9f, 571.7f, 738.2f, 571.3f, 742.4f)
                curveTo(565.2f, 740.4f, 554.6f, 734.3f, 549.3f, 729.7f)
                curveTo(548.7f, 729.2f, 550.8f, 724.9f, 548.5f, 721.3f)
                curveTo(543.6f, 722.2f, 547.4f, 725.4f, 542.9f, 727.5f)
                curveTo(534.5f, 724.9f, 520.5f, 716.6f, 512.0f, 712.5f)
                curveTo(485.2f, 699.7f, 459.1f, 686.4f, 434.0f, 670.7f)
                curveTo(411.7f, 656.8f, 402.3f, 654.0f, 392.7f, 627.9f)
                curveTo(384.1f, 604.7f, 350.0f, 596.1f, 329.4f, 585.1f)
                curveTo(303.6f, 571.5f, 284.5f, 548.1f, 276.2f, 520.1f)
                curveTo(268.3f, 493.7f, 272.3f, 472.5f, 301.3f, 463.8f)
                curveTo(307.2f, 465.7f, 320.3f, 470.3f, 324.0f, 475.2f)
                curveTo(341.4f, 497.7f, 347.2f, 527.5f, 364.1f, 550.5f)
                curveTo(370.9f, 559.7f, 376.0f, 569.4f, 384.2f, 577.8f)
                curveTo(391.9f, 573.2f, 395.9f, 568.1f, 401.7f, 561.4f)
                curveTo(399.4f, 568.1f, 396.0f, 575.8f, 393.4f, 583.0f)
                curveTo(397.8f, 578.8f, 406.8f, 567.6f, 409.9f, 562.5f)
                curveTo(407.4f, 558.8f, 405.0f, 555.1f, 402.6f, 551.4f)
                curveTo(399.4f, 553.1f, 397.2f, 554.8f, 393.6f, 554.9f)
                lineTo(392.6f, 553.6f)
                curveTo(394.2f, 550.3f, 396.7f, 549.3f, 399.9f, 547.5f)
                curveTo(390.6f, 534.1f, 390.2f, 535.5f, 387.7f, 519.4f)
                lineTo(377.8f, 513.6f)
                curveTo(380.7f, 509.8f, 384.5f, 504.9f, 384.4f, 500.0f)
                curveTo(380.7f, 494.9f, 376.8f, 500.3f, 373.0f, 492.0f)
                curveTo(374.1f, 482.5f, 391.1f, 477.5f, 399.0f, 475.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(612.6f, 726.2f)
                curveTo(617.7f, 722.2f, 612.3f, 719.7f, 621.7f, 717.1f)
                curveTo(622.9f, 723.4f, 624.4f, 729.7f, 625.0f, 735.9f)
                curveTo(621.0f, 736.7f, 615.6f, 728.1f, 612.6f, 726.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(303.5f, 492.1f)
                curveTo(311.7f, 491.6f, 315.7f, 492.9f, 322.3f, 497.8f)
                curveTo(333.2f, 505.7f, 370.0f, 571.4f, 367.2f, 580.7f)
                curveTo(361.1f, 581.9f, 353.6f, 573.6f, 347.3f, 572.0f)
                curveTo(330.1f, 572.9f, 334.2f, 569.4f, 327.0f, 556.2f)
                curveTo(325.6f, 553.7f, 314.9f, 551.3f, 314.9f, 547.1f)
                curveTo(314.9f, 539.5f, 321.8f, 532.4f, 326.5f, 527.1f)
                curveTo(320.1f, 520.1f, 317.1f, 514.1f, 311.3f, 506.9f)
                curveTo(304.4f, 505.4f, 305.8f, 513.6f, 299.6f, 517.2f)
                curveTo(296.6f, 517.0f, 297.8f, 517.4f, 295.1f, 515.1f)
                curveTo(292.0f, 507.2f, 297.1f, 497.1f, 303.5f, 492.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(628.8f, 617.4f)
                curveTo(632.5f, 617.3f, 632.3f, 616.6f, 634.5f, 618.6f)
                curveTo(633.9f, 634.8f, 611.1f, 631.9f, 600.6f, 633.8f)
                curveTo(569.9f, 639.3f, 551.1f, 648.8f, 519.0f, 646.6f)
                curveTo(515.2f, 645.7f, 514.6f, 645.7f, 512.0f, 642.8f)
                curveTo(511.4f, 639.8f, 511.2f, 640.9f, 512.7f, 638.4f)
                curveTo(515.2f, 638.5f, 532.2f, 640.0f, 532.9f, 639.8f)
                curveTo(554.0f, 635.5f, 575.6f, 627.8f, 596.4f, 622.2f)
                curveTo(604.9f, 619.9f, 619.9f, 618.5f, 628.8f, 617.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(627.9f, 641.1f)
                lineTo(629.1f, 642.6f)
                curveTo(630.0f, 649.8f, 614.9f, 661.9f, 609.3f, 665.5f)
                curveTo(606.4f, 665.4f, 604.1f, 662.9f, 601.7f, 661.0f)
                curveTo(598.0f, 657.5f, 595.2f, 655.9f, 596.6f, 650.8f)
                curveTo(601.0f, 646.3f, 617.4f, 645.9f, 627.9f, 641.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(524.4f, 419.5f)
                curveTo(526.1f, 419.3f, 525.7f, 419.4f, 527.5f, 420.3f)
                curveTo(542.0f, 440.4f, 535.3f, 487.9f, 535.1f, 514.3f)
                curveTo(500.0f, 523.0f, 486.8f, 523.2f, 452.3f, 527.1f)
                curveTo(447.3f, 524.7f, 444.6f, 522.8f, 440.1f, 519.7f)
                curveTo(439.7f, 519.4f, 439.3f, 519.0f, 438.9f, 518.6f)
                curveTo(425.8f, 506.3f, 417.9f, 480.2f, 417.5f, 462.2f)
                curveTo(430.6f, 435.4f, 496.7f, 422.1f, 524.4f, 419.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(504.9f, 434.2f)
                curveTo(510.5f, 433.3f, 519.4f, 435.9f, 525.1f, 437.3f)
                lineTo(525.6f, 438.8f)
                lineTo(526.3f, 438.2f)
                curveTo(518.5f, 441.5f, 516.0f, 437.3f, 501.8f, 443.8f)
                curveTo(506.1f, 447.6f, 515.7f, 453.6f, 515.9f, 459.0f)
                lineTo(514.2f, 460.4f)
                curveTo(505.0f, 461.7f, 496.3f, 446.6f, 487.8f, 448.0f)
                curveTo(479.5f, 458.4f, 499.5f, 463.1f, 477.1f, 481.8f)
                curveTo(468.5f, 482.2f, 463.7f, 482.6f, 455.6f, 478.7f)
                curveTo(450.1f, 476.0f, 447.9f, 472.5f, 441.8f, 473.6f)
                curveTo(441.1f, 476.3f, 441.0f, 476.7f, 441.2f, 479.5f)
                curveTo(445.9f, 488.9f, 461.6f, 492.1f, 462.9f, 499.4f)
                lineTo(461.0f, 500.3f)
                curveTo(447.6f, 499.2f, 415.5f, 484.6f, 428.9f, 467.3f)
                curveTo(446.4f, 444.7f, 478.2f, 439.2f, 504.9f, 434.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(408.7f, 156.9f)
                lineTo(409.3f, 157.8f)
                curveTo(409.2f, 161.0f, 399.8f, 175.5f, 397.6f, 179.5f)
                curveTo(392.5f, 188.7f, 389.2f, 196.6f, 385.2f, 206.2f)
                curveTo(388.8f, 205.0f, 394.1f, 203.4f, 397.5f, 204.6f)
                curveTo(395.1f, 211.5f, 373.7f, 239.2f, 368.1f, 249.7f)
                curveTo(375.8f, 244.8f, 394.5f, 236.2f, 403.5f, 231.7f)
                curveTo(405.3f, 236.6f, 405.9f, 238.8f, 409.2f, 242.9f)
                curveTo(412.6f, 244.2f, 414.2f, 242.1f, 419.7f, 241.2f)
                curveTo(423.0f, 241.7f, 425.8f, 245.2f, 428.3f, 247.7f)
                curveTo(437.4f, 233.9f, 449.3f, 220.8f, 459.4f, 207.5f)
                curveTo(465.3f, 212.8f, 481.4f, 225.2f, 488.1f, 228.8f)
                curveTo(488.9f, 221.4f, 491.6f, 193.8f, 495.8f, 189.0f)
                curveTo(498.8f, 193.2f, 497.3f, 231.2f, 498.5f, 240.0f)
                curveTo(499.8f, 249.1f, 501.4f, 257.9f, 503.4f, 267.1f)
                lineTo(486.7f, 283.9f)
                curveTo(481.0f, 275.8f, 471.6f, 261.0f, 463.6f, 256.1f)
                curveTo(460.1f, 255.8f, 461.1f, 255.9f, 457.6f, 258.1f)
                curveTo(445.6f, 268.4f, 444.2f, 278.8f, 440.3f, 293.4f)
                lineTo(427.4f, 293.6f)
                curveTo(427.4f, 293.9f, 427.3f, 294.3f, 427.3f, 294.6f)
                curveTo(427.3f, 295.0f, 427.1f, 295.8f, 427.1f, 296.2f)
                curveTo(426.9f, 304.2f, 410.9f, 325.1f, 405.9f, 333.3f)
                curveTo(402.6f, 316.3f, 397.2f, 298.0f, 392.9f, 281.1f)
                curveTo(391.6f, 276.0f, 388.5f, 271.2f, 387.4f, 267.7f)
                curveTo(386.7f, 265.3f, 390.3f, 257.7f, 390.1f, 252.8f)
                lineTo(388.6f, 251.7f)
                curveTo(384.2f, 252.1f, 382.1f, 252.5f, 380.0f, 256.4f)
                curveTo(383.9f, 266.7f, 377.6f, 272.9f, 371.8f, 281.0f)
                curveTo(364.2f, 276.7f, 362.9f, 273.3f, 357.5f, 270.2f)
                curveTo(355.1f, 270.3f, 344.9f, 278.6f, 341.6f, 281.0f)
                curveTo(334.6f, 277.1f, 332.1f, 274.5f, 327.1f, 268.6f)
                curveTo(330.9f, 259.2f, 332.9f, 258.2f, 340.5f, 251.8f)
                curveTo(344.2f, 254.9f, 350.7f, 261.4f, 355.4f, 259.8f)
                lineTo(355.6f, 260.8f)
                curveTo(355.8f, 255.9f, 346.6f, 247.4f, 343.2f, 243.2f)
                curveTo(347.0f, 232.3f, 347.9f, 232.6f, 356.0f, 225.4f)
                lineTo(355.5f, 224.2f)
                lineTo(352.7f, 224.6f)
                lineTo(352.3f, 222.9f)
                curveTo(360.0f, 204.2f, 371.6f, 188.8f, 383.1f, 172.4f)
                curveTo(393.4f, 168.7f, 399.9f, 163.2f, 408.7f, 156.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(644.7f, 256.6f)
                curveTo(652.8f, 263.0f, 644.3f, 271.9f, 668.6f, 283.8f)
                curveTo(671.2f, 304.2f, 682.9f, 332.5f, 692.0f, 351.4f)
                curveTo(697.3f, 362.4f, 703.5f, 369.0f, 707.9f, 381.9f)
                curveTo(675.6f, 381.5f, 644.9f, 391.5f, 616.6f, 406.3f)
                curveTo(606.2f, 411.3f, 605.0f, 415.4f, 597.1f, 423.0f)
                curveTo(592.7f, 427.2f, 574.8f, 422.0f, 572.1f, 416.8f)
                curveTo(567.8f, 408.3f, 575.2f, 390.7f, 577.7f, 381.4f)
                curveTo(616.3f, 355.1f, 612.9f, 349.2f, 624.7f, 304.4f)
                curveTo(627.3f, 294.8f, 640.0f, 265.7f, 644.7f, 256.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(657.4f, 347.6f)
                curveTo(662.3f, 349.4f, 664.5f, 350.6f, 669.0f, 353.2f)
                curveTo(674.1f, 355.3f, 689.0f, 360.1f, 690.8f, 364.5f)
                curveTo(688.3f, 366.8f, 678.8f, 369.1f, 675.1f, 369.9f)
                curveTo(650.3f, 376.0f, 629.6f, 385.6f, 607.8f, 399.0f)
                curveTo(619.0f, 380.0f, 632.8f, 372.7f, 653.6f, 365.4f)
                curveTo(657.8f, 363.9f, 667.0f, 362.1f, 670.3f, 359.9f)
                curveTo(669.8f, 358.5f, 670.2f, 358.9f, 669.2f, 358.0f)
                curveTo(665.1f, 355.0f, 661.2f, 351.2f, 657.4f, 347.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(206.9f, 270.2f)
                curveTo(223.4f, 257.4f, 244.7f, 233.8f, 261.2f, 218.8f)
                curveTo(260.5f, 227.3f, 259.8f, 237.1f, 257.9f, 245.3f)
                curveTo(255.9f, 254.3f, 252.8f, 262.5f, 251.2f, 271.7f)
                curveTo(263.2f, 266.0f, 275.4f, 257.1f, 287.2f, 250.1f)
                curveTo(286.9f, 258.6f, 286.4f, 267.6f, 287.1f, 276.1f)
                curveTo(287.9f, 286.2f, 289.8f, 296.0f, 290.3f, 306.1f)
                curveTo(286.3f, 306.2f, 282.9f, 306.2f, 278.8f, 306.0f)
                lineTo(277.7f, 304.5f)
                curveTo(277.8f, 301.5f, 277.9f, 300.0f, 276.5f, 297.2f)
                curveTo(258.6f, 321.0f, 255.9f, 287.0f, 251.8f, 283.6f)
                curveTo(242.4f, 288.6f, 234.2f, 332.8f, 217.4f, 328.7f)
                curveTo(210.8f, 327.1f, 206.0f, 318.4f, 210.1f, 311.6f)
                curveTo(219.4f, 296.5f, 225.1f, 307.0f, 235.1f, 313.4f)
                curveTo(232.6f, 309.4f, 223.6f, 293.4f, 221.5f, 292.2f)
                curveTo(219.5f, 293.0f, 211.0f, 302.3f, 206.2f, 305.8f)
                curveTo(200.9f, 302.7f, 196.8f, 300.0f, 191.8f, 296.5f)
                curveTo(195.7f, 290.1f, 198.4f, 282.8f, 202.5f, 277.3f)
                curveTo(206.1f, 279.4f, 209.5f, 281.7f, 213.7f, 281.8f)
                lineTo(215.5f, 280.8f)
                curveTo(215.3f, 277.2f, 213.9f, 276.2f, 211.0f, 273.6f)
                curveTo(209.6f, 272.5f, 208.3f, 271.3f, 206.9f, 270.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfefefe)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(276.5f, 297.2f)
                curveTo(278.0f, 294.2f, 277.4f, 294.2f, 280.0f, 293.2f)
                curveTo(284.3f, 295.1f, 286.9f, 302.6f, 290.3f, 306.1f)
                curveTo(286.3f, 306.2f, 282.9f, 306.2f, 278.8f, 306.0f)
                lineTo(277.7f, 304.5f)
                curveTo(277.8f, 301.5f, 277.9f, 300.0f, 276.5f, 297.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(693.4f, 400.3f)
                curveTo(696.6f, 400.0f, 695.7f, 399.6f, 698.3f, 400.8f)
                curveTo(701.9f, 409.2f, 699.2f, 463.8f, 701.0f, 479.1f)
                curveTo(679.0f, 490.6f, 663.5f, 496.5f, 638.4f, 496.1f)
                curveTo(630.5f, 488.3f, 624.6f, 472.8f, 620.2f, 462.4f)
                curveTo(621.5f, 455.7f, 626.2f, 439.1f, 634.2f, 439.0f)
                curveTo(638.4f, 443.9f, 632.8f, 447.3f, 640.7f, 455.8f)
                curveTo(647.1f, 459.7f, 652.2f, 457.6f, 658.8f, 455.5f)
                curveTo(665.1f, 445.0f, 666.1f, 429.5f, 670.5f, 426.6f)
                curveTo(674.7f, 426.7f, 673.6f, 426.0f, 676.3f, 428.4f)
                curveTo(678.3f, 434.8f, 672.7f, 452.0f, 671.2f, 460.4f)
                curveTo(692.3f, 443.1f, 681.7f, 436.6f, 694.8f, 416.7f)
                curveTo(691.5f, 416.1f, 684.3f, 413.7f, 682.6f, 413.6f)
                curveTo(672.4f, 413.1f, 658.2f, 417.1f, 647.9f, 419.0f)
                curveTo(662.5f, 407.9f, 675.6f, 403.4f, 693.4f, 400.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(599.8f, 134.5f)
                curveTo(601.3f, 135.6f, 602.7f, 137.8f, 602.9f, 139.6f)
                curveTo(606.6f, 164.3f, 610.5f, 190.0f, 613.6f, 214.7f)
                curveTo(593.8f, 196.0f, 584.2f, 198.7f, 558.0f, 199.1f)
                curveTo(556.0f, 205.2f, 546.0f, 231.6f, 542.6f, 235.1f)
                curveTo(540.5f, 233.4f, 540.0f, 229.2f, 539.3f, 226.3f)
                curveTo(532.7f, 198.8f, 529.4f, 193.2f, 529.1f, 163.6f)
                curveTo(534.1f, 157.9f, 536.4f, 156.1f, 542.5f, 151.4f)
                curveTo(552.7f, 159.0f, 557.0f, 168.3f, 567.0f, 175.9f)
                curveTo(572.9f, 176.2f, 579.3f, 175.9f, 585.3f, 175.7f)
                curveTo(593.5f, 164.3f, 595.9f, 148.3f, 599.8f, 134.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(538.1f, 418.6f)
                curveTo(578.7f, 422.1f, 579.2f, 476.0f, 564.4f, 502.6f)
                curveTo(558.5f, 510.2f, 552.9f, 511.3f, 544.1f, 513.1f)
                curveTo(542.9f, 477.1f, 547.2f, 454.0f, 538.1f, 418.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(552.3f, 390.0f)
                lineTo(554.2f, 391.4f)
                curveTo(557.6f, 388.8f, 560.0f, 385.3f, 563.4f, 384.0f)
                lineTo(564.5f, 384.7f)
                curveTo(565.4f, 393.7f, 564.1f, 402.9f, 565.2f, 414.6f)
                curveTo(540.1f, 399.0f, 510.4f, 412.5f, 482.3f, 415.9f)
                curveTo(500.4f, 399.1f, 503.1f, 397.1f, 529.2f, 398.2f)
                curveTo(535.0f, 398.5f, 545.9f, 399.3f, 551.1f, 396.9f)
                lineTo(551.6f, 395.6f)
                curveTo(551.1f, 395.3f, 549.5f, 394.1f, 549.1f, 393.9f)
                curveTo(550.0f, 393.0f, 551.4f, 391.1f, 552.3f, 390.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(710.0f, 395.2f)
                curveTo(729.3f, 397.8f, 723.7f, 409.8f, 724.2f, 426.2f)
                curveTo(724.5f, 439.7f, 724.4f, 457.9f, 718.0f, 469.8f)
                lineTo(715.0f, 473.0f)
                lineTo(713.5f, 472.9f)
                curveTo(714.1f, 451.3f, 710.9f, 418.3f, 710.0f, 395.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(514.9f, 388.7f)
                curveTo(529.1f, 378.1f, 547.9f, 369.1f, 565.0f, 356.7f)
                curveTo(559.0f, 369.7f, 556.1f, 376.3f, 552.3f, 390.0f)
                curveTo(551.4f, 391.1f, 550.0f, 393.0f, 549.1f, 393.9f)
                curveTo(536.7f, 389.5f, 528.0f, 389.2f, 514.9f, 388.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(322.9f, 277.7f)
                curveTo(340.1f, 282.2f, 341.8f, 292.0f, 330.0f, 304.4f)
                curveTo(329.6f, 304.5f, 329.1f, 304.5f, 328.7f, 304.6f)
                curveTo(311.6f, 306.3f, 312.5f, 287.4f, 322.9f, 277.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(339.5f, 302.6f)
                curveTo(341.9f, 302.8f, 343.9f, 303.7f, 346.0f, 304.8f)
                curveTo(357.8f, 311.2f, 348.8f, 322.6f, 343.8f, 330.5f)
                curveTo(339.0f, 329.3f, 334.2f, 326.1f, 329.9f, 323.5f)
                curveTo(330.0f, 319.1f, 330.3f, 314.3f, 330.6f, 309.8f)
                curveTo(332.9f, 307.6f, 336.9f, 304.7f, 339.5f, 302.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(323.0f, 329.8f)
                curveTo(325.1f, 330.0f, 327.2f, 330.4f, 329.2f, 330.8f)
                curveTo(332.7f, 331.5f, 334.7f, 332.7f, 336.6f, 335.6f)
                curveTo(338.2f, 341.9f, 331.7f, 350.4f, 328.5f, 357.5f)
                curveTo(314.5f, 350.5f, 307.1f, 341.1f, 323.0f, 329.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(354.3f, 278.9f)
                curveTo(358.9f, 278.7f, 365.4f, 284.5f, 369.2f, 287.3f)
                curveTo(366.7f, 293.2f, 362.7f, 298.6f, 358.8f, 303.6f)
                curveTo(348.0f, 309.1f, 336.9f, 288.4f, 354.3f, 278.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(191.4f, 304.3f)
                curveTo(197.4f, 306.1f, 204.3f, 312.7f, 202.4f, 319.2f)
                curveTo(200.9f, 324.5f, 198.0f, 325.4f, 193.7f, 328.0f)
                curveTo(190.3f, 329.0f, 189.6f, 329.3f, 186.0f, 328.6f)
                curveTo(179.5f, 323.0f, 187.6f, 310.0f, 191.4f, 304.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.9f, 329.8f)
                lineTo(237.1f, 330.7f)
                curveTo(243.7f, 336.2f, 235.5f, 347.5f, 231.7f, 353.4f)
                curveTo(216.1f, 349.6f, 222.1f, 336.9f, 231.9f, 329.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.3f, 356.3f)
                curveTo(191.2f, 355.6f, 194.2f, 354.1f, 196.8f, 358.6f)
                curveTo(196.5f, 362.9f, 190.8f, 372.8f, 188.5f, 377.6f)
                curveTo(180.0f, 379.8f, 174.3f, 362.0f, 186.3f, 356.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(203.0f, 330.0f)
                curveTo(206.0f, 329.8f, 208.8f, 329.1f, 211.2f, 330.9f)
                curveTo(212.9f, 337.2f, 204.7f, 341.9f, 201.1f, 352.0f)
                lineTo(200.9f, 352.5f)
                curveTo(196.5f, 352.0f, 191.3f, 347.4f, 192.6f, 342.4f)
                curveTo(194.3f, 336.0f, 197.8f, 333.6f, 203.0f, 330.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(249.2f, 302.8f)
                lineTo(253.4f, 303.5f)
                curveTo(259.5f, 309.0f, 249.1f, 320.1f, 245.1f, 325.9f)
                curveTo(241.3f, 325.2f, 242.5f, 325.9f, 240.1f, 323.4f)
                curveTo(238.7f, 320.0f, 240.1f, 315.0f, 240.8f, 311.2f)
                curveTo(243.4f, 307.9f, 246.2f, 305.5f, 249.2f, 302.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(631.2f, 710.3f)
                lineTo(632.3f, 710.8f)
                curveTo(635.8f, 714.7f, 647.2f, 724.6f, 639.8f, 729.8f)
                curveTo(630.3f, 729.5f, 626.6f, 717.9f, 631.2f, 710.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(314.2f, 356.3f)
                curveTo(316.0f, 357.5f, 323.4f, 363.8f, 325.7f, 365.7f)
                lineTo(319.3f, 374.9f)
                curveTo(317.7f, 376.7f, 317.5f, 376.8f, 315.3f, 377.8f)
                lineTo(314.0f, 377.1f)
                curveTo(312.9f, 372.8f, 314.0f, 361.4f, 314.2f, 356.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(178.7f, 331.5f)
                curveTo(180.8f, 332.8f, 185.1f, 336.0f, 187.3f, 337.5f)
                curveTo(186.9f, 341.0f, 186.7f, 347.4f, 184.8f, 350.0f)
                curveTo(181.5f, 351.1f, 181.4f, 351.8f, 178.5f, 350.9f)
                curveTo(175.5f, 345.9f, 177.8f, 337.6f, 178.7f, 331.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(315.2f, 306.5f)
                curveTo(323.2f, 309.7f, 324.6f, 315.6f, 321.7f, 323.0f)
                curveTo(319.7f, 324.6f, 319.4f, 324.9f, 316.9f, 325.6f)
                lineTo(315.4f, 324.5f)
                curveTo(313.8f, 320.3f, 314.9f, 311.4f, 315.2f, 306.5f)
                close()
            }
        }
        .build()
        return _standardTakutoMaruki!!
    }

private var _standardTakutoMaruki: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = StandardSenderAvatar.StandardTakutoMaruki, contentDescription = "")
    }
}
