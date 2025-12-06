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

public val BuildInCustomSenderAvatar.CustomMorogan: ImageVector
    get() {
        if (_customMorogan != null) {
            return _customMorogan!!
        }
        _customMorogan = Builder(name = "CustomMorogan", defaultWidth = 709.0.dp, defaultHeight =
                517.0.dp, viewportWidth = 2048.0f, viewportHeight = 1493.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1214.5f, 47.8f)
                curveTo(1219.3f, 45.1f, 1225.2f, 41.7f, 1230.2f, 39.5f)
                curveTo(1280.0f, 121.9f, 1337.7f, 199.7f, 1389.1f, 281.3f)
                curveTo(1412.1f, 318.0f, 1432.7f, 356.5f, 1455.3f, 393.3f)
                curveTo(1462.0f, 404.1f, 1481.1f, 416.3f, 1490.7f, 425.3f)
                curveTo(1521.3f, 454.0f, 1543.4f, 488.4f, 1568.0f, 522.2f)
                curveTo(1575.9f, 533.2f, 1586.5f, 545.7f, 1593.4f, 557.1f)
                curveTo(1651.8f, 654.3f, 1688.8f, 762.9f, 1702.1f, 875.5f)
                curveTo(1705.9f, 910.5f, 1707.2f, 935.6f, 1704.2f, 971.2f)
                curveTo(1703.9f, 984.6f, 1697.3f, 1000.5f, 1695.7f, 1013.1f)
                curveTo(1694.8f, 1029.8f, 1678.3f, 1038.5f, 1674.0f, 1051.4f)
                curveTo(1667.2f, 1071.6f, 1663.2f, 1095.3f, 1653.2f, 1114.5f)
                curveTo(1643.1f, 1134.2f, 1630.9f, 1156.6f, 1619.2f, 1175.4f)
                curveTo(1608.7f, 1192.0f, 1592.7f, 1208.3f, 1580.5f, 1223.8f)
                curveTo(1570.3f, 1235.1f, 1556.0f, 1253.3f, 1545.7f, 1263.3f)
                curveTo(1506.5f, 1301.1f, 1463.6f, 1335.6f, 1416.6f, 1363.3f)
                curveTo(1394.3f, 1376.4f, 1369.8f, 1387.6f, 1347.0f, 1400.2f)
                curveTo(1349.1f, 1403.6f, 1351.1f, 1406.9f, 1353.6f, 1410.1f)
                curveTo(1369.3f, 1409.7f, 1384.4f, 1408.1f, 1399.6f, 1407.6f)
                curveTo(1399.7f, 1418.8f, 1400.1f, 1432.8f, 1399.3f, 1443.8f)
                curveTo(1415.3f, 1442.2f, 1440.0f, 1440.4f, 1455.3f, 1437.8f)
                curveTo(1449.6f, 1446.6f, 1441.5f, 1463.2f, 1436.4f, 1470.1f)
                curveTo(1455.8f, 1474.3f, 1475.6f, 1478.6f, 1494.8f, 1483.4f)
                curveTo(1490.0f, 1486.1f, 1482.9f, 1489.9f, 1478.7f, 1493.0f)
                lineTo(1323.8f, 1493.0f)
                lineTo(1062.4f, 1493.0f)
                lineTo(375.8f, 1493.0f)
                curveTo(360.0f, 1480.9f, 344.5f, 1468.5f, 329.2f, 1455.9f)
                curveTo(319.9f, 1448.3f, 307.2f, 1437.3f, 297.2f, 1431.6f)
                curveTo(348.7f, 1433.8f, 406.6f, 1441.4f, 456.8f, 1431.9f)
                curveTo(470.8f, 1429.3f, 484.7f, 1424.6f, 498.3f, 1420.7f)
                curveTo(520.5f, 1414.5f, 542.6f, 1408.0f, 564.6f, 1401.2f)
                curveTo(578.1f, 1396.9f, 596.4f, 1390.4f, 609.8f, 1387.6f)
                curveTo(578.9f, 1371.4f, 544.2f, 1359.7f, 513.2f, 1343.5f)
                curveTo(504.0f, 1338.7f, 495.9f, 1331.6f, 487.4f, 1326.0f)
                curveTo(454.0f, 1303.8f, 427.1f, 1274.2f, 397.4f, 1247.6f)
                curveTo(390.4f, 1241.3f, 374.2f, 1236.0f, 370.0f, 1228.1f)
                curveTo(339.9f, 1171.6f, 316.3f, 1112.6f, 297.6f, 1051.4f)
                curveTo(292.1f, 1033.3f, 288.5f, 1015.0f, 284.2f, 996.6f)
                curveTo(269.9f, 939.9f, 260.4f, 879.8f, 262.0f, 821.2f)
                curveTo(263.0f, 788.4f, 271.8f, 749.0f, 273.0f, 716.5f)
                lineTo(142.8f, 617.0f)
                curveTo(117.4f, 598.0f, 91.7f, 579.0f, 66.3f, 559.8f)
                curveTo(52.0f, 548.9f, 36.2f, 528.9f, 22.2f, 517.9f)
                curveTo(40.8f, 510.9f, 61.5f, 506.3f, 80.4f, 500.2f)
                curveTo(135.3f, 482.3f, 189.3f, 469.8f, 246.4f, 461.0f)
                curveTo(268.4f, 457.7f, 291.3f, 452.1f, 313.6f, 449.8f)
                curveTo(349.4f, 446.6f, 386.9f, 445.5f, 422.8f, 442.5f)
                curveTo(436.6f, 441.3f, 455.8f, 440.9f, 469.0f, 438.8f)
                curveTo(478.1f, 430.2f, 489.2f, 419.3f, 499.0f, 411.5f)
                curveTo(563.7f, 360.1f, 639.1f, 329.7f, 717.1f, 304.8f)
                curveTo(729.0f, 301.0f, 754.1f, 294.8f, 766.3f, 292.0f)
                curveTo(790.0f, 286.5f, 824.7f, 275.8f, 847.8f, 272.4f)
                curveTo(918.3f, 262.0f, 987.5f, 255.9f, 1058.9f, 259.3f)
                curveTo(1083.8f, 260.5f, 1118.0f, 264.8f, 1143.0f, 268.2f)
                curveTo(1145.9f, 264.8f, 1154.4f, 255.3f, 1155.5f, 251.5f)
                curveTo(1172.2f, 191.1f, 1189.3f, 130.3f, 1210.2f, 71.1f)
                curveTo(1212.7f, 64.2f, 1213.4f, 55.2f, 1214.5f, 47.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1009.8f, 1474.7f)
                curveTo(1032.7f, 1477.7f, 1057.7f, 1475.7f, 1080.4f, 1477.1f)
                curveTo(1156.5f, 1481.9f, 1230.5f, 1473.6f, 1304.2f, 1454.4f)
                curveTo(1320.5f, 1450.2f, 1338.0f, 1448.2f, 1354.4f, 1444.2f)
                curveTo(1346.9f, 1458.2f, 1335.9f, 1486.5f, 1323.8f, 1493.0f)
                lineTo(1062.4f, 1493.0f)
                curveTo(1047.8f, 1487.8f, 1022.8f, 1480.4f, 1009.8f, 1474.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(727.9f, 599.4f)
                curveTo(730.0f, 599.2f, 732.1f, 599.1f, 734.2f, 599.1f)
                curveTo(869.5f, 601.4f, 958.1f, 736.2f, 998.4f, 850.6f)
                curveTo(1029.6f, 938.8f, 1051.8f, 1021.4f, 1046.1f, 1115.8f)
                curveTo(1041.1f, 1197.8f, 993.5f, 1243.1f, 911.4f, 1239.8f)
                curveTo(877.6f, 1237.8f, 818.6f, 1216.5f, 792.9f, 1194.6f)
                curveTo(741.9f, 1151.0f, 696.7f, 1083.7f, 660.9f, 1026.3f)
                curveTo(626.5f, 971.2f, 606.0f, 890.7f, 594.9f, 827.3f)
                curveTo(589.4f, 796.2f, 591.5f, 751.1f, 598.2f, 720.0f)
                curveTo(604.7f, 696.7f, 622.3f, 659.6f, 636.0f, 640.1f)
                curveTo(652.1f, 617.1f, 700.8f, 602.8f, 727.9f, 599.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(753.7f, 702.3f)
                curveTo(861.0f, 695.5f, 950.1f, 864.7f, 966.3f, 952.8f)
                curveTo(977.1f, 1011.8f, 983.3f, 1114.8f, 906.1f, 1129.8f)
                curveTo(876.9f, 1133.4f, 848.5f, 1120.7f, 825.2f, 1103.5f)
                curveTo(752.0f, 1048.0f, 704.1f, 953.3f, 688.9f, 864.1f)
                curveTo(679.4f, 808.5f, 682.9f, 712.9f, 753.7f, 702.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(768.1f, 737.2f)
                curveTo(823.9f, 734.3f, 869.7f, 793.0f, 896.1f, 835.9f)
                curveTo(918.1f, 871.7f, 934.6f, 913.5f, 943.6f, 954.6f)
                curveTo(953.7f, 1000.1f, 959.9f, 1089.1f, 900.1f, 1101.8f)
                curveTo(819.5f, 1107.5f, 751.0f, 978.4f, 732.2f, 913.7f)
                curveTo(718.1f, 865.4f, 698.7f, 752.1f, 768.1f, 737.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(774.6f, 801.2f)
                curveTo(776.1f, 801.1f, 777.5f, 801.0f, 779.0f, 801.0f)
                curveTo(812.7f, 800.5f, 831.4f, 834.1f, 845.9f, 858.9f)
                curveTo(871.3f, 902.3f, 890.7f, 949.3f, 898.5f, 999.2f)
                curveTo(900.5f, 1011.7f, 903.0f, 1023.2f, 903.1f, 1036.0f)
                curveTo(898.2f, 1041.6f, 895.3f, 1043.7f, 889.2f, 1047.6f)
                curveTo(883.5f, 1049.3f, 878.2f, 1050.5f, 872.2f, 1049.4f)
                curveTo(851.5f, 1045.7f, 835.3f, 1024.0f, 824.1f, 1007.7f)
                curveTo(798.0f, 969.6f, 755.2f, 859.9f, 763.9f, 815.7f)
                curveTo(765.3f, 808.6f, 768.9f, 805.0f, 774.6f, 801.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1638.7f, 1079.9f)
                lineTo(1639.5f, 1080.7f)
                curveTo(1638.8f, 1091.9f, 1628.5f, 1117.3f, 1624.2f, 1128.3f)
                curveTo(1605.3f, 1176.7f, 1574.9f, 1212.4f, 1539.4f, 1249.1f)
                curveTo(1505.9f, 1283.5f, 1472.9f, 1313.4f, 1431.2f, 1337.9f)
                curveTo(1398.4f, 1359.9f, 1362.4f, 1375.4f, 1327.3f, 1392.8f)
                curveTo(1281.1f, 1415.7f, 1232.1f, 1424.8f, 1182.1f, 1436.1f)
                curveTo(1160.8f, 1440.9f, 1134.1f, 1448.3f, 1112.8f, 1450.5f)
                curveTo(1065.2f, 1455.4f, 1017.4f, 1452.9f, 969.8f, 1449.5f)
                curveTo(888.9f, 1445.9f, 813.1f, 1434.5f, 743.2f, 1390.7f)
                curveTo(732.1f, 1383.7f, 717.4f, 1377.7f, 705.8f, 1370.8f)
                curveTo(692.3f, 1362.8f, 682.5f, 1350.4f, 666.7f, 1346.8f)
                lineTo(665.5f, 1346.6f)
                curveTo(654.8f, 1344.2f, 641.2f, 1340.8f, 630.5f, 1340.0f)
                curveTo(638.3f, 1334.3f, 644.3f, 1330.3f, 652.6f, 1325.3f)
                lineTo(593.8f, 1305.1f)
                curveTo(599.4f, 1304.3f, 611.4f, 1304.6f, 614.2f, 1299.9f)
                curveTo(613.5f, 1296.3f, 610.2f, 1294.1f, 607.2f, 1291.4f)
                curveTo(615.9f, 1292.6f, 627.5f, 1294.5f, 636.0f, 1296.2f)
                curveTo(662.6f, 1301.5f, 688.5f, 1300.2f, 715.4f, 1301.8f)
                curveTo(738.3f, 1303.1f, 763.0f, 1306.1f, 785.7f, 1306.5f)
                curveTo(912.6f, 1308.8f, 1041.5f, 1293.7f, 1165.7f, 1267.6f)
                curveTo(1193.4f, 1261.8f, 1223.0f, 1256.1f, 1250.5f, 1249.4f)
                curveTo(1271.6f, 1244.3f, 1294.7f, 1236.7f, 1315.9f, 1230.9f)
                curveTo(1371.4f, 1215.7f, 1430.5f, 1197.4f, 1483.4f, 1174.5f)
                curveTo(1540.1f, 1150.0f, 1588.8f, 1115.4f, 1638.7f, 1079.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1504.6f, 1234.8f)
                curveTo(1511.8f, 1245.4f, 1486.1f, 1274.1f, 1478.7f, 1279.9f)
                curveTo(1453.0f, 1300.1f, 1406.8f, 1321.9f, 1374.5f, 1310.8f)
                curveTo(1352.4f, 1355.3f, 1257.3f, 1382.6f, 1215.6f, 1356.2f)
                curveTo(1207.2f, 1350.8f, 1195.9f, 1341.4f, 1187.7f, 1335.0f)
                curveTo(1187.2f, 1333.7f, 1187.4f, 1334.4f, 1188.0f, 1332.6f)
                curveTo(1192.9f, 1330.9f, 1255.3f, 1357.9f, 1274.5f, 1354.3f)
                curveTo(1305.1f, 1348.6f, 1320.1f, 1339.5f, 1343.4f, 1317.3f)
                curveTo(1352.0f, 1309.1f, 1360.1f, 1303.4f, 1366.9f, 1292.9f)
                curveTo(1367.7f, 1291.8f, 1372.8f, 1287.0f, 1373.8f, 1287.1f)
                curveTo(1387.9f, 1289.3f, 1399.9f, 1299.5f, 1415.3f, 1297.1f)
                curveTo(1461.6f, 1290.4f, 1478.4f, 1266.5f, 1504.6f, 1234.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1419.7f, 477.7f)
                curveTo(1425.4f, 477.1f, 1443.1f, 481.9f, 1448.5f, 484.9f)
                curveTo(1498.3f, 514.4f, 1540.5f, 584.0f, 1564.0f, 636.4f)
                curveTo(1594.0f, 708.5f, 1617.1f, 786.7f, 1624.5f, 864.7f)
                curveTo(1628.7f, 908.5f, 1629.2f, 960.4f, 1610.8f, 1000.5f)
                curveTo(1604.8f, 1004.5f, 1601.2f, 1006.5f, 1594.7f, 1009.7f)
                curveTo(1592.7f, 1009.4f, 1586.2f, 1008.4f, 1584.5f, 1007.8f)
                curveTo(1550.8f, 996.7f, 1522.4f, 941.5f, 1505.9f, 913.1f)
                lineTo(1499.7f, 901.9f)
                curveTo(1514.0f, 915.1f, 1524.3f, 922.6f, 1543.0f, 927.8f)
                curveTo(1565.3f, 919.0f, 1577.3f, 906.9f, 1578.6f, 882.1f)
                curveTo(1582.0f, 810.4f, 1560.0f, 737.4f, 1530.0f, 673.0f)
                curveTo(1513.1f, 636.7f, 1497.6f, 601.6f, 1452.3f, 598.4f)
                curveTo(1445.9f, 600.8f, 1442.7f, 602.5f, 1437.9f, 607.6f)
                curveTo(1433.6f, 612.2f, 1430.6f, 617.9f, 1429.0f, 624.0f)
                curveTo(1426.5f, 634.9f, 1429.7f, 685.6f, 1430.3f, 699.0f)
                curveTo(1427.1f, 688.7f, 1423.9f, 671.0f, 1421.2f, 660.0f)
                curveTo(1408.2f, 606.2f, 1401.1f, 555.1f, 1399.9f, 499.8f)
                curveTo(1406.2f, 488.9f, 1409.3f, 484.6f, 1419.7f, 477.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.6f, 532.4f)
                curveTo(184.0f, 531.2f, 208.9f, 533.7f, 217.3f, 534.4f)
                lineTo(290.9f, 541.6f)
                curveTo(332.1f, 545.4f, 373.2f, 549.7f, 414.2f, 554.3f)
                curveTo(429.4f, 556.1f, 452.7f, 558.5f, 467.3f, 561.7f)
                curveTo(475.8f, 563.5f, 499.8f, 579.8f, 509.8f, 585.5f)
                curveTo(484.1f, 603.4f, 458.3f, 622.0f, 432.7f, 640.0f)
                curveTo(405.6f, 659.1f, 356.1f, 654.0f, 325.5f, 648.2f)
                curveTo(336.7f, 641.2f, 351.2f, 631.9f, 362.8f, 625.9f)
                curveTo(350.0f, 622.2f, 334.3f, 618.9f, 321.1f, 615.9f)
                curveTo(332.3f, 612.0f, 349.2f, 606.6f, 359.5f, 601.9f)
                curveTo(371.3f, 604.7f, 381.4f, 607.9f, 392.9f, 611.6f)
                curveTo(371.3f, 592.6f, 333.2f, 562.5f, 303.2f, 561.6f)
                curveTo(296.1f, 561.0f, 290.9f, 560.1f, 284.0f, 558.8f)
                curveTo(296.5f, 568.9f, 314.4f, 581.1f, 327.7f, 590.9f)
                curveTo(305.4f, 599.2f, 282.2f, 609.4f, 259.9f, 616.8f)
                curveTo(274.5f, 621.7f, 290.3f, 626.3f, 305.0f, 630.9f)
                curveTo(299.2f, 637.8f, 292.8f, 646.5f, 287.2f, 653.8f)
                curveTo(317.1f, 667.7f, 339.4f, 676.9f, 370.7f, 687.4f)
                curveTo(365.6f, 691.5f, 359.8f, 697.1f, 354.8f, 701.6f)
                curveTo(345.0f, 695.9f, 337.6f, 692.3f, 327.3f, 687.5f)
                curveTo(331.1f, 695.1f, 332.9f, 698.9f, 335.8f, 707.0f)
                lineTo(319.0f, 708.1f)
                curveTo(312.9f, 698.9f, 298.3f, 673.9f, 292.1f, 667.4f)
                curveTo(249.6f, 623.0f, 192.6f, 589.0f, 138.4f, 560.7f)
                curveTo(126.2f, 554.3f, 111.7f, 546.4f, 99.4f, 541.5f)
                curveTo(116.5f, 538.1f, 158.4f, 534.1f, 176.6f, 532.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1478.8f, 633.4f)
                lineTo(1481.4f, 633.4f)
                curveTo(1485.2f, 635.5f, 1491.5f, 639.7f, 1493.9f, 643.5f)
                curveTo(1534.9f, 706.6f, 1563.7f, 789.1f, 1561.2f, 865.0f)
                curveTo(1560.7f, 881.7f, 1555.6f, 894.5f, 1540.3f, 900.4f)
                curveTo(1524.8f, 893.7f, 1517.3f, 887.0f, 1509.8f, 872.6f)
                curveTo(1504.5f, 863.8f, 1500.4f, 858.2f, 1494.2f, 849.9f)
                curveTo(1498.5f, 848.9f, 1500.6f, 848.0f, 1504.5f, 846.4f)
                curveTo(1513.2f, 861.3f, 1520.2f, 877.0f, 1540.5f, 870.3f)
                curveTo(1545.3f, 823.7f, 1528.3f, 772.4f, 1511.2f, 729.7f)
                curveTo(1501.4f, 705.4f, 1493.5f, 680.6f, 1479.5f, 658.2f)
                curveTo(1476.1f, 652.7f, 1469.4f, 642.3f, 1470.3f, 636.0f)
                curveTo(1472.5f, 634.0f, 1475.7f, 633.9f, 1478.8f, 633.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(859.3f, 338.1f)
                curveTo(864.4f, 336.7f, 870.0f, 338.2f, 873.7f, 342.1f)
                curveTo(877.4f, 345.9f, 878.8f, 351.4f, 877.3f, 356.5f)
                curveTo(875.8f, 361.7f, 871.7f, 365.6f, 866.5f, 366.8f)
                curveTo(858.6f, 368.6f, 850.8f, 363.8f, 848.8f, 356.0f)
                curveTo(846.9f, 348.2f, 851.5f, 340.2f, 859.3f, 338.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(729.7f, 424.6f)
                curveTo(734.9f, 423.4f, 740.5f, 425.1f, 744.1f, 429.1f)
                curveTo(747.7f, 433.1f, 748.9f, 438.8f, 747.1f, 443.9f)
                curveTo(745.3f, 449.0f, 740.9f, 452.7f, 735.5f, 453.5f)
                curveTo(731.0f, 454.3f, 726.4f, 452.9f, 723.1f, 449.7f)
                curveTo(719.7f, 446.6f, 718.0f, 442.1f, 718.5f, 437.6f)
                curveTo(719.1f, 431.3f, 723.6f, 426.1f, 729.7f, 424.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(686.2f, 424.7f)
                curveTo(694.1f, 422.7f, 702.1f, 427.4f, 704.1f, 435.3f)
                curveTo(706.1f, 443.2f, 701.4f, 451.2f, 693.5f, 453.2f)
                curveTo(688.9f, 454.5f, 683.9f, 453.3f, 680.2f, 450.2f)
                curveTo(676.6f, 447.1f, 674.7f, 442.3f, 675.1f, 437.5f)
                curveTo(675.7f, 431.3f, 680.2f, 426.2f, 686.2f, 424.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(556.3f, 424.7f)
                curveTo(560.7f, 423.6f, 565.4f, 424.6f, 569.0f, 427.4f)
                curveTo(572.5f, 430.2f, 574.6f, 434.5f, 574.6f, 439.0f)
                curveTo(574.6f, 445.7f, 570.1f, 451.5f, 563.6f, 453.3f)
                curveTo(555.6f, 455.3f, 547.5f, 450.5f, 545.5f, 442.6f)
                curveTo(543.5f, 434.7f, 548.4f, 426.6f, 556.3f, 424.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(599.8f, 424.6f)
                curveTo(605.0f, 423.4f, 610.5f, 425.1f, 614.1f, 429.1f)
                curveTo(617.7f, 433.1f, 618.8f, 438.8f, 617.0f, 443.9f)
                curveTo(615.3f, 449.0f, 610.8f, 452.7f, 605.5f, 453.5f)
                curveTo(601.1f, 454.2f, 596.6f, 452.9f, 593.2f, 449.9f)
                curveTo(589.9f, 446.9f, 588.1f, 442.5f, 588.4f, 438.0f)
                curveTo(588.8f, 431.6f, 593.5f, 426.1f, 599.8f, 424.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(643.0f, 424.7f)
                curveTo(648.2f, 423.4f, 653.7f, 425.1f, 657.3f, 429.0f)
                curveTo(660.9f, 432.9f, 662.1f, 438.5f, 660.5f, 443.6f)
                curveTo(658.8f, 448.7f, 654.4f, 452.5f, 649.2f, 453.5f)
                curveTo(641.3f, 454.9f, 633.7f, 449.9f, 632.1f, 442.1f)
                curveTo(630.4f, 434.3f, 635.2f, 426.6f, 643.0f, 424.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(771.1f, 338.6f)
                curveTo(778.7f, 335.7f, 787.3f, 339.5f, 790.2f, 347.1f)
                curveTo(793.1f, 354.7f, 789.3f, 363.3f, 781.6f, 366.1f)
                curveTo(776.7f, 368.0f, 771.2f, 367.1f, 767.2f, 363.8f)
                curveTo(763.1f, 360.5f, 761.1f, 355.3f, 761.9f, 350.1f)
                curveTo(762.7f, 344.9f, 766.2f, 340.5f, 771.1f, 338.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(598.3f, 511.6f)
                curveTo(603.4f, 509.9f, 609.0f, 511.1f, 613.0f, 514.7f)
                curveTo(617.0f, 518.3f, 618.7f, 523.7f, 617.4f, 529.0f)
                curveTo(616.2f, 534.2f, 612.2f, 538.3f, 607.1f, 539.8f)
                curveTo(602.5f, 541.0f, 597.7f, 540.1f, 594.0f, 537.1f)
                curveTo(590.3f, 534.2f, 588.2f, 529.7f, 588.4f, 525.0f)
                curveTo(588.6f, 518.9f, 592.6f, 513.6f, 598.3f, 511.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(816.2f, 338.2f)
                curveTo(822.4f, 336.6f, 828.9f, 339.3f, 832.3f, 344.7f)
                curveTo(835.7f, 350.1f, 835.2f, 357.2f, 831.0f, 362.0f)
                curveTo(829.0f, 364.3f, 826.4f, 366.0f, 823.5f, 366.7f)
                curveTo(818.1f, 368.1f, 812.4f, 366.4f, 808.8f, 362.2f)
                curveTo(806.2f, 359.3f, 804.9f, 355.4f, 805.1f, 351.5f)
                curveTo(805.5f, 345.2f, 810.0f, 339.8f, 816.2f, 338.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(490.3f, 468.3f)
                curveTo(495.8f, 466.6f, 501.9f, 468.3f, 505.7f, 472.6f)
                curveTo(509.5f, 476.9f, 510.5f, 483.1f, 508.1f, 488.4f)
                curveTo(506.3f, 492.4f, 502.8f, 495.4f, 498.5f, 496.6f)
                curveTo(490.7f, 498.6f, 482.8f, 494.1f, 480.6f, 486.4f)
                curveTo(478.4f, 478.7f, 482.7f, 470.7f, 490.3f, 468.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(663.5f, 468.3f)
                curveTo(669.2f, 466.5f, 675.4f, 468.3f, 679.3f, 472.9f)
                curveTo(683.1f, 477.4f, 683.8f, 483.8f, 681.1f, 489.1f)
                curveTo(679.0f, 493.2f, 675.0f, 496.1f, 670.5f, 496.8f)
                curveTo(662.9f, 498.1f, 655.6f, 493.3f, 653.7f, 485.8f)
                curveTo(651.9f, 478.3f, 656.2f, 470.7f, 663.5f, 468.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(576.6f, 468.5f)
                curveTo(581.6f, 466.7f, 587.2f, 467.9f, 591.1f, 471.4f)
                curveTo(595.1f, 474.9f, 596.9f, 480.3f, 595.7f, 485.5f)
                curveTo(594.6f, 490.7f, 590.7f, 494.9f, 585.6f, 496.4f)
                curveTo(577.9f, 498.7f, 569.9f, 494.5f, 567.4f, 486.9f)
                curveTo(565.0f, 479.3f, 569.0f, 471.1f, 576.6f, 468.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1316.4f, 294.5f)
                curveTo(1324.3f, 293.6f, 1331.5f, 299.2f, 1332.6f, 307.1f)
                curveTo(1333.7f, 315.0f, 1328.3f, 322.3f, 1320.4f, 323.6f)
                curveTo(1315.2f, 324.5f, 1309.9f, 322.4f, 1306.5f, 318.2f)
                curveTo(1303.2f, 314.0f, 1302.4f, 308.4f, 1304.5f, 303.5f)
                curveTo(1306.5f, 298.5f, 1311.1f, 295.1f, 1316.4f, 294.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(403.1f, 468.5f)
                curveTo(408.1f, 466.7f, 413.7f, 467.8f, 417.7f, 471.3f)
                curveTo(421.7f, 474.8f, 423.5f, 480.2f, 422.4f, 485.3f)
                curveTo(421.3f, 490.5f, 417.5f, 494.7f, 412.5f, 496.3f)
                curveTo(404.8f, 498.8f, 396.6f, 494.6f, 394.1f, 487.0f)
                curveTo(391.5f, 479.4f, 395.6f, 471.2f, 403.1f, 468.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(620.1f, 468.4f)
                curveTo(625.1f, 466.7f, 630.6f, 467.9f, 634.6f, 471.5f)
                curveTo(638.5f, 475.1f, 640.2f, 480.4f, 639.0f, 485.6f)
                curveTo(637.8f, 490.8f, 633.9f, 494.9f, 628.9f, 496.4f)
                curveTo(621.2f, 498.7f, 613.1f, 494.4f, 610.7f, 486.7f)
                curveTo(608.3f, 479.1f, 612.5f, 470.9f, 620.1f, 468.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(446.7f, 468.4f)
                curveTo(451.8f, 466.8f, 457.3f, 467.9f, 461.2f, 471.5f)
                curveTo(465.1f, 475.0f, 466.8f, 480.4f, 465.7f, 485.6f)
                curveTo(464.5f, 490.8f, 460.6f, 494.9f, 455.6f, 496.4f)
                curveTo(447.9f, 498.7f, 439.8f, 494.4f, 437.4f, 486.8f)
                curveTo(434.9f, 479.1f, 439.1f, 470.9f, 446.7f, 468.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(970.0f, 294.5f)
                curveTo(978.0f, 293.8f, 985.0f, 299.5f, 985.9f, 307.4f)
                curveTo(986.9f, 315.3f, 981.3f, 322.5f, 973.5f, 323.6f)
                curveTo(968.2f, 324.4f, 962.9f, 322.2f, 959.7f, 318.0f)
                curveTo(956.5f, 313.7f, 955.8f, 308.1f, 957.9f, 303.2f)
                curveTo(960.1f, 298.3f, 964.7f, 295.0f, 970.0f, 294.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1009.6f, 295.4f)
                curveTo(1015.2f, 293.4f, 1021.4f, 294.9f, 1025.4f, 299.2f)
                curveTo(1029.4f, 303.5f, 1030.5f, 309.8f, 1028.1f, 315.2f)
                curveTo(1026.3f, 319.2f, 1022.8f, 322.2f, 1018.5f, 323.4f)
                curveTo(1010.9f, 325.4f, 1003.1f, 321.1f, 1000.7f, 313.6f)
                curveTo(998.4f, 306.1f, 1002.3f, 298.1f, 1009.6f, 295.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(533.1f, 468.5f)
                curveTo(538.1f, 466.7f, 543.7f, 467.8f, 547.7f, 471.3f)
                curveTo(551.7f, 474.7f, 553.5f, 480.1f, 552.4f, 485.3f)
                curveTo(551.4f, 490.5f, 547.6f, 494.7f, 542.5f, 496.3f)
                curveTo(534.9f, 498.7f, 526.8f, 494.6f, 524.2f, 487.0f)
                curveTo(521.6f, 479.5f, 525.6f, 471.2f, 533.1f, 468.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(359.7f, 468.6f)
                curveTo(364.7f, 466.7f, 370.3f, 467.8f, 374.3f, 471.3f)
                curveTo(378.3f, 474.7f, 380.2f, 480.1f, 379.1f, 485.3f)
                curveTo(378.0f, 490.5f, 374.2f, 494.7f, 369.2f, 496.3f)
                curveTo(361.6f, 498.7f, 353.4f, 494.6f, 350.9f, 487.0f)
                curveTo(348.3f, 479.5f, 352.2f, 471.3f, 359.7f, 468.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(664.8f, 381.4f)
                curveTo(670.3f, 380.2f, 676.1f, 382.3f, 679.6f, 386.7f)
                curveTo(683.1f, 391.2f, 683.7f, 397.3f, 681.1f, 402.4f)
                curveTo(678.8f, 406.8f, 674.5f, 409.8f, 669.5f, 410.3f)
                curveTo(661.8f, 411.1f, 654.8f, 405.7f, 653.6f, 398.1f)
                curveTo(652.3f, 390.4f, 657.2f, 383.1f, 664.8f, 381.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(706.5f, 468.5f)
                curveTo(711.5f, 466.8f, 717.1f, 467.8f, 721.1f, 471.3f)
                curveTo(725.1f, 474.8f, 726.9f, 480.2f, 725.8f, 485.3f)
                curveTo(724.7f, 490.5f, 720.9f, 494.7f, 715.8f, 496.3f)
                curveTo(708.2f, 498.7f, 700.1f, 494.6f, 697.5f, 487.0f)
                curveTo(695.0f, 479.4f, 699.0f, 471.2f, 706.5f, 468.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(794.7f, 381.4f)
                curveTo(799.9f, 380.2f, 805.4f, 381.9f, 808.9f, 385.9f)
                curveTo(812.5f, 389.9f, 813.6f, 395.4f, 811.9f, 400.5f)
                curveTo(810.1f, 405.5f, 805.8f, 409.2f, 800.5f, 410.1f)
                curveTo(796.2f, 410.8f, 791.8f, 409.6f, 788.5f, 406.8f)
                curveTo(785.2f, 404.0f, 783.4f, 399.8f, 783.4f, 395.5f)
                curveTo(783.5f, 388.8f, 788.2f, 382.9f, 794.7f, 381.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(751.4f, 381.4f)
                curveTo(756.5f, 380.2f, 762.0f, 381.9f, 765.5f, 385.8f)
                curveTo(769.1f, 389.7f, 770.3f, 395.2f, 768.6f, 400.2f)
                curveTo(766.9f, 405.3f, 762.7f, 409.0f, 757.5f, 410.0f)
                curveTo(749.7f, 411.5f, 742.1f, 406.5f, 740.5f, 398.7f)
                curveTo(738.8f, 390.9f, 743.7f, 383.3f, 751.4f, 381.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(708.4f, 381.4f)
                curveTo(716.3f, 379.7f, 724.1f, 384.7f, 725.7f, 392.6f)
                curveTo(727.4f, 400.5f, 722.4f, 408.3f, 714.5f, 410.0f)
                curveTo(706.6f, 411.6f, 698.9f, 406.6f, 697.2f, 398.7f)
                curveTo(695.5f, 390.8f, 700.5f, 383.1f, 708.4f, 381.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(514.5f, 511.1f)
                curveTo(532.2f, 509.6f, 538.7f, 531.8f, 520.1f, 539.8f)
                curveTo(496.7f, 537.2f, 495.6f, 515.9f, 514.5f, 511.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(754.1f, 467.2f)
                curveTo(766.1f, 469.3f, 774.4f, 480.1f, 765.9f, 491.9f)
                curveTo(763.1f, 495.8f, 759.3f, 495.7f, 754.9f, 495.8f)
                curveTo(736.8f, 496.1f, 733.3f, 473.2f, 754.1f, 467.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(556.2f, 510.9f)
                curveTo(575.7f, 510.0f, 581.7f, 531.8f, 565.3f, 539.1f)
                curveTo(562.5f, 538.8f, 558.2f, 538.4f, 555.5f, 537.8f)
                curveTo(551.4f, 536.7f, 547.9f, 533.9f, 545.8f, 530.2f)
                curveTo(541.2f, 521.7f, 549.6f, 514.6f, 556.2f, 510.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(738.0f, 339.2f)
                curveTo(755.1f, 345.0f, 749.0f, 367.8f, 730.8f, 367.2f)
                curveTo(723.5f, 364.4f, 714.2f, 357.3f, 719.5f, 348.6f)
                curveTo(723.5f, 341.9f, 730.9f, 341.0f, 738.0f, 339.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1050.2f, 295.6f)
                curveTo(1056.9f, 297.2f, 1064.9f, 297.3f, 1070.1f, 302.2f)
                curveTo(1077.5f, 309.4f, 1070.0f, 317.7f, 1064.6f, 322.9f)
                curveTo(1063.8f, 323.1f, 1063.1f, 323.3f, 1062.3f, 323.5f)
                curveTo(1053.3f, 325.5f, 1045.2f, 320.6f, 1044.0f, 311.3f)
                curveTo(1043.1f, 303.9f, 1045.9f, 300.9f, 1050.2f, 295.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(627.2f, 381.8f)
                curveTo(643.2f, 383.5f, 644.7f, 405.2f, 624.5f, 411.0f)
                curveTo(616.6f, 408.6f, 606.9f, 402.8f, 611.0f, 392.9f)
                curveTo(613.9f, 386.1f, 620.7f, 384.3f, 627.2f, 381.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1360.8f, 294.0f)
                lineTo(1364.3f, 294.5f)
                curveTo(1370.7f, 298.5f, 1373.0f, 307.6f, 1375.8f, 314.8f)
                curveTo(1370.3f, 321.0f, 1369.2f, 322.0f, 1361.5f, 324.8f)
                curveTo(1360.1f, 324.3f, 1358.6f, 323.8f, 1357.2f, 323.3f)
                curveTo(1341.9f, 317.2f, 1342.7f, 299.7f, 1360.8f, 294.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(927.7f, 298.4f)
                curveTo(940.3f, 297.0f, 945.7f, 301.3f, 940.7f, 315.7f)
                curveTo(939.1f, 320.5f, 934.0f, 322.8f, 929.4f, 324.4f)
                curveTo(918.6f, 322.8f, 907.7f, 313.4f, 915.8f, 302.0f)
                curveTo(918.4f, 298.4f, 923.4f, 298.7f, 927.7f, 298.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1335.8f, 250.7f)
                curveTo(1343.6f, 250.8f, 1350.5f, 266.2f, 1354.1f, 272.5f)
                curveTo(1349.2f, 277.0f, 1348.1f, 277.9f, 1342.2f, 280.8f)
                curveTo(1323.2f, 281.1f, 1319.1f, 262.5f, 1335.8f, 250.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(772.6f, 424.1f)
                curveTo(779.1f, 424.0f, 787.8f, 425.2f, 789.6f, 432.3f)
                curveTo(787.9f, 439.8f, 781.3f, 444.7f, 775.7f, 450.0f)
                curveTo(774.4f, 451.5f, 773.8f, 451.5f, 772.0f, 452.3f)
                curveTo(763.9f, 451.7f, 761.2f, 442.8f, 762.4f, 435.8f)
                curveTo(763.4f, 430.2f, 768.2f, 427.0f, 772.6f, 424.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(902.0f, 337.9f)
                curveTo(915.1f, 337.1f, 918.0f, 341.1f, 922.4f, 352.7f)
                curveTo(917.2f, 354.1f, 911.5f, 356.1f, 906.4f, 357.9f)
                lineTo(895.2f, 362.9f)
                curveTo(889.3f, 350.4f, 890.2f, 345.4f, 902.0f, 337.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(330.4f, 472.2f)
                curveTo(341.0f, 475.8f, 335.0f, 488.4f, 329.8f, 494.4f)
                lineTo(315.1f, 491.9f)
                curveTo(310.4f, 490.9f, 311.0f, 491.8f, 308.0f, 489.0f)
                curveTo(306.9f, 485.3f, 306.7f, 484.8f, 307.6f, 481.1f)
                curveTo(311.5f, 474.8f, 322.3f, 474.1f, 330.4f, 472.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(888.5f, 303.6f)
                curveTo(889.6f, 303.4f, 890.7f, 303.3f, 891.8f, 303.1f)
                curveTo(895.9f, 302.7f, 895.7f, 302.8f, 898.3f, 304.9f)
                curveTo(903.5f, 315.6f, 891.8f, 325.0f, 880.3f, 323.7f)
                curveTo(876.0f, 321.3f, 872.1f, 317.1f, 869.5f, 312.9f)
                curveTo(868.9f, 303.9f, 881.9f, 304.3f, 888.5f, 303.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(788.2f, 470.5f)
                curveTo(795.8f, 473.7f, 807.0f, 482.1f, 813.3f, 487.3f)
                lineTo(805.6f, 495.3f)
                curveTo(803.9f, 495.7f, 792.4f, 495.3f, 789.9f, 495.3f)
                curveTo(781.8f, 484.9f, 781.2f, 481.6f, 788.2f, 470.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1087.1f, 302.6f)
                curveTo(1095.5f, 304.1f, 1112.4f, 303.1f, 1115.6f, 311.3f)
                curveTo(1115.0f, 315.4f, 1113.5f, 316.9f, 1111.0f, 320.4f)
                curveTo(1096.1f, 331.2f, 1086.2f, 318.3f, 1087.1f, 302.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1311.2f, 208.6f)
                curveTo(1315.4f, 210.8f, 1326.8f, 228.8f, 1328.3f, 233.0f)
                curveTo(1325.9f, 235.7f, 1322.8f, 236.2f, 1319.3f, 237.3f)
                curveTo(1309.6f, 238.5f, 1305.3f, 229.3f, 1302.4f, 222.0f)
                curveTo(1305.1f, 215.3f, 1306.0f, 213.2f, 1311.2f, 208.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(527.1f, 431.0f)
                curveTo(537.1f, 434.2f, 529.6f, 457.5f, 511.2f, 452.9f)
                lineTo(503.0f, 447.3f)
                curveTo(511.4f, 439.7f, 517.0f, 436.0f, 527.1f, 431.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(838.4f, 381.0f)
                curveTo(842.6f, 380.8f, 847.4f, 381.8f, 851.1f, 383.9f)
                curveTo(855.2f, 390.6f, 843.4f, 396.0f, 838.4f, 399.3f)
                curveTo(835.7f, 401.2f, 834.8f, 401.7f, 831.8f, 403.1f)
                curveTo(828.2f, 402.5f, 829.7f, 403.3f, 827.2f, 400.5f)
                curveTo(824.6f, 391.2f, 830.4f, 384.6f, 838.4f, 381.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1380.7f, 338.0f)
                curveTo(1384.8f, 338.0f, 1383.9f, 337.4f, 1386.1f, 339.5f)
                curveTo(1387.9f, 346.0f, 1386.9f, 355.8f, 1386.7f, 362.9f)
                lineTo(1377.7f, 360.2f)
                curveTo(1374.1f, 358.9f, 1369.4f, 357.8f, 1368.5f, 353.5f)
                curveTo(1366.8f, 345.5f, 1373.6f, 339.7f, 1380.7f, 338.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1286.5f, 305.0f)
                curveTo(1287.7f, 305.0f, 1287.4f, 305.2f, 1288.7f, 306.0f)
                curveTo(1290.2f, 313.4f, 1287.0f, 319.3f, 1280.1f, 322.7f)
                curveTo(1275.8f, 324.8f, 1271.6f, 322.8f, 1267.3f, 321.2f)
                curveTo(1264.8f, 319.3f, 1261.5f, 316.3f, 1259.0f, 314.1f)
                curveTo(1266.9f, 311.0f, 1278.2f, 307.7f, 1286.5f, 305.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(851.4f, 308.2f)
                curveTo(853.1f, 307.9f, 852.9f, 308.1f, 854.8f, 308.4f)
                curveTo(858.7f, 317.7f, 846.4f, 326.4f, 835.0f, 322.6f)
                curveTo(832.6f, 320.7f, 828.5f, 316.4f, 826.1f, 314.0f)
                curveTo(834.7f, 312.4f, 842.9f, 310.3f, 851.4f, 308.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(645.0f, 511.1f)
                curveTo(652.5f, 510.6f, 653.5f, 512.3f, 659.3f, 517.2f)
                lineTo(641.3f, 526.6f)
                curveTo(637.4f, 528.7f, 635.3f, 530.9f, 631.9f, 527.6f)
                curveTo(629.8f, 518.9f, 637.5f, 513.0f, 645.0f, 511.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(702.1f, 351.0f)
                lineTo(703.5f, 350.8f)
                lineTo(704.8f, 352.0f)
                curveTo(704.7f, 355.7f, 702.8f, 358.9f, 701.2f, 362.4f)
                curveTo(695.4f, 366.2f, 692.3f, 368.8f, 685.3f, 366.6f)
                curveTo(682.4f, 364.9f, 679.1f, 362.7f, 676.3f, 360.9f)
                curveTo(685.0f, 357.2f, 693.2f, 354.2f, 702.1f, 351.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(468.5f, 511.1f)
                curveTo(478.3f, 509.7f, 489.1f, 515.6f, 487.5f, 526.1f)
                lineTo(485.7f, 526.3f)
                curveTo(479.3f, 524.1f, 467.6f, 520.9f, 463.9f, 515.8f)
                curveTo(464.5f, 512.9f, 465.1f, 513.4f, 468.5f, 511.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1285.0f, 167.9f)
                curveTo(1289.0f, 170.7f, 1299.6f, 188.1f, 1302.6f, 193.2f)
                curveTo(1284.3f, 197.2f, 1285.6f, 181.4f, 1285.0f, 167.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1335.6f, 337.8f)
                curveTo(1343.4f, 337.5f, 1355.1f, 341.0f, 1353.8f, 350.8f)
                lineTo(1351.7f, 350.8f)
                curveTo(1345.3f, 348.4f, 1333.6f, 346.8f, 1330.4f, 342.6f)
                curveTo(1331.3f, 339.8f, 1332.5f, 339.8f, 1335.6f, 337.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1300.9f, 251.6f)
                curveTo(1311.1f, 256.3f, 1314.3f, 263.9f, 1309.0f, 273.9f)
                curveTo(1307.4f, 275.4f, 1307.3f, 275.3f, 1305.3f, 276.3f)
                lineTo(1303.7f, 275.0f)
                curveTo(1301.4f, 268.2f, 1301.4f, 258.9f, 1300.9f, 251.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(593.6f, 396.8f)
                lineTo(595.0f, 396.9f)
                lineTo(595.8f, 398.4f)
                curveTo(594.1f, 405.8f, 587.0f, 410.8f, 579.6f, 410.8f)
                curveTo(577.3f, 410.0f, 575.8f, 409.8f, 574.2f, 408.1f)
                lineTo(574.6f, 406.2f)
                curveTo(577.8f, 403.3f, 589.0f, 399.0f, 593.6f, 396.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1129.3f, 312.0f)
                curveTo(1135.8f, 313.1f, 1147.6f, 316.2f, 1153.2f, 319.6f)
                lineTo(1153.4f, 321.4f)
                curveTo(1141.7f, 326.3f, 1135.2f, 323.3f, 1129.3f, 312.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(947.8f, 337.1f)
                curveTo(950.8f, 337.4f, 955.9f, 337.8f, 957.4f, 340.5f)
                curveTo(954.4f, 343.0f, 949.8f, 343.7f, 945.8f, 344.8f)
                lineTo(933.2f, 349.3f)
                curveTo(938.3f, 343.0f, 940.5f, 340.2f, 947.8f, 337.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(290.5f, 482.4f)
                curveTo(291.1f, 482.4f, 291.7f, 482.9f, 292.3f, 483.3f)
                curveTo(292.8f, 486.3f, 293.1f, 484.9f, 291.5f, 487.5f)
                curveTo(287.6f, 489.1f, 285.1f, 488.2f, 280.8f, 487.5f)
                curveTo(278.1f, 486.7f, 278.9f, 487.5f, 277.6f, 485.7f)
                curveTo(280.3f, 483.7f, 286.8f, 483.0f, 290.5f, 482.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(804.2f, 319.0f)
                lineTo(807.7f, 318.8f)
                lineTo(808.4f, 319.7f)
                curveTo(805.2f, 322.4f, 803.2f, 322.8f, 799.3f, 324.2f)
                curveTo(797.2f, 324.2f, 796.1f, 324.5f, 794.4f, 323.2f)
                curveTo(796.4f, 321.1f, 801.2f, 320.0f, 804.2f, 319.0f)
                close()
            }
        }
        .build()
        return _customMorogan!!
    }

private var _customMorogan: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = BuildInCustomSenderAvatar.CustomMorogan, contentDescription = "")
    }
}
