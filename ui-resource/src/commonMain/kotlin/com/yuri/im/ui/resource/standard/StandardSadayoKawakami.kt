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

public val StandardSenderAvatar.StandardSadayoKawakami: ImageVector
    get() {
        if (_standardSadayoKawakami != null) {
            return _standardSadayoKawakami!!
        }
        _standardSadayoKawakami = Builder(name = "StandardSadayoKawakami", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 1024.0f, viewportHeight = 1024.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.9f, 158.7f)
                curveTo(228.5f, 161.5f, 232.1f, 165.0f, 236.4f, 166.0f)
                lineTo(238.3f, 165.3f)
                curveTo(239.4f, 162.3f, 239.7f, 159.9f, 242.3f, 158.3f)
                curveTo(247.4f, 158.6f, 243.9f, 161.6f, 249.3f, 160.3f)
                curveTo(253.5f, 156.1f, 256.5f, 151.7f, 260.3f, 147.2f)
                curveTo(268.8f, 137.5f, 278.5f, 129.0f, 289.2f, 121.8f)
                curveTo(308.8f, 108.9f, 333.9f, 99.5f, 356.6f, 94.1f)
                curveTo(372.7f, 90.3f, 383.4f, 84.7f, 398.4f, 78.1f)
                curveTo(416.9f, 69.8f, 436.8f, 65.5f, 457.0f, 65.4f)
                curveTo(486.1f, 65.4f, 510.0f, 72.8f, 538.0f, 78.0f)
                curveTo(545.6f, 79.4f, 558.8f, 78.1f, 566.9f, 77.6f)
                curveTo(586.5f, 76.5f, 601.0f, 79.2f, 619.1f, 86.5f)
                curveTo(634.4f, 92.6f, 647.9f, 99.7f, 660.4f, 110.9f)
                curveTo(662.9f, 113.1f, 671.0f, 122.0f, 674.6f, 123.9f)
                curveTo(675.1f, 123.5f, 675.6f, 123.2f, 676.0f, 122.9f)
                lineTo(678.2f, 118.1f)
                lineTo(680.1f, 117.4f)
                curveTo(695.1f, 125.4f, 701.5f, 167.6f, 722.4f, 127.7f)
                curveTo(725.4f, 122.1f, 726.1f, 118.2f, 727.4f, 112.1f)
                curveTo(739.8f, 130.4f, 744.3f, 141.8f, 737.1f, 164.0f)
                curveTo(747.4f, 181.8f, 746.8f, 196.8f, 753.1f, 214.3f)
                curveTo(795.9f, 241.0f, 793.8f, 204.5f, 789.4f, 173.8f)
                curveTo(800.8f, 188.3f, 824.2f, 217.4f, 822.1f, 235.8f)
                curveTo(821.1f, 244.7f, 813.5f, 251.4f, 809.7f, 258.8f)
                curveTo(816.3f, 266.6f, 823.0f, 272.7f, 829.0f, 280.8f)
                curveTo(842.6f, 299.4f, 844.3f, 317.8f, 849.4f, 339.0f)
                curveTo(851.4f, 347.3f, 861.3f, 364.0f, 865.3f, 373.6f)
                curveTo(869.5f, 373.0f, 874.3f, 372.6f, 878.5f, 371.9f)
                curveTo(892.5f, 361.2f, 893.4f, 359.7f, 898.9f, 342.7f)
                curveTo(903.9f, 355.9f, 911.5f, 372.2f, 905.3f, 385.8f)
                curveTo(899.8f, 397.7f, 886.8f, 403.5f, 877.6f, 411.1f)
                curveTo(893.7f, 441.9f, 892.0f, 458.2f, 886.2f, 492.8f)
                curveTo(906.5f, 541.9f, 912.2f, 593.2f, 878.2f, 638.6f)
                curveTo(885.6f, 638.9f, 893.9f, 639.2f, 901.2f, 640.2f)
                curveTo(888.3f, 650.8f, 884.4f, 667.4f, 871.4f, 676.1f)
                curveTo(861.3f, 682.8f, 842.9f, 685.7f, 831.0f, 687.8f)
                curveTo(830.2f, 691.9f, 829.3f, 696.1f, 828.5f, 700.2f)
                curveTo(821.0f, 737.5f, 793.1f, 755.0f, 758.6f, 765.2f)
                curveTo(759.5f, 757.9f, 760.7f, 751.1f, 758.0f, 744.0f)
                lineTo(756.3f, 742.3f)
                lineTo(754.4f, 742.4f)
                curveTo(749.1f, 748.5f, 745.3f, 754.6f, 739.0f, 759.7f)
                curveTo(726.3f, 769.9f, 713.3f, 771.5f, 698.1f, 775.5f)
                curveTo(697.1f, 769.3f, 693.8f, 749.4f, 685.6f, 750.3f)
                curveTo(674.3f, 763.4f, 696.8f, 811.0f, 709.4f, 820.5f)
                curveTo(729.5f, 835.7f, 762.2f, 851.1f, 788.0f, 851.5f)
                curveTo(790.0f, 851.4f, 797.1f, 849.6f, 799.3f, 849.0f)
                curveTo(805.4f, 852.0f, 811.3f, 854.9f, 817.3f, 858.2f)
                curveTo(840.6f, 870.8f, 866.0f, 881.8f, 890.9f, 891.0f)
                curveTo(902.6f, 895.3f, 914.5f, 899.2f, 926.6f, 902.7f)
                curveTo(954.8f, 910.6f, 992.1f, 918.2f, 1003.8f, 951.4f)
                curveTo(1009.0f, 966.2f, 1005.0f, 992.0f, 1006.4f, 1008.3f)
                lineTo(458.7f, 1008.5f)
                curveTo(351.6f, 1008.9f, 244.5f, 1008.7f, 137.3f, 1007.9f)
                curveTo(144.1f, 977.3f, 146.2f, 938.5f, 176.3f, 920.8f)
                curveTo(187.8f, 914.0f, 206.5f, 907.6f, 219.6f, 903.7f)
                curveTo(257.6f, 892.3f, 292.6f, 874.8f, 329.6f, 860.6f)
                curveTo(343.3f, 855.4f, 357.2f, 847.7f, 372.1f, 847.0f)
                curveTo(377.5f, 846.8f, 391.7f, 851.3f, 393.8f, 845.4f)
                curveTo(388.4f, 841.5f, 371.4f, 839.3f, 363.8f, 835.5f)
                curveTo(350.8f, 829.0f, 341.6f, 822.1f, 332.8f, 810.5f)
                curveTo(318.5f, 810.5f, 303.4f, 809.6f, 289.6f, 805.4f)
                curveTo(276.1f, 810.7f, 262.4f, 817.1f, 247.6f, 814.8f)
                curveTo(220.6f, 810.6f, 197.7f, 787.1f, 188.0f, 762.5f)
                curveTo(187.3f, 760.7f, 186.7f, 758.8f, 186.3f, 756.9f)
                curveTo(196.1f, 756.8f, 199.4f, 755.3f, 208.6f, 751.8f)
                curveTo(202.3f, 732.7f, 194.2f, 715.3f, 189.9f, 695.7f)
                curveTo(187.2f, 683.4f, 187.4f, 672.7f, 186.0f, 660.7f)
                curveTo(174.8f, 662.8f, 163.9f, 661.2f, 153.2f, 658.0f)
                curveTo(126.7f, 650.2f, 121.1f, 623.3f, 113.2f, 600.2f)
                curveTo(117.7f, 603.7f, 121.9f, 607.0f, 127.1f, 609.4f)
                curveTo(174.9f, 631.2f, 183.2f, 600.2f, 184.6f, 560.6f)
                curveTo(182.8f, 560.1f, 175.6f, 558.0f, 174.4f, 557.2f)
                curveTo(169.4f, 551.6f, 150.2f, 544.5f, 152.2f, 536.6f)
                curveTo(156.2f, 534.3f, 157.0f, 535.2f, 162.1f, 535.4f)
                curveTo(171.1f, 537.3f, 176.8f, 537.2f, 185.7f, 538.1f)
                curveTo(184.1f, 518.4f, 180.5f, 500.7f, 178.1f, 481.2f)
                curveTo(177.2f, 474.2f, 180.9f, 458.2f, 178.8f, 453.4f)
                curveTo(175.8f, 446.7f, 165.9f, 439.1f, 162.4f, 431.0f)
                curveTo(145.1f, 390.0f, 164.8f, 369.3f, 173.7f, 336.1f)
                curveTo(154.2f, 317.2f, 153.1f, 311.3f, 147.4f, 285.2f)
                curveTo(154.4f, 292.3f, 169.0f, 306.9f, 179.6f, 300.2f)
                curveTo(182.0f, 291.5f, 183.8f, 278.9f, 185.7f, 269.7f)
                curveTo(192.7f, 235.8f, 203.9f, 217.2f, 223.3f, 190.0f)
                curveTo(221.4f, 180.7f, 218.1f, 161.2f, 221.1f, 152.1f)
                lineTo(222.5f, 151.7f)
                curveTo(224.2f, 154.4f, 224.3f, 155.7f, 224.9f, 158.7f)
                close()
                moveTo(389.8f, 194.6f)
                curveTo(404.6f, 203.6f, 410.4f, 181.8f, 402.4f, 177.6f)
                curveTo(402.4f, 181.7f, 402.8f, 186.8f, 400.9f, 190.4f)
                curveTo(397.2f, 192.7f, 394.8f, 190.3f, 391.5f, 188.2f)
                curveTo(389.4f, 190.3f, 390.0f, 191.0f, 389.8f, 194.6f)
                close()
                moveTo(343.5f, 281.7f)
                lineTo(344.9f, 280.0f)
                curveTo(340.8f, 275.9f, 334.7f, 272.0f, 328.9f, 271.6f)
                lineTo(327.3f, 274.0f)
                curveTo(328.8f, 276.3f, 338.7f, 278.8f, 343.5f, 281.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(503.5f, 281.3f)
                curveTo(519.0f, 279.6f, 530.3f, 290.9f, 539.8f, 301.5f)
                curveTo(516.7f, 304.2f, 499.3f, 316.7f, 481.9f, 331.3f)
                curveTo(473.0f, 338.9f, 463.4f, 346.3f, 457.1f, 356.1f)
                curveTo(455.6f, 358.3f, 453.4f, 369.3f, 452.8f, 372.2f)
                curveTo(454.4f, 370.1f, 456.0f, 368.0f, 457.7f, 366.0f)
                curveTo(471.6f, 349.1f, 516.1f, 311.5f, 538.0f, 309.5f)
                curveTo(539.9f, 310.8f, 540.2f, 311.1f, 542.4f, 311.9f)
                curveTo(549.9f, 306.4f, 548.1f, 292.9f, 546.5f, 284.9f)
                curveTo(566.1f, 294.6f, 580.7f, 299.8f, 589.9f, 321.5f)
                curveTo(595.8f, 335.5f, 596.9f, 347.0f, 598.3f, 361.7f)
                curveTo(602.4f, 355.5f, 605.7f, 349.8f, 609.3f, 343.4f)
                lineTo(611.0f, 343.2f)
                curveTo(614.4f, 345.9f, 616.0f, 349.8f, 617.8f, 353.9f)
                curveTo(630.5f, 383.2f, 643.3f, 427.7f, 617.4f, 453.9f)
                curveTo(606.4f, 465.1f, 582.8f, 462.3f, 567.9f, 461.7f)
                curveTo(578.5f, 472.9f, 589.6f, 478.7f, 602.8f, 486.2f)
                curveTo(583.7f, 516.4f, 581.6f, 546.1f, 601.3f, 577.0f)
                curveTo(603.0f, 579.7f, 604.6f, 581.9f, 606.2f, 584.8f)
                lineTo(605.0f, 587.6f)
                curveTo(597.7f, 605.4f, 600.6f, 613.2f, 607.9f, 630.8f)
                curveTo(587.2f, 650.1f, 557.5f, 686.2f, 536.9f, 700.0f)
                curveTo(534.6f, 701.3f, 531.8f, 702.9f, 529.1f, 702.5f)
                curveTo(516.6f, 700.5f, 501.1f, 694.1f, 489.2f, 689.4f)
                curveTo(461.6f, 678.6f, 412.2f, 661.8f, 390.7f, 641.8f)
                curveTo(378.6f, 630.6f, 359.0f, 597.5f, 347.0f, 583.1f)
                curveTo(366.8f, 576.5f, 373.1f, 566.2f, 385.9f, 550.8f)
                curveTo(371.4f, 557.5f, 363.1f, 560.7f, 346.9f, 554.9f)
                curveTo(326.6f, 547.6f, 320.5f, 530.3f, 312.1f, 512.1f)
                curveTo(317.6f, 512.6f, 324.2f, 513.9f, 329.8f, 514.8f)
                curveTo(316.2f, 503.5f, 296.5f, 469.8f, 290.6f, 452.6f)
                curveTo(279.6f, 420.7f, 278.0f, 377.8f, 280.8f, 344.4f)
                curveTo(281.8f, 332.0f, 285.7f, 316.3f, 288.4f, 303.9f)
                lineTo(289.0f, 304.4f)
                curveTo(295.0f, 309.9f, 323.7f, 324.9f, 330.1f, 317.7f)
                curveTo(329.1f, 313.6f, 327.8f, 313.3f, 324.6f, 309.9f)
                curveTo(333.9f, 310.5f, 342.7f, 311.1f, 351.9f, 312.2f)
                curveTo(366.7f, 313.9f, 401.4f, 321.7f, 414.1f, 317.8f)
                lineTo(413.8f, 316.7f)
                curveTo(408.2f, 313.7f, 392.4f, 309.9f, 385.0f, 307.2f)
                lineTo(384.9f, 305.7f)
                curveTo(390.5f, 300.1f, 421.0f, 301.6f, 430.5f, 300.7f)
                curveTo(456.5f, 298.1f, 477.8f, 285.6f, 503.5f, 281.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(305.3f, 455.2f)
                curveTo(312.6f, 453.8f, 323.4f, 450.4f, 329.3f, 445.5f)
                lineTo(328.7f, 444.3f)
                curveTo(326.3f, 443.9f, 324.8f, 443.7f, 322.5f, 443.1f)
                lineTo(322.4f, 441.4f)
                curveTo(328.7f, 433.2f, 352.8f, 423.3f, 362.0f, 425.2f)
                curveTo(364.0f, 433.0f, 358.6f, 430.0f, 357.2f, 434.7f)
                curveTo(362.3f, 435.9f, 366.8f, 431.7f, 373.0f, 432.7f)
                curveTo(376.9f, 433.4f, 392.4f, 437.8f, 394.1f, 440.1f)
                lineTo(393.2f, 442.3f)
                curveTo(388.9f, 443.1f, 388.4f, 443.2f, 385.1f, 446.0f)
                curveTo(390.1f, 447.5f, 394.8f, 447.7f, 399.3f, 450.6f)
                curveTo(400.1f, 453.9f, 394.6f, 451.5f, 392.3f, 455.6f)
                curveTo(394.8f, 457.6f, 409.3f, 469.4f, 408.0f, 472.4f)
                curveTo(402.3f, 485.4f, 388.7f, 497.4f, 378.3f, 506.9f)
                curveTo(378.1f, 511.3f, 378.3f, 516.3f, 376.5f, 520.3f)
                curveTo(373.2f, 519.7f, 375.3f, 515.5f, 370.1f, 513.0f)
                curveTo(366.0f, 513.6f, 362.7f, 517.9f, 359.0f, 520.3f)
                curveTo(352.2f, 524.7f, 349.7f, 514.0f, 343.3f, 512.6f)
                curveTo(341.7f, 513.6f, 341.2f, 514.2f, 339.3f, 514.0f)
                curveTo(336.3f, 498.2f, 322.0f, 491.2f, 313.8f, 476.8f)
                curveTo(314.8f, 474.6f, 315.2f, 474.3f, 316.8f, 472.5f)
                lineTo(317.3f, 472.0f)
                curveTo(318.7f, 465.0f, 310.2f, 458.8f, 305.3f, 455.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfefdfe)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(385.1f, 446.0f)
                curveTo(381.8f, 444.8f, 371.8f, 441.8f, 371.0f, 438.8f)
                curveTo(379.9f, 437.1f, 385.1f, 441.8f, 392.3f, 442.2f)
                lineTo(393.2f, 442.3f)
                curveTo(388.9f, 443.1f, 388.4f, 443.2f, 385.1f, 446.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(338.8f, 453.7f)
                curveTo(343.1f, 455.9f, 340.0f, 475.5f, 345.0f, 483.1f)
                curveTo(351.6f, 493.0f, 357.1f, 493.6f, 368.0f, 496.7f)
                curveTo(376.1f, 494.5f, 379.2f, 493.5f, 386.8f, 489.9f)
                curveTo(382.9f, 495.0f, 378.7f, 499.9f, 374.6f, 504.8f)
                curveTo(370.4f, 506.7f, 370.0f, 506.4f, 365.6f, 506.6f)
                curveTo(337.0f, 508.0f, 315.8f, 489.1f, 332.0f, 460.8f)
                curveTo(333.2f, 458.7f, 336.9f, 455.4f, 338.8f, 453.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(547.3f, 337.1f)
                curveTo(548.2f, 337.0f, 549.1f, 337.0f, 550.0f, 337.0f)
                curveTo(553.6f, 337.0f, 558.3f, 337.0f, 560.7f, 339.4f)
                curveTo(560.3f, 341.8f, 560.0f, 343.6f, 559.8f, 346.0f)
                curveTo(565.8f, 353.4f, 582.4f, 350.8f, 588.5f, 356.8f)
                curveTo(593.9f, 362.2f, 604.2f, 370.9f, 607.9f, 377.3f)
                curveTo(606.6f, 383.0f, 599.5f, 392.9f, 596.8f, 400.1f)
                curveTo(598.3f, 404.9f, 599.9f, 401.3f, 602.5f, 407.0f)
                curveTo(600.4f, 411.9f, 598.3f, 409.7f, 594.6f, 414.8f)
                curveTo(595.3f, 418.1f, 596.7f, 415.6f, 600.5f, 418.5f)
                lineTo(599.2f, 420.6f)
                curveTo(595.5f, 421.7f, 595.7f, 421.0f, 591.3f, 419.7f)
                curveTo(588.6f, 420.5f, 576.5f, 432.2f, 568.6f, 436.7f)
                curveTo(561.2f, 436.6f, 539.2f, 437.4f, 536.3f, 427.8f)
                curveTo(542.6f, 424.7f, 551.6f, 429.9f, 557.9f, 430.5f)
                curveTo(575.1f, 432.1f, 593.0f, 410.3f, 596.8f, 395.0f)
                curveTo(597.7f, 391.6f, 594.6f, 387.3f, 591.0f, 387.1f)
                curveTo(583.2f, 398.1f, 596.4f, 407.7f, 567.6f, 420.2f)
                curveTo(540.1f, 429.2f, 530.8f, 400.4f, 531.9f, 378.6f)
                curveTo(526.6f, 389.5f, 521.7f, 398.1f, 521.5f, 410.6f)
                curveTo(521.4f, 414.9f, 523.1f, 420.7f, 521.2f, 424.5f)
                curveTo(518.3f, 425.9f, 519.6f, 425.7f, 515.7f, 424.8f)
                curveTo(510.0f, 418.3f, 516.9f, 409.3f, 515.0f, 403.6f)
                curveTo(509.3f, 405.1f, 508.8f, 405.4f, 503.0f, 404.6f)
                curveTo(501.4f, 402.3f, 506.5f, 399.5f, 506.6f, 397.9f)
                curveTo(506.8f, 392.0f, 507.0f, 383.3f, 507.1f, 377.5f)
                curveTo(514.7f, 368.3f, 520.8f, 360.8f, 532.9f, 358.1f)
                curveTo(540.5f, 356.3f, 550.1f, 353.5f, 555.7f, 348.1f)
                curveTo(556.9f, 344.7f, 557.0f, 346.0f, 555.7f, 343.0f)
                curveTo(542.2f, 332.1f, 510.7f, 363.7f, 503.7f, 362.9f)
                curveTo(503.0f, 350.8f, 537.6f, 339.4f, 547.3f, 337.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(333.3f, 393.4f)
                curveTo(335.8f, 393.3f, 338.3f, 393.2f, 340.8f, 393.1f)
                curveTo(363.4f, 392.6f, 374.3f, 393.9f, 391.1f, 409.9f)
                curveTo(382.7f, 405.6f, 376.9f, 402.8f, 368.1f, 399.5f)
                curveTo(357.0f, 402.0f, 351.7f, 402.6f, 340.2f, 403.9f)
                curveTo(324.1f, 404.4f, 312.4f, 410.4f, 297.3f, 414.3f)
                curveTo(294.9f, 414.9f, 291.8f, 415.1f, 289.7f, 413.7f)
                curveTo(289.6f, 411.1f, 289.7f, 410.8f, 291.8f, 408.4f)
                curveTo(303.9f, 394.7f, 316.6f, 394.7f, 333.3f, 393.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(545.9f, 582.4f)
                curveTo(548.5f, 581.9f, 548.8f, 582.0f, 551.4f, 582.5f)
                lineTo(550.8f, 583.9f)
                curveTo(540.9f, 590.4f, 480.7f, 614.0f, 467.5f, 617.6f)
                lineTo(463.8f, 617.8f)
                lineTo(462.8f, 616.7f)
                curveTo(463.1f, 613.8f, 465.7f, 610.5f, 467.9f, 608.7f)
                curveTo(477.1f, 601.4f, 479.9f, 599.1f, 491.1f, 599.6f)
                curveTo(509.4f, 585.7f, 523.6f, 584.7f, 545.9f, 582.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(449.1f, 509.6f)
                curveTo(455.3f, 512.0f, 461.4f, 536.6f, 462.8f, 543.0f)
                curveTo(473.5f, 545.7f, 481.1f, 551.8f, 483.7f, 563.0f)
                curveTo(450.6f, 567.9f, 453.4f, 534.2f, 449.1f, 509.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.2f, 441.9f)
                curveTo(420.2f, 441.9f, 424.2f, 443.9f, 428.0f, 445.5f)
                curveTo(437.8f, 458.7f, 442.8f, 466.5f, 441.8f, 483.3f)
                curveTo(430.4f, 477.9f, 419.7f, 453.4f, 416.2f, 441.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(524.8f, 616.8f)
                curveTo(525.9f, 617.7f, 525.4f, 617.2f, 525.9f, 618.8f)
                curveTo(521.1f, 629.7f, 507.7f, 635.1f, 496.3f, 632.7f)
                curveTo(493.7f, 630.6f, 492.7f, 629.9f, 492.7f, 626.9f)
                curveTo(498.6f, 622.5f, 509.0f, 628.3f, 524.8f, 616.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 268.3f)
                curveTo(229.1f, 278.8f, 227.7f, 303.2f, 231.5f, 312.5f)
                curveTo(232.9f, 312.1f, 245.7f, 294.0f, 248.7f, 290.7f)
                curveTo(248.8f, 297.4f, 251.6f, 315.0f, 247.7f, 319.2f)
                curveTo(245.2f, 318.5f, 244.6f, 318.3f, 242.0f, 318.3f)
                lineTo(241.1f, 320.4f)
                curveTo(242.7f, 326.0f, 248.3f, 325.5f, 249.5f, 329.8f)
                curveTo(257.2f, 356.0f, 239.4f, 348.4f, 236.2f, 350.1f)
                curveTo(235.3f, 353.7f, 238.1f, 357.4f, 240.1f, 361.0f)
                curveTo(240.3f, 368.0f, 233.1f, 371.4f, 236.5f, 377.5f)
                curveTo(239.1f, 377.7f, 240.4f, 377.1f, 243.0f, 376.3f)
                curveTo(249.7f, 378.7f, 252.2f, 382.9f, 256.4f, 388.5f)
                curveTo(250.4f, 403.1f, 247.0f, 396.7f, 240.9f, 404.1f)
                curveTo(240.0f, 407.5f, 241.2f, 410.8f, 242.1f, 414.3f)
                curveTo(253.8f, 399.0f, 270.7f, 394.5f, 266.7f, 418.8f)
                curveTo(263.7f, 437.3f, 248.1f, 419.8f, 245.6f, 419.5f)
                curveTo(252.7f, 431.4f, 261.2f, 448.4f, 241.9f, 453.4f)
                lineTo(238.5f, 450.3f)
                lineTo(237.5f, 450.9f)
                curveTo(236.5f, 470.4f, 276.8f, 523.4f, 289.5f, 539.6f)
                curveTo(294.1f, 535.0f, 295.5f, 534.0f, 300.9f, 530.5f)
                curveTo(303.9f, 537.1f, 308.0f, 540.1f, 310.5f, 546.1f)
                curveTo(312.0f, 549.7f, 307.9f, 549.1f, 306.3f, 552.6f)
                curveTo(310.2f, 556.7f, 312.8f, 555.1f, 316.4f, 556.2f)
                curveTo(318.9f, 557.0f, 327.3f, 567.2f, 329.3f, 569.5f)
                curveTo(299.4f, 562.7f, 291.2f, 557.9f, 269.1f, 537.9f)
                curveTo(257.0f, 527.0f, 243.8f, 517.1f, 231.5f, 505.4f)
                curveTo(237.2f, 522.4f, 241.7f, 536.7f, 249.9f, 552.9f)
                curveTo(246.1f, 552.9f, 238.2f, 552.4f, 235.5f, 554.2f)
                curveTo(234.7f, 558.2f, 239.3f, 563.8f, 239.7f, 568.0f)
                curveTo(240.1f, 571.7f, 234.9f, 575.8f, 234.9f, 579.8f)
                curveTo(242.2f, 585.5f, 247.3f, 573.9f, 254.9f, 591.0f)
                curveTo(252.5f, 599.1f, 251.1f, 605.1f, 249.4f, 613.5f)
                curveTo(246.6f, 611.3f, 240.8f, 607.3f, 238.8f, 605.2f)
                curveTo(226.8f, 592.4f, 224.2f, 569.2f, 221.0f, 552.3f)
                curveTo(218.6f, 577.8f, 210.2f, 589.6f, 186.1f, 598.5f)
                curveTo(192.1f, 591.1f, 196.9f, 582.9f, 200.6f, 574.2f)
                curveTo(218.4f, 532.2f, 209.7f, 494.1f, 192.8f, 452.7f)
                curveTo(208.6f, 473.0f, 214.7f, 479.1f, 239.9f, 485.8f)
                curveTo(226.1f, 472.3f, 203.2f, 439.9f, 194.2f, 422.5f)
                curveTo(181.9f, 399.0f, 182.3f, 368.4f, 190.2f, 343.5f)
                curveTo(191.4f, 339.7f, 197.1f, 329.1f, 200.5f, 327.4f)
                curveTo(196.8f, 345.4f, 200.3f, 359.4f, 206.1f, 376.6f)
                curveTo(206.1f, 372.2f, 205.6f, 367.6f, 205.7f, 363.1f)
                curveTo(205.9f, 329.2f, 217.8f, 299.1f, 230.0f, 268.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(284.6f, 240.7f)
                curveTo(281.0f, 244.5f, 278.0f, 249.2f, 272.5f, 248.8f)
                curveTo(270.4f, 246.9f, 270.2f, 246.2f, 269.4f, 243.7f)
                lineTo(269.2f, 242.9f)
                curveTo(266.9f, 249.0f, 263.6f, 262.9f, 255.9f, 262.6f)
                curveTo(255.6f, 262.3f, 254.6f, 261.3f, 254.4f, 261.0f)
                curveTo(245.0f, 237.2f, 263.4f, 197.5f, 280.6f, 184.0f)
                curveTo(282.4f, 185.0f, 283.0f, 188.7f, 283.8f, 191.3f)
                lineTo(285.1f, 191.8f)
                curveTo(287.6f, 189.6f, 290.6f, 184.3f, 292.4f, 181.3f)
                curveTo(304.0f, 161.7f, 359.0f, 126.6f, 381.4f, 127.8f)
                curveTo(384.4f, 129.8f, 384.5f, 131.9f, 386.1f, 135.7f)
                lineTo(401.9f, 140.1f)
                curveTo(380.0f, 157.8f, 379.3f, 175.0f, 371.6f, 200.9f)
                curveTo(380.4f, 210.8f, 375.4f, 210.6f, 379.9f, 219.6f)
                lineTo(380.7f, 224.1f)
                curveTo(375.9f, 224.7f, 374.6f, 218.5f, 368.0f, 215.7f)
                curveTo(365.4f, 216.1f, 366.3f, 215.6f, 364.8f, 217.4f)
                curveTo(365.2f, 220.2f, 368.6f, 222.5f, 370.4f, 224.8f)
                curveTo(383.3f, 241.8f, 371.0f, 253.4f, 352.9f, 243.6f)
                curveTo(351.3f, 239.5f, 350.2f, 233.0f, 349.2f, 228.5f)
                curveTo(348.4f, 232.7f, 346.9f, 237.4f, 345.8f, 241.5f)
                curveTo(343.3f, 251.1f, 350.5f, 247.2f, 356.3f, 251.8f)
                curveTo(358.1f, 253.2f, 361.0f, 257.9f, 362.4f, 260.0f)
                curveTo(361.3f, 263.4f, 359.3f, 267.3f, 357.7f, 270.5f)
                curveTo(337.7f, 284.5f, 340.5f, 254.8f, 330.3f, 255.4f)
                curveTo(332.6f, 267.9f, 328.3f, 268.7f, 318.0f, 275.0f)
                curveTo(309.5f, 268.5f, 302.2f, 259.9f, 314.4f, 249.6f)
                curveTo(317.5f, 247.0f, 320.8f, 249.6f, 323.6f, 249.1f)
                lineTo(318.0f, 242.1f)
                lineTo(304.4f, 252.6f)
                curveTo(286.1f, 237.7f, 291.7f, 229.5f, 284.8f, 222.3f)
                curveTo(283.0f, 226.1f, 284.2f, 236.1f, 284.6f, 240.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(215.7f, 612.6f)
                lineTo(216.9f, 613.4f)
                curveTo(219.5f, 617.9f, 217.5f, 631.3f, 216.9f, 636.7f)
                curveTo(221.0f, 639.7f, 223.6f, 640.9f, 224.6f, 645.9f)
                curveTo(222.7f, 653.1f, 217.6f, 652.1f, 210.9f, 657.4f)
                curveTo(209.2f, 661.9f, 218.3f, 685.0f, 220.5f, 690.6f)
                lineTo(220.1f, 692.0f)
                curveTo(217.6f, 691.7f, 215.8f, 689.5f, 214.0f, 687.7f)
                curveTo(203.3f, 676.8f, 200.2f, 665.0f, 200.4f, 650.3f)
                curveTo(200.7f, 633.1f, 203.5f, 624.6f, 215.7f, 612.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(406.5f, 196.9f)
                curveTo(415.4f, 197.0f, 416.1f, 197.6f, 421.9f, 204.4f)
                lineTo(422.0f, 216.5f)
                lineTo(412.4f, 223.0f)
                curveTo(409.9f, 223.2f, 403.6f, 220.5f, 402.0f, 218.6f)
                curveTo(395.8f, 210.6f, 400.6f, 203.0f, 406.5f, 196.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(743.4f, 299.7f)
                curveTo(749.2f, 299.5f, 753.1f, 302.5f, 758.0f, 305.5f)
                curveTo(757.9f, 309.7f, 757.8f, 314.0f, 757.7f, 318.3f)
                curveTo(754.3f, 320.2f, 750.2f, 323.0f, 746.8f, 325.2f)
                curveTo(745.9f, 325.6f, 744.6f, 325.6f, 743.6f, 325.7f)
                curveTo(732.2f, 320.5f, 731.3f, 306.4f, 743.4f, 299.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(728.9f, 273.9f)
                curveTo(742.2f, 271.9f, 747.6f, 290.1f, 734.4f, 299.0f)
                curveTo(722.6f, 298.7f, 716.6f, 292.0f, 720.5f, 280.4f)
                curveTo(721.8f, 276.5f, 725.3f, 275.5f, 728.9f, 273.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(286.7f, 247.7f)
                curveTo(290.8f, 248.4f, 293.9f, 250.7f, 297.4f, 252.8f)
                curveTo(301.8f, 266.4f, 300.2f, 267.4f, 289.0f, 275.0f)
                curveTo(288.4f, 275.4f, 287.6f, 275.3f, 286.7f, 275.4f)
                curveTo(276.0f, 266.8f, 273.0f, 255.3f, 286.7f, 247.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(683.4f, 249.0f)
                curveTo(699.2f, 249.3f, 702.5f, 265.8f, 686.5f, 274.3f)
                curveTo(678.9f, 274.4f, 675.0f, 263.5f, 670.9f, 257.3f)
                curveTo(675.9f, 253.1f, 677.1f, 251.5f, 683.4f, 249.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.2f, 655.8f)
                curveTo(229.0f, 655.9f, 235.4f, 659.6f, 237.0f, 661.9f)
                curveTo(242.7f, 670.4f, 237.9f, 676.1f, 232.1f, 680.8f)
                curveTo(213.0f, 682.0f, 211.1f, 666.1f, 226.2f, 655.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(269.0f, 581.1f)
                curveTo(277.9f, 581.7f, 279.1f, 583.6f, 285.4f, 589.7f)
                curveTo(283.0f, 599.1f, 284.7f, 600.9f, 275.4f, 604.2f)
                curveTo(262.1f, 608.8f, 254.2f, 587.1f, 269.0f, 581.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(253.3f, 452.8f)
                curveTo(260.9f, 452.3f, 267.4f, 456.3f, 267.0f, 464.7f)
                curveTo(266.5f, 473.3f, 263.9f, 475.1f, 257.8f, 480.3f)
                curveTo(245.0f, 471.6f, 238.5f, 463.8f, 253.3f, 452.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(391.1f, 223.8f)
                curveTo(401.6f, 223.2f, 408.9f, 231.2f, 405.8f, 242.0f)
                curveTo(404.8f, 245.6f, 402.1f, 246.1f, 399.0f, 247.4f)
                curveTo(382.8f, 249.8f, 378.1f, 234.6f, 391.1f, 223.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(255.9f, 655.7f)
                curveTo(264.0f, 655.3f, 281.4f, 672.3f, 258.8f, 679.0f)
                curveTo(255.4f, 678.4f, 249.1f, 677.7f, 247.1f, 674.8f)
                curveTo(241.5f, 666.8f, 250.2f, 660.0f, 255.9f, 655.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(699.5f, 273.9f)
                lineTo(701.5f, 273.9f)
                curveTo(707.0f, 276.5f, 708.2f, 277.8f, 710.5f, 283.2f)
                curveTo(707.8f, 291.8f, 707.8f, 295.7f, 700.2f, 299.7f)
                curveTo(682.9f, 294.1f, 683.4f, 281.7f, 699.5f, 273.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(707.4f, 250.9f)
                curveTo(718.9f, 250.2f, 735.3f, 261.0f, 721.6f, 271.4f)
                lineTo(716.9f, 274.1f)
                curveTo(705.8f, 275.5f, 700.4f, 260.8f, 707.4f, 250.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(407.1f, 248.9f)
                curveTo(418.5f, 248.1f, 425.6f, 257.7f, 419.6f, 266.5f)
                curveTo(414.9f, 265.8f, 416.1f, 262.3f, 412.4f, 261.8f)
                curveTo(411.5f, 265.2f, 412.1f, 266.1f, 413.5f, 269.2f)
                curveTo(414.2f, 269.7f, 414.4f, 270.2f, 414.9f, 270.9f)
                curveTo(413.7f, 273.6f, 414.5f, 272.8f, 412.0f, 274.0f)
                curveTo(408.0f, 274.0f, 403.8f, 271.2f, 400.2f, 269.2f)
                curveTo(399.5f, 259.2f, 397.3f, 254.2f, 407.1f, 248.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(378.6f, 248.8f)
                curveTo(392.6f, 249.0f, 396.7f, 269.4f, 383.8f, 271.3f)
                curveTo(369.6f, 266.2f, 359.4f, 258.8f, 378.6f, 248.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(760.1f, 273.3f)
                curveTo(764.4f, 275.4f, 771.7f, 278.2f, 773.6f, 282.5f)
                curveTo(770.1f, 292.5f, 764.1f, 284.2f, 762.3f, 297.3f)
                lineTo(760.4f, 298.9f)
                curveTo(750.9f, 299.3f, 743.3f, 281.9f, 760.1f, 273.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(421.8f, 172.6f)
                curveTo(427.8f, 175.3f, 433.6f, 185.3f, 434.9f, 191.9f)
                curveTo(433.6f, 195.6f, 433.5f, 194.9f, 430.1f, 197.9f)
                curveTo(414.0f, 198.8f, 408.8f, 179.9f, 421.8f, 172.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.0f, 630.3f)
                curveTo(258.0f, 633.3f, 259.4f, 648.4f, 243.4f, 656.8f)
                curveTo(240.6f, 656.9f, 236.5f, 655.8f, 234.5f, 653.8f)
                curveTo(234.5f, 648.7f, 238.1f, 648.5f, 238.3f, 647.0f)
                curveTo(239.1f, 638.1f, 236.9f, 639.0f, 241.0f, 630.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(268.6f, 479.7f)
                lineTo(270.6f, 479.8f)
                curveTo(275.7f, 482.5f, 279.5f, 493.5f, 281.8f, 498.8f)
                curveTo(279.2f, 500.8f, 275.3f, 503.2f, 272.4f, 505.1f)
                curveTo(270.0f, 504.8f, 265.3f, 501.3f, 264.0f, 499.2f)
                curveTo(258.7f, 490.3f, 261.7f, 484.9f, 268.6f, 479.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(662.2f, 227.5f)
                curveTo(669.3f, 228.7f, 679.3f, 232.6f, 679.8f, 240.9f)
                curveTo(679.1f, 244.2f, 676.1f, 246.0f, 673.4f, 248.3f)
                lineTo(671.0f, 249.8f)
                curveTo(664.4f, 249.6f, 658.1f, 240.1f, 657.5f, 233.7f)
                curveTo(658.0f, 230.6f, 659.9f, 229.4f, 662.2f, 227.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(284.2f, 503.9f)
                lineTo(285.3f, 504.4f)
                curveTo(289.3f, 511.2f, 293.1f, 517.5f, 294.8f, 525.3f)
                curveTo(293.3f, 528.2f, 293.7f, 527.3f, 289.9f, 528.9f)
                curveTo(273.3f, 526.0f, 273.7f, 514.5f, 284.2f, 503.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(423.9f, 222.8f)
                lineTo(425.5f, 224.4f)
                curveTo(426.5f, 230.5f, 430.2f, 240.4f, 429.4f, 245.2f)
                curveTo(427.5f, 247.3f, 426.8f, 248.2f, 424.1f, 249.5f)
                curveTo(411.3f, 241.3f, 409.2f, 230.4f, 423.9f, 222.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.5f, 556.9f)
                curveTo(253.6f, 557.7f, 261.8f, 570.3f, 267.4f, 574.9f)
                lineTo(258.6f, 580.9f)
                curveTo(245.9f, 574.4f, 238.1f, 569.4f, 252.5f, 556.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.6f, 681.8f)
                curveTo(247.4f, 681.8f, 257.1f, 689.4f, 254.0f, 696.8f)
                curveTo(250.5f, 698.7f, 251.3f, 698.1f, 246.8f, 697.8f)
                curveTo(239.2f, 696.3f, 235.5f, 694.5f, 228.6f, 691.4f)
                lineTo(240.6f, 681.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(262.1f, 637.1f)
                curveTo(267.2f, 639.3f, 281.5f, 644.0f, 282.1f, 649.9f)
                lineTo(279.2f, 653.1f)
                curveTo(272.8f, 658.1f, 267.9f, 658.2f, 263.7f, 650.4f)
                lineTo(263.4f, 649.9f)
                curveTo(260.9f, 645.3f, 261.6f, 642.3f, 262.1f, 637.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(438.9f, 197.8f)
                curveTo(442.3f, 198.8f, 453.1f, 211.2f, 452.3f, 216.4f)
                curveTo(449.1f, 217.5f, 449.1f, 216.6f, 445.0f, 215.0f)
                curveTo(437.4f, 213.3f, 438.5f, 210.8f, 432.9f, 209.3f)
                curveTo(431.8f, 209.9f, 431.2f, 210.3f, 430.2f, 211.1f)
                lineTo(429.5f, 211.8f)
                lineTo(428.3f, 210.5f)
                curveTo(428.9f, 204.5f, 434.4f, 201.4f, 438.9f, 197.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(269.6f, 427.0f)
                curveTo(272.6f, 429.7f, 279.9f, 443.3f, 275.6f, 446.9f)
                lineTo(272.7f, 446.4f)
                curveTo(269.4f, 446.4f, 265.3f, 446.7f, 262.5f, 445.2f)
                curveTo(260.5f, 442.8f, 261.0f, 437.1f, 261.0f, 433.8f)
                curveTo(265.1f, 431.2f, 266.1f, 430.4f, 269.6f, 427.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(286.2f, 655.7f)
                curveTo(287.7f, 655.6f, 289.4f, 655.9f, 290.9f, 656.0f)
                curveTo(299.9f, 663.1f, 288.1f, 670.9f, 281.2f, 673.2f)
                curveTo(279.8f, 673.6f, 279.0f, 673.5f, 277.4f, 673.5f)
                lineTo(276.0f, 672.0f)
                curveTo(275.5f, 664.9f, 281.2f, 659.7f, 286.2f, 655.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(687.5f, 229.4f)
                curveTo(694.8f, 230.3f, 701.5f, 236.5f, 705.2f, 242.6f)
                curveTo(706.2f, 244.4f, 704.5f, 246.6f, 703.6f, 248.4f)
                lineTo(701.4f, 249.5f)
                curveTo(690.0f, 246.9f, 687.9f, 239.8f, 687.5f, 229.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(732.1f, 324.6f)
                curveTo(739.8f, 327.5f, 747.4f, 338.6f, 739.2f, 345.7f)
                curveTo(737.0f, 347.7f, 735.8f, 349.4f, 733.0f, 349.7f)
                curveTo(730.0f, 345.7f, 732.0f, 331.7f, 732.1f, 324.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(433.9f, 250.5f)
                lineTo(435.1f, 251.2f)
                curveTo(437.2f, 255.6f, 446.5f, 266.2f, 445.8f, 269.5f)
                lineTo(443.8f, 269.1f)
                curveTo(437.9f, 268.4f, 430.4f, 268.8f, 428.1f, 262.8f)
                curveTo(428.5f, 257.8f, 431.1f, 255.1f, 433.9f, 250.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(386.1f, 197.8f)
                curveTo(388.8f, 201.9f, 391.3f, 206.0f, 394.5f, 209.6f)
                curveTo(389.4f, 215.7f, 386.5f, 218.7f, 380.7f, 224.1f)
                lineTo(379.9f, 219.6f)
                curveTo(382.8f, 215.0f, 384.2f, 204.0f, 386.1f, 197.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(413.8f, 154.2f)
                curveTo(420.9f, 156.6f, 423.1f, 167.2f, 413.5f, 170.9f)
                curveTo(409.6f, 170.8f, 408.6f, 171.2f, 406.9f, 168.0f)
                curveTo(407.2f, 164.0f, 411.5f, 157.9f, 413.8f, 154.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfefdfe)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(260.6f, 688.3f)
                curveTo(264.6f, 688.5f, 276.9f, 694.2f, 281.0f, 696.2f)
                lineTo(281.3f, 697.5f)
                curveTo(268.6f, 699.6f, 262.6f, 705.0f, 260.6f, 688.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfefdfe)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(733.2f, 262.8f)
                curveTo(736.9f, 262.7f, 751.5f, 266.8f, 754.7f, 269.3f)
                lineTo(754.6f, 271.3f)
                curveTo(754.3f, 271.5f, 753.9f, 271.7f, 753.6f, 271.9f)
                curveTo(744.2f, 276.8f, 737.5f, 271.1f, 733.2f, 262.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfefdfe)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(757.6f, 324.3f)
                curveTo(759.4f, 325.1f, 759.3f, 325.3f, 760.5f, 326.7f)
                curveTo(758.5f, 334.8f, 757.7f, 339.2f, 749.9f, 342.1f)
                curveTo(748.3f, 340.8f, 748.3f, 340.8f, 747.1f, 339.1f)
                curveTo(749.2f, 333.0f, 752.3f, 328.2f, 757.6f, 324.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfefdfe)), stroke = null, fillAlpha = 0.937255f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(402.4f, 177.6f)
                curveTo(410.4f, 181.8f, 404.6f, 203.6f, 389.8f, 194.6f)
                curveTo(390.0f, 191.0f, 389.4f, 190.3f, 391.5f, 188.2f)
                curveTo(394.8f, 190.3f, 397.2f, 192.7f, 400.9f, 190.4f)
                curveTo(402.8f, 186.8f, 402.4f, 181.7f, 402.4f, 177.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfefdfe)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.9f, 353.6f)
                curveTo(252.6f, 361.7f, 254.4f, 366.4f, 254.3f, 372.9f)
                lineTo(253.1f, 373.6f)
                lineTo(251.5f, 372.4f)
                lineTo(250.9f, 372.0f)
                curveTo(241.5f, 364.5f, 243.7f, 360.4f, 252.9f, 353.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(362.7f, 273.9f)
                lineTo(364.4f, 274.1f)
                curveTo(368.3f, 277.1f, 368.8f, 283.0f, 366.0f, 287.0f)
                lineTo(363.6f, 286.3f)
                curveTo(359.7f, 284.2f, 356.7f, 283.2f, 355.5f, 279.3f)
                curveTo(356.8f, 276.4f, 359.7f, 275.5f, 362.7f, 273.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfefdfe)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(688.7f, 300.9f)
                curveTo(698.9f, 305.4f, 698.6f, 309.2f, 698.2f, 319.0f)
                curveTo(695.7f, 319.1f, 695.1f, 319.4f, 693.0f, 318.1f)
                curveTo(690.8f, 313.1f, 689.4f, 306.4f, 688.7f, 300.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfefdfe)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(674.6f, 203.5f)
                curveTo(679.1f, 205.2f, 686.3f, 218.7f, 688.4f, 223.3f)
                curveTo(677.1f, 224.1f, 675.9f, 211.9f, 674.6f, 203.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(301.6f, 271.6f)
                curveTo(309.4f, 273.6f, 315.2f, 280.4f, 313.2f, 288.6f)
                curveTo(308.9f, 283.9f, 303.0f, 280.3f, 300.3f, 275.0f)
                lineTo(301.6f, 271.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfefdfe)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(287.5f, 605.9f)
                curveTo(290.6f, 606.9f, 296.9f, 608.5f, 298.6f, 611.2f)
                curveTo(296.6f, 612.6f, 295.9f, 612.3f, 293.2f, 612.3f)
                lineTo(274.9f, 612.0f)
                lineTo(287.5f, 605.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfefdfe)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(792.9f, 271.6f)
                curveTo(794.2f, 272.2f, 793.6f, 272.0f, 794.6f, 273.4f)
                curveTo(793.5f, 277.8f, 785.5f, 283.5f, 781.7f, 286.6f)
                curveTo(780.7f, 286.6f, 780.8f, 286.3f, 779.7f, 285.6f)
                curveTo(781.0f, 278.9f, 787.3f, 274.6f, 792.9f, 271.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfefdfe)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(728.8f, 358.9f)
                lineTo(729.7f, 359.9f)
                curveTo(730.7f, 367.7f, 720.9f, 372.5f, 714.5f, 373.9f)
                lineTo(713.7f, 373.3f)
                curveTo(716.2f, 369.6f, 725.0f, 362.3f, 728.8f, 358.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfefdfe)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(744.9f, 350.1f)
                lineTo(746.2f, 350.3f)
                lineTo(746.8f, 351.9f)
                curveTo(744.5f, 356.6f, 739.0f, 361.3f, 734.9f, 364.3f)
                lineTo(733.8f, 363.8f)
                curveTo(732.6f, 357.1f, 739.8f, 352.3f, 744.9f, 350.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfefdfe)), stroke = null, fillAlpha = 0.988235f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(328.9f, 271.6f)
                curveTo(334.7f, 272.0f, 340.8f, 275.9f, 344.9f, 280.0f)
                lineTo(343.5f, 281.7f)
                curveTo(338.7f, 278.8f, 328.8f, 276.3f, 327.3f, 274.0f)
                lineTo(328.9f, 271.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfefdfe)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(696.0f, 325.6f)
                lineTo(696.9f, 326.1f)
                curveTo(697.8f, 328.7f, 693.0f, 336.1f, 691.2f, 340.6f)
                curveTo(688.6f, 339.5f, 689.0f, 338.3f, 688.6f, 335.9f)
                curveTo(689.9f, 331.8f, 693.1f, 328.8f, 696.0f, 325.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.886275f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(174.4f, 557.2f)
                curveTo(172.6f, 556.8f, 170.9f, 556.4f, 169.2f, 555.8f)
                curveTo(158.7f, 552.3f, 136.4f, 536.2f, 140.8f, 523.4f)
                curveTo(143.1f, 522.5f, 142.6f, 523.0f, 144.9f, 525.7f)
                curveTo(148.4f, 529.9f, 157.0f, 533.1f, 162.1f, 535.4f)
                curveTo(157.0f, 535.2f, 156.2f, 534.3f, 152.2f, 536.6f)
                curveTo(150.2f, 544.5f, 169.4f, 551.6f, 174.4f, 557.2f)
                close()
            }
        }
        .build()
        return _standardSadayoKawakami!!
    }

private var _standardSadayoKawakami: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = StandardSenderAvatar.StandardSadayoKawakami, contentDescription = "")
    }
}
