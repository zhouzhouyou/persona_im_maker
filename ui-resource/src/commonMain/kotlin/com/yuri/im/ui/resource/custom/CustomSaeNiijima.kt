package com.yuri.im.ui.resource.custom

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
import androidx.compose.ui.unit.dp
import com.yuri.im.ui.resource.BuildInCustomSenderAvatar
import androidx.compose.ui.tooling.preview.Preview

public val BuildInCustomSenderAvatar.CustomSaeNiijima: ImageVector
    get() {
        if (_customSaeNiijima != null) {
            return _customSaeNiijima!!
        }
        _customSaeNiijima = Builder(name = "CustomSaeNiijima", defaultWidth = 600.0.dp,
                defaultHeight = 536.0.dp, viewportWidth = 2048.0f, viewportHeight = 1830.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.5f, 1830.0f)
                curveTo(190.1f, 1706.2f, 220.4f, 1600.0f, 247.3f, 1480.0f)
                lineTo(262.1f, 1412.2f)
                curveTo(265.1f, 1398.7f, 274.2f, 1358.6f, 273.6f, 1345.8f)
                curveTo(271.1f, 1295.7f, 266.8f, 1240.9f, 252.7f, 1192.7f)
                curveTo(249.0f, 1179.7f, 240.6f, 1160.7f, 235.7f, 1148.3f)
                curveTo(228.6f, 1129.7f, 221.8f, 1111.1f, 215.3f, 1092.3f)
                curveTo(174.2f, 971.1f, 141.1f, 830.8f, 148.6f, 701.4f)
                curveTo(149.5f, 684.8f, 159.3f, 636.3f, 163.3f, 617.4f)
                curveTo(175.3f, 560.8f, 190.9f, 494.5f, 221.5f, 445.0f)
                curveTo(228.4f, 433.8f, 239.3f, 427.8f, 242.2f, 423.3f)
                curveTo(253.7f, 405.7f, 255.3f, 372.6f, 272.9f, 358.3f)
                curveTo(284.2f, 348.8f, 302.8f, 344.0f, 312.6f, 332.9f)
                curveTo(322.1f, 321.8f, 328.8f, 308.1f, 337.0f, 296.1f)
                curveTo(380.8f, 231.5f, 444.9f, 184.2f, 517.0f, 155.8f)
                curveTo(565.5f, 136.6f, 607.9f, 117.0f, 660.2f, 112.2f)
                curveTo(666.0f, 111.7f, 678.7f, 105.0f, 685.1f, 103.9f)
                curveTo(730.6f, 89.7f, 777.4f, 89.2f, 824.6f, 90.2f)
                curveTo(833.2f, 90.4f, 844.0f, 87.6f, 853.0f, 87.1f)
                curveTo(932.9f, 82.4f, 1011.9f, 114.3f, 1079.8f, 153.6f)
                curveTo(1170.8f, 206.2f, 1250.7f, 287.8f, 1297.8f, 381.9f)
                curveTo(1316.7f, 419.9f, 1332.5f, 468.2f, 1346.8f, 508.6f)
                curveTo(1369.0f, 571.0f, 1389.3f, 634.1f, 1407.7f, 697.7f)
                curveTo(1425.2f, 759.0f, 1442.9f, 824.3f, 1446.0f, 888.0f)
                curveTo(1467.8f, 914.1f, 1507.5f, 960.1f, 1534.8f, 977.7f)
                curveTo(1508.5f, 972.8f, 1485.2f, 974.3f, 1458.0f, 966.6f)
                curveTo(1474.6f, 1007.2f, 1498.5f, 1063.3f, 1524.7f, 1098.5f)
                curveTo(1543.9f, 1124.3f, 1592.7f, 1160.1f, 1622.5f, 1171.9f)
                curveTo(1639.3f, 1178.6f, 1648.9f, 1179.8f, 1664.5f, 1184.6f)
                curveTo(1636.5f, 1185.7f, 1615.2f, 1187.5f, 1588.7f, 1176.1f)
                curveTo(1599.4f, 1188.1f, 1610.6f, 1200.4f, 1620.9f, 1212.6f)
                curveTo(1628.8f, 1221.9f, 1635.9f, 1231.9f, 1643.9f, 1241.2f)
                curveTo(1603.2f, 1246.9f, 1579.1f, 1238.8f, 1544.8f, 1214.4f)
                curveTo(1578.1f, 1268.3f, 1607.9f, 1324.2f, 1634.0f, 1381.8f)
                curveTo(1647.2f, 1410.8f, 1658.5f, 1440.3f, 1671.7f, 1469.3f)
                curveTo(1698.9f, 1528.6f, 1737.1f, 1602.5f, 1748.6f, 1666.5f)
                curveTo(1758.7f, 1671.8f, 1769.4f, 1676.8f, 1778.2f, 1684.2f)
                curveTo(1802.4f, 1704.6f, 1881.1f, 1800.7f, 1897.8f, 1830.0f)
                lineTo(180.5f, 1830.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(723.7f, 438.7f)
                curveTo(725.6f, 449.5f, 702.6f, 480.4f, 694.5f, 488.3f)
                curveTo(713.9f, 477.4f, 725.4f, 476.1f, 744.2f, 462.4f)
                curveTo(737.8f, 475.3f, 730.3f, 488.8f, 720.9f, 499.7f)
                curveTo(725.0f, 497.7f, 745.2f, 487.4f, 748.0f, 487.8f)
                lineTo(749.2f, 491.6f)
                lineTo(750.6f, 492.3f)
                curveTo(763.6f, 486.8f, 782.2f, 481.5f, 796.1f, 477.2f)
                curveTo(781.7f, 485.1f, 774.9f, 487.8f, 769.3f, 503.6f)
                curveTo(784.9f, 500.2f, 815.2f, 489.6f, 830.5f, 483.5f)
                curveTo(813.0f, 475.0f, 810.5f, 475.4f, 790.4f, 475.7f)
                curveTo(799.0f, 471.2f, 807.3f, 466.6f, 817.4f, 466.4f)
                curveTo(843.3f, 466.0f, 871.1f, 477.6f, 890.2f, 494.7f)
                curveTo(904.5f, 507.4f, 918.0f, 530.9f, 927.3f, 548.1f)
                curveTo(936.4f, 564.8f, 954.8f, 595.1f, 960.6f, 611.9f)
                curveTo(972.8f, 647.2f, 978.5f, 693.8f, 984.4f, 730.9f)
                curveTo(986.3f, 742.7f, 989.1f, 762.5f, 989.8f, 774.1f)
                curveTo(990.6f, 787.1f, 988.8f, 802.5f, 989.6f, 816.6f)
                curveTo(993.3f, 800.4f, 997.1f, 770.8f, 998.7f, 753.8f)
                curveTo(999.4f, 745.8f, 997.2f, 721.0f, 996.6f, 711.6f)
                curveTo(995.2f, 689.6f, 993.6f, 667.6f, 991.9f, 645.6f)
                curveTo(1001.0f, 666.2f, 1009.2f, 687.2f, 1016.4f, 708.6f)
                curveTo(1020.9f, 722.3f, 1024.3f, 736.5f, 1028.6f, 750.2f)
                curveTo(1041.1f, 790.1f, 1060.0f, 837.7f, 1086.0f, 870.7f)
                curveTo(1076.3f, 877.7f, 1065.5f, 884.0f, 1055.6f, 890.9f)
                curveTo(1041.9f, 900.4f, 1029.3f, 911.1f, 1016.0f, 921.2f)
                curveTo(1002.3f, 931.7f, 994.9f, 945.8f, 987.3f, 960.8f)
                curveTo(993.0f, 954.6f, 998.5f, 947.3f, 1004.3f, 940.8f)
                curveTo(1000.8f, 949.7f, 980.7f, 990.7f, 974.7f, 996.9f)
                curveTo(974.0f, 1049.6f, 975.9f, 1105.3f, 982.2f, 1157.6f)
                curveTo(984.0f, 1174.6f, 989.7f, 1191.5f, 992.2f, 1208.3f)
                curveTo(996.3f, 1235.5f, 1000.8f, 1263.1f, 1003.9f, 1290.4f)
                curveTo(1006.2f, 1311.1f, 992.8f, 1319.3f, 980.3f, 1333.1f)
                curveTo(982.5f, 1342.7f, 982.6f, 1347.1f, 982.8f, 1357.0f)
                curveTo(989.5f, 1350.7f, 996.1f, 1339.2f, 1001.4f, 1335.4f)
                curveTo(1019.1f, 1322.8f, 1036.6f, 1314.4f, 1052.6f, 1299.0f)
                curveTo(1046.7f, 1286.0f, 1041.8f, 1265.2f, 1034.9f, 1250.0f)
                curveTo(1009.8f, 1194.5f, 985.9f, 1146.9f, 984.9f, 1084.8f)
                curveTo(984.8f, 1075.5f, 982.4f, 1060.1f, 983.5f, 1051.0f)
                curveTo(986.1f, 1028.8f, 1011.7f, 1011.1f, 1026.1f, 996.2f)
                curveTo(1032.8f, 989.2f, 1040.0f, 981.3f, 1047.1f, 974.8f)
                curveTo(1049.5f, 972.6f, 1053.7f, 972.0f, 1057.1f, 972.4f)
                curveTo(1063.8f, 978.9f, 1049.8f, 995.7f, 1044.6f, 1000.7f)
                lineTo(1043.7f, 1001.6f)
                lineTo(1044.0f, 1003.0f)
                curveTo(1045.5f, 1003.6f, 1049.4f, 1005.3f, 1050.6f, 1005.1f)
                curveTo(1056.6f, 1004.1f, 1069.8f, 990.0f, 1074.3f, 985.6f)
                curveTo(1066.0f, 1002.7f, 1035.3f, 1030.4f, 1033.8f, 1038.4f)
                lineTo(1035.0f, 1039.7f)
                curveTo(1046.7f, 1041.5f, 1043.7f, 1031.9f, 1054.0f, 1031.8f)
                curveTo(1067.0f, 1038.0f, 1068.1f, 1031.0f, 1074.3f, 1020.0f)
                curveTo(1082.9f, 1036.2f, 1086.4f, 1038.7f, 1102.8f, 1046.9f)
                curveTo(1121.7f, 1044.2f, 1135.5f, 1037.7f, 1155.1f, 1039.7f)
                curveTo(1161.7f, 1044.5f, 1168.0f, 1051.3f, 1175.1f, 1056.6f)
                curveTo(1173.2f, 1048.9f, 1171.7f, 1044.2f, 1167.7f, 1037.5f)
                lineTo(1177.5f, 1027.8f)
                curveTo(1187.9f, 1034.1f, 1198.6f, 1044.6f, 1208.4f, 1052.2f)
                curveTo(1218.3f, 1059.8f, 1227.8f, 1066.1f, 1238.2f, 1072.9f)
                curveTo(1238.1f, 1103.4f, 1238.2f, 1133.8f, 1238.5f, 1164.2f)
                curveTo(1238.7f, 1187.7f, 1239.4f, 1209.2f, 1236.5f, 1232.7f)
                curveTo(1225.3f, 1323.6f, 1173.0f, 1386.5f, 1123.1f, 1459.7f)
                curveTo(1092.9f, 1501.5f, 1051.2f, 1585.2f, 1003.6f, 1608.9f)
                curveTo(984.3f, 1618.6f, 910.6f, 1591.2f, 889.8f, 1581.8f)
                curveTo(872.2f, 1575.5f, 852.1f, 1564.6f, 834.5f, 1559.1f)
                curveTo(776.5f, 1540.9f, 727.1f, 1509.6f, 680.4f, 1471.1f)
                curveTo(670.3f, 1462.9f, 657.9f, 1455.0f, 647.2f, 1446.4f)
                curveTo(624.7f, 1428.2f, 604.2f, 1407.6f, 586.0f, 1385.0f)
                curveTo(560.0f, 1353.3f, 537.7f, 1318.7f, 519.7f, 1281.8f)
                curveTo(517.6f, 1277.6f, 506.6f, 1253.9f, 504.0f, 1252.7f)
                curveTo(502.0f, 1254.7f, 501.4f, 1255.2f, 499.1f, 1256.8f)
                curveTo(491.9f, 1256.8f, 482.2f, 1253.4f, 475.3f, 1251.1f)
                curveTo(471.8f, 1244.6f, 468.6f, 1238.3f, 459.9f, 1241.6f)
                curveTo(454.6f, 1248.7f, 459.6f, 1252.0f, 464.5f, 1257.3f)
                curveTo(471.5f, 1290.9f, 474.8f, 1328.3f, 478.4f, 1362.5f)
                curveTo(475.7f, 1367.7f, 471.4f, 1374.3f, 468.3f, 1379.4f)
                lineTo(449.3f, 1357.2f)
                curveTo(450.7f, 1329.1f, 452.1f, 1301.1f, 452.2f, 1273.0f)
                curveTo(452.4f, 1253.6f, 445.1f, 1254.1f, 428.4f, 1254.6f)
                curveTo(416.7f, 1242.6f, 404.1f, 1234.0f, 392.2f, 1220.3f)
                curveTo(349.1f, 1170.3f, 317.3f, 1105.3f, 303.5f, 1040.9f)
                curveTo(298.3f, 1016.8f, 288.6f, 975.6f, 309.7f, 957.6f)
                curveTo(319.8f, 949.0f, 337.2f, 953.4f, 349.8f, 954.5f)
                curveTo(378.8f, 975.9f, 422.8f, 1029.5f, 438.3f, 1062.0f)
                curveTo(453.8f, 1094.5f, 466.5f, 1129.1f, 484.5f, 1161.5f)
                curveTo(477.4f, 1137.7f, 472.4f, 1108.4f, 466.8f, 1083.9f)
                lineTo(435.9f, 951.6f)
                curveTo(434.8f, 958.0f, 436.2f, 966.3f, 430.3f, 968.4f)
                lineTo(428.6f, 967.2f)
                curveTo(425.2f, 958.6f, 437.2f, 885.1f, 439.1f, 870.9f)
                curveTo(428.1f, 896.3f, 424.4f, 926.8f, 410.6f, 950.6f)
                curveTo(413.3f, 921.5f, 429.6f, 876.2f, 436.9f, 847.6f)
                curveTo(434.5f, 842.3f, 432.0f, 837.1f, 429.5f, 831.9f)
                curveTo(435.4f, 815.8f, 444.0f, 801.5f, 452.3f, 786.6f)
                curveTo(446.6f, 790.7f, 442.1f, 795.4f, 435.1f, 795.4f)
                curveTo(426.4f, 789.4f, 458.8f, 745.8f, 464.4f, 738.8f)
                curveTo(462.7f, 725.7f, 459.7f, 697.4f, 456.6f, 685.4f)
                curveTo(459.2f, 680.8f, 462.0f, 676.3f, 464.9f, 671.9f)
                curveTo(480.9f, 647.4f, 495.6f, 622.1f, 511.8f, 597.8f)
                curveTo(499.6f, 603.3f, 487.0f, 608.0f, 474.5f, 612.7f)
                curveTo(495.9f, 596.0f, 504.9f, 582.6f, 520.9f, 561.3f)
                curveTo(527.7f, 552.7f, 540.4f, 546.2f, 547.6f, 538.9f)
                curveTo(575.3f, 511.1f, 596.0f, 497.0f, 634.2f, 520.7f)
                curveTo(642.9f, 515.2f, 652.7f, 508.4f, 658.5f, 499.8f)
                curveTo(663.3f, 502.4f, 667.4f, 505.6f, 672.5f, 504.3f)
                curveTo(675.3f, 501.2f, 677.2f, 491.7f, 678.6f, 487.1f)
                curveTo(694.8f, 480.8f, 695.9f, 471.6f, 705.3f, 458.3f)
                curveTo(711.0f, 450.2f, 716.2f, 445.1f, 723.7f, 438.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(676.3f, 972.9f)
                curveTo(695.7f, 970.6f, 735.7f, 970.1f, 754.5f, 973.5f)
                curveTo(763.0f, 975.0f, 796.1f, 988.5f, 805.2f, 992.9f)
                curveTo(797.1f, 996.4f, 793.0f, 998.5f, 785.8f, 1003.8f)
                curveTo(793.3f, 1008.8f, 804.2f, 1015.6f, 810.1f, 1022.0f)
                curveTo(794.6f, 1019.2f, 780.3f, 1016.8f, 764.5f, 1016.3f)
                curveTo(802.1f, 1037.0f, 811.7f, 1029.8f, 851.6f, 1038.7f)
                curveTo(832.8f, 1042.6f, 817.5f, 1044.0f, 798.2f, 1042.0f)
                curveTo(802.8f, 1044.9f, 807.4f, 1047.8f, 811.6f, 1051.1f)
                curveTo(799.9f, 1049.2f, 792.7f, 1046.8f, 781.4f, 1043.5f)
                curveTo(787.4f, 1047.8f, 793.1f, 1051.9f, 798.8f, 1056.6f)
                curveTo(787.3f, 1062.1f, 785.2f, 1063.1f, 772.9f, 1065.9f)
                lineTo(776.8f, 1054.1f)
                curveTo(769.4f, 1048.1f, 763.6f, 1042.9f, 756.7f, 1036.5f)
                curveTo(737.2f, 1036.3f, 730.9f, 1034.8f, 711.7f, 1032.2f)
                curveTo(712.7f, 1041.3f, 712.6f, 1055.3f, 708.7f, 1063.7f)
                lineTo(706.9f, 1065.1f)
                curveTo(703.8f, 1064.0f, 700.6f, 1058.8f, 698.6f, 1059.7f)
                curveTo(695.6f, 1061.0f, 690.6f, 1063.8f, 688.8f, 1058.4f)
                curveTo(684.3f, 1044.8f, 678.3f, 1044.3f, 663.8f, 1044.2f)
                curveTo(656.5f, 1048.9f, 659.0f, 1066.8f, 647.1f, 1067.8f)
                curveTo(641.5f, 1065.8f, 634.7f, 1057.6f, 632.2f, 1052.2f)
                curveTo(624.0f, 1052.3f, 612.7f, 1052.0f, 604.8f, 1052.6f)
                curveTo(604.5f, 1077.4f, 622.4f, 1098.8f, 648.3f, 1099.0f)
                curveTo(663.8f, 1099.1f, 669.8f, 1093.6f, 680.1f, 1083.3f)
                curveTo(682.5f, 1080.8f, 685.0f, 1078.2f, 687.4f, 1075.7f)
                curveTo(693.4f, 1077.5f, 700.3f, 1079.9f, 706.3f, 1081.0f)
                curveTo(701.4f, 1085.0f, 691.6f, 1094.3f, 686.6f, 1095.9f)
                curveTo(677.1f, 1098.8f, 670.1f, 1097.9f, 660.2f, 1102.5f)
                curveTo(688.4f, 1102.0f, 701.4f, 1098.3f, 728.0f, 1094.6f)
                curveTo(707.4f, 1103.1f, 691.3f, 1107.4f, 668.7f, 1109.9f)
                curveTo(669.4f, 1113.4f, 669.7f, 1113.4f, 671.7f, 1116.2f)
                lineTo(671.2f, 1117.6f)
                curveTo(667.5f, 1120.4f, 652.2f, 1118.1f, 645.4f, 1118.0f)
                curveTo(644.5f, 1122.8f, 643.5f, 1132.1f, 640.9f, 1135.5f)
                curveTo(637.6f, 1133.5f, 636.2f, 1120.5f, 627.6f, 1113.1f)
                curveTo(611.5f, 1113.8f, 610.7f, 1112.6f, 596.8f, 1103.7f)
                lineTo(595.9f, 1105.0f)
                curveTo(593.5f, 1108.8f, 590.9f, 1113.6f, 586.4f, 1114.5f)
                lineTo(584.6f, 1112.9f)
                curveTo(582.9f, 1108.1f, 583.6f, 1102.4f, 583.8f, 1097.2f)
                curveTo(573.2f, 1087.5f, 567.0f, 1078.5f, 558.3f, 1067.2f)
                curveTo(557.4f, 1066.1f, 552.3f, 1064.6f, 550.3f, 1063.0f)
                lineTo(550.1f, 1059.1f)
                curveTo(546.6f, 1054.7f, 530.3f, 1059.8f, 525.6f, 1050.6f)
                lineTo(526.3f, 1049.2f)
                curveTo(530.2f, 1048.6f, 534.0f, 1049.4f, 538.0f, 1050.0f)
                curveTo(542.6f, 1046.8f, 545.4f, 1044.8f, 549.7f, 1041.2f)
                curveTo(549.8f, 1039.7f, 549.7f, 1039.8f, 549.4f, 1038.3f)
                lineTo(545.8f, 1038.3f)
                curveTo(538.1f, 1022.5f, 522.5f, 1030.7f, 514.1f, 1027.2f)
                lineTo(513.4f, 1025.4f)
                curveTo(518.9f, 1023.1f, 532.6f, 1022.5f, 539.7f, 1021.0f)
                curveTo(550.0f, 1018.7f, 561.2f, 1014.2f, 571.3f, 1012.3f)
                curveTo(599.7f, 1007.0f, 627.4f, 1006.6f, 656.1f, 1006.1f)
                curveTo(677.2f, 1005.7f, 698.7f, 1000.8f, 720.1f, 1002.4f)
                curveTo(722.6f, 1002.6f, 724.3f, 1002.3f, 726.0f, 1000.5f)
                curveTo(722.5f, 989.4f, 697.0f, 989.2f, 687.5f, 988.3f)
                lineTo(687.7f, 984.7f)
                curveTo(695.3f, 984.7f, 703.4f, 984.8f, 711.0f, 984.6f)
                curveTo(699.7f, 980.1f, 688.1f, 976.2f, 676.3f, 972.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFDEDFE2)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(627.2f, 1111.4f)
                curveTo(638.8f, 1110.3f, 656.7f, 1110.3f, 668.7f, 1109.9f)
                curveTo(669.4f, 1113.4f, 669.7f, 1113.4f, 671.7f, 1116.2f)
                curveTo(659.7f, 1112.9f, 643.1f, 1115.1f, 627.2f, 1111.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFDEDFE2)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(545.8f, 1038.3f)
                curveTo(548.8f, 1036.5f, 553.6f, 1033.1f, 556.8f, 1033.7f)
                curveTo(555.3f, 1037.5f, 552.5f, 1038.4f, 549.7f, 1041.2f)
                curveTo(549.8f, 1039.7f, 549.7f, 1039.8f, 549.4f, 1038.3f)
                lineTo(545.8f, 1038.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(576.1f, 1035.5f)
                curveTo(576.2f, 1035.5f, 576.3f, 1035.6f, 576.4f, 1035.7f)
                curveTo(577.8f, 1037.0f, 595.8f, 1074.0f, 595.9f, 1076.1f)
                curveTo(595.9f, 1078.8f, 595.4f, 1079.8f, 593.5f, 1081.6f)
                lineTo(590.0f, 1081.5f)
                curveTo(581.0f, 1068.2f, 574.2f, 1065.3f, 567.9f, 1049.8f)
                curveTo(570.7f, 1045.1f, 573.4f, 1040.2f, 576.1f, 1035.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(337.7f, 964.8f)
                curveTo(362.1f, 969.6f, 376.0f, 1006.2f, 386.5f, 1025.4f)
                curveTo(392.8f, 1038.2f, 402.0f, 1052.6f, 405.4f, 1066.3f)
                curveTo(411.8f, 1092.0f, 414.8f, 1114.9f, 423.5f, 1140.2f)
                curveTo(441.4f, 1150.2f, 455.6f, 1147.0f, 457.9f, 1171.9f)
                curveTo(459.3f, 1186.8f, 461.0f, 1200.8f, 460.7f, 1216.0f)
                curveTo(456.3f, 1222.8f, 451.8f, 1227.4f, 443.4f, 1229.0f)
                curveTo(441.6f, 1229.5f, 435.3f, 1228.4f, 434.1f, 1227.0f)
                curveTo(423.6f, 1214.6f, 411.8f, 1202.9f, 401.6f, 1190.3f)
                curveTo(395.9f, 1183.1f, 397.2f, 1180.8f, 389.4f, 1175.2f)
                curveTo(375.3f, 1164.7f, 369.4f, 1160.1f, 360.2f, 1145.2f)
                curveTo(360.4f, 1139.9f, 359.9f, 1138.0f, 363.3f, 1134.4f)
                curveTo(376.4f, 1132.3f, 386.0f, 1160.9f, 400.2f, 1157.2f)
                curveTo(414.2f, 1146.1f, 392.4f, 1124.8f, 387.3f, 1112.1f)
                curveTo(388.4f, 1107.6f, 389.3f, 1104.0f, 391.2f, 1099.8f)
                curveTo(395.5f, 1090.4f, 405.6f, 1082.7f, 402.7f, 1071.8f)
                curveTo(394.0f, 1039.3f, 364.3f, 1006.0f, 337.9f, 987.3f)
                curveTo(326.3f, 991.8f, 318.5f, 998.1f, 309.7f, 1006.6f)
                curveTo(318.1f, 991.2f, 322.3f, 971.8f, 337.7f, 964.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1025.2f, 1381.1f)
                lineTo(1026.3f, 1382.1f)
                curveTo(1025.9f, 1386.9f, 1018.0f, 1392.4f, 1014.4f, 1395.4f)
                curveTo(1024.8f, 1395.3f, 1046.8f, 1395.3f, 1057.0f, 1397.6f)
                lineTo(1057.6f, 1399.1f)
                curveTo(1055.2f, 1403.4f, 1049.3f, 1405.4f, 1045.8f, 1410.2f)
                curveTo(1039.3f, 1419.1f, 1036.5f, 1431.3f, 1028.8f, 1439.2f)
                curveTo(1002.9f, 1465.6f, 980.3f, 1461.7f, 949.0f, 1464.0f)
                curveTo(954.2f, 1457.6f, 958.4f, 1450.3f, 961.3f, 1445.5f)
                curveTo(962.3f, 1443.9f, 979.4f, 1440.2f, 983.4f, 1436.4f)
                curveTo(982.6f, 1435.1f, 982.3f, 1434.3f, 980.4f, 1434.1f)
                curveTo(960.9f, 1432.1f, 944.8f, 1428.3f, 926.6f, 1437.1f)
                curveTo(920.5f, 1440.6f, 907.2f, 1448.4f, 902.3f, 1452.6f)
                lineTo(902.9f, 1455.3f)
                lineTo(902.1f, 1456.4f)
                curveTo(897.3f, 1456.1f, 854.9f, 1445.3f, 852.4f, 1443.2f)
                curveTo(854.8f, 1437.8f, 864.8f, 1435.1f, 870.1f, 1434.4f)
                curveTo(900.9f, 1430.7f, 922.9f, 1414.8f, 949.6f, 1402.9f)
                curveTo(951.9f, 1401.8f, 990.0f, 1401.5f, 998.1f, 1400.3f)
                curveTo(991.3f, 1397.5f, 979.7f, 1394.5f, 972.3f, 1392.2f)
                curveTo(995.8f, 1387.3f, 1000.9f, 1395.0f, 1025.2f, 1381.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFDEDFE2)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1013.7f, 1428.4f)
                lineTo(1015.5f, 1429.7f)
                lineTo(1015.5f, 1432.6f)
                curveTo(1013.3f, 1436.9f, 1012.6f, 1437.2f, 1008.9f, 1440.4f)
                curveTo(1007.3f, 1439.9f, 1008.0f, 1440.4f, 1007.1f, 1438.6f)
                curveTo(1009.2f, 1434.4f, 1011.0f, 1432.1f, 1013.7f, 1428.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(544.6f, 930.3f)
                curveTo(556.8f, 929.6f, 582.1f, 933.6f, 595.9f, 934.8f)
                curveTo(637.3f, 938.1f, 678.7f, 941.1f, 720.1f, 943.9f)
                curveTo(749.3f, 945.7f, 805.9f, 937.4f, 832.9f, 945.3f)
                curveTo(842.5f, 948.2f, 881.1f, 980.5f, 889.6f, 989.1f)
                curveTo(881.4f, 984.4f, 871.7f, 978.0f, 863.6f, 972.8f)
                curveTo(837.1f, 958.4f, 785.0f, 963.7f, 754.2f, 961.4f)
                curveTo(688.4f, 956.9f, 623.4f, 942.6f, 557.7f, 937.7f)
                curveTo(546.6f, 936.9f, 520.5f, 941.4f, 508.9f, 943.3f)
                curveTo(520.5f, 938.3f, 532.4f, 934.0f, 544.6f, 930.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1012.6f, 1466.3f)
                curveTo(1031.3f, 1465.1f, 1027.3f, 1475.3f, 1025.2f, 1489.1f)
                curveTo(1016.3f, 1497.6f, 1001.8f, 1507.2f, 991.5f, 1515.1f)
                curveTo(986.5f, 1509.9f, 981.6f, 1504.1f, 976.8f, 1498.7f)
                curveTo(969.7f, 1491.9f, 957.3f, 1496.8f, 947.0f, 1497.1f)
                curveTo(966.1f, 1486.0f, 991.9f, 1472.3f, 1012.6f, 1466.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(943.9f, 1312.1f)
                curveTo(948.5f, 1312.6f, 957.0f, 1313.0f, 956.9f, 1319.1f)
                curveTo(950.6f, 1324.2f, 949.3f, 1318.8f, 941.9f, 1325.3f)
                curveTo(939.4f, 1327.5f, 937.4f, 1327.4f, 934.2f, 1326.7f)
                curveTo(932.0f, 1324.3f, 932.6f, 1325.7f, 932.5f, 1322.4f)
                curveTo(935.1f, 1316.5f, 938.2f, 1315.2f, 943.9f, 1312.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(633.1f, 984.8f)
                curveTo(630.7f, 985.1f, 626.5f, 984.8f, 623.9f, 984.7f)
                lineTo(624.2f, 983.8f)
                curveTo(633.9f, 981.8f, 651.6f, 980.9f, 661.3f, 982.9f)
                curveTo(666.5f, 983.3f, 683.5f, 983.7f, 687.7f, 984.7f)
                lineTo(687.5f, 988.3f)
                curveTo(669.2f, 987.2f, 651.4f, 985.6f, 633.1f, 984.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF888689)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(633.1f, 984.8f)
                curveTo(630.7f, 985.1f, 626.5f, 984.8f, 623.9f, 984.7f)
                lineTo(624.2f, 983.8f)
                curveTo(633.9f, 981.8f, 651.6f, 980.9f, 661.3f, 982.9f)
                curveTo(655.5f, 983.0f, 637.3f, 982.6f, 632.7f, 983.8f)
                lineTo(633.1f, 984.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(562.2f, 1080.5f)
                curveTo(565.2f, 1082.4f, 565.7f, 1082.8f, 566.5f, 1085.5f)
                curveTo(565.1f, 1088.6f, 561.0f, 1090.3f, 557.9f, 1092.1f)
                lineTo(556.3f, 1093.2f)
                lineTo(555.6f, 1092.2f)
                curveTo(557.3f, 1087.6f, 559.5f, 1084.6f, 562.2f, 1080.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(578.6f, 1405.6f)
                curveTo(589.5f, 1408.9f, 607.0f, 1432.0f, 617.3f, 1440.0f)
                curveTo(682.0f, 1490.3f, 750.1f, 1536.9f, 813.5f, 1589.0f)
                curveTo(823.7f, 1597.4f, 833.6f, 1611.8f, 844.7f, 1618.6f)
                curveTo(858.5f, 1627.1f, 879.8f, 1637.3f, 894.0f, 1644.5f)
                curveTo(923.6f, 1659.7f, 953.3f, 1674.7f, 983.3f, 1689.2f)
                lineTo(974.3f, 1694.8f)
                curveTo(956.5f, 1704.6f, 958.0f, 1703.6f, 937.5f, 1700.0f)
                curveTo(844.1f, 1683.7f, 744.9f, 1685.7f, 660.9f, 1635.8f)
                curveTo(626.5f, 1615.3f, 632.1f, 1604.1f, 624.8f, 1567.5f)
                curveTo(620.8f, 1548.4f, 616.3f, 1529.5f, 611.4f, 1510.6f)
                curveTo(605.8f, 1490.1f, 599.7f, 1469.7f, 592.9f, 1449.5f)
                curveTo(588.3f, 1436.0f, 581.8f, 1419.0f, 578.6f, 1405.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(269.3f, 615.9f)
                lineTo(270.5f, 616.6f)
                curveTo(270.2f, 635.5f, 268.6f, 655.0f, 268.6f, 673.7f)
                lineTo(239.8f, 711.9f)
                curveTo(240.8f, 716.9f, 241.6f, 728.2f, 242.3f, 733.9f)
                curveTo(243.7f, 745.7f, 248.6f, 763.4f, 247.2f, 774.6f)
                curveTo(257.6f, 763.9f, 269.3f, 748.6f, 278.8f, 736.8f)
                curveTo(278.9f, 715.7f, 279.1f, 690.5f, 276.8f, 669.8f)
                curveTo(297.7f, 647.3f, 304.7f, 641.5f, 328.5f, 622.9f)
                curveTo(326.6f, 646.3f, 321.9f, 670.8f, 320.7f, 693.6f)
                curveTo(308.7f, 708.0f, 301.6f, 714.5f, 291.3f, 730.9f)
                curveTo(295.2f, 751.1f, 295.0f, 772.1f, 295.0f, 792.5f)
                curveTo(304.4f, 785.3f, 333.7f, 757.8f, 341.4f, 748.5f)
                curveTo(342.0f, 733.9f, 340.5f, 713.7f, 340.1f, 698.4f)
                curveTo(342.9f, 695.5f, 345.9f, 691.9f, 348.4f, 688.8f)
                curveTo(363.2f, 671.0f, 379.4f, 656.1f, 396.4f, 640.5f)
                curveTo(394.0f, 652.8f, 388.3f, 714.3f, 389.5f, 725.9f)
                curveTo(379.4f, 735.0f, 367.3f, 744.8f, 356.7f, 753.6f)
                curveTo(356.7f, 770.3f, 357.1f, 785.2f, 358.7f, 801.8f)
                lineTo(363.3f, 843.3f)
                curveTo(341.6f, 860.0f, 310.3f, 886.6f, 284.5f, 897.0f)
                curveTo(282.0f, 889.5f, 271.3f, 847.3f, 270.4f, 839.3f)
                curveTo(259.1f, 844.3f, 252.3f, 847.6f, 240.4f, 851.2f)
                curveTo(282.1f, 799.7f, 280.3f, 814.2f, 279.7f, 744.8f)
                curveTo(274.9f, 754.6f, 259.3f, 777.6f, 252.4f, 786.4f)
                curveTo(252.6f, 796.3f, 253.1f, 805.3f, 253.8f, 815.2f)
                curveTo(247.5f, 823.5f, 223.2f, 850.3f, 215.5f, 856.9f)
                curveTo(213.4f, 836.0f, 206.4f, 816.1f, 205.6f, 794.7f)
                curveTo(211.7f, 797.5f, 224.2f, 806.2f, 229.4f, 810.5f)
                lineTo(238.0f, 797.6f)
                curveTo(236.7f, 777.9f, 235.0f, 758.2f, 233.0f, 738.5f)
                curveTo(229.5f, 742.2f, 220.6f, 753.0f, 215.4f, 750.6f)
                curveTo(214.8f, 743.8f, 225.9f, 725.2f, 228.1f, 717.6f)
                curveTo(231.9f, 704.5f, 230.2f, 689.4f, 230.1f, 675.5f)
                curveTo(232.9f, 682.6f, 235.4f, 692.2f, 237.0f, 699.6f)
                curveTo(253.5f, 677.1f, 254.6f, 677.3f, 253.6f, 649.7f)
                curveTo(248.0f, 651.9f, 239.4f, 654.1f, 233.4f, 655.8f)
                curveTo(238.1f, 650.1f, 242.0f, 643.2f, 247.1f, 637.2f)
                curveTo(254.0f, 629.2f, 261.5f, 623.0f, 269.3f, 615.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(340.6f, 768.7f)
                curveTo(344.7f, 773.2f, 341.8f, 821.3f, 338.0f, 828.0f)
                curveTo(329.0f, 843.9f, 312.2f, 862.3f, 299.9f, 876.2f)
                lineTo(299.5f, 876.3f)
                lineTo(298.4f, 875.5f)
                curveTo(302.3f, 808.2f, 289.4f, 819.4f, 340.6f, 768.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(307.7f, 660.9f)
                lineTo(309.4f, 661.5f)
                curveTo(313.1f, 679.6f, 301.9f, 703.5f, 291.9f, 718.0f)
                lineTo(290.5f, 716.3f)
                curveTo(288.1f, 701.7f, 289.4f, 685.7f, 291.4f, 671.1f)
                curveTo(296.8f, 667.2f, 301.9f, 664.3f, 307.7f, 660.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(371.5f, 683.7f)
                curveTo(374.0f, 686.4f, 373.3f, 704.0f, 373.3f, 708.8f)
                curveTo(366.7f, 715.2f, 360.5f, 724.8f, 353.4f, 730.7f)
                curveTo(352.9f, 722.3f, 351.8f, 713.2f, 351.0f, 704.8f)
                curveTo(359.3f, 696.6f, 363.9f, 693.0f, 371.5f, 683.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1142.9f, 985.2f)
                curveTo(1145.9f, 986.8f, 1145.3f, 989.2f, 1149.1f, 992.7f)
                curveTo(1152.1f, 992.8f, 1153.2f, 992.8f, 1156.2f, 993.4f)
                lineTo(1157.0f, 995.0f)
                curveTo(1155.8f, 1002.6f, 1139.6f, 1020.2f, 1133.6f, 1030.1f)
                curveTo(1116.6f, 1034.0f, 1112.7f, 1033.7f, 1097.4f, 1025.0f)
                curveTo(1093.0f, 1022.0f, 1089.8f, 1018.8f, 1086.0f, 1015.2f)
                curveTo(1088.2f, 1008.6f, 1090.1f, 1002.4f, 1095.6f, 997.9f)
                curveTo(1101.9f, 997.4f, 1103.0f, 1004.4f, 1104.8f, 1009.4f)
                curveTo(1117.0f, 1020.3f, 1125.1f, 998.7f, 1126.5f, 989.2f)
                curveTo(1133.4f, 988.0f, 1136.3f, 987.5f, 1142.9f, 985.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1058.3f, 501.6f)
                curveTo(1062.6f, 500.1f, 1067.2f, 500.1f, 1071.3f, 501.8f)
                curveTo(1078.5f, 504.7f, 1083.1f, 511.6f, 1082.9f, 519.3f)
                curveTo(1082.7f, 527.0f, 1077.8f, 533.7f, 1070.6f, 536.3f)
                curveTo(1061.0f, 539.6f, 1050.5f, 534.6f, 1047.2f, 525.0f)
                curveTo(1043.8f, 515.5f, 1048.8f, 505.0f, 1058.3f, 501.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1084.9f, 555.8f)
                curveTo(1091.2f, 553.4f, 1098.3f, 554.6f, 1103.4f, 559.0f)
                curveTo(1108.5f, 563.3f, 1110.8f, 570.1f, 1109.4f, 576.7f)
                curveTo(1108.0f, 583.3f, 1103.2f, 588.5f, 1096.8f, 590.5f)
                curveTo(1089.9f, 592.6f, 1082.4f, 590.5f, 1077.7f, 585.1f)
                curveTo(1072.9f, 579.7f, 1071.8f, 572.0f, 1074.7f, 565.5f)
                curveTo(1076.7f, 561.0f, 1080.4f, 557.5f, 1084.9f, 555.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1145.3f, 554.6f)
                curveTo(1153.2f, 554.4f, 1160.3f, 559.3f, 1163.0f, 566.8f)
                curveTo(1165.7f, 574.2f, 1163.2f, 582.5f, 1157.0f, 587.4f)
                curveTo(1154.1f, 589.7f, 1150.6f, 591.0f, 1146.9f, 591.2f)
                curveTo(1140.4f, 591.6f, 1134.2f, 588.6f, 1130.5f, 583.2f)
                curveTo(1126.9f, 577.8f, 1126.4f, 570.9f, 1129.2f, 565.1f)
                curveTo(1132.1f, 558.8f, 1138.4f, 554.7f, 1145.3f, 554.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1199.0f, 338.0f)
                curveTo(1209.1f, 337.5f, 1217.7f, 345.4f, 1218.1f, 355.5f)
                curveTo(1218.6f, 365.7f, 1210.7f, 374.2f, 1200.5f, 374.6f)
                curveTo(1192.5f, 374.9f, 1185.3f, 370.0f, 1182.6f, 362.5f)
                curveTo(1179.9f, 354.9f, 1182.4f, 346.5f, 1188.7f, 341.7f)
                curveTo(1191.7f, 339.4f, 1195.3f, 338.1f, 1199.0f, 338.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1112.9f, 501.4f)
                curveTo(1117.1f, 500.1f, 1121.7f, 500.2f, 1125.7f, 502.0f)
                curveTo(1129.8f, 503.7f, 1133.2f, 506.9f, 1135.2f, 510.9f)
                curveTo(1137.1f, 515.0f, 1137.5f, 519.7f, 1136.2f, 524.1f)
                curveTo(1134.4f, 530.2f, 1129.6f, 534.8f, 1123.5f, 536.5f)
                curveTo(1113.9f, 539.2f, 1103.9f, 533.7f, 1101.1f, 524.1f)
                curveTo(1098.2f, 514.6f, 1103.5f, 504.5f, 1112.9f, 501.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(923.6f, 230.4f)
                curveTo(929.5f, 228.5f, 935.9f, 229.7f, 940.7f, 233.5f)
                curveTo(945.5f, 237.4f, 948.1f, 243.3f, 947.5f, 249.5f)
                curveTo(947.3f, 252.5f, 946.3f, 255.4f, 944.6f, 257.9f)
                curveTo(942.3f, 261.5f, 938.7f, 264.1f, 934.6f, 265.4f)
                curveTo(928.8f, 267.1f, 922.6f, 265.9f, 917.9f, 262.2f)
                curveTo(912.6f, 258.0f, 910.1f, 251.2f, 911.3f, 244.6f)
                curveTo(912.5f, 237.9f, 917.2f, 232.5f, 923.6f, 230.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(898.2f, 284.3f)
                curveTo(907.8f, 282.0f, 917.6f, 287.8f, 920.1f, 297.4f)
                curveTo(922.7f, 307.0f, 917.0f, 316.9f, 907.5f, 319.6f)
                curveTo(901.1f, 321.5f, 894.2f, 319.7f, 889.5f, 315.0f)
                curveTo(884.8f, 310.4f, 883.0f, 303.5f, 884.8f, 297.1f)
                curveTo(886.6f, 290.7f, 891.7f, 285.8f, 898.2f, 284.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(871.8f, 338.4f)
                curveTo(878.8f, 337.0f, 886.1f, 339.8f, 890.3f, 345.6f)
                curveTo(893.8f, 350.4f, 894.7f, 356.7f, 892.8f, 362.3f)
                curveTo(890.8f, 367.9f, 886.2f, 372.3f, 880.5f, 373.9f)
                curveTo(874.0f, 375.7f, 867.1f, 373.9f, 862.4f, 369.1f)
                curveTo(857.7f, 364.3f, 856.0f, 357.4f, 858.0f, 351.0f)
                curveTo(860.0f, 344.6f, 865.2f, 339.7f, 871.8f, 338.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(952.2f, 284.4f)
                curveTo(961.9f, 282.1f, 971.6f, 287.9f, 974.1f, 297.5f)
                curveTo(976.6f, 307.1f, 971.0f, 316.9f, 961.5f, 319.7f)
                curveTo(957.6f, 320.8f, 953.4f, 320.6f, 949.6f, 319.1f)
                curveTo(945.7f, 317.5f, 942.4f, 314.5f, 940.4f, 310.7f)
                curveTo(938.2f, 306.7f, 937.7f, 302.1f, 938.8f, 297.7f)
                curveTo(940.4f, 291.1f, 945.6f, 286.0f, 952.2f, 284.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(844.2f, 284.3f)
                curveTo(853.8f, 282.1f, 863.4f, 287.9f, 865.9f, 297.4f)
                curveTo(868.4f, 306.9f, 862.9f, 316.7f, 853.5f, 319.5f)
                curveTo(848.7f, 320.9f, 843.6f, 320.3f, 839.3f, 317.8f)
                curveTo(835.0f, 315.4f, 831.9f, 311.3f, 830.7f, 306.5f)
                curveTo(829.5f, 301.8f, 830.2f, 296.9f, 832.6f, 292.8f)
                curveTo(835.2f, 288.5f, 839.4f, 285.4f, 844.2f, 284.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1168.4f, 284.0f)
                curveTo(1175.3f, 284.0f, 1185.1f, 289.4f, 1188.6f, 295.4f)
                curveTo(1190.8f, 299.2f, 1191.2f, 303.7f, 1189.8f, 307.8f)
                curveTo(1187.6f, 314.2f, 1182.8f, 317.1f, 1177.2f, 320.0f)
                curveTo(1167.2f, 320.1f, 1166.3f, 319.5f, 1158.0f, 313.7f)
                curveTo(1151.9f, 299.3f, 1153.0f, 290.0f, 1168.4f, 284.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(793.0f, 287.4f)
                curveTo(808.5f, 285.8f, 808.6f, 288.5f, 813.4f, 302.5f)
                curveTo(809.5f, 312.5f, 807.9f, 316.2f, 797.4f, 320.1f)
                curveTo(781.4f, 320.1f, 769.0f, 306.3f, 779.7f, 291.2f)
                curveTo(782.6f, 287.2f, 788.2f, 287.6f, 793.0f, 287.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1109.0f, 285.8f)
                curveTo(1120.3f, 287.8f, 1141.5f, 289.6f, 1136.3f, 306.4f)
                curveTo(1134.6f, 311.9f, 1133.2f, 314.7f, 1128.4f, 317.8f)
                curveTo(1110.8f, 323.6f, 1104.4f, 317.0f, 1098.9f, 300.9f)
                curveTo(1102.1f, 293.9f, 1104.1f, 291.4f, 1109.0f, 285.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1086.6f, 446.5f)
                curveTo(1088.3f, 446.4f, 1092.4f, 445.8f, 1093.8f, 446.8f)
                curveTo(1101.4f, 452.2f, 1111.4f, 466.8f, 1106.2f, 476.1f)
                curveTo(1104.9f, 478.5f, 1099.8f, 482.1f, 1097.0f, 482.6f)
                curveTo(1095.2f, 482.7f, 1093.5f, 482.7f, 1091.8f, 482.8f)
                curveTo(1083.4f, 482.8f, 1080.5f, 479.1f, 1074.9f, 473.6f)
                lineTo(1072.8f, 463.4f)
                curveTo(1076.1f, 453.7f, 1077.5f, 451.0f, 1086.6f, 446.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(870.0f, 230.1f)
                curveTo(871.7f, 229.9f, 873.3f, 229.8f, 875.0f, 229.7f)
                curveTo(883.0f, 229.6f, 887.2f, 234.1f, 892.4f, 239.3f)
                curveTo(893.2f, 247.5f, 893.7f, 246.9f, 892.7f, 255.7f)
                curveTo(884.8f, 264.7f, 882.8f, 265.0f, 871.5f, 266.1f)
                curveTo(864.7f, 263.7f, 862.6f, 260.8f, 857.7f, 255.7f)
                lineTo(870.8f, 244.0f)
                curveTo(866.2f, 242.5f, 860.8f, 242.4f, 860.5f, 237.0f)
                curveTo(863.0f, 233.5f, 866.2f, 232.2f, 870.0f, 230.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(924.9f, 338.2f)
                curveTo(939.2f, 335.5f, 944.7f, 345.0f, 948.3f, 356.7f)
                curveTo(943.6f, 359.9f, 935.4f, 362.9f, 932.9f, 367.7f)
                curveTo(932.1f, 369.1f, 933.3f, 370.9f, 934.0f, 372.8f)
                curveTo(932.3f, 375.3f, 927.6f, 375.1f, 925.0f, 374.2f)
                curveTo(916.9f, 371.3f, 913.8f, 366.2f, 910.1f, 359.0f)
                lineTo(913.0f, 346.8f)
                curveTo(917.1f, 342.1f, 919.0f, 340.3f, 924.9f, 338.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(819.0f, 337.9f)
                curveTo(823.5f, 337.4f, 828.6f, 339.7f, 832.9f, 341.3f)
                curveTo(835.0f, 343.8f, 837.2f, 347.1f, 839.1f, 349.8f)
                curveTo(839.2f, 356.4f, 840.3f, 361.6f, 836.2f, 366.3f)
                curveTo(832.2f, 368.2f, 828.3f, 367.3f, 823.8f, 366.8f)
                curveTo(819.7f, 366.6f, 810.7f, 366.8f, 807.6f, 365.0f)
                curveTo(797.5f, 359.2f, 804.9f, 348.0f, 809.4f, 341.6f)
                curveTo(812.3f, 340.3f, 815.9f, 339.1f, 819.0f, 337.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(835.6f, 179.4f)
                curveTo(851.2f, 181.6f, 881.1f, 188.6f, 859.3f, 208.5f)
                curveTo(837.5f, 219.5f, 822.5f, 200.5f, 835.6f, 179.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1143.0f, 445.9f)
                curveTo(1154.8f, 448.7f, 1158.2f, 469.2f, 1158.2f, 479.5f)
                curveTo(1153.2f, 481.3f, 1149.0f, 482.2f, 1143.8f, 483.4f)
                curveTo(1143.2f, 483.2f, 1142.6f, 483.0f, 1142.0f, 482.8f)
                curveTo(1136.8f, 481.1f, 1130.8f, 477.4f, 1128.9f, 472.1f)
                curveTo(1123.7f, 457.7f, 1131.6f, 450.8f, 1143.0f, 445.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(978.0f, 446.1f)
                curveTo(993.1f, 445.5f, 998.3f, 451.4f, 1002.7f, 464.7f)
                curveTo(999.5f, 473.4f, 998.4f, 476.8f, 990.8f, 482.2f)
                curveTo(986.3f, 479.7f, 974.5f, 470.4f, 971.1f, 466.4f)
                curveTo(963.0f, 456.9f, 970.9f, 451.7f, 978.0f, 446.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1222.9f, 391.9f)
                curveTo(1232.3f, 391.4f, 1241.9f, 395.0f, 1244.2f, 405.2f)
                curveTo(1246.1f, 413.9f, 1243.6f, 417.3f, 1239.3f, 424.2f)
                curveTo(1235.2f, 416.5f, 1233.7f, 415.0f, 1227.7f, 409.1f)
                curveTo(1224.2f, 413.4f, 1219.3f, 421.6f, 1216.2f, 426.4f)
                curveTo(1203.3f, 411.9f, 1206.1f, 400.4f, 1222.9f, 391.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1143.3f, 337.8f)
                curveTo(1147.4f, 337.4f, 1153.0f, 339.7f, 1157.0f, 341.2f)
                curveTo(1169.3f, 356.0f, 1165.1f, 363.2f, 1152.1f, 374.6f)
                curveTo(1146.2f, 368.6f, 1135.6f, 358.8f, 1132.1f, 351.3f)
                curveTo(1128.2f, 342.8f, 1137.1f, 340.0f, 1143.3f, 337.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1168.0f, 609.2f)
                curveTo(1171.1f, 609.0f, 1175.8f, 608.4f, 1178.2f, 610.3f)
                curveTo(1184.7f, 615.4f, 1185.4f, 632.3f, 1186.5f, 640.4f)
                curveTo(1180.7f, 643.5f, 1178.9f, 644.1f, 1172.6f, 646.0f)
                curveTo(1166.9f, 640.3f, 1157.8f, 628.5f, 1153.9f, 621.7f)
                curveTo(1158.8f, 614.4f, 1160.7f, 613.3f, 1168.0f, 609.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(947.8f, 393.6f)
                curveTo(952.2f, 396.4f, 958.6f, 407.1f, 961.5f, 411.6f)
                curveTo(966.0f, 412.4f, 971.1f, 413.6f, 975.7f, 414.6f)
                curveTo(972.1f, 420.2f, 970.3f, 423.1f, 964.8f, 426.9f)
                curveTo(948.1f, 432.9f, 941.6f, 424.7f, 937.5f, 409.7f)
                curveTo(940.1f, 400.9f, 941.4f, 399.8f, 947.8f, 393.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1089.6f, 663.2f)
                curveTo(1093.2f, 663.3f, 1096.9f, 663.8f, 1100.5f, 664.1f)
                curveTo(1111.6f, 674.6f, 1114.3f, 686.6f, 1101.4f, 697.2f)
                curveTo(1098.9f, 698.1f, 1096.3f, 698.9f, 1093.7f, 699.7f)
                curveTo(1089.8f, 692.8f, 1082.3f, 674.8f, 1081.4f, 667.0f)
                curveTo(1083.1f, 664.6f, 1086.6f, 664.1f, 1089.6f, 663.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1048.9f, 400.5f)
                curveTo(1065.4f, 401.8f, 1069.8f, 408.7f, 1080.9f, 420.4f)
                lineTo(1074.2f, 425.8f)
                curveTo(1058.2f, 435.9f, 1040.4f, 420.1f, 1048.9f, 400.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(979.0f, 338.1f)
                curveTo(979.6f, 338.0f, 980.2f, 337.9f, 980.9f, 337.8f)
                curveTo(986.2f, 337.3f, 991.5f, 339.0f, 995.5f, 342.6f)
                curveTo(1001.5f, 348.1f, 1005.5f, 358.9f, 999.1f, 365.6f)
                curveTo(995.5f, 366.2f, 996.0f, 365.6f, 991.9f, 363.6f)
                curveTo(983.0f, 358.8f, 974.2f, 353.9f, 965.4f, 349.0f)
                curveTo(970.2f, 343.5f, 972.4f, 341.1f, 979.0f, 338.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(740.6f, 289.4f)
                lineTo(755.1f, 289.3f)
                curveTo(758.1f, 297.1f, 760.7f, 308.1f, 753.7f, 314.8f)
                curveTo(750.4f, 315.4f, 751.7f, 315.5f, 748.1f, 313.2f)
                curveTo(742.6f, 309.5f, 737.3f, 305.8f, 731.9f, 302.1f)
                curveTo(727.9f, 299.2f, 725.9f, 297.9f, 725.1f, 293.5f)
                lineTo(726.7f, 291.4f)
                curveTo(730.8f, 289.3f, 735.8f, 289.6f, 740.6f, 289.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(764.8f, 336.9f)
                curveTo(775.2f, 339.3f, 781.1f, 342.6f, 785.8f, 352.4f)
                curveTo(788.9f, 358.8f, 786.5f, 362.7f, 780.2f, 364.1f)
                curveTo(772.5f, 363.5f, 764.5f, 363.1f, 756.7f, 362.6f)
                curveTo(759.4f, 356.1f, 762.3f, 344.4f, 764.8f, 336.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1056.0f, 609.4f)
                curveTo(1066.0f, 608.8f, 1068.1f, 608.7f, 1077.1f, 613.0f)
                curveTo(1082.3f, 621.2f, 1086.7f, 630.3f, 1078.6f, 638.7f)
                lineTo(1071.4f, 645.3f)
                curveTo(1066.5f, 635.1f, 1061.0f, 620.5f, 1056.0f, 609.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1005.9f, 283.7f)
                curveTo(1007.8f, 284.3f, 1008.6f, 284.1f, 1009.0f, 285.6f)
                curveTo(1010.5f, 291.6f, 1013.4f, 314.7f, 1011.7f, 319.4f)
                curveTo(1008.6f, 320.4f, 1005.9f, 319.6f, 1002.6f, 319.1f)
                curveTo(991.7f, 312.4f, 992.7f, 306.4f, 992.6f, 294.8f)
                curveTo(997.5f, 288.8f, 999.4f, 287.2f, 1005.9f, 283.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1117.9f, 608.1f)
                curveTo(1118.8f, 609.3f, 1119.5f, 639.7f, 1119.7f, 643.9f)
                lineTo(1118.4f, 645.3f)
                curveTo(1114.4f, 645.6f, 1111.9f, 644.0f, 1108.2f, 642.4f)
                curveTo(1103.2f, 638.6f, 1101.6f, 633.6f, 1099.0f, 628.0f)
                curveTo(1102.7f, 615.8f, 1105.7f, 611.9f, 1117.9f, 608.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1116.0f, 717.2f)
                curveTo(1119.4f, 717.2f, 1120.7f, 716.6f, 1122.9f, 718.1f)
                curveTo(1124.0f, 725.8f, 1124.7f, 748.7f, 1119.2f, 754.0f)
                curveTo(1115.7f, 754.1f, 1117.3f, 754.5f, 1114.3f, 752.6f)
                curveTo(1109.2f, 743.6f, 1106.1f, 733.8f, 1103.2f, 723.9f)
                curveTo(1108.3f, 720.5f, 1110.0f, 719.1f, 1116.0f, 717.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(807.0f, 185.3f)
                curveTo(809.8f, 185.2f, 808.5f, 184.8f, 810.8f, 186.7f)
                curveTo(814.5f, 195.6f, 813.3f, 208.6f, 800.4f, 207.5f)
                curveTo(797.8f, 207.2f, 791.1f, 203.3f, 788.5f, 201.9f)
                lineTo(773.7f, 194.1f)
                curveTo(783.3f, 190.2f, 796.7f, 187.5f, 807.0f, 185.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(969.2f, 236.5f)
                curveTo(973.2f, 237.7f, 993.2f, 256.5f, 996.6f, 260.4f)
                curveTo(995.0f, 263.1f, 994.6f, 262.6f, 991.3f, 264.4f)
                curveTo(990.5f, 264.6f, 989.7f, 264.9f, 988.8f, 265.1f)
                curveTo(971.1f, 269.6f, 958.6f, 253.1f, 969.2f, 236.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1002.0f, 501.2f)
                lineTo(1015.7f, 500.9f)
                curveTo(1022.8f, 504.4f, 1023.5f, 505.8f, 1028.0f, 512.0f)
                curveTo(1028.1f, 520.0f, 1030.1f, 525.1f, 1023.8f, 530.8f)
                curveTo(1022.1f, 532.9f, 1022.3f, 533.1f, 1019.8f, 534.0f)
                curveTo(1016.7f, 530.5f, 1004.7f, 506.7f, 1002.0f, 501.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1031.8f, 554.7f)
                curveTo(1040.1f, 554.6f, 1042.2f, 555.1f, 1049.6f, 558.1f)
                curveTo(1053.4f, 564.1f, 1054.4f, 566.4f, 1056.8f, 573.0f)
                curveTo(1055.5f, 577.3f, 1055.2f, 578.8f, 1053.1f, 582.6f)
                curveTo(1051.2f, 585.0f, 1050.2f, 586.9f, 1047.3f, 587.8f)
                curveTo(1042.4f, 576.7f, 1037.6f, 565.4f, 1031.8f, 554.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1269.3f, 395.7f)
                curveTo(1272.5f, 399.7f, 1283.6f, 422.7f, 1284.9f, 427.8f)
                curveTo(1282.7f, 429.6f, 1282.4f, 429.1f, 1279.0f, 429.4f)
                curveTo(1259.9f, 422.6f, 1258.3f, 410.7f, 1269.3f, 395.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1239.1f, 344.1f)
                curveTo(1245.4f, 346.3f, 1259.4f, 369.1f, 1257.8f, 374.6f)
                curveTo(1237.0f, 373.8f, 1232.3f, 362.6f, 1239.1f, 344.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(899.7f, 392.0f)
                curveTo(901.9f, 391.8f, 904.0f, 392.0f, 906.0f, 392.5f)
                curveTo(916.7f, 395.0f, 926.0f, 411.3f, 918.1f, 415.4f)
                lineTo(915.5f, 414.2f)
                lineTo(887.8f, 396.9f)
                curveTo(891.9f, 394.9f, 895.5f, 393.6f, 899.7f, 392.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1022.1f, 454.9f)
                curveTo(1027.2f, 459.7f, 1041.1f, 475.7f, 1044.5f, 481.2f)
                lineTo(1043.7f, 482.6f)
                curveTo(1033.4f, 483.0f, 1032.7f, 482.7f, 1023.8f, 477.7f)
                curveTo(1018.5f, 467.9f, 1016.9f, 465.4f, 1022.1f, 454.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1110.2f, 400.4f)
                curveTo(1113.5f, 402.0f, 1129.5f, 422.7f, 1129.1f, 426.1f)
                curveTo(1120.1f, 430.0f, 1119.3f, 429.5f, 1110.0f, 426.9f)
                curveTo(1109.9f, 418.2f, 1110.1f, 409.2f, 1110.2f, 400.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(884.0f, 194.9f)
                curveTo(889.0f, 195.6f, 913.1f, 201.9f, 916.0f, 206.0f)
                lineTo(913.8f, 208.6f)
                curveTo(899.8f, 216.0f, 887.1f, 210.8f, 884.0f, 194.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1167.2f, 391.7f)
                curveTo(1179.0f, 391.7f, 1180.8f, 392.8f, 1189.1f, 400.9f)
                curveTo(1190.5f, 406.3f, 1191.1f, 410.2f, 1190.6f, 415.8f)
                curveTo(1184.7f, 416.9f, 1170.6f, 396.4f, 1167.2f, 391.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1161.8f, 503.6f)
                lineTo(1163.5f, 505.1f)
                curveTo(1164.4f, 510.7f, 1168.5f, 530.7f, 1165.6f, 535.4f)
                lineTo(1163.3f, 535.1f)
                curveTo(1150.9f, 525.1f, 1152.2f, 514.8f, 1161.8f, 503.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1296.1f, 449.6f)
                curveTo(1298.7f, 452.5f, 1306.4f, 468.3f, 1308.0f, 472.5f)
                lineTo(1307.4f, 473.6f)
                lineTo(1305.4f, 472.9f)
                curveTo(1298.9f, 468.9f, 1293.9f, 465.4f, 1288.1f, 460.3f)
                curveTo(1291.0f, 456.9f, 1293.5f, 453.2f, 1296.1f, 449.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1042.0f, 446.5f)
                curveTo(1054.0f, 450.8f, 1059.0f, 460.6f, 1054.1f, 472.5f)
                lineTo(1053.8f, 473.2f)
                lineTo(1052.3f, 473.4f)
                curveTo(1048.0f, 468.5f, 1044.1f, 453.4f, 1042.0f, 446.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFDEDFE2)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1123.0f, 943.1f)
                curveTo(1123.9f, 943.4f, 1123.3f, 943.1f, 1124.5f, 944.4f)
                curveTo(1121.9f, 949.0f, 1105.9f, 954.0f, 1100.2f, 956.1f)
                lineTo(1098.3f, 953.9f)
                curveTo(1100.5f, 949.8f, 1117.6f, 945.0f, 1123.0f, 943.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFDEDFE2)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1084.2f, 956.3f)
                curveTo(1086.1f, 957.5f, 1090.8f, 961.6f, 1092.8f, 963.2f)
                lineTo(1081.5f, 970.7f)
                curveTo(1079.2f, 972.5f, 1080.4f, 972.2f, 1078.0f, 972.4f)
                curveTo(1078.1f, 968.8f, 1082.6f, 960.6f, 1084.2f, 956.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF5E6062)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1209.3f, 308.9f)
                curveTo(1213.1f, 311.0f, 1216.8f, 314.8f, 1217.6f, 319.1f)
                curveTo(1213.2f, 316.9f, 1210.6f, 313.6f, 1209.3f, 308.9f)
                close()
            }
        }
        .build()
        return _customSaeNiijima!!
    }

private var _customSaeNiijima: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = BuildInCustomSenderAvatar.CustomSaeNiijima, contentDescription = "")
    }
}
