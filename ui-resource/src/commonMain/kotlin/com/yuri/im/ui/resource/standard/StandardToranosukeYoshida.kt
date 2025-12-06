package com.yuri.im.ui.resource.standard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
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

public val StandardSenderAvatar.StandardToranosukeYoshida: ImageVector
    get() {
        if (_standardToranosukeYoshida != null) {
            return _standardToranosukeYoshida!!
        }
        _standardToranosukeYoshida = Builder(name = "StandardToranosukeYoshida", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 1024.0f, viewportHeight =
                1024.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(484.0f, 64.4f)
                curveTo(485.6f, 64.3f, 487.3f, 64.3f, 489.0f, 64.4f)
                curveTo(513.5f, 66.1f, 568.8f, 76.5f, 593.9f, 82.0f)
                curveTo(614.8f, 94.0f, 645.9f, 114.9f, 663.7f, 129.9f)
                curveTo(681.2f, 146.3f, 711.5f, 179.9f, 715.0f, 204.1f)
                curveTo(720.1f, 239.0f, 738.2f, 260.0f, 751.2f, 291.9f)
                curveTo(760.3f, 314.0f, 757.1f, 326.4f, 753.1f, 348.7f)
                curveTo(747.8f, 378.4f, 740.3f, 408.3f, 736.1f, 438.1f)
                curveTo(733.0f, 463.6f, 740.8f, 495.1f, 734.7f, 520.6f)
                curveTo(730.7f, 536.3f, 709.8f, 564.1f, 706.6f, 578.1f)
                curveTo(698.9f, 610.6f, 679.7f, 657.1f, 677.5f, 688.8f)
                curveTo(688.6f, 691.3f, 699.3f, 700.3f, 709.9f, 706.2f)
                lineTo(764.5f, 736.6f)
                curveTo(792.9f, 752.3f, 821.3f, 767.9f, 849.9f, 783.3f)
                curveTo(862.0f, 789.9f, 874.2f, 797.4f, 886.3f, 803.8f)
                curveTo(899.7f, 810.9f, 914.5f, 812.0f, 926.3f, 823.3f)
                curveTo(937.0f, 833.7f, 950.2f, 841.4f, 955.5f, 856.2f)
                curveTo(971.7f, 899.1f, 988.9f, 941.7f, 1003.9f, 985.0f)
                curveTo(1006.3f, 992.0f, 1007.1f, 1006.0f, 1007.8f, 1013.7f)
                curveTo(992.8f, 1015.0f, 973.1f, 1014.4f, 957.7f, 1014.5f)
                lineTo(867.5f, 1014.8f)
                lineTo(528.5f, 1015.9f)
                lineTo(149.5f, 1018.0f)
                curveTo(103.1f, 1018.1f, 54.5f, 1019.9f, 8.4f, 1018.2f)
                curveTo(7.6f, 1008.1f, 8.0f, 989.8f, 8.0f, 979.1f)
                lineTo(7.9f, 907.9f)
                lineTo(8.0f, 817.2f)
                curveTo(8.0f, 800.8f, 7.4f, 784.1f, 8.3f, 767.7f)
                curveTo(8.5f, 763.1f, 8.6f, 756.4f, 11.4f, 752.7f)
                curveTo(22.8f, 737.3f, 115.7f, 686.4f, 136.9f, 674.7f)
                curveTo(143.8f, 670.9f, 150.7f, 666.8f, 157.9f, 663.5f)
                curveTo(175.5f, 655.2f, 191.8f, 649.6f, 204.9f, 634.2f)
                curveTo(215.7f, 621.7f, 215.3f, 604.1f, 224.3f, 590.6f)
                curveTo(231.8f, 579.3f, 249.7f, 574.7f, 254.8f, 564.6f)
                curveTo(256.8f, 560.6f, 235.6f, 494.4f, 232.8f, 486.8f)
                curveTo(229.4f, 477.6f, 221.9f, 473.5f, 217.3f, 465.4f)
                curveTo(210.4f, 453.1f, 202.5f, 418.8f, 193.5f, 410.9f)
                curveTo(191.0f, 408.7f, 187.1f, 407.2f, 184.1f, 405.8f)
                curveTo(186.6f, 392.3f, 189.9f, 351.5f, 190.1f, 337.6f)
                curveTo(187.1f, 338.6f, 185.0f, 339.5f, 181.8f, 339.2f)
                curveTo(179.4f, 337.2f, 179.4f, 336.5f, 180.6f, 333.3f)
                curveTo(185.4f, 320.0f, 186.7f, 305.8f, 190.5f, 292.2f)
                curveTo(191.6f, 288.2f, 193.1f, 284.2f, 195.0f, 280.5f)
                curveTo(199.2f, 271.8f, 220.1f, 241.7f, 226.8f, 231.6f)
                lineTo(255.0f, 188.7f)
                curveTo(258.5f, 183.5f, 268.5f, 167.1f, 272.3f, 163.5f)
                curveTo(318.0f, 120.8f, 371.3f, 89.3f, 431.2f, 70.8f)
                curveTo(443.3f, 67.1f, 470.6f, 65.7f, 484.0f, 64.4f)
                close()
                moveTo(450.4f, 159.9f)
                lineTo(452.3f, 157.6f)
                curveTo(451.4f, 153.2f, 447.1f, 149.2f, 442.8f, 148.3f)
                lineTo(440.0f, 151.3f)
                curveTo(441.6f, 155.0f, 446.3f, 155.9f, 450.4f, 159.9f)
                close()
                moveTo(457.1f, 151.3f)
                curveTo(457.5f, 145.7f, 453.4f, 139.1f, 448.0f, 137.3f)
                curveTo(448.2f, 142.4f, 452.3f, 149.8f, 457.1f, 151.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(519.2f, 169.6f)
                curveTo(521.7f, 170.2f, 520.8f, 169.7f, 522.5f, 171.6f)
                curveTo(522.6f, 175.1f, 519.2f, 179.0f, 516.7f, 181.1f)
                curveTo(491.5f, 203.4f, 482.1f, 225.3f, 474.6f, 257.7f)
                curveTo(488.1f, 227.7f, 506.9f, 195.4f, 536.8f, 179.3f)
                curveTo(549.5f, 172.4f, 557.7f, 174.5f, 563.6f, 187.3f)
                curveTo(564.0f, 185.8f, 564.5f, 184.2f, 565.0f, 182.7f)
                curveTo(565.5f, 181.2f, 566.5f, 177.1f, 568.0f, 176.4f)
                curveTo(575.5f, 172.8f, 624.3f, 193.5f, 628.4f, 190.5f)
                curveTo(630.2f, 189.1f, 629.7f, 185.4f, 632.4f, 184.0f)
                curveTo(644.9f, 205.1f, 651.9f, 238.3f, 650.5f, 262.6f)
                curveTo(650.0f, 272.5f, 647.5f, 286.1f, 646.1f, 296.4f)
                lineTo(646.4f, 295.9f)
                curveTo(650.8f, 288.8f, 655.4f, 280.4f, 657.6f, 272.3f)
                curveTo(662.7f, 253.7f, 662.9f, 218.2f, 658.5f, 199.8f)
                curveTo(660.9f, 203.2f, 664.7f, 208.6f, 667.2f, 212.8f)
                curveTo(670.5f, 218.4f, 675.3f, 225.8f, 677.3f, 232.7f)
                curveTo(684.7f, 258.2f, 691.5f, 289.6f, 693.3f, 316.1f)
                curveTo(693.5f, 317.9f, 677.5f, 315.2f, 673.2f, 316.2f)
                curveTo(661.9f, 318.8f, 633.2f, 329.7f, 623.9f, 335.2f)
                curveTo(638.8f, 331.9f, 687.2f, 318.0f, 696.3f, 334.7f)
                curveTo(700.9f, 343.2f, 716.7f, 375.1f, 704.9f, 381.6f)
                curveTo(704.1f, 381.3f, 698.3f, 379.4f, 698.0f, 379.5f)
                curveTo(670.3f, 387.8f, 637.7f, 389.2f, 614.7f, 408.5f)
                curveTo(613.8f, 404.1f, 611.9f, 393.7f, 609.3f, 390.8f)
                lineTo(607.6f, 391.2f)
                curveTo(605.5f, 394.7f, 606.0f, 400.4f, 605.5f, 404.7f)
                curveTo(603.8f, 419.2f, 597.1f, 429.1f, 586.3f, 438.1f)
                curveTo(589.0f, 445.9f, 591.1f, 457.6f, 593.5f, 466.0f)
                curveTo(602.9f, 498.7f, 608.4f, 524.1f, 608.0f, 558.4f)
                curveTo(599.4f, 568.1f, 587.0f, 585.3f, 572.5f, 579.2f)
                curveTo(562.4f, 574.8f, 509.8f, 560.0f, 506.4f, 554.8f)
                curveTo(505.4f, 547.0f, 509.5f, 538.3f, 512.3f, 530.8f)
                curveTo(497.8f, 545.8f, 503.1f, 552.5f, 489.7f, 565.7f)
                curveTo(476.3f, 578.7f, 456.2f, 571.5f, 446.6f, 581.0f)
                curveTo(438.1f, 589.5f, 425.6f, 619.8f, 425.2f, 632.3f)
                curveTo(434.8f, 615.4f, 438.0f, 601.9f, 450.1f, 584.7f)
                curveTo(461.9f, 581.5f, 503.4f, 574.7f, 514.6f, 577.8f)
                curveTo(533.2f, 583.8f, 552.7f, 597.9f, 562.6f, 615.0f)
                curveTo(566.9f, 622.3f, 565.9f, 633.5f, 575.1f, 635.7f)
                lineTo(576.9f, 634.3f)
                lineTo(576.9f, 632.5f)
                curveTo(568.2f, 625.9f, 570.1f, 620.0f, 569.8f, 609.4f)
                curveTo(577.5f, 607.3f, 600.2f, 600.4f, 606.8f, 604.3f)
                curveTo(613.6f, 608.3f, 621.8f, 618.3f, 630.3f, 622.6f)
                lineTo(631.2f, 623.0f)
                lineTo(637.4f, 639.4f)
                curveTo(610.8f, 637.1f, 601.0f, 639.6f, 575.1f, 646.1f)
                curveTo(566.4f, 648.5f, 550.6f, 646.3f, 542.7f, 647.6f)
                curveTo(528.9f, 650.0f, 482.6f, 630.6f, 474.9f, 640.5f)
                curveTo(475.2f, 649.5f, 486.1f, 649.1f, 493.1f, 649.1f)
                curveTo(503.3f, 649.1f, 511.7f, 649.6f, 521.7f, 651.3f)
                curveTo(538.7f, 655.2f, 556.1f, 656.4f, 573.4f, 655.0f)
                curveTo(578.9f, 654.5f, 604.3f, 648.4f, 605.5f, 648.8f)
                curveTo(607.0f, 654.6f, 604.2f, 664.8f, 601.6f, 670.3f)
                curveTo(582.5f, 675.4f, 558.6f, 675.8f, 538.7f, 676.1f)
                lineTo(533.8f, 687.2f)
                curveTo(572.8f, 699.3f, 582.6f, 694.9f, 619.6f, 687.3f)
                curveTo(623.1f, 697.6f, 624.7f, 711.5f, 626.9f, 722.6f)
                curveTo(619.1f, 726.8f, 609.7f, 733.1f, 601.6f, 736.6f)
                curveTo(585.0f, 743.7f, 561.2f, 741.8f, 543.2f, 741.7f)
                curveTo(531.6f, 741.1f, 519.0f, 741.3f, 508.0f, 737.3f)
                curveTo(491.7f, 731.4f, 479.0f, 719.7f, 464.6f, 710.5f)
                curveTo(456.3f, 705.2f, 447.4f, 700.6f, 439.1f, 695.5f)
                curveTo(414.6f, 680.5f, 390.9f, 664.6f, 367.9f, 647.6f)
                curveTo(352.7f, 636.5f, 343.5f, 632.3f, 336.8f, 613.5f)
                curveTo(328.6f, 590.3f, 321.4f, 568.6f, 322.4f, 543.5f)
                lineTo(310.8f, 552.6f)
                curveTo(293.7f, 539.5f, 295.2f, 529.4f, 285.0f, 514.4f)
                curveTo(268.5f, 490.1f, 252.3f, 477.7f, 256.1f, 445.1f)
                curveTo(258.3f, 425.4f, 259.5f, 417.0f, 275.5f, 403.1f)
                curveTo(283.0f, 406.0f, 284.9f, 406.6f, 290.8f, 412.2f)
                curveTo(292.0f, 416.1f, 293.8f, 420.9f, 293.2f, 424.7f)
                lineTo(292.0f, 425.1f)
                curveTo(288.0f, 421.6f, 284.8f, 415.0f, 282.1f, 410.3f)
                curveTo(248.5f, 432.7f, 264.0f, 466.0f, 282.5f, 491.6f)
                curveTo(297.0f, 511.6f, 305.8f, 519.2f, 324.5f, 535.4f)
                curveTo(317.7f, 520.1f, 309.3f, 505.5f, 303.1f, 490.1f)
                curveTo(297.5f, 476.1f, 302.7f, 469.5f, 304.2f, 456.3f)
                curveTo(304.6f, 452.5f, 297.6f, 443.5f, 300.5f, 438.5f)
                curveTo(301.5f, 439.3f, 326.0f, 497.4f, 329.5f, 504.6f)
                curveTo(328.9f, 501.1f, 327.1f, 494.8f, 327.0f, 491.5f)
                curveTo(326.9f, 481.2f, 328.9f, 468.6f, 328.3f, 458.4f)
                curveTo(327.3f, 442.6f, 323.9f, 426.3f, 324.1f, 410.4f)
                curveTo(324.3f, 387.2f, 328.9f, 363.0f, 347.2f, 347.1f)
                curveTo(355.0f, 340.2f, 360.9f, 337.6f, 368.9f, 329.5f)
                curveTo(364.0f, 326.0f, 359.4f, 323.2f, 355.6f, 318.3f)
                curveTo(341.6f, 300.2f, 350.4f, 257.8f, 353.6f, 235.9f)
                curveTo(351.2f, 232.9f, 350.3f, 235.9f, 347.2f, 232.6f)
                curveTo(357.9f, 206.0f, 375.7f, 202.3f, 398.5f, 189.4f)
                curveTo(399.6f, 188.8f, 401.2f, 184.3f, 401.8f, 182.9f)
                curveTo(415.3f, 181.0f, 429.3f, 182.4f, 442.5f, 181.2f)
                curveTo(459.7f, 179.6f, 459.5f, 174.4f, 476.7f, 181.4f)
                curveTo(472.6f, 194.9f, 456.0f, 261.4f, 466.4f, 268.8f)
                curveTo(469.0f, 266.2f, 467.5f, 250.9f, 468.9f, 245.6f)
                curveTo(474.2f, 225.5f, 482.6f, 195.7f, 493.7f, 178.6f)
                curveTo(498.0f, 172.0f, 510.0f, 172.5f, 515.5f, 174.0f)
                curveTo(516.8f, 174.3f, 518.3f, 171.1f, 519.2f, 169.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(434.3f, 380.4f)
                curveTo(462.2f, 377.4f, 462.6f, 386.9f, 479.2f, 388.1f)
                curveTo(480.6f, 385.0f, 480.3f, 384.4f, 483.2f, 385.5f)
                curveTo(504.3f, 393.1f, 525.6f, 400.3f, 546.8f, 407.3f)
                curveTo(546.8f, 407.3f, 552.2f, 405.7f, 552.8f, 405.5f)
                lineTo(553.9f, 406.5f)
                curveTo(554.6f, 422.3f, 533.1f, 429.2f, 522.5f, 434.9f)
                curveTo(521.0f, 435.8f, 517.5f, 440.3f, 516.3f, 441.8f)
                curveTo(518.2f, 446.8f, 529.3f, 464.3f, 533.2f, 472.5f)
                curveTo(528.1f, 475.9f, 522.1f, 478.8f, 517.2f, 482.2f)
                curveTo(508.3f, 488.3f, 500.0f, 498.0f, 492.5f, 505.9f)
                curveTo(485.9f, 506.1f, 478.5f, 505.9f, 471.8f, 505.8f)
                curveTo(483.5f, 499.6f, 497.2f, 486.7f, 505.1f, 476.4f)
                curveTo(500.2f, 477.9f, 492.6f, 481.6f, 487.7f, 483.9f)
                curveTo(494.6f, 469.2f, 500.8f, 471.2f, 500.2f, 456.8f)
                curveTo(495.3f, 452.2f, 486.4f, 438.5f, 481.5f, 437.5f)
                lineTo(480.3f, 438.8f)
                curveTo(479.3f, 443.3f, 481.4f, 449.2f, 482.5f, 453.8f)
                curveTo(476.9f, 472.1f, 470.4f, 476.5f, 452.2f, 480.4f)
                curveTo(447.6f, 478.4f, 444.5f, 477.1f, 440.6f, 473.9f)
                curveTo(435.7f, 469.8f, 426.8f, 458.1f, 420.2f, 458.8f)
                lineTo(419.7f, 460.8f)
                curveTo(423.2f, 471.3f, 446.3f, 486.9f, 457.7f, 486.9f)
                curveTo(462.3f, 487.0f, 471.7f, 485.8f, 474.0f, 489.0f)
                lineTo(473.1f, 491.6f)
                curveTo(472.6f, 492.1f, 471.7f, 492.9f, 471.0f, 493.1f)
                curveTo(451.7f, 498.2f, 428.9f, 482.1f, 418.3f, 466.9f)
                curveTo(410.3f, 455.4f, 418.7f, 458.7f, 403.4f, 450.6f)
                curveTo(404.6f, 449.0f, 411.1f, 448.4f, 412.1f, 447.1f)
                curveTo(427.2f, 428.1f, 447.3f, 425.1f, 472.6f, 423.8f)
                lineTo(478.6f, 417.3f)
                curveTo(470.2f, 417.2f, 430.7f, 420.5f, 427.1f, 419.5f)
                lineTo(426.5f, 418.3f)
                curveTo(427.4f, 417.4f, 434.7f, 414.6f, 436.9f, 413.6f)
                curveTo(429.4f, 412.1f, 405.0f, 416.4f, 396.6f, 417.8f)
                curveTo(394.1f, 415.6f, 392.0f, 411.8f, 390.1f, 408.9f)
                curveTo(390.0f, 405.2f, 389.5f, 405.9f, 391.4f, 403.6f)
                curveTo(395.4f, 403.1f, 396.9f, 403.5f, 398.6f, 400.0f)
                curveTo(397.5f, 397.7f, 394.1f, 397.2f, 391.0f, 396.0f)
                lineTo(390.1f, 394.1f)
                curveTo(392.0f, 383.2f, 424.8f, 381.4f, 434.3f, 380.4f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF000000), 1.0f to Color(0xFF16101A), start =
                    Offset(495.2f,315.3f), end = Offset(494.2f,320.0f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(464.0f, 310.4f)
                curveTo(481.9f, 308.3f, 517.2f, 317.3f, 530.4f, 329.4f)
                curveTo(519.8f, 326.0f, 509.6f, 324.0f, 498.2f, 321.3f)
                curveTo(488.3f, 318.9f, 475.3f, 315.8f, 465.3f, 312.5f)
                curveTo(464.8f, 311.6f, 464.4f, 310.9f, 464.0f, 310.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.7f, 298.9f)
                curveTo(244.1f, 290.0f, 243.6f, 289.3f, 243.0f, 279.8f)
                curveTo(244.4f, 279.9f, 246.6f, 280.5f, 247.3f, 279.7f)
                curveTo(249.8f, 276.9f, 263.1f, 264.8f, 263.7f, 262.4f)
                lineTo(263.0f, 259.7f)
                curveTo(273.5f, 244.6f, 312.4f, 235.1f, 330.4f, 230.0f)
                curveTo(329.4f, 241.0f, 326.1f, 254.5f, 323.6f, 265.5f)
                curveTo(319.4f, 266.6f, 313.3f, 268.3f, 310.2f, 271.6f)
                lineTo(310.3f, 273.2f)
                curveTo(314.0f, 274.9f, 319.8f, 276.5f, 321.3f, 279.5f)
                curveTo(320.0f, 285.7f, 313.3f, 289.0f, 308.5f, 293.3f)
                curveTo(304.7f, 296.8f, 302.9f, 292.5f, 300.3f, 295.6f)
                curveTo(303.7f, 299.1f, 303.7f, 298.0f, 304.0f, 301.9f)
                curveTo(302.8f, 303.9f, 301.9f, 305.3f, 301.0f, 307.5f)
                curveTo(305.5f, 307.0f, 315.6f, 301.4f, 323.2f, 305.9f)
                lineTo(324.0f, 307.6f)
                lineTo(323.3f, 308.7f)
                curveTo(304.9f, 312.4f, 299.4f, 314.8f, 281.5f, 322.5f)
                curveTo(281.5f, 329.0f, 288.7f, 334.1f, 287.1f, 340.0f)
                curveTo(283.2f, 343.7f, 256.1f, 359.5f, 250.7f, 356.1f)
                lineTo(250.8f, 353.4f)
                lineTo(251.3f, 353.1f)
                curveTo(253.2f, 351.8f, 253.3f, 351.7f, 254.7f, 349.8f)
                curveTo(254.6f, 343.9f, 250.3f, 346.3f, 254.7f, 341.5f)
                curveTo(257.4f, 338.6f, 262.7f, 334.8f, 266.1f, 332.4f)
                lineTo(264.3f, 331.1f)
                curveTo(258.0f, 332.9f, 250.4f, 335.2f, 244.1f, 336.5f)
                lineTo(263.0f, 317.9f)
                curveTo(263.3f, 314.5f, 263.6f, 310.8f, 264.2f, 307.5f)
                lineTo(248.3f, 313.1f)
                lineTo(240.2f, 306.7f)
                curveTo(245.9f, 303.4f, 260.0f, 295.4f, 262.3f, 289.6f)
                lineTo(260.7f, 288.5f)
                curveTo(251.0f, 291.5f, 249.8f, 293.1f, 241.7f, 298.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfefefe)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(264.3f, 331.1f)
                curveTo(267.7f, 329.0f, 271.2f, 326.3f, 275.2f, 325.9f)
                curveTo(274.7f, 328.7f, 268.5f, 330.7f, 266.1f, 332.4f)
                lineTo(264.3f, 331.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(647.2f, 481.8f)
                curveTo(669.3f, 473.5f, 675.7f, 477.3f, 680.4f, 450.5f)
                curveTo(683.8f, 449.5f, 685.8f, 451.7f, 687.4f, 454.5f)
                curveTo(688.6f, 459.5f, 686.9f, 467.1f, 684.1f, 471.4f)
                lineTo(683.7f, 471.9f)
                curveTo(679.8f, 477.8f, 671.0f, 485.2f, 665.9f, 490.6f)
                curveTo(674.9f, 486.8f, 683.0f, 483.9f, 691.2f, 478.5f)
                curveTo(692.7f, 481.6f, 695.4f, 485.9f, 694.5f, 489.1f)
                curveTo(692.6f, 490.9f, 692.1f, 490.8f, 689.5f, 491.6f)
                lineTo(688.9f, 493.5f)
                lineTo(689.7f, 495.1f)
                curveTo(692.7f, 495.3f, 694.0f, 495.0f, 696.9f, 494.6f)
                curveTo(703.7f, 502.7f, 685.9f, 538.5f, 681.7f, 547.1f)
                curveTo(674.2f, 543.9f, 663.7f, 540.7f, 657.0f, 537.6f)
                curveTo(654.6f, 531.6f, 646.1f, 510.1f, 648.6f, 508.7f)
                curveTo(667.0f, 499.0f, 642.5f, 499.0f, 642.0f, 486.0f)
                curveTo(643.5f, 484.3f, 644.2f, 483.5f, 645.8f, 482.0f)
                lineTo(647.2f, 481.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(381.1f, 137.8f)
                curveTo(384.8f, 138.1f, 385.6f, 138.2f, 389.1f, 139.5f)
                curveTo(389.9f, 141.4f, 389.9f, 141.7f, 391.2f, 143.3f)
                lineTo(394.0f, 142.9f)
                lineTo(396.2f, 139.6f)
                curveTo(400.6f, 139.3f, 404.0f, 142.3f, 407.4f, 145.1f)
                lineTo(407.3f, 146.5f)
                curveTo(401.5f, 147.6f, 400.3f, 148.0f, 395.7f, 151.5f)
                lineTo(395.3f, 151.8f)
                curveTo(395.1f, 157.3f, 394.3f, 162.9f, 393.6f, 168.3f)
                curveTo(389.5f, 171.0f, 373.5f, 177.9f, 372.5f, 180.5f)
                curveTo(375.0f, 181.3f, 375.9f, 181.7f, 378.1f, 182.9f)
                lineTo(378.1f, 184.5f)
                lineTo(376.9f, 185.2f)
                curveTo(374.2f, 184.8f, 364.2f, 181.9f, 362.2f, 179.0f)
                curveTo(362.1f, 178.7f, 362.7f, 175.4f, 361.4f, 173.2f)
                curveTo(354.6f, 172.8f, 358.7f, 175.2f, 351.2f, 172.4f)
                curveTo(344.5f, 170.1f, 336.5f, 170.6f, 331.6f, 168.3f)
                lineTo(331.2f, 166.4f)
                curveTo(339.3f, 155.3f, 349.0f, 166.7f, 359.7f, 163.3f)
                curveTo(358.2f, 160.5f, 351.5f, 159.0f, 347.7f, 154.8f)
                lineTo(348.7f, 153.6f)
                curveTo(356.4f, 152.2f, 369.3f, 153.2f, 377.1f, 154.3f)
                curveTo(373.9f, 152.2f, 362.5f, 142.1f, 362.0f, 142.0f)
                curveTo(368.0f, 142.5f, 372.1f, 143.7f, 377.9f, 144.7f)
                curveTo(379.4f, 142.8f, 380.2f, 140.1f, 381.1f, 137.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(422.9f, 118.8f)
                curveTo(431.5f, 118.8f, 439.5f, 128.8f, 445.3f, 134.8f)
                curveTo(441.1f, 139.2f, 437.2f, 147.8f, 431.2f, 148.4f)
                curveTo(427.5f, 147.8f, 425.4f, 145.1f, 422.6f, 142.4f)
                curveTo(413.2f, 136.3f, 407.8f, 133.9f, 397.3f, 130.1f)
                curveTo(406.7f, 127.1f, 423.0f, 127.1f, 426.0f, 124.7f)
                lineTo(426.2f, 122.5f)
                lineTo(422.9f, 118.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(306.2f, 219.1f)
                curveTo(310.7f, 218.9f, 314.4f, 218.6f, 318.7f, 219.8f)
                lineTo(318.7f, 220.3f)
                curveTo(311.2f, 224.8f, 310.0f, 223.3f, 309.9f, 232.1f)
                curveTo(306.4f, 236.5f, 282.1f, 240.9f, 275.8f, 242.0f)
                lineTo(258.7f, 245.8f)
                curveTo(273.2f, 232.4f, 287.4f, 224.6f, 306.2f, 219.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(305.5f, 326.0f)
                curveTo(315.1f, 326.9f, 325.2f, 346.8f, 305.3f, 353.0f)
                curveTo(299.4f, 352.0f, 292.8f, 346.3f, 293.8f, 339.9f)
                curveTo(294.9f, 332.6f, 300.0f, 329.9f, 305.5f, 326.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(284.8f, 439.7f)
                curveTo(285.6f, 440.4f, 286.7f, 441.4f, 287.1f, 442.4f)
                curveTo(289.1f, 447.2f, 298.3f, 449.9f, 303.3f, 451.8f)
                curveTo(296.4f, 452.8f, 291.0f, 452.8f, 284.0f, 452.9f)
                curveTo(283.7f, 463.9f, 286.0f, 474.9f, 287.2f, 486.1f)
                lineTo(286.5f, 487.6f)
                lineTo(285.1f, 487.1f)
                curveTo(263.3f, 455.2f, 276.4f, 474.5f, 278.5f, 447.5f)
                curveTo(280.0f, 445.1f, 282.8f, 441.9f, 284.8f, 439.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(530.3f, 121.1f)
                curveTo(543.1f, 124.5f, 548.6f, 132.0f, 554.3f, 143.1f)
                curveTo(545.8f, 136.7f, 540.8f, 133.5f, 531.3f, 129.0f)
                curveTo(526.6f, 130.7f, 523.8f, 132.0f, 519.3f, 134.2f)
                curveTo(511.5f, 139.1f, 504.3f, 146.9f, 497.7f, 153.5f)
                curveTo(499.0f, 151.1f, 500.2f, 148.7f, 501.5f, 146.3f)
                curveTo(509.2f, 132.5f, 515.0f, 125.5f, 530.3f, 121.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(673.6f, 412.0f)
                curveTo(686.6f, 411.4f, 691.3f, 430.8f, 693.9f, 440.1f)
                lineTo(682.1f, 429.7f)
                lineTo(675.6f, 425.1f)
                curveTo(666.7f, 424.4f, 663.2f, 424.1f, 654.3f, 425.0f)
                curveTo(661.6f, 419.4f, 665.5f, 416.2f, 673.6f, 412.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(410.5f, 149.1f)
                curveTo(415.4f, 149.6f, 425.8f, 157.9f, 426.0f, 163.2f)
                curveTo(422.2f, 164.8f, 419.2f, 161.0f, 412.8f, 161.9f)
                curveTo(405.1f, 160.2f, 406.0f, 162.9f, 402.0f, 169.7f)
                lineTo(401.2f, 169.1f)
                curveTo(401.2f, 169.1f, 401.2f, 169.1f, 401.1f, 169.1f)
                curveTo(400.8f, 156.4f, 400.3f, 156.8f, 410.5f, 149.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(308.0f, 314.3f)
                curveTo(314.3f, 313.9f, 328.5f, 312.1f, 332.6f, 316.5f)
                curveTo(331.7f, 319.8f, 331.0f, 319.4f, 327.7f, 321.9f)
                curveTo(318.8f, 329.0f, 308.5f, 324.0f, 308.0f, 314.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD6D7D5)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(645.8f, 482.0f)
                curveTo(639.5f, 480.3f, 634.0f, 476.4f, 630.2f, 471.0f)
                curveTo(628.3f, 468.3f, 627.0f, 466.2f, 627.5f, 463.0f)
                lineTo(629.6f, 463.4f)
                curveTo(631.7f, 465.2f, 646.0f, 479.4f, 647.2f, 481.8f)
                lineTo(645.8f, 482.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD6D7D5)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(299.7f, 357.0f)
                curveTo(303.3f, 358.7f, 302.3f, 357.6f, 303.9f, 360.9f)
                curveTo(304.4f, 367.7f, 300.7f, 371.8f, 297.0f, 377.3f)
                lineTo(295.0f, 377.8f)
                lineTo(294.2f, 376.6f)
                curveTo(293.5f, 366.8f, 294.9f, 365.3f, 299.7f, 357.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD6D7D5)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(310.3f, 360.2f)
                curveTo(315.9f, 364.1f, 318.3f, 361.7f, 323.3f, 364.5f)
                lineTo(322.6f, 365.9f)
                lineTo(319.6f, 366.8f)
                curveTo(315.0f, 368.4f, 314.7f, 370.6f, 310.5f, 370.7f)
                curveTo(309.2f, 368.2f, 310.0f, 363.4f, 310.3f, 360.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD6D7D5)), stroke = null, fillAlpha = 0.988235f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(442.8f, 148.3f)
                curveTo(447.1f, 149.2f, 451.4f, 153.2f, 452.3f, 157.6f)
                lineTo(450.4f, 159.9f)
                curveTo(446.3f, 155.9f, 441.6f, 155.0f, 440.0f, 151.3f)
                lineTo(442.8f, 148.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD6D7D5)), stroke = null, fillAlpha = 0.988235f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(448.0f, 137.3f)
                curveTo(453.4f, 139.1f, 457.5f, 145.7f, 457.1f, 151.3f)
                curveTo(452.3f, 149.8f, 448.2f, 142.4f, 448.0f, 137.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD6D7D5)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(285.6f, 353.3f)
                curveTo(291.1f, 352.3f, 295.8f, 351.2f, 298.6f, 356.8f)
                curveTo(294.3f, 357.2f, 286.5f, 358.7f, 285.6f, 353.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD6D7D5)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(332.9f, 337.0f)
                curveTo(333.8f, 337.7f, 333.4f, 337.3f, 333.7f, 338.9f)
                lineTo(327.1f, 347.9f)
                curveTo(325.6f, 345.6f, 325.4f, 345.3f, 325.4f, 342.5f)
                curveTo(326.6f, 339.6f, 330.0f, 338.5f, 332.9f, 337.0f)
                close()
            }
        }
        .build()
        return _standardToranosukeYoshida!!
    }

private var _standardToranosukeYoshida: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = StandardSenderAvatar.StandardToranosukeYoshida, contentDescription = "")
    }
}
