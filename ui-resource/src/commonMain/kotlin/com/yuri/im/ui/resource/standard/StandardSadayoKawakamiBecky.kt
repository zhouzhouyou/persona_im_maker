package com.yuri.im.ui.resource.standard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
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

public val StandardSenderAvatar.StandardSadayoKawakamiBecky: ImageVector
    get() {
        if (_standardSadayoKawakamiBecky != null) {
            return _standardSadayoKawakamiBecky!!
        }
        _standardSadayoKawakamiBecky = Builder(name = "StandardSadayoKawakamiBecky", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 1024.0f, viewportHeight =
                1024.0f).apply {
            path(fill = SolidColor(Color(0xFF020102)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(350.3f, 109.3f)
                curveTo(367.9f, 88.0f, 396.8f, 79.6f, 422.5f, 89.9f)
                curveTo(427.9f, 92.1f, 435.2f, 98.0f, 441.8f, 101.0f)
                curveTo(471.6f, 77.4f, 503.8f, 88.3f, 530.1f, 110.5f)
                curveTo(540.8f, 108.5f, 553.7f, 105.1f, 563.9f, 110.8f)
                curveTo(577.0f, 118.2f, 587.2f, 131.0f, 601.4f, 136.9f)
                lineTo(601.9f, 137.1f)
                curveTo(617.2f, 117.7f, 625.4f, 109.3f, 650.1f, 102.2f)
                curveTo(673.4f, 95.4f, 691.6f, 94.2f, 715.0f, 100.7f)
                curveTo(722.9f, 102.8f, 731.1f, 104.2f, 738.9f, 108.9f)
                curveTo(788.9f, 139.6f, 830.2f, 190.1f, 862.3f, 238.6f)
                curveTo(867.5f, 246.5f, 875.8f, 269.6f, 878.3f, 278.4f)
                curveTo(884.7f, 301.0f, 884.0f, 323.9f, 884.6f, 346.9f)
                curveTo(885.6f, 385.8f, 882.5f, 426.8f, 865.8f, 462.6f)
                curveTo(854.8f, 486.0f, 843.3f, 511.6f, 832.1f, 535.0f)
                curveTo(823.9f, 552.1f, 800.2f, 569.2f, 791.5f, 587.0f)
                curveTo(784.0f, 602.5f, 777.0f, 619.5f, 770.1f, 635.3f)
                curveTo(766.7f, 642.9f, 769.2f, 678.4f, 772.0f, 686.8f)
                curveTo(774.8f, 695.0f, 782.1f, 708.5f, 785.0f, 718.9f)
                curveTo(795.5f, 722.5f, 807.1f, 725.3f, 817.8f, 728.1f)
                curveTo(824.2f, 726.0f, 836.9f, 719.2f, 841.9f, 720.3f)
                lineTo(842.2f, 721.9f)
                curveTo(832.5f, 742.2f, 831.8f, 742.2f, 811.8f, 750.9f)
                curveTo(807.0f, 749.6f, 799.1f, 746.4f, 795.1f, 749.8f)
                curveTo(795.5f, 750.7f, 795.9f, 751.8f, 796.7f, 752.4f)
                curveTo(812.6f, 763.4f, 821.7f, 762.9f, 838.7f, 762.2f)
                curveTo(841.9f, 762.3f, 847.9f, 761.7f, 849.9f, 764.2f)
                curveTo(843.8f, 771.9f, 828.3f, 778.1f, 818.8f, 783.0f)
                curveTo(807.9f, 779.7f, 783.7f, 776.5f, 776.2f, 773.0f)
                curveTo(741.8f, 756.8f, 712.6f, 728.5f, 688.3f, 699.7f)
                curveTo(682.3f, 692.6f, 676.5f, 681.1f, 671.9f, 673.4f)
                curveTo(663.5f, 659.7f, 663.5f, 648.1f, 659.4f, 633.8f)
                curveTo(639.6f, 666.3f, 643.0f, 694.6f, 645.5f, 731.2f)
                curveTo(645.7f, 733.8f, 646.5f, 734.0f, 648.4f, 735.1f)
                curveTo(654.5f, 734.8f, 658.8f, 730.6f, 663.1f, 734.7f)
                curveTo(668.2f, 739.7f, 669.3f, 756.4f, 669.6f, 763.4f)
                curveTo(670.0f, 772.2f, 670.2f, 784.3f, 668.5f, 792.9f)
                curveTo(667.9f, 796.2f, 662.5f, 802.4f, 663.8f, 805.7f)
                curveTo(680.5f, 813.1f, 697.9f, 820.1f, 714.8f, 827.6f)
                curveTo(730.8f, 834.7f, 756.1f, 847.3f, 771.6f, 852.4f)
                curveTo(790.9f, 840.5f, 810.2f, 828.7f, 829.5f, 817.0f)
                curveTo(839.7f, 810.9f, 851.6f, 804.3f, 861.4f, 798.0f)
                curveTo(869.7f, 792.6f, 879.2f, 778.1f, 890.0f, 773.2f)
                curveTo(896.3f, 770.3f, 901.9f, 769.9f, 908.5f, 771.5f)
                curveTo(928.3f, 776.5f, 963.8f, 809.8f, 976.4f, 824.5f)
                curveTo(977.0f, 830.7f, 979.6f, 848.0f, 978.6f, 853.3f)
                curveTo(975.8f, 866.3f, 974.4f, 879.0f, 972.7f, 892.1f)
                curveTo(971.2f, 903.8f, 963.7f, 918.5f, 964.8f, 930.5f)
                curveTo(965.0f, 933.3f, 986.3f, 946.4f, 989.8f, 949.5f)
                curveTo(997.1f, 977.3f, 999.2f, 997.6f, 987.9f, 1024.0f)
                lineTo(142.4f, 1024.0f)
                curveTo(142.9f, 1016.0f, 143.5f, 1010.2f, 144.7f, 1002.3f)
                curveTo(149.2f, 997.0f, 151.0f, 995.3f, 156.9f, 991.6f)
                curveTo(161.9f, 992.3f, 173.5f, 994.6f, 177.4f, 991.8f)
                curveTo(177.5f, 988.4f, 158.4f, 965.1f, 154.7f, 959.2f)
                curveTo(141.8f, 938.6f, 137.7f, 925.7f, 136.7f, 901.3f)
                curveTo(139.6f, 897.7f, 143.6f, 892.5f, 147.8f, 890.5f)
                curveTo(164.0f, 882.5f, 190.7f, 894.2f, 206.8f, 899.5f)
                curveTo(207.1f, 891.7f, 206.6f, 883.8f, 209.5f, 876.4f)
                curveTo(211.9f, 870.2f, 217.0f, 864.7f, 223.3f, 862.1f)
                curveTo(246.7f, 852.5f, 311.7f, 877.5f, 333.3f, 889.7f)
                curveTo(342.8f, 895.0f, 350.5f, 903.6f, 360.6f, 907.9f)
                lineTo(361.0f, 908.1f)
                curveTo(387.8f, 899.1f, 412.9f, 885.7f, 435.3f, 868.4f)
                curveTo(440.7f, 864.2f, 450.9f, 857.9f, 448.5f, 850.3f)
                curveTo(444.7f, 847.9f, 437.9f, 846.7f, 433.2f, 845.6f)
                curveTo(424.0f, 833.8f, 419.3f, 813.8f, 407.2f, 798.2f)
                curveTo(407.7f, 797.0f, 409.5f, 792.3f, 410.2f, 791.7f)
                curveTo(421.8f, 782.3f, 437.2f, 780.2f, 451.6f, 780.3f)
                curveTo(455.9f, 780.4f, 463.5f, 780.4f, 466.4f, 777.0f)
                curveTo(464.0f, 763.9f, 411.4f, 750.9f, 399.3f, 742.8f)
                curveTo(378.6f, 728.7f, 357.6f, 712.1f, 341.1f, 693.2f)
                curveTo(334.7f, 686.0f, 328.3f, 661.1f, 316.9f, 663.0f)
                curveTo(309.6f, 673.7f, 331.5f, 702.5f, 335.5f, 716.1f)
                curveTo(344.8f, 748.2f, 344.2f, 771.8f, 337.3f, 804.3f)
                curveTo(331.3f, 832.2f, 321.3f, 842.0f, 294.5f, 851.9f)
                curveTo(274.6f, 858.5f, 263.9f, 854.6f, 246.2f, 844.7f)
                curveTo(253.5f, 843.4f, 264.9f, 842.8f, 272.7f, 842.0f)
                lineTo(284.2f, 830.6f)
                curveTo(274.7f, 832.7f, 250.1f, 834.0f, 240.2f, 831.0f)
                curveTo(238.2f, 830.4f, 226.9f, 824.1f, 224.2f, 822.7f)
                curveTo(221.3f, 819.4f, 218.2f, 816.5f, 216.9f, 812.3f)
                curveTo(217.7f, 806.7f, 222.9f, 807.7f, 227.4f, 808.3f)
                curveTo(236.2f, 807.0f, 245.5f, 809.0f, 254.7f, 807.4f)
                curveTo(260.0f, 806.5f, 265.9f, 804.8f, 269.2f, 800.1f)
                curveTo(273.9f, 793.3f, 269.8f, 779.2f, 268.2f, 771.5f)
                curveTo(264.2f, 752.7f, 232.0f, 719.5f, 215.4f, 708.8f)
                curveTo(202.6f, 700.5f, 188.0f, 695.1f, 175.2f, 686.6f)
                curveTo(158.6f, 675.6f, 133.2f, 656.4f, 120.3f, 641.8f)
                curveTo(110.9f, 631.3f, 102.9f, 619.1f, 94.6f, 607.7f)
                curveTo(86.1f, 596.2f, 77.4f, 584.9f, 71.0f, 572.1f)
                curveTo(65.0f, 560.0f, 61.3f, 547.4f, 56.6f, 534.9f)
                curveTo(52.3f, 523.4f, 46.9f, 511.9f, 44.5f, 499.9f)
                curveTo(40.4f, 479.3f, 39.3f, 451.0f, 40.3f, 430.0f)
                curveTo(42.9f, 378.4f, 60.7f, 276.6f, 102.7f, 243.1f)
                curveTo(122.2f, 227.6f, 146.9f, 227.4f, 169.9f, 212.2f)
                curveTo(174.0f, 209.5f, 178.4f, 206.7f, 181.7f, 203.0f)
                curveTo(186.5f, 197.6f, 189.2f, 189.6f, 193.3f, 183.6f)
                curveTo(207.3f, 162.8f, 231.1f, 152.7f, 254.8f, 148.1f)
                curveTo(267.9f, 137.5f, 265.8f, 127.1f, 278.5f, 119.7f)
                curveTo(305.6f, 103.9f, 321.7f, 103.4f, 350.3f, 109.3f)
                close()
                moveTo(299.4f, 680.3f)
                curveTo(296.9f, 676.9f, 292.1f, 670.2f, 287.9f, 668.9f)
                curveTo(288.4f, 675.9f, 292.5f, 679.0f, 299.4f, 680.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(507.3f, 380.8f)
                curveTo(510.4f, 380.2f, 511.8f, 379.7f, 515.0f, 380.0f)
                lineTo(515.2f, 381.0f)
                curveTo(504.8f, 388.9f, 445.5f, 424.6f, 454.7f, 441.0f)
                lineTo(456.0f, 441.6f)
                curveTo(459.5f, 438.3f, 462.1f, 434.0f, 465.6f, 430.8f)
                curveTo(492.2f, 406.2f, 527.1f, 387.0f, 561.6f, 376.1f)
                curveTo(572.9f, 372.5f, 588.7f, 375.9f, 600.2f, 378.2f)
                curveTo(622.3f, 411.2f, 634.6f, 452.9f, 624.1f, 492.1f)
                curveTo(628.9f, 489.1f, 633.3f, 487.3f, 634.1f, 481.8f)
                curveTo(636.9f, 461.7f, 631.9f, 438.4f, 638.9f, 418.9f)
                curveTo(641.0f, 412.8f, 649.3f, 402.2f, 652.6f, 396.0f)
                curveTo(660.1f, 396.0f, 668.2f, 396.1f, 675.6f, 395.9f)
                curveTo(688.5f, 412.4f, 693.6f, 418.7f, 695.2f, 441.0f)
                curveTo(695.5f, 444.9f, 696.5f, 455.4f, 695.6f, 459.5f)
                curveTo(691.0f, 480.3f, 678.6f, 511.2f, 662.0f, 525.0f)
                curveTo(661.0f, 525.8f, 658.8f, 527.0f, 657.7f, 527.5f)
                curveTo(652.7f, 551.6f, 653.8f, 579.3f, 647.9f, 602.5f)
                curveTo(645.7f, 611.3f, 627.7f, 647.4f, 621.8f, 655.1f)
                curveTo(598.0f, 686.5f, 568.3f, 725.8f, 537.3f, 750.0f)
                curveTo(531.5f, 754.6f, 516.4f, 756.4f, 508.8f, 759.2f)
                curveTo(437.7f, 731.4f, 370.9f, 717.6f, 337.3f, 645.7f)
                curveTo(328.8f, 627.5f, 281.7f, 527.5f, 257.0f, 562.9f)
                curveTo(256.7f, 563.3f, 256.2f, 566.1f, 256.1f, 566.8f)
                lineTo(257.6f, 569.4f)
                lineTo(256.2f, 568.1f)
                lineTo(257.6f, 569.5f)
                curveTo(262.5f, 568.0f, 265.4f, 565.9f, 269.9f, 564.2f)
                curveTo(274.8f, 568.9f, 281.1f, 575.0f, 282.0f, 582.2f)
                curveTo(282.5f, 585.8f, 277.9f, 592.0f, 279.6f, 595.3f)
                curveTo(284.4f, 604.3f, 295.2f, 610.7f, 303.1f, 616.8f)
                curveTo(305.2f, 618.4f, 310.4f, 618.6f, 313.0f, 618.8f)
                curveTo(318.0f, 626.8f, 320.0f, 631.2f, 323.7f, 640.0f)
                curveTo(318.0f, 638.3f, 308.2f, 635.3f, 303.3f, 632.6f)
                curveTo(287.7f, 624.0f, 263.8f, 597.5f, 255.7f, 582.3f)
                curveTo(252.7f, 576.5f, 250.3f, 570.4f, 248.6f, 564.1f)
                curveTo(251.2f, 555.8f, 252.2f, 553.8f, 258.3f, 547.4f)
                curveTo(262.5f, 547.4f, 266.9f, 547.4f, 271.1f, 547.7f)
                lineTo(270.8f, 547.2f)
                curveTo(266.8f, 541.0f, 264.4f, 539.3f, 258.7f, 534.6f)
                lineTo(259.6f, 533.4f)
                curveTo(268.8f, 534.3f, 282.7f, 547.0f, 290.2f, 551.8f)
                curveTo(300.2f, 558.4f, 307.6f, 556.1f, 318.3f, 554.0f)
                curveTo(321.3f, 557.0f, 331.7f, 566.2f, 332.3f, 568.6f)
                curveTo(330.8f, 571.4f, 328.7f, 574.0f, 329.2f, 577.1f)
                curveTo(331.1f, 579.8f, 330.0f, 578.9f, 333.1f, 580.3f)
                curveTo(336.9f, 575.9f, 334.0f, 574.5f, 338.4f, 571.2f)
                curveTo(341.1f, 571.8f, 341.3f, 572.0f, 343.0f, 574.0f)
                curveTo(344.2f, 579.8f, 341.6f, 580.9f, 343.7f, 585.5f)
                curveTo(347.0f, 587.4f, 345.9f, 587.4f, 348.8f, 587.1f)
                curveTo(354.8f, 582.0f, 348.3f, 574.9f, 360.7f, 575.1f)
                curveTo(362.1f, 575.1f, 364.6f, 576.4f, 365.9f, 577.1f)
                curveTo(367.9f, 575.4f, 369.6f, 568.2f, 370.6f, 565.2f)
                curveTo(352.3f, 567.1f, 346.0f, 569.4f, 331.1f, 557.3f)
                lineTo(325.2f, 552.5f)
                curveTo(323.5f, 547.1f, 321.4f, 542.2f, 322.4f, 536.3f)
                curveTo(323.7f, 528.7f, 328.2f, 518.4f, 335.8f, 515.1f)
                lineTo(337.9f, 515.6f)
                curveTo(339.9f, 520.1f, 335.8f, 526.2f, 333.7f, 530.3f)
                curveTo(339.1f, 542.5f, 350.4f, 559.7f, 366.2f, 556.0f)
                curveTo(368.2f, 554.3f, 369.7f, 553.1f, 372.1f, 551.8f)
                curveTo(378.3f, 553.3f, 379.1f, 562.7f, 386.6f, 557.7f)
                curveTo(392.9f, 553.6f, 402.2f, 541.9f, 406.2f, 535.5f)
                curveTo(387.6f, 513.9f, 394.9f, 521.9f, 384.8f, 497.1f)
                curveTo(375.7f, 493.6f, 362.1f, 494.4f, 358.7f, 490.9f)
                lineTo(358.3f, 487.8f)
                lineTo(356.9f, 486.9f)
                curveTo(350.9f, 488.0f, 343.1f, 489.9f, 337.1f, 491.5f)
                curveTo(335.7f, 491.9f, 335.0f, 495.2f, 332.2f, 494.5f)
                curveTo(330.4f, 492.0f, 328.9f, 489.3f, 326.2f, 487.9f)
                curveTo(323.0f, 488.1f, 324.3f, 487.6f, 321.7f, 490.5f)
                curveTo(322.6f, 500.7f, 330.7f, 497.5f, 317.9f, 509.7f)
                curveTo(312.4f, 505.3f, 306.9f, 500.8f, 301.5f, 496.2f)
                curveTo(301.8f, 500.0f, 302.1f, 506.1f, 302.6f, 509.7f)
                curveTo(307.1f, 514.0f, 319.3f, 523.5f, 312.6f, 529.4f)
                curveTo(308.4f, 530.7f, 304.3f, 530.1f, 299.9f, 529.8f)
                curveTo(298.3f, 537.5f, 311.6f, 539.0f, 314.5f, 544.9f)
                lineTo(313.5f, 546.8f)
                curveTo(294.8f, 549.2f, 264.4f, 493.2f, 260.7f, 478.2f)
                curveTo(254.3f, 451.5f, 253.0f, 415.9f, 257.5f, 389.1f)
                curveTo(276.6f, 417.5f, 304.3f, 426.0f, 336.3f, 434.3f)
                curveTo(349.2f, 437.6f, 362.1f, 432.6f, 374.3f, 428.1f)
                curveTo(366.3f, 427.9f, 331.9f, 425.8f, 330.8f, 415.0f)
                curveTo(337.3f, 404.4f, 366.0f, 410.7f, 374.3f, 417.4f)
                curveTo(377.7f, 420.2f, 388.0f, 427.5f, 392.4f, 427.3f)
                curveTo(398.2f, 425.7f, 411.9f, 420.3f, 415.8f, 416.1f)
                lineTo(416.6f, 415.2f)
                curveTo(424.3f, 411.8f, 434.7f, 412.9f, 442.8f, 410.8f)
                curveTo(450.1f, 408.9f, 459.9f, 402.8f, 467.1f, 400.7f)
                lineTo(471.5f, 397.3f)
                lineTo(471.4f, 396.1f)
                curveTo(452.8f, 389.7f, 446.9f, 385.4f, 430.9f, 373.3f)
                curveTo(447.6f, 376.7f, 463.7f, 386.3f, 479.6f, 390.8f)
                curveTo(481.3f, 391.2f, 502.1f, 382.0f, 506.9f, 380.9f)
                lineTo(507.3f, 380.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEEEEEE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(430.9f, 373.3f)
                curveTo(447.6f, 376.7f, 463.7f, 386.3f, 479.6f, 390.8f)
                curveTo(481.3f, 391.2f, 502.1f, 382.0f, 506.9f, 380.9f)
                lineTo(507.3f, 380.8f)
                curveTo(503.1f, 385.6f, 484.3f, 391.2f, 478.4f, 395.6f)
                curveTo(475.1f, 398.0f, 471.2f, 400.4f, 467.1f, 400.7f)
                lineTo(471.5f, 397.3f)
                lineTo(471.4f, 396.1f)
                curveTo(452.8f, 389.7f, 446.9f, 385.4f, 430.9f, 373.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF020102)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(564.3f, 410.6f)
                curveTo(566.1f, 411.6f, 566.1f, 411.7f, 567.3f, 413.4f)
                curveTo(567.5f, 417.8f, 564.2f, 425.1f, 562.6f, 429.7f)
                curveTo(570.3f, 429.8f, 584.7f, 434.0f, 590.4f, 429.7f)
                curveTo(590.9f, 429.4f, 592.2f, 426.1f, 595.2f, 424.0f)
                lineTo(596.5f, 424.9f)
                curveTo(597.4f, 431.3f, 592.8f, 437.8f, 593.6f, 444.5f)
                curveTo(597.7f, 448.8f, 608.0f, 437.5f, 611.4f, 434.4f)
                curveTo(610.3f, 438.3f, 608.8f, 443.5f, 606.9f, 447.0f)
                curveTo(603.9f, 452.4f, 607.6f, 450.2f, 607.6f, 456.4f)
                curveTo(605.6f, 459.1f, 597.1f, 471.6f, 595.1f, 472.6f)
                curveTo(593.3f, 470.0f, 594.6f, 464.7f, 595.1f, 461.1f)
                curveTo(577.5f, 466.0f, 589.7f, 478.5f, 578.4f, 488.6f)
                curveTo(570.1f, 496.0f, 557.2f, 496.4f, 546.9f, 496.1f)
                lineTo(539.7f, 489.4f)
                curveTo(525.1f, 471.0f, 534.5f, 462.7f, 530.5f, 455.9f)
                curveTo(524.5f, 463.5f, 522.2f, 474.0f, 521.8f, 483.5f)
                curveTo(521.5f, 490.0f, 524.5f, 499.3f, 517.4f, 502.1f)
                curveTo(507.1f, 497.3f, 511.2f, 483.7f, 513.0f, 475.1f)
                curveTo(510.1f, 477.2f, 507.6f, 479.5f, 504.0f, 479.5f)
                lineTo(502.9f, 478.1f)
                curveTo(502.9f, 474.4f, 506.1f, 470.4f, 508.1f, 467.1f)
                curveTo(508.0f, 460.9f, 508.1f, 457.6f, 508.6f, 451.5f)
                curveTo(523.7f, 435.8f, 530.1f, 434.0f, 550.3f, 428.9f)
                curveTo(556.1f, 423.6f, 558.7f, 416.9f, 564.3f, 410.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF020102)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(535.4f, 647.0f)
                curveTo(536.1f, 647.2f, 537.5f, 648.1f, 538.2f, 648.5f)
                curveTo(540.1f, 656.6f, 519.6f, 666.7f, 513.7f, 670.0f)
                curveTo(506.7f, 670.1f, 502.9f, 670.3f, 495.9f, 671.2f)
                curveTo(490.3f, 675.9f, 482.3f, 684.3f, 486.1f, 692.4f)
                curveTo(490.8f, 694.9f, 501.0f, 688.8f, 509.7f, 686.5f)
                curveTo(504.6f, 696.3f, 504.4f, 697.2f, 505.1f, 708.0f)
                curveTo(501.2f, 710.1f, 497.7f, 711.5f, 493.7f, 713.2f)
                curveTo(486.9f, 710.6f, 483.4f, 708.2f, 477.6f, 704.0f)
                lineTo(472.0f, 701.0f)
                curveTo(473.2f, 696.2f, 474.2f, 690.9f, 475.2f, 686.1f)
                curveTo(468.5f, 686.1f, 447.3f, 688.4f, 443.5f, 683.7f)
                curveTo(444.7f, 680.1f, 450.1f, 677.7f, 453.0f, 674.9f)
                curveTo(456.9f, 671.3f, 459.1f, 664.0f, 463.6f, 662.1f)
                curveTo(469.1f, 661.0f, 473.0f, 663.5f, 477.6f, 666.2f)
                curveTo(484.8f, 662.8f, 498.3f, 656.3f, 505.8f, 654.4f)
                curveTo(516.3f, 651.8f, 524.6f, 650.3f, 535.4f, 647.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF020102)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(659.8f, 417.8f)
                curveTo(666.0f, 420.4f, 675.3f, 427.4f, 675.4f, 434.7f)
                lineTo(673.9f, 435.6f)
                curveTo(670.0f, 434.9f, 666.3f, 431.0f, 663.2f, 428.2f)
                lineTo(663.1f, 428.7f)
                curveTo(661.0f, 434.8f, 661.0f, 435.5f, 657.1f, 440.8f)
                curveTo(670.3f, 459.3f, 671.4f, 482.7f, 653.3f, 498.3f)
                curveTo(647.8f, 503.3f, 639.5f, 512.7f, 634.2f, 518.4f)
                curveTo(639.9f, 500.7f, 643.3f, 478.8f, 638.7f, 460.6f)
                curveTo(645.9f, 443.6f, 649.8f, 433.5f, 659.8f, 417.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF020102)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.3f, 450.2f)
                curveTo(344.0f, 463.0f, 360.7f, 438.1f, 392.5f, 475.8f)
                curveTo(376.7f, 467.2f, 370.8f, 464.5f, 353.2f, 462.3f)
                curveTo(323.3f, 461.6f, 316.2f, 464.4f, 288.6f, 476.5f)
                curveTo(283.7f, 467.8f, 313.9f, 453.3f, 320.3f, 450.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF020102)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(573.8f, 502.6f)
                curveTo(581.5f, 495.6f, 586.2f, 487.9f, 594.2f, 481.9f)
                curveTo(597.4f, 481.9f, 596.5f, 482.0f, 599.5f, 484.8f)
                curveTo(602.6f, 486.5f, 604.3f, 487.1f, 606.2f, 490.1f)
                lineTo(605.1f, 491.1f)
                curveTo(601.8f, 490.8f, 599.9f, 490.1f, 596.7f, 489.0f)
                curveTo(589.5f, 497.0f, 599.0f, 497.7f, 596.4f, 505.2f)
                curveTo(592.8f, 506.4f, 594.4f, 502.7f, 588.2f, 501.0f)
                curveTo(585.4f, 501.5f, 582.6f, 503.6f, 580.2f, 505.2f)
                curveTo(573.4f, 509.8f, 576.2f, 509.6f, 574.9f, 516.5f)
                curveTo(570.9f, 517.2f, 571.5f, 512.4f, 568.7f, 512.0f)
                curveTo(559.3f, 510.6f, 548.4f, 516.9f, 539.8f, 510.9f)
                curveTo(536.7f, 508.7f, 533.5f, 506.9f, 534.3f, 502.9f)
                curveTo(538.8f, 500.7f, 553.3f, 505.0f, 559.6f, 504.5f)
                curveTo(564.8f, 504.1f, 568.6f, 503.5f, 573.8f, 502.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF020102)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(439.0f, 578.3f)
                curveTo(451.5f, 581.4f, 451.7f, 597.5f, 452.2f, 607.8f)
                curveTo(458.5f, 614.6f, 470.2f, 622.7f, 470.4f, 631.2f)
                curveTo(458.4f, 632.8f, 451.4f, 623.5f, 443.0f, 615.9f)
                curveTo(442.4f, 605.5f, 440.8f, 588.3f, 439.0f, 578.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF020102)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(411.5f, 504.7f)
                curveTo(423.5f, 508.3f, 433.6f, 523.5f, 438.8f, 534.3f)
                curveTo(437.7f, 540.7f, 437.3f, 545.2f, 436.8f, 551.7f)
                lineTo(435.9f, 552.4f)
                lineTo(434.1f, 551.6f)
                curveTo(426.5f, 542.3f, 412.6f, 515.2f, 411.5f, 504.7f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFEEEEEE), 1.0f to Color(0xFFEEEEEE), start =
                    Offset(523.5f,420.3f), end = Offset(529.0f,429.4f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(536.6f, 416.4f)
                curveTo(543.9f, 416.7f, 551.2f, 417.1f, 558.4f, 417.8f)
                curveTo(537.4f, 420.2f, 530.8f, 421.0f, 513.5f, 433.7f)
                curveTo(510.3f, 436.1f, 508.0f, 438.2f, 504.4f, 437.7f)
                lineTo(503.8f, 436.0f)
                curveTo(507.9f, 424.3f, 525.2f, 417.6f, 536.6f, 416.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.0f, 170.3f)
                curveTo(234.8f, 170.3f, 240.1f, 169.8f, 244.8f, 173.3f)
                curveTo(247.5f, 178.8f, 244.4f, 182.0f, 244.2f, 187.3f)
                curveTo(244.0f, 192.8f, 253.9f, 196.1f, 260.4f, 202.2f)
                curveTo(263.2f, 216.3f, 264.6f, 217.4f, 274.8f, 227.3f)
                curveTo(275.1f, 230.8f, 276.2f, 235.9f, 276.8f, 239.5f)
                curveTo(283.0f, 246.5f, 294.6f, 252.1f, 287.8f, 263.0f)
                curveTo(280.3f, 275.0f, 264.0f, 258.9f, 259.0f, 260.0f)
                curveTo(261.2f, 266.6f, 271.6f, 273.8f, 277.4f, 278.4f)
                curveTo(283.4f, 271.4f, 290.5f, 265.0f, 296.2f, 257.8f)
                curveTo(298.3f, 255.2f, 297.7f, 251.1f, 300.8f, 246.8f)
                curveTo(303.6f, 245.1f, 311.5f, 245.0f, 315.8f, 244.4f)
                curveTo(317.1f, 242.8f, 317.0f, 242.8f, 315.1f, 239.4f)
                curveTo(312.1f, 234.0f, 313.7f, 226.9f, 314.4f, 220.4f)
                lineTo(326.1f, 218.9f)
                curveTo(333.1f, 224.0f, 333.1f, 225.9f, 338.8f, 231.5f)
                curveTo(341.5f, 228.6f, 347.6f, 220.6f, 350.7f, 219.4f)
                curveTo(357.5f, 216.7f, 360.9f, 226.3f, 369.8f, 221.6f)
                curveTo(366.3f, 214.4f, 338.1f, 211.1f, 369.6f, 192.7f)
                curveTo(386.3f, 204.2f, 381.2f, 208.7f, 371.0f, 223.4f)
                curveTo(377.6f, 219.5f, 380.0f, 219.0f, 387.4f, 217.0f)
                curveTo(392.3f, 210.5f, 380.5f, 204.3f, 398.8f, 192.4f)
                curveTo(403.3f, 196.3f, 406.4f, 199.3f, 410.5f, 203.4f)
                curveTo(411.3f, 208.5f, 412.2f, 213.5f, 413.1f, 218.5f)
                curveTo(416.0f, 203.1f, 416.5f, 201.9f, 428.6f, 191.7f)
                curveTo(440.1f, 201.3f, 439.4f, 203.5f, 444.4f, 217.3f)
                curveTo(448.6f, 204.1f, 444.5f, 199.9f, 459.3f, 194.1f)
                curveTo(462.4f, 195.6f, 465.9f, 198.0f, 468.8f, 199.9f)
                curveTo(469.8f, 204.3f, 471.3f, 213.5f, 476.2f, 215.0f)
                curveTo(477.9f, 203.0f, 476.6f, 191.5f, 494.6f, 197.8f)
                curveTo(497.9f, 199.0f, 499.9f, 200.5f, 501.4f, 203.9f)
                curveTo(502.2f, 211.7f, 496.1f, 214.0f, 493.2f, 220.9f)
                lineTo(494.6f, 221.6f)
                curveTo(495.8f, 221.0f, 497.1f, 220.5f, 498.4f, 219.9f)
                curveTo(512.8f, 213.7f, 510.5f, 227.8f, 520.3f, 231.8f)
                curveTo(524.3f, 226.5f, 535.0f, 209.1f, 541.4f, 223.6f)
                curveTo(540.4f, 227.2f, 536.5f, 228.7f, 533.3f, 232.8f)
                curveTo(533.5f, 236.3f, 557.1f, 252.7f, 562.9f, 258.4f)
                curveTo(567.6f, 263.2f, 569.7f, 266.3f, 573.1f, 272.1f)
                curveTo(541.3f, 247.7f, 505.6f, 237.5f, 467.1f, 229.2f)
                curveTo(441.9f, 223.8f, 429.1f, 221.7f, 403.2f, 226.6f)
                curveTo(392.2f, 228.5f, 378.6f, 228.8f, 368.1f, 232.3f)
                curveTo(338.1f, 242.3f, 315.3f, 254.5f, 291.8f, 275.7f)
                curveTo(268.9f, 296.4f, 250.9f, 320.1f, 238.4f, 348.5f)
                curveTo(228.8f, 370.1f, 239.4f, 391.7f, 220.1f, 409.9f)
                curveTo(220.8f, 400.6f, 220.3f, 393.1f, 222.7f, 384.0f)
                curveTo(209.3f, 384.1f, 196.0f, 382.6f, 182.9f, 379.5f)
                curveTo(163.9f, 359.7f, 154.6f, 332.8f, 159.7f, 304.9f)
                curveTo(161.6f, 294.4f, 169.0f, 291.0f, 177.5f, 286.0f)
                lineTo(168.5f, 281.2f)
                curveTo(165.3f, 262.6f, 165.3f, 256.6f, 172.0f, 238.9f)
                curveTo(175.6f, 236.9f, 183.3f, 233.6f, 187.4f, 233.8f)
                curveTo(195.8f, 234.1f, 214.2f, 235.8f, 210.1f, 221.1f)
                curveTo(208.2f, 218.6f, 203.4f, 218.1f, 200.2f, 217.4f)
                curveTo(203.5f, 192.1f, 210.3f, 187.3f, 229.0f, 170.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(385.4f, 116.1f)
                curveTo(394.1f, 114.3f, 404.4f, 120.1f, 412.2f, 123.7f)
                curveTo(403.1f, 129.0f, 399.9f, 131.9f, 393.3f, 140.0f)
                curveTo(411.7f, 150.7f, 417.0f, 155.2f, 399.8f, 170.4f)
                curveTo(395.3f, 171.1f, 396.4f, 168.0f, 391.4f, 167.3f)
                curveTo(385.7f, 177.3f, 406.7f, 176.9f, 384.0f, 195.8f)
                curveTo(364.9f, 182.6f, 368.5f, 176.6f, 386.7f, 165.0f)
                lineTo(366.0f, 169.2f)
                curveTo(364.8f, 168.3f, 363.7f, 167.4f, 362.5f, 166.5f)
                curveTo(359.7f, 164.4f, 357.1f, 163.2f, 353.7f, 163.7f)
                lineTo(353.2f, 165.4f)
                curveTo(354.8f, 168.7f, 360.2f, 171.9f, 363.4f, 174.1f)
                curveTo(365.7f, 178.1f, 363.7f, 188.7f, 360.2f, 191.7f)
                curveTo(353.6f, 197.2f, 344.9f, 187.8f, 339.0f, 193.6f)
                curveTo(341.0f, 196.6f, 345.4f, 195.3f, 347.8f, 198.5f)
                curveTo(358.4f, 212.5f, 338.7f, 226.9f, 329.3f, 213.3f)
                curveTo(325.6f, 208.0f, 328.1f, 201.2f, 329.6f, 195.2f)
                curveTo(325.7f, 194.3f, 320.1f, 192.4f, 316.7f, 193.3f)
                curveTo(315.9f, 197.0f, 316.6f, 196.8f, 318.4f, 200.9f)
                curveTo(322.5f, 214.8f, 317.0f, 217.1f, 305.6f, 223.1f)
                lineTo(303.7f, 238.7f)
                curveTo(300.5f, 240.5f, 296.6f, 243.9f, 293.6f, 246.2f)
                curveTo(272.2f, 232.1f, 278.4f, 226.9f, 297.7f, 218.4f)
                curveTo(296.8f, 215.7f, 292.4f, 211.6f, 290.2f, 209.2f)
                curveTo(285.3f, 216.4f, 283.4f, 217.2f, 275.5f, 220.3f)
                curveTo(272.2f, 217.5f, 269.2f, 214.6f, 267.0f, 210.7f)
                curveTo(261.2f, 200.4f, 272.2f, 197.8f, 279.6f, 194.1f)
                curveTo(282.6f, 188.9f, 277.5f, 175.9f, 277.6f, 169.4f)
                curveTo(277.9f, 153.8f, 289.1f, 144.7f, 301.8f, 138.1f)
                curveTo(317.3f, 130.0f, 334.9f, 131.7f, 351.8f, 131.9f)
                lineTo(351.8f, 132.9f)
                curveTo(351.6f, 139.2f, 350.8f, 149.7f, 355.0f, 154.2f)
                curveTo(358.3f, 155.6f, 358.4f, 156.3f, 361.3f, 155.5f)
                curveTo(363.8f, 144.9f, 347.1f, 142.4f, 368.9f, 120.4f)
                curveTo(374.1f, 119.4f, 380.3f, 117.5f, 385.4f, 116.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(139.4f, 469.8f)
                curveTo(143.2f, 470.0f, 153.5f, 473.6f, 155.2f, 476.1f)
                curveTo(161.7f, 485.7f, 143.6f, 493.2f, 143.3f, 502.0f)
                curveTo(145.3f, 502.7f, 147.9f, 500.3f, 149.9f, 499.1f)
                curveTo(153.8f, 496.9f, 157.8f, 495.7f, 162.0f, 494.5f)
                curveTo(166.8f, 500.6f, 168.2f, 502.9f, 171.7f, 509.8f)
                curveTo(164.4f, 518.7f, 164.3f, 520.8f, 152.3f, 519.0f)
                curveTo(164.1f, 544.4f, 174.4f, 567.0f, 191.8f, 589.2f)
                curveTo(194.6f, 592.8f, 201.9f, 606.0f, 206.6f, 604.7f)
                curveTo(206.8f, 604.2f, 207.0f, 603.6f, 207.3f, 603.1f)
                curveTo(210.3f, 597.0f, 213.8f, 596.8f, 220.3f, 594.4f)
                curveTo(227.3f, 598.6f, 228.8f, 601.1f, 232.7f, 607.9f)
                curveTo(232.3f, 608.7f, 231.9f, 609.5f, 231.5f, 610.3f)
                curveTo(226.4f, 620.1f, 225.5f, 618.2f, 215.7f, 621.2f)
                curveTo(212.6f, 625.5f, 214.2f, 629.9f, 215.1f, 635.5f)
                curveTo(211.4f, 641.1f, 210.2f, 642.3f, 205.4f, 646.9f)
                curveTo(196.3f, 640.7f, 186.7f, 634.9f, 178.7f, 627.6f)
                curveTo(167.2f, 617.2f, 156.5f, 609.3f, 147.8f, 596.5f)
                curveTo(139.6f, 584.5f, 118.3f, 534.1f, 121.1f, 520.6f)
                curveTo(123.1f, 518.3f, 122.2f, 518.7f, 124.6f, 518.4f)
                curveTo(126.2f, 520.1f, 128.0f, 535.3f, 129.6f, 539.3f)
                curveTo(139.7f, 563.0f, 148.6f, 581.5f, 171.9f, 593.7f)
                curveTo(167.4f, 583.6f, 158.9f, 572.3f, 153.7f, 561.1f)
                curveTo(144.4f, 540.9f, 140.5f, 512.8f, 137.7f, 490.6f)
                curveTo(137.3f, 487.6f, 139.0f, 473.3f, 139.4f, 469.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF020102)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(179.9f, 619.9f)
                curveTo(184.2f, 619.9f, 193.0f, 618.9f, 196.0f, 620.9f)
                curveTo(196.7f, 624.3f, 196.1f, 623.8f, 194.1f, 627.7f)
                curveTo(192.9f, 628.7f, 192.4f, 628.9f, 190.9f, 629.7f)
                curveTo(187.8f, 628.9f, 182.6f, 622.7f, 179.9f, 619.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(130.9f, 268.0f)
                curveTo(134.4f, 272.5f, 119.9f, 285.3f, 116.6f, 291.4f)
                curveTo(108.8f, 306.3f, 98.3f, 338.3f, 99.6f, 354.4f)
                curveTo(103.4f, 353.8f, 110.9f, 352.1f, 113.8f, 354.3f)
                curveTo(107.4f, 370.4f, 99.7f, 366.0f, 94.4f, 371.3f)
                curveTo(95.0f, 380.1f, 96.6f, 383.0f, 92.6f, 391.2f)
                curveTo(91.8f, 392.7f, 98.6f, 394.8f, 100.1f, 395.3f)
                curveTo(104.9f, 396.9f, 107.5f, 399.4f, 111.2f, 402.8f)
                curveTo(110.6f, 406.1f, 109.3f, 410.2f, 108.5f, 413.5f)
                curveTo(91.4f, 429.2f, 98.9f, 413.5f, 89.2f, 417.3f)
                curveTo(89.1f, 420.6f, 95.9f, 427.3f, 96.0f, 430.0f)
                curveTo(96.4f, 438.2f, 86.8f, 445.2f, 81.6f, 452.5f)
                curveTo(88.1f, 449.3f, 92.7f, 446.6f, 98.8f, 442.7f)
                curveTo(108.8f, 450.3f, 119.3f, 460.9f, 101.2f, 469.5f)
                curveTo(95.9f, 472.0f, 91.4f, 464.7f, 86.7f, 462.1f)
                curveTo(85.2f, 464.9f, 85.9f, 468.0f, 86.1f, 471.2f)
                curveTo(85.2f, 498.1f, 95.6f, 508.2f, 100.9f, 534.3f)
                curveTo(96.9f, 529.2f, 82.9f, 506.1f, 81.4f, 501.1f)
                curveTo(62.8f, 440.4f, 60.0f, 298.8f, 130.9f, 268.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(369.4f, 284.6f)
                curveTo(372.7f, 286.4f, 391.9f, 334.4f, 401.9f, 301.5f)
                lineTo(397.1f, 286.8f)
                curveTo(419.4f, 292.2f, 432.0f, 302.8f, 449.4f, 317.1f)
                curveTo(453.2f, 315.5f, 456.5f, 314.5f, 460.5f, 313.3f)
                lineTo(461.2f, 298.2f)
                curveTo(467.3f, 303.3f, 479.0f, 312.2f, 482.8f, 318.3f)
                curveTo(498.4f, 323.5f, 505.0f, 322.7f, 522.2f, 330.3f)
                curveTo(515.5f, 334.9f, 511.3f, 341.2f, 504.0f, 346.6f)
                curveTo(502.5f, 345.7f, 498.7f, 343.1f, 497.6f, 341.9f)
                curveTo(494.8f, 338.8f, 492.9f, 332.8f, 488.9f, 331.2f)
                curveTo(485.7f, 333.3f, 486.3f, 334.1f, 484.6f, 338.4f)
                curveTo(480.0f, 341.8f, 477.4f, 343.2f, 472.4f, 345.9f)
                curveTo(469.6f, 343.8f, 466.6f, 341.2f, 463.8f, 339.0f)
                curveTo(462.4f, 336.1f, 461.8f, 333.9f, 458.6f, 333.2f)
                curveTo(455.3f, 334.8f, 451.7f, 341.4f, 445.1f, 346.2f)
                curveTo(441.2f, 344.4f, 436.7f, 341.3f, 433.1f, 339.0f)
                curveTo(431.9f, 327.7f, 428.1f, 309.9f, 412.5f, 316.2f)
                lineTo(412.0f, 317.4f)
                curveTo(426.0f, 325.4f, 428.5f, 327.7f, 421.1f, 342.4f)
                curveTo(432.4f, 344.5f, 435.3f, 346.3f, 442.8f, 354.2f)
                curveTo(440.8f, 357.9f, 438.2f, 363.5f, 435.0f, 366.0f)
                curveTo(428.4f, 367.9f, 413.7f, 362.9f, 416.8f, 354.1f)
                curveTo(417.4f, 352.3f, 421.3f, 346.8f, 421.0f, 345.6f)
                curveTo(418.0f, 344.4f, 414.9f, 347.5f, 413.5f, 347.1f)
                curveTo(411.7f, 346.7f, 410.1f, 344.9f, 406.9f, 345.3f)
                curveTo(405.9f, 349.3f, 410.7f, 353.4f, 410.1f, 357.9f)
                lineTo(408.6f, 358.9f)
                curveTo(404.5f, 357.2f, 402.4f, 353.0f, 399.2f, 350.9f)
                curveTo(371.0f, 332.6f, 367.2f, 318.8f, 369.4f, 284.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(473.5f, 110.2f)
                curveTo(474.4f, 116.9f, 480.8f, 128.3f, 484.0f, 134.8f)
                curveTo(483.0f, 136.6f, 478.8f, 143.5f, 477.6f, 147.9f)
                curveTo(473.6f, 161.8f, 458.8f, 181.7f, 446.9f, 161.3f)
                curveTo(445.2f, 158.3f, 452.9f, 144.7f, 452.1f, 140.8f)
                curveTo(448.1f, 140.9f, 447.9f, 144.6f, 444.5f, 144.0f)
                curveTo(437.5f, 142.5f, 436.1f, 139.1f, 428.2f, 139.7f)
                lineTo(427.0f, 139.1f)
                curveTo(425.2f, 131.3f, 440.7f, 117.3f, 446.3f, 110.7f)
                curveTo(455.8f, 110.0f, 464.0f, 110.1f, 473.5f, 110.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(345.3f, 293.8f)
                curveTo(348.4f, 296.2f, 349.7f, 312.6f, 351.1f, 317.4f)
                curveTo(356.9f, 336.9f, 365.2f, 341.8f, 380.6f, 351.2f)
                curveTo(378.9f, 363.2f, 379.8f, 366.3f, 367.8f, 371.3f)
                curveTo(357.5f, 365.6f, 356.7f, 365.6f, 357.0f, 353.8f)
                curveTo(357.2f, 351.0f, 357.4f, 350.6f, 356.1f, 348.3f)
                curveTo(352.6f, 345.3f, 346.3f, 344.5f, 341.6f, 343.4f)
                curveTo(346.6f, 348.0f, 353.7f, 353.4f, 351.7f, 361.0f)
                lineTo(349.7f, 361.1f)
                curveTo(340.3f, 355.8f, 335.0f, 338.5f, 331.5f, 328.6f)
                curveTo(330.6f, 326.0f, 338.5f, 323.5f, 339.4f, 321.5f)
                curveTo(343.4f, 312.5f, 342.0f, 303.1f, 345.3f, 293.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(476.4f, 280.5f)
                curveTo(492.0f, 283.4f, 512.2f, 289.6f, 525.8f, 298.1f)
                curveTo(528.9f, 300.0f, 531.6f, 303.8f, 536.3f, 306.9f)
                curveTo(539.5f, 303.4f, 535.9f, 299.3f, 541.2f, 296.6f)
                curveTo(545.5f, 296.8f, 551.7f, 296.7f, 555.6f, 298.1f)
                curveTo(562.6f, 300.6f, 562.2f, 307.5f, 559.2f, 312.8f)
                curveTo(555.7f, 318.9f, 552.7f, 319.5f, 546.3f, 321.3f)
                curveTo(541.4f, 317.0f, 537.3f, 309.4f, 531.3f, 310.7f)
                curveTo(528.0f, 313.4f, 526.4f, 316.5f, 524.2f, 320.1f)
                lineTo(522.9f, 321.3f)
                curveTo(503.1f, 313.0f, 499.6f, 315.9f, 485.3f, 298.1f)
                curveTo(491.4f, 300.0f, 500.6f, 305.2f, 506.7f, 303.6f)
                curveTo(505.7f, 299.4f, 484.0f, 287.7f, 476.4f, 280.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.9f, 620.0f)
                curveTo(239.8f, 618.8f, 248.3f, 625.4f, 245.9f, 633.9f)
                curveTo(244.3f, 639.8f, 241.2f, 641.0f, 236.6f, 644.2f)
                curveTo(234.3f, 645.6f, 233.9f, 645.7f, 231.2f, 645.5f)
                curveTo(223.7f, 641.9f, 221.8f, 635.2f, 223.7f, 627.2f)
                curveTo(224.7f, 623.0f, 228.2f, 621.8f, 231.9f, 620.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEEEEEE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(499.6f, 167.8f)
                curveTo(517.1f, 169.7f, 521.3f, 182.3f, 507.3f, 193.6f)
                curveTo(490.0f, 194.6f, 488.8f, 178.7f, 499.6f, 167.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(441.6f, 167.7f)
                curveTo(444.6f, 167.8f, 451.4f, 171.2f, 452.9f, 173.6f)
                curveTo(458.7f, 183.1f, 452.8f, 189.3f, 445.5f, 194.7f)
                curveTo(443.2f, 195.0f, 436.1f, 191.3f, 434.9f, 189.3f)
                curveTo(428.9f, 179.6f, 434.4f, 173.0f, 441.6f, 167.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(473.3f, 167.8f)
                curveTo(479.9f, 169.8f, 488.2f, 176.0f, 485.4f, 183.9f)
                curveTo(483.4f, 189.7f, 478.9f, 191.5f, 473.9f, 194.2f)
                curveTo(461.6f, 194.0f, 456.3f, 176.6f, 473.3f, 167.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(518.0f, 192.8f)
                curveTo(527.2f, 196.2f, 533.7f, 204.7f, 527.5f, 214.4f)
                curveTo(525.0f, 218.2f, 522.4f, 218.0f, 518.2f, 218.8f)
                curveTo(513.0f, 219.5f, 505.6f, 215.3f, 506.6f, 209.0f)
                curveTo(508.0f, 200.6f, 512.0f, 197.9f, 518.0f, 192.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(517.0f, 143.8f)
                curveTo(530.6f, 145.2f, 536.2f, 163.5f, 519.4f, 169.9f)
                curveTo(512.7f, 169.6f, 505.7f, 165.1f, 506.9f, 157.5f)
                curveTo(508.1f, 150.2f, 511.5f, 148.0f, 517.0f, 143.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(548.7f, 142.7f)
                curveTo(558.1f, 145.4f, 561.1f, 158.7f, 556.7f, 167.0f)
                curveTo(552.9f, 169.8f, 553.3f, 169.0f, 548.0f, 169.7f)
                curveTo(531.0f, 166.0f, 535.0f, 150.3f, 548.7f, 142.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEEEEEE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(260.5f, 166.6f)
                curveTo(263.3f, 168.2f, 272.4f, 177.8f, 273.5f, 181.0f)
                curveTo(276.5f, 189.7f, 270.3f, 191.8f, 263.3f, 194.4f)
                curveTo(243.3f, 187.1f, 249.3f, 177.9f, 260.5f, 166.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(531.8f, 167.8f)
                curveTo(546.0f, 170.8f, 544.4f, 176.2f, 543.8f, 188.6f)
                curveTo(540.8f, 190.9f, 536.7f, 193.1f, 533.4f, 195.0f)
                curveTo(531.4f, 194.8f, 526.2f, 190.6f, 525.0f, 188.9f)
                curveTo(518.9f, 180.1f, 525.7f, 172.6f, 531.8f, 167.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(413.8f, 168.0f)
                curveTo(416.9f, 168.2f, 420.8f, 170.1f, 422.4f, 172.9f)
                curveTo(427.9f, 182.6f, 422.7f, 189.3f, 414.9f, 194.8f)
                curveTo(404.7f, 192.2f, 400.6f, 185.7f, 404.4f, 175.4f)
                curveTo(406.2f, 170.5f, 409.1f, 169.8f, 413.8f, 168.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(185.6f, 545.0f)
                lineTo(190.0f, 545.4f)
                curveTo(194.2f, 548.0f, 197.4f, 552.0f, 198.9f, 556.8f)
                curveTo(200.6f, 562.1f, 199.0f, 567.9f, 193.1f, 569.4f)
                curveTo(183.1f, 569.9f, 175.1f, 567.1f, 177.4f, 554.1f)
                curveTo(178.3f, 549.2f, 181.2f, 547.3f, 185.6f, 545.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.0f, 569.9f)
                curveTo(213.5f, 570.6f, 223.2f, 588.0f, 204.8f, 594.2f)
                curveTo(189.1f, 593.2f, 186.4f, 578.2f, 201.0f, 569.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.4f, 519.8f)
                curveTo(178.9f, 520.5f, 181.2f, 527.5f, 186.1f, 535.9f)
                curveTo(182.8f, 539.0f, 180.3f, 540.8f, 176.6f, 543.5f)
                curveTo(165.5f, 547.0f, 163.5f, 539.3f, 161.4f, 530.9f)
                curveTo(163.4f, 526.9f, 165.0f, 522.6f, 168.4f, 519.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(571.1f, 299.9f)
                curveTo(581.8f, 301.3f, 580.9f, 302.3f, 595.1f, 303.0f)
                curveTo(592.2f, 309.3f, 591.1f, 313.0f, 585.4f, 316.7f)
                lineTo(584.9f, 317.3f)
                curveTo(577.5f, 324.9f, 565.3f, 315.8f, 565.4f, 305.6f)
                curveTo(567.4f, 301.6f, 567.0f, 302.7f, 571.1f, 299.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEEEEEE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(427.0f, 139.1f)
                lineTo(428.2f, 139.7f)
                curveTo(431.3f, 145.5f, 440.2f, 149.9f, 441.8f, 157.5f)
                curveTo(440.6f, 163.1f, 432.3f, 171.0f, 426.8f, 168.8f)
                curveTo(417.5f, 165.0f, 424.9f, 145.8f, 427.0f, 139.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEEEEEE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(487.7f, 142.4f)
                curveTo(503.8f, 150.9f, 505.5f, 157.3f, 491.5f, 168.9f)
                lineTo(488.0f, 169.5f)
                curveTo(484.2f, 168.7f, 481.6f, 166.0f, 478.6f, 163.5f)
                curveTo(481.0f, 155.4f, 484.0f, 149.9f, 487.7f, 142.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEEEEEE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.7f, 645.2f)
                curveTo(246.5f, 645.3f, 247.2f, 645.4f, 248.0f, 645.5f)
                curveTo(252.9f, 646.4f, 257.6f, 648.3f, 260.4f, 652.6f)
                curveTo(261.9f, 660.1f, 256.4f, 661.6f, 250.5f, 664.2f)
                curveTo(246.9f, 665.3f, 243.7f, 666.4f, 240.2f, 665.2f)
                curveTo(232.7f, 658.6f, 238.1f, 647.8f, 245.7f, 645.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEEEEEE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(446.4f, 355.1f)
                curveTo(450.1f, 349.5f, 453.2f, 346.8f, 458.9f, 343.2f)
                curveTo(463.4f, 346.1f, 469.8f, 349.8f, 471.4f, 355.1f)
                curveTo(467.1f, 359.3f, 456.5f, 351.9f, 453.9f, 353.5f)
                lineTo(453.2f, 355.3f)
                curveTo(456.9f, 358.3f, 464.5f, 366.5f, 468.1f, 370.2f)
                curveTo(458.0f, 369.5f, 445.4f, 367.9f, 446.4f, 355.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(546.4f, 194.0f)
                curveTo(548.8f, 193.4f, 550.3f, 194.4f, 552.7f, 195.4f)
                curveTo(558.3f, 202.1f, 550.0f, 212.9f, 545.8f, 218.3f)
                lineTo(544.3f, 218.8f)
                curveTo(537.7f, 217.0f, 536.3f, 206.8f, 538.1f, 201.3f)
                curveTo(539.5f, 197.1f, 542.7f, 196.0f, 546.4f, 194.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEEEEEE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(563.0f, 319.1f)
                curveTo(568.7f, 320.2f, 575.7f, 321.5f, 575.1f, 328.3f)
                curveTo(573.0f, 331.5f, 568.2f, 332.6f, 564.4f, 333.8f)
                curveTo(558.9f, 334.8f, 554.4f, 335.6f, 551.4f, 330.5f)
                curveTo(551.6f, 324.0f, 557.6f, 320.9f, 563.0f, 319.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEEEEEE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(110.9f, 468.5f)
                lineTo(113.0f, 470.0f)
                curveTo(114.2f, 476.6f, 119.9f, 490.7f, 114.1f, 495.0f)
                lineTo(110.0f, 494.0f)
                curveTo(108.5f, 493.1f, 107.1f, 492.0f, 105.8f, 490.9f)
                curveTo(95.7f, 482.8f, 104.9f, 474.8f, 110.9f, 468.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEEEEEE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(485.2f, 344.9f)
                lineTo(486.0f, 344.9f)
                curveTo(491.7f, 345.3f, 501.6f, 348.6f, 500.9f, 355.6f)
                curveTo(497.8f, 358.5f, 497.3f, 357.8f, 492.5f, 358.9f)
                curveTo(487.6f, 359.1f, 482.9f, 359.6f, 478.7f, 357.3f)
                curveTo(474.8f, 352.0f, 480.9f, 348.1f, 485.2f, 344.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEEEEEE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(386.6f, 352.5f)
                curveTo(393.6f, 355.5f, 407.1f, 367.9f, 415.7f, 370.3f)
                curveTo(417.4f, 370.7f, 419.0f, 371.5f, 420.6f, 372.2f)
                lineTo(421.5f, 374.9f)
                curveTo(415.5f, 376.8f, 412.8f, 374.7f, 406.9f, 372.8f)
                curveTo(389.6f, 367.2f, 389.5f, 370.4f, 386.6f, 352.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEEEEEE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(514.5f, 128.6f)
                lineTo(515.5f, 128.5f)
                lineTo(516.4f, 129.9f)
                curveTo(514.0f, 139.0f, 509.2f, 148.7f, 498.5f, 142.6f)
                lineTo(490.1f, 135.6f)
                curveTo(500.6f, 129.8f, 502.4f, 129.5f, 514.5f, 128.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEEEEEE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(114.8f, 367.9f)
                curveTo(116.9f, 370.7f, 113.3f, 389.5f, 112.5f, 393.6f)
                curveTo(109.1f, 393.6f, 108.8f, 392.6f, 105.5f, 390.2f)
                curveTo(90.9f, 383.1f, 108.3f, 372.0f, 114.8f, 367.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEEEEEE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(522.3f, 127.4f)
                curveTo(528.4f, 128.0f, 539.4f, 130.9f, 543.3f, 135.8f)
                curveTo(543.4f, 139.1f, 543.0f, 138.4f, 540.3f, 141.7f)
                curveTo(529.7f, 150.2f, 521.5f, 138.1f, 522.3f, 127.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEEEEEE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(381.9f, 395.0f)
                curveTo(388.9f, 397.7f, 413.0f, 408.6f, 416.6f, 415.2f)
                lineTo(415.8f, 416.1f)
                curveTo(414.4f, 416.1f, 413.0f, 416.1f, 411.6f, 416.1f)
                curveTo(398.9f, 415.7f, 390.2f, 403.9f, 381.9f, 395.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.1f, 645.1f)
                curveTo(222.9f, 644.7f, 232.2f, 650.4f, 230.6f, 659.8f)
                lineTo(228.3f, 661.1f)
                curveTo(223.5f, 658.4f, 212.7f, 654.6f, 210.7f, 650.0f)
                curveTo(211.4f, 646.7f, 211.2f, 647.7f, 214.1f, 645.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(109.6f, 418.6f)
                curveTo(112.9f, 422.6f, 112.9f, 439.2f, 109.5f, 443.0f)
                lineTo(107.2f, 442.2f)
                curveTo(96.9f, 431.5f, 101.1f, 428.0f, 109.6f, 418.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEEEEEE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(125.4f, 321.8f)
                curveTo(127.7f, 324.2f, 126.3f, 330.2f, 126.0f, 333.6f)
                curveTo(122.0f, 339.9f, 119.8f, 341.8f, 113.6f, 345.9f)
                curveTo(108.0f, 337.9f, 119.7f, 326.9f, 125.4f, 321.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEEEEEE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(381.7f, 368.8f)
                curveTo(387.7f, 368.6f, 395.4f, 372.0f, 394.6f, 379.1f)
                curveTo(392.1f, 381.0f, 393.2f, 380.4f, 389.5f, 380.9f)
                lineTo(370.9f, 375.8f)
                lineTo(381.7f, 368.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEEEEEE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(95.2f, 493.5f)
                curveTo(105.2f, 493.9f, 112.4f, 502.6f, 114.5f, 511.8f)
                curveTo(105.1f, 512.6f, 96.6f, 501.8f, 95.2f, 493.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEEEEEE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(268.6f, 652.9f)
                curveTo(272.3f, 654.8f, 279.7f, 660.3f, 282.2f, 663.5f)
                curveTo(285.2f, 667.4f, 284.7f, 667.2f, 284.3f, 671.3f)
                curveTo(278.9f, 669.4f, 270.0f, 664.8f, 267.2f, 659.5f)
                curveTo(266.8f, 656.4f, 267.3f, 655.6f, 268.6f, 652.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEEEEEE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(524.2f, 320.1f)
                curveTo(530.4f, 319.9f, 541.2f, 318.6f, 543.5f, 326.2f)
                curveTo(539.9f, 331.9f, 531.9f, 327.4f, 527.6f, 324.6f)
                curveTo(526.0f, 323.5f, 524.5f, 322.4f, 522.9f, 321.3f)
                lineTo(524.2f, 320.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEEEEEE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(558.0f, 169.9f)
                curveTo(560.6f, 172.6f, 560.1f, 186.4f, 557.8f, 189.4f)
                lineTo(556.1f, 189.2f)
                curveTo(544.8f, 179.5f, 552.7f, 179.3f, 557.6f, 170.6f)
                lineTo(558.0f, 169.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEEEEEE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(515.7f, 344.9f)
                curveTo(518.5f, 345.0f, 519.1f, 345.0f, 521.3f, 346.7f)
                lineTo(521.4f, 348.3f)
                curveTo(519.2f, 351.4f, 516.5f, 352.3f, 513.1f, 354.0f)
                curveTo(511.4f, 355.0f, 512.0f, 354.7f, 509.6f, 354.5f)
                curveTo(507.9f, 351.6f, 508.2f, 353.0f, 508.9f, 349.1f)
                curveTo(510.5f, 346.3f, 512.7f, 345.9f, 515.7f, 344.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEEEEEE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(134.3f, 450.3f)
                curveTo(137.3f, 451.7f, 139.8f, 452.6f, 142.0f, 455.0f)
                curveTo(142.8f, 458.3f, 142.6f, 457.3f, 140.9f, 461.1f)
                curveTo(139.0f, 462.7f, 138.6f, 462.8f, 136.3f, 463.9f)
                lineTo(134.6f, 463.2f)
                curveTo(133.1f, 460.0f, 134.0f, 454.2f, 134.3f, 450.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEEEEEE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(371.0f, 501.3f)
                curveTo(376.6f, 501.5f, 381.6f, 501.2f, 385.3f, 506.0f)
                curveTo(386.5f, 509.4f, 386.4f, 509.8f, 385.3f, 513.2f)
                curveTo(380.7f, 508.9f, 375.8f, 506.9f, 370.8f, 503.0f)
                lineTo(371.0f, 501.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEEEEEE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(605.7f, 293.8f)
                curveTo(612.0f, 297.7f, 602.3f, 304.8f, 599.3f, 307.4f)
                curveTo(596.9f, 306.1f, 597.1f, 304.1f, 597.1f, 302.0f)
                curveTo(598.9f, 298.6f, 602.6f, 296.2f, 605.7f, 293.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEEEEEE)), stroke = null, fillAlpha = 0.988235f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(287.9f, 668.9f)
                curveTo(292.1f, 670.2f, 296.9f, 676.9f, 299.4f, 680.3f)
                curveTo(292.5f, 679.0f, 288.4f, 675.9f, 287.9f, 668.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF020102)), stroke = null, fillAlpha = 0.870588f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(214.9f, 816.0f)
                curveTo(213.7f, 810.9f, 207.1f, 799.3f, 208.2f, 796.2f)
                curveTo(213.2f, 798.7f, 221.6f, 804.9f, 227.4f, 808.3f)
                curveTo(222.9f, 807.7f, 217.7f, 806.7f, 216.9f, 812.3f)
                curveTo(218.2f, 816.5f, 221.3f, 819.4f, 224.2f, 822.7f)
                curveTo(219.5f, 820.3f, 218.7f, 819.6f, 214.9f, 816.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF020102)), stroke = null, fillAlpha = 0.87451f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(838.7f, 762.2f)
                curveTo(845.8f, 760.5f, 852.7f, 751.4f, 858.3f, 752.1f)
                curveTo(857.3f, 754.5f, 851.8f, 762.7f, 849.9f, 764.2f)
                curveTo(847.9f, 761.7f, 841.9f, 762.3f, 838.7f, 762.2f)
                close()
            }
        }
        .build()
        return _standardSadayoKawakamiBecky!!
    }

private var _standardSadayoKawakamiBecky: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = StandardSenderAvatar.StandardSadayoKawakamiBecky, contentDescription = "")
    }
}
