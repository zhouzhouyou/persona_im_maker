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

public val StandardSenderAvatar.StandardAlibaba: ImageVector
    get() {
        if (_standardAlibaba != null) {
            return _standardAlibaba!!
        }
        _standardAlibaba = Builder(name = "StandardAlibaba", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 1024.0f, viewportHeight = 1024.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(810.9f, 131.6f)
                lineTo(812.5f, 133.0f)
                curveTo(812.3f, 151.5f, 811.4f, 170.6f, 814.2f, 188.7f)
                curveTo(825.1f, 259.9f, 835.5f, 328.9f, 832.4f, 401.2f)
                curveTo(833.4f, 411.0f, 831.0f, 429.5f, 833.0f, 438.5f)
                curveTo(843.3f, 485.2f, 849.8f, 523.3f, 848.1f, 571.6f)
                curveTo(846.8f, 607.7f, 849.7f, 620.9f, 836.0f, 656.4f)
                curveTo(804.6f, 737.4f, 735.0f, 793.0f, 658.1f, 828.3f)
                curveTo(616.1f, 847.8f, 572.2f, 862.9f, 527.0f, 873.4f)
                curveTo(508.4f, 877.7f, 486.2f, 882.8f, 467.2f, 884.6f)
                curveTo(392.8f, 891.6f, 321.4f, 878.0f, 251.8f, 851.4f)
                curveTo(237.3f, 845.9f, 204.8f, 833.3f, 198.0f, 816.9f)
                curveTo(196.5f, 813.2f, 200.9f, 807.5f, 198.9f, 801.9f)
                curveTo(194.7f, 789.4f, 188.0f, 776.2f, 182.5f, 764.1f)
                curveTo(176.2f, 744.5f, 127.8f, 752.6f, 120.8f, 703.7f)
                curveTo(107.7f, 613.0f, 145.1f, 532.0f, 198.0f, 460.6f)
                curveTo(203.2f, 453.7f, 209.0f, 447.3f, 214.0f, 440.2f)
                curveTo(212.8f, 405.7f, 211.6f, 377.0f, 215.6f, 342.2f)
                curveTo(217.8f, 322.5f, 217.5f, 303.9f, 222.3f, 283.8f)
                curveTo(225.0f, 272.5f, 226.5f, 257.9f, 228.5f, 246.2f)
                curveTo(276.2f, 262.1f, 312.3f, 338.5f, 330.2f, 344.9f)
                curveTo(337.9f, 344.9f, 383.5f, 321.8f, 394.4f, 317.7f)
                curveTo(455.4f, 294.0f, 523.3f, 276.6f, 589.2f, 277.9f)
                curveTo(629.5f, 278.7f, 622.1f, 277.0f, 655.1f, 256.6f)
                curveTo(701.1f, 228.1f, 739.1f, 191.4f, 780.9f, 157.3f)
                curveTo(791.2f, 148.9f, 800.0f, 139.3f, 810.9f, 131.6f)
                close()
                moveTo(794.6f, 266.0f)
                curveTo(796.3f, 274.1f, 797.9f, 280.2f, 800.2f, 288.0f)
                curveTo(799.9f, 280.5f, 799.3f, 273.0f, 798.4f, 265.5f)
                lineTo(794.6f, 266.0f)
                close()
                moveTo(817.8f, 509.2f)
                curveTo(817.8f, 504.2f, 818.5f, 495.2f, 813.7f, 492.4f)
                curveTo(812.4f, 498.9f, 813.8f, 503.9f, 817.8f, 509.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(505.0f, 301.3f)
                curveTo(520.2f, 299.8f, 528.5f, 300.6f, 543.0f, 304.3f)
                curveTo(512.0f, 308.5f, 489.6f, 310.5f, 461.0f, 324.7f)
                curveTo(459.6f, 325.4f, 457.8f, 323.5f, 456.5f, 322.6f)
                curveTo(448.7f, 329.6f, 445.4f, 332.7f, 436.4f, 338.1f)
                curveTo(434.0f, 335.5f, 431.3f, 332.0f, 429.1f, 329.3f)
                curveTo(422.6f, 332.4f, 406.3f, 337.3f, 404.4f, 340.5f)
                curveTo(403.8f, 344.0f, 407.0f, 350.7f, 408.4f, 354.4f)
                curveTo(403.2f, 360.0f, 399.5f, 361.8f, 392.9f, 365.0f)
                curveTo(386.7f, 360.0f, 384.8f, 356.8f, 381.0f, 350.2f)
                curveTo(373.7f, 359.6f, 371.0f, 362.2f, 359.0f, 365.0f)
                curveTo(360.6f, 368.4f, 365.0f, 375.8f, 362.2f, 379.9f)
                curveTo(360.5f, 382.2f, 356.5f, 384.1f, 354.8f, 386.1f)
                curveTo(348.1f, 394.4f, 345.3f, 380.8f, 337.2f, 382.9f)
                curveTo(334.8f, 383.5f, 335.9f, 382.8f, 334.6f, 384.8f)
                curveTo(335.6f, 387.2f, 342.9f, 391.3f, 347.0f, 395.9f)
                lineTo(346.6f, 408.0f)
                curveTo(340.9f, 410.9f, 339.4f, 411.7f, 334.3f, 415.7f)
                curveTo(332.0f, 413.8f, 326.4f, 409.3f, 324.6f, 407.3f)
                curveTo(323.3f, 405.8f, 325.2f, 403.1f, 321.1f, 400.7f)
                curveTo(311.6f, 408.8f, 304.8f, 421.8f, 297.7f, 432.0f)
                curveTo(294.0f, 437.3f, 289.8f, 441.2f, 285.9f, 446.4f)
                lineTo(287.0f, 456.5f)
                curveTo(282.5f, 458.9f, 278.6f, 462.9f, 274.2f, 463.8f)
                curveTo(269.4f, 460.5f, 265.8f, 458.7f, 259.6f, 459.3f)
                lineTo(258.9f, 460.8f)
                curveTo(262.6f, 465.3f, 268.9f, 468.2f, 271.1f, 474.0f)
                curveTo(274.9f, 484.2f, 263.4f, 487.3f, 256.6f, 489.8f)
                curveTo(246.8f, 482.3f, 252.3f, 480.5f, 247.2f, 473.7f)
                curveTo(240.3f, 473.3f, 240.5f, 479.0f, 241.0f, 483.6f)
                curveTo(232.3f, 488.9f, 229.7f, 489.3f, 219.9f, 490.2f)
                lineTo(227.9f, 501.9f)
                curveTo(218.4f, 506.4f, 214.9f, 511.0f, 203.5f, 511.4f)
                curveTo(198.9f, 511.6f, 172.4f, 542.9f, 169.3f, 546.6f)
                curveTo(176.6f, 521.3f, 188.1f, 497.5f, 203.3f, 476.1f)
                curveTo(224.0f, 447.1f, 253.8f, 415.7f, 282.9f, 394.8f)
                curveTo(299.2f, 383.0f, 319.2f, 372.3f, 336.5f, 361.8f)
                curveTo(353.5f, 351.5f, 372.9f, 338.7f, 391.4f, 331.0f)
                curveTo(404.3f, 325.6f, 424.2f, 321.5f, 438.3f, 317.9f)
                curveTo(459.7f, 312.4f, 483.4f, 304.9f, 505.0f, 301.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(623.3f, 671.7f)
                curveTo(626.8f, 672.9f, 668.0f, 730.6f, 677.0f, 740.6f)
                curveTo(668.6f, 749.7f, 642.6f, 767.6f, 632.0f, 774.5f)
                curveTo(620.2f, 781.0f, 609.3f, 788.7f, 597.1f, 795.3f)
                curveTo(596.8f, 747.7f, 591.9f, 709.5f, 623.3f, 671.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(663.5f, 277.9f)
                curveTo(684.1f, 260.7f, 704.9f, 240.3f, 725.7f, 222.6f)
                curveTo(750.4f, 201.7f, 761.0f, 187.9f, 790.7f, 172.1f)
                curveTo(791.1f, 200.3f, 796.7f, 236.8f, 798.4f, 265.5f)
                lineTo(794.6f, 266.0f)
                curveTo(792.5f, 252.5f, 779.3f, 226.1f, 772.9f, 212.5f)
                curveTo(764.9f, 219.1f, 758.5f, 227.2f, 751.6f, 234.5f)
                curveTo(729.2f, 258.1f, 720.8f, 267.5f, 707.2f, 296.4f)
                curveTo(695.3f, 288.7f, 677.1f, 281.5f, 663.5f, 277.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(415.8f, 765.6f)
                curveTo(432.7f, 771.9f, 458.6f, 822.3f, 468.2f, 839.5f)
                curveTo(451.6f, 842.2f, 439.3f, 845.0f, 422.2f, 846.7f)
                curveTo(404.2f, 848.9f, 387.1f, 849.3f, 369.0f, 850.1f)
                curveTo(384.4f, 830.6f, 402.1f, 778.2f, 415.8f, 765.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(509.7f, 752.8f)
                curveTo(524.6f, 752.7f, 568.0f, 792.6f, 579.0f, 804.6f)
                lineTo(549.7f, 816.0f)
                curveTo(532.8f, 822.7f, 513.8f, 829.3f, 496.1f, 833.2f)
                curveTo(495.8f, 815.9f, 495.0f, 796.3f, 496.6f, 779.3f)
                curveTo(497.7f, 767.8f, 500.7f, 759.9f, 509.7f, 752.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(704.7f, 607.1f)
                curveTo(705.9f, 608.5f, 705.5f, 609.1f, 705.0f, 611.5f)
                curveTo(697.5f, 648.7f, 687.7f, 684.1f, 685.4f, 722.1f)
                curveTo(678.6f, 712.5f, 672.3f, 701.8f, 665.1f, 691.6f)
                curveTo(658.8f, 682.6f, 642.9f, 662.6f, 635.3f, 655.3f)
                curveTo(666.4f, 626.4f, 665.3f, 627.1f, 704.7f, 607.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.2f, 418.6f)
                curveTo(234.9f, 399.8f, 232.4f, 376.4f, 232.1f, 357.0f)
                curveTo(231.8f, 331.3f, 233.0f, 307.7f, 234.6f, 282.1f)
                curveTo(242.5f, 288.4f, 257.1f, 297.6f, 266.3f, 304.4f)
                curveTo(265.0f, 308.0f, 264.7f, 308.4f, 262.0f, 311.1f)
                curveTo(261.8f, 330.0f, 263.3f, 357.4f, 269.7f, 374.9f)
                curveTo(258.3f, 389.8f, 246.5f, 404.4f, 234.2f, 418.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(730.1f, 606.4f)
                curveTo(732.4f, 607.1f, 734.4f, 608.2f, 736.2f, 609.8f)
                curveTo(739.1f, 612.3f, 740.8f, 614.8f, 742.9f, 617.9f)
                curveTo(764.7f, 650.8f, 732.3f, 685.1f, 712.1f, 708.4f)
                curveTo(708.7f, 711.9f, 705.0f, 715.2f, 701.3f, 718.4f)
                curveTo(708.5f, 696.2f, 720.1f, 622.1f, 730.1f, 606.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.2f, 775.7f)
                lineTo(385.2f, 775.9f)
                curveTo(385.3f, 778.0f, 358.2f, 830.9f, 354.4f, 838.2f)
                curveTo(351.3f, 830.7f, 348.3f, 824.6f, 344.5f, 817.4f)
                curveTo(338.1f, 804.2f, 329.3f, 792.5f, 322.4f, 778.2f)
                curveTo(336.0f, 776.3f, 369.0f, 776.3f, 384.2f, 775.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(582.4f, 705.9f)
                lineTo(583.4f, 707.0f)
                curveTo(578.6f, 721.4f, 577.1f, 764.3f, 577.9f, 779.6f)
                curveTo(568.9f, 766.7f, 563.3f, 761.5f, 551.0f, 751.8f)
                curveTo(541.9f, 744.5f, 533.2f, 739.5f, 522.3f, 735.6f)
                curveTo(541.7f, 729.4f, 566.9f, 718.9f, 582.4f, 705.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(296.1f, 778.6f)
                curveTo(306.6f, 782.8f, 334.3f, 837.6f, 339.6f, 848.0f)
                curveTo(324.7f, 846.8f, 311.4f, 844.6f, 296.9f, 841.8f)
                curveTo(297.0f, 822.2f, 297.7f, 797.9f, 296.1f, 778.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(484.3f, 748.2f)
                lineTo(485.0f, 748.3f)
                curveTo(485.8f, 750.4f, 483.5f, 755.9f, 482.7f, 758.4f)
                curveTo(476.1f, 778.2f, 477.1f, 796.4f, 478.0f, 817.0f)
                lineTo(465.4f, 796.5f)
                curveTo(458.8f, 785.4f, 448.5f, 771.1f, 441.0f, 759.6f)
                curveTo(455.6f, 756.4f, 470.3f, 753.5f, 484.3f, 748.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.2f, 778.6f)
                curveTo(241.8f, 780.5f, 271.4f, 831.0f, 271.0f, 833.8f)
                curveTo(258.1f, 830.4f, 246.7f, 825.6f, 234.6f, 820.4f)
                curveTo(236.0f, 807.1f, 235.5f, 791.0f, 238.2f, 778.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(772.0f, 413.8f)
                curveTo(776.5f, 413.9f, 782.0f, 417.8f, 785.8f, 420.3f)
                curveTo(785.0f, 428.3f, 783.9f, 431.7f, 781.3f, 439.1f)
                curveTo(796.2f, 438.2f, 809.9f, 445.2f, 796.2f, 460.5f)
                curveTo(792.1f, 457.9f, 780.3f, 440.0f, 775.9f, 434.8f)
                curveTo(771.1f, 429.2f, 766.5f, 423.9f, 761.2f, 418.3f)
                lineTo(772.0f, 413.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(378.7f, 413.8f)
                curveTo(386.6f, 413.1f, 391.3f, 421.3f, 394.6f, 427.2f)
                curveTo(390.1f, 433.5f, 388.9f, 435.1f, 383.1f, 440.3f)
                curveTo(366.1f, 437.6f, 361.3f, 423.2f, 378.7f, 413.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(302.7f, 437.8f)
                curveTo(320.8f, 441.9f, 319.7f, 455.7f, 306.7f, 465.5f)
                curveTo(291.0f, 457.6f, 283.6f, 448.6f, 302.7f, 437.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(333.9f, 438.0f)
                curveTo(340.3f, 438.4f, 342.6f, 441.2f, 346.9f, 445.8f)
                curveTo(346.8f, 450.7f, 346.3f, 455.1f, 345.8f, 460.0f)
                lineTo(335.7f, 463.9f)
                curveTo(334.9f, 464.2f, 333.5f, 464.3f, 332.6f, 464.4f)
                curveTo(324.8f, 460.3f, 322.6f, 453.5f, 325.2f, 444.8f)
                curveTo(326.4f, 440.7f, 330.2f, 439.5f, 333.9f, 438.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(347.5f, 413.6f)
                curveTo(350.1f, 413.6f, 356.1f, 415.3f, 358.1f, 417.0f)
                curveTo(368.5f, 425.7f, 359.6f, 434.3f, 353.5f, 439.4f)
                curveTo(342.7f, 439.5f, 340.8f, 432.9f, 337.5f, 424.3f)
                curveTo(340.5f, 418.7f, 342.0f, 416.9f, 347.5f, 413.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(363.4f, 386.6f)
                curveTo(369.5f, 387.8f, 375.0f, 394.4f, 379.2f, 399.0f)
                curveTo(375.1f, 407.2f, 374.2f, 409.0f, 366.6f, 414.3f)
                curveTo(359.3f, 411.5f, 356.7f, 408.2f, 351.4f, 402.6f)
                curveTo(354.9f, 394.4f, 355.9f, 391.9f, 363.4f, 386.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(318.5f, 412.7f)
                curveTo(336.2f, 416.7f, 333.0f, 431.2f, 321.1f, 440.8f)
                curveTo(305.2f, 439.0f, 305.4f, 421.7f, 318.5f, 412.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(756.0f, 388.1f)
                curveTo(762.6f, 389.0f, 767.9f, 390.0f, 769.9f, 397.2f)
                curveTo(772.4f, 405.8f, 767.4f, 410.2f, 760.3f, 412.8f)
                curveTo(758.4f, 413.2f, 757.4f, 413.1f, 755.5f, 413.0f)
                curveTo(749.7f, 410.2f, 748.1f, 403.2f, 745.7f, 397.2f)
                curveTo(749.6f, 392.9f, 751.0f, 391.3f, 756.0f, 388.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 391.0f)
                curveTo(390.7f, 390.9f, 400.3f, 389.7f, 406.0f, 394.0f)
                curveTo(410.5f, 397.4f, 407.1f, 407.0f, 404.3f, 410.4f)
                curveTo(395.7f, 416.2f, 392.2f, 411.9f, 384.0f, 407.2f)
                lineTo(384.0f, 391.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(363.8f, 437.6f)
                curveTo(374.5f, 439.2f, 387.4f, 455.5f, 368.6f, 460.8f)
                curveTo(347.6f, 460.1f, 347.9f, 447.5f, 363.8f, 437.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(377.6f, 362.6f)
                curveTo(382.9f, 362.8f, 386.9f, 366.8f, 391.1f, 370.0f)
                curveTo(384.7f, 379.0f, 385.7f, 380.9f, 381.7f, 389.3f)
                lineTo(381.4f, 389.8f)
                curveTo(379.1f, 388.3f, 376.7f, 386.7f, 374.4f, 385.1f)
                curveTo(370.1f, 382.1f, 368.4f, 381.1f, 367.5f, 375.7f)
                curveTo(368.4f, 369.3f, 372.7f, 366.6f, 377.6f, 362.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(737.8f, 364.2f)
                curveTo(749.8f, 363.4f, 748.7f, 363.2f, 757.7f, 371.0f)
                curveTo(755.8f, 378.0f, 755.2f, 381.0f, 750.0f, 386.1f)
                curveTo(747.3f, 387.7f, 746.7f, 388.9f, 744.2f, 388.4f)
                curveTo(741.6f, 383.3f, 736.3f, 372.1f, 735.8f, 366.7f)
                lineTo(737.8f, 364.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(202.4f, 760.8f)
                curveTo(229.8f, 769.8f, 219.5f, 767.2f, 220.7f, 791.9f)
                lineTo(220.2f, 792.9f)
                lineTo(218.9f, 792.8f)
                curveTo(215.2f, 785.6f, 203.2f, 766.9f, 202.4f, 760.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(781.4f, 389.3f)
                curveTo(786.9f, 391.4f, 798.4f, 406.5f, 791.9f, 413.1f)
                curveTo(775.8f, 410.8f, 771.3f, 403.7f, 781.4f, 389.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.7f, 462.7f)
                curveTo(293.9f, 464.2f, 299.4f, 470.3f, 303.4f, 474.1f)
                curveTo(299.3f, 475.4f, 292.8f, 476.6f, 288.5f, 477.5f)
                curveTo(285.1f, 478.6f, 283.9f, 478.9f, 280.3f, 479.4f)
                curveTo(277.0f, 477.8f, 277.9f, 478.8f, 276.8f, 475.8f)
                curveTo(278.5f, 468.9f, 283.1f, 466.6f, 288.7f, 462.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(261.1f, 775.1f)
                curveTo(268.3f, 777.2f, 270.7f, 777.1f, 278.0f, 777.2f)
                curveTo(277.9f, 786.8f, 278.5f, 796.3f, 277.9f, 806.1f)
                curveTo(275.2f, 802.1f, 261.7f, 779.0f, 261.1f, 775.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(805.7f, 462.9f)
                lineTo(808.1f, 463.2f)
                curveTo(812.3f, 466.4f, 816.4f, 482.8f, 814.0f, 487.5f)
                lineTo(811.1f, 487.6f)
                curveTo(806.9f, 483.2f, 800.1f, 473.3f, 799.9f, 466.8f)
                curveTo(801.9f, 463.7f, 801.5f, 464.5f, 805.7f, 462.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(266.3f, 304.4f)
                curveTo(276.4f, 312.8f, 285.9f, 321.1f, 292.8f, 332.5f)
                curveTo(283.9f, 327.7f, 267.1f, 312.2f, 262.0f, 311.1f)
                curveTo(264.7f, 308.4f, 265.0f, 308.0f, 266.3f, 304.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(795.9f, 416.4f)
                curveTo(801.7f, 418.4f, 806.8f, 434.8f, 803.6f, 440.5f)
                curveTo(802.9f, 440.2f, 802.2f, 439.9f, 801.5f, 439.6f)
                curveTo(790.4f, 435.0f, 791.9f, 425.7f, 795.9f, 416.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(719.3f, 345.8f)
                curveTo(725.8f, 346.1f, 737.7f, 347.8f, 740.2f, 354.7f)
                lineTo(737.9f, 357.6f)
                lineTo(735.5f, 361.2f)
                curveTo(728.8f, 364.7f, 722.7f, 351.2f, 719.3f, 345.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(415.7f, 391.0f)
                curveTo(422.4f, 391.1f, 428.2f, 392.3f, 434.8f, 393.4f)
                lineTo(423.4f, 402.2f)
                lineTo(414.8f, 412.0f)
                curveTo(414.8f, 404.4f, 414.9f, 398.5f, 415.7f, 391.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(763.3f, 369.4f)
                curveTo(766.6f, 370.6f, 776.3f, 379.5f, 777.6f, 383.2f)
                curveTo(778.4f, 385.4f, 777.6f, 386.1f, 776.8f, 388.5f)
                curveTo(770.9f, 388.5f, 765.9f, 384.6f, 760.7f, 381.7f)
                curveTo(761.5f, 377.6f, 762.4f, 373.4f, 763.3f, 369.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(424.7f, 336.7f)
                curveTo(428.5f, 337.4f, 427.7f, 336.7f, 430.0f, 339.1f)
                lineTo(429.4f, 341.2f)
                curveTo(426.2f, 344.9f, 421.7f, 347.0f, 417.4f, 349.4f)
                lineTo(414.8f, 350.4f)
                lineTo(414.2f, 349.2f)
                curveTo(415.9f, 343.0f, 419.5f, 339.9f, 424.7f, 336.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.7f, 489.0f)
                curveTo(246.0f, 488.5f, 246.6f, 488.3f, 249.7f, 489.7f)
                lineTo(250.1f, 491.2f)
                curveTo(247.9f, 494.5f, 245.1f, 494.8f, 241.3f, 495.9f)
                curveTo(237.2f, 497.2f, 237.8f, 497.8f, 234.9f, 496.3f)
                lineTo(235.1f, 494.4f)
                curveTo(237.1f, 490.9f, 239.0f, 490.5f, 242.7f, 489.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(317.9f, 462.8f)
                curveTo(320.7f, 463.3f, 323.8f, 463.7f, 325.2f, 466.3f)
                curveTo(323.3f, 468.7f, 319.5f, 469.4f, 316.4f, 470.3f)
                curveTo(313.6f, 471.7f, 313.4f, 472.4f, 310.6f, 472.0f)
                lineTo(310.7f, 470.0f)
                curveTo(313.3f, 466.0f, 313.9f, 465.5f, 317.9f, 462.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCFCFC)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(408.2f, 413.1f)
                curveTo(408.7f, 413.5f, 409.3f, 414.4f, 409.7f, 415.0f)
                curveTo(408.9f, 418.7f, 404.7f, 423.2f, 402.2f, 426.3f)
                lineTo(400.7f, 425.3f)
                curveTo(399.3f, 421.4f, 399.3f, 422.9f, 399.9f, 419.3f)
                curveTo(402.1f, 415.9f, 404.6f, 415.0f, 408.2f, 413.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, fillAlpha = 0.984314f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(798.4f, 265.5f)
                curveTo(799.3f, 273.0f, 799.9f, 280.5f, 800.2f, 288.0f)
                curveTo(797.9f, 280.2f, 796.3f, 274.1f, 794.6f, 266.0f)
                lineTo(798.4f, 265.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfcfcfc)), stroke = null, fillAlpha = 0.984314f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(813.7f, 492.4f)
                curveTo(818.5f, 495.2f, 817.8f, 504.2f, 817.8f, 509.2f)
                curveTo(813.8f, 503.9f, 812.4f, 498.9f, 813.7f, 492.4f)
                close()
            }
        }
        .build()
        return _standardAlibaba!!
    }

private var _standardAlibaba: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = StandardSenderAvatar.StandardAlibaba, contentDescription = "")
    }
}
