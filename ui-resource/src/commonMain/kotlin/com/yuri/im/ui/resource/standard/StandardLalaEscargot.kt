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

public val StandardSenderAvatar.StandardLalaEscargot: ImageVector
    get() {
        if (_standardLalaEscargot != null) {
            return _standardLalaEscargot!!
        }
        _standardLalaEscargot = Builder(name = "StandardLalaEscargot", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 1024.0f, viewportHeight = 1024.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.1f, 575.7f)
                curveTo(209.1f, 572.5f, 200.4f, 568.8f, 193.9f, 556.2f)
                curveTo(185.8f, 540.7f, 176.8f, 522.4f, 169.4f, 506.8f)
                curveTo(161.4f, 489.7f, 168.4f, 463.0f, 168.4f, 445.0f)
                curveTo(168.8f, 434.3f, 169.3f, 411.0f, 171.9f, 402.2f)
                curveTo(175.3f, 390.2f, 186.4f, 369.2f, 192.3f, 357.2f)
                curveTo(199.7f, 342.2f, 202.7f, 327.2f, 210.9f, 313.8f)
                curveTo(217.5f, 304.3f, 226.1f, 295.8f, 234.0f, 287.3f)
                curveTo(245.5f, 274.9f, 256.5f, 260.7f, 268.8f, 249.3f)
                curveTo(290.0f, 229.7f, 313.5f, 210.0f, 336.2f, 192.2f)
                curveTo(350.3f, 181.1f, 369.0f, 172.6f, 384.0f, 162.4f)
                curveTo(393.5f, 156.4f, 403.2f, 155.6f, 411.7f, 150.0f)
                curveTo(416.7f, 146.8f, 423.6f, 131.8f, 429.5f, 129.4f)
                curveTo(439.5f, 125.3f, 452.9f, 121.6f, 463.4f, 118.4f)
                curveTo(485.5f, 111.7f, 508.2f, 103.4f, 530.4f, 97.3f)
                curveTo(553.7f, 103.6f, 581.8f, 115.7f, 604.6f, 124.1f)
                curveTo(619.6f, 129.9f, 637.8f, 131.4f, 652.5f, 137.3f)
                curveTo(684.6f, 150.4f, 706.5f, 171.3f, 730.2f, 195.2f)
                curveTo(752.0f, 217.1f, 765.2f, 235.5f, 777.8f, 264.3f)
                curveTo(781.9f, 273.7f, 783.2f, 285.2f, 786.3f, 295.2f)
                curveTo(801.0f, 333.0f, 798.5f, 365.2f, 800.1f, 405.1f)
                curveTo(805.5f, 409.2f, 813.2f, 415.3f, 818.9f, 419.1f)
                curveTo(821.9f, 421.1f, 825.8f, 416.6f, 829.6f, 421.1f)
                curveTo(829.5f, 429.2f, 815.7f, 433.2f, 809.0f, 433.8f)
                curveTo(814.7f, 439.0f, 818.4f, 441.7f, 825.7f, 444.7f)
                curveTo(829.0f, 446.1f, 829.7f, 447.0f, 830.1f, 450.4f)
                curveTo(825.4f, 461.8f, 804.9f, 466.6f, 794.3f, 468.6f)
                curveTo(792.7f, 494.9f, 790.3f, 511.7f, 784.0f, 537.5f)
                curveTo(775.6f, 571.6f, 773.5f, 578.3f, 737.3f, 582.4f)
                curveTo(728.8f, 601.6f, 730.4f, 624.6f, 723.0f, 644.3f)
                curveTo(716.8f, 661.0f, 707.1f, 676.4f, 699.0f, 692.2f)
                curveTo(692.9f, 704.1f, 694.5f, 708.2f, 697.5f, 720.5f)
                lineTo(697.8f, 720.8f)
                curveTo(705.8f, 728.0f, 717.8f, 732.3f, 727.6f, 736.7f)
                curveTo(758.1f, 750.1f, 790.9f, 757.1f, 814.4f, 782.3f)
                curveTo(826.2f, 795.0f, 835.8f, 807.2f, 847.2f, 820.7f)
                curveTo(874.3f, 852.7f, 880.9f, 895.6f, 896.7f, 933.3f)
                curveTo(900.1f, 941.5f, 901.2f, 951.3f, 905.3f, 959.3f)
                curveTo(911.9f, 972.2f, 923.3f, 986.5f, 931.9f, 998.5f)
                curveTo(935.1f, 1003.1f, 947.8f, 1021.0f, 950.7f, 1024.0f)
                lineTo(0.0f, 1024.0f)
                lineTo(0.0f, 724.1f)
                curveTo(11.0f, 719.7f, 21.1f, 713.5f, 31.8f, 708.4f)
                curveTo(69.1f, 690.3f, 105.7f, 670.8f, 142.2f, 651.3f)
                curveTo(157.0f, 643.4f, 171.9f, 635.9f, 186.3f, 627.2f)
                curveTo(198.8f, 619.9f, 205.6f, 619.6f, 211.6f, 604.8f)
                curveTo(215.4f, 595.5f, 217.7f, 584.4f, 222.1f, 575.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(546.4f, 310.7f)
                curveTo(555.7f, 313.3f, 581.1f, 328.6f, 584.6f, 328.7f)
                curveTo(586.7f, 326.7f, 586.9f, 326.3f, 589.5f, 325.7f)
                curveTo(592.3f, 327.1f, 592.6f, 329.9f, 594.1f, 333.4f)
                curveTo(597.5f, 333.1f, 595.9f, 330.3f, 600.1f, 328.0f)
                curveTo(603.4f, 329.7f, 609.2f, 338.2f, 610.3f, 338.6f)
                curveTo(620.2f, 342.3f, 620.0f, 340.1f, 626.7f, 349.1f)
                curveTo(630.1f, 345.8f, 638.2f, 337.2f, 642.4f, 336.8f)
                lineTo(645.5f, 339.7f)
                curveTo(648.5f, 339.9f, 670.5f, 334.1f, 675.5f, 332.9f)
                curveTo(675.1f, 354.8f, 679.1f, 379.7f, 688.8f, 399.5f)
                curveTo(680.4f, 410.0f, 671.7f, 422.1f, 657.6f, 424.2f)
                curveTo(643.9f, 426.2f, 637.7f, 432.3f, 634.8f, 446.2f)
                curveTo(637.2f, 450.8f, 640.8f, 445.8f, 645.0f, 449.6f)
                curveTo(646.6f, 456.6f, 641.3f, 465.3f, 638.6f, 473.0f)
                curveTo(642.3f, 470.2f, 648.6f, 461.3f, 653.1f, 461.9f)
                curveTo(651.6f, 467.9f, 649.1f, 472.4f, 653.2f, 477.4f)
                curveTo(660.1f, 480.2f, 664.7f, 478.2f, 671.6f, 476.1f)
                curveTo(671.9f, 472.1f, 672.0f, 462.0f, 674.1f, 459.5f)
                curveTo(674.3f, 459.5f, 674.6f, 459.5f, 674.9f, 459.6f)
                curveTo(688.6f, 465.1f, 681.9f, 478.5f, 674.0f, 485.7f)
                curveTo(671.5f, 488.0f, 669.9f, 488.9f, 668.1f, 490.1f)
                curveTo(662.4f, 488.5f, 656.6f, 486.3f, 651.0f, 484.3f)
                curveTo(657.3f, 493.7f, 658.7f, 494.8f, 669.4f, 497.9f)
                curveTo(685.6f, 491.4f, 680.0f, 493.0f, 695.2f, 490.4f)
                lineTo(696.1f, 488.6f)
                curveTo(695.8f, 487.8f, 695.6f, 487.1f, 695.4f, 486.4f)
                curveTo(694.4f, 482.7f, 694.5f, 482.9f, 696.0f, 480.3f)
                curveTo(699.5f, 480.5f, 697.2f, 483.4f, 701.5f, 485.6f)
                curveTo(705.2f, 481.7f, 701.7f, 477.2f, 701.1f, 471.9f)
                lineTo(702.2f, 471.1f)
                curveTo(706.5f, 477.2f, 706.8f, 473.0f, 712.5f, 476.8f)
                curveTo(714.0f, 481.7f, 712.1f, 496.2f, 713.4f, 504.6f)
                curveTo(714.5f, 511.9f, 722.6f, 539.4f, 721.7f, 545.0f)
                curveTo(716.1f, 581.0f, 701.8f, 625.5f, 692.4f, 660.8f)
                curveTo(687.3f, 672.2f, 665.7f, 688.5f, 659.9f, 697.6f)
                curveTo(640.8f, 728.2f, 615.1f, 755.3f, 580.0f, 767.1f)
                curveTo(554.6f, 775.6f, 553.2f, 772.3f, 533.9f, 793.4f)
                curveTo(490.7f, 773.3f, 448.7f, 741.4f, 406.6f, 718.8f)
                curveTo(391.0f, 710.5f, 378.6f, 703.3f, 367.7f, 689.1f)
                curveTo(356.9f, 673.5f, 349.7f, 666.6f, 337.9f, 652.8f)
                curveTo(332.8f, 646.9f, 329.3f, 636.7f, 321.6f, 627.3f)
                curveTo(311.9f, 623.5f, 301.2f, 622.1f, 292.4f, 615.6f)
                curveTo(285.6f, 610.7f, 270.2f, 600.4f, 273.2f, 590.9f)
                curveTo(280.0f, 588.6f, 320.6f, 599.6f, 330.7f, 602.0f)
                curveTo(319.2f, 582.5f, 322.3f, 589.5f, 316.2f, 565.9f)
                curveTo(322.4f, 571.7f, 337.6f, 586.2f, 341.6f, 592.4f)
                curveTo(356.2f, 615.5f, 360.0f, 628.7f, 386.2f, 641.7f)
                curveTo(390.6f, 643.8f, 426.5f, 658.2f, 429.4f, 657.2f)
                curveTo(424.2f, 651.9f, 415.8f, 648.7f, 411.7f, 645.2f)
                curveTo(402.1f, 637.0f, 375.3f, 621.5f, 369.7f, 613.5f)
                curveTo(359.9f, 599.6f, 360.8f, 574.6f, 363.3f, 558.9f)
                curveTo(373.9f, 563.5f, 386.9f, 568.7f, 396.6f, 574.6f)
                curveTo(392.5f, 566.3f, 386.7f, 559.5f, 380.9f, 552.3f)
                curveTo(385.9f, 554.7f, 399.9f, 564.3f, 402.9f, 565.0f)
                curveTo(423.4f, 569.9f, 454.1f, 571.4f, 475.3f, 573.3f)
                curveTo(467.1f, 563.1f, 450.6f, 552.5f, 439.8f, 542.9f)
                curveTo(474.6f, 550.7f, 492.8f, 554.5f, 527.8f, 544.1f)
                curveTo(531.7f, 543.0f, 536.5f, 542.7f, 537.2f, 538.2f)
                curveTo(534.2f, 536.1f, 519.2f, 533.3f, 514.0f, 531.6f)
                curveTo(489.9f, 523.5f, 456.4f, 506.6f, 443.7f, 483.5f)
                curveTo(438.8f, 474.8f, 439.8f, 464.9f, 438.1f, 455.5f)
                curveTo(430.7f, 412.9f, 445.0f, 373.2f, 469.1f, 338.6f)
                curveTo(477.4f, 326.8f, 488.5f, 328.0f, 493.2f, 313.8f)
                lineTo(504.4f, 322.5f)
                curveTo(509.5f, 321.5f, 517.0f, 319.8f, 522.0f, 320.0f)
                curveTo(523.1f, 321.4f, 523.7f, 322.6f, 525.4f, 323.1f)
                curveTo(531.9f, 309.8f, 537.2f, 321.4f, 546.4f, 310.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(628.0f, 596.6f)
                curveTo(634.5f, 600.7f, 666.8f, 627.7f, 665.7f, 635.1f)
                curveTo(663.1f, 636.6f, 659.5f, 635.9f, 655.5f, 636.5f)
                curveTo(652.8f, 639.0f, 649.7f, 644.7f, 647.6f, 648.0f)
                curveTo(628.9f, 678.2f, 574.0f, 666.5f, 550.7f, 651.7f)
                curveTo(540.0f, 644.4f, 530.3f, 636.1f, 519.7f, 628.8f)
                curveTo(515.0f, 625.5f, 511.7f, 629.5f, 507.3f, 626.5f)
                lineTo(507.3f, 623.6f)
                curveTo(508.8f, 621.5f, 509.0f, 620.8f, 511.8f, 620.2f)
                curveTo(540.4f, 614.7f, 567.4f, 605.4f, 595.2f, 597.8f)
                curveTo(609.1f, 606.5f, 616.9f, 612.8f, 628.0f, 596.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(614.2f, 634.2f)
                curveTo(620.0f, 634.8f, 628.8f, 634.9f, 634.8f, 635.2f)
                curveTo(627.3f, 650.8f, 626.8f, 651.7f, 609.9f, 652.9f)
                curveTo(605.9f, 653.2f, 601.9f, 652.7f, 598.1f, 651.3f)
                curveTo(594.9f, 650.2f, 595.2f, 650.4f, 594.1f, 648.0f)
                curveTo(598.1f, 643.5f, 603.6f, 651.4f, 608.8f, 650.6f)
                curveTo(611.3f, 646.9f, 613.0f, 638.8f, 614.2f, 634.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(560.3f, 413.1f)
                curveTo(533.2f, 388.4f, 518.4f, 374.7f, 479.6f, 391.6f)
                curveTo(476.1f, 393.1f, 472.0f, 396.4f, 469.5f, 396.1f)
                lineTo(469.7f, 394.1f)
                curveTo(483.9f, 374.3f, 520.1f, 370.0f, 539.5f, 383.1f)
                curveTo(552.1f, 391.7f, 560.3f, 401.7f, 573.8f, 409.0f)
                curveTo(579.9f, 412.3f, 596.7f, 421.6f, 600.1f, 426.5f)
                curveTo(599.3f, 430.4f, 595.6f, 435.0f, 593.3f, 438.5f)
                curveTo(586.1f, 432.9f, 579.1f, 426.9f, 570.8f, 423.2f)
                curveTo(569.7f, 424.7f, 569.1f, 425.3f, 568.5f, 427.0f)
                curveTo(570.5f, 432.5f, 577.2f, 452.8f, 575.8f, 457.9f)
                curveTo(569.2f, 459.3f, 567.7f, 459.7f, 561.6f, 462.8f)
                curveTo(561.9f, 458.8f, 562.7f, 454.0f, 563.2f, 449.9f)
                curveTo(557.8f, 448.6f, 550.1f, 445.7f, 544.6f, 443.9f)
                curveTo(534.9f, 452.1f, 538.5f, 455.9f, 528.2f, 465.3f)
                curveTo(522.0f, 462.9f, 514.8f, 460.3f, 508.9f, 457.2f)
                curveTo(506.0f, 455.7f, 506.2f, 452.4f, 505.6f, 448.9f)
                lineTo(503.6f, 448.0f)
                curveTo(499.3f, 449.1f, 497.4f, 450.4f, 495.9f, 454.5f)
                curveTo(497.5f, 457.4f, 513.5f, 467.7f, 517.5f, 469.6f)
                curveTo(532.5f, 476.8f, 548.3f, 470.1f, 562.8f, 464.9f)
                curveTo(546.2f, 481.7f, 526.0f, 482.1f, 505.2f, 473.4f)
                curveTo(501.9f, 476.0f, 496.1f, 481.1f, 492.1f, 481.3f)
                curveTo(491.0f, 476.7f, 497.0f, 472.4f, 494.9f, 467.1f)
                curveTo(490.0f, 465.9f, 485.9f, 471.3f, 482.1f, 471.5f)
                curveTo(481.9f, 466.0f, 488.3f, 464.2f, 487.0f, 458.6f)
                curveTo(482.3f, 455.7f, 469.8f, 457.4f, 463.6f, 457.7f)
                curveTo(469.5f, 453.7f, 472.6f, 451.8f, 479.0f, 448.6f)
                curveTo(475.7f, 443.8f, 471.1f, 439.2f, 467.9f, 435.0f)
                curveTo(465.2f, 431.5f, 458.3f, 410.4f, 461.5f, 407.3f)
                curveTo(464.5f, 410.1f, 469.8f, 417.2f, 472.2f, 418.5f)
                curveTo(490.2f, 404.4f, 513.6f, 413.1f, 534.3f, 413.9f)
                curveTo(543.8f, 414.3f, 550.8f, 414.2f, 560.3f, 413.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(568.5f, 427.0f)
                curveTo(562.2f, 424.2f, 554.6f, 424.5f, 552.4f, 422.8f)
                curveTo(554.1f, 420.0f, 557.3f, 418.9f, 560.4f, 417.3f)
                curveTo(563.4f, 419.4f, 567.5f, 421.4f, 570.8f, 423.2f)
                curveTo(569.7f, 424.7f, 569.1f, 425.3f, 568.5f, 427.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(479.6f, 686.0f)
                curveTo(493.4f, 688.4f, 515.0f, 697.3f, 524.6f, 707.8f)
                curveTo(530.8f, 714.6f, 531.8f, 720.1f, 542.2f, 723.2f)
                curveTo(558.7f, 728.3f, 585.9f, 736.0f, 602.6f, 733.2f)
                curveTo(610.7f, 731.8f, 628.0f, 723.3f, 635.8f, 719.7f)
                curveTo(631.0f, 725.9f, 628.5f, 728.9f, 622.9f, 734.3f)
                curveTo(598.7f, 755.8f, 586.7f, 754.4f, 556.4f, 753.7f)
                curveTo(545.9f, 743.6f, 528.5f, 738.1f, 519.2f, 727.7f)
                curveTo(513.8f, 721.7f, 480.4f, 690.9f, 479.6f, 686.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(639.3f, 543.4f)
                curveTo(644.3f, 546.1f, 640.2f, 559.2f, 639.3f, 564.0f)
                curveTo(630.0f, 572.5f, 619.5f, 579.9f, 610.6f, 588.7f)
                curveTo(597.1f, 582.8f, 588.0f, 575.8f, 577.7f, 565.3f)
                curveTo(575.0f, 562.3f, 567.4f, 554.6f, 567.0f, 551.3f)
                curveTo(570.3f, 548.2f, 578.8f, 558.5f, 582.0f, 559.0f)
                curveTo(595.5f, 560.9f, 609.9f, 563.3f, 623.5f, 563.1f)
                curveTo(630.2f, 563.1f, 634.8f, 548.7f, 639.3f, 543.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(572.3f, 674.2f)
                curveTo(581.0f, 676.2f, 597.5f, 675.9f, 606.8f, 675.9f)
                curveTo(610.2f, 680.3f, 613.1f, 682.7f, 610.8f, 687.9f)
                curveTo(599.3f, 692.3f, 574.7f, 687.0f, 572.3f, 674.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.1f, 474.4f)
                curveTo(470.1f, 474.5f, 475.5f, 474.8f, 478.5f, 480.6f)
                curveTo(477.7f, 484.5f, 478.1f, 483.3f, 474.7f, 486.3f)
                curveTo(473.2f, 487.9f, 472.4f, 488.2f, 470.4f, 489.2f)
                curveTo(463.7f, 488.1f, 464.2f, 479.9f, 464.1f, 474.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(477.5f, 141.5f)
                curveTo(521.4f, 134.9f, 510.0f, 124.1f, 559.2f, 137.9f)
                curveTo(588.5f, 146.1f, 634.8f, 148.9f, 655.7f, 178.4f)
                curveTo(666.9f, 194.2f, 681.6f, 230.6f, 689.5f, 248.6f)
                curveTo(685.2f, 245.2f, 679.4f, 238.7f, 675.0f, 234.6f)
                curveTo(661.7f, 222.4f, 648.8f, 218.4f, 632.3f, 212.2f)
                curveTo(636.9f, 224.9f, 645.2f, 237.6f, 651.0f, 253.3f)
                curveTo(639.3f, 244.1f, 630.2f, 232.2f, 617.0f, 223.3f)
                curveTo(600.1f, 212.0f, 579.4f, 207.8f, 559.5f, 211.7f)
                curveTo(522.3f, 219.0f, 516.6f, 237.4f, 497.0f, 266.5f)
                curveTo(498.0f, 253.7f, 511.9f, 210.7f, 516.8f, 198.7f)
                curveTo(505.7f, 211.3f, 501.2f, 217.1f, 487.7f, 227.3f)
                curveTo(499.8f, 205.3f, 507.3f, 191.0f, 534.1f, 190.2f)
                curveTo(540.7f, 189.9f, 556.5f, 185.7f, 562.0f, 186.4f)
                curveTo(578.0f, 188.4f, 596.6f, 192.8f, 612.0f, 197.6f)
                curveTo(597.9f, 181.0f, 591.7f, 159.9f, 576.3f, 146.2f)
                curveTo(560.8f, 142.4f, 501.3f, 134.9f, 493.0f, 152.9f)
                curveTo(496.5f, 155.3f, 496.6f, 154.9f, 498.1f, 159.5f)
                curveTo(487.1f, 164.4f, 481.8f, 171.1f, 476.0f, 181.0f)
                curveTo(488.0f, 176.9f, 502.3f, 175.0f, 515.0f, 172.8f)
                curveTo(512.7f, 174.4f, 496.0f, 186.4f, 494.7f, 186.6f)
                curveTo(469.6f, 190.7f, 474.9f, 195.6f, 459.7f, 213.9f)
                curveTo(461.5f, 204.4f, 466.0f, 182.7f, 466.6f, 174.0f)
                curveTo(464.9f, 171.8f, 464.4f, 171.4f, 462.3f, 169.9f)
                lineTo(461.7f, 169.5f)
                curveTo(461.6f, 164.8f, 474.3f, 147.0f, 477.5f, 141.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(323.4f, 245.8f)
                curveTo(325.7f, 248.2f, 322.3f, 252.9f, 320.7f, 255.0f)
                curveTo(305.9f, 273.9f, 295.4f, 298.4f, 295.2f, 322.6f)
                curveTo(295.2f, 328.1f, 298.9f, 337.5f, 301.0f, 343.3f)
                curveTo(304.7f, 334.0f, 308.8f, 326.7f, 317.6f, 321.1f)
                curveTo(321.6f, 318.6f, 331.0f, 312.9f, 335.4f, 313.8f)
                curveTo(334.2f, 317.2f, 320.6f, 332.0f, 316.9f, 337.9f)
                curveTo(296.4f, 370.0f, 287.6f, 403.4f, 283.3f, 440.6f)
                curveTo(277.8f, 427.6f, 273.7f, 413.6f, 270.0f, 400.0f)
                curveTo(268.0f, 392.6f, 270.6f, 381.9f, 264.7f, 376.6f)
                curveTo(257.4f, 373.8f, 255.4f, 380.8f, 253.4f, 386.6f)
                curveTo(238.5f, 405.3f, 239.8f, 421.5f, 238.5f, 444.4f)
                curveTo(233.6f, 428.0f, 222.2f, 404.4f, 222.0f, 388.0f)
                curveTo(221.8f, 372.5f, 232.6f, 339.1f, 240.6f, 325.3f)
                curveTo(244.2f, 319.2f, 256.4f, 306.7f, 261.6f, 301.2f)
                curveTo(257.8f, 309.5f, 238.1f, 334.6f, 249.1f, 340.9f)
                curveTo(254.7f, 336.6f, 272.0f, 298.0f, 278.7f, 288.9f)
                curveTo(291.8f, 271.0f, 307.0f, 260.1f, 323.4f, 245.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(379.3f, 320.6f)
                curveTo(380.9f, 322.7f, 378.7f, 339.5f, 378.6f, 344.0f)
                curveTo(378.3f, 372.1f, 378.7f, 400.1f, 377.4f, 428.2f)
                curveTo(373.5f, 416.8f, 371.2f, 414.9f, 363.4f, 405.5f)
                curveTo(364.1f, 416.4f, 368.7f, 437.5f, 370.9f, 449.0f)
                curveTo(358.9f, 437.9f, 349.2f, 426.3f, 335.8f, 415.7f)
                curveTo(334.1f, 423.4f, 332.4f, 429.0f, 330.0f, 436.5f)
                curveTo(327.7f, 444.4f, 325.6f, 452.6f, 323.5f, 460.5f)
                curveTo(317.1f, 431.4f, 304.1f, 419.6f, 308.9f, 387.7f)
                curveTo(312.7f, 362.5f, 315.7f, 357.3f, 327.7f, 335.3f)
                curveTo(331.9f, 344.4f, 334.6f, 346.8f, 341.9f, 353.2f)
                curveTo(363.7f, 338.6f, 363.9f, 343.3f, 379.3f, 320.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(691.5f, 406.8f)
                curveTo(694.3f, 409.7f, 700.5f, 430.2f, 704.0f, 437.0f)
                curveTo(695.3f, 436.4f, 686.5f, 436.0f, 677.8f, 435.9f)
                curveTo(673.3f, 436.0f, 667.4f, 435.2f, 662.9f, 434.7f)
                curveTo(677.3f, 422.4f, 679.0f, 423.4f, 691.5f, 406.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(706.6f, 444.2f)
                curveTo(719.0f, 446.7f, 719.9f, 467.5f, 713.9f, 476.5f)
                curveTo(709.7f, 470.5f, 705.2f, 465.4f, 706.0f, 458.0f)
                curveTo(706.6f, 452.2f, 705.0f, 450.0f, 706.6f, 444.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(322.1f, 538.3f)
                curveTo(326.5f, 540.3f, 335.9f, 543.9f, 338.1f, 547.7f)
                lineTo(337.3f, 549.4f)
                lineTo(333.0f, 550.7f)
                curveTo(326.5f, 551.5f, 323.9f, 552.1f, 317.7f, 553.8f)
                curveTo(319.6f, 549.1f, 320.8f, 543.3f, 322.1f, 538.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(493.0f, 152.9f)
                lineTo(493.6f, 152.7f)
                curveTo(498.5f, 151.7f, 503.5f, 148.4f, 509.0f, 150.7f)
                curveTo(509.9f, 156.4f, 502.4f, 158.5f, 498.1f, 159.5f)
                curveTo(496.6f, 154.9f, 496.5f, 155.3f, 493.0f, 152.9f)
                close()
            }
        }
        .build()
        return _standardLalaEscargot!!
    }

private var _standardLalaEscargot: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = StandardSenderAvatar.StandardLalaEscargot, contentDescription = "")
    }
}
