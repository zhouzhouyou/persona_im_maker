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

public val StandardSenderAvatar.StandardIchikoOhya: ImageVector
    get() {
        if (_standardIchikoOhya != null) {
            return _standardIchikoOhya!!
        }
        _standardIchikoOhya = Builder(name = "StandardIchikoOhya", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 1024.0f, viewportHeight = 1024.0f).apply {
            path(fill = SolidColor(Color(0xFF020301)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(535.7f, 72.3f)
                curveTo(561.4f, 69.7f, 588.1f, 79.9f, 613.0f, 86.8f)
                curveTo(637.5f, 93.7f, 672.4f, 98.5f, 694.1f, 110.8f)
                curveTo(705.9f, 117.4f, 726.6f, 144.9f, 738.3f, 154.1f)
                curveTo(755.2f, 172.1f, 779.2f, 192.9f, 793.7f, 212.8f)
                curveTo(798.9f, 219.8f, 802.3f, 240.0f, 804.8f, 249.4f)
                lineTo(820.9f, 311.7f)
                curveTo(824.1f, 324.5f, 829.4f, 340.5f, 831.8f, 353.1f)
                curveTo(835.7f, 373.5f, 833.9f, 399.7f, 834.1f, 420.9f)
                curveTo(834.2f, 434.2f, 834.9f, 459.1f, 833.7f, 471.3f)
                curveTo(832.1f, 486.1f, 824.7f, 511.0f, 821.6f, 526.3f)
                lineTo(805.1f, 605.0f)
                curveTo(802.7f, 615.9f, 799.1f, 641.0f, 792.3f, 648.7f)
                curveTo(779.9f, 662.7f, 762.2f, 689.8f, 748.7f, 701.2f)
                curveTo(732.0f, 715.5f, 687.4f, 747.2f, 666.5f, 751.2f)
                lineTo(665.6f, 750.4f)
                curveTo(670.2f, 743.4f, 683.6f, 736.1f, 685.2f, 730.0f)
                lineTo(683.7f, 728.5f)
                curveTo(668.0f, 726.5f, 643.3f, 736.9f, 632.5f, 747.8f)
                curveTo(625.2f, 755.2f, 632.0f, 779.1f, 632.7f, 789.5f)
                curveTo(665.2f, 790.6f, 672.4f, 790.2f, 702.2f, 779.3f)
                curveTo(713.1f, 775.2f, 739.6f, 774.6f, 754.2f, 771.4f)
                curveTo(769.1f, 768.1f, 796.1f, 762.1f, 812.0f, 765.1f)
                curveTo(834.4f, 777.1f, 857.2f, 800.3f, 877.4f, 816.7f)
                curveTo(890.7f, 827.5f, 892.4f, 854.1f, 896.9f, 869.9f)
                curveTo(914.1f, 923.1f, 917.7f, 953.8f, 900.0f, 1008.2f)
                lineTo(494.5f, 1007.9f)
                lineTo(203.6f, 1007.9f)
                lineTo(121.8f, 1007.9f)
                curveTo(109.0f, 1007.9f, 85.7f, 1007.2f, 73.9f, 1009.0f)
                curveTo(79.4f, 1001.3f, 88.7f, 977.8f, 92.9f, 968.2f)
                curveTo(111.7f, 925.3f, 129.7f, 879.3f, 157.7f, 841.2f)
                curveTo(174.7f, 835.0f, 190.5f, 827.6f, 207.0f, 820.0f)
                curveTo(219.0f, 814.2f, 235.3f, 815.8f, 248.4f, 818.5f)
                curveTo(273.7f, 823.8f, 305.5f, 819.4f, 328.8f, 829.4f)
                curveTo(340.8f, 825.7f, 353.5f, 822.4f, 365.7f, 819.4f)
                curveTo(381.8f, 815.5f, 386.9f, 809.3f, 397.4f, 797.7f)
                curveTo(394.2f, 778.7f, 389.8f, 759.4f, 387.2f, 740.2f)
                curveTo(385.2f, 725.9f, 367.3f, 725.6f, 357.4f, 718.0f)
                curveTo(351.5f, 713.5f, 350.3f, 710.5f, 342.9f, 705.5f)
                curveTo(341.2f, 700.4f, 338.4f, 691.8f, 332.6f, 690.4f)
                curveTo(326.2f, 697.6f, 337.5f, 718.8f, 335.2f, 727.7f)
                curveTo(329.0f, 729.0f, 315.5f, 703.1f, 302.9f, 700.6f)
                curveTo(297.8f, 701.9f, 299.3f, 702.8f, 294.5f, 706.1f)
                lineTo(292.3f, 705.3f)
                curveTo(282.1f, 694.1f, 265.8f, 667.7f, 260.0f, 653.9f)
                curveTo(256.5f, 645.7f, 254.9f, 636.7f, 252.4f, 628.2f)
                curveTo(245.1f, 603.5f, 236.9f, 578.6f, 233.0f, 553.0f)
                curveTo(230.3f, 534.7f, 230.3f, 515.3f, 229.8f, 496.8f)
                curveTo(229.3f, 475.1f, 227.9f, 452.8f, 229.5f, 431.2f)
                curveTo(231.6f, 399.6f, 240.1f, 365.0f, 247.5f, 334.3f)
                curveTo(250.4f, 322.1f, 252.2f, 309.2f, 256.7f, 297.5f)
                curveTo(264.6f, 277.0f, 282.6f, 247.5f, 293.5f, 227.4f)
                curveTo(301.3f, 213.0f, 309.1f, 193.0f, 318.7f, 180.3f)
                curveTo(329.9f, 165.6f, 347.0f, 153.0f, 360.9f, 140.9f)
                curveTo(375.3f, 128.3f, 389.3f, 110.8f, 405.6f, 101.2f)
                curveTo(418.0f, 93.9f, 516.4f, 75.1f, 535.7f, 72.3f)
                close()
                moveTo(635.7f, 733.7f)
                curveTo(638.8f, 733.9f, 641.2f, 734.2f, 643.6f, 732.1f)
                curveTo(647.3f, 728.6f, 657.7f, 716.9f, 658.3f, 712.5f)
                lineTo(656.6f, 710.9f)
                curveTo(649.2f, 714.5f, 627.5f, 721.7f, 632.4f, 731.5f)
                lineTo(635.7f, 733.7f)
                close()
                moveTo(316.3f, 549.5f)
                curveTo(316.6f, 547.0f, 312.3f, 534.3f, 310.2f, 532.8f)
                curveTo(307.4f, 540.4f, 307.1f, 546.4f, 316.3f, 549.5f)
                close()
                moveTo(302.9f, 537.5f)
                curveTo(302.9f, 531.7f, 301.3f, 528.5f, 295.2f, 526.7f)
                curveTo(295.2f, 531.5f, 299.2f, 534.9f, 302.9f, 537.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(571.1f, 395.2f)
                curveTo(591.5f, 377.3f, 591.1f, 340.6f, 597.6f, 335.9f)
                lineTo(599.3f, 336.3f)
                curveTo(606.2f, 346.2f, 599.5f, 392.8f, 601.5f, 397.1f)
                curveTo(607.0f, 395.2f, 606.6f, 394.7f, 609.9f, 399.4f)
                curveTo(615.6f, 401.9f, 621.3f, 388.2f, 628.5f, 387.8f)
                curveTo(629.5f, 390.8f, 627.4f, 396.8f, 626.9f, 401.1f)
                lineTo(628.0f, 402.3f)
                curveTo(633.5f, 400.5f, 637.8f, 392.5f, 643.5f, 393.1f)
                curveTo(644.2f, 396.2f, 642.1f, 405.8f, 638.0f, 405.7f)
                curveTo(615.8f, 404.7f, 593.9f, 404.9f, 572.8f, 412.6f)
                curveTo(566.8f, 414.8f, 556.7f, 416.0f, 557.9f, 423.9f)
                curveTo(565.1f, 429.9f, 593.8f, 417.3f, 604.6f, 415.8f)
                curveTo(616.9f, 414.1f, 637.0f, 412.8f, 647.1f, 406.6f)
                curveTo(651.3f, 399.5f, 650.1f, 393.8f, 657.4f, 387.5f)
                lineTo(658.6f, 387.8f)
                curveTo(660.1f, 394.1f, 655.3f, 407.4f, 657.2f, 412.5f)
                lineTo(659.0f, 413.1f)
                curveTo(667.0f, 408.5f, 675.6f, 380.0f, 682.2f, 380.1f)
                curveTo(683.8f, 383.7f, 683.1f, 392.9f, 683.0f, 397.3f)
                curveTo(682.7f, 416.9f, 683.4f, 434.5f, 677.6f, 453.4f)
                curveTo(685.8f, 445.1f, 694.6f, 437.4f, 703.9f, 430.3f)
                curveTo(698.7f, 454.0f, 697.6f, 479.0f, 686.2f, 500.8f)
                curveTo(681.2f, 510.4f, 676.1f, 520.0f, 671.0f, 529.6f)
                curveTo(679.8f, 526.4f, 684.7f, 523.4f, 692.2f, 518.1f)
                curveTo(687.6f, 532.2f, 681.3f, 545.8f, 673.6f, 558.4f)
                curveTo(669.8f, 564.6f, 661.9f, 572.9f, 662.5f, 579.6f)
                curveTo(665.3f, 584.3f, 665.7f, 585.3f, 666.2f, 590.7f)
                curveTo(666.4f, 591.9f, 666.9f, 595.1f, 666.3f, 596.0f)
                curveTo(657.4f, 608.0f, 642.8f, 620.9f, 634.3f, 632.9f)
                curveTo(650.0f, 626.3f, 664.1f, 620.0f, 677.4f, 609.3f)
                curveTo(671.9f, 622.4f, 665.7f, 632.3f, 655.1f, 642.2f)
                curveTo(624.8f, 670.2f, 586.1f, 689.7f, 550.4f, 709.9f)
                curveTo(534.2f, 719.0f, 516.7f, 729.4f, 499.5f, 735.7f)
                curveTo(491.9f, 738.4f, 483.5f, 738.1f, 475.6f, 737.9f)
                curveTo(458.7f, 729.3f, 388.3f, 658.2f, 373.0f, 638.9f)
                curveTo(365.8f, 629.9f, 352.3f, 597.5f, 347.2f, 585.4f)
                curveTo(356.1f, 591.2f, 365.0f, 596.8f, 374.0f, 602.4f)
                curveTo(363.9f, 583.5f, 355.3f, 583.5f, 348.1f, 562.7f)
                curveTo(360.2f, 571.6f, 360.4f, 573.8f, 375.2f, 580.4f)
                curveTo(362.3f, 558.9f, 357.1f, 546.7f, 347.8f, 523.8f)
                curveTo(352.1f, 525.8f, 360.6f, 529.9f, 364.7f, 527.0f)
                curveTo(364.4f, 522.7f, 357.4f, 511.8f, 355.4f, 507.0f)
                curveTo(352.2f, 499.2f, 339.1f, 466.9f, 345.7f, 460.8f)
                curveTo(349.0f, 462.1f, 352.2f, 466.6f, 354.7f, 469.5f)
                curveTo(352.8f, 455.7f, 353.7f, 437.5f, 356.8f, 423.4f)
                curveTo(357.8f, 418.5f, 362.0f, 427.2f, 364.1f, 411.7f)
                curveTo(364.3f, 410.0f, 367.3f, 390.6f, 367.4f, 390.4f)
                curveTo(370.8f, 392.2f, 374.5f, 396.8f, 377.2f, 399.8f)
                curveTo(377.2f, 395.7f, 375.8f, 368.5f, 376.6f, 366.6f)
                curveTo(383.5f, 367.7f, 382.6f, 376.4f, 392.7f, 382.4f)
                lineTo(393.1f, 382.6f)
                curveTo(393.1f, 370.0f, 392.6f, 362.4f, 390.0f, 350.0f)
                curveTo(395.9f, 354.9f, 400.1f, 359.3f, 405.5f, 364.9f)
                curveTo(403.1f, 358.6f, 401.2f, 352.7f, 399.2f, 346.3f)
                curveTo(407.0f, 352.2f, 412.8f, 366.5f, 419.5f, 367.1f)
                curveTo(422.4f, 362.9f, 419.8f, 363.3f, 422.2f, 358.5f)
                curveTo(426.5f, 357.8f, 430.7f, 366.6f, 438.3f, 367.1f)
                lineTo(439.9f, 365.7f)
                curveTo(440.7f, 361.9f, 439.0f, 341.7f, 439.1f, 335.7f)
                curveTo(443.6f, 344.3f, 451.6f, 364.4f, 460.2f, 367.7f)
                lineTo(461.5f, 367.0f)
                curveTo(463.4f, 359.8f, 460.6f, 353.7f, 458.4f, 346.4f)
                curveTo(464.2f, 351.3f, 475.3f, 366.2f, 478.4f, 367.3f)
                lineTo(480.9f, 364.6f)
                curveTo(482.1f, 364.4f, 501.9f, 370.1f, 506.0f, 370.9f)
                lineTo(507.6f, 346.4f)
                curveTo(512.9f, 352.8f, 517.3f, 362.5f, 521.0f, 370.1f)
                curveTo(530.0f, 374.0f, 536.5f, 375.9f, 544.2f, 381.9f)
                curveTo(543.5f, 372.2f, 542.9f, 364.0f, 542.8f, 354.2f)
                curveTo(545.3f, 360.2f, 553.6f, 387.3f, 558.4f, 388.5f)
                curveTo(561.3f, 385.8f, 568.1f, 369.6f, 575.7f, 360.3f)
                curveTo(576.3f, 374.8f, 574.3f, 381.1f, 571.1f, 395.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF020301)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(598.5f, 461.0f)
                curveTo(613.8f, 462.3f, 629.7f, 462.6f, 644.4f, 467.1f)
                curveTo(651.6f, 469.3f, 672.3f, 472.3f, 676.5f, 477.0f)
                curveTo(675.3f, 483.3f, 666.7f, 478.5f, 662.5f, 482.0f)
                curveTo(663.7f, 486.4f, 669.2f, 486.5f, 668.2f, 489.4f)
                curveTo(662.4f, 507.7f, 646.4f, 533.9f, 624.2f, 532.9f)
                curveTo(620.1f, 532.7f, 616.0f, 533.9f, 613.5f, 531.6f)
                lineTo(614.0f, 530.3f)
                curveTo(618.5f, 528.2f, 625.7f, 529.1f, 631.3f, 527.0f)
                curveTo(642.6f, 522.8f, 648.1f, 519.4f, 653.4f, 508.8f)
                curveTo(657.2f, 500.3f, 662.8f, 483.5f, 649.7f, 483.1f)
                curveTo(646.4f, 481.9f, 646.2f, 489.5f, 646.3f, 491.6f)
                curveTo(647.3f, 518.8f, 606.0f, 533.4f, 594.1f, 505.5f)
                curveTo(591.3f, 498.8f, 594.0f, 487.5f, 590.8f, 483.8f)
                curveTo(585.4f, 484.9f, 580.2f, 501.4f, 573.6f, 506.1f)
                lineTo(572.1f, 505.6f)
                curveTo(573.7f, 494.6f, 576.5f, 489.3f, 576.0f, 477.7f)
                lineTo(576.0f, 477.1f)
                curveTo(583.2f, 474.2f, 594.4f, 471.9f, 598.8f, 468.8f)
                curveTo(600.6f, 465.3f, 599.9f, 465.9f, 598.5f, 461.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF020301)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(363.7f, 421.8f)
                curveTo(380.4f, 422.7f, 405.7f, 426.9f, 419.8f, 435.6f)
                curveTo(431.7f, 442.8f, 451.3f, 458.5f, 458.9f, 469.9f)
                curveTo(454.1f, 468.4f, 448.3f, 465.8f, 443.5f, 463.9f)
                curveTo(434.5f, 473.3f, 431.2f, 486.3f, 415.5f, 488.4f)
                curveTo(397.1f, 490.9f, 389.2f, 482.4f, 386.3f, 466.1f)
                curveTo(384.1f, 453.7f, 383.0f, 454.9f, 389.1f, 445.9f)
                curveTo(389.3f, 442.3f, 387.2f, 439.7f, 384.1f, 438.1f)
                curveTo(376.2f, 437.1f, 372.3f, 447.5f, 371.0f, 453.7f)
                curveTo(365.8f, 479.5f, 390.3f, 486.3f, 402.2f, 502.4f)
                lineTo(402.4f, 502.7f)
                curveTo(390.7f, 499.0f, 376.7f, 491.0f, 369.4f, 480.8f)
                curveTo(364.2f, 473.6f, 367.5f, 459.6f, 366.1f, 450.6f)
                curveTo(365.4f, 446.0f, 362.4f, 442.5f, 363.2f, 438.5f)
                curveTo(370.4f, 430.7f, 363.4f, 434.7f, 363.7f, 421.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF020301)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(476.9f, 641.4f)
                curveTo(477.4f, 641.3f, 478.0f, 641.2f, 478.5f, 641.1f)
                curveTo(504.8f, 640.1f, 517.1f, 644.3f, 536.9f, 660.1f)
                curveTo(533.0f, 661.9f, 527.9f, 663.4f, 524.4f, 665.3f)
                curveTo(516.7f, 669.5f, 513.3f, 672.1f, 505.0f, 675.3f)
                curveTo(482.4f, 679.1f, 466.6f, 667.3f, 450.4f, 652.7f)
                curveTo(448.6f, 651.2f, 448.9f, 649.9f, 449.1f, 648.1f)
                curveTo(453.7f, 644.5f, 470.3f, 642.5f, 476.9f, 641.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(476.2f, 651.4f)
                curveTo(483.4f, 650.7f, 499.6f, 649.1f, 504.9f, 654.3f)
                curveTo(504.7f, 657.2f, 504.9f, 656.1f, 502.6f, 658.7f)
                curveTo(495.6f, 660.9f, 482.8f, 663.2f, 476.9f, 657.7f)
                curveTo(475.4f, 653.8f, 475.4f, 655.2f, 476.2f, 651.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF020301)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(407.9f, 374.6f)
                curveTo(412.7f, 374.6f, 416.7f, 375.2f, 421.3f, 375.4f)
                curveTo(433.5f, 376.0f, 496.1f, 401.9f, 482.3f, 419.8f)
                curveTo(460.6f, 405.7f, 433.7f, 382.6f, 407.4f, 379.2f)
                lineTo(407.9f, 374.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF020301)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(502.5f, 580.7f)
                curveTo(503.0f, 580.7f, 503.5f, 580.8f, 504.0f, 580.9f)
                curveTo(514.4f, 582.4f, 519.3f, 592.4f, 525.6f, 600.8f)
                lineTo(518.5f, 607.7f)
                lineTo(509.1f, 612.7f)
                lineTo(499.9f, 607.2f)
                curveTo(499.6f, 596.9f, 500.8f, 590.8f, 502.5f, 580.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF020301)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(584.6f, 433.0f)
                curveTo(589.3f, 432.8f, 598.6f, 435.7f, 599.1f, 441.1f)
                curveTo(595.7f, 445.5f, 584.4f, 447.3f, 578.8f, 448.7f)
                curveTo(574.5f, 449.8f, 566.7f, 452.8f, 563.8f, 448.7f)
                curveTo(565.6f, 442.1f, 578.7f, 436.0f, 584.6f, 433.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF020301)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(443.1f, 467.5f)
                lineTo(445.7f, 468.7f)
                curveTo(449.8f, 474.4f, 456.1f, 483.6f, 458.0f, 490.2f)
                curveTo(445.3f, 490.1f, 444.0f, 477.6f, 443.1f, 467.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF020301)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(474.8f, 589.4f)
                curveTo(481.8f, 590.3f, 486.1f, 596.1f, 484.6f, 603.1f)
                curveTo(476.2f, 601.0f, 471.1f, 598.4f, 474.8f, 589.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(454.6f, 141.4f)
                curveTo(467.8f, 140.1f, 486.0f, 141.7f, 498.6f, 145.6f)
                curveTo(517.9f, 151.5f, 534.1f, 164.8f, 543.5f, 182.6f)
                curveTo(556.4f, 185.0f, 573.8f, 185.7f, 587.0f, 186.1f)
                curveTo(590.9f, 179.4f, 594.4f, 174.2f, 601.4f, 170.0f)
                curveTo(618.9f, 159.8f, 636.7f, 155.9f, 656.4f, 160.1f)
                curveTo(694.8f, 168.4f, 725.3f, 185.8f, 747.6f, 218.7f)
                curveTo(761.8f, 239.7f, 762.2f, 255.9f, 763.6f, 280.4f)
                curveTo(763.9f, 286.3f, 765.0f, 295.5f, 763.8f, 300.9f)
                lineTo(762.4f, 301.6f)
                curveTo(755.6f, 295.3f, 763.0f, 285.0f, 756.5f, 277.8f)
                curveTo(744.8f, 272.3f, 736.4f, 296.7f, 728.9f, 303.0f)
                curveTo(721.1f, 309.5f, 711.1f, 312.6f, 701.1f, 312.3f)
                curveTo(664.6f, 311.5f, 635.2f, 301.3f, 608.9f, 275.6f)
                curveTo(599.9f, 266.1f, 594.4f, 255.5f, 589.6f, 243.3f)
                curveTo(584.1f, 228.9f, 584.6f, 211.3f, 570.6f, 201.8f)
                curveTo(565.1f, 198.1f, 552.0f, 198.3f, 545.7f, 199.6f)
                curveTo(534.6f, 201.8f, 528.4f, 223.4f, 521.1f, 234.2f)
                curveTo(509.0f, 252.2f, 493.9f, 263.3f, 471.8f, 267.8f)
                curveTo(442.8f, 273.6f, 405.1f, 278.8f, 377.9f, 264.2f)
                curveTo(367.7f, 258.8f, 360.9f, 239.1f, 358.7f, 228.0f)
                curveTo(351.4f, 246.1f, 351.0f, 272.4f, 341.6f, 286.0f)
                lineTo(340.2f, 286.1f)
                curveTo(338.5f, 280.0f, 341.4f, 266.8f, 342.7f, 260.0f)
                curveTo(347.4f, 234.6f, 353.9f, 202.0f, 370.5f, 181.6f)
                curveTo(391.8f, 155.5f, 421.9f, 144.7f, 454.6f, 141.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF020301)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(633.6f, 173.2f)
                curveTo(669.5f, 169.7f, 728.8f, 199.4f, 740.8f, 235.0f)
                curveTo(750.5f, 263.3f, 734.6f, 286.1f, 707.6f, 294.8f)
                curveTo(687.4f, 298.4f, 670.9f, 295.9f, 651.2f, 286.2f)
                curveTo(620.5f, 270.9f, 586.8f, 230.1f, 603.3f, 193.9f)
                curveTo(608.3f, 183.0f, 622.1f, 176.7f, 633.6f, 173.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF020301)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(452.4f, 154.4f)
                curveTo(467.4f, 152.8f, 490.3f, 157.7f, 502.0f, 167.4f)
                curveTo(520.5f, 182.8f, 512.7f, 213.4f, 499.1f, 229.8f)
                curveTo(483.9f, 248.2f, 462.7f, 251.4f, 440.2f, 253.4f)
                curveTo(426.6f, 255.3f, 404.3f, 252.4f, 393.3f, 243.8f)
                curveTo(385.7f, 237.9f, 380.8f, 229.2f, 379.8f, 219.7f)
                curveTo(378.4f, 206.6f, 384.3f, 189.1f, 392.9f, 179.3f)
                curveTo(407.9f, 162.2f, 430.7f, 156.1f, 452.4f, 154.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.3f, 503.2f)
                curveTo(250.7f, 454.5f, 249.9f, 410.9f, 263.3f, 363.4f)
                curveTo(264.9f, 357.7f, 279.8f, 305.1f, 281.1f, 304.3f)
                curveTo(283.7f, 306.7f, 285.3f, 314.0f, 287.7f, 318.5f)
                lineTo(288.9f, 318.5f)
                curveTo(293.9f, 306.2f, 296.0f, 292.6f, 301.5f, 280.2f)
                curveTo(306.5f, 268.8f, 311.0f, 257.3f, 317.9f, 246.8f)
                curveTo(313.2f, 272.6f, 314.5f, 282.2f, 315.2f, 308.2f)
                curveTo(318.9f, 296.1f, 319.6f, 293.0f, 327.5f, 283.1f)
                curveTo(323.5f, 308.6f, 328.7f, 328.9f, 330.5f, 354.5f)
                curveTo(341.2f, 328.5f, 343.8f, 296.5f, 362.7f, 277.7f)
                curveTo(373.0f, 286.4f, 384.1f, 287.0f, 389.1f, 292.8f)
                curveTo(389.9f, 296.6f, 389.3f, 296.5f, 388.0f, 300.8f)
                curveTo(393.5f, 299.6f, 398.4f, 298.2f, 403.5f, 301.7f)
                curveTo(406.0f, 303.4f, 407.7f, 306.1f, 408.1f, 309.1f)
                curveTo(410.3f, 322.9f, 388.6f, 339.9f, 384.4f, 302.9f)
                curveTo(382.1f, 304.5f, 380.4f, 305.4f, 378.8f, 307.7f)
                curveTo(379.1f, 310.0f, 379.7f, 315.2f, 380.6f, 317.2f)
                curveTo(383.7f, 324.0f, 397.1f, 332.7f, 392.9f, 340.4f)
                lineTo(391.6f, 340.2f)
                lineTo(388.5f, 336.0f)
                curveTo(385.3f, 336.4f, 378.9f, 342.5f, 377.0f, 344.9f)
                curveTo(375.6f, 345.3f, 370.5f, 346.7f, 369.6f, 346.4f)
                curveTo(341.7f, 335.4f, 351.3f, 365.4f, 351.3f, 388.1f)
                curveTo(347.5f, 385.1f, 344.7f, 382.8f, 340.4f, 380.5f)
                lineTo(339.5f, 381.0f)
                curveTo(339.6f, 387.7f, 340.5f, 412.9f, 336.3f, 416.6f)
                curveTo(329.3f, 414.4f, 322.8f, 387.4f, 320.3f, 380.1f)
                curveTo(319.3f, 414.0f, 320.0f, 450.7f, 319.9f, 484.8f)
                lineTo(305.6f, 483.2f)
                curveTo(305.8f, 487.2f, 306.2f, 492.8f, 305.9f, 496.6f)
                lineTo(305.3f, 496.9f)
                curveTo(301.8f, 496.6f, 293.3f, 500.7f, 289.1f, 502.2f)
                curveTo(284.7f, 499.6f, 281.2f, 496.3f, 277.4f, 493.0f)
                lineTo(280.2f, 481.4f)
                curveTo(284.2f, 479.0f, 287.6f, 477.1f, 291.9f, 475.0f)
                curveTo(298.0f, 463.5f, 285.3f, 448.7f, 277.4f, 441.1f)
                lineTo(273.5f, 443.3f)
                curveTo(274.8f, 454.0f, 289.0f, 455.0f, 291.0f, 463.9f)
                curveTo(288.4f, 472.6f, 278.1f, 473.3f, 270.9f, 476.7f)
                curveTo(268.6f, 477.8f, 272.9f, 480.6f, 273.1f, 484.5f)
                curveTo(273.2f, 490.1f, 271.8f, 495.4f, 270.3f, 500.8f)
                curveTo(263.9f, 501.4f, 258.5f, 501.7f, 252.3f, 503.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(377.0f, 344.9f)
                curveTo(371.7f, 336.0f, 379.0f, 321.5f, 378.8f, 307.7f)
                curveTo(379.1f, 310.0f, 379.7f, 315.2f, 380.6f, 317.2f)
                curveTo(383.7f, 324.0f, 397.1f, 332.7f, 392.9f, 340.4f)
                lineTo(391.6f, 340.2f)
                lineTo(388.5f, 336.0f)
                curveTo(385.3f, 336.4f, 378.9f, 342.5f, 377.0f, 344.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF020301)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(273.5f, 443.3f)
                curveTo(274.3f, 437.0f, 278.7f, 425.5f, 284.5f, 422.1f)
                curveTo(286.6f, 428.8f, 278.1f, 432.6f, 277.4f, 441.1f)
                lineTo(273.5f, 443.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF020301)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.3f, 452.3f)
                curveTo(257.6f, 452.4f, 258.6f, 452.8f, 259.8f, 453.2f)
                curveTo(262.1f, 459.2f, 262.0f, 474.0f, 257.3f, 478.9f)
                curveTo(252.1f, 474.7f, 260.1f, 467.6f, 255.2f, 454.6f)
                lineTo(256.3f, 452.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(268.9f, 502.2f)
                curveTo(272.5f, 502.8f, 275.8f, 502.6f, 279.4f, 503.4f)
                curveTo(291.5f, 505.8f, 291.1f, 518.6f, 280.8f, 523.9f)
                lineTo(276.3f, 526.3f)
                curveTo(260.6f, 526.4f, 261.9f, 512.2f, 268.9f, 502.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(424.7f, 299.9f)
                curveTo(436.4f, 296.1f, 443.3f, 314.3f, 435.7f, 321.5f)
                lineTo(433.2f, 321.4f)
                curveTo(416.7f, 324.6f, 415.4f, 321.5f, 416.0f, 305.8f)
                lineTo(424.7f, 299.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(455.5f, 297.7f)
                curveTo(460.7f, 298.6f, 469.3f, 305.0f, 470.8f, 310.4f)
                curveTo(470.3f, 313.5f, 470.8f, 312.3f, 468.4f, 314.8f)
                curveTo(462.8f, 313.9f, 463.0f, 307.5f, 455.3f, 307.7f)
                lineTo(453.4f, 310.1f)
                curveTo(454.4f, 313.7f, 456.4f, 318.6f, 454.9f, 321.7f)
                lineTo(453.0f, 322.0f)
                curveTo(449.1f, 320.0f, 446.5f, 315.9f, 443.8f, 312.4f)
                curveTo(448.9f, 304.7f, 449.0f, 304.2f, 455.5f, 297.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(274.8f, 549.4f)
                curveTo(281.2f, 551.3f, 291.2f, 561.1f, 288.8f, 569.6f)
                curveTo(286.2f, 572.2f, 287.4f, 571.7f, 284.3f, 572.1f)
                curveTo(281.3f, 571.1f, 280.0f, 568.9f, 278.1f, 566.4f)
                curveTo(276.8f, 563.3f, 276.6f, 562.7f, 274.1f, 560.4f)
                lineTo(272.4f, 560.5f)
                curveTo(270.4f, 563.5f, 270.1f, 569.3f, 269.6f, 573.0f)
                lineTo(268.9f, 573.0f)
                curveTo(267.8f, 568.8f, 266.6f, 564.9f, 265.2f, 560.7f)
                curveTo(268.6f, 557.0f, 271.6f, 553.2f, 274.8f, 549.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(305.3f, 496.9f)
                lineTo(305.9f, 496.6f)
                curveTo(307.4f, 507.2f, 308.6f, 517.8f, 309.3f, 528.5f)
                curveTo(304.0f, 524.8f, 298.4f, 523.9f, 295.6f, 520.7f)
                curveTo(293.8f, 517.6f, 294.7f, 512.1f, 295.0f, 508.4f)
                curveTo(299.2f, 503.8f, 303.5f, 502.1f, 305.3f, 496.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(289.1f, 523.9f)
                lineTo(290.8f, 526.0f)
                curveTo(291.7f, 532.3f, 294.6f, 546.0f, 291.2f, 551.1f)
                curveTo(288.4f, 551.9f, 288.8f, 551.3f, 285.6f, 549.7f)
                curveTo(285.0f, 549.2f, 284.5f, 548.7f, 284.0f, 548.2f)
                curveTo(273.3f, 537.9f, 279.9f, 531.9f, 289.1f, 523.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(257.7f, 524.3f)
                curveTo(266.8f, 526.5f, 277.3f, 536.8f, 271.4f, 546.7f)
                curveTo(267.9f, 548.9f, 266.8f, 550.2f, 263.2f, 548.5f)
                curveTo(258.9f, 541.6f, 258.5f, 532.6f, 257.7f, 524.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(429.7f, 286.9f)
                curveTo(435.5f, 286.6f, 448.1f, 288.5f, 451.4f, 293.7f)
                lineTo(449.8f, 297.0f)
                curveTo(441.4f, 301.1f, 430.1f, 296.1f, 429.7f, 286.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(472.1f, 279.7f)
                lineTo(473.6f, 281.0f)
                curveTo(474.5f, 285.5f, 476.7f, 294.2f, 474.4f, 298.0f)
                lineTo(470.0f, 298.5f)
                curveTo(465.7f, 296.8f, 464.8f, 296.6f, 463.8f, 292.1f)
                curveTo(464.8f, 287.8f, 469.2f, 283.3f, 472.1f, 279.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(662.5f, 579.6f)
                curveTo(668.9f, 574.1f, 677.7f, 566.1f, 684.8f, 562.1f)
                curveTo(679.9f, 572.2f, 667.3f, 583.6f, 666.2f, 590.7f)
                curveTo(665.7f, 585.3f, 665.3f, 584.3f, 662.5f, 579.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(441.1f, 324.6f)
                curveTo(449.1f, 325.1f, 455.9f, 332.1f, 456.6f, 340.0f)
                curveTo(449.1f, 338.1f, 440.8f, 333.1f, 441.1f, 324.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.3f, 325.3f)
                curveTo(417.9f, 325.4f, 418.2f, 325.7f, 419.8f, 326.3f)
                curveTo(422.0f, 329.5f, 424.3f, 332.2f, 421.4f, 335.6f)
                lineTo(418.7f, 335.3f)
                curveTo(414.8f, 330.4f, 412.9f, 331.5f, 408.9f, 327.4f)
                curveTo(410.9f, 325.4f, 412.9f, 325.8f, 416.3f, 325.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, fillAlpha = 0.988235f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(310.2f, 532.8f)
                curveTo(312.3f, 534.3f, 316.6f, 547.0f, 316.3f, 549.5f)
                curveTo(307.1f, 546.4f, 307.4f, 540.4f, 310.2f, 532.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC1C2BF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(287.4f, 577.0f)
                curveTo(295.7f, 576.6f, 298.2f, 578.3f, 301.5f, 585.9f)
                curveTo(295.0f, 586.6f, 291.4f, 581.6f, 287.4f, 577.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC1C2BF)), stroke = null, fillAlpha = 0.984314f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(295.2f, 526.7f)
                curveTo(301.3f, 528.5f, 302.9f, 531.7f, 302.9f, 537.5f)
                curveTo(299.2f, 534.9f, 295.2f, 531.5f, 295.2f, 526.7f)
                close()
            }
        }
        .build()
        return _standardIchikoOhya!!
    }

private var _standardIchikoOhya: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = StandardSenderAvatar.StandardIchikoOhya, contentDescription = "")
    }
}
