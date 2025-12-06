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

public val StandardSenderAvatar.StandardPhantomThieves: ImageVector
    get() {
        if (_standardPhantomThieves != null) {
            return _standardPhantomThieves!!
        }
        _standardPhantomThieves = Builder(name = "StandardPhantomThieves", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 1024.0f, viewportHeight = 1024.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 570.2f)
                curveTo(245.9f, 510.6f, 239.1f, 469.5f, 213.3f, 416.4f)
                curveTo(188.7f, 365.8f, 170.2f, 311.6f, 129.4f, 270.3f)
                curveTo(116.3f, 252.9f, 80.4f, 259.9f, 95.1f, 231.0f)
                curveTo(159.8f, 103.3f, 333.5f, 61.9f, 465.5f, 58.4f)
                curveTo(529.8f, 56.7f, 611.5f, 66.9f, 673.4f, 86.0f)
                curveTo(687.1f, 91.7f, 711.7f, 95.4f, 700.7f, 115.5f)
                curveTo(664.7f, 181.8f, 639.1f, 254.5f, 628.5f, 329.3f)
                curveTo(626.4f, 344.0f, 617.2f, 413.8f, 643.7f, 409.3f)
                curveTo(692.6f, 400.9f, 737.8f, 419.1f, 784.0f, 431.4f)
                curveTo(789.9f, 433.0f, 835.4f, 422.9f, 842.5f, 419.7f)
                curveTo(855.9f, 413.5f, 874.5f, 399.1f, 884.3f, 387.8f)
                curveTo(885.3f, 404.7f, 888.3f, 428.5f, 876.3f, 442.0f)
                curveTo(868.9f, 450.2f, 854.6f, 455.3f, 844.8f, 461.0f)
                curveTo(855.7f, 467.2f, 864.6f, 476.4f, 870.5f, 487.5f)
                curveTo(904.1f, 483.4f, 936.5f, 497.3f, 964.9f, 514.0f)
                curveTo(967.1f, 520.3f, 970.8f, 528.9f, 972.4f, 534.8f)
                curveTo(942.5f, 515.9f, 925.3f, 524.8f, 892.8f, 530.7f)
                curveTo(921.9f, 592.7f, 882.5f, 667.2f, 840.6f, 713.0f)
                curveTo(828.0f, 726.9f, 820.0f, 735.5f, 804.3f, 745.8f)
                curveTo(801.7f, 744.3f, 801.4f, 743.3f, 800.1f, 740.6f)
                curveTo(803.8f, 736.5f, 807.1f, 733.1f, 810.0f, 728.2f)
                curveTo(794.8f, 737.6f, 781.1f, 749.6f, 766.1f, 759.4f)
                curveTo(749.4f, 770.3f, 712.4f, 786.8f, 693.0f, 793.8f)
                curveTo(680.1f, 798.4f, 666.5f, 802.4f, 653.3f, 805.7f)
                curveTo(644.3f, 807.9f, 632.3f, 808.6f, 624.2f, 812.8f)
                curveTo(612.6f, 819.0f, 603.3f, 832.1f, 593.0f, 840.3f)
                curveTo(561.3f, 865.6f, 461.7f, 939.0f, 424.4f, 930.6f)
                curveTo(411.5f, 927.7f, 401.3f, 919.1f, 390.8f, 911.5f)
                curveTo(370.2f, 896.6f, 343.5f, 878.3f, 316.8f, 880.6f)
                curveTo(309.9f, 892.6f, 306.5f, 914.8f, 295.5f, 918.5f)
                curveTo(288.2f, 921.0f, 270.5f, 909.9f, 263.9f, 905.8f)
                curveTo(241.4f, 891.9f, 222.8f, 872.5f, 210.2f, 849.1f)
                curveTo(205.3f, 839.9f, 201.8f, 829.8f, 196.5f, 820.2f)
                curveTo(183.3f, 812.5f, 163.9f, 809.3f, 149.2f, 802.2f)
                curveTo(107.5f, 781.8f, 27.7f, 704.0f, 64.1f, 653.1f)
                curveTo(100.1f, 602.6f, 187.8f, 571.8f, 248.0f, 570.2f)
                close()
                moveTo(707.5f, 436.1f)
                curveTo(713.6f, 437.0f, 743.2f, 436.2f, 749.4f, 435.0f)
                lineTo(749.2f, 434.5f)
                curveTo(735.5f, 433.5f, 713.2f, 431.7f, 699.9f, 432.9f)
                curveTo(702.9f, 433.8f, 705.1f, 434.1f, 707.5f, 436.1f)
                close()
                moveTo(553.2f, 393.8f)
                curveTo(553.7f, 389.4f, 554.6f, 384.5f, 553.1f, 380.5f)
                curveTo(551.5f, 379.1f, 551.4f, 378.9f, 549.3f, 378.3f)
                curveTo(549.0f, 382.4f, 549.3f, 388.8f, 551.0f, 392.6f)
                lineTo(553.2f, 393.8f)
                close()
                moveTo(689.7f, 477.1f)
                curveTo(691.8f, 473.3f, 696.8f, 465.2f, 696.6f, 461.3f)
                lineTo(695.2f, 463.2f)
                lineTo(697.2f, 461.3f)
                lineTo(697.1f, 460.9f)
                curveTo(694.8f, 462.6f, 691.3f, 469.4f, 689.6f, 472.3f)
                lineTo(689.7f, 477.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.9f, 228.4f)
                curveTo(144.7f, 186.3f, 186.7f, 153.1f, 226.4f, 135.0f)
                curveTo(330.0f, 88.8f, 443.7f, 69.9f, 556.7f, 80.1f)
                curveTo(585.0f, 82.7f, 622.3f, 88.4f, 649.0f, 98.4f)
                curveTo(654.5f, 100.4f, 659.8f, 102.7f, 665.1f, 105.3f)
                curveTo(635.1f, 103.4f, 600.0f, 101.2f, 570.7f, 106.4f)
                curveTo(519.7f, 115.6f, 473.7f, 130.1f, 428.1f, 154.9f)
                curveTo(402.7f, 168.7f, 384.1f, 173.6f, 359.4f, 192.5f)
                curveTo(378.2f, 182.2f, 400.5f, 173.8f, 420.1f, 165.1f)
                curveTo(447.1f, 153.2f, 474.7f, 142.3f, 502.8f, 133.5f)
                curveTo(505.7f, 132.6f, 509.1f, 131.7f, 511.9f, 130.6f)
                curveTo(511.6f, 211.7f, 510.4f, 293.8f, 517.0f, 374.7f)
                curveTo(518.3f, 390.5f, 519.8f, 414.1f, 522.6f, 428.9f)
                curveTo(498.5f, 443.1f, 497.7f, 447.9f, 478.4f, 466.6f)
                curveTo(466.5f, 478.1f, 432.7f, 497.8f, 416.5f, 503.9f)
                curveTo(409.4f, 506.6f, 393.9f, 510.3f, 385.8f, 512.8f)
                curveTo(382.4f, 507.0f, 376.3f, 496.6f, 372.4f, 491.5f)
                curveTo(376.8f, 491.1f, 382.4f, 491.1f, 385.4f, 487.6f)
                lineTo(384.3f, 486.3f)
                curveTo(380.1f, 485.1f, 375.0f, 486.6f, 370.5f, 487.5f)
                curveTo(351.2f, 458.6f, 371.9f, 467.1f, 378.1f, 458.6f)
                curveTo(378.2f, 456.1f, 378.5f, 456.9f, 377.1f, 455.2f)
                curveTo(371.1f, 456.9f, 365.4f, 461.4f, 359.1f, 457.9f)
                curveTo(350.7f, 453.1f, 351.8f, 445.6f, 352.0f, 437.8f)
                curveTo(357.4f, 436.8f, 360.7f, 436.1f, 366.3f, 435.9f)
                curveTo(370.8f, 432.8f, 367.9f, 427.3f, 364.5f, 425.3f)
                curveTo(361.7f, 426.1f, 357.3f, 430.8f, 352.0f, 433.5f)
                curveTo(347.9f, 428.9f, 340.8f, 423.4f, 341.2f, 417.1f)
                curveTo(341.7f, 410.7f, 347.7f, 404.9f, 354.3f, 405.7f)
                curveTo(356.5f, 406.0f, 358.6f, 406.7f, 360.6f, 407.6f)
                lineTo(361.5f, 406.6f)
                curveTo(361.2f, 403.2f, 360.8f, 399.8f, 360.7f, 396.3f)
                curveTo(345.8f, 402.7f, 342.5f, 406.0f, 331.6f, 392.8f)
                curveTo(336.4f, 381.0f, 341.4f, 371.7f, 354.9f, 381.5f)
                curveTo(355.5f, 380.1f, 342.4f, 333.9f, 340.6f, 328.3f)
                curveTo(339.3f, 323.9f, 332.1f, 317.9f, 334.6f, 311.2f)
                curveTo(337.6f, 303.2f, 329.4f, 294.2f, 324.9f, 287.9f)
                curveTo(329.6f, 270.3f, 324.5f, 270.9f, 313.2f, 258.6f)
                curveTo(324.1f, 239.0f, 316.1f, 245.2f, 304.1f, 231.6f)
                curveTo(313.4f, 223.7f, 323.0f, 216.1f, 332.7f, 208.7f)
                curveTo(324.6f, 212.8f, 319.0f, 215.6f, 311.3f, 220.8f)
                curveTo(303.0f, 226.2f, 294.6f, 234.7f, 285.9f, 239.2f)
                curveTo(246.9f, 259.4f, 198.0f, 271.6f, 154.7f, 259.1f)
                curveTo(139.1f, 254.5f, 131.9f, 243.7f, 128.9f, 228.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(689.6f, 472.3f)
                lineTo(689.7f, 477.1f)
                curveTo(686.5f, 483.8f, 681.5f, 495.7f, 677.7f, 501.2f)
                curveTo(647.1f, 513.9f, 634.0f, 513.2f, 619.0f, 548.7f)
                curveTo(611.2f, 567.0f, 603.6f, 605.3f, 625.8f, 619.3f)
                curveTo(629.9f, 621.9f, 643.9f, 618.8f, 649.0f, 617.6f)
                curveTo(645.4f, 577.8f, 681.1f, 560.8f, 712.6f, 548.3f)
                curveTo(700.3f, 560.1f, 667.9f, 591.0f, 684.8f, 606.1f)
                curveTo(710.0f, 628.8f, 779.9f, 576.8f, 795.9f, 560.4f)
                curveTo(822.0f, 533.4f, 836.8f, 506.0f, 877.5f, 505.2f)
                curveTo(883.6f, 505.1f, 899.6f, 501.2f, 904.5f, 503.8f)
                curveTo(901.5f, 505.2f, 894.1f, 506.7f, 888.8f, 508.8f)
                curveTo(866.3f, 518.0f, 842.8f, 530.2f, 825.1f, 547.2f)
                curveTo(809.6f, 562.1f, 795.5f, 583.9f, 785.3f, 603.0f)
                curveTo(780.7f, 611.6f, 773.7f, 626.6f, 767.5f, 633.4f)
                curveTo(753.8f, 648.6f, 721.7f, 659.6f, 701.9f, 652.8f)
                curveTo(691.9f, 649.4f, 689.8f, 642.9f, 685.3f, 634.0f)
                curveTo(665.4f, 631.4f, 630.4f, 630.1f, 615.6f, 643.9f)
                curveTo(608.7f, 650.2f, 584.0f, 673.6f, 584.0f, 683.7f)
                curveTo(584.0f, 689.9f, 584.6f, 698.3f, 588.6f, 703.7f)
                curveTo(593.4f, 710.1f, 604.7f, 710.7f, 607.1f, 713.6f)
                curveTo(599.7f, 731.9f, 560.2f, 746.4f, 542.7f, 751.3f)
                curveTo(538.8f, 752.3f, 532.9f, 751.9f, 529.6f, 754.2f)
                curveTo(529.5f, 757.2f, 529.1f, 756.1f, 531.2f, 758.3f)
                curveTo(536.7f, 759.9f, 558.3f, 754.6f, 563.8f, 755.4f)
                curveTo(580.5f, 757.9f, 640.7f, 694.6f, 639.5f, 683.6f)
                curveTo(637.2f, 684.1f, 629.7f, 693.6f, 624.0f, 697.1f)
                curveTo(615.1f, 697.3f, 606.2f, 698.4f, 599.1f, 691.9f)
                curveTo(591.8f, 685.3f, 595.6f, 675.4f, 601.6f, 669.7f)
                curveTo(617.6f, 654.3f, 632.4f, 642.0f, 655.9f, 643.2f)
                curveTo(674.4f, 643.7f, 685.2f, 645.3f, 694.3f, 663.3f)
                curveTo(687.4f, 676.2f, 675.2f, 692.0f, 666.1f, 703.8f)
                curveTo(623.1f, 760.6f, 572.4f, 811.1f, 515.3f, 853.8f)
                curveTo(497.7f, 867.0f, 486.6f, 877.0f, 465.4f, 883.4f)
                curveTo(436.3f, 892.3f, 414.1f, 889.3f, 387.7f, 874.3f)
                curveTo(365.8f, 861.8f, 337.1f, 842.7f, 310.1f, 850.3f)
                curveTo(309.4f, 848.7f, 308.7f, 847.7f, 307.7f, 846.2f)
                curveTo(314.4f, 829.2f, 322.7f, 801.5f, 310.4f, 785.6f)
                curveTo(310.5f, 785.2f, 322.5f, 772.7f, 323.1f, 768.0f)
                curveTo(325.0f, 753.3f, 394.2f, 669.8f, 402.0f, 668.0f)
                curveTo(404.6f, 676.2f, 389.3f, 691.7f, 384.6f, 698.6f)
                curveTo(379.3f, 706.2f, 369.3f, 726.3f, 375.3f, 734.2f)
                curveTo(379.7f, 735.6f, 382.8f, 732.1f, 388.4f, 732.1f)
                lineTo(389.0f, 733.7f)
                curveTo(387.1f, 742.2f, 378.1f, 750.2f, 373.0f, 757.8f)
                curveTo(358.0f, 780.0f, 351.0f, 807.2f, 355.5f, 833.6f)
                curveTo(361.5f, 823.9f, 367.2f, 814.5f, 377.9f, 809.3f)
                curveTo(381.6f, 807.5f, 385.6f, 806.3f, 389.7f, 805.9f)
                curveTo(397.8f, 805.0f, 408.2f, 807.1f, 415.5f, 806.1f)
                curveTo(434.9f, 803.4f, 424.3f, 815.1f, 428.6f, 821.2f)
                curveTo(437.7f, 835.2f, 466.9f, 827.9f, 477.4f, 829.2f)
                curveTo(519.6f, 834.3f, 529.7f, 814.7f, 555.3f, 787.3f)
                curveTo(562.7f, 779.4f, 573.9f, 775.2f, 584.0f, 769.5f)
                curveTo(578.0f, 766.3f, 504.7f, 806.2f, 500.0f, 781.8f)
                curveTo(497.6f, 769.5f, 522.2f, 761.0f, 530.2f, 751.9f)
                curveTo(528.2f, 752.1f, 526.2f, 752.3f, 524.1f, 752.5f)
                curveTo(505.3f, 754.8f, 489.8f, 766.0f, 478.3f, 780.6f)
                curveTo(494.5f, 799.9f, 518.3f, 794.5f, 541.5f, 793.9f)
                curveTo(540.6f, 795.1f, 539.7f, 796.2f, 538.7f, 797.2f)
                curveTo(530.8f, 806.4f, 513.0f, 820.9f, 500.4f, 821.6f)
                curveTo(495.1f, 821.9f, 493.4f, 819.9f, 489.7f, 816.5f)
                curveTo(473.4f, 824.3f, 461.0f, 827.8f, 442.8f, 822.5f)
                curveTo(437.1f, 817.0f, 436.2f, 814.6f, 433.4f, 807.4f)
                curveTo(434.0f, 805.8f, 434.5f, 804.5f, 435.3f, 802.9f)
                lineTo(434.1f, 802.0f)
                lineTo(430.1f, 803.6f)
                curveTo(419.7f, 800.1f, 407.1f, 798.9f, 396.1f, 799.2f)
                curveTo(377.8f, 799.7f, 370.5f, 806.5f, 359.0f, 818.6f)
                curveTo(360.6f, 812.6f, 361.0f, 806.4f, 362.1f, 800.2f)
                curveTo(365.0f, 784.3f, 372.1f, 769.5f, 382.6f, 757.2f)
                curveTo(390.4f, 748.2f, 407.0f, 736.5f, 400.7f, 720.8f)
                curveTo(399.7f, 718.3f, 398.0f, 718.1f, 395.7f, 717.5f)
                curveTo(391.3f, 718.1f, 389.8f, 719.6f, 386.1f, 722.1f)
                lineTo(385.3f, 721.3f)
                curveTo(392.8f, 693.4f, 404.9f, 696.7f, 420.3f, 676.6f)
                curveTo(424.3f, 671.5f, 428.4f, 657.6f, 431.4f, 650.9f)
                curveTo(439.4f, 632.9f, 452.3f, 618.1f, 466.0f, 604.2f)
                lineTo(469.9f, 607.6f)
                curveTo(461.6f, 620.4f, 456.3f, 639.2f, 461.3f, 653.8f)
                curveTo(466.6f, 668.4f, 481.0f, 670.5f, 494.3f, 665.6f)
                curveTo(525.1f, 654.6f, 531.6f, 613.5f, 540.9f, 586.1f)
                curveTo(541.9f, 583.0f, 534.3f, 579.4f, 546.4f, 561.4f)
                curveTo(583.4f, 506.0f, 646.5f, 520.7f, 689.6f, 472.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(430.2f, 582.6f)
                curveTo(446.1f, 565.1f, 461.4f, 546.2f, 477.7f, 529.3f)
                curveTo(541.5f, 463.2f, 607.8f, 433.5f, 699.9f, 432.9f)
                curveTo(702.9f, 433.8f, 705.1f, 434.1f, 707.5f, 436.1f)
                curveTo(672.1f, 437.2f, 635.6f, 444.0f, 601.7f, 460.0f)
                curveTo(551.5f, 483.7f, 487.5f, 519.7f, 461.6f, 571.3f)
                curveTo(446.9f, 600.9f, 426.1f, 618.9f, 405.8f, 643.6f)
                curveTo(388.8f, 668.9f, 379.5f, 678.1f, 359.6f, 700.3f)
                curveTo(323.7f, 743.3f, 273.4f, 775.0f, 216.1f, 774.7f)
                curveTo(203.9f, 774.6f, 154.9f, 766.5f, 145.3f, 760.5f)
                curveTo(100.2f, 732.4f, 58.2f, 680.8f, 101.7f, 635.1f)
                curveTo(107.2f, 629.2f, 113.8f, 624.3f, 121.0f, 620.7f)
                curveTo(135.1f, 613.7f, 178.3f, 602.8f, 194.5f, 602.8f)
                curveTo(211.5f, 602.8f, 244.1f, 605.1f, 257.7f, 616.3f)
                curveTo(260.1f, 620.2f, 256.5f, 638.0f, 258.0f, 642.9f)
                curveTo(263.6f, 661.9f, 289.6f, 699.9f, 306.5f, 709.1f)
                curveTo(309.8f, 710.9f, 333.3f, 707.8f, 337.5f, 704.8f)
                curveTo(341.4f, 702.0f, 349.9f, 692.6f, 354.2f, 688.2f)
                curveTo(371.5f, 670.0f, 387.7f, 654.0f, 398.5f, 630.7f)
                curveTo(387.7f, 639.1f, 354.3f, 672.5f, 344.6f, 676.3f)
                curveTo(342.4f, 673.7f, 344.3f, 671.1f, 343.7f, 670.4f)
                curveTo(331.3f, 653.2f, 335.7f, 636.6f, 333.2f, 617.0f)
                curveTo(330.2f, 593.4f, 326.2f, 570.0f, 324.6f, 545.8f)
                curveTo(313.2f, 542.4f, 299.0f, 537.8f, 287.9f, 533.3f)
                curveTo(348.0f, 534.6f, 374.2f, 532.6f, 430.4f, 503.2f)
                curveTo(442.3f, 496.9f, 453.6f, 489.3f, 465.6f, 483.0f)
                curveTo(477.2f, 476.9f, 488.8f, 471.0f, 500.5f, 465.4f)
                curveTo(507.0f, 462.2f, 517.6f, 457.5f, 523.2f, 454.0f)
                curveTo(521.3f, 458.5f, 516.1f, 473.0f, 513.8f, 476.0f)
                curveTo(498.8f, 495.7f, 477.1f, 511.9f, 462.2f, 531.8f)
                curveTo(450.3f, 547.5f, 441.8f, 564.8f, 429.1f, 579.5f)
                lineTo(430.2f, 582.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfefefe)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(429.1f, 579.5f)
                lineTo(430.2f, 582.6f)
                curveTo(428.7f, 585.5f, 421.8f, 592.3f, 419.3f, 594.6f)
                curveTo(422.8f, 588.1f, 424.6f, 585.4f, 429.1f, 579.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(720.3f, 524.4f)
                curveTo(731.5f, 523.1f, 755.7f, 524.2f, 768.2f, 524.1f)
                curveTo(762.4f, 542.9f, 755.1f, 561.2f, 746.2f, 578.8f)
                curveTo(737.9f, 595.1f, 735.1f, 598.9f, 717.2f, 605.3f)
                curveTo(694.9f, 614.4f, 680.4f, 601.3f, 694.0f, 579.3f)
                curveTo(705.6f, 560.4f, 719.3f, 553.6f, 740.0f, 548.5f)
                curveTo(728.1f, 548.9f, 723.9f, 549.1f, 711.8f, 548.0f)
                curveTo(710.6f, 547.9f, 707.7f, 547.5f, 706.7f, 547.6f)
                curveTo(678.2f, 551.5f, 655.2f, 564.5f, 640.8f, 589.9f)
                curveTo(637.6f, 595.5f, 635.5f, 605.0f, 631.5f, 609.5f)
                curveTo(619.1f, 610.3f, 618.6f, 585.9f, 619.9f, 577.5f)
                curveTo(624.3f, 548.8f, 634.6f, 543.6f, 660.1f, 535.6f)
                curveTo(682.9f, 528.4f, 697.1f, 525.8f, 720.3f, 524.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(861.6f, 423.0f)
                lineTo(863.1f, 423.3f)
                lineTo(863.8f, 424.9f)
                curveTo(854.6f, 448.0f, 826.5f, 447.1f, 809.1f, 456.0f)
                curveTo(795.3f, 463.0f, 790.2f, 482.0f, 775.9f, 489.0f)
                curveTo(766.5f, 493.6f, 755.0f, 485.2f, 748.6f, 488.8f)
                lineTo(748.7f, 492.6f)
                curveTo(747.8f, 495.2f, 739.4f, 500.6f, 736.5f, 503.0f)
                curveTo(734.4f, 502.0f, 730.8f, 499.8f, 728.7f, 498.6f)
                curveTo(719.0f, 484.7f, 736.6f, 475.1f, 743.9f, 465.2f)
                curveTo(745.3f, 463.4f, 747.7f, 457.7f, 748.8f, 455.4f)
                lineTo(750.3f, 455.6f)
                curveTo(750.4f, 458.5f, 749.9f, 459.4f, 751.4f, 461.4f)
                curveTo(759.8f, 458.5f, 770.0f, 448.4f, 779.8f, 445.7f)
                curveTo(788.3f, 443.4f, 796.8f, 442.2f, 805.6f, 441.4f)
                curveTo(831.2f, 439.1f, 840.3f, 435.9f, 861.6f, 423.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(520.3f, 578.1f)
                lineTo(521.8f, 578.3f)
                curveTo(526.0f, 583.0f, 528.7f, 588.7f, 531.6f, 594.3f)
                curveTo(527.7f, 610.6f, 522.4f, 629.5f, 511.5f, 642.7f)
                curveTo(504.8f, 650.9f, 496.5f, 655.9f, 485.8f, 656.9f)
                curveTo(458.0f, 649.1f, 481.2f, 603.5f, 495.7f, 592.8f)
                curveTo(503.0f, 587.5f, 512.5f, 582.5f, 520.3f, 578.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.5f, 782.2f)
                curveTo(234.0f, 781.9f, 253.5f, 785.2f, 266.8f, 793.6f)
                curveTo(280.1f, 801.9f, 287.4f, 813.6f, 291.0f, 828.5f)
                lineTo(284.2f, 833.1f)
                curveTo(283.2f, 834.6f, 282.1f, 836.3f, 280.9f, 837.5f)
                curveTo(279.2f, 839.1f, 277.1f, 839.4f, 274.9f, 839.3f)
                curveTo(256.9f, 838.4f, 239.1f, 798.8f, 228.6f, 786.6f)
                curveTo(225.1f, 785.3f, 221.8f, 783.9f, 218.5f, 782.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(337.1f, 348.8f)
                curveTo(344.0f, 350.8f, 350.4f, 358.3f, 347.2f, 366.2f)
                curveTo(344.2f, 373.5f, 341.3f, 373.8f, 334.4f, 377.1f)
                curveTo(319.2f, 365.9f, 318.5f, 356.2f, 337.1f, 348.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(552.9f, 270.0f)
                curveTo(570.6f, 269.4f, 573.6f, 291.0f, 556.5f, 293.7f)
                curveTo(547.5f, 294.2f, 546.7f, 292.0f, 541.6f, 285.5f)
                curveTo(543.0f, 275.3f, 542.2f, 272.9f, 552.9f, 270.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(562.7f, 220.0f)
                curveTo(579.3f, 217.6f, 582.6f, 238.3f, 568.5f, 245.4f)
                curveTo(553.2f, 248.7f, 546.4f, 226.7f, 562.7f, 220.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(589.2f, 122.4f)
                curveTo(594.9f, 123.2f, 596.6f, 126.4f, 600.2f, 130.8f)
                lineTo(597.2f, 143.6f)
                curveTo(594.2f, 144.5f, 589.5f, 145.3f, 586.2f, 146.0f)
                curveTo(573.3f, 145.0f, 570.4f, 134.4f, 578.1f, 125.1f)
                curveTo(580.5f, 122.3f, 585.5f, 122.6f, 589.2f, 122.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(327.3f, 321.0f)
                curveTo(340.9f, 325.4f, 344.8f, 342.5f, 326.5f, 347.6f)
                curveTo(318.9f, 347.2f, 311.9f, 339.9f, 314.9f, 332.2f)
                curveTo(317.9f, 324.6f, 320.6f, 324.2f, 327.3f, 321.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(304.7f, 342.7f)
                curveTo(319.5f, 341.9f, 322.4f, 363.1f, 311.0f, 368.0f)
                curveTo(291.4f, 369.7f, 288.2f, 353.1f, 304.7f, 342.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(572.0f, 170.0f)
                curveTo(580.7f, 168.9f, 582.0f, 171.7f, 586.9f, 177.8f)
                lineTo(587.5f, 191.6f)
                curveTo(584.3f, 193.0f, 581.1f, 194.6f, 577.9f, 196.2f)
                curveTo(574.9f, 196.5f, 568.6f, 194.0f, 566.9f, 191.7f)
                curveTo(560.8f, 183.7f, 566.6f, 175.2f, 572.0f, 170.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(552.6f, 190.7f)
                curveTo(560.8f, 192.2f, 565.2f, 198.0f, 570.3f, 204.0f)
                curveTo(566.0f, 210.6f, 563.7f, 212.7f, 557.9f, 218.2f)
                curveTo(557.7f, 218.4f, 556.5f, 218.6f, 556.1f, 218.7f)
                curveTo(553.9f, 215.3f, 550.3f, 216.2f, 547.9f, 213.8f)
                curveTo(540.3f, 206.3f, 547.5f, 196.3f, 552.6f, 190.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(561.3f, 143.1f)
                curveTo(578.9f, 141.6f, 584.3f, 159.5f, 571.6f, 165.5f)
                curveTo(570.6f, 165.6f, 569.6f, 165.8f, 568.5f, 165.9f)
                curveTo(551.4f, 167.4f, 550.5f, 153.7f, 561.3f, 143.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(546.7f, 164.1f)
                curveTo(555.7f, 165.4f, 555.4f, 167.3f, 559.6f, 175.2f)
                curveTo(557.4f, 183.8f, 557.9f, 185.4f, 549.4f, 188.8f)
                curveTo(546.9f, 190.4f, 544.4f, 190.0f, 541.8f, 189.0f)
                curveTo(536.4f, 184.4f, 538.8f, 172.7f, 541.0f, 166.9f)
                curveTo(541.8f, 165.0f, 544.9f, 164.6f, 546.7f, 164.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(312.5f, 373.3f)
                lineTo(325.0f, 373.1f)
                curveTo(328.0f, 381.8f, 331.1f, 390.6f, 319.7f, 394.4f)
                curveTo(306.2f, 395.6f, 296.9f, 380.3f, 312.5f, 373.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(546.0f, 241.0f)
                curveTo(549.3f, 243.4f, 553.2f, 244.9f, 555.2f, 248.6f)
                curveTo(559.7f, 256.8f, 555.7f, 261.9f, 548.4f, 265.7f)
                curveTo(545.9f, 266.4f, 545.1f, 266.4f, 542.4f, 266.6f)
                curveTo(534.6f, 263.4f, 535.4f, 252.6f, 538.0f, 246.1f)
                curveTo(541.5f, 244.5f, 542.5f, 244.1f, 545.4f, 241.6f)
                lineTo(546.0f, 241.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(585.8f, 197.9f)
                curveTo(589.1f, 198.1f, 588.0f, 197.6f, 590.3f, 199.5f)
                curveTo(593.0f, 205.8f, 591.9f, 216.9f, 589.5f, 223.2f)
                curveTo(585.8f, 224.3f, 585.9f, 223.6f, 581.6f, 222.5f)
                curveTo(566.9f, 212.9f, 571.2f, 203.8f, 585.8f, 197.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(311.6f, 293.5f)
                curveTo(330.5f, 296.0f, 335.4f, 308.3f, 319.2f, 320.8f)
                curveTo(315.9f, 320.4f, 307.4f, 316.5f, 305.7f, 313.6f)
                curveTo(307.3f, 307.8f, 314.9f, 308.5f, 314.7f, 300.2f)
                curveTo(312.9f, 297.4f, 312.3f, 296.8f, 311.6f, 293.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(589.0f, 149.1f)
                curveTo(592.6f, 149.2f, 598.0f, 150.0f, 601.8f, 150.5f)
                curveTo(602.5f, 158.1f, 603.9f, 171.5f, 595.5f, 174.8f)
                curveTo(588.6f, 170.7f, 586.3f, 169.4f, 582.0f, 162.5f)
                curveTo(583.8f, 158.4f, 586.0f, 152.2f, 589.0f, 149.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(554.9f, 346.3f)
                lineTo(557.2f, 346.5f)
                curveTo(560.1f, 351.2f, 559.0f, 366.3f, 555.0f, 371.5f)
                curveTo(551.4f, 372.4f, 551.7f, 371.7f, 547.5f, 370.1f)
                curveTo(533.5f, 360.7f, 539.2f, 348.4f, 554.9f, 346.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(571.1f, 249.1f)
                curveTo(575.6f, 248.8f, 582.6f, 248.3f, 582.9f, 254.6f)
                curveTo(583.2f, 259.5f, 582.6f, 268.5f, 579.6f, 272.5f)
                lineTo(577.7f, 272.3f)
                curveTo(574.5f, 268.0f, 575.3f, 265.5f, 574.6f, 260.3f)
                curveTo(569.4f, 263.1f, 572.7f, 268.7f, 569.2f, 272.0f)
                curveTo(561.5f, 269.2f, 558.1f, 253.9f, 571.1f, 249.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(538.6f, 318.8f)
                curveTo(549.9f, 320.4f, 564.4f, 325.1f, 553.0f, 338.9f)
                curveTo(548.4f, 341.9f, 544.3f, 343.4f, 539.3f, 345.4f)
                curveTo(538.8f, 336.5f, 538.6f, 327.7f, 538.6f, 318.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(563.3f, 124.4f)
                curveTo(567.3f, 124.2f, 566.8f, 123.5f, 569.2f, 125.5f)
                curveTo(570.3f, 129.2f, 568.6f, 134.5f, 567.7f, 138.4f)
                curveTo(563.0f, 139.5f, 556.6f, 140.2f, 551.7f, 140.9f)
                curveTo(548.8f, 139.0f, 545.2f, 130.5f, 543.4f, 126.9f)
                lineTo(563.3f, 124.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(300.6f, 316.9f)
                lineTo(310.1f, 322.2f)
                curveTo(310.0f, 333.6f, 311.0f, 334.6f, 300.3f, 339.7f)
                curveTo(298.1f, 340.6f, 298.0f, 340.5f, 295.7f, 340.5f)
                lineTo(294.2f, 338.7f)
                curveTo(293.2f, 331.8f, 297.8f, 323.3f, 300.6f, 316.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(562.2f, 296.6f)
                lineTo(564.0f, 297.3f)
                curveTo(566.5f, 301.7f, 563.8f, 317.2f, 562.6f, 322.4f)
                curveTo(560.5f, 322.6f, 558.7f, 320.6f, 556.6f, 319.1f)
                curveTo(552.9f, 315.6f, 551.5f, 312.1f, 549.3f, 307.6f)
                curveTo(554.0f, 301.6f, 555.2f, 299.4f, 562.2f, 296.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(308.1f, 265.4f)
                curveTo(319.8f, 267.9f, 323.1f, 275.9f, 317.5f, 286.3f)
                curveTo(315.3f, 287.9f, 313.9f, 289.2f, 311.2f, 289.8f)
                curveTo(309.6f, 285.4f, 308.3f, 270.4f, 308.1f, 265.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(542.1f, 394.4f)
                curveTo(545.3f, 395.2f, 551.1f, 400.1f, 554.0f, 402.3f)
                curveTo(553.0f, 406.5f, 551.3f, 411.4f, 550.0f, 415.5f)
                lineTo(546.8f, 418.0f)
                lineTo(544.8f, 417.7f)
                curveTo(540.9f, 413.5f, 542.1f, 400.5f, 542.1f, 394.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(539.5f, 212.3f)
                curveTo(541.9f, 213.3f, 548.7f, 222.4f, 551.1f, 225.3f)
                curveTo(548.8f, 228.4f, 546.7f, 231.1f, 544.6f, 234.4f)
                curveTo(543.9f, 236.1f, 543.2f, 237.4f, 542.4f, 239.0f)
                lineTo(540.6f, 239.5f)
                curveTo(537.3f, 235.2f, 538.7f, 218.0f, 539.5f, 212.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(539.8f, 138.1f)
                curveTo(552.3f, 141.2f, 551.4f, 145.7f, 547.0f, 156.4f)
                curveTo(544.9f, 158.0f, 544.6f, 158.3f, 542.1f, 159.1f)
                lineTo(540.4f, 157.7f)
                curveTo(539.3f, 154.1f, 539.9f, 143.2f, 539.8f, 138.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(538.0f, 292.3f)
                curveTo(549.1f, 295.3f, 545.0f, 306.1f, 543.3f, 314.8f)
                lineTo(540.7f, 315.4f)
                lineTo(538.9f, 313.6f)
                curveTo(536.7f, 306.8f, 537.6f, 299.4f, 538.0f, 292.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfefefe)), stroke = null, fillAlpha = 0.988235f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(699.9f, 432.9f)
                curveTo(713.2f, 431.7f, 735.5f, 433.5f, 749.2f, 434.5f)
                lineTo(749.4f, 435.0f)
                curveTo(743.2f, 436.2f, 713.6f, 437.0f, 707.5f, 436.1f)
                curveTo(705.1f, 434.1f, 702.9f, 433.8f, 699.9f, 432.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.2f, 400.3f)
                curveTo(325.8f, 399.9f, 330.6f, 398.7f, 334.9f, 403.0f)
                curveTo(336.8f, 406.4f, 336.4f, 408.7f, 336.3f, 412.6f)
                curveTo(331.6f, 409.7f, 321.9f, 404.7f, 320.2f, 400.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(577.0f, 275.6f)
                curveTo(583.2f, 277.6f, 579.2f, 293.0f, 578.6f, 298.8f)
                curveTo(571.7f, 296.6f, 574.0f, 279.0f, 577.0f, 275.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(597.4f, 118.3f)
                curveTo(601.7f, 118.0f, 609.5f, 116.6f, 612.5f, 119.5f)
                curveTo(612.5f, 122.6f, 610.6f, 124.2f, 608.5f, 126.5f)
                curveTo(605.7f, 126.9f, 598.7f, 122.3f, 596.7f, 120.3f)
                lineTo(597.4f, 118.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(304.7f, 242.2f)
                lineTo(306.8f, 243.1f)
                curveTo(310.9f, 247.4f, 311.2f, 253.5f, 308.2f, 258.6f)
                lineTo(305.9f, 258.1f)
                curveTo(303.2f, 253.4f, 304.2f, 247.6f, 304.7f, 242.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(307.7f, 846.2f)
                curveTo(308.7f, 847.7f, 309.4f, 848.7f, 310.1f, 850.3f)
                curveTo(306.6f, 853.1f, 297.4f, 865.1f, 294.2f, 869.1f)
                curveTo(298.3f, 859.8f, 301.2f, 854.1f, 307.7f, 846.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(466.0f, 604.2f)
                curveTo(472.9f, 598.1f, 477.5f, 595.0f, 485.9f, 591.0f)
                curveTo(479.7f, 596.7f, 474.9f, 600.8f, 469.9f, 607.6f)
                lineTo(466.0f, 604.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(610.1f, 128.8f)
                curveTo(613.3f, 131.6f, 607.4f, 141.0f, 605.7f, 144.4f)
                curveTo(600.7f, 139.1f, 606.7f, 133.3f, 610.1f, 128.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, fillAlpha = 0.976471f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(549.3f, 378.3f)
                curveTo(551.4f, 378.9f, 551.5f, 379.1f, 553.1f, 380.5f)
                curveTo(554.6f, 384.5f, 553.7f, 389.4f, 553.2f, 393.8f)
                lineTo(551.0f, 392.6f)
                curveTo(549.3f, 388.8f, 549.0f, 382.4f, 549.3f, 378.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfefefe)), stroke = null, fillAlpha = 0.980392f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(689.6f, 472.3f)
                curveTo(691.3f, 469.4f, 694.8f, 462.6f, 697.1f, 460.9f)
                lineTo(697.2f, 461.3f)
                lineTo(695.2f, 463.2f)
                lineTo(696.6f, 461.3f)
                curveTo(696.8f, 465.2f, 691.8f, 473.3f, 689.7f, 477.1f)
                lineTo(689.6f, 472.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.854902f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(800.1f, 740.6f)
                curveTo(801.4f, 743.3f, 801.7f, 744.3f, 804.3f, 745.8f)
                curveTo(801.0f, 748.6f, 796.9f, 753.4f, 792.3f, 751.4f)
                curveTo(793.3f, 747.7f, 796.4f, 747.8f, 799.7f, 741.5f)
                lineTo(800.1f, 740.6f)
                close()
            }
        }
        .build()
        return _standardPhantomThieves!!
    }

private var _standardPhantomThieves: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = StandardSenderAvatar.StandardPhantomThieves, contentDescription = "")
    }
}
