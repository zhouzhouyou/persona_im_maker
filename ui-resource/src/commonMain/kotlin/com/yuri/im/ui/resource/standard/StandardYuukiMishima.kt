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

public val StandardSenderAvatar.StandardYuukiMishima: ImageVector
    get() {
        if (_standardYuukiMishima != null) {
            return _standardYuukiMishima!!
        }
        _standardYuukiMishima = Builder(name = "StandardYuukiMishima", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 1024.0f, viewportHeight = 1024.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(568.3f, 79.3f)
                curveTo(573.3f, 81.2f, 584.3f, 86.3f, 588.6f, 86.6f)
                lineTo(589.5f, 85.8f)
                curveTo(589.0f, 82.4f, 587.6f, 76.0f, 589.1f, 73.4f)
                curveTo(594.5f, 74.6f, 599.3f, 92.8f, 603.9f, 96.7f)
                curveTo(621.2f, 111.5f, 642.5f, 118.0f, 657.0f, 136.8f)
                curveTo(662.2f, 143.6f, 666.3f, 152.5f, 672.7f, 157.4f)
                curveTo(676.8f, 159.2f, 691.0f, 155.6f, 695.4f, 156.6f)
                curveTo(717.1f, 161.3f, 751.7f, 166.2f, 771.2f, 174.4f)
                lineTo(771.1f, 175.6f)
                curveTo(760.0f, 180.8f, 744.3f, 187.6f, 734.0f, 193.5f)
                curveTo(756.0f, 204.7f, 762.7f, 225.2f, 769.8f, 247.0f)
                curveTo(774.4f, 260.8f, 783.9f, 282.8f, 784.1f, 297.1f)
                curveTo(784.6f, 322.9f, 787.6f, 316.8f, 800.0f, 337.4f)
                curveTo(808.1f, 351.0f, 814.4f, 370.0f, 822.7f, 384.3f)
                curveTo(811.6f, 377.2f, 793.1f, 370.9f, 780.1f, 368.6f)
                curveTo(782.5f, 373.9f, 784.5f, 386.7f, 786.4f, 389.2f)
                curveTo(799.9f, 408.4f, 814.8f, 424.9f, 827.2f, 445.1f)
                curveTo(812.5f, 439.7f, 806.5f, 438.9f, 791.1f, 436.6f)
                curveTo(794.9f, 457.7f, 797.2f, 455.0f, 804.4f, 471.3f)
                lineTo(792.2f, 475.0f)
                curveTo(785.5f, 482.5f, 782.2f, 485.8f, 773.3f, 490.4f)
                curveTo(772.2f, 505.0f, 773.1f, 520.7f, 771.9f, 534.4f)
                curveTo(766.8f, 528.9f, 762.3f, 518.8f, 757.0f, 518.2f)
                curveTo(749.1f, 520.6f, 744.1f, 544.8f, 738.7f, 552.8f)
                curveTo(725.8f, 571.7f, 701.2f, 589.1f, 689.1f, 607.4f)
                curveTo(689.0f, 619.4f, 688.5f, 631.5f, 687.8f, 643.5f)
                curveTo(681.6f, 636.3f, 676.8f, 630.4f, 668.9f, 625.1f)
                curveTo(669.6f, 634.2f, 666.9f, 679.8f, 662.9f, 684.7f)
                curveTo(655.9f, 683.4f, 658.4f, 669.1f, 652.9f, 664.2f)
                lineTo(650.7f, 664.3f)
                curveTo(648.2f, 669.1f, 644.5f, 684.9f, 642.4f, 691.5f)
                curveTo(647.7f, 705.4f, 642.8f, 750.3f, 644.8f, 768.9f)
                curveTo(665.5f, 788.2f, 688.9f, 805.9f, 710.6f, 824.1f)
                curveTo(750.3f, 857.2f, 792.2f, 891.2f, 839.6f, 912.9f)
                curveTo(865.1f, 924.6f, 868.6f, 918.0f, 891.6f, 940.9f)
                curveTo(909.7f, 959.1f, 921.3f, 969.5f, 929.6f, 995.7f)
                curveTo(931.9f, 1002.0f, 936.0f, 1008.7f, 936.5f, 1015.8f)
                curveTo(934.7f, 1018.4f, 932.5f, 1018.5f, 929.3f, 1018.6f)
                curveTo(908.4f, 1018.9f, 887.4f, 1018.6f, 866.5f, 1018.5f)
                lineTo(709.8f, 1018.6f)
                lineTo(93.1f, 1018.1f)
                curveTo(97.8f, 1005.4f, 101.9f, 989.9f, 109.5f, 978.7f)
                curveTo(117.2f, 967.2f, 177.6f, 911.3f, 190.5f, 905.4f)
                curveTo(198.6f, 901.7f, 207.5f, 899.5f, 215.9f, 896.8f)
                curveTo(226.0f, 893.6f, 235.8f, 889.9f, 245.8f, 886.7f)
                curveTo(254.4f, 884.0f, 263.3f, 881.8f, 271.7f, 878.6f)
                curveTo(312.0f, 863.1f, 350.3f, 839.6f, 386.1f, 815.8f)
                curveTo(392.0f, 811.9f, 405.1f, 804.9f, 407.7f, 798.5f)
                curveTo(410.5f, 791.6f, 409.3f, 770.1f, 406.1f, 763.5f)
                curveTo(401.6f, 754.2f, 387.5f, 749.3f, 380.6f, 741.2f)
                curveTo(360.7f, 718.0f, 319.9f, 668.1f, 306.4f, 642.2f)
                curveTo(296.1f, 622.3f, 286.8f, 592.6f, 280.7f, 570.6f)
                curveTo(274.3f, 574.3f, 272.4f, 575.1f, 265.4f, 577.4f)
                curveTo(264.0f, 581.5f, 260.2f, 594.3f, 257.8f, 596.8f)
                curveTo(250.7f, 590.4f, 256.2f, 557.4f, 251.7f, 551.5f)
                curveTo(243.9f, 552.8f, 243.5f, 566.1f, 238.4f, 572.3f)
                lineTo(236.9f, 572.5f)
                curveTo(232.1f, 564.9f, 240.9f, 475.6f, 243.4f, 460.2f)
                curveTo(243.7f, 458.2f, 243.8f, 455.6f, 241.9f, 454.7f)
                curveTo(234.7f, 461.5f, 228.3f, 475.2f, 222.4f, 479.6f)
                lineTo(221.3f, 479.6f)
                curveTo(221.3f, 477.0f, 221.3f, 477.2f, 222.0f, 475.6f)
                curveTo(225.7f, 467.7f, 224.5f, 406.1f, 222.5f, 401.0f)
                curveTo(210.8f, 397.7f, 197.0f, 413.7f, 189.1f, 420.8f)
                lineTo(189.3f, 420.2f)
                curveTo(194.2f, 405.5f, 204.2f, 391.6f, 211.0f, 378.0f)
                curveTo(213.9f, 372.3f, 236.2f, 342.6f, 236.6f, 339.7f)
                curveTo(231.7f, 337.4f, 208.9f, 354.6f, 204.2f, 358.3f)
                curveTo(210.4f, 332.2f, 206.6f, 321.6f, 230.1f, 301.8f)
                curveTo(239.7f, 293.7f, 256.0f, 267.5f, 262.4f, 255.8f)
                curveTo(253.1f, 261.8f, 239.1f, 265.3f, 228.3f, 270.2f)
                curveTo(217.0f, 275.4f, 213.4f, 281.3f, 205.0f, 286.9f)
                curveTo(212.5f, 269.7f, 241.9f, 240.2f, 252.5f, 222.5f)
                curveTo(256.0f, 216.8f, 276.4f, 215.8f, 279.4f, 211.4f)
                curveTo(274.9f, 205.5f, 252.2f, 202.6f, 249.6f, 199.2f)
                curveTo(253.2f, 195.2f, 296.4f, 185.2f, 304.0f, 178.6f)
                curveTo(325.0f, 160.4f, 339.1f, 136.9f, 362.5f, 121.0f)
                curveTo(371.5f, 114.9f, 389.7f, 116.7f, 392.6f, 111.7f)
                curveTo(390.0f, 107.3f, 388.2f, 107.3f, 383.2f, 105.6f)
                curveTo(382.0f, 98.1f, 373.9f, 97.9f, 368.1f, 94.4f)
                curveTo(370.9f, 91.7f, 375.8f, 94.1f, 383.8f, 88.5f)
                lineTo(384.5f, 88.0f)
                curveTo(407.0f, 84.7f, 430.0f, 79.8f, 452.1f, 87.2f)
                curveTo(459.5f, 89.7f, 477.0f, 96.3f, 483.8f, 95.8f)
                curveTo(512.2f, 93.8f, 531.0f, 87.2f, 560.2f, 92.7f)
                curveTo(562.5f, 87.4f, 561.5f, 85.8f, 559.5f, 80.6f)
                lineTo(560.5f, 79.3f)
                curveTo(563.1f, 79.2f, 565.7f, 79.3f, 568.3f, 79.3f)
                close()
                moveTo(323.8f, 353.3f)
                curveTo(326.3f, 351.2f, 329.0f, 349.5f, 329.7f, 346.6f)
                lineTo(328.0f, 345.5f)
                curveTo(325.6f, 347.7f, 322.9f, 349.5f, 322.2f, 352.4f)
                lineTo(323.8f, 353.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(548.9f, 370.5f)
                curveTo(548.9f, 374.8f, 545.6f, 398.1f, 545.8f, 398.7f)
                lineTo(547.8f, 399.0f)
                curveTo(568.3f, 387.7f, 578.4f, 361.9f, 592.7f, 344.2f)
                curveTo(593.8f, 353.4f, 596.7f, 362.5f, 598.2f, 371.8f)
                curveTo(601.9f, 393.3f, 601.6f, 416.2f, 597.8f, 437.7f)
                curveTo(596.5f, 444.5f, 591.1f, 455.5f, 593.5f, 461.6f)
                curveTo(597.0f, 459.0f, 608.2f, 444.3f, 612.9f, 439.6f)
                curveTo(610.6f, 463.7f, 599.4f, 490.4f, 591.8f, 513.5f)
                curveTo(590.1f, 518.7f, 578.2f, 530.0f, 579.8f, 535.1f)
                curveTo(589.1f, 532.7f, 585.4f, 537.5f, 589.7f, 540.7f)
                curveTo(593.6f, 538.7f, 610.2f, 516.0f, 614.6f, 510.7f)
                curveTo(610.7f, 537.1f, 614.1f, 539.4f, 602.4f, 565.2f)
                curveTo(609.5f, 559.2f, 612.2f, 556.3f, 618.1f, 550.2f)
                curveTo(624.2f, 543.9f, 638.5f, 520.4f, 642.4f, 518.6f)
                lineTo(643.8f, 520.0f)
                curveTo(645.1f, 531.1f, 638.3f, 540.6f, 637.7f, 551.1f)
                curveTo(639.7f, 551.6f, 644.2f, 548.6f, 648.2f, 547.4f)
                lineTo(649.4f, 548.4f)
                curveTo(649.6f, 559.5f, 633.9f, 561.3f, 636.3f, 570.0f)
                curveTo(638.6f, 570.9f, 642.2f, 569.6f, 643.7f, 567.9f)
                curveTo(651.8f, 558.8f, 664.8f, 560.3f, 672.8f, 556.5f)
                curveTo(686.9f, 549.8f, 702.3f, 527.4f, 704.0f, 511.9f)
                curveTo(704.7f, 506.3f, 701.8f, 495.5f, 703.9f, 490.4f)
                lineTo(705.7f, 490.4f)
                curveTo(710.3f, 495.3f, 711.7f, 503.7f, 716.5f, 509.6f)
                lineTo(718.0f, 509.5f)
                curveTo(719.8f, 505.6f, 719.3f, 502.1f, 719.9f, 498.7f)
                curveTo(723.0f, 480.5f, 707.0f, 468.0f, 704.7f, 457.8f)
                lineTo(705.6f, 456.7f)
                curveTo(711.3f, 458.0f, 718.5f, 464.2f, 721.0f, 468.8f)
                curveTo(736.8f, 500.0f, 723.7f, 518.7f, 702.5f, 541.5f)
                curveTo(685.7f, 559.6f, 680.3f, 569.4f, 658.6f, 583.1f)
                curveTo(649.4f, 583.0f, 641.4f, 583.0f, 632.2f, 583.7f)
                curveTo(617.6f, 606.2f, 614.5f, 639.8f, 593.4f, 659.6f)
                curveTo(588.2f, 664.5f, 583.2f, 669.4f, 577.3f, 673.6f)
                curveTo(542.7f, 698.0f, 504.7f, 720.0f, 467.0f, 739.2f)
                curveTo(452.9f, 746.4f, 422.2f, 749.3f, 407.2f, 742.6f)
                curveTo(394.4f, 737.0f, 380.6f, 706.3f, 370.9f, 695.3f)
                curveTo(348.2f, 664.7f, 319.4f, 637.6f, 307.8f, 600.4f)
                curveTo(301.3f, 580.3f, 299.0f, 555.9f, 294.5f, 535.7f)
                curveTo(288.0f, 506.1f, 281.2f, 483.4f, 292.2f, 453.9f)
                curveTo(293.2f, 451.4f, 293.8f, 451.2f, 296.0f, 450.4f)
                curveTo(299.8f, 455.1f, 292.8f, 483.4f, 296.7f, 491.0f)
                curveTo(298.9f, 495.2f, 301.3f, 503.1f, 307.1f, 503.0f)
                curveTo(310.3f, 498.1f, 306.5f, 488.9f, 305.0f, 483.5f)
                curveTo(308.6f, 478.3f, 313.2f, 472.7f, 317.2f, 467.6f)
                curveTo(316.2f, 474.1f, 315.2f, 483.3f, 316.8f, 489.6f)
                curveTo(318.8f, 497.0f, 321.8f, 495.7f, 326.9f, 498.6f)
                curveTo(327.2f, 501.9f, 323.9f, 507.3f, 322.2f, 510.6f)
                curveTo(333.9f, 516.7f, 352.9f, 522.8f, 359.0f, 505.7f)
                lineTo(359.3f, 504.9f)
                curveTo(363.3f, 501.9f, 370.2f, 508.8f, 373.6f, 500.1f)
                curveTo(372.7f, 494.8f, 368.5f, 487.5f, 366.1f, 482.1f)
                lineTo(366.9f, 480.6f)
                lineTo(369.3f, 480.5f)
                curveTo(377.1f, 485.3f, 390.2f, 528.8f, 393.2f, 539.8f)
                curveTo(393.5f, 515.3f, 385.2f, 484.2f, 375.1f, 461.6f)
                curveTo(370.9f, 452.2f, 365.9f, 449.7f, 361.1f, 436.3f)
                curveTo(364.5f, 431.6f, 382.8f, 407.4f, 386.8f, 404.3f)
                lineTo(388.4f, 405.0f)
                curveTo(389.7f, 408.6f, 388.2f, 415.4f, 388.0f, 420.1f)
                lineTo(389.1f, 420.7f)
                curveTo(403.2f, 410.7f, 413.9f, 390.1f, 430.2f, 379.5f)
                curveTo(427.8f, 386.9f, 424.3f, 413.2f, 424.2f, 421.0f)
                lineTo(425.1f, 421.4f)
                curveTo(429.1f, 416.5f, 431.1f, 413.3f, 434.5f, 408.0f)
                curveTo(435.4f, 409.3f, 437.3f, 411.7f, 438.1f, 413.0f)
                curveTo(437.1f, 418.4f, 430.0f, 428.0f, 426.7f, 434.3f)
                curveTo(434.1f, 430.5f, 440.8f, 425.2f, 447.9f, 420.9f)
                curveTo(476.8f, 403.8f, 545.5f, 412.9f, 577.4f, 421.0f)
                curveTo(563.4f, 409.1f, 549.1f, 405.4f, 531.5f, 401.0f)
                curveTo(537.2f, 387.4f, 540.2f, 382.6f, 548.9f, 370.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(506.5f, 434.4f)
                lineTo(510.0f, 433.9f)
                curveTo(521.6f, 439.2f, 540.8f, 433.2f, 553.7f, 437.0f)
                curveTo(558.6f, 438.5f, 571.1f, 443.1f, 573.7f, 447.4f)
                lineTo(572.7f, 448.8f)
                curveTo(566.8f, 450.2f, 561.4f, 448.9f, 555.3f, 448.1f)
                curveTo(565.6f, 451.8f, 578.5f, 459.0f, 587.6f, 465.1f)
                curveTo(589.1f, 475.3f, 592.3f, 482.6f, 593.0f, 494.5f)
                curveTo(594.1f, 512.1f, 567.1f, 526.6f, 561.3f, 519.4f)
                curveTo(563.3f, 516.0f, 567.9f, 516.1f, 571.6f, 512.3f)
                curveTo(575.7f, 508.0f, 578.0f, 504.0f, 581.2f, 499.1f)
                curveTo(581.4f, 494.1f, 580.8f, 487.1f, 580.6f, 481.9f)
                curveTo(571.1f, 498.8f, 571.8f, 507.5f, 552.7f, 515.5f)
                curveTo(538.6f, 518.6f, 534.8f, 511.9f, 524.2f, 503.6f)
                curveTo(529.5f, 500.6f, 533.7f, 496.2f, 538.0f, 492.0f)
                curveTo(533.2f, 492.3f, 528.1f, 492.8f, 523.4f, 491.9f)
                curveTo(518.4f, 487.6f, 523.2f, 479.5f, 520.8f, 472.8f)
                lineTo(519.0f, 472.8f)
                curveTo(512.6f, 478.3f, 512.5f, 480.2f, 507.3f, 486.6f)
                curveTo(506.8f, 492.5f, 507.1f, 502.5f, 500.8f, 505.0f)
                lineTo(498.7f, 504.1f)
                curveTo(496.9f, 501.8f, 495.6f, 499.0f, 495.2f, 496.2f)
                curveTo(490.6f, 469.6f, 490.5f, 475.8f, 503.6f, 455.5f)
                lineTo(501.6f, 455.0f)
                curveTo(497.9f, 456.4f, 497.7f, 457.7f, 494.8f, 461.2f)
                curveTo(491.0f, 461.3f, 494.7f, 460.1f, 489.6f, 456.2f)
                curveTo(481.8f, 455.6f, 471.0f, 464.1f, 464.5f, 468.7f)
                curveTo(477.5f, 439.3f, 469.7f, 437.9f, 506.5f, 434.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(429.0f, 654.3f)
                curveTo(433.6f, 656.2f, 475.6f, 661.3f, 483.8f, 662.6f)
                curveTo(482.1f, 665.6f, 481.8f, 666.3f, 479.2f, 668.8f)
                curveTo(472.4f, 671.5f, 456.2f, 666.9f, 445.8f, 666.4f)
                curveTo(436.3f, 667.0f, 391.4f, 677.4f, 395.5f, 657.5f)
                curveTo(400.8f, 655.1f, 412.9f, 661.2f, 429.0f, 654.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(386.3f, 573.7f)
                lineTo(387.4f, 575.5f)
                curveTo(387.6f, 585.3f, 386.6f, 588.7f, 383.8f, 597.8f)
                curveTo(391.2f, 601.2f, 416.6f, 616.2f, 420.7f, 621.9f)
                curveTo(418.5f, 624.4f, 416.2f, 624.6f, 412.6f, 625.8f)
                curveTo(401.9f, 626.2f, 400.5f, 625.8f, 391.1f, 619.2f)
                curveTo(385.2f, 615.0f, 377.2f, 608.4f, 376.0f, 601.1f)
                curveTo(377.9f, 595.2f, 383.1f, 577.3f, 386.3f, 573.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(401.1f, 685.0f)
                curveTo(412.0f, 684.0f, 419.5f, 687.3f, 428.8f, 691.9f)
                curveTo(434.7f, 691.4f, 453.7f, 687.0f, 457.6f, 691.2f)
                curveTo(456.3f, 694.6f, 456.3f, 693.8f, 452.9f, 696.3f)
                curveTo(444.4f, 701.8f, 434.0f, 704.0f, 424.1f, 704.9f)
                curveTo(416.1f, 701.0f, 404.9f, 693.2f, 401.1f, 685.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(307.5f, 206.8f)
                curveTo(333.5f, 180.4f, 379.0f, 167.8f, 413.0f, 154.3f)
                curveTo(424.3f, 149.8f, 433.9f, 141.9f, 445.1f, 137.9f)
                curveTo(449.0f, 136.5f, 458.8f, 134.8f, 463.5f, 133.9f)
                curveTo(454.9f, 142.6f, 445.1f, 154.1f, 436.5f, 163.3f)
                curveTo(445.5f, 162.0f, 450.4f, 160.4f, 458.5f, 156.6f)
                curveTo(450.2f, 171.8f, 442.4f, 174.3f, 432.9f, 194.1f)
                curveTo(453.7f, 185.6f, 497.7f, 181.0f, 521.7f, 172.7f)
                curveTo(515.1f, 187.3f, 508.4f, 195.8f, 499.6f, 209.1f)
                curveTo(495.9f, 214.6f, 493.2f, 221.1f, 489.1f, 226.5f)
                curveTo(487.1f, 229.1f, 485.7f, 229.5f, 483.5f, 232.0f)
                lineTo(483.9f, 233.5f)
                curveTo(490.2f, 235.0f, 495.8f, 227.4f, 500.8f, 224.7f)
                curveTo(508.8f, 220.2f, 552.1f, 188.0f, 557.0f, 187.3f)
                lineTo(557.5f, 188.6f)
                curveTo(555.4f, 197.3f, 548.2f, 209.5f, 544.1f, 217.6f)
                curveTo(542.8f, 220.3f, 543.4f, 221.5f, 541.5f, 224.5f)
                curveTo(537.4f, 218.0f, 533.5f, 214.9f, 525.1f, 217.2f)
                lineTo(524.3f, 218.9f)
                curveTo(525.9f, 223.2f, 531.6f, 224.2f, 534.9f, 229.1f)
                curveTo(533.9f, 231.9f, 522.4f, 242.9f, 519.1f, 246.3f)
                curveTo(514.1f, 241.2f, 509.0f, 236.1f, 503.9f, 231.1f)
                curveTo(496.3f, 240.5f, 492.5f, 239.8f, 484.4f, 246.9f)
                curveTo(486.2f, 260.4f, 485.5f, 260.4f, 476.1f, 270.1f)
                curveTo(458.6f, 262.4f, 459.5f, 257.1f, 468.4f, 242.0f)
                curveTo(460.7f, 242.2f, 450.1f, 240.9f, 442.2f, 240.2f)
                curveTo(458.0f, 252.8f, 463.4f, 259.6f, 441.4f, 270.0f)
                curveTo(433.1f, 262.4f, 432.3f, 261.4f, 429.7f, 250.5f)
                curveTo(415.7f, 275.9f, 413.2f, 262.9f, 406.2f, 269.8f)
                curveTo(405.7f, 274.1f, 409.5f, 276.6f, 409.8f, 279.9f)
                curveTo(410.3f, 286.5f, 407.1f, 292.1f, 400.1f, 292.6f)
                curveTo(392.1f, 293.2f, 389.8f, 290.0f, 384.6f, 285.3f)
                curveTo(385.6f, 281.3f, 389.8f, 270.6f, 387.8f, 267.6f)
                curveTo(385.2f, 267.7f, 382.0f, 268.4f, 379.8f, 267.2f)
                curveTo(375.4f, 264.7f, 372.2f, 261.6f, 367.0f, 261.9f)
                curveTo(364.0f, 263.4f, 362.3f, 267.6f, 360.7f, 270.7f)
                lineTo(358.7f, 271.4f)
                curveTo(349.1f, 272.7f, 349.3f, 278.3f, 347.6f, 286.3f)
                curveTo(344.6f, 289.4f, 341.4f, 292.4f, 338.3f, 295.3f)
                curveTo(334.3f, 292.5f, 323.9f, 285.1f, 319.3f, 287.4f)
                curveTo(319.8f, 295.0f, 333.2f, 298.8f, 335.2f, 306.4f)
                curveTo(334.0f, 312.0f, 328.0f, 316.5f, 323.7f, 320.0f)
                curveTo(318.6f, 316.7f, 311.3f, 314.5f, 308.9f, 309.0f)
                curveTo(316.7f, 293.4f, 306.3f, 294.2f, 304.2f, 289.8f)
                curveTo(304.6f, 285.8f, 308.0f, 281.3f, 310.2f, 277.8f)
                curveTo(295.2f, 280.4f, 281.8f, 285.9f, 266.3f, 289.0f)
                curveTo(273.6f, 281.8f, 283.0f, 274.3f, 291.3f, 268.2f)
                curveTo(298.4f, 262.4f, 315.3f, 255.1f, 320.3f, 247.5f)
                curveTo(327.3f, 236.8f, 339.2f, 213.0f, 342.5f, 201.1f)
                curveTo(327.5f, 200.5f, 321.8f, 202.2f, 307.5f, 206.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(525.5f, 374.7f)
                lineTo(526.3f, 375.4f)
                curveTo(527.1f, 377.5f, 524.3f, 396.3f, 523.9f, 400.9f)
                curveTo(508.6f, 399.2f, 493.2f, 399.8f, 478.2f, 402.7f)
                lineTo(486.9f, 396.2f)
                curveTo(491.3f, 392.5f, 497.7f, 386.3f, 502.6f, 384.4f)
                lineTo(504.1f, 385.5f)
                curveTo(504.6f, 390.5f, 501.9f, 395.7f, 500.1f, 400.8f)
                curveTo(508.3f, 392.8f, 517.0f, 383.1f, 525.5f, 374.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(441.2f, 292.8f)
                curveTo(448.5f, 293.2f, 454.7f, 301.3f, 459.5f, 306.7f)
                curveTo(458.9f, 310.0f, 450.3f, 316.4f, 447.5f, 318.2f)
                curveTo(439.7f, 322.1f, 418.4f, 310.4f, 441.2f, 292.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(350.9f, 292.0f)
                curveTo(360.0f, 294.3f, 361.1f, 297.6f, 364.9f, 305.4f)
                curveTo(362.3f, 314.4f, 363.2f, 315.9f, 354.0f, 319.5f)
                curveTo(348.3f, 317.9f, 345.4f, 315.9f, 340.4f, 312.9f)
                curveTo(340.8f, 309.1f, 341.0f, 304.4f, 341.2f, 300.5f)
                curveTo(344.4f, 297.2f, 347.4f, 294.9f, 350.9f, 292.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(358.7f, 271.4f)
                lineTo(360.7f, 270.7f)
                lineTo(361.4f, 270.7f)
                curveTo(371.5f, 271.0f, 369.2f, 268.3f, 380.2f, 274.2f)
                curveTo(379.7f, 278.6f, 379.2f, 282.8f, 378.4f, 287.2f)
                curveTo(362.0f, 303.7f, 355.3f, 288.2f, 358.7f, 271.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(563.8f, 242.7f)
                curveTo(574.8f, 243.5f, 584.1f, 261.9f, 566.1f, 269.0f)
                curveTo(561.5f, 268.1f, 556.6f, 266.0f, 554.6f, 261.6f)
                curveTo(550.0f, 251.7f, 557.1f, 246.7f, 563.8f, 242.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(499.7f, 243.9f)
                curveTo(511.0f, 243.9f, 511.4f, 246.4f, 517.3f, 255.1f)
                curveTo(515.1f, 259.3f, 512.6f, 265.4f, 508.1f, 267.0f)
                curveTo(504.8f, 268.2f, 503.5f, 269.0f, 500.0f, 268.4f)
                curveTo(495.9f, 266.3f, 493.3f, 260.5f, 490.6f, 256.2f)
                curveTo(493.3f, 251.7f, 495.6f, 247.3f, 499.7f, 243.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(529.9f, 244.9f)
                curveTo(549.5f, 245.5f, 551.8f, 263.8f, 536.5f, 268.5f)
                curveTo(525.7f, 270.5f, 514.8f, 256.0f, 529.9f, 244.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(428.5f, 268.0f)
                lineTo(429.8f, 267.7f)
                curveTo(442.7f, 271.8f, 442.1f, 288.1f, 429.1f, 294.8f)
                curveTo(424.4f, 289.3f, 414.8f, 287.2f, 415.4f, 278.8f)
                curveTo(417.9f, 272.9f, 423.0f, 270.8f, 428.5f, 268.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(454.3f, 270.1f)
                curveTo(470.3f, 268.5f, 476.2f, 282.2f, 462.2f, 293.3f)
                curveTo(460.5f, 293.7f, 458.2f, 293.8f, 456.5f, 293.9f)
                curveTo(446.0f, 289.5f, 441.6f, 275.8f, 454.3f, 270.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(575.1f, 217.5f)
                curveTo(581.5f, 218.2f, 593.6f, 228.5f, 591.9f, 236.0f)
                curveTo(590.2f, 238.7f, 584.5f, 241.3f, 581.5f, 242.9f)
                curveTo(580.8f, 244.5f, 581.3f, 243.8f, 579.5f, 244.7f)
                curveTo(564.1f, 235.6f, 565.5f, 231.0f, 575.1f, 217.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(488.3f, 267.9f)
                curveTo(492.1f, 267.5f, 499.7f, 273.6f, 499.9f, 278.3f)
                curveTo(500.3f, 285.9f, 497.2f, 289.3f, 492.7f, 294.8f)
                curveTo(488.8f, 294.3f, 487.7f, 293.2f, 484.6f, 290.9f)
                curveTo(472.9f, 282.3f, 478.8f, 274.1f, 488.3f, 267.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(592.9f, 243.8f)
                curveTo(602.2f, 243.9f, 608.2f, 250.8f, 607.6f, 259.7f)
                curveTo(607.4f, 262.0f, 603.2f, 265.3f, 601.6f, 266.8f)
                curveTo(596.9f, 267.6f, 585.8f, 254.3f, 586.5f, 247.8f)
                curveTo(588.8f, 244.4f, 588.4f, 245.4f, 592.9f, 243.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(380.5f, 292.4f)
                curveTo(391.3f, 295.9f, 403.9f, 306.2f, 390.4f, 315.8f)
                curveTo(387.0f, 318.3f, 385.1f, 319.6f, 380.8f, 318.4f)
                curveTo(377.4f, 314.3f, 380.0f, 298.9f, 380.5f, 292.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(423.4f, 318.8f)
                curveTo(432.9f, 320.2f, 433.7f, 320.8f, 441.1f, 326.7f)
                curveTo(437.3f, 330.0f, 433.1f, 334.0f, 429.4f, 337.4f)
                curveTo(426.1f, 340.6f, 424.1f, 343.7f, 419.5f, 342.5f)
                curveTo(416.2f, 337.4f, 420.9f, 324.0f, 423.4f, 318.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(606.4f, 217.4f)
                curveTo(614.7f, 218.5f, 618.5f, 229.3f, 618.0f, 236.8f)
                curveTo(617.7f, 239.8f, 614.0f, 241.5f, 611.7f, 243.1f)
                lineTo(610.7f, 244.4f)
                curveTo(607.8f, 244.3f, 605.8f, 242.4f, 602.9f, 240.7f)
                curveTo(602.6f, 232.9f, 600.4f, 222.6f, 606.4f, 217.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(359.7f, 404.6f)
                lineTo(360.8f, 405.0f)
                curveTo(363.4f, 408.1f, 364.4f, 426.8f, 359.8f, 431.6f)
                curveTo(355.9f, 431.8f, 356.2f, 431.0f, 352.2f, 428.1f)
                curveTo(349.4f, 426.3f, 344.9f, 424.1f, 341.9f, 422.5f)
                curveTo(347.8f, 416.9f, 353.9f, 410.4f, 359.7f, 404.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(307.1f, 319.2f)
                curveTo(308.2f, 319.3f, 309.3f, 319.4f, 310.3f, 319.6f)
                curveTo(313.5f, 320.1f, 315.3f, 320.5f, 317.2f, 323.2f)
                curveTo(316.8f, 328.6f, 308.1f, 333.5f, 302.7f, 338.5f)
                lineTo(300.9f, 340.8f)
                lineTo(299.1f, 340.8f)
                curveTo(296.7f, 338.6f, 294.9f, 333.4f, 293.4f, 330.2f)
                curveTo(298.3f, 323.5f, 299.2f, 321.6f, 307.1f, 319.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.1f, 318.5f)
                curveTo(341.7f, 319.8f, 345.5f, 323.0f, 349.9f, 326.5f)
                curveTo(345.9f, 330.0f, 341.2f, 336.1f, 337.8f, 340.3f)
                curveTo(335.6f, 342.1f, 334.2f, 343.7f, 331.3f, 343.7f)
                lineTo(329.8f, 342.0f)
                curveTo(328.9f, 335.2f, 333.6f, 324.9f, 336.1f, 318.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(338.1f, 430.1f)
                curveTo(343.3f, 432.3f, 348.9f, 435.4f, 353.9f, 438.0f)
                curveTo(338.3f, 436.8f, 329.9f, 438.0f, 314.4f, 439.5f)
                curveTo(311.6f, 440.0f, 308.8f, 440.4f, 306.0f, 440.8f)
                lineTo(304.8f, 439.4f)
                curveTo(305.2f, 425.9f, 322.6f, 434.6f, 330.5f, 433.6f)
                curveTo(332.0f, 433.4f, 336.6f, 431.0f, 338.1f, 430.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(621.2f, 242.7f)
                curveTo(629.8f, 246.1f, 628.3f, 265.2f, 621.7f, 269.5f)
                curveTo(610.2f, 256.5f, 608.6f, 256.8f, 621.2f, 242.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE4E4E5)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(607.5f, 267.4f)
                curveTo(614.8f, 267.7f, 622.4f, 276.2f, 622.7f, 283.9f)
                curveTo(621.1f, 287.7f, 621.4f, 286.7f, 617.5f, 289.5f)
                lineTo(616.6f, 290.3f)
                lineTo(615.0f, 289.4f)
                curveTo(612.6f, 282.4f, 608.0f, 278.6f, 605.2f, 272.1f)
                curveTo(604.7f, 270.9f, 606.5f, 268.9f, 607.5f, 267.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(514.1f, 269.9f)
                curveTo(518.1f, 269.8f, 523.8f, 269.5f, 527.0f, 271.7f)
                lineTo(527.2f, 273.4f)
                curveTo(525.1f, 276.9f, 519.4f, 279.8f, 515.7f, 282.0f)
                curveTo(511.9f, 284.5f, 511.5f, 285.8f, 507.8f, 285.8f)
                lineTo(506.8f, 283.9f)
                curveTo(507.5f, 277.5f, 509.8f, 274.5f, 514.1f, 269.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE4E4E5)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(558.5f, 223.7f)
                curveTo(560.7f, 225.8f, 560.0f, 233.3f, 559.9f, 236.4f)
                curveTo(554.6f, 241.9f, 553.2f, 243.6f, 545.9f, 245.7f)
                lineTo(544.2f, 242.4f)
                curveTo(543.9f, 237.7f, 554.2f, 228.8f, 558.5f, 223.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE4E4E5)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(545.4f, 268.9f)
                curveTo(557.1f, 271.5f, 564.1f, 275.1f, 561.3f, 288.5f)
                curveTo(556.3f, 286.6f, 546.1f, 274.1f, 545.4f, 268.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE4E4E5)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(598.9f, 191.7f)
                curveTo(602.4f, 194.2f, 609.3f, 207.0f, 607.6f, 212.4f)
                curveTo(606.2f, 212.7f, 602.5f, 213.7f, 601.4f, 213.4f)
                curveTo(594.7f, 212.0f, 598.2f, 196.0f, 598.9f, 191.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(301.5f, 297.6f)
                lineTo(303.1f, 299.0f)
                curveTo(304.5f, 302.8f, 304.0f, 309.5f, 303.9f, 313.7f)
                lineTo(293.1f, 319.1f)
                lineTo(291.6f, 318.7f)
                curveTo(291.3f, 315.7f, 299.7f, 301.1f, 301.5f, 297.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(287.1f, 344.7f)
                lineTo(291.6f, 345.1f)
                curveTo(295.8f, 349.1f, 286.6f, 356.8f, 283.3f, 360.4f)
                lineTo(280.4f, 361.7f)
                lineTo(279.0f, 361.0f)
                curveTo(277.9f, 355.6f, 283.3f, 348.1f, 287.1f, 344.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE4E4E5)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(286.2f, 326.8f)
                curveTo(291.6f, 335.1f, 288.5f, 339.5f, 281.1f, 344.2f)
                lineTo(279.7f, 342.8f)
                curveTo(278.8f, 339.2f, 284.2f, 330.5f, 286.2f, 326.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(469.2f, 292.5f)
                lineTo(473.0f, 293.4f)
                lineTo(473.5f, 294.9f)
                curveTo(472.3f, 298.8f, 467.8f, 302.6f, 464.8f, 305.6f)
                lineTo(462.4f, 305.8f)
                lineTo(461.4f, 305.0f)
                curveTo(461.2f, 300.3f, 466.1f, 295.5f, 469.2f, 292.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE4E4E5)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(410.6f, 292.5f)
                lineTo(412.4f, 293.9f)
                lineTo(412.6f, 295.9f)
                curveTo(410.4f, 300.2f, 405.5f, 304.4f, 401.9f, 307.9f)
                curveTo(400.3f, 307.1f, 401.0f, 307.7f, 400.1f, 305.6f)
                curveTo(400.7f, 300.1f, 406.5f, 296.0f, 410.6f, 292.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE4E4E5)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(434.5f, 408.0f)
                curveTo(437.7f, 402.5f, 443.2f, 392.3f, 447.2f, 387.8f)
                curveTo(445.0f, 393.9f, 439.6f, 407.4f, 438.1f, 413.0f)
                curveTo(437.3f, 411.7f, 435.4f, 409.3f, 434.5f, 408.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE4E4E5)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(272.1f, 368.5f)
                curveTo(273.7f, 368.8f, 273.9f, 369.1f, 275.3f, 370.1f)
                curveTo(274.5f, 373.6f, 272.0f, 375.5f, 269.3f, 378.5f)
                curveTo(267.2f, 378.0f, 267.3f, 378.1f, 265.8f, 376.6f)
                curveTo(266.8f, 373.0f, 269.2f, 371.5f, 272.1f, 368.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFB0AFA8)), stroke = null, fillAlpha = 0.988235f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(328.0f, 345.5f)
                lineTo(329.7f, 346.6f)
                curveTo(329.0f, 349.5f, 326.3f, 351.2f, 323.8f, 353.3f)
                lineTo(322.2f, 352.4f)
                curveTo(322.9f, 349.5f, 325.6f, 347.7f, 328.0f, 345.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.878431f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(560.2f, 92.7f)
                curveTo(559.4f, 84.3f, 545.0f, 76.1f, 541.7f, 63.7f)
                lineTo(542.8f, 63.2f)
                lineTo(542.0f, 63.1f)
                lineTo(542.0f, 64.4f)
                curveTo(546.0f, 63.6f, 551.3f, 70.2f, 555.7f, 72.5f)
                curveTo(560.0f, 74.8f, 563.9f, 77.1f, 568.3f, 79.3f)
                curveTo(565.7f, 79.3f, 563.1f, 79.2f, 560.5f, 79.3f)
                lineTo(559.5f, 80.6f)
                curveTo(561.5f, 85.8f, 562.5f, 87.4f, 560.2f, 92.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.913725f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(350.0f, 92.7f)
                curveTo(360.7f, 90.6f, 373.7f, 89.2f, 384.5f, 88.0f)
                lineTo(383.8f, 88.5f)
                curveTo(375.8f, 94.1f, 370.9f, 91.7f, 368.1f, 94.4f)
                curveTo(373.9f, 97.9f, 382.0f, 98.1f, 383.2f, 105.6f)
                curveTo(370.9f, 100.2f, 362.8f, 97.1f, 350.0f, 92.7f)
                close()
            }
        }
        .build()
        return _standardYuukiMishima!!
    }

private var _standardYuukiMishima: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = StandardSenderAvatar.StandardYuukiMishima, contentDescription = "")
    }
}
