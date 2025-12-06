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

public val StandardSenderAvatar.StandardHaruOkumura: ImageVector
    get() {
        if (_standardHaruOkumura != null) {
            return _standardHaruOkumura!!
        }
        _standardHaruOkumura = Builder(name = "StandardHaruOkumura", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 1024.0f, viewportHeight = 1024.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(517.2f, 86.3f)
                curveTo(540.4f, 84.8f, 570.8f, 95.4f, 591.7f, 105.0f)
                curveTo(600.1f, 108.9f, 615.4f, 109.3f, 622.9f, 113.4f)
                curveTo(646.5f, 126.2f, 669.0f, 144.9f, 688.8f, 162.9f)
                curveTo(703.4f, 178.9f, 715.6f, 193.9f, 730.9f, 209.7f)
                curveTo(761.5f, 241.2f, 772.0f, 287.1f, 796.9f, 323.4f)
                curveTo(810.0f, 342.5f, 812.7f, 351.4f, 831.6f, 366.2f)
                curveTo(845.0f, 376.7f, 853.2f, 416.0f, 852.9f, 431.9f)
                curveTo(850.0f, 437.0f, 846.2f, 442.4f, 842.9f, 447.4f)
                curveTo(844.1f, 458.3f, 850.0f, 479.9f, 854.4f, 490.4f)
                curveTo(855.8f, 494.0f, 865.0f, 502.0f, 866.5f, 505.0f)
                curveTo(872.7f, 517.5f, 882.7f, 540.5f, 884.0f, 554.0f)
                curveTo(885.6f, 572.1f, 883.0f, 592.2f, 868.9f, 604.7f)
                curveTo(864.8f, 608.9f, 857.0f, 615.5f, 855.3f, 620.9f)
                curveTo(840.2f, 666.2f, 842.5f, 668.5f, 793.0f, 672.8f)
                curveTo(778.4f, 685.0f, 778.5f, 699.3f, 766.2f, 706.9f)
                curveTo(740.5f, 722.9f, 723.9f, 699.4f, 699.8f, 695.1f)
                curveTo(683.4f, 716.8f, 689.2f, 736.6f, 705.6f, 756.7f)
                curveTo(719.4f, 761.9f, 738.4f, 762.0f, 753.3f, 762.6f)
                curveTo(787.6f, 763.6f, 828.3f, 769.4f, 859.6f, 784.5f)
                curveTo(878.9f, 793.8f, 902.9f, 832.9f, 916.2f, 850.0f)
                curveTo(922.3f, 859.5f, 931.9f, 890.2f, 930.3f, 900.5f)
                curveTo(924.4f, 938.3f, 932.9f, 967.9f, 942.7f, 1005.3f)
                curveTo(937.0f, 1004.7f, 912.3f, 1005.3f, 905.2f, 1005.3f)
                lineTo(809.0f, 1006.0f)
                lineTo(474.5f, 1006.8f)
                lineTo(337.2f, 1006.9f)
                curveTo(287.2f, 1007.4f, 233.1f, 1008.3f, 183.4f, 1006.3f)
                curveTo(176.9f, 965.4f, 174.1f, 910.6f, 188.1f, 871.7f)
                curveTo(200.8f, 847.3f, 231.6f, 830.6f, 258.3f, 832.2f)
                curveTo(282.5f, 833.7f, 319.0f, 820.2f, 339.9f, 812.2f)
                curveTo(341.1f, 808.9f, 342.1f, 805.5f, 342.9f, 802.0f)
                curveTo(346.2f, 786.5f, 324.6f, 782.9f, 316.0f, 767.6f)
                curveTo(307.8f, 752.8f, 309.9f, 751.7f, 308.0f, 742.2f)
                curveTo(300.9f, 706.3f, 339.3f, 698.6f, 341.9f, 686.6f)
                curveTo(340.8f, 681.2f, 334.4f, 671.9f, 329.6f, 668.8f)
                curveTo(320.7f, 663.0f, 314.5f, 665.8f, 305.0f, 667.6f)
                curveTo(292.3f, 658.8f, 283.6f, 651.0f, 274.4f, 638.7f)
                curveTo(271.0f, 644.9f, 269.4f, 647.5f, 265.1f, 653.0f)
                curveTo(256.7f, 656.5f, 250.8f, 655.7f, 241.2f, 659.7f)
                curveTo(242.2f, 653.0f, 255.8f, 635.7f, 249.7f, 629.6f)
                curveTo(244.2f, 624.1f, 225.9f, 633.0f, 220.3f, 632.7f)
                curveTo(206.1f, 631.7f, 187.9f, 619.3f, 177.6f, 610.0f)
                curveTo(176.6f, 607.0f, 175.4f, 601.9f, 174.5f, 598.6f)
                curveTo(168.6f, 598.1f, 164.2f, 598.4f, 158.6f, 600.0f)
                curveTo(151.0f, 597.0f, 146.6f, 594.5f, 139.9f, 590.1f)
                curveTo(144.3f, 588.2f, 161.8f, 577.2f, 163.3f, 573.2f)
                curveTo(162.1f, 568.8f, 161.1f, 558.2f, 159.7f, 556.3f)
                curveTo(155.2f, 554.9f, 148.6f, 560.0f, 145.6f, 559.4f)
                curveTo(129.4f, 556.3f, 114.1f, 537.1f, 113.4f, 521.0f)
                curveTo(112.9f, 512.4f, 116.0f, 509.5f, 120.9f, 504.0f)
                curveTo(117.0f, 497.1f, 109.8f, 490.3f, 106.6f, 483.5f)
                curveTo(100.3f, 470.3f, 103.5f, 454.0f, 112.4f, 442.8f)
                curveTo(115.2f, 439.3f, 124.3f, 431.5f, 125.2f, 428.3f)
                curveTo(126.7f, 422.6f, 122.2f, 414.7f, 122.0f, 407.9f)
                curveTo(121.8f, 395.7f, 123.3f, 383.4f, 124.4f, 371.3f)
                curveTo(139.6f, 352.1f, 166.3f, 343.0f, 189.9f, 340.2f)
                curveTo(183.4f, 309.5f, 192.4f, 319.6f, 206.3f, 301.0f)
                curveTo(208.3f, 298.3f, 218.0f, 273.5f, 221.1f, 267.2f)
                curveTo(231.3f, 261.7f, 240.3f, 260.6f, 251.0f, 256.4f)
                curveTo(265.6f, 238.0f, 276.4f, 212.3f, 292.2f, 192.6f)
                curveTo(322.7f, 154.6f, 353.8f, 133.6f, 398.1f, 113.9f)
                curveTo(425.8f, 101.6f, 433.2f, 100.1f, 462.7f, 95.0f)
                curveTo(480.8f, 91.8f, 499.0f, 88.9f, 517.2f, 86.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(536.2f, 183.1f)
                curveTo(543.2f, 197.5f, 564.8f, 213.1f, 578.2f, 223.1f)
                curveTo(624.8f, 257.9f, 654.7f, 307.9f, 671.1f, 363.0f)
                curveTo(674.0f, 372.9f, 670.7f, 395.1f, 670.9f, 405.9f)
                curveTo(652.2f, 397.2f, 638.3f, 393.4f, 617.5f, 394.9f)
                curveTo(610.7f, 395.4f, 597.7f, 394.9f, 593.4f, 400.8f)
                lineTo(593.2f, 402.7f)
                curveTo(598.9f, 406.5f, 622.8f, 399.6f, 633.4f, 401.4f)
                curveTo(647.0f, 403.6f, 658.9f, 406.5f, 672.0f, 410.9f)
                curveTo(667.9f, 424.2f, 661.0f, 434.0f, 668.3f, 445.6f)
                curveTo(676.3f, 458.3f, 685.5f, 471.3f, 694.2f, 483.4f)
                curveTo(681.6f, 513.3f, 677.4f, 531.9f, 651.3f, 552.9f)
                curveTo(627.9f, 571.8f, 632.6f, 601.5f, 646.2f, 625.7f)
                curveTo(635.4f, 635.0f, 624.8f, 644.8f, 613.5f, 653.4f)
                curveTo(603.0f, 661.5f, 591.7f, 668.5f, 581.1f, 676.5f)
                curveTo(568.2f, 686.4f, 529.6f, 721.4f, 514.8f, 720.2f)
                curveTo(492.8f, 718.5f, 406.5f, 658.0f, 391.2f, 639.6f)
                curveTo(382.1f, 628.6f, 358.3f, 600.5f, 359.8f, 586.6f)
                curveTo(360.5f, 579.5f, 364.8f, 572.6f, 367.3f, 566.1f)
                curveTo(373.5f, 549.9f, 368.2f, 531.3f, 357.8f, 518.0f)
                curveTo(351.6f, 510.0f, 343.7f, 504.6f, 336.3f, 497.8f)
                curveTo(336.1f, 493.1f, 334.9f, 476.6f, 337.5f, 474.8f)
                curveTo(351.6f, 464.9f, 367.7f, 454.5f, 377.4f, 439.4f)
                curveTo(375.1f, 460.6f, 371.4f, 461.4f, 386.3f, 477.8f)
                lineTo(387.0f, 476.9f)
                curveTo(388.5f, 472.7f, 388.5f, 471.2f, 392.0f, 468.4f)
                curveTo(395.2f, 482.7f, 403.6f, 491.1f, 419.3f, 487.5f)
                curveTo(427.2f, 485.6f, 434.0f, 480.7f, 438.3f, 473.9f)
                curveTo(445.4f, 462.6f, 443.0f, 447.0f, 442.2f, 433.9f)
                curveTo(462.5f, 443.4f, 462.5f, 446.9f, 466.9f, 468.5f)
                curveTo(468.8f, 461.0f, 470.7f, 452.1f, 471.7f, 444.4f)
                curveTo(467.8f, 435.1f, 461.6f, 432.3f, 461.1f, 428.3f)
                curveTo(466.9f, 426.4f, 468.6f, 431.5f, 473.3f, 430.0f)
                curveTo(479.0f, 407.0f, 421.8f, 403.8f, 408.0f, 405.9f)
                curveTo(406.1f, 406.2f, 402.7f, 416.3f, 396.0f, 416.3f)
                lineTo(392.3f, 413.5f)
                lineTo(390.6f, 413.9f)
                curveTo(387.4f, 423.7f, 390.4f, 422.3f, 381.8f, 430.5f)
                lineTo(381.2f, 430.0f)
                curveTo(384.5f, 419.0f, 377.7f, 397.5f, 372.1f, 387.7f)
                curveTo(371.8f, 387.1f, 371.4f, 386.5f, 371.0f, 386.0f)
                curveTo(380.3f, 378.7f, 461.3f, 386.1f, 477.0f, 388.0f)
                curveTo(478.3f, 388.2f, 479.5f, 388.4f, 480.8f, 388.6f)
                curveTo(447.9f, 377.5f, 417.6f, 377.5f, 383.7f, 376.6f)
                curveTo(375.2f, 376.4f, 369.4f, 383.6f, 363.4f, 379.9f)
                curveTo(359.8f, 370.0f, 382.8f, 311.3f, 388.6f, 300.5f)
                curveTo(406.6f, 267.1f, 440.4f, 237.1f, 473.7f, 219.2f)
                curveTo(481.5f, 215.0f, 490.6f, 206.8f, 499.2f, 203.4f)
                curveTo(521.3f, 196.5f, 520.2f, 200.3f, 536.2f, 183.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(646.3f, 432.4f)
                lineTo(648.5f, 433.1f)
                curveTo(650.2f, 436.0f, 649.3f, 436.7f, 648.7f, 441.0f)
                curveTo(650.2f, 448.5f, 661.5f, 449.2f, 666.0f, 455.1f)
                curveTo(679.7f, 473.0f, 676.0f, 492.8f, 659.4f, 506.4f)
                curveTo(662.9f, 497.0f, 664.3f, 491.9f, 666.7f, 482.1f)
                curveTo(662.2f, 467.0f, 659.7f, 462.5f, 646.8f, 454.2f)
                curveTo(647.2f, 470.7f, 648.5f, 489.1f, 636.8f, 502.0f)
                curveTo(606.5f, 519.6f, 598.3f, 499.6f, 596.0f, 472.5f)
                curveTo(588.3f, 482.4f, 586.8f, 485.4f, 581.8f, 497.0f)
                curveTo(582.8f, 483.0f, 582.6f, 470.6f, 592.4f, 459.8f)
                curveTo(593.8f, 458.4f, 595.3f, 456.4f, 596.2f, 454.6f)
                curveTo(594.5f, 453.1f, 594.1f, 452.9f, 593.1f, 450.9f)
                curveTo(601.3f, 437.9f, 627.5f, 439.8f, 640.5f, 442.3f)
                lineTo(646.3f, 432.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(481.5f, 628.2f)
                curveTo(493.9f, 626.8f, 504.3f, 629.6f, 515.2f, 630.0f)
                curveTo(543.2f, 631.0f, 547.5f, 629.8f, 573.5f, 640.8f)
                curveTo(561.0f, 645.0f, 551.3f, 656.1f, 540.0f, 664.9f)
                curveTo(531.1f, 671.0f, 516.7f, 672.6f, 508.2f, 665.4f)
                curveTo(505.1f, 657.4f, 516.8f, 652.3f, 522.9f, 648.2f)
                curveTo(512.8f, 645.1f, 505.2f, 640.4f, 495.9f, 637.4f)
                curveTo(490.6f, 635.8f, 476.4f, 636.7f, 470.7f, 633.1f)
                lineTo(470.7f, 631.6f)
                curveTo(473.5f, 629.4f, 477.8f, 628.9f, 481.5f, 628.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(530.8f, 556.2f)
                curveTo(547.0f, 560.8f, 542.6f, 580.3f, 542.0f, 593.9f)
                curveTo(537.1f, 595.7f, 532.2f, 597.4f, 527.2f, 599.0f)
                curveTo(520.9f, 601.7f, 517.8f, 594.2f, 518.0f, 589.0f)
                curveTo(519.5f, 586.8f, 521.2f, 586.1f, 523.6f, 584.7f)
                curveTo(526.0f, 580.9f, 529.7f, 561.6f, 530.8f, 556.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(596.7f, 424.2f)
                lineTo(597.6f, 424.2f)
                curveTo(608.2f, 423.5f, 630.0f, 424.2f, 638.2f, 431.6f)
                lineTo(638.3f, 433.2f)
                curveTo(633.8f, 436.7f, 624.4f, 436.1f, 618.8f, 436.1f)
                curveTo(610.0f, 435.9f, 588.9f, 443.2f, 583.5f, 439.7f)
                curveTo(580.9f, 432.4f, 591.0f, 426.3f, 596.7f, 424.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.1f, 411.7f)
                curveTo(249.4f, 395.4f, 256.6f, 377.8f, 266.3f, 364.4f)
                curveTo(264.9f, 371.9f, 262.7f, 380.4f, 260.9f, 387.9f)
                curveTo(265.1f, 392.0f, 274.6f, 398.6f, 271.6f, 404.2f)
                curveTo(268.2f, 406.5f, 263.0f, 406.3f, 258.8f, 406.7f)
                curveTo(269.1f, 412.4f, 269.1f, 414.1f, 276.4f, 423.0f)
                lineTo(278.6f, 425.5f)
                curveTo(280.8f, 430.2f, 287.1f, 436.0f, 291.1f, 440.0f)
                lineTo(290.5f, 440.9f)
                curveTo(288.7f, 445.5f, 290.1f, 449.6f, 289.7f, 450.9f)
                curveTo(287.5f, 458.3f, 274.9f, 454.9f, 269.8f, 460.5f)
                curveTo(270.7f, 462.6f, 275.9f, 463.8f, 279.7f, 466.6f)
                curveTo(283.9f, 476.2f, 269.8f, 481.4f, 263.0f, 484.9f)
                curveTo(257.1f, 475.9f, 256.3f, 475.7f, 252.0f, 465.7f)
                lineTo(250.9f, 484.5f)
                curveTo(248.1f, 487.2f, 244.1f, 490.6f, 244.0f, 494.7f)
                lineTo(245.5f, 496.1f)
                curveTo(254.0f, 497.4f, 264.5f, 492.9f, 272.3f, 489.6f)
                curveTo(277.2f, 490.0f, 282.2f, 490.6f, 287.1f, 491.2f)
                lineTo(295.6f, 498.1f)
                curveTo(294.7f, 503.7f, 294.1f, 509.2f, 293.5f, 514.9f)
                curveTo(302.9f, 518.5f, 312.9f, 523.1f, 322.0f, 527.3f)
                curveTo(297.3f, 562.3f, 274.8f, 574.7f, 301.4f, 618.6f)
                curveTo(294.4f, 616.2f, 287.4f, 613.1f, 280.6f, 610.2f)
                curveTo(276.4f, 590.2f, 279.7f, 591.9f, 268.8f, 570.2f)
                curveTo(293.8f, 540.8f, 250.9f, 539.8f, 234.6f, 534.0f)
                curveTo(232.6f, 531.8f, 230.6f, 529.5f, 228.6f, 527.2f)
                curveTo(221.7f, 519.3f, 196.5f, 491.2f, 197.1f, 482.0f)
                curveTo(199.2f, 477.0f, 204.4f, 474.4f, 209.0f, 472.1f)
                curveTo(213.1f, 473.4f, 217.2f, 475.0f, 221.2f, 476.5f)
                curveTo(225.5f, 474.2f, 236.2f, 462.3f, 239.0f, 458.1f)
                curveTo(232.5f, 424.8f, 260.2f, 451.7f, 266.0f, 433.5f)
                curveTo(264.9f, 427.0f, 252.5f, 417.0f, 247.1f, 411.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(463.3f, 128.9f)
                curveTo(465.8f, 130.1f, 466.0f, 130.4f, 467.6f, 132.7f)
                curveTo(466.2f, 141.9f, 443.7f, 152.4f, 440.9f, 157.7f)
                curveTo(443.5f, 161.3f, 445.6f, 158.8f, 447.5f, 163.0f)
                curveTo(446.1f, 168.1f, 437.3f, 177.7f, 433.6f, 182.3f)
                curveTo(425.0f, 171.9f, 425.2f, 171.5f, 424.5f, 157.9f)
                curveTo(420.3f, 167.8f, 418.6f, 176.0f, 413.6f, 187.1f)
                curveTo(386.4f, 182.0f, 389.2f, 194.1f, 381.3f, 214.3f)
                curveTo(377.9f, 223.0f, 370.9f, 221.1f, 363.3f, 223.6f)
                curveTo(364.0f, 228.7f, 372.1f, 231.3f, 372.3f, 238.7f)
                curveTo(370.2f, 243.9f, 357.0f, 250.4f, 352.7f, 248.7f)
                curveTo(352.0f, 246.3f, 351.4f, 244.8f, 350.5f, 242.5f)
                lineTo(348.7f, 242.7f)
                curveTo(332.8f, 256.4f, 328.2f, 273.5f, 318.2f, 288.2f)
                curveTo(304.6f, 308.0f, 301.7f, 308.4f, 291.0f, 331.1f)
                lineTo(285.2f, 323.7f)
                curveTo(289.5f, 300.2f, 294.3f, 295.6f, 289.8f, 271.5f)
                lineTo(284.2f, 245.5f)
                curveTo(299.6f, 222.9f, 321.1f, 199.6f, 340.3f, 180.1f)
                curveTo(345.5f, 174.8f, 373.5f, 153.0f, 379.9f, 151.7f)
                curveTo(379.1f, 154.3f, 362.4f, 174.4f, 359.1f, 178.6f)
                curveTo(360.5f, 181.6f, 361.3f, 186.1f, 362.0f, 189.5f)
                curveTo(356.2f, 199.5f, 354.5f, 197.8f, 343.2f, 199.8f)
                lineTo(342.5f, 200.9f)
                curveTo(344.4f, 204.6f, 348.3f, 207.0f, 351.7f, 209.5f)
                curveTo(354.8f, 206.5f, 371.2f, 192.5f, 372.0f, 190.6f)
                curveTo(369.7f, 187.5f, 364.2f, 181.3f, 367.6f, 177.7f)
                curveTo(376.3f, 168.9f, 383.3f, 168.9f, 392.6f, 175.4f)
                curveTo(394.6f, 173.9f, 394.1f, 173.8f, 394.6f, 170.5f)
                curveTo(395.8f, 162.5f, 406.3f, 166.0f, 411.7f, 162.2f)
                curveTo(428.6f, 150.6f, 446.0f, 139.9f, 463.3f, 128.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.6f, 337.8f)
                curveTo(227.4f, 340.7f, 215.1f, 376.1f, 212.9f, 383.7f)
                curveTo(208.9f, 397.4f, 209.8f, 411.6f, 207.4f, 425.0f)
                curveTo(205.5f, 435.7f, 176.1f, 437.4f, 173.0f, 449.0f)
                curveTo(173.3f, 452.4f, 174.5f, 453.6f, 176.5f, 456.2f)
                curveTo(180.7f, 457.0f, 185.1f, 451.9f, 189.9f, 451.6f)
                curveTo(200.0f, 451.0f, 208.5f, 461.8f, 200.7f, 470.4f)
                curveTo(195.3f, 476.2f, 189.3f, 475.4f, 181.9f, 475.6f)
                lineTo(190.4f, 482.1f)
                curveTo(192.3f, 488.2f, 194.9f, 495.7f, 191.2f, 501.4f)
                curveTo(185.6f, 504.2f, 175.2f, 499.2f, 171.6f, 504.4f)
                curveTo(175.3f, 517.8f, 212.0f, 537.4f, 213.5f, 542.3f)
                lineTo(211.7f, 544.7f)
                curveTo(209.2f, 547.1f, 201.4f, 556.8f, 199.7f, 557.2f)
                curveTo(191.9f, 546.5f, 167.4f, 522.7f, 156.4f, 515.9f)
                lineTo(156.0f, 515.7f)
                curveTo(156.0f, 507.6f, 156.4f, 500.4f, 156.8f, 492.4f)
                curveTo(132.5f, 483.2f, 129.5f, 471.0f, 137.7f, 447.8f)
                curveTo(147.2f, 438.8f, 171.9f, 430.3f, 178.6f, 422.0f)
                curveTo(185.9f, 412.9f, 195.0f, 387.4f, 201.7f, 375.1f)
                curveTo(210.8f, 358.3f, 214.6f, 352.5f, 226.6f, 337.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(703.3f, 222.8f)
                curveTo(717.0f, 226.7f, 722.6f, 245.1f, 705.3f, 249.9f)
                curveTo(688.1f, 244.1f, 687.2f, 230.4f, 703.3f, 222.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(641.2f, 153.6f)
                curveTo(660.0f, 159.7f, 658.4f, 169.8f, 647.1f, 182.1f)
                curveTo(629.7f, 174.9f, 625.3f, 167.6f, 641.2f, 153.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(682.4f, 199.9f)
                curveTo(699.5f, 205.3f, 699.0f, 217.6f, 685.1f, 227.1f)
                curveTo(679.9f, 225.1f, 675.1f, 224.1f, 672.7f, 218.6f)
                curveTo(668.4f, 208.7f, 674.0f, 203.6f, 682.4f, 199.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.7f, 443.8f)
                curveTo(221.7f, 443.7f, 228.4f, 446.6f, 230.1f, 448.9f)
                curveTo(236.4f, 457.5f, 228.3f, 465.8f, 222.5f, 470.4f)
                curveTo(221.3f, 470.2f, 220.1f, 469.9f, 218.9f, 469.6f)
                curveTo(211.4f, 467.8f, 207.0f, 461.6f, 209.0f, 453.9f)
                curveTo(210.5f, 448.2f, 214.0f, 446.6f, 218.7f, 443.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(658.4f, 178.6f)
                curveTo(661.9f, 178.7f, 666.9f, 180.8f, 670.4f, 182.0f)
                lineTo(677.5f, 191.5f)
                lineTo(670.5f, 202.8f)
                curveTo(666.0f, 203.1f, 661.6f, 202.7f, 657.1f, 202.3f)
                curveTo(649.9f, 191.8f, 650.0f, 188.3f, 658.4f, 178.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(392.0f, 192.3f)
                curveTo(399.4f, 191.4f, 404.9f, 191.0f, 409.5f, 198.0f)
                curveTo(413.6f, 204.3f, 410.1f, 211.2f, 404.5f, 214.9f)
                curveTo(387.6f, 217.6f, 383.0f, 204.6f, 392.0f, 192.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(721.5f, 247.0f)
                curveTo(727.9f, 245.4f, 733.4f, 257.3f, 736.3f, 262.0f)
                curveTo(733.4f, 265.3f, 730.5f, 268.5f, 727.5f, 271.7f)
                curveTo(716.2f, 264.3f, 702.9f, 256.4f, 721.5f, 247.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(648.2f, 208.4f)
                curveTo(664.9f, 206.3f, 672.2f, 214.9f, 663.6f, 230.4f)
                curveTo(658.8f, 228.8f, 646.8f, 214.2f, 646.4f, 209.7f)
                lineTo(648.2f, 208.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(276.4f, 423.0f)
                curveTo(276.7f, 416.7f, 274.9f, 410.6f, 279.0f, 406.1f)
                curveTo(281.9f, 407.0f, 293.7f, 420.1f, 294.2f, 423.7f)
                curveTo(290.0f, 429.1f, 283.7f, 425.6f, 278.6f, 425.5f)
                lineTo(276.4f, 423.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(301.6f, 427.4f)
                curveTo(304.2f, 430.1f, 306.7f, 433.0f, 309.2f, 435.8f)
                curveTo(307.2f, 442.5f, 306.2f, 444.8f, 302.9f, 451.0f)
                curveTo(300.0f, 448.5f, 293.6f, 442.6f, 290.5f, 440.9f)
                lineTo(291.1f, 440.0f)
                curveTo(292.2f, 439.0f, 298.8f, 430.4f, 301.6f, 427.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(387.5f, 220.0f)
                curveTo(390.5f, 219.9f, 391.0f, 219.8f, 393.6f, 221.2f)
                lineTo(394.1f, 223.3f)
                curveTo(392.4f, 227.7f, 387.4f, 232.6f, 384.1f, 236.2f)
                curveTo(382.6f, 237.9f, 382.5f, 238.0f, 380.5f, 238.8f)
                curveTo(378.1f, 236.5f, 378.0f, 229.3f, 377.6f, 225.5f)
                lineTo(387.5f, 220.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(670.5f, 228.7f)
                curveTo(675.8f, 229.1f, 681.7f, 232.2f, 684.8f, 236.6f)
                lineTo(684.5f, 238.4f)
                lineTo(681.8f, 239.6f)
                curveTo(676.1f, 241.5f, 670.4f, 242.7f, 666.9f, 237.0f)
                curveTo(666.7f, 233.4f, 668.4f, 231.7f, 670.5f, 228.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(618.9f, 143.7f)
                curveTo(620.9f, 144.2f, 623.0f, 144.7f, 625.0f, 145.3f)
                curveTo(628.5f, 146.2f, 633.3f, 147.5f, 635.2f, 150.9f)
                curveTo(634.7f, 153.5f, 634.9f, 152.7f, 632.2f, 154.8f)
                curveTo(630.3f, 156.6f, 629.5f, 157.9f, 626.9f, 158.4f)
                curveTo(620.3f, 156.1f, 618.5f, 150.1f, 618.9f, 143.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(300.9f, 453.3f)
                lineTo(301.6f, 454.4f)
                curveTo(298.4f, 461.8f, 296.3f, 467.5f, 288.9f, 470.7f)
                curveTo(280.8f, 459.4f, 292.3f, 456.0f, 300.9f, 453.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(635.8f, 181.9f)
                curveTo(645.2f, 190.3f, 650.0f, 192.5f, 644.7f, 205.6f)
                lineTo(643.2f, 205.7f)
                curveTo(639.5f, 202.3f, 635.1f, 186.9f, 635.8f, 181.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(427.4f, 185.8f)
                lineTo(429.1f, 186.3f)
                lineTo(429.5f, 187.9f)
                curveTo(427.6f, 192.1f, 422.0f, 198.5f, 418.9f, 202.3f)
                curveTo(410.6f, 196.5f, 419.3f, 187.5f, 427.4f, 185.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(736.2f, 271.3f)
                curveTo(737.2f, 271.5f, 738.7f, 272.1f, 739.6f, 272.4f)
                curveTo(742.9f, 276.8f, 746.7f, 282.7f, 744.3f, 288.1f)
                curveTo(740.7f, 285.2f, 735.8f, 282.1f, 733.9f, 278.1f)
                curveTo(733.5f, 274.0f, 733.6f, 275.3f, 736.2f, 271.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(393.4f, 450.3f)
                curveTo(392.4f, 457.4f, 391.7f, 461.2f, 392.0f, 468.4f)
                curveTo(388.5f, 471.2f, 388.5f, 472.7f, 387.0f, 476.9f)
                curveTo(386.8f, 476.2f, 386.7f, 475.5f, 386.5f, 474.8f)
                curveTo(383.8f, 463.5f, 387.2f, 460.3f, 393.4f, 450.3f)
                close()
            }
        }
        .build()
        return _standardHaruOkumura!!
    }

private var _standardHaruOkumura: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = StandardSenderAvatar.StandardHaruOkumura, contentDescription = "")
    }
}
