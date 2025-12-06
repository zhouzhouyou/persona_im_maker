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

public val StandardSenderAvatar.StandardChihayaMifune: ImageVector
    get() {
        if (_standardChihayaMifune != null) {
            return _standardChihayaMifune!!
        }
        _standardChihayaMifune = Builder(name = "StandardChihayaMifune", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 1024.0f, viewportHeight = 1024.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.2f, 42.4f)
                curveTo(525.4f, 41.2f, 591.3f, 49.9f, 621.6f, 57.6f)
                curveTo(623.8f, 58.1f, 664.1f, 82.0f, 669.9f, 85.7f)
                curveTo(682.3f, 93.6f, 713.0f, 109.7f, 723.5f, 118.3f)
                curveTo(734.5f, 127.3f, 761.0f, 165.0f, 767.9f, 178.9f)
                curveTo(772.0f, 187.1f, 775.6f, 214.4f, 777.6f, 224.5f)
                curveTo(783.3f, 253.4f, 786.9f, 283.3f, 791.9f, 312.1f)
                lineTo(811.3f, 427.1f)
                curveTo(819.7f, 475.6f, 826.5f, 503.4f, 818.4f, 552.4f)
                curveTo(814.7f, 575.5f, 817.4f, 607.0f, 812.3f, 630.1f)
                curveTo(804.5f, 665.5f, 787.9f, 700.1f, 776.0f, 734.3f)
                curveTo(772.1f, 745.9f, 767.3f, 758.4f, 762.9f, 769.1f)
                curveTo(772.3f, 776.7f, 833.4f, 816.5f, 835.6f, 822.5f)
                curveTo(847.1f, 853.9f, 857.7f, 895.5f, 866.3f, 928.5f)
                curveTo(869.3f, 940.4f, 860.8f, 997.0f, 859.1f, 1012.1f)
                curveTo(728.7f, 1010.3f, 595.2f, 1011.7f, 464.5f, 1011.7f)
                lineTo(210.0f, 1011.7f)
                lineTo(132.5f, 1011.7f)
                curveTo(119.4f, 1011.7f, 101.1f, 1010.9f, 88.5f, 1012.0f)
                curveTo(95.7f, 988.3f, 97.1f, 962.8f, 104.1f, 938.8f)
                curveTo(109.6f, 920.2f, 159.8f, 816.8f, 171.8f, 804.8f)
                curveTo(185.6f, 790.8f, 205.7f, 784.4f, 220.7f, 771.7f)
                curveTo(216.8f, 764.2f, 213.4f, 753.1f, 209.8f, 744.9f)
                curveTo(202.6f, 725.5f, 190.8f, 702.4f, 186.5f, 682.2f)
                curveTo(178.7f, 645.6f, 170.0f, 603.1f, 165.9f, 566.1f)
                curveTo(172.3f, 552.4f, 182.8f, 536.9f, 189.9f, 523.4f)
                curveTo(192.4f, 518.5f, 196.5f, 505.4f, 198.6f, 499.7f)
                curveTo(202.2f, 489.3f, 206.3f, 479.0f, 210.7f, 469.0f)
                curveTo(224.6f, 437.0f, 240.4f, 404.7f, 254.2f, 372.8f)
                curveTo(264.8f, 348.1f, 267.2f, 313.3f, 274.2f, 287.0f)
                curveTo(279.2f, 268.3f, 284.6f, 249.6f, 289.8f, 231.0f)
                curveTo(292.4f, 221.0f, 295.9f, 199.5f, 300.7f, 191.7f)
                curveTo(309.3f, 177.8f, 325.0f, 162.2f, 336.1f, 149.2f)
                curveTo(349.3f, 135.3f, 362.0f, 116.8f, 376.2f, 104.3f)
                curveTo(386.0f, 95.8f, 407.6f, 86.5f, 419.2f, 79.5f)
                curveTo(440.0f, 66.9f, 461.9f, 55.0f, 483.8f, 44.5f)
                curveTo(486.7f, 43.1f, 492.9f, 42.7f, 496.2f, 42.4f)
                close()
                moveTo(306.3f, 687.6f)
                curveTo(305.7f, 682.5f, 301.9f, 670.7f, 297.6f, 667.7f)
                curveTo(297.4f, 675.7f, 299.4f, 683.1f, 306.3f, 687.6f)
                close()
                moveTo(314.4f, 701.3f)
                curveTo(314.1f, 708.9f, 317.4f, 710.7f, 323.8f, 714.6f)
                curveTo(324.6f, 708.0f, 320.7f, 702.9f, 314.4f, 701.3f)
                close()
                moveTo(649.1f, 89.9f)
                curveTo(652.3f, 92.2f, 653.7f, 93.4f, 657.6f, 94.3f)
                lineTo(658.7f, 93.6f)
                curveTo(657.2f, 90.7f, 653.9f, 89.2f, 651.0f, 87.5f)
                lineTo(649.1f, 89.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(504.4f, 299.4f)
                curveTo(521.9f, 297.0f, 598.7f, 304.0f, 616.0f, 308.7f)
                curveTo(618.2f, 315.8f, 620.5f, 328.9f, 622.1f, 336.5f)
                curveTo(625.0f, 350.6f, 628.5f, 364.7f, 632.4f, 378.5f)
                curveTo(641.6f, 410.3f, 658.4f, 427.6f, 659.9f, 463.8f)
                curveTo(662.0f, 513.3f, 656.3f, 561.2f, 623.0f, 600.0f)
                curveTo(594.0f, 633.7f, 522.5f, 678.1f, 478.5f, 681.4f)
                curveTo(463.2f, 669.1f, 449.6f, 658.7f, 434.2f, 645.8f)
                curveTo(367.9f, 593.4f, 365.5f, 570.6f, 345.5f, 489.8f)
                curveTo(342.6f, 478.3f, 338.0f, 456.0f, 334.1f, 444.9f)
                curveTo(340.4f, 428.9f, 349.1f, 412.7f, 355.9f, 395.8f)
                curveTo(372.7f, 391.5f, 391.7f, 387.6f, 409.0f, 390.0f)
                curveTo(415.8f, 390.9f, 430.7f, 396.1f, 436.3f, 393.0f)
                curveTo(433.7f, 386.8f, 423.2f, 385.3f, 417.5f, 383.6f)
                curveTo(396.9f, 377.6f, 377.5f, 382.6f, 357.4f, 389.0f)
                curveTo(363.4f, 378.1f, 372.1f, 349.3f, 378.4f, 342.9f)
                curveTo(397.9f, 322.9f, 478.6f, 301.7f, 504.4f, 299.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(362.4f, 410.3f)
                curveTo(368.3f, 410.9f, 369.2f, 415.1f, 374.1f, 414.9f)
                curveTo(388.1f, 414.3f, 406.6f, 407.0f, 418.6f, 417.4f)
                curveTo(421.3f, 419.7f, 420.2f, 426.7f, 421.3f, 427.9f)
                curveTo(429.4f, 436.4f, 438.6f, 444.0f, 445.9f, 453.4f)
                curveTo(439.1f, 450.5f, 432.0f, 445.9f, 425.7f, 442.0f)
                curveTo(430.8f, 447.5f, 445.1f, 464.9f, 437.8f, 471.6f)
                lineTo(435.1f, 470.7f)
                curveTo(431.8f, 468.0f, 430.8f, 463.4f, 429.4f, 459.1f)
                curveTo(419.4f, 476.8f, 417.7f, 481.0f, 398.5f, 487.0f)
                curveTo(393.7f, 487.1f, 386.7f, 482.9f, 383.5f, 479.5f)
                curveTo(374.0f, 469.7f, 374.4f, 459.9f, 374.1f, 447.4f)
                lineTo(372.6f, 447.1f)
                curveTo(367.4f, 449.5f, 365.6f, 456.5f, 363.6f, 461.8f)
                curveTo(366.6f, 466.7f, 370.1f, 474.7f, 372.6f, 480.1f)
                curveTo(368.1f, 477.8f, 363.4f, 475.1f, 358.9f, 472.6f)
                curveTo(353.2f, 462.9f, 356.0f, 460.2f, 353.5f, 450.4f)
                curveTo(352.9f, 447.9f, 346.2f, 447.4f, 347.2f, 439.2f)
                curveTo(350.7f, 436.7f, 351.4f, 440.8f, 356.3f, 438.8f)
                curveTo(359.9f, 429.9f, 350.4f, 431.1f, 352.0f, 422.7f)
                curveTo(355.6f, 420.1f, 359.2f, 425.7f, 365.4f, 424.6f)
                curveTo(365.9f, 421.3f, 363.2f, 416.9f, 362.5f, 411.3f)
                lineTo(362.4f, 410.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(627.5f, 423.9f)
                curveTo(632.1f, 429.9f, 616.0f, 434.0f, 630.5f, 448.1f)
                curveTo(635.6f, 442.9f, 638.7f, 440.1f, 644.4f, 435.6f)
                curveTo(643.1f, 438.3f, 641.2f, 442.9f, 639.7f, 445.3f)
                curveTo(636.1f, 450.7f, 634.8f, 448.7f, 635.2f, 455.6f)
                curveTo(639.7f, 460.3f, 643.9f, 451.2f, 650.2f, 451.4f)
                curveTo(653.2f, 458.4f, 646.2f, 457.5f, 646.1f, 463.4f)
                lineTo(649.7f, 465.3f)
                lineTo(650.2f, 467.5f)
                curveTo(646.6f, 476.2f, 643.2f, 470.9f, 636.8f, 476.0f)
                curveTo(634.9f, 481.3f, 630.8f, 488.3f, 624.8f, 489.6f)
                lineTo(623.7f, 488.4f)
                curveTo(623.9f, 484.6f, 627.6f, 480.2f, 629.9f, 476.9f)
                lineTo(629.8f, 475.6f)
                curveTo(629.6f, 471.0f, 630.1f, 468.0f, 626.8f, 465.0f)
                curveTo(621.0f, 467.3f, 618.0f, 480.4f, 614.1f, 485.7f)
                curveTo(611.5f, 489.2f, 608.8f, 491.4f, 605.6f, 494.3f)
                curveTo(600.7f, 494.3f, 593.3f, 494.6f, 588.8f, 493.3f)
                curveTo(582.0f, 491.2f, 578.1f, 489.7f, 571.5f, 486.8f)
                curveTo(569.3f, 476.9f, 568.7f, 464.8f, 568.1f, 454.6f)
                curveTo(551.2f, 460.3f, 553.5f, 463.6f, 543.8f, 477.9f)
                curveTo(546.1f, 461.3f, 548.8f, 456.0f, 559.3f, 443.6f)
                curveTo(551.9f, 447.9f, 546.2f, 451.1f, 538.5f, 454.7f)
                curveTo(541.6f, 449.6f, 549.8f, 439.6f, 554.6f, 436.3f)
                curveTo(577.9f, 420.4f, 592.6f, 429.7f, 614.1f, 432.6f)
                curveTo(618.5f, 429.5f, 623.0f, 426.7f, 627.5f, 423.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(422.6f, 401.8f)
                curveTo(432.1f, 405.2f, 439.3f, 406.4f, 449.2f, 407.8f)
                curveTo(450.1f, 408.6f, 451.1f, 409.4f, 452.0f, 410.2f)
                curveTo(473.8f, 429.5f, 472.0f, 451.1f, 473.8f, 479.4f)
                curveTo(473.2f, 479.4f, 473.0f, 479.5f, 472.3f, 479.4f)
                curveTo(464.3f, 477.9f, 445.0f, 431.4f, 439.0f, 421.6f)
                curveTo(434.6f, 414.6f, 428.1f, 408.0f, 422.6f, 401.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(545.1f, 380.4f)
                curveTo(571.2f, 379.3f, 597.7f, 379.8f, 620.5f, 393.5f)
                curveTo(614.9f, 393.3f, 606.9f, 392.0f, 601.2f, 391.3f)
                curveTo(583.6f, 389.1f, 565.8f, 388.3f, 548.0f, 389.0f)
                curveTo(543.9f, 389.2f, 531.7f, 391.6f, 530.2f, 391.0f)
                curveTo(531.7f, 381.6f, 537.4f, 380.7f, 545.1f, 380.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(473.5f, 606.4f)
                curveTo(478.9f, 606.3f, 520.6f, 609.3f, 522.0f, 610.1f)
                lineTo(521.9f, 613.0f)
                curveTo(519.9f, 615.4f, 518.8f, 615.0f, 515.2f, 615.9f)
                curveTo(506.6f, 617.1f, 471.3f, 617.9f, 465.4f, 612.4f)
                lineTo(465.3f, 610.4f)
                curveTo(468.6f, 606.8f, 468.1f, 607.8f, 473.5f, 606.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(472.4f, 550.7f)
                curveTo(474.4f, 554.4f, 473.1f, 565.9f, 472.9f, 571.1f)
                curveTo(478.3f, 574.6f, 491.8f, 583.1f, 486.6f, 590.2f)
                lineTo(482.6f, 590.8f)
                curveTo(457.3f, 577.1f, 462.6f, 576.0f, 472.4f, 550.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(475.9f, 629.6f)
                curveTo(480.5f, 630.4f, 485.3f, 634.0f, 489.5f, 634.7f)
                curveTo(495.1f, 635.6f, 498.0f, 629.7f, 504.3f, 632.9f)
                curveTo(506.3f, 636.1f, 506.1f, 637.1f, 506.3f, 640.8f)
                curveTo(494.2f, 645.9f, 476.8f, 647.1f, 475.9f, 629.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(575.8f, 413.1f)
                curveTo(577.2f, 413.0f, 578.7f, 412.9f, 580.2f, 412.9f)
                curveTo(586.5f, 412.9f, 602.5f, 415.0f, 606.9f, 419.3f)
                lineTo(606.3f, 420.7f)
                lineTo(603.2f, 421.2f)
                curveTo(597.0f, 421.0f, 572.0f, 423.2f, 569.7f, 418.1f)
                curveTo(570.9f, 415.3f, 573.1f, 414.5f, 575.8f, 413.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(635.0f, 317.8f)
                curveTo(645.6f, 317.8f, 686.6f, 325.2f, 692.1f, 334.1f)
                curveTo(706.0f, 356.8f, 707.1f, 397.6f, 709.6f, 424.2f)
                curveTo(710.2f, 431.8f, 707.3f, 439.0f, 707.2f, 445.6f)
                lineTo(708.5f, 446.3f)
                curveTo(720.2f, 438.3f, 714.9f, 389.0f, 715.0f, 374.4f)
                curveTo(723.9f, 388.9f, 737.4f, 427.9f, 739.4f, 443.9f)
                curveTo(742.3f, 467.3f, 731.6f, 529.4f, 716.9f, 548.3f)
                curveTo(696.5f, 574.4f, 680.9f, 584.1f, 665.5f, 617.0f)
                curveTo(656.0f, 636.8f, 645.7f, 646.3f, 629.5f, 660.5f)
                curveTo(631.1f, 636.6f, 641.6f, 593.4f, 657.9f, 575.5f)
                curveTo(682.0f, 548.9f, 687.2f, 540.3f, 698.4f, 506.5f)
                curveTo(685.9f, 522.8f, 688.0f, 530.5f, 670.5f, 550.3f)
                curveTo(670.7f, 547.7f, 671.0f, 544.9f, 671.5f, 542.4f)
                curveTo(677.8f, 509.7f, 676.1f, 475.1f, 666.1f, 443.3f)
                curveTo(662.5f, 432.0f, 656.4f, 419.6f, 652.0f, 408.1f)
                curveTo(640.9f, 379.3f, 635.1f, 348.7f, 635.0f, 317.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(290.9f, 371.9f)
                curveTo(299.4f, 384.4f, 260.7f, 481.4f, 255.3f, 500.4f)
                curveTo(250.9f, 515.6f, 246.3f, 540.5f, 244.3f, 556.2f)
                curveTo(243.5f, 562.1f, 250.4f, 586.7f, 252.1f, 594.5f)
                curveTo(237.0f, 632.8f, 228.1f, 657.3f, 226.9f, 699.2f)
                curveTo(213.8f, 680.4f, 204.1f, 659.5f, 198.3f, 637.3f)
                curveTo(188.7f, 602.3f, 179.0f, 574.8f, 196.7f, 539.9f)
                curveTo(221.1f, 492.0f, 238.1f, 440.5f, 261.7f, 392.2f)
                curveTo(263.4f, 388.9f, 267.5f, 384.5f, 270.2f, 381.7f)
                curveTo(264.8f, 404.7f, 264.1f, 412.1f, 255.4f, 435.0f)
                curveTo(262.9f, 427.9f, 269.4f, 417.4f, 275.6f, 409.1f)
                curveTo(283.8f, 397.8f, 286.2f, 384.8f, 290.9f, 371.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.1f, 533.5f)
                curveTo(262.8f, 496.4f, 268.1f, 465.5f, 283.3f, 429.6f)
                curveTo(286.9f, 421.0f, 295.6f, 412.2f, 298.9f, 404.6f)
                curveTo(320.0f, 355.5f, 316.8f, 342.3f, 359.8f, 309.9f)
                curveTo(356.9f, 327.3f, 353.5f, 344.9f, 347.6f, 361.7f)
                curveTo(330.8f, 410.3f, 300.4f, 463.3f, 297.2f, 515.2f)
                curveTo(294.0f, 567.1f, 361.2f, 598.4f, 335.7f, 648.2f)
                curveTo(329.8f, 659.6f, 325.9f, 667.4f, 316.4f, 676.5f)
                curveTo(325.2f, 614.5f, 290.4f, 572.3f, 281.4f, 514.6f)
                curveTo(279.6f, 503.1f, 288.9f, 449.3f, 293.3f, 437.0f)
                lineTo(291.3f, 433.2f)
                curveTo(281.4f, 470.8f, 274.9f, 498.8f, 256.1f, 533.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfefdfe)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(291.3f, 433.2f)
                curveTo(292.5f, 427.6f, 293.4f, 421.6f, 296.0f, 416.5f)
                curveTo(297.4f, 419.1f, 294.1f, 433.5f, 293.3f, 437.0f)
                lineTo(291.3f, 433.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(764.6f, 353.4f)
                curveTo(772.7f, 357.2f, 776.1f, 380.6f, 777.8f, 388.9f)
                curveTo(781.2f, 406.3f, 784.4f, 423.8f, 787.4f, 441.3f)
                curveTo(789.8f, 455.3f, 792.0f, 471.7f, 797.0f, 484.9f)
                lineTo(784.5f, 486.5f)
                curveTo(787.8f, 489.6f, 791.2f, 492.8f, 794.5f, 496.0f)
                curveTo(790.7f, 503.0f, 783.6f, 512.3f, 778.8f, 519.3f)
                curveTo(784.7f, 516.3f, 792.4f, 511.5f, 798.5f, 508.1f)
                curveTo(798.9f, 511.5f, 799.3f, 515.0f, 799.6f, 518.5f)
                curveTo(800.1f, 523.6f, 801.1f, 532.8f, 797.8f, 536.7f)
                curveTo(789.8f, 537.7f, 785.7f, 525.2f, 779.7f, 526.6f)
                curveTo(774.8f, 537.3f, 786.7f, 537.5f, 788.7f, 540.1f)
                curveTo(801.6f, 556.2f, 782.5f, 560.4f, 769.9f, 561.1f)
                curveTo(772.8f, 565.8f, 775.6f, 571.1f, 778.3f, 575.9f)
                curveTo(771.6f, 583.2f, 769.2f, 587.1f, 759.2f, 587.4f)
                curveTo(757.3f, 589.5f, 762.1f, 592.5f, 761.4f, 598.8f)
                curveTo(760.5f, 606.0f, 755.4f, 609.0f, 749.9f, 613.6f)
                curveTo(744.1f, 609.5f, 741.6f, 607.6f, 734.7f, 606.1f)
                lineTo(733.9f, 606.8f)
                curveTo(735.9f, 614.9f, 746.9f, 616.2f, 748.7f, 624.8f)
                curveTo(747.0f, 631.0f, 741.9f, 634.5f, 737.0f, 638.2f)
                curveTo(730.6f, 634.9f, 725.3f, 632.6f, 718.6f, 629.9f)
                curveTo(721.9f, 634.7f, 726.3f, 639.6f, 730.1f, 644.1f)
                curveTo(731.9f, 653.3f, 730.8f, 655.3f, 724.1f, 661.8f)
                curveTo(719.2f, 661.7f, 711.6f, 660.8f, 706.5f, 660.3f)
                lineTo(716.3f, 671.4f)
                curveTo(712.0f, 679.7f, 705.3f, 686.1f, 700.2f, 693.9f)
                curveTo(694.6f, 702.7f, 689.8f, 711.7f, 684.2f, 720.6f)
                curveTo(693.4f, 684.8f, 697.2f, 668.9f, 711.8f, 633.1f)
                curveTo(733.5f, 580.0f, 766.4f, 535.6f, 771.3f, 477.5f)
                curveTo(774.0f, 445.9f, 772.6f, 422.4f, 768.7f, 390.8f)
                curveTo(767.6f, 382.3f, 764.5f, 362.1f, 764.6f, 354.4f)
                lineTo(764.6f, 353.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(721.6f, 337.7f)
                curveTo(730.3f, 341.3f, 748.9f, 348.1f, 755.4f, 352.6f)
                curveTo(764.3f, 410.5f, 772.7f, 472.0f, 738.8f, 523.7f)
                curveTo(737.9f, 525.4f, 732.7f, 531.9f, 731.2f, 533.8f)
                curveTo(731.4f, 533.3f, 731.5f, 532.9f, 731.7f, 532.5f)
                curveTo(754.5f, 465.6f, 753.2f, 401.7f, 721.6f, 337.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(560.8f, 101.8f)
                curveTo(559.0f, 99.9f, 557.2f, 97.9f, 555.5f, 95.9f)
                curveTo(553.3f, 93.4f, 552.1f, 91.3f, 552.4f, 87.9f)
                curveTo(559.4f, 78.2f, 582.8f, 91.1f, 586.6f, 80.5f)
                lineTo(585.7f, 79.1f)
                curveTo(580.7f, 76.6f, 572.1f, 79.1f, 569.4f, 75.5f)
                curveTo(570.0f, 74.6f, 570.6f, 73.0f, 571.8f, 73.0f)
                curveTo(597.6f, 72.6f, 627.5f, 76.6f, 651.0f, 87.5f)
                lineTo(649.1f, 89.9f)
                curveTo(645.9f, 89.7f, 643.0f, 89.6f, 640.0f, 91.3f)
                curveTo(631.1f, 96.6f, 620.4f, 81.8f, 610.7f, 86.0f)
                lineTo(610.7f, 87.2f)
                curveTo(618.4f, 91.8f, 623.0f, 94.5f, 630.3f, 99.7f)
                lineTo(620.7f, 113.6f)
                curveTo(617.3f, 112.1f, 606.8f, 106.4f, 603.8f, 108.2f)
                curveTo(605.2f, 114.2f, 614.5f, 120.1f, 613.2f, 126.2f)
                curveTo(610.0f, 127.4f, 605.9f, 125.8f, 602.9f, 124.6f)
                curveTo(585.6f, 117.9f, 567.7f, 113.4f, 549.7f, 108.9f)
                curveTo(545.9f, 107.9f, 541.0f, 107.4f, 537.7f, 105.5f)
                lineTo(537.5f, 103.7f)
                curveTo(539.7f, 100.6f, 543.6f, 98.7f, 547.0f, 96.7f)
                curveTo(551.8f, 97.7f, 556.3f, 99.9f, 560.8f, 101.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(280.3f, 538.6f)
                curveTo(284.9f, 552.7f, 279.3f, 602.0f, 280.6f, 620.1f)
                curveTo(279.2f, 638.4f, 279.2f, 654.7f, 280.1f, 673.1f)
                curveTo(281.4f, 699.8f, 302.7f, 724.0f, 308.1f, 746.6f)
                lineTo(299.9f, 738.2f)
                curveTo(285.1f, 721.5f, 276.6f, 710.1f, 268.1f, 689.2f)
                curveTo(250.6f, 646.5f, 262.3f, 580.0f, 280.3f, 538.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(483.3f, 71.4f)
                curveTo(489.2f, 71.2f, 502.3f, 73.8f, 504.2f, 80.1f)
                curveTo(501.0f, 87.6f, 463.1f, 94.6f, 454.5f, 95.9f)
                curveTo(450.3f, 94.5f, 450.7f, 94.5f, 447.0f, 96.5f)
                lineTo(446.8f, 97.7f)
                curveTo(449.8f, 98.6f, 451.0f, 98.8f, 453.8f, 100.5f)
                lineTo(453.9f, 102.4f)
                curveTo(450.8f, 107.3f, 419.1f, 123.5f, 410.7f, 128.6f)
                curveTo(413.9f, 123.0f, 415.3f, 120.5f, 417.4f, 114.3f)
                lineTo(416.5f, 113.2f)
                lineTo(414.7f, 114.9f)
                curveTo(409.3f, 118.8f, 386.2f, 131.9f, 380.3f, 132.4f)
                lineTo(379.9f, 131.0f)
                curveTo(380.3f, 130.3f, 381.6f, 128.0f, 382.2f, 127.5f)
                curveTo(410.0f, 102.6f, 445.4f, 75.2f, 483.3f, 71.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(680.6f, 653.7f)
                lineTo(681.9f, 655.5f)
                curveTo(678.6f, 663.1f, 675.6f, 670.9f, 673.1f, 678.8f)
                curveTo(664.1f, 706.5f, 656.3f, 747.5f, 675.1f, 772.5f)
                curveTo(682.6f, 782.6f, 692.4f, 790.8f, 698.1f, 801.9f)
                curveTo(692.5f, 798.7f, 689.6f, 796.6f, 684.5f, 792.8f)
                curveTo(681.3f, 790.6f, 677.3f, 787.3f, 674.3f, 784.8f)
                curveTo(670.8f, 785.7f, 672.6f, 786.2f, 669.8f, 790.6f)
                curveTo(664.5f, 789.6f, 651.1f, 768.9f, 647.9f, 763.7f)
                curveTo(647.9f, 738.7f, 660.0f, 691.6f, 670.4f, 667.5f)
                curveTo(672.5f, 662.5f, 676.8f, 657.7f, 680.6f, 653.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(777.9f, 584.8f)
                curveTo(785.2f, 587.4f, 788.8f, 591.9f, 794.0f, 597.5f)
                curveTo(790.2f, 605.3f, 789.2f, 607.5f, 782.1f, 612.2f)
                curveTo(776.8f, 615.2f, 756.6f, 602.2f, 777.9f, 584.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(355.5f, 736.7f)
                curveTo(359.0f, 739.1f, 364.1f, 741.6f, 366.3f, 745.2f)
                curveTo(371.9f, 754.4f, 365.6f, 760.7f, 357.7f, 764.8f)
                curveTo(349.9f, 764.6f, 343.6f, 758.3f, 345.2f, 750.4f)
                curveTo(346.9f, 742.2f, 349.0f, 741.3f, 355.5f, 736.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(761.2f, 611.9f)
                curveTo(769.2f, 611.6f, 772.0f, 615.8f, 778.4f, 621.3f)
                curveTo(773.7f, 628.4f, 775.1f, 632.1f, 767.7f, 636.8f)
                curveTo(750.3f, 633.0f, 743.6f, 622.9f, 761.2f, 611.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(794.1f, 561.0f)
                curveTo(806.0f, 562.9f, 801.9f, 578.5f, 797.6f, 585.4f)
                curveTo(797.1f, 586.3f, 795.7f, 585.8f, 794.7f, 585.7f)
                curveTo(791.1f, 584.3f, 787.0f, 582.0f, 783.5f, 580.1f)
                curveTo(783.4f, 567.8f, 781.5f, 564.9f, 794.1f, 561.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(750.2f, 635.6f)
                curveTo(763.2f, 642.9f, 768.6f, 650.9f, 753.5f, 660.4f)
                curveTo(750.4f, 661.1f, 748.8f, 661.0f, 745.6f, 661.0f)
                curveTo(739.0f, 656.5f, 747.3f, 641.5f, 750.2f, 635.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(510.9f, 65.3f)
                curveTo(516.8f, 65.0f, 522.7f, 65.2f, 528.6f, 65.8f)
                curveTo(533.4f, 66.2f, 542.8f, 67.0f, 545.8f, 70.6f)
                lineTo(545.6f, 72.4f)
                lineTo(540.9f, 74.9f)
                lineTo(531.6f, 81.3f)
                curveTo(524.4f, 76.0f, 515.3f, 73.2f, 510.9f, 65.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(748.4f, 687.7f)
                curveTo(752.9f, 688.2f, 752.6f, 687.5f, 755.6f, 689.8f)
                curveTo(757.7f, 695.7f, 750.2f, 707.7f, 746.1f, 711.7f)
                curveTo(740.7f, 707.7f, 736.1f, 705.3f, 736.6f, 698.0f)
                curveTo(739.0f, 692.3f, 743.1f, 690.5f, 748.4f, 687.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(669.0f, 511.4f)
                curveTo(670.0f, 512.3f, 671.2f, 513.4f, 670.9f, 514.9f)
                curveTo(668.1f, 531.9f, 669.2f, 550.7f, 657.7f, 564.3f)
                lineTo(656.5f, 562.9f)
                curveTo(656.3f, 552.2f, 664.4f, 521.5f, 669.0f, 511.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(331.2f, 717.3f)
                curveTo(337.3f, 719.1f, 347.1f, 723.5f, 351.7f, 728.2f)
                curveTo(352.4f, 731.4f, 352.1f, 730.6f, 350.0f, 734.2f)
                curveTo(347.4f, 735.7f, 343.3f, 737.7f, 340.5f, 739.2f)
                curveTo(328.5f, 731.8f, 330.2f, 730.7f, 331.2f, 717.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(524.5f, 111.0f)
                curveTo(526.4f, 110.9f, 528.2f, 110.9f, 530.1f, 110.9f)
                curveTo(536.3f, 110.9f, 559.8f, 115.0f, 563.8f, 119.0f)
                curveTo(562.0f, 120.6f, 561.2f, 120.1f, 558.2f, 120.1f)
                curveTo(542.2f, 119.5f, 527.6f, 116.3f, 511.7f, 115.5f)
                lineTo(524.5f, 111.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(766.8f, 665.0f)
                lineTo(769.1f, 664.9f)
                lineTo(770.5f, 666.1f)
                curveTo(770.5f, 670.0f, 761.7f, 684.2f, 758.2f, 686.0f)
                curveTo(751.7f, 681.5f, 752.1f, 676.7f, 753.9f, 669.3f)
                curveTo(756.9f, 666.4f, 759.7f, 668.2f, 766.8f, 665.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(739.9f, 666.3f)
                curveTo(753.5f, 668.2f, 749.2f, 679.4f, 740.7f, 685.1f)
                curveTo(738.4f, 686.7f, 739.4f, 686.5f, 737.0f, 686.3f)
                curveTo(735.0f, 681.9f, 738.5f, 671.2f, 739.9f, 666.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(321.3f, 737.8f)
                curveTo(328.4f, 737.2f, 330.5f, 739.4f, 336.1f, 743.5f)
                curveTo(337.9f, 748.7f, 338.6f, 751.2f, 339.6f, 756.6f)
                curveTo(332.2f, 755.2f, 324.1f, 744.4f, 321.3f, 737.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(309.3f, 712.4f)
                curveTo(322.9f, 713.6f, 322.9f, 721.2f, 320.3f, 732.3f)
                lineTo(319.2f, 733.0f)
                lineTo(317.5f, 732.5f)
                curveTo(314.4f, 727.5f, 309.8f, 718.2f, 309.3f, 712.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(736.8f, 711.4f)
                curveTo(737.2f, 711.6f, 737.6f, 711.8f, 737.9f, 711.9f)
                curveTo(746.3f, 719.0f, 746.7f, 720.5f, 741.0f, 727.3f)
                lineTo(739.0f, 729.7f)
                lineTo(737.5f, 729.3f)
                curveTo(735.6f, 724.3f, 736.0f, 716.5f, 736.8f, 711.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(786.5f, 612.4f)
                curveTo(789.5f, 612.9f, 789.5f, 612.4f, 791.7f, 614.2f)
                curveTo(791.6f, 617.3f, 789.1f, 627.3f, 788.4f, 632.2f)
                curveTo(787.0f, 632.9f, 787.7f, 632.6f, 785.8f, 632.3f)
                curveTo(782.8f, 627.3f, 784.4f, 617.5f, 786.5f, 612.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, fillAlpha = 0.980392f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(297.6f, 667.7f)
                curveTo(301.9f, 670.7f, 305.7f, 682.5f, 306.3f, 687.6f)
                curveTo(299.4f, 683.1f, 297.4f, 675.7f, 297.6f, 667.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, fillAlpha = 0.988235f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(314.4f, 701.3f)
                curveTo(320.7f, 702.9f, 324.6f, 708.0f, 323.8f, 714.6f)
                curveTo(317.4f, 710.7f, 314.1f, 708.9f, 314.4f, 701.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(301.2f, 690.5f)
                curveTo(309.2f, 691.8f, 308.9f, 696.8f, 308.9f, 703.8f)
                curveTo(304.3f, 701.6f, 300.9f, 695.6f, 301.2f, 690.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfefdfe)), stroke = null, fillAlpha = 0.988235f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(651.0f, 87.5f)
                curveTo(653.9f, 89.2f, 657.2f, 90.7f, 658.7f, 93.6f)
                lineTo(657.6f, 94.3f)
                curveTo(653.7f, 93.4f, 652.3f, 92.2f, 649.1f, 89.9f)
                lineTo(651.0f, 87.5f)
                close()
            }
        }
        .build()
        return _standardChihayaMifune!!
    }

private var _standardChihayaMifune: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = StandardSenderAvatar.StandardChihayaMifune, contentDescription = "")
    }
}
