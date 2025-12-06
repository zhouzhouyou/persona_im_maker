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

public val StandardSenderAvatar.StandardRafflesia: ImageVector
    get() {
        if (_standardRafflesia != null) {
            return _standardRafflesia!!
        }
        _standardRafflesia = Builder(name = "StandardRafflesia", defaultWidth = 420.0.dp,
                defaultHeight = 279.0.dp, viewportWidth = 1680.0f, viewportHeight = 1116.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1013.5f, 66.4f)
                curveTo(1021.7f, 65.6f, 1032.3f, 64.6f, 1040.2f, 67.3f)
                curveTo(1051.5f, 71.2f, 1063.0f, 81.6f, 1072.8f, 88.5f)
                curveTo(1089.2f, 100.0f, 1193.5f, 176.4f, 1203.3f, 179.0f)
                curveTo(1214.5f, 182.0f, 1229.4f, 179.3f, 1241.0f, 178.4f)
                curveTo(1261.2f, 176.8f, 1339.8f, 168.7f, 1354.6f, 175.2f)
                curveTo(1370.3f, 182.1f, 1385.2f, 195.4f, 1399.3f, 205.3f)
                lineTo(1485.7f, 265.3f)
                curveTo(1498.1f, 273.9f, 1510.7f, 283.4f, 1523.2f, 291.7f)
                curveTo(1546.5f, 307.2f, 1577.7f, 316.9f, 1601.3f, 331.0f)
                curveTo(1609.1f, 361.2f, 1611.5f, 393.6f, 1615.8f, 424.7f)
                curveTo(1618.3f, 442.3f, 1631.3f, 510.4f, 1625.1f, 524.0f)
                curveTo(1616.3f, 543.2f, 1578.1f, 586.5f, 1565.3f, 606.4f)
                curveTo(1558.2f, 617.3f, 1531.3f, 648.7f, 1529.0f, 657.4f)
                curveTo(1525.4f, 670.9f, 1526.5f, 694.9f, 1523.3f, 712.5f)
                curveTo(1508.1f, 727.4f, 1481.4f, 744.7f, 1464.0f, 758.7f)
                curveTo(1434.8f, 782.3f, 1404.2f, 804.8f, 1374.4f, 827.8f)
                curveTo(1357.0f, 837.9f, 1331.0f, 839.0f, 1311.6f, 843.2f)
                curveTo(1278.5f, 850.3f, 1244.9f, 854.6f, 1212.1f, 861.2f)
                curveTo(1201.6f, 872.9f, 1186.3f, 902.3f, 1176.4f, 917.8f)
                curveTo(1165.5f, 922.5f, 1124.6f, 928.5f, 1110.0f, 931.4f)
                curveTo(1067.7f, 939.7f, 1024.5f, 947.6f, 982.0f, 955.4f)
                curveTo(976.4f, 956.5f, 968.3f, 957.2f, 962.4f, 956.9f)
                curveTo(922.9f, 954.9f, 878.3f, 940.5f, 839.0f, 944.6f)
                curveTo(830.6f, 945.5f, 807.7f, 958.1f, 798.5f, 962.1f)
                curveTo(775.3f, 972.1f, 751.4f, 984.7f, 728.2f, 994.5f)
                curveTo(715.9f, 999.9f, 684.9f, 993.8f, 670.8f, 991.6f)
                curveTo(648.3f, 988.2f, 625.7f, 984.8f, 603.2f, 981.6f)
                curveTo(543.9f, 973.6f, 483.3f, 967.8f, 424.6f, 957.0f)
                curveTo(418.3f, 955.8f, 400.6f, 944.8f, 394.0f, 941.1f)
                lineTo(348.7f, 915.4f)
                curveTo(331.0f, 905.4f, 279.3f, 879.3f, 266.9f, 866.5f)
                curveTo(260.7f, 843.5f, 249.4f, 807.0f, 239.5f, 785.7f)
                curveTo(236.2f, 778.8f, 207.9f, 749.7f, 201.2f, 742.6f)
                lineTo(131.9f, 668.2f)
                curveTo(124.4f, 660.0f, 99.5f, 634.2f, 95.6f, 626.8f)
                curveTo(110.1f, 560.3f, 119.3f, 491.7f, 133.9f, 425.0f)
                curveTo(139.0f, 401.6f, 139.8f, 378.0f, 147.3f, 354.4f)
                curveTo(161.0f, 343.6f, 209.3f, 318.7f, 226.4f, 309.1f)
                lineTo(370.6f, 229.3f)
                curveTo(381.7f, 223.3f, 420.7f, 199.4f, 431.2f, 198.1f)
                curveTo(485.6f, 191.5f, 542.8f, 194.8f, 596.9f, 186.0f)
                curveTo(603.6f, 184.9f, 628.1f, 168.6f, 635.5f, 164.3f)
                lineTo(722.4f, 113.5f)
                curveTo(732.2f, 107.6f, 768.9f, 84.9f, 777.3f, 82.1f)
                curveTo(804.1f, 74.5f, 836.2f, 78.4f, 863.4f, 75.8f)
                curveTo(913.5f, 70.9f, 963.6f, 70.3f, 1013.5f, 66.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(986.7f, 130.4f)
                curveTo(990.7f, 129.6f, 1000.5f, 131.9f, 1004.6f, 133.3f)
                curveTo(1054.7f, 149.5f, 1105.4f, 164.3f, 1155.5f, 180.5f)
                curveTo(1173.0f, 186.2f, 1190.5f, 207.4f, 1203.4f, 220.8f)
                lineTo(1283.0f, 222.6f)
                curveTo(1291.2f, 222.8f, 1332.5f, 222.3f, 1338.3f, 224.8f)
                curveTo(1379.5f, 242.8f, 1418.7f, 266.9f, 1459.1f, 286.8f)
                curveTo(1463.3f, 288.8f, 1471.4f, 294.2f, 1473.6f, 298.1f)
                lineTo(1474.0f, 298.7f)
                curveTo(1479.2f, 307.8f, 1491.0f, 341.8f, 1497.4f, 355.7f)
                curveTo(1507.1f, 358.3f, 1536.9f, 365.9f, 1544.6f, 369.8f)
                lineTo(1545.2f, 370.1f)
                curveTo(1551.9f, 373.5f, 1561.8f, 396.4f, 1565.7f, 404.1f)
                curveTo(1575.6f, 423.7f, 1585.3f, 443.3f, 1594.9f, 463.1f)
                curveTo(1583.1f, 486.5f, 1575.2f, 526.1f, 1562.7f, 550.2f)
                curveTo(1558.3f, 558.6f, 1548.1f, 567.5f, 1541.9f, 574.9f)
                curveTo(1524.2f, 595.9f, 1502.6f, 615.5f, 1486.0f, 637.1f)
                curveTo(1486.6f, 654.0f, 1492.8f, 674.9f, 1495.6f, 692.5f)
                curveTo(1487.9f, 696.7f, 1476.6f, 704.7f, 1468.7f, 709.6f)
                lineTo(1391.6f, 757.3f)
                curveTo(1375.3f, 767.6f, 1348.7f, 787.1f, 1330.3f, 791.6f)
                curveTo(1327.7f, 792.2f, 1308.3f, 793.2f, 1304.3f, 793.5f)
                curveTo(1286.8f, 794.7f, 1269.2f, 795.5f, 1251.6f, 796.0f)
                curveTo(1238.7f, 796.3f, 1219.9f, 796.3f, 1208.0f, 799.7f)
                curveTo(1192.6f, 813.4f, 1168.4f, 857.7f, 1151.9f, 870.8f)
                curveTo(1148.1f, 873.7f, 1099.4f, 885.1f, 1091.8f, 887.0f)
                curveTo(1075.0f, 891.1f, 1058.2f, 895.4f, 1041.4f, 899.8f)
                curveTo(1024.2f, 904.2f, 1008.8f, 910.2f, 991.1f, 905.9f)
                curveTo(965.9f, 899.7f, 940.8f, 893.3f, 915.6f, 886.9f)
                curveTo(902.8f, 883.7f, 890.0f, 880.8f, 877.1f, 878.2f)
                curveTo(869.8f, 881.8f, 861.6f, 887.7f, 854.0f, 891.6f)
                curveTo(841.1f, 898.2f, 829.0f, 901.2f, 815.2f, 905.0f)
                curveTo(806.3f, 907.5f, 773.1f, 918.8f, 767.4f, 919.2f)
                curveTo(727.8f, 921.5f, 684.6f, 906.9f, 644.1f, 906.9f)
                curveTo(620.3f, 906.9f, 593.8f, 919.7f, 573.6f, 919.7f)
                curveTo(564.6f, 919.7f, 522.6f, 908.4f, 510.0f, 905.3f)
                curveTo(488.4f, 899.9f, 457.1f, 893.7f, 436.8f, 886.5f)
                curveTo(427.2f, 883.0f, 402.4f, 853.4f, 393.4f, 844.4f)
                curveTo(382.6f, 833.6f, 369.5f, 820.2f, 358.3f, 808.9f)
                curveTo(359.2f, 794.2f, 362.3f, 777.5f, 364.5f, 762.6f)
                curveTo(366.4f, 749.0f, 368.1f, 735.3f, 369.5f, 721.7f)
                curveTo(354.4f, 720.3f, 314.2f, 708.7f, 299.8f, 700.9f)
                curveTo(295.7f, 698.7f, 282.3f, 674.0f, 278.7f, 667.7f)
                lineTo(234.9f, 590.8f)
                curveTo(228.9f, 580.4f, 215.7f, 556.0f, 208.6f, 547.4f)
                lineTo(207.9f, 546.6f)
                curveTo(219.9f, 508.3f, 232.6f, 470.3f, 245.9f, 432.4f)
                curveTo(252.8f, 412.2f, 261.0f, 386.2f, 269.0f, 366.7f)
                curveTo(280.0f, 359.6f, 299.4f, 351.7f, 311.8f, 346.1f)
                lineTo(366.8f, 320.6f)
                curveTo(406.7f, 302.3f, 446.2f, 283.2f, 486.3f, 265.5f)
                curveTo(504.7f, 257.4f, 523.7f, 258.1f, 543.4f, 257.1f)
                curveTo(563.6f, 255.9f, 583.7f, 254.9f, 603.9f, 254.2f)
                curveTo(617.6f, 253.7f, 640.6f, 254.0f, 653.6f, 251.4f)
                curveTo(659.8f, 250.1f, 678.4f, 234.7f, 684.5f, 230.0f)
                lineTo(743.8f, 185.1f)
                curveTo(755.8f, 176.1f, 773.0f, 161.3f, 787.6f, 158.7f)
                curveTo(816.0f, 153.8f, 844.9f, 150.3f, 873.5f, 146.3f)
                lineTo(986.7f, 130.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF047C0D)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(955.7f, 181.4f)
                curveTo(1019.0f, 177.2f, 1089.8f, 190.3f, 1143.5f, 225.1f)
                curveTo(1157.7f, 234.2f, 1174.0f, 249.2f, 1187.4f, 260.4f)
                curveTo(1237.1f, 247.8f, 1305.7f, 255.1f, 1353.7f, 273.1f)
                curveTo(1412.0f, 295.0f, 1444.7f, 325.1f, 1470.3f, 380.8f)
                curveTo(1484.9f, 389.1f, 1499.2f, 396.5f, 1511.5f, 407.7f)
                curveTo(1554.8f, 447.3f, 1551.1f, 505.4f, 1512.0f, 546.5f)
                curveTo(1488.9f, 570.7f, 1451.7f, 593.5f, 1417.9f, 594.7f)
                curveTo(1424.7f, 602.7f, 1434.5f, 613.4f, 1439.2f, 622.4f)
                curveTo(1444.7f, 633.1f, 1444.5f, 653.1f, 1440.3f, 664.2f)
                curveTo(1412.9f, 736.4f, 1268.1f, 774.8f, 1204.0f, 752.1f)
                curveTo(1184.0f, 786.5f, 1153.8f, 808.8f, 1117.5f, 823.6f)
                curveTo(1045.1f, 852.9f, 964.0f, 852.6f, 891.7f, 822.9f)
                curveTo(886.3f, 824.4f, 881.0f, 826.4f, 875.7f, 828.4f)
                curveTo(812.0f, 851.9f, 758.3f, 862.3f, 690.3f, 852.2f)
                curveTo(676.9f, 850.2f, 665.3f, 855.1f, 652.7f, 858.0f)
                curveTo(591.5f, 872.1f, 513.0f, 865.4f, 465.5f, 820.4f)
                curveTo(424.6f, 782.5f, 425.9f, 724.8f, 463.9f, 685.6f)
                curveTo(412.8f, 671.4f, 363.1f, 649.6f, 329.3f, 607.9f)
                curveTo(264.9f, 528.5f, 309.5f, 435.7f, 380.5f, 381.3f)
                curveTo(472.5f, 310.9f, 597.2f, 283.0f, 710.2f, 295.1f)
                curveTo(712.9f, 291.0f, 715.3f, 288.2f, 718.5f, 284.6f)
                curveTo(777.7f, 218.1f, 868.3f, 186.0f, 955.7f, 181.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(934.6f, 389.9f)
                curveTo(933.6f, 386.1f, 932.9f, 386.1f, 934.0f, 382.8f)
                curveTo(938.8f, 379.4f, 993.6f, 365.3f, 1003.2f, 364.0f)
                curveTo(1006.8f, 363.5f, 1024.2f, 365.6f, 1029.3f, 366.1f)
                curveTo(1027.8f, 377.1f, 1023.4f, 408.7f, 1024.1f, 418.8f)
                curveTo(1024.1f, 422.8f, 1023.3f, 428.6f, 1024.7f, 431.7f)
                lineTo(1026.8f, 433.6f)
                curveTo(1042.2f, 431.4f, 1053.6f, 430.5f, 1069.1f, 430.5f)
                curveTo(1071.3f, 437.2f, 1073.6f, 443.6f, 1074.9f, 450.5f)
                curveTo(1046.0f, 451.0f, 1021.4f, 456.4f, 995.0f, 457.7f)
                curveTo(994.8f, 471.8f, 996.5f, 479.6f, 997.2f, 492.9f)
                curveTo(988.7f, 493.0f, 976.8f, 493.5f, 968.6f, 493.0f)
                curveTo(966.5f, 483.3f, 964.7f, 472.7f, 964.7f, 462.8f)
                curveTo(940.5f, 468.3f, 916.5f, 471.9f, 892.6f, 479.2f)
                curveTo(890.6f, 472.9f, 888.0f, 464.3f, 885.6f, 458.4f)
                curveTo(895.2f, 457.3f, 911.7f, 452.8f, 921.7f, 450.4f)
                lineTo(923.6f, 446.0f)
                curveTo(920.8f, 439.8f, 916.3f, 439.4f, 915.0f, 434.4f)
                curveTo(914.3f, 431.5f, 918.4f, 428.6f, 920.3f, 425.5f)
                curveTo(918.7f, 420.4f, 904.6f, 398.4f, 900.9f, 391.0f)
                curveTo(908.7f, 389.1f, 916.3f, 386.1f, 924.7f, 384.1f)
                curveTo(926.4f, 389.3f, 926.8f, 390.7f, 929.8f, 395.2f)
                curveTo(931.5f, 393.6f, 933.1f, 391.7f, 934.6f, 389.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF369B2E)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(934.6f, 389.9f)
                curveTo(936.1f, 390.7f, 938.5f, 395.3f, 940.5f, 395.6f)
                curveTo(952.1f, 397.1f, 989.0f, 380.1f, 997.5f, 384.1f)
                lineTo(997.6f, 387.3f)
                curveTo(997.3f, 393.6f, 997.2f, 401.3f, 996.6f, 407.4f)
                curveTo(993.2f, 407.8f, 993.2f, 408.3f, 990.6f, 406.9f)
                curveTo(990.3f, 404.1f, 990.1f, 401.6f, 989.9f, 398.9f)
                lineTo(986.7f, 391.6f)
                curveTo(981.1f, 390.1f, 946.7f, 400.3f, 935.8f, 402.1f)
                lineTo(929.8f, 395.2f)
                curveTo(931.5f, 393.6f, 933.1f, 391.7f, 934.6f, 389.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF43AD49)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(989.9f, 398.9f)
                curveTo(990.1f, 401.6f, 990.3f, 404.1f, 990.6f, 406.9f)
                curveTo(993.2f, 408.3f, 993.2f, 407.8f, 996.6f, 407.4f)
                curveTo(994.7f, 411.1f, 992.8f, 412.5f, 988.8f, 413.3f)
                curveTo(983.5f, 414.2f, 949.3f, 422.4f, 946.8f, 421.5f)
                curveTo(945.7f, 418.9f, 945.8f, 420.0f, 946.5f, 417.2f)
                curveTo(952.2f, 411.4f, 978.8f, 409.3f, 987.2f, 405.0f)
                curveTo(989.4f, 403.8f, 989.2f, 401.8f, 989.9f, 398.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF298E18)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1024.1f, 418.8f)
                curveTo(1024.1f, 422.8f, 1023.3f, 428.6f, 1024.7f, 431.7f)
                lineTo(1026.8f, 433.6f)
                curveTo(1018.6f, 435.5f, 1008.0f, 436.2f, 999.6f, 437.5f)
                curveTo(996.0f, 438.0f, 995.5f, 437.3f, 993.0f, 435.4f)
                curveTo(991.6f, 431.6f, 991.8f, 433.2f, 992.4f, 429.4f)
                curveTo(999.5f, 422.9f, 1012.9f, 429.7f, 1021.7f, 425.2f)
                curveTo(1023.3f, 424.4f, 1023.6f, 420.9f, 1024.1f, 418.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF369B2E)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(923.6f, 446.0f)
                curveTo(931.4f, 443.1f, 954.3f, 436.2f, 962.0f, 437.9f)
                lineTo(963.3f, 439.4f)
                lineTo(963.0f, 442.2f)
                curveTo(959.8f, 444.3f, 928.2f, 449.1f, 921.7f, 450.4f)
                lineTo(923.6f, 446.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(536.2f, 444.3f)
                lineTo(537.4f, 444.4f)
                curveTo(538.2f, 455.4f, 535.8f, 470.8f, 537.1f, 486.2f)
                curveTo(552.9f, 479.7f, 567.7f, 467.7f, 581.2f, 457.2f)
                curveTo(586.0f, 464.3f, 589.6f, 470.0f, 594.0f, 477.5f)
                curveTo(584.8f, 482.6f, 538.0f, 511.7f, 535.2f, 519.1f)
                lineTo(536.2f, 521.4f)
                curveTo(543.9f, 526.1f, 640.9f, 543.7f, 657.0f, 545.7f)
                lineTo(640.6f, 572.5f)
                curveTo(619.4f, 565.2f, 580.2f, 558.0f, 558.2f, 553.9f)
                curveTo(551.1f, 552.9f, 541.6f, 550.6f, 534.4f, 549.1f)
                curveTo(530.9f, 573.9f, 526.3f, 604.3f, 520.5f, 628.5f)
                curveTo(511.8f, 628.8f, 501.2f, 630.4f, 492.4f, 631.5f)
                curveTo(504.0f, 594.3f, 506.1f, 573.8f, 509.9f, 536.0f)
                curveTo(494.4f, 547.6f, 485.3f, 553.7f, 469.8f, 566.7f)
                curveTo(467.6f, 560.7f, 462.9f, 551.4f, 460.1f, 545.3f)
                curveTo(475.0f, 534.5f, 497.4f, 519.5f, 510.7f, 507.9f)
                curveTo(511.5f, 491.9f, 511.1f, 467.6f, 508.8f, 451.6f)
                curveTo(516.8f, 449.9f, 528.1f, 446.5f, 536.2f, 444.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1160.0f, 391.0f)
                curveTo(1159.1f, 391.5f, 1244.2f, 383.9f, 1249.7f, 384.0f)
                curveTo(1253.4f, 388.6f, 1256.2f, 397.6f, 1257.9f, 403.3f)
                curveTo(1254.8f, 407.3f, 1252.4f, 409.1f, 1253.5f, 414.2f)
                curveTo(1259.7f, 418.7f, 1268.2f, 424.3f, 1273.8f, 428.9f)
                curveTo(1269.5f, 433.5f, 1265.4f, 439.0f, 1259.3f, 440.6f)
                lineTo(1257.4f, 441.6f)
                curveTo(1265.1f, 445.3f, 1267.0f, 449.0f, 1270.8f, 457.0f)
                curveTo(1271.6f, 462.6f, 1269.9f, 466.3f, 1270.9f, 469.1f)
                curveTo(1303.0f, 469.5f, 1294.6f, 463.8f, 1308.8f, 491.0f)
                curveTo(1272.2f, 486.4f, 1240.7f, 485.2f, 1203.8f, 486.0f)
                curveTo(1188.1f, 486.4f, 1171.9f, 487.3f, 1156.2f, 487.0f)
                curveTo(1155.0f, 481.9f, 1150.8f, 470.5f, 1155.4f, 467.6f)
                curveTo(1163.5f, 465.9f, 1168.2f, 467.8f, 1172.8f, 466.9f)
                curveTo(1176.9f, 463.3f, 1176.4f, 462.1f, 1178.4f, 456.5f)
                curveTo(1176.4f, 451.8f, 1175.7f, 450.1f, 1174.5f, 445.1f)
                lineTo(1175.9f, 438.1f)
                curveTo(1173.3f, 434.6f, 1170.1f, 426.9f, 1168.1f, 422.7f)
                curveTo(1172.8f, 421.3f, 1187.0f, 415.9f, 1185.5f, 409.8f)
                curveTo(1177.5f, 404.9f, 1176.5f, 409.3f, 1169.6f, 408.4f)
                curveTo(1164.7f, 405.6f, 1162.0f, 396.4f, 1160.0f, 391.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF369B2E)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1270.8f, 457.0f)
                curveTo(1271.6f, 462.6f, 1269.9f, 466.3f, 1270.9f, 469.1f)
                curveTo(1260.7f, 469.1f, 1250.1f, 469.3f, 1239.9f, 468.8f)
                curveTo(1236.2f, 468.7f, 1235.6f, 467.7f, 1235.0f, 464.8f)
                curveTo(1241.7f, 452.3f, 1263.1f, 463.1f, 1270.8f, 457.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF369B2E)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1178.4f, 456.5f)
                curveTo(1185.7f, 466.4f, 1200.5f, 458.1f, 1209.4f, 462.7f)
                lineTo(1210.6f, 465.5f)
                lineTo(1210.2f, 463.3f)
                lineTo(1210.8f, 464.2f)
                curveTo(1210.1f, 465.7f, 1209.4f, 467.7f, 1207.5f, 467.8f)
                curveTo(1196.3f, 468.6f, 1165.2f, 468.5f, 1155.4f, 467.6f)
                curveTo(1163.5f, 465.9f, 1168.2f, 467.8f, 1172.8f, 466.9f)
                curveTo(1176.9f, 463.3f, 1176.4f, 462.1f, 1178.4f, 456.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF369B2E)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1234.2f, 432.1f)
                curveTo(1240.2f, 432.0f, 1251.2f, 430.6f, 1255.4f, 436.6f)
                curveTo(1256.6f, 438.2f, 1257.3f, 438.9f, 1258.8f, 440.1f)
                lineTo(1259.3f, 440.6f)
                lineTo(1257.4f, 441.6f)
                curveTo(1256.4f, 441.6f, 1256.5f, 441.6f, 1255.6f, 441.9f)
                curveTo(1249.9f, 444.1f, 1240.9f, 443.8f, 1234.7f, 444.0f)
                curveTo(1234.1f, 440.2f, 1234.2f, 435.9f, 1234.2f, 432.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF298E18)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1175.9f, 438.1f)
                curveTo(1184.8f, 438.3f, 1200.6f, 435.1f, 1205.9f, 436.0f)
                curveTo(1207.0f, 438.8f, 1206.8f, 437.7f, 1206.0f, 441.0f)
                curveTo(1200.7f, 447.0f, 1182.7f, 444.8f, 1174.5f, 445.1f)
                lineTo(1175.9f, 438.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF298E18)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1239.7f, 402.9f)
                curveTo(1246.7f, 402.7f, 1250.9f, 402.7f, 1257.9f, 403.3f)
                curveTo(1254.8f, 407.3f, 1252.4f, 409.1f, 1253.5f, 414.2f)
                curveTo(1249.3f, 410.1f, 1244.3f, 406.5f, 1239.7f, 402.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF369B2E)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1223.2f, 402.9f)
                curveTo(1224.9f, 403.1f, 1224.1f, 402.9f, 1225.5f, 404.1f)
                curveTo(1224.9f, 411.4f, 1225.5f, 413.6f, 1228.8f, 420.0f)
                lineTo(1213.1f, 419.7f)
                curveTo(1210.4f, 419.4f, 1210.0f, 419.6f, 1208.1f, 417.9f)
                lineTo(1208.1f, 415.2f)
                curveTo(1211.3f, 409.0f, 1217.2f, 405.8f, 1223.2f, 402.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1130.3f, 333.6f)
                curveTo(1136.6f, 336.1f, 1145.5f, 339.8f, 1151.9f, 340.4f)
                curveTo(1155.9f, 338.9f, 1151.9f, 337.2f, 1155.8f, 333.3f)
                curveTo(1169.5f, 332.7f, 1183.2f, 331.6f, 1196.8f, 330.2f)
                curveTo(1229.1f, 326.8f, 1222.9f, 324.7f, 1253.7f, 336.3f)
                curveTo(1247.7f, 346.6f, 1246.3f, 352.1f, 1243.2f, 363.4f)
                curveTo(1244.8f, 367.6f, 1246.9f, 372.1f, 1248.7f, 376.2f)
                lineTo(1249.7f, 384.0f)
                curveTo(1244.2f, 383.9f, 1159.1f, 391.5f, 1160.0f, 391.0f)
                lineTo(1159.8f, 390.4f)
                curveTo(1157.2f, 388.1f, 1157.4f, 388.7f, 1153.4f, 388.1f)
                curveTo(1149.3f, 421.6f, 1142.2f, 453.9f, 1136.2f, 487.1f)
                curveTo(1125.4f, 483.2f, 1120.0f, 481.2f, 1108.8f, 479.5f)
                curveTo(1107.3f, 474.6f, 1114.5f, 447.6f, 1116.2f, 440.0f)
                curveTo(1124.0f, 404.6f, 1126.1f, 369.6f, 1130.3f, 333.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF369B2E)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1248.7f, 376.2f)
                lineTo(1249.7f, 384.0f)
                curveTo(1244.2f, 383.9f, 1159.1f, 391.5f, 1160.0f, 391.0f)
                lineTo(1159.8f, 390.4f)
                curveTo(1157.2f, 388.1f, 1157.4f, 388.7f, 1153.4f, 388.1f)
                lineTo(1154.1f, 385.6f)
                curveTo(1162.6f, 378.7f, 1237.3f, 380.9f, 1248.7f, 376.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF298E18)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1206.8f, 346.4f)
                curveTo(1210.3f, 346.2f, 1213.9f, 345.2f, 1216.2f, 348.0f)
                curveTo(1216.2f, 351.9f, 1215.9f, 353.1f, 1215.1f, 356.9f)
                curveTo(1212.9f, 358.6f, 1174.0f, 362.4f, 1166.7f, 363.9f)
                curveTo(1162.7f, 364.0f, 1157.8f, 365.1f, 1155.9f, 361.2f)
                curveTo(1156.3f, 359.3f, 1156.1f, 358.2f, 1157.4f, 356.9f)
                curveTo(1164.2f, 350.0f, 1197.3f, 347.2f, 1206.8f, 346.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDDB52)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1000.6f, 684.6f)
                curveTo(1006.3f, 682.8f, 1027.8f, 674.3f, 1031.2f, 674.3f)
                curveTo(995.1f, 712.3f, 890.3f, 731.8f, 838.9f, 733.7f)
                curveTo(791.0f, 735.5f, 737.0f, 732.4f, 689.9f, 723.6f)
                curveTo(679.9f, 721.7f, 665.3f, 719.4f, 656.2f, 715.3f)
                curveTo(655.8f, 703.9f, 650.4f, 689.0f, 645.9f, 678.5f)
                curveTo(706.2f, 711.7f, 822.2f, 713.5f, 890.2f, 709.3f)
                curveTo(917.1f, 707.6f, 975.5f, 694.3f, 1000.6f, 684.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(782.3f, 421.5f)
                curveTo(784.3f, 421.0f, 784.8f, 421.2f, 786.8f, 421.4f)
                curveTo(789.9f, 425.9f, 787.3f, 441.6f, 786.9f, 448.4f)
                curveTo(802.5f, 441.3f, 815.4f, 433.0f, 832.8f, 425.5f)
                curveTo(836.4f, 431.8f, 840.9f, 437.3f, 846.0f, 442.5f)
                curveTo(827.2f, 454.3f, 803.9f, 464.5f, 784.2f, 476.5f)
                curveTo(784.3f, 483.5f, 784.1f, 489.2f, 783.7f, 496.2f)
                curveTo(800.9f, 494.9f, 816.7f, 492.9f, 834.2f, 491.8f)
                curveTo(843.6f, 490.9f, 853.0f, 490.3f, 862.3f, 489.8f)
                curveTo(861.8f, 498.6f, 861.4f, 504.0f, 859.7f, 512.5f)
                curveTo(830.3f, 513.6f, 781.5f, 517.2f, 753.7f, 523.2f)
                curveTo(754.3f, 502.0f, 755.4f, 480.3f, 756.4f, 459.1f)
                curveTo(756.9f, 447.0f, 758.7f, 434.4f, 759.3f, 422.1f)
                curveTo(767.5f, 422.1f, 774.1f, 422.1f, 782.3f, 421.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(719.6f, 424.6f)
                curveTo(720.1f, 425.6f, 721.6f, 428.3f, 721.9f, 429.2f)
                curveTo(727.0f, 434.0f, 736.1f, 433.9f, 743.0f, 434.5f)
                curveTo(735.9f, 447.3f, 731.0f, 454.5f, 722.0f, 466.1f)
                lineTo(722.3f, 467.2f)
                lineTo(725.6f, 467.9f)
                curveTo(726.2f, 470.5f, 726.2f, 473.1f, 726.0f, 475.8f)
                curveTo(724.2f, 497.9f, 730.3f, 522.7f, 729.7f, 544.1f)
                curveTo(723.9f, 547.8f, 710.8f, 548.8f, 703.6f, 549.4f)
                curveTo(700.4f, 529.6f, 701.4f, 512.7f, 699.3f, 493.8f)
                curveTo(694.0f, 501.6f, 687.7f, 511.4f, 681.4f, 518.2f)
                curveTo(672.9f, 513.9f, 666.5f, 512.3f, 658.7f, 508.7f)
                curveTo(664.3f, 499.6f, 672.4f, 493.1f, 678.3f, 485.2f)
                curveTo(686.5f, 474.1f, 708.3f, 451.0f, 712.7f, 439.2f)
                curveTo(711.4f, 436.9f, 712.9f, 437.1f, 709.7f, 433.0f)
                curveTo(712.2f, 430.5f, 716.8f, 426.9f, 719.6f, 424.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF298E18)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(719.6f, 424.6f)
                curveTo(720.1f, 425.6f, 721.6f, 428.3f, 721.9f, 429.2f)
                curveTo(716.8f, 432.3f, 716.1f, 434.3f, 712.7f, 439.2f)
                curveTo(711.4f, 436.9f, 712.9f, 437.1f, 709.7f, 433.0f)
                curveTo(712.2f, 430.5f, 716.8f, 426.9f, 719.6f, 424.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDDB52)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1070.3f, 638.4f)
                curveTo(1075.0f, 634.8f, 1079.6f, 634.9f, 1085.3f, 635.1f)
                lineTo(1084.6f, 636.0f)
                curveTo(1082.5f, 646.3f, 1085.4f, 652.5f, 1089.7f, 662.1f)
                curveTo(1082.7f, 673.9f, 1087.7f, 675.8f, 1085.2f, 685.0f)
                curveTo(1082.7f, 695.7f, 1078.4f, 705.2f, 1069.2f, 711.5f)
                curveTo(1066.7f, 713.2f, 1060.3f, 720.1f, 1059.6f, 720.3f)
                curveTo(1054.5f, 714.2f, 1050.4f, 710.0f, 1044.8f, 704.4f)
                curveTo(1043.3f, 689.8f, 1042.9f, 675.6f, 1049.5f, 662.2f)
                curveTo(1054.5f, 652.1f, 1059.2f, 642.5f, 1070.3f, 638.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF369B2E)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1070.3f, 638.4f)
                curveTo(1075.0f, 634.8f, 1079.6f, 634.9f, 1085.3f, 635.1f)
                lineTo(1084.6f, 636.0f)
                curveTo(1082.5f, 646.3f, 1085.4f, 652.5f, 1089.7f, 662.1f)
                curveTo(1082.7f, 673.9f, 1087.7f, 675.8f, 1085.2f, 685.0f)
                curveTo(1084.8f, 669.0f, 1083.6f, 662.6f, 1077.5f, 648.1f)
                curveTo(1074.8f, 643.5f, 1074.1f, 641.9f, 1070.3f, 638.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF298E18)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1070.3f, 638.4f)
                curveTo(1075.0f, 634.8f, 1079.6f, 634.9f, 1085.3f, 635.1f)
                lineTo(1084.6f, 636.0f)
                curveTo(1078.3f, 641.4f, 1085.3f, 641.2f, 1077.5f, 648.1f)
                curveTo(1074.8f, 643.5f, 1074.1f, 641.9f, 1070.3f, 638.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDDB52)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1042.6f, 590.0f)
                curveTo(1033.5f, 577.5f, 1028.5f, 545.0f, 1044.2f, 535.7f)
                curveTo(1047.4f, 533.7f, 1051.8f, 535.6f, 1055.2f, 536.7f)
                curveTo(1064.3f, 545.4f, 1071.9f, 558.7f, 1074.3f, 571.1f)
                curveTo(1074.7f, 575.4f, 1074.6f, 583.4f, 1076.3f, 586.5f)
                lineTo(1077.9f, 587.1f)
                curveTo(1079.2f, 586.4f, 1080.1f, 586.1f, 1080.8f, 584.8f)
                curveTo(1080.9f, 592.6f, 1080.7f, 603.2f, 1081.3f, 610.8f)
                lineTo(1069.8f, 610.6f)
                curveTo(1068.1f, 610.7f, 1066.5f, 610.3f, 1064.8f, 610.0f)
                curveTo(1060.0f, 610.8f, 1060.5f, 610.0f, 1057.4f, 612.8f)
                lineTo(1056.8f, 614.7f)
                curveTo(1050.9f, 606.9f, 1044.4f, 600.7f, 1037.4f, 594.0f)
                curveTo(1039.3f, 592.7f, 1040.8f, 591.5f, 1042.6f, 590.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF369B2E)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1074.3f, 571.1f)
                curveTo(1074.7f, 575.4f, 1074.6f, 583.4f, 1076.3f, 586.5f)
                lineTo(1077.9f, 587.1f)
                curveTo(1079.2f, 586.4f, 1080.1f, 586.1f, 1080.8f, 584.8f)
                curveTo(1080.9f, 592.6f, 1080.7f, 603.2f, 1081.3f, 610.8f)
                lineTo(1069.8f, 610.6f)
                curveTo(1069.9f, 607.4f, 1070.5f, 604.0f, 1071.2f, 600.8f)
                curveTo(1073.2f, 590.9f, 1073.9f, 581.3f, 1074.3f, 571.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF298E18)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1042.6f, 590.0f)
                curveTo(1050.5f, 598.3f, 1055.9f, 602.7f, 1064.8f, 610.0f)
                curveTo(1060.0f, 610.8f, 1060.5f, 610.0f, 1057.4f, 612.8f)
                lineTo(1056.8f, 614.7f)
                curveTo(1050.9f, 606.9f, 1044.4f, 600.7f, 1037.4f, 594.0f)
                curveTo(1039.3f, 592.7f, 1040.8f, 591.5f, 1042.6f, 590.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDDB52)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(890.0f, 556.6f)
                curveTo(894.9f, 545.3f, 896.1f, 543.9f, 905.7f, 536.2f)
                curveTo(914.4f, 546.7f, 920.2f, 555.0f, 919.1f, 569.9f)
                curveTo(918.9f, 573.6f, 914.1f, 590.9f, 912.6f, 593.9f)
                curveTo(911.8f, 594.5f, 908.9f, 596.6f, 908.2f, 596.9f)
                lineTo(902.9f, 598.6f)
                curveTo(896.1f, 599.4f, 889.1f, 598.3f, 882.2f, 599.6f)
                curveTo(871.6f, 597.0f, 845.9f, 580.7f, 856.2f, 568.6f)
                curveTo(859.8f, 566.5f, 864.3f, 567.1f, 868.5f, 567.2f)
                curveTo(869.2f, 567.3f, 883.7f, 564.8f, 887.4f, 564.7f)
                lineTo(888.1f, 564.7f)
                curveTo(890.5f, 561.4f, 889.7f, 561.4f, 890.0f, 556.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDDB52)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(890.0f, 556.6f)
                curveTo(894.9f, 545.3f, 896.1f, 543.9f, 905.7f, 536.2f)
                curveTo(914.4f, 546.7f, 920.2f, 555.0f, 919.1f, 569.9f)
                curveTo(918.9f, 573.6f, 914.1f, 590.9f, 912.6f, 593.9f)
                curveTo(904.1f, 585.4f, 892.4f, 568.5f, 890.0f, 556.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF369B2E)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(868.5f, 567.2f)
                curveTo(869.2f, 567.3f, 883.7f, 564.8f, 887.4f, 564.7f)
                lineTo(888.1f, 564.7f)
                curveTo(890.5f, 561.4f, 889.7f, 561.4f, 890.0f, 556.6f)
                curveTo(892.4f, 568.5f, 904.1f, 585.4f, 912.6f, 593.9f)
                curveTo(911.8f, 594.5f, 908.9f, 596.6f, 908.2f, 596.9f)
                curveTo(908.0f, 596.0f, 891.8f, 579.1f, 889.0f, 574.4f)
                curveTo(881.6f, 571.3f, 876.1f, 569.3f, 868.5f, 567.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDDB52)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(996.4f, 673.0f)
                curveTo(992.9f, 672.0f, 989.4f, 671.3f, 986.6f, 668.9f)
                curveTo(981.8f, 654.2f, 1019.0f, 631.6f, 1031.0f, 628.6f)
                curveTo(1030.7f, 628.7f, 1057.2f, 630.0f, 1059.7f, 630.0f)
                curveTo(1056.8f, 640.6f, 1055.2f, 645.2f, 1048.8f, 654.3f)
                curveTo(1047.6f, 658.6f, 1034.1f, 672.4f, 1031.2f, 674.3f)
                curveTo(1027.8f, 674.3f, 1006.3f, 682.8f, 1000.6f, 684.6f)
                curveTo(1001.4f, 681.3f, 998.1f, 676.2f, 996.4f, 673.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF298E18)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1048.8f, 654.3f)
                curveTo(1047.6f, 658.6f, 1034.1f, 672.4f, 1031.2f, 674.3f)
                curveTo(1027.8f, 674.3f, 1006.3f, 682.8f, 1000.6f, 684.6f)
                curveTo(1001.4f, 681.3f, 998.1f, 676.2f, 996.4f, 673.0f)
                curveTo(1020.1f, 671.8f, 1030.8f, 670.8f, 1048.8f, 654.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(702.7f, 399.2f)
                curveTo(710.5f, 395.3f, 716.4f, 391.7f, 722.7f, 385.7f)
                curveTo(730.0f, 392.9f, 731.5f, 395.6f, 735.4f, 404.7f)
                curveTo(730.6f, 406.8f, 719.3f, 413.7f, 715.2f, 416.9f)
                curveTo(717.3f, 419.8f, 717.9f, 420.6f, 719.3f, 423.9f)
                lineTo(719.6f, 424.6f)
                curveTo(716.8f, 426.9f, 712.2f, 430.5f, 709.7f, 433.0f)
                curveTo(705.4f, 435.7f, 700.3f, 439.7f, 696.1f, 442.8f)
                curveTo(694.5f, 438.3f, 693.7f, 434.9f, 692.7f, 430.3f)
                curveTo(683.4f, 434.2f, 675.9f, 438.1f, 667.9f, 444.2f)
                curveTo(664.8f, 438.3f, 660.6f, 431.5f, 657.3f, 425.6f)
                curveTo(664.0f, 423.4f, 673.8f, 420.8f, 676.3f, 413.4f)
                curveTo(676.3f, 409.4f, 673.7f, 407.5f, 671.3f, 403.8f)
                curveTo(673.3f, 399.4f, 688.6f, 389.8f, 693.4f, 388.1f)
                curveTo(698.4f, 390.2f, 700.4f, 394.4f, 702.7f, 399.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDDB52)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1082.2f, 612.6f)
                curveTo(1092.5f, 611.1f, 1096.7f, 606.2f, 1105.1f, 599.6f)
                lineTo(1108.5f, 604.7f)
                curveTo(1133.1f, 594.3f, 1152.3f, 598.6f, 1172.2f, 615.6f)
                curveTo(1157.8f, 629.5f, 1151.0f, 636.3f, 1130.0f, 635.8f)
                curveTo(1122.2f, 635.6f, 1089.5f, 630.2f, 1087.2f, 623.9f)
                curveTo(1086.8f, 619.5f, 1087.2f, 618.1f, 1085.6f, 614.0f)
                lineTo(1082.2f, 612.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF298E18)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1082.2f, 612.6f)
                curveTo(1092.5f, 611.1f, 1096.7f, 606.2f, 1105.1f, 599.6f)
                lineTo(1108.5f, 604.7f)
                curveTo(1102.3f, 608.8f, 1089.0f, 616.6f, 1087.2f, 623.9f)
                curveTo(1086.8f, 619.5f, 1087.2f, 618.1f, 1085.6f, 614.0f)
                lineTo(1082.2f, 612.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDDB52)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(982.6f, 594.8f)
                curveTo(981.6f, 590.6f, 981.2f, 591.6f, 982.5f, 587.9f)
                curveTo(985.4f, 584.8f, 988.6f, 582.8f, 993.0f, 582.3f)
                curveTo(1012.5f, 580.0f, 1022.2f, 583.2f, 1037.4f, 594.0f)
                curveTo(1044.4f, 600.7f, 1050.9f, 606.9f, 1056.8f, 614.7f)
                curveTo(1057.0f, 617.4f, 1057.3f, 618.1f, 1056.2f, 620.4f)
                curveTo(1048.6f, 626.1f, 1019.5f, 622.9f, 1008.9f, 622.3f)
                curveTo(1002.4f, 617.8f, 999.0f, 615.3f, 993.2f, 610.0f)
                curveTo(986.5f, 610.8f, 983.9f, 609.3f, 978.8f, 605.3f)
                curveTo(980.2f, 603.3f, 980.8f, 602.7f, 982.6f, 601.0f)
                curveTo(981.7f, 598.9f, 981.7f, 599.5f, 978.9f, 598.3f)
                curveTo(980.7f, 597.2f, 981.2f, 596.5f, 982.6f, 594.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF298E18)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(982.6f, 594.8f)
                curveTo(986.6f, 599.4f, 989.2f, 605.5f, 993.2f, 610.0f)
                curveTo(986.5f, 610.8f, 983.9f, 609.3f, 978.8f, 605.3f)
                curveTo(980.2f, 603.3f, 980.8f, 602.7f, 982.6f, 601.0f)
                curveTo(981.7f, 598.9f, 981.7f, 599.5f, 978.9f, 598.3f)
                curveTo(980.7f, 597.2f, 981.2f, 596.5f, 982.6f, 594.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(774.5f, 353.3f)
                curveTo(781.5f, 354.7f, 789.9f, 354.2f, 796.8f, 355.7f)
                curveTo(799.7f, 356.4f, 799.4f, 357.8f, 800.8f, 361.0f)
                lineTo(803.2f, 361.3f)
                curveTo(805.5f, 359.9f, 805.6f, 359.8f, 808.1f, 359.3f)
                curveTo(814.3f, 362.0f, 818.1f, 369.8f, 821.6f, 375.6f)
                curveTo(813.6f, 379.3f, 805.0f, 381.6f, 797.5f, 386.1f)
                curveTo(790.8f, 390.1f, 792.9f, 399.3f, 791.6f, 406.5f)
                curveTo(780.2f, 406.1f, 739.3f, 407.9f, 743.9f, 388.3f)
                curveTo(746.3f, 385.8f, 765.7f, 377.6f, 771.3f, 374.7f)
                curveTo(772.4f, 367.6f, 773.5f, 360.5f, 774.5f, 353.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(911.9f, 328.9f)
                curveTo(913.1f, 329.7f, 922.2f, 341.7f, 923.7f, 343.6f)
                curveTo(927.4f, 343.2f, 939.0f, 336.7f, 943.0f, 334.6f)
                curveTo(943.9f, 335.2f, 954.8f, 349.2f, 956.6f, 351.4f)
                curveTo(949.0f, 354.8f, 940.4f, 358.1f, 932.6f, 361.3f)
                curveTo(935.0f, 363.9f, 939.0f, 366.9f, 941.9f, 369.1f)
                curveTo(932.1f, 370.5f, 929.8f, 371.3f, 921.7f, 376.8f)
                curveTo(913.1f, 378.8f, 912.2f, 376.0f, 907.5f, 369.5f)
                curveTo(898.9f, 373.1f, 893.7f, 374.9f, 887.1f, 381.7f)
                curveTo(882.6f, 374.2f, 879.6f, 371.6f, 875.3f, 362.7f)
                curveTo(882.3f, 359.9f, 890.5f, 357.4f, 895.5f, 352.0f)
                curveTo(896.4f, 346.0f, 891.2f, 348.1f, 889.6f, 341.8f)
                curveTo(892.3f, 334.3f, 901.4f, 336.6f, 911.9f, 328.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDDB52)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1085.3f, 635.1f)
                curveTo(1091.0f, 634.3f, 1094.0f, 636.7f, 1099.0f, 637.4f)
                curveTo(1124.1f, 641.2f, 1142.6f, 657.3f, 1142.2f, 684.0f)
                curveTo(1142.2f, 686.8f, 1142.2f, 689.8f, 1142.1f, 692.7f)
                curveTo(1126.1f, 692.2f, 1111.8f, 690.2f, 1099.9f, 677.7f)
                curveTo(1095.6f, 673.2f, 1092.2f, 667.9f, 1089.7f, 662.1f)
                curveTo(1085.4f, 652.5f, 1082.5f, 646.3f, 1084.6f, 636.0f)
                lineTo(1085.3f, 635.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDDB52)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1080.8f, 584.8f)
                curveTo(1081.5f, 573.0f, 1084.6f, 563.3f, 1093.8f, 555.1f)
                curveTo(1104.3f, 545.8f, 1113.3f, 546.6f, 1126.0f, 547.3f)
                curveTo(1129.3f, 569.9f, 1121.3f, 584.5f, 1105.1f, 599.6f)
                curveTo(1096.7f, 606.2f, 1092.5f, 611.1f, 1082.2f, 612.6f)
                lineTo(1081.3f, 610.8f)
                curveTo(1080.7f, 603.2f, 1080.9f, 592.6f, 1080.8f, 584.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(994.7f, 319.5f)
                curveTo(1008.3f, 320.7f, 1020.1f, 322.8f, 1035.0f, 323.8f)
                curveTo(1038.3f, 326.7f, 1044.3f, 336.6f, 1046.9f, 340.7f)
                curveTo(1043.8f, 341.5f, 1036.6f, 343.3f, 1033.7f, 343.4f)
                curveTo(1013.8f, 344.4f, 1017.0f, 346.8f, 1012.5f, 362.8f)
                curveTo(999.9f, 358.6f, 997.5f, 361.5f, 982.4f, 353.7f)
                curveTo(979.6f, 355.0f, 975.0f, 357.8f, 972.3f, 357.4f)
                lineTo(964.9f, 343.9f)
                curveTo(965.2f, 334.2f, 983.1f, 334.3f, 990.8f, 333.7f)
                lineTo(994.7f, 319.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDDB52)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(905.4f, 605.7f)
                curveTo(908.7f, 606.7f, 910.6f, 606.9f, 912.9f, 609.6f)
                lineTo(914.0f, 612.9f)
                curveTo(916.5f, 613.7f, 918.8f, 611.5f, 920.7f, 610.1f)
                curveTo(921.6f, 625.6f, 924.5f, 625.5f, 926.2f, 635.4f)
                curveTo(925.3f, 638.7f, 925.9f, 639.8f, 922.3f, 640.9f)
                curveTo(921.3f, 641.2f, 917.8f, 642.3f, 917.4f, 643.4f)
                curveTo(914.8f, 650.1f, 907.5f, 665.7f, 899.1f, 665.7f)
                curveTo(889.0f, 662.0f, 891.7f, 644.6f, 892.2f, 637.0f)
                curveTo(890.6f, 634.6f, 887.7f, 631.3f, 885.8f, 629.0f)
                curveTo(890.9f, 625.2f, 902.8f, 611.9f, 905.4f, 605.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF298E18)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(905.4f, 605.7f)
                curveTo(908.7f, 606.7f, 910.6f, 606.9f, 912.9f, 609.6f)
                lineTo(914.0f, 612.9f)
                curveTo(905.2f, 612.5f, 896.1f, 630.0f, 892.2f, 637.0f)
                curveTo(890.6f, 634.6f, 887.7f, 631.3f, 885.8f, 629.0f)
                curveTo(890.9f, 625.2f, 902.8f, 611.9f, 905.4f, 605.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF298E18)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(914.0f, 612.9f)
                curveTo(916.5f, 613.7f, 918.8f, 611.5f, 920.7f, 610.1f)
                curveTo(921.6f, 625.6f, 924.5f, 625.5f, 926.2f, 635.4f)
                curveTo(925.3f, 638.7f, 925.9f, 639.8f, 922.3f, 640.9f)
                curveTo(920.5f, 632.4f, 913.8f, 621.4f, 914.0f, 612.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDDB52)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(882.2f, 599.6f)
                curveTo(889.1f, 598.3f, 896.1f, 599.4f, 902.9f, 598.6f)
                lineTo(902.5f, 603.1f)
                lineTo(905.4f, 605.7f)
                curveTo(902.8f, 611.9f, 890.9f, 625.2f, 885.8f, 629.0f)
                curveTo(878.2f, 628.9f, 856.5f, 640.5f, 852.2f, 626.2f)
                curveTo(853.9f, 614.4f, 867.8f, 606.3f, 878.5f, 604.1f)
                curveTo(881.8f, 600.3f, 885.4f, 601.9f, 888.5f, 601.0f)
                curveTo(885.8f, 601.0f, 885.2f, 600.9f, 882.6f, 599.8f)
                lineTo(882.2f, 599.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF298E18)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(882.2f, 599.6f)
                curveTo(889.1f, 598.3f, 896.1f, 599.4f, 902.9f, 598.6f)
                lineTo(902.5f, 603.1f)
                curveTo(895.1f, 603.2f, 885.8f, 603.1f, 878.5f, 604.1f)
                curveTo(881.8f, 600.3f, 885.4f, 601.9f, 888.5f, 601.0f)
                curveTo(885.8f, 601.0f, 885.2f, 600.9f, 882.6f, 599.8f)
                lineTo(882.2f, 599.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDDB52)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(922.6f, 594.9f)
                curveTo(929.8f, 590.7f, 935.2f, 587.4f, 942.0f, 582.6f)
                curveTo(946.6f, 585.3f, 951.5f, 585.4f, 955.4f, 587.1f)
                curveTo(961.9f, 591.6f, 963.0f, 588.3f, 969.0f, 590.4f)
                curveTo(970.6f, 591.0f, 976.0f, 596.4f, 978.9f, 598.3f)
                curveTo(981.7f, 599.5f, 981.7f, 598.9f, 982.6f, 601.0f)
                curveTo(980.8f, 602.7f, 980.2f, 603.3f, 978.8f, 605.3f)
                curveTo(978.1f, 606.4f, 977.1f, 607.8f, 976.4f, 608.9f)
                curveTo(965.0f, 615.5f, 935.7f, 610.5f, 925.9f, 601.6f)
                curveTo(925.2f, 596.7f, 926.1f, 598.4f, 922.6f, 594.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF298E18)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(922.6f, 594.9f)
                curveTo(929.8f, 590.7f, 935.2f, 587.4f, 942.0f, 582.6f)
                curveTo(946.6f, 585.3f, 951.5f, 585.4f, 955.4f, 587.1f)
                curveTo(943.6f, 590.5f, 931.9f, 591.0f, 925.9f, 601.6f)
                curveTo(925.2f, 596.7f, 926.1f, 598.4f, 922.6f, 594.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDDB52)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(920.7f, 610.1f)
                curveTo(939.0f, 608.8f, 948.7f, 618.1f, 957.9f, 632.6f)
                curveTo(958.1f, 638.0f, 959.0f, 648.2f, 956.3f, 652.6f)
                curveTo(948.9f, 656.4f, 928.8f, 641.6f, 926.2f, 635.4f)
                curveTo(924.5f, 625.5f, 921.6f, 625.6f, 920.7f, 610.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDDB52)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(941.6f, 549.1f)
                curveTo(946.3f, 549.0f, 952.1f, 549.7f, 956.8f, 550.2f)
                curveTo(955.2f, 566.5f, 954.2f, 572.0f, 942.0f, 582.6f)
                curveTo(935.2f, 587.4f, 929.8f, 590.7f, 922.6f, 594.9f)
                curveTo(919.8f, 574.0f, 925.9f, 562.2f, 941.6f, 549.1f)
                close()
            }
        }
        .build()
        return _standardRafflesia!!
    }

private var _standardRafflesia: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = StandardSenderAvatar.StandardRafflesia, contentDescription = "")
    }
}
