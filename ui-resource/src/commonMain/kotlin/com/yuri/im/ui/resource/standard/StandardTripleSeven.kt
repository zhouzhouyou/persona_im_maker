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

public val StandardSenderAvatar.StandardTripleSeven: ImageVector
    get() {
        if (_standardTripleSeven != null) {
            return _standardTripleSeven!!
        }
        _standardTripleSeven = Builder(name = "StandardTripleSeven", defaultWidth = 290.0.dp,
                defaultHeight = 259.0.dp, viewportWidth = 1160.0f, viewportHeight = 1036.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(87.4f, 67.4f)
                curveTo(129.3f, 63.3f, 187.5f, 62.7f, 229.6f, 61.8f)
                curveTo(266.8f, 60.6f, 303.9f, 59.2f, 341.1f, 57.6f)
                curveTo(368.7f, 56.6f, 396.6f, 56.2f, 424.1f, 55.2f)
                curveTo(444.0f, 54.4f, 467.3f, 51.1f, 487.6f, 49.5f)
                lineTo(677.0f, 34.4f)
                curveTo(800.8f, 24.6f, 924.9f, 16.4f, 1048.5f, 3.9f)
                lineTo(1089.6f, 104.2f)
                curveTo(1095.9f, 119.3f, 1112.1f, 155.5f, 1115.5f, 170.4f)
                curveTo(1118.2f, 181.8f, 1108.5f, 227.3f, 1106.1f, 241.3f)
                lineTo(1089.1f, 344.0f)
                curveTo(1083.3f, 377.5f, 1076.4f, 412.0f, 1072.8f, 446.0f)
                curveTo(1072.0f, 453.7f, 1073.0f, 466.1f, 1073.2f, 474.1f)
                curveTo(1083.0f, 472.8f, 1110.6f, 470.9f, 1120.3f, 471.5f)
                curveTo(1120.1f, 502.1f, 1120.2f, 532.8f, 1120.9f, 563.4f)
                curveTo(1121.3f, 583.0f, 1120.1f, 606.2f, 1121.9f, 625.5f)
                curveTo(1132.6f, 623.6f, 1149.5f, 620.2f, 1160.0f, 619.7f)
                lineTo(1160.0f, 696.8f)
                curveTo(1152.0f, 720.3f, 1152.9f, 743.5f, 1150.5f, 767.7f)
                curveTo(1148.4f, 788.2f, 1145.3f, 808.1f, 1144.2f, 828.8f)
                curveTo(1142.7f, 846.5f, 1141.3f, 864.5f, 1137.9f, 881.8f)
                curveTo(1137.1f, 886.1f, 1134.7f, 889.9f, 1130.7f, 891.5f)
                curveTo(1114.2f, 898.0f, 1096.9f, 903.0f, 1080.2f, 908.8f)
                lineTo(949.7f, 952.8f)
                curveTo(936.6f, 957.2f, 923.4f, 961.5f, 910.2f, 965.7f)
                curveTo(903.9f, 967.7f, 897.3f, 969.4f, 890.9f, 971.3f)
                curveTo(889.5f, 971.7f, 888.1f, 974.6f, 887.4f, 975.9f)
                curveTo(880.6f, 972.8f, 874.5f, 938.4f, 867.4f, 934.4f)
                curveTo(862.3f, 931.6f, 847.2f, 935.9f, 841.2f, 936.8f)
                curveTo(814.8f, 942.4f, 788.5f, 948.4f, 762.2f, 954.2f)
                lineTo(540.9f, 1003.0f)
                lineTo(434.1f, 1026.7f)
                curveTo(423.6f, 1029.0f, 401.9f, 1031.8f, 392.7f, 1036.0f)
                lineTo(348.2f, 1036.0f)
                curveTo(342.7f, 1033.6f, 318.1f, 1026.8f, 310.4f, 1024.4f)
                lineTo(200.8f, 990.8f)
                curveTo(189.2f, 987.3f, 165.0f, 981.0f, 155.3f, 975.6f)
                curveTo(154.7f, 970.2f, 187.6f, 931.0f, 185.1f, 926.3f)
                curveTo(180.1f, 916.8f, 133.2f, 884.8f, 123.9f, 878.6f)
                curveTo(135.6f, 848.0f, 144.4f, 816.3f, 155.4f, 785.4f)
                curveTo(162.7f, 764.7f, 151.8f, 727.0f, 147.3f, 704.9f)
                lineTo(127.2f, 606.4f)
                curveTo(122.0f, 581.7f, 118.0f, 554.6f, 111.6f, 530.3f)
                curveTo(110.1f, 524.6f, 100.2f, 503.7f, 97.0f, 496.5f)
                curveTo(86.5f, 472.3f, 75.5f, 448.2f, 64.3f, 424.3f)
                curveTo(56.1f, 406.7f, 8.0f, 294.4f, 0.0f, 287.6f)
                lineTo(0.0f, 279.5f)
                curveTo(5.4f, 276.4f, 21.1f, 231.6f, 24.8f, 222.0f)
                lineTo(66.9f, 113.4f)
                curveTo(71.3f, 102.2f, 80.6f, 74.2f, 87.4f, 67.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1036.2f, 58.4f)
                curveTo(1039.3f, 57.9f, 1040.5f, 58.0f, 1043.5f, 58.1f)
                curveTo(1045.9f, 59.7f, 1078.2f, 144.8f, 1082.7f, 155.1f)
                curveTo(1079.0f, 166.1f, 1076.7f, 181.4f, 1073.5f, 192.9f)
                curveTo(1067.7f, 213.5f, 1062.3f, 234.1f, 1056.9f, 254.8f)
                curveTo(1049.3f, 286.1f, 1035.7f, 319.5f, 1032.9f, 351.6f)
                curveTo(1029.3f, 391.5f, 1028.6f, 432.0f, 1024.6f, 472.0f)
                curveTo(1023.0f, 488.3f, 1024.0f, 506.4f, 1021.0f, 522.4f)
                curveTo(1037.0f, 520.9f, 1059.4f, 519.7f, 1073.8f, 513.9f)
                curveTo(1078.0f, 536.3f, 1078.9f, 561.5f, 1082.0f, 584.3f)
                curveTo(1084.0f, 598.8f, 1083.2f, 623.1f, 1089.0f, 636.3f)
                curveTo(1094.0f, 647.5f, 1104.9f, 659.2f, 1111.5f, 671.2f)
                curveTo(1110.9f, 675.9f, 1109.9f, 681.3f, 1108.9f, 686.0f)
                curveTo(1099.5f, 731.4f, 1092.7f, 777.6f, 1083.2f, 823.0f)
                curveTo(1065.6f, 830.1f, 1036.3f, 834.6f, 1016.8f, 838.8f)
                curveTo(994.3f, 843.6f, 968.9f, 849.9f, 946.4f, 853.7f)
                curveTo(936.3f, 848.6f, 927.1f, 843.0f, 916.4f, 839.0f)
                curveTo(893.0f, 844.0f, 865.8f, 852.0f, 842.4f, 857.8f)
                curveTo(825.2f, 862.0f, 797.3f, 868.8f, 781.2f, 874.7f)
                curveTo(776.1f, 867.9f, 773.5f, 863.8f, 770.7f, 856.0f)
                curveTo(745.2f, 862.9f, 713.6f, 881.8f, 687.4f, 890.2f)
                curveTo(670.9f, 881.5f, 669.6f, 879.1f, 650.3f, 872.1f)
                curveTo(640.7f, 877.8f, 633.5f, 886.7f, 626.6f, 895.3f)
                curveTo(612.9f, 897.3f, 598.7f, 900.3f, 584.8f, 902.4f)
                curveTo(513.0f, 913.0f, 441.2f, 922.7f, 369.1f, 931.3f)
                curveTo(360.6f, 932.2f, 334.6f, 937.1f, 329.2f, 936.1f)
                curveTo(316.8f, 933.8f, 289.2f, 921.3f, 277.7f, 915.6f)
                curveTo(274.5f, 910.3f, 272.5f, 905.9f, 270.0f, 900.3f)
                curveTo(260.1f, 877.3f, 247.9f, 847.8f, 236.7f, 825.8f)
                curveTo(240.4f, 803.7f, 248.5f, 780.7f, 250.1f, 758.4f)
                curveTo(250.8f, 748.2f, 242.3f, 730.9f, 238.9f, 720.1f)
                curveTo(235.1f, 708.3f, 231.1f, 695.8f, 227.7f, 683.8f)
                curveTo(225.2f, 675.4f, 218.6f, 659.8f, 217.6f, 651.9f)
                curveTo(215.0f, 631.1f, 219.9f, 606.4f, 223.3f, 585.6f)
                curveTo(227.5f, 562.9f, 227.0f, 538.3f, 232.6f, 516.0f)
                curveTo(239.1f, 490.8f, 250.7f, 465.7f, 259.2f, 441.0f)
                curveTo(265.6f, 422.6f, 273.7f, 404.9f, 280.0f, 386.5f)
                curveTo(269.3f, 393.5f, 250.8f, 401.5f, 237.8f, 409.2f)
                curveTo(200.8f, 389.6f, 204.5f, 393.7f, 189.7f, 355.1f)
                curveTo(177.5f, 323.4f, 165.5f, 291.7f, 153.8f, 259.8f)
                curveTo(149.3f, 247.6f, 138.6f, 216.8f, 132.1f, 206.9f)
                curveTo(135.7f, 200.7f, 180.8f, 144.4f, 186.7f, 141.3f)
                curveTo(194.1f, 137.2f, 236.0f, 134.4f, 247.8f, 133.4f)
                lineTo(318.3f, 127.0f)
                lineTo(531.1f, 106.4f)
                lineTo(844.0f, 76.7f)
                curveTo(908.2f, 70.6f, 971.8f, 62.8f, 1036.2f, 58.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEE006D)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(463.6f, 159.5f)
                curveTo(498.7f, 154.8f, 477.8f, 220.7f, 473.0f, 237.5f)
                curveTo(458.3f, 289.5f, 445.9f, 342.9f, 434.8f, 395.7f)
                curveTo(428.7f, 424.2f, 422.8f, 458.2f, 421.2f, 487.0f)
                curveTo(419.9f, 509.7f, 419.5f, 532.3f, 420.1f, 555.0f)
                curveTo(420.4f, 564.0f, 424.2f, 614.4f, 419.5f, 618.8f)
                curveTo(400.5f, 623.2f, 380.4f, 624.9f, 361.1f, 627.8f)
                curveTo(346.2f, 630.0f, 331.0f, 633.6f, 316.0f, 635.0f)
                curveTo(311.9f, 635.4f, 307.2f, 635.6f, 303.2f, 634.6f)
                curveTo(299.8f, 633.8f, 296.9f, 632.1f, 295.0f, 629.1f)
                curveTo(285.4f, 613.1f, 303.6f, 498.3f, 307.6f, 476.3f)
                curveTo(312.1f, 451.1f, 317.7f, 426.1f, 323.3f, 401.2f)
                curveTo(332.6f, 361.7f, 342.3f, 322.9f, 354.8f, 284.2f)
                curveTo(358.4f, 272.9f, 363.0f, 257.6f, 367.4f, 247.0f)
                curveTo(352.9f, 249.8f, 336.9f, 248.8f, 321.5f, 252.8f)
                curveTo(308.6f, 275.2f, 299.3f, 304.9f, 286.4f, 328.4f)
                curveTo(279.3f, 341.4f, 266.7f, 379.5f, 245.1f, 367.5f)
                curveTo(242.1f, 365.8f, 238.2f, 357.6f, 237.1f, 354.4f)
                curveTo(226.6f, 321.9f, 219.2f, 287.2f, 209.7f, 254.6f)
                curveTo(197.5f, 213.1f, 202.7f, 182.1f, 253.2f, 178.5f)
                curveTo(323.2f, 173.5f, 393.5f, 165.4f, 463.6f, 159.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEE006D)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(749.7f, 131.4f)
                curveTo(782.7f, 124.9f, 757.5f, 200.4f, 754.0f, 214.5f)
                curveTo(733.2f, 297.3f, 709.5f, 382.9f, 703.0f, 468.2f)
                curveTo(701.9f, 484.8f, 701.5f, 501.5f, 701.9f, 518.1f)
                curveTo(702.1f, 531.9f, 706.6f, 570.4f, 703.0f, 579.8f)
                curveTo(692.0f, 590.0f, 602.4f, 597.2f, 583.9f, 596.6f)
                curveTo(582.6f, 593.2f, 580.0f, 586.4f, 580.1f, 583.1f)
                curveTo(580.9f, 515.0f, 594.8f, 440.3f, 609.2f, 374.6f)
                curveTo(614.4f, 350.1f, 621.7f, 328.1f, 627.4f, 304.3f)
                curveTo(634.4f, 274.7f, 644.7f, 246.6f, 652.0f, 217.7f)
                curveTo(639.0f, 220.0f, 624.4f, 219.2f, 610.1f, 221.9f)
                curveTo(604.9f, 231.4f, 600.3f, 240.7f, 595.8f, 250.5f)
                curveTo(583.7f, 275.4f, 574.3f, 306.7f, 558.3f, 329.2f)
                curveTo(542.4f, 351.4f, 527.3f, 325.9f, 523.4f, 309.8f)
                curveTo(515.8f, 278.5f, 507.5f, 247.9f, 499.6f, 216.8f)
                curveTo(494.0f, 194.8f, 491.7f, 182.9f, 507.5f, 164.2f)
                curveTo(517.3f, 152.5f, 528.3f, 152.3f, 542.3f, 150.6f)
                curveTo(563.1f, 148.2f, 584.0f, 146.1f, 604.9f, 144.3f)
                lineTo(749.7f, 131.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEE006D)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1021.4f, 104.4f)
                curveTo(1043.7f, 103.1f, 1041.0f, 126.1f, 1038.5f, 141.5f)
                curveTo(1034.0f, 169.5f, 1024.4f, 197.8f, 1017.5f, 225.4f)
                curveTo(1007.7f, 264.0f, 998.5f, 302.9f, 990.2f, 341.9f)
                curveTo(976.9f, 406.9f, 975.9f, 479.8f, 978.4f, 546.4f)
                curveTo(967.3f, 548.6f, 952.7f, 553.8f, 942.0f, 554.7f)
                curveTo(916.8f, 556.8f, 884.0f, 565.7f, 859.7f, 559.6f)
                curveTo(849.1f, 528.6f, 877.9f, 379.7f, 887.1f, 341.2f)
                curveTo(900.2f, 286.1f, 913.2f, 243.7f, 929.9f, 189.8f)
                curveTo(916.1f, 190.3f, 902.3f, 191.4f, 888.5f, 192.4f)
                curveTo(875.0f, 217.8f, 866.1f, 245.5f, 852.6f, 271.1f)
                curveTo(846.6f, 282.0f, 838.2f, 304.7f, 824.2f, 306.9f)
                curveTo(811.0f, 308.8f, 806.2f, 287.1f, 803.9f, 278.2f)
                curveTo(796.4f, 249.1f, 789.2f, 220.5f, 782.9f, 191.2f)
                curveTo(780.3f, 179.2f, 776.0f, 165.2f, 779.0f, 152.8f)
                curveTo(782.4f, 141.1f, 794.6f, 127.8f, 806.7f, 124.9f)
                curveTo(825.5f, 121.4f, 845.8f, 119.7f, 865.0f, 118.4f)
                curveTo(916.7f, 114.7f, 969.9f, 107.9f, 1021.4f, 104.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEE006D)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(408.4f, 760.4f)
                curveTo(424.8f, 758.6f, 466.6f, 759.1f, 454.4f, 786.5f)
                curveTo(446.6f, 804.0f, 425.1f, 788.8f, 413.4f, 787.8f)
                curveTo(390.9f, 785.8f, 358.5f, 792.4f, 337.3f, 799.5f)
                lineTo(338.2f, 811.6f)
                curveTo(346.8f, 812.9f, 354.6f, 812.8f, 363.1f, 812.9f)
                curveTo(389.0f, 813.3f, 457.6f, 795.6f, 461.9f, 836.1f)
                curveTo(466.9f, 884.1f, 382.2f, 889.3f, 350.2f, 892.1f)
                curveTo(337.2f, 891.8f, 306.0f, 892.5f, 302.0f, 876.6f)
                curveTo(300.8f, 871.7f, 301.6f, 866.6f, 304.3f, 862.4f)
                curveTo(312.0f, 850.1f, 327.7f, 858.9f, 338.4f, 860.8f)
                curveTo(358.2f, 864.2f, 379.4f, 861.6f, 398.8f, 856.9f)
                curveTo(404.6f, 855.6f, 420.0f, 851.5f, 423.0f, 846.6f)
                curveTo(416.7f, 822.2f, 294.8f, 865.6f, 294.7f, 812.0f)
                curveTo(294.7f, 766.4f, 376.2f, 762.8f, 408.4f, 760.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEE006D)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(584.9f, 742.6f)
                curveTo(590.1f, 742.0f, 595.3f, 741.6f, 600.1f, 742.3f)
                curveTo(605.3f, 743.0f, 610.0f, 752.8f, 607.6f, 756.3f)
                curveTo(593.5f, 776.7f, 553.2f, 771.8f, 531.0f, 776.9f)
                curveTo(525.5f, 778.2f, 519.6f, 777.0f, 515.1f, 779.4f)
                curveTo(512.2f, 782.8f, 512.8f, 788.2f, 516.1f, 791.1f)
                curveTo(520.2f, 792.3f, 586.2f, 781.8f, 594.6f, 780.5f)
                curveTo(596.2f, 781.1f, 602.7f, 784.2f, 603.5f, 785.0f)
                curveTo(628.4f, 814.8f, 532.6f, 818.3f, 516.8f, 819.7f)
                curveTo(517.2f, 825.4f, 518.1f, 829.8f, 519.1f, 835.4f)
                curveTo(534.5f, 834.0f, 558.6f, 829.5f, 574.9f, 827.3f)
                curveTo(584.9f, 825.6f, 603.4f, 822.1f, 611.9f, 827.8f)
                curveTo(621.8f, 834.4f, 614.3f, 848.5f, 604.4f, 851.4f)
                curveTo(590.9f, 855.3f, 577.6f, 856.0f, 563.9f, 857.9f)
                lineTo(488.1f, 868.8f)
                curveTo(481.9f, 865.0f, 480.0f, 863.3f, 475.1f, 858.3f)
                curveTo(473.7f, 848.5f, 474.0f, 838.4f, 472.9f, 828.5f)
                curveTo(471.0f, 810.4f, 467.3f, 791.5f, 467.3f, 773.4f)
                curveTo(467.2f, 770.4f, 467.1f, 766.2f, 469.1f, 763.7f)
                curveTo(480.4f, 749.3f, 564.7f, 744.5f, 584.9f, 742.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF02D458)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(526.5f, 623.4f)
                curveTo(533.8f, 622.4f, 541.2f, 622.5f, 548.4f, 623.6f)
                curveTo(564.7f, 626.2f, 573.2f, 631.6f, 582.7f, 644.6f)
                curveTo(583.3f, 649.5f, 583.3f, 655.1f, 583.5f, 660.1f)
                curveTo(578.9f, 668.8f, 575.0f, 672.9f, 568.1f, 679.8f)
                curveTo(587.6f, 693.0f, 587.0f, 698.1f, 589.4f, 720.8f)
                curveTo(581.6f, 724.8f, 570.4f, 728.6f, 561.7f, 729.5f)
                curveTo(538.9f, 732.2f, 544.2f, 705.7f, 531.3f, 695.1f)
                curveTo(524.1f, 689.2f, 518.3f, 690.9f, 509.5f, 691.9f)
                lineTo(492.1f, 693.1f)
                curveTo(494.3f, 706.4f, 494.7f, 723.4f, 493.9f, 736.7f)
                curveTo(481.8f, 738.3f, 468.3f, 741.7f, 456.2f, 742.0f)
                curveTo(450.4f, 726.7f, 445.8f, 661.5f, 444.7f, 642.5f)
                curveTo(461.3f, 626.7f, 503.4f, 626.4f, 526.5f, 623.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.7f, 644.3f)
                curveTo(519.8f, 643.4f, 524.5f, 643.0f, 530.3f, 647.3f)
                curveTo(531.7f, 649.9f, 531.6f, 648.7f, 530.6f, 651.9f)
                curveTo(525.5f, 657.7f, 515.2f, 658.6f, 507.3f, 660.2f)
                curveTo(500.5f, 661.7f, 494.1f, 664.3f, 488.4f, 659.9f)
                curveTo(486.4f, 656.7f, 486.7f, 652.2f, 486.5f, 648.4f)
                curveTo(495.3f, 647.3f, 504.0f, 646.0f, 512.7f, 644.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEE006D)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(887.7f, 699.4f)
                curveTo(893.6f, 698.8f, 904.8f, 697.6f, 909.3f, 702.6f)
                curveTo(943.0f, 741.2f, 820.7f, 723.7f, 824.1f, 743.6f)
                curveTo(833.5f, 756.2f, 892.0f, 733.3f, 908.2f, 740.4f)
                curveTo(913.4f, 742.7f, 915.7f, 749.2f, 917.9f, 754.1f)
                curveTo(917.6f, 754.4f, 917.4f, 754.7f, 917.1f, 754.9f)
                curveTo(901.1f, 771.6f, 852.0f, 774.8f, 829.0f, 775.4f)
                curveTo(828.8f, 780.8f, 829.0f, 786.5f, 829.0f, 791.9f)
                curveTo(843.8f, 789.8f, 858.5f, 787.5f, 873.2f, 785.1f)
                curveTo(885.8f, 783.0f, 899.6f, 780.4f, 912.2f, 780.9f)
                curveTo(918.3f, 784.6f, 920.5f, 786.8f, 925.1f, 791.9f)
                curveTo(923.4f, 795.2f, 921.5f, 798.8f, 919.0f, 801.5f)
                curveTo(909.2f, 811.8f, 821.6f, 822.4f, 804.5f, 822.7f)
                curveTo(798.1f, 822.8f, 795.3f, 820.4f, 790.9f, 816.2f)
                curveTo(788.8f, 807.8f, 788.5f, 796.5f, 787.5f, 787.8f)
                curveTo(785.0f, 766.8f, 784.3f, 744.9f, 781.6f, 724.0f)
                curveTo(783.2f, 722.1f, 789.6f, 715.3f, 791.3f, 714.9f)
                curveTo(820.2f, 708.7f, 858.9f, 703.8f, 887.7f, 699.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEE006D)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1040.1f, 678.2f)
                curveTo(1054.8f, 677.4f, 1064.9f, 673.9f, 1066.2f, 691.8f)
                curveTo(1068.3f, 720.4f, 1075.1f, 753.7f, 1071.9f, 782.4f)
                curveTo(1063.1f, 788.6f, 1057.0f, 790.4f, 1046.7f, 791.8f)
                curveTo(1035.8f, 787.5f, 982.4f, 750.1f, 973.4f, 741.2f)
                curveTo(974.3f, 758.7f, 978.1f, 770.1f, 978.2f, 790.7f)
                curveTo(974.1f, 796.8f, 971.7f, 798.1f, 965.2f, 801.5f)
                curveTo(954.7f, 804.4f, 948.2f, 803.5f, 938.5f, 799.9f)
                curveTo(934.7f, 784.9f, 926.1f, 704.9f, 935.5f, 695.9f)
                curveTo(942.8f, 692.3f, 957.9f, 693.8f, 966.5f, 694.2f)
                curveTo(978.4f, 703.0f, 1019.3f, 734.5f, 1031.0f, 740.0f)
                curveTo(1029.5f, 722.8f, 1027.6f, 705.7f, 1025.2f, 688.6f)
                curveTo(1030.7f, 682.3f, 1032.3f, 680.9f, 1040.1f, 678.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF02D458)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(743.6f, 595.4f)
                curveTo(758.4f, 592.5f, 780.5f, 601.3f, 784.5f, 617.0f)
                curveTo(799.7f, 676.9f, 734.2f, 671.1f, 696.6f, 677.4f)
                curveTo(696.6f, 685.2f, 698.0f, 695.6f, 698.2f, 704.2f)
                curveTo(696.2f, 706.4f, 693.0f, 709.2f, 690.8f, 711.4f)
                curveTo(679.4f, 715.8f, 669.7f, 713.6f, 658.0f, 711.7f)
                curveTo(657.3f, 707.9f, 657.1f, 703.9f, 656.7f, 700.1f)
                curveTo(654.0f, 672.4f, 652.3f, 644.4f, 647.7f, 617.0f)
                curveTo(662.4f, 604.1f, 673.9f, 604.6f, 692.6f, 602.1f)
                curveTo(709.6f, 599.7f, 726.6f, 597.6f, 743.6f, 595.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(732.3f, 626.4f)
                curveTo(736.9f, 624.9f, 744.9f, 627.8f, 747.3f, 632.6f)
                curveTo(746.5f, 643.9f, 719.0f, 646.4f, 709.8f, 648.0f)
                lineTo(694.6f, 650.7f)
                curveTo(693.3f, 643.6f, 691.0f, 637.4f, 694.5f, 631.2f)
                curveTo(695.5f, 630.3f, 697.6f, 628.6f, 698.9f, 628.6f)
                curveTo(710.3f, 628.2f, 721.0f, 627.6f, 732.3f, 626.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF02D458)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1031.7f, 558.4f)
                curveTo(1046.8f, 556.9f, 1055.9f, 561.1f, 1050.8f, 578.0f)
                curveTo(1043.1f, 587.5f, 972.5f, 589.4f, 971.3f, 590.7f)
                curveTo(934.7f, 632.6f, 1069.4f, 570.9f, 1049.7f, 616.1f)
                curveTo(1042.5f, 632.8f, 977.1f, 627.0f, 970.2f, 638.5f)
                curveTo(969.7f, 642.1f, 969.6f, 642.6f, 970.7f, 646.1f)
                curveTo(975.2f, 648.9f, 999.9f, 642.7f, 1009.2f, 641.9f)
                curveTo(1024.0f, 639.9f, 1043.4f, 636.1f, 1057.8f, 638.2f)
                curveTo(1058.1f, 643.3f, 1059.2f, 650.0f, 1057.3f, 654.9f)
                curveTo(1056.4f, 657.5f, 1055.1f, 658.7f, 1052.6f, 659.8f)
                curveTo(1043.2f, 663.9f, 964.6f, 674.5f, 953.2f, 673.6f)
                curveTo(948.7f, 673.2f, 943.3f, 670.5f, 939.1f, 668.9f)
                curveTo(936.8f, 659.5f, 936.2f, 639.7f, 935.3f, 628.9f)
                curveTo(933.9f, 613.5f, 931.0f, 594.9f, 930.7f, 579.8f)
                curveTo(932.5f, 578.1f, 936.0f, 574.9f, 938.3f, 574.2f)
                curveTo(966.7f, 565.3f, 1002.5f, 562.5f, 1031.7f, 558.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF02D458)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(411.0f, 638.4f)
                curveTo(421.3f, 637.7f, 433.1f, 637.5f, 436.2f, 650.7f)
                curveTo(436.7f, 653.1f, 435.3f, 657.4f, 433.5f, 659.0f)
                curveTo(421.0f, 669.6f, 390.6f, 669.7f, 374.7f, 671.2f)
                curveTo(374.7f, 675.0f, 374.9f, 678.5f, 375.3f, 682.3f)
                curveTo(377.6f, 702.6f, 378.6f, 723.0f, 380.1f, 743.4f)
                curveTo(366.2f, 757.2f, 358.2f, 757.9f, 339.7f, 755.4f)
                curveTo(337.0f, 745.6f, 335.2f, 727.5f, 334.2f, 717.2f)
                curveTo(333.0f, 703.2f, 332.6f, 691.9f, 330.7f, 677.6f)
                curveTo(313.9f, 678.8f, 292.5f, 684.1f, 277.1f, 684.4f)
                curveTo(264.7f, 674.4f, 263.6f, 660.9f, 280.9f, 655.1f)
                curveTo(289.4f, 652.3f, 304.1f, 651.5f, 313.3f, 650.4f)
                curveTo(346.5f, 646.2f, 378.1f, 645.2f, 411.0f, 638.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEE006D)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(747.4f, 718.2f)
                curveTo(760.3f, 716.7f, 766.0f, 722.0f, 774.1f, 730.9f)
                curveTo(750.7f, 761.4f, 741.1f, 805.4f, 715.2f, 833.2f)
                curveTo(694.0f, 855.9f, 658.9f, 798.8f, 646.6f, 783.4f)
                curveTo(636.9f, 771.6f, 627.6f, 762.9f, 619.5f, 749.5f)
                curveTo(627.8f, 736.8f, 627.8f, 738.3f, 642.7f, 736.3f)
                curveTo(645.0f, 734.4f, 646.2f, 733.0f, 649.1f, 732.5f)
                curveTo(666.7f, 737.1f, 689.3f, 787.1f, 701.4f, 786.3f)
                curveTo(713.4f, 777.3f, 725.3f, 731.8f, 739.9f, 721.2f)
                curveTo(741.5f, 720.0f, 745.3f, 718.8f, 747.4f, 718.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF02D458)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(807.8f, 586.2f)
                curveTo(815.1f, 585.7f, 826.2f, 583.9f, 832.3f, 588.8f)
                curveTo(836.9f, 592.4f, 839.4f, 654.8f, 840.4f, 664.8f)
                curveTo(863.4f, 662.4f, 886.2f, 656.6f, 909.3f, 655.5f)
                curveTo(926.7f, 654.6f, 926.0f, 660.0f, 926.1f, 674.3f)
                curveTo(919.7f, 677.4f, 917.5f, 678.3f, 910.8f, 680.1f)
                curveTo(897.1f, 683.7f, 814.3f, 693.6f, 804.8f, 688.9f)
                curveTo(802.4f, 686.1f, 800.5f, 681.1f, 800.2f, 677.5f)
                curveTo(798.2f, 649.1f, 795.4f, 620.4f, 792.8f, 592.0f)
                curveTo(797.8f, 590.1f, 802.8f, 588.2f, 807.8f, 586.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF02D458)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(610.1f, 614.4f)
                curveTo(617.4f, 613.9f, 626.6f, 614.0f, 634.1f, 613.8f)
                curveTo(635.7f, 637.5f, 644.5f, 697.2f, 642.3f, 716.1f)
                curveTo(637.5f, 717.5f, 634.1f, 718.1f, 629.3f, 719.0f)
                curveTo(620.2f, 719.7f, 611.2f, 719.7f, 602.1f, 719.7f)
                curveTo(599.7f, 692.9f, 592.3f, 642.5f, 594.8f, 617.7f)
                curveTo(600.0f, 616.0f, 604.7f, 615.3f, 610.1f, 614.4f)
                close()
            }
        }
        .build()
        return _standardTripleSeven!!
    }

private var _standardTripleSeven: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = StandardSenderAvatar.StandardTripleSeven, contentDescription = "")
    }
}
