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

public val StandardSenderAvatar.StandardTaeTakemi: ImageVector
    get() {
        if (_standardTaeTakemi != null) {
            return _standardTaeTakemi!!
        }
        _standardTaeTakemi = Builder(name = "StandardTaeTakemi", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 1024.0f, viewportHeight = 1024.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.1f, 15.5f)
                curveTo(508.2f, 15.6f, 539.1f, 40.6f, 553.4f, 44.2f)
                curveTo(570.2f, 48.5f, 586.7f, 42.5f, 603.0f, 45.2f)
                curveTo(614.9f, 47.2f, 629.5f, 59.0f, 641.4f, 62.7f)
                curveTo(651.0f, 65.7f, 661.5f, 67.2f, 671.3f, 69.2f)
                curveTo(681.7f, 71.4f, 691.8f, 74.5f, 701.6f, 78.4f)
                curveTo(734.8f, 91.8f, 755.9f, 110.8f, 775.6f, 139.5f)
                curveTo(785.1f, 153.0f, 800.1f, 166.4f, 808.8f, 180.1f)
                curveTo(834.1f, 219.9f, 855.9f, 266.5f, 867.5f, 312.3f)
                curveTo(871.5f, 328.2f, 870.6f, 351.8f, 870.9f, 367.9f)
                curveTo(871.5f, 410.0f, 862.2f, 443.8f, 846.4f, 482.2f)
                curveTo(843.5f, 484.1f, 845.3f, 479.6f, 840.0f, 478.7f)
                curveTo(834.2f, 485.5f, 808.1f, 536.6f, 803.6f, 546.9f)
                curveTo(801.0f, 552.8f, 796.9f, 568.2f, 794.6f, 575.1f)
                curveTo(793.3f, 579.1f, 791.1f, 587.3f, 787.4f, 589.2f)
                lineTo(785.6f, 588.4f)
                curveTo(783.2f, 584.2f, 783.1f, 578.3f, 782.7f, 573.3f)
                curveTo(778.5f, 585.4f, 765.8f, 622.8f, 754.0f, 628.0f)
                lineTo(751.7f, 626.5f)
                curveTo(747.8f, 626.3f, 742.5f, 633.5f, 738.9f, 635.6f)
                curveTo(735.1f, 637.7f, 729.9f, 639.7f, 725.8f, 641.3f)
                curveTo(725.5f, 638.3f, 725.3f, 631.8f, 722.7f, 630.3f)
                curveTo(718.8f, 633.6f, 703.1f, 669.2f, 697.4f, 676.6f)
                curveTo(696.1f, 678.3f, 697.6f, 681.4f, 698.6f, 683.2f)
                curveTo(705.2f, 688.2f, 721.4f, 688.9f, 730.3f, 690.1f)
                curveTo(744.9f, 715.6f, 759.6f, 746.8f, 763.9f, 776.0f)
                curveTo(777.3f, 790.1f, 791.3f, 804.3f, 806.1f, 816.9f)
                curveTo(818.5f, 827.3f, 832.0f, 836.5f, 845.2f, 846.0f)
                curveTo(878.9f, 870.1f, 914.0f, 893.4f, 950.4f, 913.3f)
                curveTo(964.8f, 921.2f, 992.9f, 926.9f, 1003.5f, 936.5f)
                curveTo(1008.7f, 941.1f, 1008.4f, 953.0f, 1008.8f, 959.6f)
                curveTo(1009.3f, 967.3f, 1010.8f, 999.3f, 1005.6f, 1004.8f)
                curveTo(1001.6f, 1009.0f, 654.0f, 1007.5f, 615.8f, 1007.6f)
                lineTo(233.4f, 1008.1f)
                curveTo(236.4f, 1000.2f, 239.7f, 990.5f, 243.8f, 983.6f)
                curveTo(265.5f, 947.2f, 310.8f, 939.2f, 343.4f, 916.3f)
                curveTo(346.8f, 913.9f, 358.6f, 895.9f, 362.4f, 891.0f)
                curveTo(383.1f, 864.3f, 411.2f, 846.0f, 437.2f, 825.1f)
                curveTo(448.9f, 815.8f, 459.2f, 809.9f, 469.0f, 798.2f)
                curveTo(465.4f, 789.3f, 464.0f, 774.5f, 460.4f, 768.2f)
                curveTo(445.0f, 741.9f, 412.8f, 725.5f, 391.7f, 704.9f)
                curveTo(384.6f, 697.9f, 379.5f, 679.6f, 371.3f, 673.2f)
                curveTo(365.8f, 673.7f, 367.1f, 676.6f, 360.7f, 678.4f)
                curveTo(353.7f, 678.0f, 338.7f, 656.8f, 330.2f, 649.4f)
                curveTo(334.3f, 662.1f, 337.3f, 673.4f, 344.3f, 685.0f)
                curveTo(346.4f, 688.4f, 348.6f, 694.6f, 350.1f, 698.4f)
                curveTo(340.7f, 692.1f, 326.0f, 682.7f, 318.0f, 674.4f)
                curveTo(293.5f, 649.0f, 276.0f, 608.7f, 262.6f, 576.2f)
                curveTo(258.8f, 566.9f, 254.7f, 546.5f, 250.9f, 538.8f)
                curveTo(247.9f, 532.7f, 238.9f, 519.5f, 234.6f, 511.4f)
                curveTo(211.9f, 468.6f, 202.4f, 434.2f, 202.0f, 386.0f)
                curveTo(199.9f, 345.1f, 210.5f, 311.8f, 223.7f, 274.2f)
                curveTo(237.3f, 235.6f, 251.6f, 209.8f, 277.3f, 177.7f)
                curveTo(289.7f, 162.2f, 311.1f, 146.8f, 321.4f, 132.3f)
                curveTo(335.2f, 112.7f, 337.7f, 80.1f, 358.8f, 62.8f)
                curveTo(383.4f, 38.3f, 405.1f, 36.3f, 437.4f, 46.4f)
                curveTo(443.5f, 48.3f, 453.0f, 51.9f, 459.7f, 51.9f)
                curveTo(468.6f, 50.4f, 489.5f, 23.1f, 496.1f, 15.5f)
                close()
                moveTo(376.7f, 87.9f)
                curveTo(379.7f, 85.2f, 394.2f, 72.4f, 397.2f, 71.1f)
                curveTo(410.0f, 65.9f, 427.5f, 63.8f, 439.8f, 57.0f)
                curveTo(441.4f, 56.1f, 441.1f, 56.0f, 441.4f, 54.4f)
                curveTo(435.3f, 50.8f, 423.6f, 51.9f, 416.5f, 52.3f)
                curveTo(390.8f, 58.0f, 380.4f, 68.2f, 364.0f, 89.6f)
                curveTo(362.9f, 91.1f, 359.6f, 97.4f, 359.6f, 98.9f)
                curveTo(364.3f, 98.9f, 372.8f, 91.1f, 376.7f, 87.9f)
                close()
                moveTo(692.6f, 274.5f)
                curveTo(692.4f, 269.3f, 689.8f, 263.7f, 684.8f, 261.7f)
                curveTo(686.0f, 264.5f, 689.3f, 273.3f, 691.3f, 274.7f)
                lineTo(692.6f, 274.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(550.3f, 411.0f)
                curveTo(557.5f, 427.0f, 565.2f, 442.7f, 573.2f, 458.3f)
                curveTo(579.0f, 469.7f, 584.0f, 475.0f, 594.3f, 482.3f)
                curveTo(592.6f, 502.1f, 592.3f, 522.0f, 591.4f, 541.9f)
                curveTo(590.7f, 555.3f, 588.1f, 569.4f, 587.5f, 582.2f)
                curveTo(590.4f, 577.2f, 592.3f, 573.3f, 596.6f, 569.3f)
                lineTo(598.1f, 569.2f)
                curveTo(600.2f, 576.8f, 597.3f, 581.0f, 603.0f, 585.8f)
                lineTo(605.4f, 585.7f)
                curveTo(609.2f, 580.7f, 613.2f, 573.1f, 616.4f, 567.5f)
                curveTo(618.1f, 570.2f, 618.0f, 579.1f, 618.8f, 583.5f)
                curveTo(621.6f, 584.1f, 628.8f, 580.4f, 632.2f, 579.0f)
                curveTo(641.8f, 594.6f, 637.7f, 611.1f, 635.2f, 628.5f)
                curveTo(634.1f, 636.6f, 627.0f, 646.5f, 621.8f, 652.6f)
                curveTo(597.4f, 681.2f, 570.9f, 704.6f, 539.5f, 725.6f)
                curveTo(522.2f, 737.1f, 498.1f, 761.1f, 475.0f, 748.1f)
                curveTo(464.0f, 741.9f, 456.4f, 731.9f, 447.1f, 724.0f)
                curveTo(427.7f, 707.6f, 408.7f, 692.0f, 391.7f, 673.1f)
                curveTo(385.3f, 666.1f, 379.8f, 658.3f, 375.1f, 650.0f)
                curveTo(359.7f, 622.6f, 348.6f, 593.5f, 338.6f, 563.7f)
                curveTo(334.3f, 550.7f, 330.4f, 550.2f, 334.1f, 535.7f)
                curveTo(334.1f, 535.7f, 329.7f, 527.0f, 328.9f, 525.4f)
                curveTo(330.7f, 521.9f, 335.9f, 522.6f, 339.6f, 522.5f)
                curveTo(348.7f, 542.7f, 351.0f, 545.9f, 368.1f, 559.4f)
                curveTo(371.9f, 556.2f, 380.1f, 550.0f, 381.5f, 545.5f)
                curveTo(380.3f, 540.7f, 377.4f, 540.9f, 376.4f, 535.4f)
                curveTo(378.1f, 533.7f, 378.5f, 533.5f, 380.6f, 532.2f)
                lineTo(380.8f, 530.1f)
                curveTo(375.3f, 524.4f, 368.7f, 518.6f, 362.8f, 513.2f)
                curveTo(388.9f, 525.6f, 391.9f, 532.7f, 409.6f, 555.8f)
                curveTo(405.8f, 544.6f, 401.7f, 525.8f, 395.9f, 516.8f)
                curveTo(386.8f, 502.7f, 363.5f, 503.0f, 363.9f, 483.1f)
                lineTo(364.9f, 482.5f)
                curveTo(373.1f, 491.1f, 365.8f, 489.7f, 381.2f, 490.9f)
                curveTo(378.2f, 482.2f, 367.8f, 439.4f, 371.3f, 432.0f)
                curveTo(372.0f, 433.7f, 372.9f, 437.8f, 373.0f, 439.6f)
                curveTo(374.6f, 458.3f, 385.2f, 473.2f, 390.9f, 490.0f)
                curveTo(401.4f, 490.1f, 418.3f, 489.0f, 427.7f, 490.4f)
                curveTo(427.4f, 487.0f, 426.6f, 484.0f, 428.3f, 481.3f)
                curveTo(431.2f, 482.4f, 432.9f, 486.1f, 434.4f, 488.9f)
                curveTo(439.8f, 488.3f, 453.1f, 486.4f, 457.8f, 487.3f)
                curveTo(458.8f, 488.9f, 459.2f, 489.4f, 460.4f, 490.8f)
                lineTo(462.8f, 490.5f)
                curveTo(465.0f, 487.3f, 467.0f, 483.5f, 470.5f, 482.3f)
                curveTo(474.1f, 482.7f, 474.3f, 482.7f, 477.4f, 485.5f)
                lineTo(479.0f, 486.4f)
                curveTo(480.3f, 486.4f, 481.7f, 486.3f, 483.0f, 486.1f)
                curveTo(488.4f, 485.4f, 511.1f, 482.0f, 514.1f, 478.2f)
                lineTo(513.6f, 477.0f)
                curveTo(520.2f, 475.1f, 524.8f, 475.7f, 531.3f, 474.8f)
                curveTo(534.0f, 474.3f, 533.2f, 470.6f, 537.4f, 470.2f)
                curveTo(539.9f, 474.2f, 538.2f, 475.2f, 541.1f, 478.0f)
                curveTo(542.7f, 475.2f, 542.8f, 474.7f, 543.5f, 471.5f)
                curveTo(550.0f, 465.2f, 560.6f, 470.0f, 563.6f, 463.8f)
                curveTo(561.8f, 450.3f, 552.8f, 428.5f, 550.3f, 411.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(513.6f, 477.0f)
                curveTo(520.2f, 475.1f, 524.8f, 475.7f, 531.3f, 474.8f)
                curveTo(534.0f, 474.3f, 533.2f, 470.6f, 537.4f, 470.2f)
                curveTo(539.9f, 474.2f, 538.2f, 475.2f, 541.1f, 478.0f)
                lineTo(541.0f, 480.2f)
                curveTo(560.2f, 490.1f, 578.2f, 483.5f, 585.6f, 487.0f)
                lineTo(585.3f, 488.3f)
                curveTo(581.0f, 488.8f, 580.3f, 488.1f, 577.5f, 490.4f)
                curveTo(571.4f, 511.1f, 568.2f, 530.3f, 546.5f, 540.1f)
                curveTo(547.4f, 542.9f, 548.7f, 545.4f, 547.8f, 548.2f)
                curveTo(544.2f, 548.5f, 542.4f, 545.3f, 538.6f, 544.5f)
                curveTo(528.5f, 542.5f, 529.0f, 554.2f, 523.0f, 558.5f)
                lineTo(521.9f, 558.1f)
                curveTo(521.5f, 554.6f, 521.6f, 550.7f, 519.3f, 548.4f)
                curveTo(514.1f, 545.7f, 509.3f, 545.9f, 507.4f, 543.5f)
                curveTo(513.4f, 535.6f, 527.0f, 545.1f, 537.5f, 537.1f)
                curveTo(539.0f, 531.1f, 517.1f, 522.0f, 517.0f, 509.5f)
                curveTo(516.9f, 496.6f, 499.6f, 501.1f, 493.6f, 506.5f)
                curveTo(482.3f, 512.3f, 487.1f, 531.0f, 480.2f, 532.6f)
                curveTo(474.3f, 527.0f, 487.5f, 511.9f, 482.3f, 506.2f)
                curveTo(479.9f, 506.2f, 466.4f, 511.9f, 462.0f, 513.3f)
                curveTo(472.8f, 504.0f, 479.4f, 498.0f, 492.3f, 492.4f)
                curveTo(490.8f, 490.8f, 484.0f, 489.9f, 479.0f, 486.4f)
                curveTo(480.3f, 486.4f, 481.7f, 486.3f, 483.0f, 486.1f)
                curveTo(488.4f, 485.4f, 511.1f, 482.0f, 514.1f, 478.2f)
                lineTo(513.6f, 477.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(513.6f, 477.0f)
                curveTo(520.2f, 475.1f, 524.8f, 475.7f, 531.3f, 474.8f)
                curveTo(534.0f, 474.3f, 533.2f, 470.6f, 537.4f, 470.2f)
                curveTo(539.9f, 474.2f, 538.2f, 475.2f, 541.1f, 478.0f)
                lineTo(541.0f, 480.2f)
                curveTo(534.1f, 477.7f, 522.9f, 480.1f, 514.1f, 478.2f)
                lineTo(513.6f, 477.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.7f, 670.2f)
                curveTo(450.0f, 669.4f, 464.0f, 674.4f, 481.0f, 676.6f)
                curveTo(486.0f, 677.2f, 500.7f, 677.9f, 504.6f, 680.0f)
                curveTo(497.7f, 681.8f, 484.4f, 683.5f, 477.0f, 684.4f)
                curveTo(473.2f, 688.3f, 470.2f, 691.7f, 466.7f, 695.8f)
                curveTo(472.4f, 702.6f, 476.5f, 693.6f, 484.0f, 712.9f)
                curveTo(464.3f, 712.6f, 445.0f, 708.8f, 440.8f, 685.9f)
                lineTo(440.7f, 685.0f)
                lineTo(440.6f, 685.8f)
                curveTo(437.6f, 682.7f, 430.6f, 676.2f, 430.4f, 672.2f)
                lineTo(432.7f, 670.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(404.4f, 606.7f)
                lineTo(405.4f, 608.0f)
                curveTo(408.8f, 636.6f, 389.4f, 644.5f, 434.1f, 652.8f)
                curveTo(428.4f, 654.5f, 420.2f, 655.9f, 414.2f, 657.1f)
                curveTo(400.0f, 659.2f, 396.0f, 656.7f, 386.2f, 647.0f)
                curveTo(388.8f, 639.0f, 399.3f, 613.4f, 404.4f, 606.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(334.4f, 548.7f)
                curveTo(340.9f, 550.4f, 345.7f, 559.1f, 353.0f, 562.2f)
                curveTo(356.8f, 563.8f, 363.1f, 561.3f, 365.8f, 563.3f)
                lineTo(366.7f, 563.9f)
                lineTo(367.1f, 566.4f)
                curveTo(365.1f, 568.7f, 361.5f, 569.1f, 358.4f, 569.8f)
                curveTo(355.2f, 571.2f, 353.3f, 574.1f, 348.6f, 575.6f)
                lineTo(347.2f, 574.0f)
                curveTo(349.9f, 565.9f, 346.3f, 568.3f, 342.1f, 562.5f)
                curveTo(340.2f, 559.9f, 335.4f, 551.8f, 334.4f, 548.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(382.0f, 232.9f)
                curveTo(393.0f, 227.5f, 404.6f, 219.9f, 413.5f, 211.4f)
                curveTo(410.6f, 225.9f, 410.3f, 237.2f, 409.7f, 251.8f)
                curveTo(409.6f, 254.8f, 406.2f, 255.3f, 406.7f, 259.5f)
                curveTo(416.1f, 261.4f, 426.4f, 262.9f, 423.1f, 275.8f)
                curveTo(420.4f, 286.5f, 411.7f, 280.2f, 406.8f, 285.9f)
                curveTo(405.7f, 287.1f, 408.3f, 293.9f, 409.0f, 296.0f)
                curveTo(407.3f, 301.6f, 405.3f, 308.4f, 402.7f, 313.6f)
                curveTo(407.5f, 311.0f, 411.8f, 308.5f, 417.3f, 310.1f)
                curveTo(423.1f, 314.1f, 421.6f, 323.9f, 421.6f, 330.5f)
                curveTo(416.1f, 331.5f, 408.1f, 333.7f, 403.5f, 331.0f)
                curveTo(401.8f, 328.3f, 399.6f, 324.0f, 397.0f, 322.8f)
                curveTo(393.1f, 327.1f, 397.3f, 328.7f, 392.6f, 331.7f)
                lineTo(387.7f, 331.7f)
                curveTo(384.2f, 327.5f, 380.2f, 310.6f, 379.2f, 304.9f)
                curveTo(368.1f, 300.5f, 368.5f, 300.6f, 356.5f, 298.5f)
                curveTo(354.2f, 291.0f, 364.3f, 280.8f, 371.5f, 284.8f)
                curveTo(372.4f, 285.3f, 373.6f, 286.1f, 374.5f, 286.7f)
                lineTo(375.7f, 286.4f)
                curveTo(375.5f, 281.8f, 372.6f, 280.1f, 371.9f, 276.2f)
                curveTo(371.2f, 271.6f, 372.8f, 263.4f, 370.9f, 259.3f)
                curveTo(364.5f, 257.4f, 354.4f, 255.1f, 348.6f, 259.0f)
                curveTo(337.9f, 263.3f, 336.5f, 271.4f, 329.8f, 280.0f)
                curveTo(326.7f, 283.8f, 323.6f, 286.6f, 320.6f, 290.1f)
                curveTo(320.2f, 294.2f, 319.9f, 298.3f, 319.6f, 302.4f)
                curveTo(315.7f, 305.2f, 310.9f, 308.7f, 307.3f, 311.8f)
                curveTo(303.0f, 307.4f, 299.8f, 304.0f, 294.6f, 300.4f)
                curveTo(303.7f, 317.6f, 311.8f, 323.1f, 291.8f, 335.0f)
                curveTo(290.4f, 342.4f, 290.1f, 351.1f, 284.1f, 355.6f)
                curveTo(276.6f, 356.1f, 274.5f, 345.7f, 272.3f, 339.7f)
                curveTo(275.0f, 327.4f, 275.5f, 314.0f, 277.2f, 301.5f)
                curveTo(280.3f, 278.4f, 287.7f, 248.4f, 300.2f, 228.4f)
                curveTo(308.9f, 232.8f, 335.4f, 244.6f, 344.7f, 247.6f)
                curveTo(358.5f, 242.3f, 363.0f, 235.9f, 371.4f, 232.6f)
                lineTo(372.5f, 233.2f)
                lineTo(372.9f, 235.3f)
                curveTo(377.2f, 236.3f, 377.7f, 235.3f, 382.0f, 232.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(765.6f, 171.1f)
                curveTo(766.9f, 172.6f, 771.6f, 181.3f, 773.5f, 183.7f)
                curveTo(800.6f, 220.9f, 813.7f, 260.2f, 822.5f, 305.1f)
                curveTo(816.4f, 295.4f, 801.2f, 267.8f, 787.7f, 270.4f)
                curveTo(787.3f, 270.8f, 786.9f, 271.4f, 786.4f, 272.0f)
                curveTo(787.7f, 277.6f, 789.8f, 287.6f, 790.8f, 292.8f)
                curveTo(793.0f, 303.6f, 793.1f, 311.2f, 792.7f, 321.9f)
                curveTo(789.5f, 325.0f, 784.5f, 328.5f, 780.7f, 331.3f)
                curveTo(778.8f, 322.8f, 776.4f, 314.5f, 773.4f, 306.3f)
                curveTo(772.0f, 302.4f, 770.4f, 297.2f, 768.7f, 293.6f)
                curveTo(762.8f, 281.1f, 757.5f, 279.2f, 756.6f, 265.0f)
                lineTo(742.8f, 251.7f)
                lineTo(742.7f, 251.2f)
                curveTo(737.6f, 228.4f, 728.6f, 236.8f, 721.9f, 214.0f)
                curveTo(721.7f, 216.5f, 721.4f, 218.9f, 721.0f, 221.3f)
                curveTo(719.6f, 230.0f, 716.3f, 237.0f, 705.7f, 234.6f)
                curveTo(701.2f, 233.5f, 695.2f, 222.1f, 697.3f, 218.0f)
                curveTo(700.7f, 211.3f, 711.5f, 213.8f, 717.4f, 211.0f)
                lineTo(717.2f, 210.4f)
                curveTo(715.6f, 205.8f, 712.5f, 195.3f, 716.4f, 191.6f)
                curveTo(719.8f, 193.5f, 724.2f, 204.6f, 726.0f, 208.8f)
                curveTo(733.3f, 208.6f, 741.9f, 209.5f, 747.0f, 204.6f)
                curveTo(749.7f, 199.0f, 744.9f, 186.9f, 742.9f, 180.3f)
                curveTo(749.7f, 177.6f, 759.8f, 175.1f, 765.6f, 171.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(500.2f, 36.6f)
                curveTo(501.0f, 36.7f, 501.8f, 36.9f, 502.6f, 37.0f)
                curveTo(568.1f, 50.6f, 569.2f, 210.9f, 558.4f, 260.7f)
                lineTo(557.7f, 263.1f)
                lineTo(556.6f, 263.4f)
                curveTo(554.7f, 258.0f, 553.7f, 244.9f, 553.2f, 238.6f)
                curveTo(549.8f, 200.4f, 545.9f, 164.3f, 535.3f, 127.2f)
                curveTo(529.7f, 107.6f, 527.0f, 92.3f, 513.2f, 75.8f)
                curveTo(504.3f, 65.1f, 502.3f, 49.8f, 500.2f, 36.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(574.1f, 55.1f)
                curveTo(619.7f, 54.3f, 659.9f, 122.3f, 672.8f, 160.4f)
                curveTo(670.5f, 158.1f, 668.1f, 154.8f, 666.2f, 152.2f)
                curveTo(652.1f, 132.4f, 623.5f, 101.7f, 603.5f, 88.3f)
                curveTo(586.8f, 77.2f, 575.6f, 85.3f, 560.0f, 65.0f)
                curveTo(565.5f, 59.8f, 567.7f, 58.4f, 574.1f, 55.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(261.7f, 339.0f)
                curveTo(259.3f, 328.8f, 256.9f, 318.3f, 258.7f, 307.7f)
                curveTo(264.8f, 271.0f, 268.1f, 234.5f, 293.1f, 205.4f)
                curveTo(293.3f, 233.0f, 279.9f, 258.3f, 274.3f, 285.5f)
                curveTo(270.9f, 302.0f, 268.5f, 318.8f, 265.9f, 335.5f)
                lineTo(261.7f, 339.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(453.6f, 233.9f)
                curveTo(462.5f, 235.2f, 473.7f, 242.4f, 466.5f, 252.8f)
                curveTo(464.7f, 255.4f, 460.1f, 258.8f, 457.6f, 260.9f)
                curveTo(456.8f, 261.5f, 456.7f, 261.3f, 455.3f, 261.4f)
                curveTo(450.4f, 258.1f, 447.1f, 252.7f, 443.1f, 247.9f)
                curveTo(446.8f, 241.8f, 448.1f, 238.6f, 453.6f, 233.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(348.6f, 259.0f)
                curveTo(366.9f, 262.4f, 371.1f, 273.8f, 355.2f, 284.9f)
                curveTo(348.0f, 284.4f, 340.5f, 279.9f, 341.4f, 272.1f)
                curveTo(342.2f, 265.7f, 345.0f, 263.9f, 348.6f, 259.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(426.5f, 282.8f)
                curveTo(430.6f, 284.9f, 434.4f, 287.5f, 438.3f, 290.0f)
                lineTo(437.4f, 303.4f)
                curveTo(434.4f, 305.3f, 430.8f, 308.1f, 427.9f, 310.2f)
                curveTo(420.5f, 310.0f, 413.3f, 300.7f, 416.3f, 293.2f)
                curveTo(419.1f, 286.3f, 420.6f, 286.3f, 426.5f, 282.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(337.0f, 282.6f)
                curveTo(355.4f, 291.9f, 351.2f, 298.8f, 339.2f, 310.5f)
                curveTo(334.3f, 309.8f, 325.7f, 303.8f, 326.2f, 298.1f)
                curveTo(326.9f, 290.4f, 331.8f, 287.3f, 337.0f, 282.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(721.7f, 233.7f)
                curveTo(725.5f, 234.3f, 733.5f, 238.0f, 735.0f, 241.7f)
                curveTo(739.3f, 251.7f, 731.8f, 255.7f, 725.1f, 259.0f)
                lineTo(723.4f, 260.4f)
                curveTo(717.5f, 258.8f, 713.4f, 253.2f, 713.7f, 247.1f)
                curveTo(714.0f, 240.7f, 717.5f, 237.9f, 721.7f, 233.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(501.5f, 474.7f)
                curveTo(493.8f, 456.6f, 491.2f, 445.8f, 491.5f, 425.8f)
                curveTo(495.5f, 440.3f, 500.3f, 459.0f, 507.4f, 472.4f)
                curveTo(508.1f, 473.7f, 512.1f, 475.9f, 513.6f, 477.0f)
                lineTo(514.1f, 478.2f)
                curveTo(511.1f, 482.0f, 488.4f, 485.4f, 483.0f, 486.1f)
                curveTo(481.7f, 486.3f, 480.3f, 486.4f, 479.0f, 486.4f)
                lineTo(477.4f, 485.5f)
                curveTo(482.0f, 480.7f, 494.4f, 477.8f, 501.5f, 474.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(695.1f, 233.7f)
                curveTo(707.2f, 236.8f, 709.8f, 253.9f, 694.4f, 260.2f)
                curveTo(677.4f, 249.4f, 677.8f, 243.5f, 695.1f, 233.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(442.3f, 258.9f)
                curveTo(452.2f, 259.2f, 460.2f, 274.5f, 444.6f, 283.8f)
                curveTo(432.7f, 285.0f, 429.0f, 275.8f, 433.0f, 266.3f)
                curveTo(435.0f, 261.3f, 437.5f, 260.7f, 442.3f, 258.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(708.0f, 259.8f)
                curveTo(724.8f, 261.5f, 725.0f, 279.5f, 710.7f, 284.6f)
                curveTo(695.2f, 278.8f, 694.1f, 269.0f, 708.0f, 259.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(454.1f, 283.7f)
                curveTo(456.9f, 283.3f, 462.3f, 285.9f, 464.1f, 287.9f)
                curveTo(471.1f, 295.4f, 464.4f, 304.3f, 460.2f, 309.2f)
                curveTo(443.9f, 304.3f, 438.5f, 295.2f, 454.1f, 283.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(305.8f, 334.1f)
                curveTo(314.1f, 333.4f, 315.4f, 336.6f, 319.1f, 343.1f)
                curveTo(316.8f, 347.9f, 315.5f, 355.8f, 311.9f, 358.1f)
                curveTo(307.6f, 356.6f, 299.9f, 352.6f, 295.5f, 350.5f)
                curveTo(296.8f, 340.9f, 295.7f, 337.5f, 305.8f, 334.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(319.0f, 308.6f)
                curveTo(326.5f, 308.6f, 330.8f, 313.2f, 336.6f, 317.9f)
                lineTo(325.1f, 328.7f)
                curveTo(322.6f, 332.4f, 323.5f, 332.3f, 320.0f, 333.5f)
                curveTo(315.1f, 332.0f, 312.8f, 326.1f, 310.2f, 321.5f)
                curveTo(313.4f, 315.8f, 314.3f, 313.3f, 319.0f, 308.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(705.9f, 308.9f)
                curveTo(708.8f, 309.2f, 712.3f, 309.2f, 714.8f, 311.1f)
                curveTo(721.3f, 316.0f, 716.4f, 330.4f, 711.8f, 335.3f)
                curveTo(705.2f, 333.3f, 700.4f, 322.6f, 697.4f, 316.7f)
                curveTo(700.2f, 313.5f, 702.5f, 311.7f, 705.9f, 308.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(736.6f, 260.0f)
                curveTo(744.8f, 260.1f, 753.6f, 265.5f, 751.9f, 274.6f)
                curveTo(747.9f, 279.6f, 743.5f, 277.5f, 738.4f, 275.1f)
                lineTo(738.0f, 274.9f)
                curveTo(734.7f, 275.4f, 737.4f, 278.0f, 734.1f, 282.5f)
                curveTo(726.5f, 279.2f, 728.7f, 269.5f, 730.8f, 263.3f)
                curveTo(731.6f, 260.8f, 734.3f, 260.6f, 736.6f, 260.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(433.7f, 237.7f)
                lineTo(436.2f, 239.5f)
                curveTo(438.5f, 243.0f, 438.5f, 248.0f, 438.9f, 252.3f)
                curveTo(436.0f, 254.8f, 429.9f, 260.6f, 426.6f, 261.4f)
                lineTo(424.5f, 259.8f)
                curveTo(420.5f, 257.5f, 414.2f, 254.6f, 415.3f, 249.4f)
                curveTo(418.7f, 246.4f, 423.5f, 248.5f, 425.2f, 245.6f)
                curveTo(428.0f, 241.0f, 428.9f, 240.1f, 433.7f, 237.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(723.0f, 283.9f)
                curveTo(729.3f, 283.6f, 740.3f, 298.1f, 731.0f, 304.4f)
                curveTo(726.0f, 304.5f, 724.3f, 301.6f, 722.0f, 297.9f)
                lineTo(719.5f, 300.4f)
                curveTo(719.2f, 303.3f, 719.3f, 305.0f, 717.6f, 307.6f)
                lineTo(716.4f, 306.8f)
                curveTo(715.3f, 302.5f, 713.3f, 296.7f, 713.6f, 292.4f)
                curveTo(715.0f, 288.6f, 719.4f, 286.4f, 723.0f, 283.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(396.2f, 332.1f)
                lineTo(408.1f, 337.4f)
                curveTo(408.6f, 341.3f, 409.2f, 343.6f, 408.7f, 347.5f)
                curveTo(405.2f, 350.1f, 408.0f, 347.1f, 402.9f, 347.4f)
                lineTo(401.1f, 349.7f)
                curveTo(399.4f, 353.3f, 398.8f, 356.6f, 394.4f, 356.1f)
                curveTo(390.3f, 351.9f, 390.0f, 342.0f, 389.5f, 336.1f)
                curveTo(391.3f, 333.6f, 392.9f, 333.5f, 396.2f, 332.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(681.5f, 227.3f)
                curveTo(679.6f, 222.7f, 676.7f, 216.7f, 678.2f, 211.6f)
                curveTo(682.3f, 208.4f, 685.3f, 211.7f, 689.3f, 214.3f)
                curveTo(694.7f, 225.1f, 693.5f, 226.7f, 684.1f, 234.0f)
                curveTo(681.1f, 234.7f, 679.4f, 235.4f, 676.4f, 234.7f)
                curveTo(673.7f, 232.1f, 674.5f, 233.4f, 673.3f, 229.6f)
                curveTo(674.2f, 226.6f, 673.5f, 227.2f, 675.6f, 225.9f)
                curveTo(677.9f, 226.9f, 679.1f, 227.2f, 681.5f, 227.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(684.1f, 234.0f)
                curveTo(681.1f, 234.7f, 679.4f, 235.4f, 676.4f, 234.7f)
                curveTo(673.7f, 232.1f, 674.5f, 233.4f, 673.3f, 229.6f)
                curveTo(674.2f, 226.6f, 673.5f, 227.2f, 675.6f, 225.9f)
                curveTo(677.9f, 226.9f, 679.1f, 227.2f, 681.5f, 227.3f)
                curveTo(681.3f, 230.6f, 681.2f, 231.6f, 684.1f, 234.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(694.2f, 282.7f)
                curveTo(700.7f, 287.2f, 711.7f, 295.8f, 703.5f, 303.9f)
                curveTo(700.7f, 305.6f, 696.9f, 308.8f, 694.2f, 310.9f)
                curveTo(693.9f, 300.9f, 693.7f, 292.8f, 694.2f, 282.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(293.0f, 357.8f)
                curveTo(294.4f, 357.9f, 295.4f, 358.2f, 296.8f, 358.4f)
                curveTo(301.5f, 364.2f, 294.9f, 378.1f, 290.8f, 383.1f)
                curveTo(288.3f, 376.2f, 286.3f, 371.6f, 283.1f, 365.0f)
                curveTo(286.0f, 362.4f, 289.7f, 360.0f, 293.0f, 357.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(471.3f, 257.8f)
                lineTo(472.3f, 258.0f)
                curveTo(473.7f, 261.3f, 470.0f, 281.9f, 467.0f, 283.7f)
                lineTo(465.1f, 282.5f)
                curveTo(463.0f, 279.0f, 460.5f, 275.3f, 458.3f, 271.9f)
                curveTo(462.8f, 265.0f, 464.5f, 262.4f, 471.3f, 257.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(305.0f, 480.9f)
                curveTo(303.6f, 479.3f, 324.3f, 509.1f, 322.8f, 505.6f)
                curveTo(321.5f, 505.8f, 320.3f, 506.0f, 319.0f, 506.2f)
                curveTo(315.8f, 506.5f, 313.6f, 506.8f, 311.3f, 505.0f)
                curveTo(309.2f, 500.6f, 304.0f, 485.5f, 305.0f, 480.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(537.1f, 439.6f)
                curveTo(541.0f, 441.9f, 547.8f, 459.3f, 550.3f, 464.6f)
                curveTo(546.5f, 464.9f, 545.9f, 465.0f, 542.3f, 463.5f)
                curveTo(537.4f, 459.4f, 538.6f, 447.9f, 537.1f, 439.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(683.2f, 196.4f)
                curveTo(682.8f, 196.3f, 702.2f, 206.5f, 701.4f, 205.8f)
                lineTo(700.7f, 207.5f)
                curveTo(690.8f, 212.2f, 681.3f, 207.2f, 683.2f, 196.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(477.1f, 225.4f)
                lineTo(478.5f, 225.3f)
                lineTo(479.8f, 226.9f)
                curveTo(478.2f, 235.8f, 473.3f, 234.6f, 465.6f, 234.3f)
                curveTo(461.3f, 222.6f, 469.5f, 230.0f, 477.1f, 225.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(439.4f, 223.4f)
                curveTo(443.5f, 224.1f, 448.6f, 228.1f, 449.2f, 232.3f)
                curveTo(447.9f, 234.3f, 448.6f, 233.7f, 445.8f, 234.5f)
                curveTo(441.9f, 233.8f, 437.7f, 234.5f, 433.7f, 234.9f)
                curveTo(436.3f, 230.6f, 437.4f, 228.1f, 439.4f, 223.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(460.2f, 461.6f)
                curveTo(465.0f, 464.5f, 468.4f, 474.8f, 469.2f, 480.2f)
                curveTo(459.3f, 480.8f, 460.1f, 468.2f, 460.2f, 461.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(443.5f, 308.6f)
                curveTo(452.3f, 310.1f, 453.8f, 317.4f, 453.3f, 324.8f)
                curveTo(451.3f, 325.2f, 452.3f, 325.2f, 450.1f, 324.4f)
                curveTo(447.0f, 320.2f, 444.0f, 313.8f, 443.5f, 308.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfcfbfd)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(716.7f, 336.5f)
                lineTo(718.5f, 338.1f)
                curveTo(718.6f, 342.6f, 719.1f, 349.0f, 718.5f, 353.3f)
                lineTo(717.0f, 354.4f)
                curveTo(715.1f, 351.1f, 712.5f, 347.3f, 710.5f, 344.1f)
                curveTo(712.7f, 341.8f, 714.7f, 339.1f, 716.7f, 336.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(261.7f, 339.0f)
                lineTo(265.9f, 335.5f)
                curveTo(265.7f, 342.2f, 265.3f, 346.7f, 264.5f, 353.4f)
                lineTo(261.7f, 339.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.980392f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(684.8f, 261.7f)
                curveTo(689.8f, 263.7f, 692.4f, 269.3f, 692.6f, 274.5f)
                lineTo(691.3f, 274.7f)
                curveTo(689.3f, 273.3f, 686.0f, 264.5f, 684.8f, 261.7f)
                close()
            }
        }
        .build()
        return _standardTaeTakemi!!
    }

private var _standardTaeTakemi: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = StandardSenderAvatar.StandardTaeTakemi, contentDescription = "")
    }
}
