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

public val StandardSenderAvatar.StandardRyujiSakamoto: ImageVector
    get() {
        if (_standardRyujiSakamoto != null) {
            return _standardRyujiSakamoto!!
        }
        _standardRyujiSakamoto = Builder(name = "StandardRyujiSakamoto", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 1024.0f, viewportHeight = 1024.0f).apply {
            path(fill = SolidColor(Color(0xFF020302)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(597.9f, 61.0f)
                curveTo(599.0f, 60.7f, 599.6f, 60.9f, 600.7f, 61.0f)
                curveTo(601.5f, 64.8f, 588.9f, 93.7f, 586.5f, 100.9f)
                curveTo(602.9f, 97.6f, 625.9f, 92.6f, 641.9f, 90.9f)
                curveTo(655.7f, 89.4f, 682.7f, 91.3f, 697.3f, 92.3f)
                curveTo(692.2f, 99.2f, 689.1f, 105.3f, 686.4f, 113.4f)
                curveTo(695.4f, 111.6f, 696.9f, 111.1f, 704.5f, 106.5f)
                curveTo(704.3f, 121.4f, 703.9f, 140.2f, 704.7f, 154.8f)
                curveTo(722.2f, 170.4f, 734.3f, 180.1f, 758.4f, 178.6f)
                curveTo(761.6f, 178.4f, 770.5f, 178.7f, 773.4f, 179.9f)
                curveTo(772.9f, 184.9f, 765.5f, 191.1f, 761.7f, 194.8f)
                curveTo(768.4f, 198.2f, 772.3f, 201.3f, 778.4f, 205.8f)
                curveTo(771.6f, 209.4f, 759.6f, 221.7f, 755.2f, 228.1f)
                curveTo(756.7f, 235.5f, 765.7f, 256.8f, 769.0f, 265.1f)
                curveTo(777.2f, 266.6f, 800.2f, 267.6f, 810.0f, 268.5f)
                curveTo(799.8f, 274.9f, 795.4f, 281.5f, 786.8f, 289.7f)
                curveTo(789.6f, 297.4f, 798.9f, 308.9f, 796.7f, 314.7f)
                curveTo(793.8f, 316.8f, 788.9f, 315.9f, 785.1f, 315.6f)
                curveTo(787.0f, 333.6f, 790.2f, 350.8f, 792.9f, 368.7f)
                curveTo(793.3f, 371.7f, 793.6f, 375.0f, 791.5f, 377.2f)
                lineTo(763.0f, 366.3f)
                lineTo(766.8f, 386.7f)
                curveTo(763.7f, 392.2f, 757.6f, 397.6f, 752.9f, 402.1f)
                curveTo(758.6f, 409.0f, 771.6f, 421.6f, 778.4f, 429.0f)
                curveTo(772.3f, 428.2f, 759.5f, 425.3f, 755.3f, 429.9f)
                curveTo(754.7f, 434.5f, 758.9f, 445.4f, 760.6f, 450.5f)
                curveTo(747.0f, 481.8f, 757.7f, 489.6f, 751.9f, 518.4f)
                curveTo(749.2f, 531.5f, 722.9f, 561.0f, 717.0f, 576.0f)
                curveTo(711.9f, 588.9f, 703.4f, 602.8f, 699.9f, 616.8f)
                curveTo(697.2f, 624.8f, 693.8f, 644.7f, 690.6f, 651.4f)
                curveTo(681.8f, 669.7f, 668.2f, 700.0f, 654.5f, 714.4f)
                curveTo(652.2f, 716.8f, 635.9f, 723.7f, 632.5f, 725.2f)
                curveTo(652.9f, 737.5f, 674.4f, 749.1f, 694.0f, 762.5f)
                curveTo(714.4f, 776.3f, 732.9f, 793.7f, 753.9f, 806.3f)
                curveTo(769.0f, 815.5f, 786.5f, 821.6f, 802.8f, 828.3f)
                curveTo(813.8f, 832.9f, 827.1f, 837.0f, 836.1f, 844.9f)
                curveTo(844.0f, 851.8f, 876.9f, 891.7f, 880.3f, 900.6f)
                curveTo(885.3f, 913.8f, 887.9f, 986.5f, 889.3f, 1006.3f)
                lineTo(407.5f, 1004.1f)
                lineTo(186.2f, 1004.0f)
                lineTo(118.4f, 1004.0f)
                curveTo(103.9f, 1004.0f, 85.7f, 1004.4f, 71.6f, 1002.8f)
                curveTo(69.2f, 997.8f, 62.0f, 987.7f, 58.5f, 982.6f)
                curveTo(50.5f, 970.9f, 42.7f, 959.0f, 35.1f, 947.0f)
                curveTo(40.0f, 940.2f, 46.8f, 932.3f, 52.3f, 925.7f)
                curveTo(49.7f, 917.3f, 47.2f, 892.8f, 45.7f, 882.9f)
                curveTo(42.4f, 862.7f, 39.3f, 842.5f, 36.3f, 822.2f)
                curveTo(35.1f, 814.2f, 31.6f, 794.0f, 32.2f, 785.6f)
                curveTo(33.9f, 769.0f, 39.8f, 752.2f, 43.5f, 736.0f)
                curveTo(45.0f, 729.1f, 70.0f, 726.2f, 76.5f, 724.0f)
                curveTo(101.0f, 715.7f, 134.3f, 712.0f, 157.6f, 703.1f)
                curveTo(159.2f, 698.5f, 160.8f, 694.0f, 162.4f, 689.4f)
                curveTo(182.6f, 679.9f, 205.4f, 672.2f, 226.0f, 663.4f)
                curveTo(235.5f, 659.4f, 246.8f, 655.7f, 255.7f, 650.4f)
                curveTo(272.8f, 640.3f, 287.1f, 624.2f, 303.7f, 613.3f)
                curveTo(314.8f, 613.6f, 327.3f, 616.8f, 337.3f, 614.5f)
                curveTo(341.9f, 613.5f, 343.9f, 609.2f, 346.0f, 605.2f)
                curveTo(345.8f, 597.5f, 345.7f, 584.5f, 344.0f, 577.4f)
                lineTo(343.8f, 576.5f)
                curveTo(341.0f, 564.3f, 333.5f, 554.3f, 330.8f, 542.3f)
                curveTo(331.9f, 539.2f, 334.0f, 534.7f, 335.3f, 531.6f)
                curveTo(329.9f, 525.7f, 319.4f, 514.1f, 314.3f, 511.9f)
                curveTo(294.4f, 503.2f, 292.0f, 508.2f, 297.4f, 485.9f)
                curveTo(298.3f, 482.2f, 278.9f, 470.2f, 273.5f, 466.4f)
                curveTo(273.2f, 439.4f, 280.0f, 444.6f, 257.5f, 434.2f)
                curveTo(252.9f, 432.1f, 264.4f, 414.4f, 264.1f, 407.0f)
                curveTo(263.2f, 383.4f, 256.3f, 367.2f, 240.8f, 349.6f)
                curveTo(241.6f, 341.0f, 246.3f, 325.8f, 248.9f, 317.1f)
                curveTo(242.6f, 308.3f, 236.2f, 305.5f, 226.8f, 300.4f)
                curveTo(234.8f, 299.4f, 242.8f, 298.9f, 251.0f, 297.8f)
                curveTo(258.5f, 286.5f, 267.1f, 278.1f, 271.9f, 265.3f)
                curveTo(268.7f, 256.8f, 256.3f, 237.4f, 251.1f, 226.6f)
                curveTo(263.9f, 225.3f, 284.8f, 222.3f, 297.1f, 219.5f)
                curveTo(309.8f, 195.5f, 311.2f, 194.4f, 336.7f, 184.8f)
                curveTo(337.0f, 174.3f, 335.6f, 167.4f, 338.6f, 156.6f)
                curveTo(343.6f, 138.3f, 366.3f, 125.9f, 382.1f, 117.2f)
                curveTo(382.1f, 126.2f, 384.3f, 137.9f, 385.8f, 146.9f)
                curveTo(394.8f, 132.2f, 403.0f, 109.8f, 418.2f, 101.4f)
                curveTo(428.6f, 95.6f, 442.8f, 86.5f, 454.0f, 83.7f)
                lineTo(464.2f, 89.1f)
                curveTo(479.8f, 76.2f, 494.8f, 70.9f, 511.7f, 60.4f)
                curveTo(512.1f, 67.4f, 512.0f, 75.9f, 512.1f, 83.0f)
                curveTo(532.0f, 81.8f, 543.5f, 78.5f, 562.3f, 71.7f)
                curveTo(573.7f, 67.7f, 586.3f, 65.0f, 597.9f, 61.0f)
                close()
                moveTo(725.1f, 426.9f)
                lineTo(727.4f, 427.9f)
                curveTo(728.6f, 422.8f, 728.8f, 420.1f, 729.1f, 415.0f)
                lineTo(726.8f, 413.2f)
                curveTo(726.4f, 416.0f, 725.1f, 424.5f, 725.1f, 426.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(527.0f, 238.6f)
                curveTo(554.1f, 246.9f, 588.6f, 268.8f, 610.4f, 286.5f)
                curveTo(607.8f, 276.9f, 606.7f, 263.3f, 605.2f, 252.9f)
                curveTo(614.1f, 261.2f, 626.9f, 270.7f, 635.0f, 278.9f)
                curveTo(649.1f, 293.1f, 668.9f, 315.7f, 680.5f, 331.9f)
                curveTo(687.6f, 325.1f, 695.8f, 315.3f, 702.6f, 307.7f)
                curveTo(708.5f, 317.9f, 708.9f, 320.1f, 710.3f, 331.7f)
                lineTo(727.8f, 325.5f)
                curveTo(724.8f, 334.6f, 724.3f, 337.5f, 719.6f, 345.9f)
                curveTo(724.6f, 345.2f, 734.3f, 344.5f, 739.2f, 345.0f)
                curveTo(741.7f, 348.6f, 742.1f, 350.2f, 741.0f, 354.3f)
                curveTo(738.9f, 356.9f, 736.0f, 357.5f, 732.7f, 358.6f)
                lineTo(732.4f, 359.9f)
                curveTo(737.6f, 370.9f, 731.1f, 401.9f, 729.1f, 415.0f)
                lineTo(726.8f, 413.2f)
                curveTo(726.4f, 416.0f, 725.1f, 424.5f, 725.1f, 426.9f)
                lineTo(727.4f, 427.9f)
                curveTo(725.3f, 450.7f, 729.6f, 478.4f, 724.5f, 501.5f)
                curveTo(711.3f, 561.2f, 675.9f, 615.5f, 656.7f, 673.8f)
                curveTo(654.0f, 682.2f, 632.0f, 702.1f, 622.9f, 703.2f)
                curveTo(581.9f, 708.5f, 541.7f, 673.3f, 506.2f, 656.6f)
                curveTo(471.9f, 634.5f, 423.0f, 608.5f, 399.3f, 575.2f)
                curveTo(398.8f, 574.5f, 387.2f, 513.0f, 385.5f, 506.9f)
                curveTo(378.4f, 503.7f, 370.4f, 501.7f, 362.4f, 497.9f)
                curveTo(331.0f, 482.9f, 316.2f, 463.1f, 297.2f, 435.3f)
                curveTo(296.8f, 420.2f, 296.8f, 405.1f, 297.2f, 390.1f)
                curveTo(303.8f, 382.1f, 307.9f, 379.2f, 316.7f, 373.8f)
                curveTo(329.7f, 377.5f, 339.6f, 378.6f, 352.8f, 380.0f)
                curveTo(366.3f, 398.4f, 367.5f, 406.5f, 374.8f, 427.2f)
                curveTo(377.1f, 433.8f, 386.3f, 445.9f, 389.9f, 452.9f)
                curveTo(394.8f, 462.5f, 399.1f, 471.6f, 403.5f, 481.4f)
                curveTo(403.0f, 478.5f, 402.6f, 475.5f, 402.1f, 472.6f)
                curveTo(399.7f, 455.3f, 398.8f, 426.8f, 401.1f, 409.3f)
                curveTo(404.2f, 397.8f, 413.0f, 385.5f, 417.3f, 374.5f)
                curveTo(428.0f, 346.8f, 436.2f, 325.1f, 454.2f, 301.0f)
                curveTo(444.8f, 290.6f, 436.1f, 276.5f, 425.6f, 266.7f)
                curveTo(435.3f, 262.9f, 443.7f, 259.7f, 453.9f, 257.1f)
                curveTo(467.9f, 261.5f, 483.0f, 265.6f, 495.9f, 272.3f)
                curveTo(493.2f, 263.2f, 492.0f, 251.8f, 490.7f, 242.3f)
                curveTo(510.2f, 249.0f, 519.6f, 253.1f, 533.6f, 268.3f)
                curveTo(532.5f, 255.5f, 531.4f, 250.6f, 527.0f, 238.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF020302)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(658.1f, 391.3f)
                curveTo(669.9f, 380.7f, 684.7f, 365.7f, 700.9f, 365.3f)
                curveTo(712.9f, 365.0f, 717.6f, 365.3f, 729.6f, 362.0f)
                curveTo(723.1f, 367.1f, 700.4f, 379.8f, 698.9f, 383.5f)
                lineTo(700.1f, 384.8f)
                curveTo(708.6f, 385.0f, 719.6f, 393.4f, 724.0f, 400.4f)
                curveTo(726.6f, 404.6f, 726.5f, 408.4f, 726.8f, 413.2f)
                curveTo(726.4f, 416.0f, 725.1f, 424.5f, 725.1f, 426.9f)
                curveTo(721.6f, 433.3f, 713.9f, 444.3f, 705.2f, 442.2f)
                curveTo(705.6f, 439.6f, 711.2f, 435.3f, 713.2f, 432.0f)
                curveTo(719.0f, 422.2f, 715.8f, 393.1f, 698.9f, 398.9f)
                curveTo(693.9f, 405.8f, 713.0f, 419.5f, 698.1f, 430.7f)
                curveTo(694.5f, 433.4f, 693.4f, 438.0f, 690.6f, 439.9f)
                curveTo(682.0f, 436.4f, 670.2f, 433.3f, 666.9f, 424.2f)
                curveTo(664.7f, 418.0f, 668.8f, 415.1f, 668.5f, 411.7f)
                lineTo(667.0f, 411.0f)
                curveTo(663.2f, 412.1f, 659.1f, 416.2f, 656.0f, 418.8f)
                curveTo(655.9f, 406.3f, 657.0f, 403.0f, 658.1f, 391.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF020302)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(508.2f, 492.4f)
                curveTo(510.6f, 495.3f, 507.8f, 496.8f, 510.4f, 499.2f)
                curveTo(513.8f, 502.4f, 519.1f, 506.1f, 522.5f, 509.0f)
                curveTo(540.6f, 524.5f, 555.1f, 532.5f, 575.7f, 542.1f)
                curveTo(587.4f, 547.5f, 646.3f, 570.2f, 651.6f, 576.3f)
                lineTo(650.4f, 577.6f)
                curveTo(635.2f, 579.2f, 626.8f, 578.2f, 611.8f, 576.9f)
                curveTo(596.4f, 576.9f, 570.8f, 570.5f, 554.5f, 568.0f)
                curveTo(523.9f, 563.2f, 489.9f, 567.7f, 464.9f, 547.9f)
                curveTo(468.1f, 541.0f, 470.0f, 531.6f, 473.5f, 524.3f)
                curveTo(481.2f, 508.3f, 491.7f, 498.6f, 508.2f, 492.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(503.4f, 518.9f)
                curveTo(522.8f, 518.9f, 579.5f, 558.4f, 595.7f, 571.4f)
                curveTo(570.3f, 564.5f, 557.4f, 561.9f, 531.1f, 557.7f)
                curveTo(516.7f, 555.7f, 491.8f, 553.1f, 479.3f, 548.5f)
                lineTo(479.7f, 546.5f)
                curveTo(481.2f, 539.9f, 481.1f, 536.7f, 486.8f, 533.1f)
                curveTo(495.0f, 532.6f, 496.5f, 540.4f, 498.4f, 546.7f)
                curveTo(502.2f, 542.9f, 509.1f, 538.1f, 513.6f, 534.6f)
                curveTo(519.3f, 539.7f, 524.1f, 542.4f, 530.5f, 546.3f)
                curveTo(526.4f, 540.7f, 519.0f, 530.6f, 512.1f, 529.5f)
                curveTo(509.6f, 529.1f, 506.7f, 531.1f, 504.6f, 532.4f)
                curveTo(501.2f, 529.1f, 498.3f, 527.3f, 497.2f, 523.2f)
                curveTo(499.1f, 520.2f, 499.6f, 520.7f, 503.4f, 518.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF020302)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(474.5f, 350.7f)
                curveTo(498.9f, 327.1f, 509.7f, 321.8f, 543.9f, 328.8f)
                curveTo(546.7f, 328.8f, 551.2f, 327.6f, 553.9f, 326.7f)
                curveTo(560.9f, 325.4f, 564.9f, 328.2f, 571.2f, 330.2f)
                curveTo(600.1f, 339.3f, 589.0f, 351.5f, 590.1f, 372.8f)
                curveTo(583.5f, 368.7f, 579.9f, 365.5f, 574.1f, 360.3f)
                curveTo(574.5f, 371.4f, 576.7f, 383.1f, 569.0f, 391.4f)
                lineTo(567.2f, 391.7f)
                curveTo(555.6f, 381.9f, 570.8f, 333.6f, 518.4f, 336.0f)
                curveTo(507.1f, 336.5f, 498.9f, 342.2f, 491.2f, 350.7f)
                curveTo(489.9f, 352.1f, 487.8f, 354.9f, 486.5f, 356.6f)
                curveTo(496.7f, 350.9f, 512.8f, 342.6f, 524.8f, 346.6f)
                curveTo(541.5f, 352.1f, 537.2f, 380.3f, 536.1f, 393.5f)
                curveTo(536.0f, 394.7f, 541.8f, 396.0f, 542.7f, 396.2f)
                lineTo(543.2f, 397.5f)
                curveTo(537.6f, 405.1f, 489.8f, 387.1f, 481.8f, 381.6f)
                curveTo(477.5f, 378.6f, 475.4f, 356.7f, 474.5f, 350.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(543.9f, 328.8f)
                curveTo(546.7f, 328.8f, 551.2f, 327.6f, 553.9f, 326.7f)
                curveTo(558.6f, 331.5f, 562.1f, 335.5f, 566.4f, 340.6f)
                curveTo(559.2f, 336.6f, 551.4f, 332.1f, 543.9f, 328.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF020302)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(324.6f, 398.2f)
                curveTo(357.2f, 403.9f, 360.3f, 426.4f, 368.9f, 454.1f)
                curveTo(360.5f, 456.2f, 356.3f, 457.7f, 350.9f, 464.3f)
                lineTo(350.1f, 466.0f)
                lineTo(348.9f, 466.1f)
                curveTo(343.7f, 455.7f, 340.3f, 449.3f, 334.3f, 439.4f)
                curveTo(334.3f, 432.6f, 334.7f, 418.8f, 331.9f, 412.7f)
                curveTo(326.5f, 408.3f, 313.4f, 411.1f, 310.5f, 405.2f)
                curveTo(312.7f, 401.4f, 320.5f, 399.2f, 324.6f, 398.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF020302)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(656.6f, 473.2f)
                curveTo(681.6f, 472.7f, 671.2f, 483.1f, 682.7f, 497.8f)
                curveTo(701.7f, 521.8f, 656.5f, 532.0f, 638.2f, 533.3f)
                curveTo(644.6f, 523.9f, 653.5f, 518.6f, 658.9f, 509.4f)
                curveTo(663.9f, 500.9f, 657.6f, 483.6f, 654.7f, 474.0f)
                lineTo(656.6f, 473.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF020302)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(547.5f, 291.0f)
                curveTo(562.7f, 295.0f, 581.5f, 295.4f, 593.8f, 304.0f)
                curveTo(604.3f, 311.8f, 611.9f, 322.9f, 621.0f, 332.2f)
                curveTo(624.5f, 335.7f, 634.6f, 342.8f, 635.3f, 346.7f)
                curveTo(626.0f, 347.1f, 618.9f, 348.3f, 608.7f, 348.4f)
                curveTo(597.3f, 338.3f, 591.3f, 319.5f, 579.9f, 308.8f)
                curveTo(570.8f, 300.3f, 556.6f, 298.9f, 547.5f, 291.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF020302)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(614.5f, 598.4f)
                curveTo(617.8f, 598.0f, 620.5f, 597.4f, 623.6f, 598.7f)
                curveTo(627.7f, 611.4f, 605.4f, 617.0f, 596.5f, 619.8f)
                curveTo(591.6f, 620.9f, 588.2f, 618.9f, 586.2f, 614.7f)
                curveTo(586.2f, 601.0f, 604.7f, 599.5f, 614.5f, 598.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF020302)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(660.0f, 344.0f)
                lineTo(661.0f, 345.5f)
                curveTo(660.4f, 351.2f, 642.5f, 369.9f, 637.7f, 374.4f)
                curveTo(634.4f, 372.8f, 630.0f, 370.1f, 626.7f, 368.2f)
                curveTo(623.3f, 365.8f, 619.5f, 363.1f, 618.3f, 359.2f)
                curveTo(619.5f, 356.0f, 621.5f, 355.7f, 625.3f, 355.8f)
                curveTo(643.2f, 356.0f, 645.1f, 351.9f, 660.0f, 344.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF020302)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(632.3f, 502.7f)
                lineTo(632.9f, 502.7f)
                lineTo(633.6f, 504.2f)
                curveTo(629.3f, 513.1f, 624.0f, 518.8f, 613.8f, 516.5f)
                lineTo(610.2f, 512.7f)
                curveTo(609.4f, 509.3f, 609.3f, 510.6f, 611.0f, 507.5f)
                curveTo(616.5f, 503.6f, 625.5f, 503.4f, 632.3f, 502.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfefefe)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(654.7f, 474.0f)
                curveTo(653.6f, 470.1f, 652.1f, 466.0f, 652.7f, 462.0f)
                lineTo(653.8f, 462.5f)
                curveTo(655.4f, 466.6f, 655.8f, 468.8f, 656.6f, 473.2f)
                lineTo(654.7f, 474.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.6f, 125.6f)
                curveTo(499.5f, 116.6f, 527.1f, 111.1f, 548.1f, 99.5f)
                lineTo(549.1f, 100.4f)
                curveTo(549.0f, 107.1f, 536.9f, 122.6f, 532.3f, 127.8f)
                curveTo(545.1f, 126.0f, 626.7f, 113.1f, 631.7f, 114.7f)
                curveTo(637.2f, 121.9f, 627.2f, 140.0f, 624.2f, 147.5f)
                curveTo(623.6f, 149.1f, 632.4f, 155.7f, 633.6f, 156.7f)
                curveTo(636.4f, 171.2f, 628.1f, 175.1f, 644.4f, 176.2f)
                curveTo(646.8f, 180.3f, 650.3f, 185.4f, 649.0f, 190.4f)
                curveTo(647.4f, 196.6f, 640.2f, 199.9f, 634.3f, 199.9f)
                curveTo(631.7f, 198.6f, 630.3f, 197.8f, 629.4f, 194.9f)
                curveTo(628.3f, 191.9f, 628.9f, 176.6f, 628.4f, 176.4f)
                curveTo(622.9f, 173.5f, 623.9f, 180.7f, 612.9f, 169.4f)
                curveTo(612.9f, 165.9f, 613.5f, 155.6f, 612.0f, 153.1f)
                curveTo(608.8f, 153.0f, 609.9f, 152.6f, 607.7f, 154.5f)
                curveTo(606.9f, 161.5f, 610.5f, 165.2f, 604.5f, 170.8f)
                curveTo(596.7f, 178.0f, 580.9f, 177.3f, 581.8f, 163.5f)
                curveTo(583.1f, 161.5f, 584.0f, 160.0f, 585.0f, 157.9f)
                curveTo(583.6f, 155.4f, 581.1f, 154.1f, 578.7f, 152.5f)
                lineTo(577.3f, 153.0f)
                curveTo(577.3f, 156.9f, 579.1f, 160.7f, 578.2f, 164.4f)
                curveTo(575.6f, 174.3f, 568.5f, 176.8f, 559.6f, 175.8f)
                curveTo(561.4f, 179.3f, 564.6f, 188.3f, 560.6f, 190.9f)
                curveTo(554.2f, 190.3f, 544.1f, 180.8f, 538.5f, 176.4f)
                curveTo(523.6f, 173.1f, 525.9f, 167.8f, 526.1f, 154.3f)
                curveTo(522.7f, 162.1f, 517.7f, 177.3f, 507.0f, 175.9f)
                curveTo(499.8f, 172.4f, 500.0f, 167.6f, 495.9f, 161.0f)
                curveTo(490.4f, 164.9f, 493.3f, 174.4f, 485.9f, 175.5f)
                curveTo(468.8f, 178.0f, 468.6f, 172.2f, 466.2f, 158.3f)
                curveTo(462.6f, 164.4f, 458.3f, 174.4f, 451.1f, 175.8f)
                curveTo(443.9f, 174.9f, 440.5f, 169.1f, 435.5f, 163.4f)
                curveTo(430.7f, 172.4f, 430.4f, 172.0f, 420.8f, 174.9f)
                curveTo(416.9f, 172.8f, 415.9f, 172.1f, 411.6f, 171.8f)
                curveTo(409.7f, 165.8f, 410.5f, 162.6f, 411.5f, 156.4f)
                curveTo(424.6f, 149.6f, 431.9f, 155.6f, 439.5f, 148.1f)
                curveTo(454.3f, 133.3f, 469.1f, 119.5f, 485.2f, 106.0f)
                curveTo(483.8f, 112.2f, 482.3f, 119.5f, 480.6f, 125.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF020302)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(552.0f, 148.2f)
                curveTo(554.0f, 159.1f, 552.4f, 166.4f, 559.5f, 175.1f)
                curveTo(555.4f, 176.4f, 546.5f, 176.3f, 542.2f, 175.0f)
                curveTo(543.9f, 173.9f, 548.1f, 171.2f, 549.4f, 170.0f)
                curveTo(549.9f, 162.7f, 550.2f, 155.2f, 552.0f, 148.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(353.7f, 204.8f)
                lineTo(354.6f, 206.1f)
                curveTo(354.1f, 213.2f, 355.4f, 223.3f, 356.0f, 230.7f)
                curveTo(357.1f, 243.5f, 357.9f, 256.4f, 358.5f, 269.2f)
                lineTo(357.2f, 270.0f)
                curveTo(353.3f, 267.0f, 351.7f, 260.6f, 348.0f, 255.9f)
                curveTo(344.6f, 258.5f, 346.5f, 261.6f, 344.1f, 265.1f)
                curveTo(342.3f, 267.8f, 338.7f, 271.5f, 336.4f, 273.9f)
                curveTo(331.8f, 270.5f, 328.9f, 268.3f, 323.2f, 268.0f)
                curveTo(323.2f, 274.1f, 348.2f, 293.4f, 320.5f, 299.0f)
                curveTo(315.0f, 309.5f, 311.1f, 314.1f, 302.3f, 321.8f)
                curveTo(294.2f, 314.1f, 293.6f, 314.5f, 292.7f, 303.2f)
                curveTo(282.5f, 304.9f, 274.5f, 306.6f, 264.5f, 309.0f)
                curveTo(274.8f, 301.8f, 285.9f, 291.6f, 296.9f, 283.6f)
                curveTo(300.7f, 269.3f, 302.7f, 257.9f, 304.8f, 243.4f)
                curveTo(314.5f, 241.7f, 331.6f, 238.3f, 340.9f, 237.9f)
                curveTo(345.6f, 227.0f, 348.0f, 215.9f, 353.7f, 204.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(427.0f, 177.2f)
                curveTo(432.1f, 176.0f, 438.9f, 174.0f, 442.8f, 177.8f)
                curveTo(456.4f, 190.9f, 440.0f, 204.9f, 423.5f, 194.0f)
                curveTo(424.5f, 187.9f, 425.0f, 183.1f, 427.0f, 177.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(657.8f, 175.1f)
                curveTo(649.2f, 173.1f, 632.6f, 165.5f, 646.9f, 154.4f)
                curveTo(650.5f, 151.6f, 658.8f, 154.4f, 663.4f, 155.6f)
                curveTo(663.2f, 165.0f, 664.4f, 168.4f, 658.5f, 175.1f)
                lineTo(657.8f, 175.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(345.7f, 271.9f)
                curveTo(361.6f, 271.1f, 363.1f, 287.7f, 354.4f, 295.7f)
                curveTo(338.1f, 294.5f, 333.7f, 282.0f, 345.7f, 271.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(652.6f, 196.8f)
                curveTo(655.8f, 199.5f, 661.2f, 216.4f, 658.0f, 221.0f)
                curveTo(655.7f, 222.8f, 654.1f, 222.6f, 651.2f, 222.6f)
                curveTo(636.0f, 211.9f, 641.2f, 207.2f, 652.6f, 196.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(574.5f, 176.2f)
                curveTo(579.9f, 175.9f, 586.0f, 174.3f, 587.7f, 180.2f)
                curveTo(586.9f, 184.5f, 581.9f, 191.5f, 579.3f, 195.5f)
                curveTo(576.9f, 197.5f, 578.1f, 197.2f, 575.0f, 196.9f)
                curveTo(566.5f, 192.1f, 566.0f, 182.1f, 574.5f, 176.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(607.8f, 174.8f)
                curveTo(617.8f, 174.3f, 621.8f, 183.8f, 619.4f, 192.0f)
                curveTo(616.9f, 194.3f, 618.1f, 193.8f, 614.6f, 193.8f)
                curveTo(609.2f, 190.6f, 601.4f, 186.1f, 600.2f, 179.9f)
                curveTo(602.5f, 176.3f, 603.2f, 176.9f, 607.8f, 174.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(407.8f, 174.5f)
                curveTo(410.9f, 175.0f, 414.2f, 174.9f, 415.9f, 177.3f)
                curveTo(417.5f, 179.5f, 419.8f, 190.4f, 419.9f, 192.8f)
                curveTo(414.2f, 190.6f, 401.2f, 184.4f, 400.7f, 178.0f)
                curveTo(403.2f, 175.2f, 403.6f, 175.8f, 407.8f, 174.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(286.6f, 320.0f)
                curveTo(291.0f, 319.8f, 296.6f, 318.8f, 297.3f, 324.1f)
                curveTo(295.3f, 328.5f, 289.9f, 332.9f, 286.3f, 336.3f)
                curveTo(284.9f, 337.8f, 284.0f, 338.3f, 282.4f, 339.5f)
                lineTo(280.9f, 338.8f)
                curveTo(279.4f, 332.6f, 282.1f, 324.5f, 286.6f, 320.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(663.0f, 225.1f)
                lineTo(664.3f, 226.3f)
                curveTo(665.0f, 230.4f, 667.0f, 239.5f, 664.9f, 242.8f)
                lineTo(663.1f, 242.3f)
                curveTo(659.8f, 237.9f, 656.8f, 235.3f, 656.4f, 230.3f)
                curveTo(657.5f, 227.5f, 660.4f, 226.5f, 663.0f, 225.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(657.8f, 175.1f)
                lineTo(658.5f, 175.1f)
                curveTo(662.0f, 176.7f, 664.9f, 175.7f, 669.0f, 178.6f)
                curveTo(667.3f, 180.8f, 665.7f, 179.9f, 663.5f, 180.9f)
                curveTo(663.0f, 181.1f, 659.0f, 185.4f, 658.4f, 186.0f)
                lineTo(657.3f, 185.4f)
                curveTo(656.7f, 180.9f, 657.0f, 179.6f, 657.8f, 175.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(625.1f, 197.4f)
                curveTo(632.1f, 199.9f, 635.5f, 203.7f, 633.6f, 210.8f)
                curveTo(628.6f, 209.4f, 624.5f, 202.8f, 625.1f, 197.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfefefe)), stroke = null, fillAlpha = 0.984314f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(726.8f, 413.2f)
                lineTo(729.1f, 415.0f)
                curveTo(728.8f, 420.1f, 728.6f, 422.8f, 727.4f, 427.9f)
                lineTo(725.1f, 426.9f)
                curveTo(725.1f, 424.5f, 726.4f, 416.0f, 726.8f, 413.2f)
                close()
            }
        }
        .build()
        return _standardRyujiSakamoto!!
    }

private var _standardRyujiSakamoto: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = StandardSenderAvatar.StandardRyujiSakamoto, contentDescription = "")
    }
}
