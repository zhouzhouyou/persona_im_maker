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

public val StandardSenderAvatar.StandardOreNoBekoColorful: ImageVector
    get() {
        if (_standardOreNoBekoColorful != null) {
            return _standardOreNoBekoColorful!!
        }
        _standardOreNoBekoColorful = Builder(name = "StandardOreNoBekoColorful", defaultWidth =
                335.0.dp, defaultHeight = 295.0.dp, viewportWidth = 1340.0f, viewportHeight =
                1180.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(520.0f, 0.0f)
                lineTo(710.6f, 0.0f)
                curveTo(729.4f, 17.0f, 753.9f, 35.6f, 774.0f, 51.5f)
                curveTo(802.1f, 73.4f, 830.0f, 95.5f, 857.8f, 117.7f)
                lineTo(1159.9f, 358.0f)
                lineTo(1248.6f, 428.4f)
                curveTo(1260.5f, 437.8f, 1289.5f, 459.5f, 1297.8f, 470.0f)
                curveTo(1298.3f, 487.7f, 1300.7f, 575.3f, 1297.2f, 584.7f)
                curveTo(1292.4f, 597.4f, 1282.4f, 609.6f, 1274.9f, 620.9f)
                lineTo(1238.3f, 675.6f)
                lineTo(1086.9f, 903.1f)
                lineTo(969.2f, 1080.4f)
                lineTo(938.3f, 1126.8f)
                curveTo(931.6f, 1137.0f, 921.9f, 1152.9f, 914.3f, 1161.7f)
                curveTo(911.6f, 1162.1f, 908.9f, 1162.3f, 906.2f, 1162.5f)
                curveTo(892.2f, 1163.4f, 868.0f, 1162.0f, 853.8f, 1161.2f)
                lineTo(777.6f, 1156.9f)
                curveTo(763.7f, 1156.2f, 695.2f, 1157.3f, 686.1f, 1151.9f)
                curveTo(671.1f, 1143.1f, 638.0f, 1117.9f, 622.7f, 1106.8f)
                lineTo(431.9f, 968.0f)
                lineTo(206.5f, 804.3f)
                lineTo(135.2f, 752.6f)
                curveTo(124.2f, 744.6f, 106.5f, 732.4f, 96.7f, 723.8f)
                curveTo(94.4f, 709.7f, 93.5f, 692.8f, 92.2f, 678.5f)
                lineTo(86.1f, 617.0f)
                lineTo(80.2f, 552.4f)
                curveTo(78.8f, 538.9f, 76.6f, 525.7f, 76.3f, 512.2f)
                curveTo(83.3f, 500.1f, 98.1f, 484.2f, 107.8f, 473.2f)
                lineTo(149.6f, 425.2f)
                lineTo(310.1f, 240.4f)
                lineTo(441.1f, 89.6f)
                curveTo(457.5f, 70.3f, 474.1f, 51.1f, 490.8f, 32.1f)
                curveTo(499.2f, 22.4f, 510.8f, 8.1f, 520.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(630.3f, 29.8f)
                curveTo(649.3f, 36.0f, 683.8f, 44.3f, 699.7f, 53.2f)
                curveTo(712.8f, 60.5f, 736.5f, 79.9f, 749.7f, 89.6f)
                lineTo(860.0f, 170.2f)
                lineTo(1257.1f, 461.5f)
                curveTo(1264.6f, 488.6f, 1269.1f, 517.2f, 1276.4f, 544.5f)
                curveTo(1277.9f, 550.2f, 1279.0f, 555.8f, 1279.3f, 561.7f)
                curveTo(1272.3f, 567.8f, 1257.7f, 590.9f, 1251.4f, 599.7f)
                curveTo(1236.3f, 620.9f, 1221.1f, 642.1f, 1205.7f, 663.2f)
                lineTo(981.8f, 975.1f)
                lineTo(921.4f, 1059.9f)
                curveTo(911.3f, 1074.2f, 894.6f, 1099.3f, 883.9f, 1112.1f)
                curveTo(862.4f, 1108.9f, 841.3f, 1104.1f, 819.8f, 1100.2f)
                curveTo(808.4f, 1098.0f, 787.9f, 1095.0f, 778.6f, 1089.3f)
                curveTo(764.2f, 1080.3f, 750.0f, 1068.2f, 736.0f, 1058.1f)
                lineTo(630.3f, 980.9f)
                lineTo(253.1f, 705.9f)
                curveTo(232.6f, 690.9f, 212.2f, 675.8f, 191.8f, 660.6f)
                curveTo(182.9f, 653.9f, 166.1f, 640.8f, 157.1f, 636.0f)
                curveTo(156.5f, 606.6f, 158.5f, 576.7f, 158.9f, 547.2f)
                curveTo(159.0f, 542.2f, 159.3f, 537.2f, 159.7f, 532.2f)
                curveTo(164.5f, 525.0f, 177.7f, 512.3f, 184.1f, 505.6f)
                lineTo(225.1f, 462.3f)
                curveTo(229.3f, 458.0f, 233.6f, 453.5f, 237.5f, 449.0f)
                curveTo(260.4f, 423.0f, 284.6f, 398.5f, 308.3f, 373.1f)
                lineTo(503.4f, 164.3f)
                lineTo(587.0f, 74.9f)
                curveTo(601.6f, 59.4f, 614.0f, 43.5f, 630.3f, 29.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEDB1B)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(666.0f, 55.0f)
                curveTo(674.3f, 65.2f, 689.2f, 74.9f, 699.6f, 83.3f)
                curveTo(744.2f, 119.6f, 788.7f, 155.8f, 833.5f, 191.9f)
                lineTo(1239.5f, 523.5f)
                curveTo(1232.1f, 535.6f, 1220.8f, 551.2f, 1212.7f, 563.2f)
                curveTo(1201.0f, 580.9f, 1188.6f, 598.3f, 1176.9f, 616.1f)
                curveTo(1175.4f, 618.4f, 1174.0f, 620.7f, 1172.3f, 622.8f)
                curveTo(1100.7f, 726.8f, 1029.7f, 831.2f, 959.3f, 935.9f)
                lineTo(903.0f, 1019.0f)
                curveTo(891.5f, 1035.6f, 878.5f, 1052.1f, 868.6f, 1069.7f)
                curveTo(849.3f, 1054.6f, 829.0f, 1041.3f, 809.1f, 1026.9f)
                lineTo(653.4f, 915.6f)
                lineTo(202.6f, 593.6f)
                lineTo(507.6f, 238.4f)
                lineTo(601.4f, 129.6f)
                curveTo(622.4f, 105.5f, 645.8f, 79.6f, 666.0f, 55.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(785.1f, 644.5f)
                curveTo(786.2f, 630.7f, 786.3f, 612.5f, 784.6f, 598.8f)
                curveTo(782.5f, 587.9f, 776.0f, 578.6f, 777.1f, 567.2f)
                curveTo(778.2f, 555.6f, 794.1f, 550.0f, 804.1f, 551.3f)
                curveTo(816.9f, 552.9f, 824.3f, 571.3f, 831.5f, 581.1f)
                curveTo(817.1f, 606.3f, 812.7f, 609.7f, 809.2f, 638.0f)
                curveTo(823.9f, 633.4f, 839.6f, 628.3f, 854.3f, 624.2f)
                curveTo(874.0f, 618.6f, 885.7f, 616.4f, 904.4f, 607.9f)
                curveTo(893.7f, 617.6f, 883.1f, 626.0f, 872.9f, 636.5f)
                curveTo(863.7f, 645.9f, 859.0f, 650.6f, 852.7f, 662.1f)
                curveTo(863.0f, 711.4f, 826.3f, 680.6f, 807.2f, 698.9f)
                curveTo(802.1f, 703.9f, 803.8f, 726.6f, 804.2f, 734.7f)
                curveTo(813.4f, 734.9f, 822.6f, 735.2f, 831.8f, 734.6f)
                curveTo(843.9f, 733.8f, 856.5f, 731.6f, 868.6f, 731.4f)
                curveTo(853.1f, 724.3f, 835.9f, 719.9f, 822.5f, 713.6f)
                curveTo(843.0f, 717.5f, 863.6f, 719.9f, 884.3f, 722.5f)
                curveTo(898.8f, 724.4f, 916.3f, 724.9f, 930.4f, 728.3f)
                curveTo(934.5f, 733.1f, 940.9f, 740.4f, 943.6f, 745.8f)
                curveTo(942.9f, 754.1f, 938.7f, 783.3f, 929.6f, 781.6f)
                curveTo(907.9f, 777.6f, 882.6f, 766.5f, 860.1f, 764.8f)
                curveTo(847.7f, 763.9f, 834.8f, 767.5f, 822.5f, 767.6f)
                curveTo(816.0f, 767.7f, 810.4f, 766.3f, 804.2f, 765.6f)
                curveTo(803.9f, 777.2f, 803.5f, 788.1f, 804.1f, 799.7f)
                curveTo(804.4f, 816.2f, 806.0f, 838.3f, 810.0f, 854.2f)
                curveTo(810.0f, 866.6f, 800.2f, 869.6f, 790.2f, 864.9f)
                curveTo(779.4f, 859.9f, 777.0f, 852.7f, 773.0f, 842.4f)
                curveTo(758.9f, 837.3f, 739.6f, 837.5f, 724.5f, 834.9f)
                curveTo(711.2f, 832.6f, 699.6f, 828.9f, 686.1f, 828.2f)
                curveTo(702.4f, 810.9f, 721.4f, 806.8f, 743.8f, 800.9f)
                lineTo(744.0f, 798.1f)
                lineTo(745.5f, 797.3f)
                lineTo(748.8f, 798.8f)
                lineTo(748.3f, 799.0f)
                curveTo(755.7f, 802.2f, 766.5f, 807.7f, 774.3f, 805.4f)
                curveTo(776.8f, 800.9f, 776.4f, 783.4f, 775.3f, 778.3f)
                curveTo(769.4f, 774.4f, 748.9f, 784.5f, 740.7f, 782.2f)
                curveTo(729.6f, 782.5f, 706.8f, 791.5f, 695.6f, 794.7f)
                curveTo(678.1f, 799.7f, 665.0f, 810.1f, 653.0f, 823.4f)
                curveTo(649.1f, 822.4f, 644.4f, 821.8f, 641.3f, 819.3f)
                curveTo(632.6f, 812.4f, 629.1f, 797.0f, 627.8f, 786.4f)
                curveTo(627.2f, 781.2f, 626.4f, 771.7f, 630.3f, 767.5f)
                curveTo(643.4f, 752.9f, 760.2f, 738.4f, 784.1f, 736.9f)
                curveTo(784.0f, 725.4f, 784.0f, 713.9f, 784.3f, 702.4f)
                curveTo(777.8f, 703.9f, 771.8f, 704.7f, 765.3f, 706.7f)
                curveTo(754.3f, 710.3f, 744.2f, 714.2f, 732.9f, 716.9f)
                curveTo(725.8f, 707.5f, 724.4f, 702.9f, 723.1f, 691.7f)
                curveTo(717.2f, 701.1f, 712.2f, 711.2f, 707.1f, 721.1f)
                curveTo(697.2f, 721.5f, 685.7f, 720.6f, 675.4f, 720.9f)
                curveTo(657.1f, 721.4f, 618.3f, 754.4f, 603.2f, 748.1f)
                curveTo(596.7f, 734.6f, 653.6f, 688.2f, 662.4f, 673.5f)
                curveTo(677.7f, 648.1f, 683.4f, 631.4f, 689.0f, 603.0f)
                curveTo(696.8f, 595.7f, 719.4f, 579.2f, 729.7f, 579.4f)
                curveTo(744.6f, 579.8f, 777.3f, 588.3f, 778.1f, 607.1f)
                curveTo(778.2f, 610.5f, 777.4f, 613.9f, 775.6f, 616.8f)
                curveTo(773.2f, 621.0f, 747.7f, 646.5f, 742.2f, 652.5f)
                curveTo(752.2f, 649.7f, 774.2f, 646.2f, 785.1f, 644.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEAE20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(740.7f, 782.2f)
                curveTo(752.4f, 778.3f, 765.8f, 776.1f, 778.1f, 774.7f)
                curveTo(777.8f, 798.8f, 778.8f, 806.5f, 769.6f, 829.0f)
                curveTo(751.0f, 829.7f, 731.9f, 828.9f, 713.3f, 828.9f)
                curveTo(719.5f, 821.3f, 726.1f, 812.4f, 734.7f, 807.6f)
                curveTo(738.2f, 805.6f, 741.8f, 804.7f, 745.6f, 802.6f)
                lineTo(743.8f, 800.9f)
                lineTo(744.0f, 798.1f)
                lineTo(745.5f, 797.3f)
                lineTo(748.8f, 798.8f)
                lineTo(748.3f, 799.0f)
                curveTo(755.7f, 802.2f, 766.5f, 807.7f, 774.3f, 805.4f)
                curveTo(776.8f, 800.9f, 776.4f, 783.4f, 775.3f, 778.3f)
                curveTo(769.4f, 774.4f, 748.9f, 784.5f, 740.7f, 782.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD5AD03)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(849.7f, 739.1f)
                curveTo(852.3f, 738.5f, 851.0f, 738.4f, 853.6f, 739.4f)
                curveTo(855.0f, 742.8f, 854.7f, 746.3f, 852.6f, 749.3f)
                curveTo(843.9f, 751.4f, 825.6f, 748.8f, 812.7f, 750.3f)
                curveTo(809.8f, 750.2f, 808.2f, 749.6f, 807.2f, 746.8f)
                curveTo(813.5f, 741.5f, 832.9f, 749.7f, 849.7f, 739.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEAE20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(831.5f, 581.1f)
                curveTo(839.2f, 584.3f, 848.8f, 589.6f, 857.1f, 589.8f)
                curveTo(878.1f, 590.7f, 899.5f, 586.0f, 920.3f, 585.1f)
                curveTo(953.0f, 583.7f, 985.0f, 580.8f, 1017.5f, 578.2f)
                lineTo(1140.5f, 569.1f)
                curveTo(1160.2f, 567.6f, 1178.9f, 569.2f, 1196.9f, 561.2f)
                curveTo(1202.0f, 559.0f, 1207.8f, 560.6f, 1212.7f, 563.2f)
                curveTo(1201.0f, 580.9f, 1188.6f, 598.3f, 1176.9f, 616.1f)
                curveTo(1175.4f, 618.4f, 1174.0f, 620.7f, 1172.3f, 622.8f)
                curveTo(1161.8f, 618.4f, 1128.9f, 623.9f, 1116.3f, 624.6f)
                curveTo(1098.7f, 625.6f, 1079.8f, 625.7f, 1062.2f, 627.0f)
                lineTo(956.6f, 634.6f)
                curveTo(941.7f, 635.6f, 882.4f, 642.7f, 872.9f, 636.5f)
                curveTo(883.1f, 626.0f, 893.7f, 617.6f, 904.4f, 607.9f)
                curveTo(885.7f, 616.4f, 874.0f, 618.6f, 854.3f, 624.2f)
                curveTo(839.6f, 628.3f, 823.9f, 633.4f, 809.2f, 638.0f)
                curveTo(812.7f, 609.7f, 817.1f, 606.3f, 831.5f, 581.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEAE20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(804.1f, 799.7f)
                curveTo(824.4f, 807.2f, 835.7f, 817.7f, 854.0f, 827.9f)
                curveTo(875.6f, 840.0f, 902.6f, 851.7f, 925.9f, 859.5f)
                curveTo(926.1f, 878.3f, 926.2f, 897.1f, 926.1f, 916.0f)
                lineTo(846.0f, 916.3f)
                curveTo(845.9f, 903.4f, 846.6f, 863.2f, 844.6f, 852.6f)
                curveTo(837.1f, 849.7f, 833.5f, 848.8f, 825.6f, 847.0f)
                curveTo(820.8f, 850.0f, 812.5f, 852.5f, 810.0f, 854.2f)
                curveTo(806.0f, 838.3f, 804.4f, 816.2f, 804.1f, 799.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(692.1f, 251.1f)
                curveTo(701.0f, 223.3f, 717.7f, 219.9f, 744.2f, 218.6f)
                curveTo(758.5f, 226.9f, 765.5f, 238.4f, 771.2f, 253.3f)
                curveTo(764.1f, 260.9f, 727.6f, 290.3f, 730.7f, 297.0f)
                curveTo(744.5f, 296.7f, 829.5f, 273.7f, 832.6f, 274.4f)
                curveTo(831.5f, 282.2f, 804.1f, 295.8f, 803.6f, 307.1f)
                curveTo(803.5f, 311.5f, 805.8f, 313.4f, 808.7f, 316.7f)
                lineTo(808.1f, 318.4f)
                curveTo(806.0f, 318.8f, 804.8f, 319.2f, 802.8f, 319.9f)
                curveTo(799.8f, 326.4f, 797.9f, 340.8f, 796.7f, 348.2f)
                curveTo(780.9f, 356.5f, 772.3f, 358.9f, 754.5f, 359.1f)
                curveTo(765.1f, 375.6f, 778.4f, 389.0f, 791.8f, 403.2f)
                curveTo(791.8f, 397.4f, 791.1f, 387.7f, 794.6f, 383.2f)
                curveTo(802.3f, 382.5f, 801.1f, 398.6f, 804.2f, 406.4f)
                curveTo(810.6f, 423.0f, 818.9f, 428.3f, 831.7f, 439.0f)
                curveTo(837.0f, 435.0f, 836.4f, 434.5f, 837.1f, 428.7f)
                lineTo(838.0f, 429.3f)
                curveTo(841.2f, 423.9f, 838.9f, 416.7f, 843.0f, 413.0f)
                lineTo(845.9f, 414.0f)
                lineTo(848.9f, 410.6f)
                curveTo(853.8f, 432.9f, 851.9f, 447.1f, 854.5f, 468.3f)
                curveTo(855.4f, 478.3f, 854.7f, 485.4f, 856.9f, 495.9f)
                curveTo(868.2f, 510.1f, 875.7f, 510.8f, 881.3f, 529.8f)
                curveTo(880.0f, 531.7f, 869.7f, 545.0f, 868.2f, 544.6f)
                curveTo(827.4f, 534.7f, 780.8f, 526.4f, 739.3f, 536.5f)
                curveTo(729.0f, 539.0f, 717.4f, 548.8f, 707.3f, 553.0f)
                lineTo(706.4f, 553.4f)
                curveTo(694.6f, 543.3f, 689.5f, 520.6f, 687.2f, 505.6f)
                curveTo(692.1f, 499.1f, 696.8f, 493.0f, 701.2f, 486.3f)
                curveTo(690.8f, 487.7f, 685.7f, 489.2f, 676.2f, 492.9f)
                curveTo(670.4f, 485.5f, 647.9f, 459.8f, 635.1f, 462.1f)
                curveTo(630.7f, 462.8f, 633.1f, 468.6f, 631.3f, 472.3f)
                curveTo(627.6f, 473.0f, 623.9f, 468.7f, 617.8f, 467.6f)
                curveTo(617.3f, 467.9f, 616.7f, 468.2f, 616.1f, 468.6f)
                curveTo(616.1f, 479.3f, 618.6f, 501.2f, 618.1f, 511.5f)
                curveTo(617.5f, 526.7f, 613.7f, 541.7f, 607.1f, 555.4f)
                curveTo(602.2f, 555.8f, 594.0f, 556.8f, 589.7f, 554.2f)
                curveTo(577.7f, 547.0f, 557.7f, 512.0f, 561.7f, 498.4f)
                curveTo(565.9f, 483.9f, 572.6f, 468.0f, 576.5f, 452.5f)
                curveTo(578.9f, 442.9f, 580.4f, 415.5f, 584.0f, 409.1f)
                curveTo(599.0f, 401.6f, 606.0f, 421.7f, 610.8f, 431.7f)
                lineTo(619.9f, 424.0f)
                curveTo(617.5f, 417.7f, 613.8f, 409.3f, 613.6f, 402.8f)
                lineTo(614.7f, 402.0f)
                curveTo(619.8f, 405.0f, 626.0f, 414.0f, 629.9f, 419.0f)
                curveTo(636.9f, 409.8f, 643.1f, 400.1f, 648.5f, 389.8f)
                curveTo(628.3f, 370.6f, 621.3f, 363.2f, 613.8f, 335.4f)
                curveTo(607.5f, 344.1f, 598.3f, 356.0f, 593.7f, 365.4f)
                curveTo(566.4f, 421.4f, 539.7f, 481.2f, 522.2f, 540.8f)
                curveTo(517.0f, 540.7f, 510.9f, 540.2f, 505.6f, 539.9f)
                curveTo(491.4f, 528.1f, 489.5f, 513.9f, 480.5f, 507.8f)
                curveTo(480.6f, 505.5f, 484.4f, 500.8f, 485.9f, 498.6f)
                curveTo(477.2f, 496.7f, 464.6f, 497.4f, 459.1f, 489.5f)
                curveTo(455.7f, 479.9f, 479.6f, 447.7f, 484.0f, 437.0f)
                curveTo(486.0f, 431.9f, 493.6f, 423.0f, 495.9f, 417.5f)
                curveTo(502.0f, 402.9f, 504.5f, 387.8f, 514.2f, 374.7f)
                curveTo(523.2f, 361.6f, 531.0f, 347.8f, 538.9f, 334.0f)
                curveTo(554.6f, 306.8f, 562.9f, 271.0f, 591.7f, 254.8f)
                curveTo(609.5f, 270.0f, 633.0f, 279.2f, 640.6f, 304.4f)
                curveTo(641.2f, 306.2f, 639.7f, 310.3f, 640.1f, 313.4f)
                curveTo(644.0f, 314.9f, 649.2f, 312.7f, 653.1f, 313.0f)
                curveTo(692.0f, 315.8f, 691.6f, 293.0f, 699.0f, 261.6f)
                curveTo(696.8f, 258.6f, 694.2f, 254.3f, 692.1f, 251.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEAE20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(837.1f, 428.7f)
                lineTo(838.0f, 429.3f)
                curveTo(838.2f, 438.1f, 840.9f, 445.5f, 841.1f, 454.3f)
                curveTo(839.7f, 473.4f, 840.1f, 480.1f, 834.1f, 498.3f)
                curveTo(795.0f, 497.9f, 751.1f, 493.8f, 711.9f, 498.0f)
                curveTo(715.0f, 492.4f, 716.7f, 486.8f, 718.8f, 480.8f)
                curveTo(732.2f, 471.8f, 728.4f, 476.5f, 736.5f, 476.0f)
                curveTo(745.7f, 475.5f, 784.7f, 447.9f, 789.3f, 442.4f)
                curveTo(794.9f, 455.8f, 808.5f, 474.9f, 825.5f, 468.8f)
                curveTo(829.0f, 467.6f, 831.8f, 464.9f, 833.2f, 461.5f)
                curveTo(835.6f, 455.6f, 834.1f, 444.7f, 831.7f, 439.0f)
                curveTo(837.0f, 435.0f, 836.4f, 434.5f, 837.1f, 428.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF523000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(838.0f, 429.3f)
                curveTo(841.2f, 423.9f, 838.9f, 416.7f, 843.0f, 413.0f)
                lineTo(845.9f, 414.0f)
                curveTo(846.8f, 424.4f, 847.6f, 430.9f, 844.7f, 441.4f)
                curveTo(843.4f, 446.2f, 841.6f, 449.1f, 841.1f, 454.3f)
                curveTo(840.9f, 445.5f, 838.2f, 438.1f, 838.0f, 429.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEDB1B)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(723.4f, 366.3f)
                curveTo(728.4f, 366.5f, 731.8f, 368.8f, 735.1f, 372.4f)
                curveTo(745.6f, 383.9f, 754.6f, 395.2f, 766.3f, 405.7f)
                curveTo(754.3f, 406.3f, 742.2f, 406.7f, 730.2f, 407.0f)
                curveTo(729.8f, 403.2f, 729.1f, 399.1f, 728.5f, 395.3f)
                curveTo(719.8f, 390.5f, 698.4f, 382.9f, 694.4f, 397.3f)
                curveTo(695.0f, 403.7f, 695.5f, 405.1f, 697.8f, 411.1f)
                curveTo(684.0f, 415.0f, 670.0f, 415.9f, 655.5f, 420.6f)
                curveTo(668.1f, 390.1f, 689.9f, 370.1f, 723.4f, 366.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEDB1B)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(755.9f, 415.5f)
                curveTo(760.0f, 415.4f, 764.4f, 415.6f, 768.6f, 415.6f)
                curveTo(771.3f, 420.5f, 779.3f, 430.2f, 783.1f, 435.1f)
                curveTo(777.6f, 441.7f, 742.1f, 474.3f, 735.4f, 473.9f)
                curveTo(733.1f, 471.7f, 733.4f, 470.9f, 732.4f, 467.6f)
                curveTo(727.7f, 466.7f, 722.1f, 466.8f, 717.3f, 466.7f)
                lineTo(724.6f, 455.1f)
                curveTo(739.5f, 452.1f, 733.4f, 446.9f, 748.7f, 438.0f)
                curveTo(740.4f, 437.1f, 733.0f, 437.0f, 724.8f, 436.9f)
                curveTo(728.3f, 428.7f, 729.5f, 425.0f, 730.3f, 416.1f)
                curveTo(738.7f, 416.1f, 747.5f, 415.7f, 755.9f, 415.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD5AD03)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(543.0f, 374.6f)
                curveTo(544.1f, 375.2f, 545.2f, 376.3f, 544.6f, 377.6f)
                curveTo(539.2f, 388.2f, 532.8f, 400.1f, 526.8f, 410.3f)
                curveTo(514.7f, 430.5f, 499.0f, 479.6f, 481.1f, 492.2f)
                curveTo(479.2f, 490.2f, 479.8f, 491.3f, 479.4f, 488.5f)
                curveTo(481.3f, 482.8f, 495.3f, 457.2f, 498.9f, 450.7f)
                curveTo(509.4f, 431.7f, 528.2f, 388.6f, 543.0f, 374.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD5AD03)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(695.7f, 435.5f)
                lineTo(698.4f, 435.5f)
                curveTo(701.8f, 437.4f, 702.4f, 438.5f, 701.4f, 442.0f)
                curveTo(696.8f, 446.1f, 689.0f, 447.6f, 682.9f, 449.2f)
                curveTo(678.6f, 448.9f, 677.9f, 449.4f, 674.7f, 447.2f)
                lineTo(674.4f, 445.4f)
                curveTo(677.9f, 438.5f, 688.8f, 436.1f, 695.7f, 435.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD5AD03)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(693.6f, 462.0f)
                curveTo(697.3f, 461.7f, 697.8f, 461.4f, 700.0f, 463.9f)
                curveTo(700.7f, 471.9f, 695.9f, 472.4f, 689.9f, 473.2f)
                curveTo(686.9f, 473.2f, 686.0f, 473.3f, 683.1f, 472.2f)
                lineTo(682.6f, 470.6f)
                curveTo(684.6f, 467.2f, 690.2f, 464.2f, 693.6f, 462.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEAE20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(836.5f, 374.1f)
                curveTo(837.6f, 373.6f, 839.0f, 372.8f, 840.7f, 371.9f)
                curveTo(853.5f, 372.7f, 865.1f, 372.3f, 878.1f, 371.6f)
                curveTo(921.5f, 369.3f, 965.6f, 363.0f, 1009.0f, 363.0f)
                curveTo(1010.3f, 363.0f, 1010.9f, 364.5f, 1011.6f, 365.5f)
                curveTo(1012.0f, 370.2f, 1011.9f, 373.4f, 1008.8f, 377.3f)
                curveTo(1001.0f, 382.6f, 924.7f, 385.5f, 909.0f, 388.6f)
                curveTo(910.1f, 404.7f, 911.0f, 425.7f, 910.6f, 441.8f)
                curveTo(895.9f, 450.1f, 871.5f, 456.8f, 855.7f, 464.9f)
                curveTo(855.2f, 466.2f, 854.8f, 467.4f, 854.5f, 468.3f)
                curveTo(851.9f, 447.1f, 853.8f, 432.9f, 848.9f, 410.6f)
                lineTo(845.9f, 414.0f)
                lineTo(843.0f, 413.0f)
                curveTo(838.9f, 416.7f, 841.2f, 423.9f, 838.0f, 429.3f)
                lineTo(837.1f, 428.7f)
                curveTo(836.8f, 418.2f, 831.7f, 393.5f, 829.1f, 383.2f)
                curveTo(832.5f, 382.1f, 836.0f, 381.4f, 838.8f, 379.2f)
                lineTo(836.5f, 374.1f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF2B2100), 1.0f to Color(0xFF422500), start =
                    Offset(826.4f,391.6f), end = Offset(848.0f,410.9f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(838.8f, 379.2f)
                curveTo(841.4f, 385.5f, 848.7f, 403.9f, 848.9f, 410.6f)
                lineTo(845.9f, 414.0f)
                lineTo(843.0f, 413.0f)
                curveTo(838.9f, 416.7f, 841.2f, 423.9f, 838.0f, 429.3f)
                lineTo(837.1f, 428.7f)
                curveTo(836.8f, 418.2f, 831.7f, 393.5f, 829.1f, 383.2f)
                curveTo(832.5f, 382.1f, 836.0f, 381.4f, 838.8f, 379.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(809.7f, 329.0f)
                curveTo(821.7f, 344.4f, 828.3f, 356.7f, 836.5f, 374.1f)
                lineTo(838.8f, 379.2f)
                curveTo(836.0f, 381.4f, 832.5f, 382.1f, 829.1f, 383.2f)
                curveTo(823.0f, 363.8f, 816.1f, 347.5f, 809.7f, 329.0f)
                close()
            }
        }
        .build()
        return _standardOreNoBekoColorful!!
    }

private var _standardOreNoBekoColorful: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = StandardSenderAvatar.StandardOreNoBekoColorful, contentDescription = "")
    }
}
