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

public val StandardSenderAvatar.StandardGoroAkechi: ImageVector
    get() {
        if (_standardGoroAkechi != null) {
            return _standardGoroAkechi!!
        }
        _standardGoroAkechi = Builder(name = "StandardGoroAkechi", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 1024.0f, viewportHeight = 1024.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.2f, 584.9f)
                curveTo(221.3f, 573.7f, 235.7f, 545.3f, 238.4f, 535.8f)
                curveTo(245.0f, 511.8f, 262.0f, 449.8f, 252.7f, 427.2f)
                curveTo(239.8f, 396.2f, 238.6f, 399.1f, 243.6f, 362.2f)
                curveTo(248.9f, 323.1f, 255.7f, 283.6f, 271.9f, 246.9f)
                curveTo(283.6f, 220.4f, 302.7f, 201.8f, 321.6f, 181.0f)
                curveTo(339.9f, 160.8f, 357.0f, 147.0f, 378.0f, 130.1f)
                curveTo(397.9f, 114.2f, 405.3f, 104.7f, 430.9f, 96.8f)
                curveTo(447.9f, 91.6f, 464.3f, 86.7f, 482.1f, 83.8f)
                curveTo(536.5f, 71.3f, 577.0f, 75.1f, 630.0f, 91.7f)
                curveTo(642.4f, 95.6f, 664.8f, 98.9f, 676.4f, 105.3f)
                curveTo(691.4f, 113.9f, 713.1f, 122.5f, 727.0f, 132.1f)
                curveTo(755.1f, 151.4f, 788.6f, 186.4f, 799.2f, 219.8f)
                curveTo(808.3f, 248.5f, 811.2f, 287.5f, 819.0f, 317.4f)
                curveTo(823.0f, 332.5f, 827.4f, 347.1f, 831.7f, 362.1f)
                curveTo(840.0f, 397.8f, 847.5f, 432.1f, 858.3f, 467.3f)
                curveTo(862.8f, 482.1f, 863.6f, 511.5f, 864.0f, 527.5f)
                curveTo(859.5f, 554.9f, 836.1f, 588.2f, 832.6f, 617.4f)
                curveTo(832.2f, 620.4f, 835.7f, 628.3f, 836.0f, 631.5f)
                curveTo(835.9f, 635.0f, 836.3f, 640.4f, 834.5f, 643.3f)
                curveTo(831.0f, 644.5f, 825.0f, 641.0f, 818.7f, 642.2f)
                curveTo(815.7f, 640.0f, 814.7f, 639.7f, 811.3f, 640.6f)
                curveTo(800.0f, 651.6f, 793.4f, 662.5f, 791.2f, 678.8f)
                curveTo(788.4f, 700.5f, 811.0f, 735.6f, 824.6f, 752.3f)
                curveTo(808.4f, 747.2f, 795.8f, 748.9f, 779.8f, 742.5f)
                curveTo(784.5f, 756.1f, 791.2f, 777.9f, 795.2f, 791.6f)
                curveTo(814.8f, 807.0f, 822.5f, 816.1f, 839.1f, 833.2f)
                curveTo(866.9f, 862.0f, 895.9f, 891.4f, 924.0f, 919.7f)
                curveTo(956.9f, 952.8f, 977.7f, 962.7f, 976.7f, 1014.8f)
                curveTo(959.3f, 1015.9f, 936.2f, 1014.9f, 918.2f, 1014.7f)
                lineTo(785.1f, 1012.3f)
                lineTo(349.3f, 1007.4f)
                curveTo(315.9f, 1007.2f, 282.5f, 1006.8f, 249.1f, 1006.2f)
                curveTo(238.8f, 1005.9f, 210.0f, 1003.5f, 201.3f, 1005.4f)
                lineTo(200.8f, 1004.1f)
                curveTo(203.7f, 996.8f, 226.0f, 977.1f, 233.5f, 968.9f)
                curveTo(232.5f, 955.6f, 230.0f, 941.5f, 229.1f, 928.1f)
                curveTo(228.0f, 911.2f, 228.7f, 893.6f, 230.4f, 876.7f)
                curveTo(236.6f, 871.3f, 244.9f, 864.5f, 248.9f, 857.8f)
                curveTo(259.7f, 839.8f, 261.3f, 825.8f, 278.9f, 812.4f)
                curveTo(304.6f, 792.8f, 315.3f, 785.2f, 347.7f, 780.5f)
                curveTo(355.9f, 779.3f, 363.1f, 776.1f, 373.6f, 775.8f)
                curveTo(383.5f, 775.2f, 397.9f, 781.0f, 406.9f, 776.1f)
                curveTo(419.7f, 769.0f, 408.2f, 750.0f, 397.8f, 747.7f)
                curveTo(390.6f, 746.0f, 378.3f, 756.7f, 372.0f, 760.5f)
                curveTo(359.7f, 768.1f, 353.8f, 766.0f, 340.4f, 765.2f)
                curveTo(336.6f, 765.1f, 336.0f, 767.2f, 332.0f, 766.3f)
                curveTo(327.8f, 756.0f, 351.7f, 738.1f, 348.1f, 721.5f)
                curveTo(344.7f, 705.4f, 334.2f, 698.8f, 326.8f, 684.6f)
                curveTo(324.0f, 679.3f, 321.7f, 667.4f, 317.9f, 664.4f)
                curveTo(313.0f, 665.9f, 314.1f, 672.3f, 309.3f, 674.4f)
                curveTo(304.8f, 671.9f, 299.6f, 653.7f, 296.3f, 648.2f)
                curveTo(294.0f, 644.4f, 292.5f, 642.2f, 289.7f, 638.7f)
                curveTo(292.1f, 650.4f, 291.7f, 661.8f, 292.5f, 673.8f)
                curveTo(293.6f, 690.5f, 297.8f, 706.1f, 303.9f, 721.7f)
                curveTo(287.3f, 708.4f, 266.7f, 696.8f, 252.8f, 682.0f)
                curveTo(227.5f, 655.1f, 236.7f, 618.1f, 239.0f, 585.3f)
                curveTo(239.2f, 582.4f, 239.2f, 580.8f, 237.3f, 578.8f)
                lineTo(235.3f, 580.5f)
                curveTo(221.3f, 582.1f, 223.5f, 590.5f, 216.6f, 590.3f)
                curveTo(216.4f, 588.5f, 216.3f, 586.7f, 216.2f, 584.9f)
                close()
                moveTo(781.6f, 300.4f)
                curveTo(784.4f, 296.1f, 783.3f, 284.8f, 782.7f, 279.6f)
                lineTo(781.5f, 277.8f)
                curveTo(780.1f, 284.9f, 779.2f, 290.7f, 779.7f, 298.1f)
                lineTo(781.6f, 300.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(521.7f, 361.6f)
                lineTo(524.5f, 361.3f)
                curveTo(521.5f, 367.5f, 507.3f, 365.3f, 504.1f, 371.6f)
                curveTo(506.0f, 374.2f, 509.1f, 372.8f, 511.2f, 375.3f)
                curveTo(508.0f, 379.8f, 498.2f, 381.6f, 495.2f, 387.0f)
                curveTo(493.3f, 390.3f, 488.8f, 396.4f, 492.1f, 399.7f)
                curveTo(495.5f, 399.0f, 500.0f, 393.9f, 506.0f, 391.0f)
                curveTo(504.4f, 398.4f, 494.7f, 421.1f, 500.6f, 424.9f)
                lineTo(502.7f, 424.1f)
                curveTo(519.3f, 404.9f, 500.6f, 396.9f, 536.9f, 382.7f)
                curveTo(531.5f, 391.1f, 527.5f, 398.5f, 528.9f, 408.7f)
                curveTo(529.8f, 415.7f, 529.8f, 424.0f, 535.0f, 429.0f)
                curveTo(549.8f, 436.2f, 592.7f, 416.8f, 602.4f, 403.6f)
                curveTo(601.9f, 399.4f, 600.3f, 403.2f, 598.1f, 399.1f)
                curveTo(599.7f, 395.2f, 609.1f, 382.2f, 612.3f, 377.0f)
                curveTo(622.2f, 399.5f, 622.0f, 403.9f, 618.1f, 428.2f)
                curveTo(613.6f, 456.0f, 604.7f, 471.7f, 585.1f, 492.0f)
                curveTo(596.4f, 487.5f, 601.2f, 486.7f, 613.3f, 484.8f)
                curveTo(612.0f, 509.2f, 606.3f, 526.0f, 596.9f, 547.8f)
                curveTo(606.0f, 541.6f, 642.7f, 527.1f, 655.3f, 521.7f)
                curveTo(653.3f, 543.0f, 650.1f, 572.9f, 640.9f, 592.8f)
                curveTo(638.3f, 598.4f, 626.1f, 607.8f, 624.7f, 613.8f)
                curveTo(627.4f, 614.5f, 640.9f, 611.1f, 644.7f, 610.4f)
                lineTo(645.2f, 623.9f)
                curveTo(623.2f, 639.8f, 604.2f, 648.6f, 582.0f, 662.6f)
                curveTo(559.8f, 677.4f, 537.5f, 691.9f, 514.4f, 705.3f)
                curveTo(495.3f, 716.4f, 485.5f, 726.5f, 462.6f, 726.1f)
                curveTo(453.6f, 725.1f, 448.4f, 724.5f, 439.7f, 722.3f)
                curveTo(435.2f, 717.8f, 413.5f, 681.3f, 406.4f, 670.8f)
                curveTo(389.7f, 646.1f, 364.2f, 621.2f, 351.7f, 596.3f)
                curveTo(343.3f, 579.5f, 335.0f, 544.3f, 330.0f, 525.2f)
                curveTo(338.6f, 533.9f, 348.7f, 541.7f, 358.6f, 548.8f)
                curveTo(356.0f, 541.6f, 350.5f, 536.1f, 347.2f, 528.2f)
                lineTo(347.9f, 526.8f)
                curveTo(350.9f, 527.1f, 353.5f, 527.4f, 356.5f, 527.8f)
                lineTo(357.7f, 526.8f)
                curveTo(356.8f, 522.2f, 351.3f, 517.4f, 347.6f, 514.8f)
                curveTo(345.8f, 499.8f, 342.5f, 490.8f, 338.2f, 477.1f)
                lineTo(339.3f, 476.5f)
                curveTo(343.9f, 479.8f, 348.3f, 482.5f, 353.0f, 485.5f)
                lineTo(339.9f, 463.7f)
                curveTo(341.4f, 457.7f, 342.1f, 451.4f, 343.0f, 445.2f)
                curveTo(348.3f, 459.8f, 353.1f, 457.4f, 360.8f, 469.8f)
                curveTo(361.5f, 470.9f, 359.0f, 475.7f, 359.5f, 479.5f)
                curveTo(361.3f, 479.3f, 377.5f, 472.1f, 381.8f, 470.6f)
                curveTo(388.0f, 477.9f, 399.0f, 488.7f, 405.9f, 495.9f)
                curveTo(404.9f, 484.9f, 405.9f, 469.4f, 406.4f, 458.1f)
                curveTo(414.9f, 469.3f, 432.0f, 475.7f, 444.9f, 481.7f)
                curveTo(434.8f, 469.2f, 430.2f, 466.1f, 422.4f, 450.7f)
                curveTo(432.7f, 458.7f, 444.4f, 463.7f, 454.9f, 471.1f)
                curveTo(463.1f, 476.9f, 470.9f, 488.2f, 477.2f, 496.5f)
                curveTo(474.1f, 487.8f, 473.6f, 478.9f, 471.5f, 470.1f)
                curveTo(470.1f, 463.6f, 468.1f, 457.2f, 466.6f, 450.6f)
                lineTo(467.4f, 449.6f)
                lineTo(471.5f, 452.9f)
                curveTo(472.7f, 450.9f, 466.6f, 429.9f, 465.8f, 425.0f)
                curveTo(464.1f, 414.1f, 463.9f, 409.3f, 464.3f, 398.3f)
                curveTo(469.2f, 405.2f, 479.9f, 422.6f, 489.5f, 420.9f)
                lineTo(489.6f, 419.4f)
                curveTo(480.4f, 407.6f, 479.1f, 398.0f, 475.8f, 384.1f)
                curveTo(476.6f, 383.1f, 477.4f, 382.2f, 478.3f, 381.3f)
                curveTo(493.7f, 364.6f, 499.5f, 362.5f, 521.7f, 361.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(403.4f, 511.6f)
                curveTo(408.9f, 528.9f, 393.7f, 544.6f, 407.5f, 568.5f)
                curveTo(412.0f, 570.5f, 416.0f, 572.1f, 419.7f, 575.4f)
                curveTo(420.2f, 577.1f, 415.1f, 590.8f, 414.3f, 591.8f)
                lineTo(411.7f, 591.6f)
                curveTo(405.3f, 588.1f, 399.9f, 585.0f, 392.5f, 583.9f)
                curveTo(389.3f, 574.1f, 387.7f, 568.6f, 390.2f, 558.1f)
                curveTo(393.9f, 542.4f, 400.4f, 527.6f, 403.4f, 511.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(500.9f, 605.5f)
                curveTo(503.5f, 605.4f, 507.1f, 604.7f, 509.0f, 606.0f)
                curveTo(506.4f, 607.8f, 494.9f, 609.1f, 490.7f, 610.4f)
                curveTo(456.9f, 620.9f, 453.6f, 623.3f, 418.8f, 621.0f)
                curveTo(414.9f, 620.3f, 415.5f, 621.0f, 412.9f, 618.7f)
                lineTo(413.9f, 617.2f)
                curveTo(437.2f, 605.9f, 441.7f, 605.0f, 468.2f, 606.9f)
                curveTo(475.6f, 607.4f, 492.7f, 606.2f, 500.9f, 605.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(457.1f, 641.4f)
                curveTo(462.4f, 640.1f, 465.5f, 640.5f, 468.2f, 645.1f)
                curveTo(468.8f, 654.8f, 458.1f, 666.0f, 448.3f, 666.5f)
                curveTo(442.5f, 663.7f, 429.7f, 655.7f, 436.3f, 648.0f)
                curveTo(441.1f, 642.4f, 450.2f, 642.2f, 457.1f, 641.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.0f, 562.2f)
                curveTo(437.3f, 564.5f, 441.8f, 565.3f, 447.4f, 566.8f)
                lineTo(448.1f, 568.4f)
                lineTo(446.5f, 570.2f)
                curveTo(443.1f, 571.6f, 436.9f, 573.3f, 433.2f, 574.4f)
                lineTo(432.0f, 562.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(641.0f, 175.7f)
                curveTo(646.7f, 179.8f, 653.0f, 199.2f, 671.8f, 212.0f)
                curveTo(670.1f, 216.3f, 668.2f, 220.3f, 668.0f, 225.0f)
                curveTo(670.4f, 227.3f, 671.6f, 223.1f, 677.6f, 223.9f)
                curveTo(681.5f, 226.4f, 685.3f, 233.9f, 687.9f, 238.3f)
                curveTo(685.5f, 241.0f, 678.6f, 248.0f, 679.1f, 251.4f)
                curveTo(697.1f, 248.0f, 699.7f, 251.6f, 699.1f, 269.4f)
                curveTo(692.6f, 272.5f, 686.5f, 275.9f, 689.6f, 284.0f)
                curveTo(694.2f, 283.2f, 696.9f, 274.7f, 705.9f, 276.6f)
                curveTo(716.6f, 278.7f, 716.3f, 294.2f, 720.3f, 298.8f)
                curveTo(735.9f, 316.8f, 744.5f, 340.4f, 758.0f, 359.4f)
                curveTo(757.9f, 365.8f, 758.2f, 369.5f, 758.8f, 375.9f)
                curveTo(763.9f, 379.3f, 769.0f, 382.8f, 774.0f, 386.4f)
                curveTo(773.8f, 401.2f, 768.5f, 398.8f, 765.2f, 411.4f)
                curveTo(762.7f, 420.7f, 761.9f, 434.5f, 760.8f, 444.3f)
                curveTo(756.4f, 433.5f, 754.8f, 420.6f, 750.7f, 409.4f)
                curveTo(745.3f, 394.5f, 735.0f, 381.7f, 733.0f, 365.8f)
                curveTo(729.7f, 380.7f, 725.9f, 398.2f, 724.5f, 413.4f)
                curveTo(721.3f, 414.3f, 711.2f, 386.1f, 709.7f, 382.4f)
                curveTo(700.3f, 359.3f, 695.2f, 345.1f, 676.1f, 328.3f)
                curveTo(678.4f, 361.2f, 674.0f, 368.6f, 662.3f, 396.7f)
                curveTo(662.8f, 390.3f, 664.8f, 381.8f, 664.4f, 375.6f)
                curveTo(663.1f, 352.8f, 652.3f, 327.0f, 644.8f, 305.7f)
                curveTo(639.4f, 305.7f, 633.5f, 305.3f, 628.1f, 305.0f)
                curveTo(626.1f, 277.4f, 622.0f, 255.2f, 618.5f, 228.0f)
                curveTo(637.3f, 242.8f, 643.7f, 268.6f, 652.4f, 291.4f)
                curveTo(652.3f, 278.6f, 652.0f, 263.6f, 650.2f, 250.9f)
                curveTo(646.6f, 226.5f, 640.7f, 200.5f, 641.0f, 175.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(398.0f, 145.0f)
                lineTo(398.9f, 146.4f)
                curveTo(397.6f, 150.5f, 372.8f, 180.7f, 368.3f, 187.6f)
                curveTo(368.0f, 191.7f, 368.1f, 197.0f, 368.1f, 201.2f)
                curveTo(363.5f, 204.0f, 353.7f, 208.9f, 353.2f, 214.5f)
                curveTo(355.0f, 218.0f, 356.0f, 217.9f, 359.8f, 220.4f)
                curveTo(362.4f, 219.5f, 359.4f, 212.9f, 365.2f, 207.6f)
                curveTo(373.9f, 204.2f, 382.9f, 216.5f, 387.2f, 222.6f)
                curveTo(389.5f, 214.6f, 393.4f, 206.5f, 403.1f, 206.5f)
                curveTo(412.0f, 211.7f, 401.3f, 226.7f, 398.0f, 232.6f)
                curveTo(391.9f, 229.1f, 391.7f, 227.4f, 387.1f, 224.5f)
                lineTo(384.9f, 225.4f)
                curveTo(383.2f, 227.9f, 382.1f, 229.0f, 382.4f, 232.0f)
                curveTo(384.8f, 234.8f, 390.3f, 235.6f, 394.4f, 236.9f)
                curveTo(392.8f, 242.5f, 390.3f, 253.2f, 386.4f, 256.7f)
                curveTo(381.0f, 261.6f, 380.3f, 254.8f, 373.6f, 254.4f)
                curveTo(371.6f, 256.1f, 372.1f, 255.3f, 371.3f, 257.5f)
                curveTo(378.4f, 263.2f, 388.5f, 268.8f, 379.8f, 280.6f)
                curveTo(376.9f, 284.5f, 366.3f, 283.3f, 361.4f, 283.3f)
                lineTo(360.3f, 284.4f)
                curveTo(366.3f, 294.8f, 367.4f, 288.5f, 368.2f, 303.0f)
                curveTo(367.2f, 304.1f, 366.1f, 305.2f, 365.0f, 306.2f)
                curveTo(359.8f, 311.0f, 355.8f, 310.1f, 348.9f, 309.8f)
                curveTo(346.5f, 316.7f, 341.5f, 330.0f, 338.1f, 335.9f)
                curveTo(338.3f, 336.0f, 331.7f, 330.4f, 330.9f, 329.4f)
                curveTo(325.6f, 322.6f, 333.9f, 313.9f, 337.4f, 311.1f)
                curveTo(334.6f, 309.6f, 322.6f, 309.2f, 318.4f, 308.9f)
                curveTo(323.1f, 316.4f, 325.1f, 323.2f, 322.0f, 332.7f)
                curveTo(321.4f, 334.8f, 319.1f, 335.0f, 317.2f, 335.3f)
                curveTo(313.6f, 332.4f, 309.8f, 329.6f, 306.1f, 326.7f)
                curveTo(304.2f, 337.4f, 296.1f, 350.1f, 293.0f, 360.7f)
                curveTo(288.9f, 374.6f, 285.9f, 389.0f, 282.3f, 403.1f)
                curveTo(277.0f, 372.6f, 274.9f, 369.4f, 280.0f, 339.3f)
                curveTo(286.6f, 293.6f, 300.8f, 260.0f, 323.5f, 220.6f)
                curveTo(347.3f, 179.4f, 359.8f, 171.7f, 398.0f, 145.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(701.5f, 432.3f)
                curveTo(715.0f, 436.7f, 724.6f, 468.4f, 727.9f, 480.6f)
                curveTo(721.8f, 493.7f, 708.4f, 518.3f, 697.4f, 527.2f)
                curveTo(692.3f, 531.2f, 686.2f, 534.9f, 680.5f, 538.4f)
                curveTo(681.4f, 527.1f, 680.2f, 510.3f, 683.1f, 499.6f)
                curveTo(690.6f, 472.2f, 700.0f, 461.9f, 701.5f, 432.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(597.6f, 672.9f)
                curveTo(604.2f, 675.0f, 610.8f, 677.2f, 617.3f, 679.4f)
                curveTo(581.0f, 699.5f, 552.6f, 712.6f, 514.1f, 729.1f)
                curveTo(508.9f, 738.9f, 503.5f, 763.7f, 499.1f, 776.7f)
                curveTo(498.3f, 779.3f, 498.1f, 781.5f, 496.0f, 783.1f)
                curveTo(493.7f, 780.9f, 487.0f, 738.0f, 486.6f, 732.1f)
                curveTo(516.3f, 723.5f, 567.6f, 686.2f, 597.6f, 672.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(478.9f, 319.8f)
                curveTo(493.6f, 338.0f, 493.3f, 338.5f, 510.8f, 353.3f)
                curveTo(508.2f, 354.8f, 504.9f, 354.9f, 501.8f, 355.2f)
                curveTo(490.7f, 356.5f, 484.4f, 358.1f, 474.7f, 363.4f)
                curveTo(474.8f, 348.7f, 476.2f, 334.1f, 478.9f, 319.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(776.0f, 352.8f)
                curveTo(789.7f, 352.3f, 794.5f, 372.2f, 778.6f, 377.9f)
                curveTo(777.8f, 377.7f, 777.1f, 377.5f, 776.3f, 377.3f)
                curveTo(758.7f, 372.5f, 760.9f, 360.4f, 776.0f, 352.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(756.5f, 329.3f)
                curveTo(762.9f, 328.8f, 768.5f, 328.1f, 772.4f, 334.7f)
                curveTo(776.5f, 341.5f, 773.0f, 347.8f, 766.8f, 351.6f)
                curveTo(755.3f, 354.4f, 749.4f, 348.3f, 750.8f, 335.9f)
                curveTo(751.2f, 332.2f, 753.5f, 331.2f, 756.5f, 329.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(727.9f, 278.0f)
                curveTo(731.9f, 276.2f, 736.5f, 276.7f, 739.9f, 279.4f)
                curveTo(743.3f, 282.0f, 745.0f, 286.4f, 744.3f, 290.6f)
                curveTo(743.6f, 294.9f, 740.6f, 298.4f, 736.5f, 299.8f)
                curveTo(730.5f, 301.8f, 724.1f, 298.8f, 721.8f, 293.0f)
                curveTo(719.5f, 287.1f, 722.2f, 280.5f, 727.9f, 278.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(744.8f, 301.8f)
                curveTo(748.6f, 301.1f, 753.5f, 304.3f, 757.0f, 306.1f)
                curveTo(757.6f, 310.0f, 757.9f, 314.6f, 758.2f, 318.5f)
                curveTo(754.0f, 322.6f, 752.6f, 323.6f, 747.7f, 326.7f)
                curveTo(736.3f, 326.4f, 728.4f, 309.8f, 744.8f, 301.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(370.8f, 310.0f)
                curveTo(386.3f, 315.5f, 386.9f, 328.6f, 371.7f, 336.7f)
                curveTo(364.5f, 336.2f, 358.0f, 323.5f, 361.5f, 317.0f)
                curveTo(363.9f, 312.4f, 366.6f, 312.0f, 370.8f, 310.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(771.6f, 303.1f)
                curveTo(785.1f, 302.0f, 785.5f, 304.2f, 789.0f, 316.1f)
                curveTo(786.5f, 319.8f, 784.4f, 323.1f, 781.2f, 326.3f)
                curveTo(767.2f, 325.7f, 757.7f, 313.6f, 771.6f, 303.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(719.0f, 250.0f)
                curveTo(729.8f, 250.3f, 736.1f, 268.5f, 717.5f, 274.5f)
                curveTo(701.9f, 269.7f, 703.0f, 254.6f, 719.0f, 250.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(760.5f, 277.2f)
                curveTo(767.1f, 277.5f, 771.6f, 279.6f, 773.7f, 286.4f)
                curveTo(774.6f, 289.3f, 774.2f, 292.4f, 772.7f, 295.1f)
                curveTo(770.7f, 298.4f, 769.3f, 297.9f, 765.4f, 298.8f)
                curveTo(752.5f, 299.2f, 746.9f, 293.3f, 752.9f, 280.0f)
                curveTo(754.0f, 277.6f, 757.9f, 277.6f, 760.5f, 277.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(759.1f, 223.6f)
                curveTo(765.6f, 224.3f, 770.5f, 237.2f, 773.0f, 242.4f)
                curveTo(770.3f, 244.9f, 767.2f, 247.6f, 764.4f, 250.0f)
                curveTo(747.1f, 247.1f, 748.1f, 233.5f, 759.1f, 223.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(390.8f, 185.4f)
                curveTo(405.5f, 191.5f, 396.6f, 204.7f, 385.3f, 207.5f)
                curveTo(382.4f, 208.2f, 381.4f, 206.7f, 379.4f, 205.0f)
                curveTo(378.8f, 204.6f, 378.3f, 204.2f, 377.8f, 203.7f)
                curveTo(372.9f, 199.5f, 370.8f, 191.9f, 375.2f, 186.8f)
                curveTo(380.8f, 187.6f, 383.6f, 194.1f, 387.7f, 193.5f)
                lineTo(390.8f, 185.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(700.1f, 224.2f)
                curveTo(711.7f, 229.1f, 722.2f, 240.0f, 706.9f, 248.8f)
                curveTo(705.5f, 249.3f, 703.9f, 249.4f, 702.5f, 249.7f)
                curveTo(698.9f, 248.7f, 696.4f, 245.2f, 693.9f, 242.5f)
                curveTo(697.8f, 235.9f, 698.7f, 231.4f, 700.1f, 224.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(791.0f, 328.1f)
                lineTo(792.3f, 328.6f)
                curveTo(795.9f, 335.7f, 797.7f, 346.5f, 791.5f, 352.5f)
                lineTo(787.9f, 352.4f)
                curveTo(773.1f, 345.9f, 774.6f, 332.9f, 791.0f, 328.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(412.3f, 183.1f)
                lineTo(417.7f, 182.9f)
                curveTo(424.9f, 186.8f, 415.8f, 200.1f, 412.9f, 206.4f)
                curveTo(410.3f, 204.7f, 406.2f, 202.9f, 403.3f, 201.6f)
                curveTo(404.3f, 192.1f, 402.8f, 186.8f, 412.3f, 183.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(775.3f, 249.7f)
                curveTo(777.4f, 251.9f, 782.1f, 268.5f, 782.3f, 272.4f)
                curveTo(779.8f, 273.8f, 775.6f, 273.0f, 772.3f, 272.9f)
                curveTo(758.6f, 266.7f, 765.7f, 255.6f, 775.3f, 249.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(333.8f, 422.2f)
                curveTo(342.3f, 421.6f, 349.2f, 422.2f, 357.6f, 423.1f)
                curveTo(345.8f, 426.3f, 334.9f, 425.3f, 330.4f, 439.3f)
                curveTo(330.1f, 442.6f, 330.0f, 445.7f, 327.8f, 447.6f)
                curveTo(325.0f, 445.4f, 322.0f, 436.8f, 320.5f, 433.0f)
                curveTo(325.9f, 427.5f, 327.4f, 426.4f, 333.8f, 422.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(386.1f, 286.0f)
                lineTo(388.2f, 286.7f)
                curveTo(390.0f, 291.2f, 386.8f, 304.1f, 384.8f, 308.6f)
                curveTo(384.0f, 310.2f, 381.3f, 309.9f, 379.7f, 310.0f)
                curveTo(368.6f, 297.4f, 373.0f, 291.9f, 386.1f, 286.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(777.8f, 405.4f)
                curveTo(790.5f, 404.7f, 783.6f, 425.6f, 781.9f, 426.8f)
                lineTo(780.2f, 425.5f)
                curveTo(776.7f, 421.1f, 768.8f, 412.9f, 769.8f, 407.5f)
                curveTo(772.8f, 404.9f, 773.0f, 405.7f, 777.8f, 405.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(742.8f, 198.6f)
                curveTo(747.2f, 200.7f, 756.4f, 207.9f, 757.5f, 213.0f)
                curveTo(758.0f, 215.6f, 756.4f, 217.8f, 755.0f, 219.9f)
                curveTo(753.4f, 221.3f, 752.6f, 221.8f, 750.8f, 223.0f)
                lineTo(748.5f, 222.5f)
                curveTo(744.0f, 218.6f, 743.5f, 205.1f, 742.8f, 198.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(549.8f, 355.3f)
                curveTo(554.1f, 355.4f, 559.2f, 355.1f, 563.6f, 355.0f)
                curveTo(566.0f, 358.6f, 569.8f, 363.4f, 569.7f, 367.6f)
                curveTo(561.4f, 366.7f, 549.2f, 365.7f, 549.8f, 355.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(786.7f, 378.5f)
                curveTo(787.5f, 379.2f, 787.7f, 379.7f, 788.4f, 380.6f)
                curveTo(788.5f, 385.5f, 788.4f, 398.5f, 786.4f, 402.6f)
                lineTo(785.5f, 401.6f)
                curveTo(773.2f, 393.5f, 779.7f, 387.7f, 786.7f, 378.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(408.3f, 161.6f)
                curveTo(414.0f, 172.4f, 409.4f, 181.6f, 396.3f, 181.3f)
                lineTo(395.7f, 179.3f)
                curveTo(400.3f, 173.2f, 404.2f, 168.0f, 408.3f, 161.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(332.1f, 336.2f)
                curveTo(333.5f, 336.5f, 333.9f, 336.8f, 335.2f, 337.4f)
                curveTo(335.3f, 341.0f, 335.7f, 348.9f, 333.7f, 351.4f)
                lineTo(331.5f, 350.8f)
                curveTo(327.3f, 347.7f, 322.4f, 345.0f, 323.0f, 339.5f)
                curveTo(325.2f, 336.8f, 328.5f, 336.8f, 332.1f, 336.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(751.3f, 272.9f)
                curveTo(740.9f, 279.0f, 732.3f, 265.2f, 738.6f, 259.0f)
                curveTo(743.9f, 264.1f, 743.9f, 265.4f, 750.8f, 267.1f)
                curveTo(749.7f, 269.9f, 750.3f, 269.6f, 751.3f, 272.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(381.9f, 337.9f)
                lineTo(383.1f, 340.0f)
                curveTo(383.3f, 344.5f, 384.0f, 356.9f, 381.5f, 360.2f)
                lineTo(380.3f, 358.3f)
                curveTo(371.7f, 347.5f, 372.2f, 346.5f, 381.9f, 337.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(750.8f, 267.1f)
                curveTo(750.4f, 262.4f, 749.4f, 257.0f, 751.3f, 252.9f)
                lineTo(752.9f, 251.4f)
                curveTo(758.8f, 253.3f, 760.8f, 268.4f, 751.3f, 272.9f)
                curveTo(750.3f, 269.6f, 749.7f, 269.9f, 750.8f, 267.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(331.8f, 394.8f)
                curveTo(336.6f, 397.8f, 341.4f, 403.8f, 341.6f, 409.8f)
                curveTo(338.2f, 410.2f, 335.1f, 411.0f, 332.4f, 409.4f)
                curveTo(330.7f, 405.6f, 331.8f, 399.9f, 331.8f, 394.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(391.2f, 262.5f)
                lineTo(393.0f, 264.5f)
                curveTo(395.0f, 271.1f, 394.1f, 274.4f, 392.4f, 281.0f)
                lineTo(390.5f, 279.7f)
                curveTo(388.7f, 273.1f, 389.6f, 269.2f, 391.2f, 262.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, fillAlpha = 0.980392f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(781.5f, 277.8f)
                lineTo(782.7f, 279.6f)
                curveTo(783.3f, 284.8f, 784.4f, 296.1f, 781.6f, 300.4f)
                lineTo(779.7f, 298.1f)
                curveTo(779.2f, 290.7f, 780.1f, 284.9f, 781.5f, 277.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.905882f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(836.0f, 631.5f)
                lineTo(836.1f, 631.9f)
                curveTo(839.1f, 642.8f, 851.5f, 649.4f, 850.2f, 655.3f)
                curveTo(843.8f, 656.6f, 824.4f, 645.6f, 818.7f, 642.2f)
                curveTo(825.0f, 641.0f, 831.0f, 644.5f, 834.5f, 643.3f)
                curveTo(836.3f, 640.4f, 835.9f, 635.0f, 836.0f, 631.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.878431f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.2f, 584.9f)
                curveTo(216.3f, 586.7f, 216.4f, 588.5f, 216.6f, 590.3f)
                curveTo(223.5f, 590.5f, 221.3f, 582.1f, 235.3f, 580.5f)
                curveTo(230.6f, 584.5f, 209.4f, 603.4f, 206.0f, 605.8f)
                curveTo(208.6f, 599.0f, 212.3f, 591.0f, 216.2f, 584.9f)
                close()
            }
        }
        .build()
        return _standardGoroAkechi!!
    }

private var _standardGoroAkechi: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = StandardSenderAvatar.StandardGoroAkechi, contentDescription = "")
    }
}
