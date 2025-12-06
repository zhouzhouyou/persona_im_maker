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

public val StandardSenderAvatar.StandardFutabaSakura: ImageVector
    get() {
        if (_standardFutabaSakura != null) {
            return _standardFutabaSakura!!
        }
        _standardFutabaSakura = Builder(name = "StandardFutabaSakura", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 1024.0f, viewportHeight = 1024.0f).apply {
            path(fill = SolidColor(Color(0xFF010101)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(477.1f, 69.5f)
                curveTo(543.4f, 68.1f, 619.7f, 98.7f, 664.1f, 148.1f)
                curveTo(669.8f, 154.4f, 674.0f, 161.5f, 679.3f, 167.6f)
                curveTo(713.5f, 207.0f, 724.0f, 263.2f, 734.8f, 312.6f)
                curveTo(739.2f, 332.8f, 748.8f, 335.8f, 759.4f, 351.7f)
                curveTo(771.1f, 369.4f, 772.9f, 391.5f, 779.0f, 410.9f)
                curveTo(785.2f, 430.4f, 789.9f, 450.0f, 794.9f, 469.4f)
                curveTo(796.0f, 473.6f, 809.8f, 491.1f, 812.8f, 496.5f)
                curveTo(820.5f, 510.3f, 828.4f, 519.7f, 823.2f, 536.8f)
                curveTo(821.7f, 542.3f, 816.3f, 565.5f, 813.1f, 568.5f)
                curveTo(799.0f, 581.3f, 800.3f, 593.7f, 794.7f, 606.7f)
                curveTo(788.6f, 620.8f, 757.0f, 637.4f, 743.4f, 645.9f)
                curveTo(745.1f, 680.3f, 751.3f, 713.8f, 754.1f, 748.0f)
                curveTo(754.8f, 756.9f, 754.2f, 760.6f, 748.5f, 766.7f)
                curveTo(757.0f, 775.9f, 773.8f, 785.8f, 784.3f, 796.7f)
                curveTo(784.2f, 829.1f, 792.9f, 846.0f, 803.0f, 876.5f)
                lineTo(833.3f, 966.9f)
                curveTo(837.6f, 980.0f, 844.3f, 998.4f, 847.2f, 1011.3f)
                curveTo(825.8f, 1012.6f, 796.8f, 1011.8f, 774.8f, 1011.8f)
                lineTo(646.5f, 1011.7f)
                lineTo(241.5f, 1011.7f)
                curveTo(210.2f, 1011.8f, 176.7f, 1012.3f, 145.6f, 1011.3f)
                curveTo(143.5f, 1004.6f, 149.8f, 958.2f, 150.9f, 947.7f)
                curveTo(153.4f, 922.7f, 156.1f, 897.7f, 159.0f, 872.8f)
                curveTo(160.9f, 855.4f, 162.8f, 819.2f, 170.1f, 803.0f)
                curveTo(175.6f, 790.7f, 195.8f, 772.5f, 205.9f, 762.2f)
                curveTo(210.3f, 757.6f, 225.9f, 747.0f, 225.4f, 740.5f)
                curveTo(222.2f, 693.2f, 220.2f, 638.5f, 217.0f, 591.9f)
                curveTo(206.7f, 585.0f, 201.1f, 573.3f, 196.0f, 562.2f)
                curveTo(191.5f, 552.5f, 184.4f, 539.8f, 181.6f, 529.6f)
                curveTo(174.6f, 503.0f, 171.0f, 472.8f, 172.7f, 445.4f)
                curveTo(173.7f, 428.4f, 182.6f, 408.3f, 183.1f, 395.1f)
                curveTo(181.8f, 373.1f, 181.8f, 349.8f, 181.8f, 328.1f)
                curveTo(181.6f, 283.9f, 200.3f, 255.3f, 221.8f, 218.4f)
                curveTo(228.0f, 207.9f, 234.3f, 192.1f, 242.2f, 182.1f)
                curveTo(260.0f, 159.6f, 280.8f, 137.3f, 304.0f, 120.2f)
                curveTo(313.5f, 113.5f, 319.9f, 112.3f, 329.4f, 103.9f)
                curveTo(303.3f, 104.3f, 266.4f, 121.0f, 246.2f, 136.9f)
                curveTo(220.0f, 157.5f, 174.3f, 209.5f, 163.3f, 240.1f)
                lineTo(163.1f, 240.6f)
                lineTo(161.9f, 240.6f)
                curveTo(156.8f, 230.0f, 180.1f, 190.1f, 186.5f, 180.8f)
                curveTo(192.3f, 172.3f, 197.2f, 155.7f, 205.0f, 148.4f)
                curveTo(223.1f, 131.4f, 240.3f, 110.9f, 261.5f, 97.7f)
                curveTo(274.6f, 91.4f, 313.8f, 86.7f, 329.3f, 85.9f)
                curveTo(338.4f, 84.5f, 353.6f, 88.8f, 362.2f, 86.6f)
                curveTo(400.4f, 76.9f, 437.4f, 70.9f, 477.1f, 69.5f)
                close()
                moveTo(267.4f, 715.1f)
                curveTo(271.3f, 712.1f, 278.8f, 706.0f, 282.7f, 703.7f)
                curveTo(285.8f, 701.4f, 292.8f, 696.8f, 293.0f, 692.8f)
                curveTo(293.4f, 684.7f, 272.6f, 657.9f, 266.2f, 655.3f)
                curveTo(266.3f, 673.2f, 265.8f, 697.5f, 267.4f, 715.1f)
                close()
                moveTo(392.6f, 330.3f)
                curveTo(393.1f, 325.8f, 394.2f, 319.7f, 393.3f, 315.3f)
                lineTo(391.2f, 313.6f)
                curveTo(389.7f, 318.8f, 389.8f, 323.7f, 391.2f, 328.9f)
                lineTo(392.6f, 330.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(470.7f, 409.4f)
                curveTo(474.6f, 409.0f, 481.4f, 409.4f, 485.6f, 409.4f)
                curveTo(485.6f, 415.4f, 485.8f, 421.8f, 486.0f, 427.8f)
                curveTo(492.6f, 427.9f, 503.8f, 431.3f, 508.1f, 429.6f)
                curveTo(511.8f, 426.5f, 512.5f, 416.4f, 513.4f, 411.2f)
                curveTo(521.7f, 412.0f, 525.3f, 412.5f, 533.3f, 414.7f)
                curveTo(534.2f, 420.7f, 534.6f, 425.6f, 534.9f, 431.7f)
                curveTo(549.5f, 431.8f, 554.8f, 439.2f, 564.3f, 427.0f)
                curveTo(565.2f, 438.8f, 569.4f, 454.3f, 571.6f, 466.5f)
                curveTo(575.0f, 485.2f, 575.9f, 498.6f, 575.9f, 517.2f)
                curveTo(569.1f, 511.7f, 560.8f, 508.9f, 554.7f, 503.4f)
                curveTo(552.4f, 501.4f, 557.2f, 492.0f, 556.3f, 484.6f)
                curveTo(554.6f, 470.5f, 547.4f, 468.4f, 543.6f, 461.3f)
                curveTo(545.2f, 458.5f, 548.1f, 458.1f, 551.7f, 456.6f)
                lineTo(552.0f, 455.3f)
                curveTo(546.0f, 449.6f, 538.6f, 458.5f, 531.8f, 452.3f)
                curveTo(532.2f, 449.4f, 533.8f, 448.5f, 536.2f, 445.9f)
                lineTo(535.5f, 444.9f)
                curveTo(530.9f, 444.0f, 530.1f, 447.8f, 525.1f, 448.0f)
                curveTo(513.7f, 448.3f, 501.8f, 448.1f, 490.5f, 448.0f)
                curveTo(494.5f, 444.2f, 502.4f, 439.0f, 498.8f, 433.5f)
                curveTo(490.0f, 429.0f, 459.3f, 432.5f, 450.2f, 439.4f)
                curveTo(449.0f, 440.3f, 448.4f, 445.9f, 448.9f, 447.8f)
                curveTo(450.2f, 448.9f, 451.3f, 449.9f, 453.2f, 449.0f)
                curveTo(468.7f, 441.9f, 482.5f, 437.4f, 499.9f, 436.0f)
                curveTo(492.3f, 439.9f, 488.9f, 443.4f, 483.2f, 449.6f)
                curveTo(481.0f, 452.0f, 474.9f, 446.3f, 470.8f, 450.3f)
                curveTo(472.6f, 457.1f, 465.6f, 466.7f, 459.9f, 469.1f)
                curveTo(458.9f, 467.7f, 458.0f, 466.3f, 457.1f, 464.8f)
                lineTo(455.8f, 465.3f)
                lineTo(455.1f, 467.4f)
                curveTo(459.6f, 476.1f, 453.0f, 476.5f, 452.4f, 486.4f)
                curveTo(453.9f, 485.9f, 454.9f, 485.7f, 456.5f, 485.4f)
                curveTo(469.0f, 498.6f, 436.5f, 500.5f, 430.1f, 504.6f)
                curveTo(422.5f, 509.4f, 420.7f, 511.4f, 415.2f, 518.3f)
                curveTo(407.4f, 529.5f, 403.8f, 533.8f, 402.7f, 547.5f)
                curveTo(391.6f, 542.1f, 380.7f, 540.9f, 368.6f, 538.9f)
                curveTo(360.6f, 531.2f, 356.0f, 520.6f, 347.4f, 514.9f)
                curveTo(343.4f, 512.3f, 342.5f, 513.0f, 340.8f, 509.0f)
                curveTo(343.5f, 504.8f, 345.5f, 507.9f, 347.7f, 504.1f)
                curveTo(341.7f, 499.4f, 342.7f, 503.3f, 339.1f, 495.0f)
                curveTo(334.4f, 484.1f, 326.5f, 469.2f, 314.3f, 465.7f)
                curveTo(309.4f, 464.2f, 281.1f, 456.2f, 277.9f, 457.5f)
                lineTo(275.8f, 462.9f)
                curveTo(271.9f, 464.4f, 273.7f, 460.7f, 268.1f, 458.9f)
                curveTo(265.8f, 459.9f, 266.6f, 459.2f, 265.3f, 461.4f)
                curveTo(266.6f, 463.8f, 270.0f, 465.6f, 272.5f, 467.2f)
                curveTo(270.2f, 472.8f, 266.7f, 478.7f, 264.4f, 484.5f)
                curveTo(261.4f, 492.5f, 265.0f, 491.6f, 268.3f, 498.6f)
                lineTo(267.6f, 500.6f)
                curveTo(264.0f, 502.7f, 262.2f, 504.7f, 258.7f, 504.4f)
                curveTo(258.3f, 504.0f, 257.3f, 503.0f, 257.1f, 502.6f)
                curveTo(245.0f, 478.8f, 247.1f, 472.2f, 251.5f, 448.7f)
                curveTo(259.4f, 450.2f, 265.9f, 451.4f, 273.9f, 452.4f)
                curveTo(273.5f, 440.0f, 273.6f, 427.5f, 275.0f, 415.2f)
                curveTo(283.5f, 421.3f, 285.8f, 425.6f, 291.0f, 434.4f)
                curveTo(299.3f, 436.9f, 319.5f, 440.8f, 328.1f, 441.4f)
                curveTo(330.8f, 439.8f, 332.4f, 430.9f, 333.4f, 427.1f)
                curveTo(334.8f, 433.1f, 335.4f, 438.1f, 336.2f, 444.2f)
                curveTo(357.3f, 446.7f, 389.7f, 449.9f, 409.6f, 444.1f)
                curveTo(413.3f, 438.6f, 416.6f, 431.9f, 419.7f, 425.9f)
                curveTo(419.8f, 431.5f, 420.7f, 436.7f, 421.6f, 442.2f)
                lineTo(431.5f, 442.6f)
                curveTo(432.2f, 434.9f, 433.9f, 429.1f, 433.8f, 421.0f)
                curveTo(449.6f, 412.7f, 452.9f, 410.5f, 470.7f, 409.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF010101)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(296.0f, 444.2f)
                curveTo(314.0f, 442.5f, 329.2f, 457.6f, 333.7f, 474.1f)
                curveTo(332.4f, 473.3f, 327.7f, 470.1f, 327.0f, 469.0f)
                curveTo(323.6f, 463.5f, 297.5f, 447.9f, 296.0f, 444.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(375.4f, 565.2f)
                curveTo(383.2f, 566.3f, 394.0f, 565.0f, 401.0f, 568.9f)
                curveTo(408.8f, 573.2f, 414.1f, 614.2f, 451.1f, 632.8f)
                curveTo(472.5f, 643.6f, 504.3f, 643.3f, 526.7f, 636.0f)
                curveTo(529.1f, 643.1f, 535.0f, 651.2f, 539.3f, 657.4f)
                curveTo(536.1f, 661.9f, 532.6f, 667.7f, 529.9f, 672.5f)
                curveTo(512.2f, 704.2f, 490.1f, 736.4f, 474.2f, 769.0f)
                curveTo(470.8f, 751.5f, 462.8f, 743.0f, 456.2f, 727.4f)
                curveTo(454.0f, 722.3f, 453.7f, 714.4f, 453.1f, 708.7f)
                curveTo(461.3f, 706.0f, 469.1f, 703.5f, 477.0f, 700.2f)
                curveTo(489.5f, 693.5f, 500.2f, 676.1f, 509.5f, 664.5f)
                curveTo(472.3f, 678.8f, 448.8f, 698.2f, 408.9f, 712.3f)
                curveTo(399.4f, 705.4f, 391.0f, 693.7f, 382.5f, 687.8f)
                curveTo(361.3f, 673.0f, 343.5f, 659.0f, 324.1f, 641.8f)
                curveTo(341.8f, 635.3f, 354.7f, 627.4f, 365.6f, 612.0f)
                curveTo(366.6f, 615.0f, 367.5f, 618.0f, 369.3f, 620.6f)
                curveTo(372.2f, 624.9f, 383.5f, 624.9f, 387.2f, 622.0f)
                curveTo(374.7f, 612.4f, 376.5f, 618.8f, 368.0f, 603.3f)
                curveTo(369.1f, 591.4f, 372.7f, 577.0f, 375.4f, 565.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF010101)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(368.6f, 642.9f)
                curveTo(386.4f, 647.5f, 408.5f, 649.9f, 426.8f, 649.2f)
                curveTo(430.8f, 649.0f, 437.9f, 646.1f, 440.1f, 650.3f)
                curveTo(438.2f, 653.1f, 439.3f, 652.3f, 435.8f, 653.3f)
                curveTo(416.9f, 655.8f, 388.9f, 666.5f, 370.0f, 650.9f)
                curveTo(367.8f, 649.1f, 368.5f, 645.6f, 368.6f, 642.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF010101)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.5f, 667.1f)
                curveTo(392.6f, 666.0f, 403.3f, 667.4f, 405.7f, 676.2f)
                curveTo(398.8f, 676.5f, 387.2f, 674.2f, 384.5f, 667.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(547.5f, 517.2f)
                curveTo(554.3f, 523.2f, 565.6f, 533.2f, 565.8f, 543.1f)
                curveTo(566.1f, 562.3f, 561.3f, 586.9f, 549.4f, 602.3f)
                curveTo(526.5f, 632.0f, 475.8f, 640.7f, 445.6f, 617.5f)
                curveTo(419.9f, 598.8f, 408.6f, 550.6f, 429.1f, 525.0f)
                curveTo(437.1f, 515.1f, 448.8f, 508.7f, 461.5f, 507.3f)
                curveTo(465.1f, 506.9f, 463.2f, 511.7f, 466.9f, 514.6f)
                curveTo(469.3f, 512.1f, 469.7f, 507.2f, 473.2f, 505.8f)
                curveTo(487.4f, 500.0f, 492.8f, 514.1f, 501.4f, 521.1f)
                curveTo(503.7f, 523.0f, 510.5f, 524.4f, 513.3f, 525.0f)
                curveTo(515.8f, 524.4f, 519.0f, 523.4f, 521.5f, 522.6f)
                curveTo(525.2f, 523.1f, 527.5f, 522.7f, 529.9f, 526.3f)
                curveTo(523.1f, 530.5f, 518.1f, 533.5f, 510.0f, 534.7f)
                curveTo(513.7f, 539.0f, 519.1f, 537.1f, 526.7f, 537.8f)
                curveTo(533.1f, 529.5f, 541.1f, 525.6f, 547.5f, 517.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(382.8f, 126.5f)
                curveTo(387.0f, 128.1f, 391.5f, 136.9f, 393.8f, 140.9f)
                curveTo(386.3f, 148.7f, 385.3f, 148.7f, 374.8f, 151.4f)
                curveTo(374.1f, 157.4f, 374.9f, 162.4f, 373.2f, 168.2f)
                curveTo(365.1f, 173.9f, 359.9f, 180.1f, 356.8f, 189.2f)
                curveTo(350.3f, 205.3f, 363.4f, 197.7f, 367.7f, 207.5f)
                curveTo(370.5f, 214.0f, 366.4f, 222.5f, 359.3f, 224.0f)
                curveTo(353.8f, 225.1f, 353.4f, 224.1f, 349.0f, 221.5f)
                curveTo(345.5f, 225.1f, 352.2f, 233.7f, 351.8f, 238.7f)
                curveTo(351.2f, 246.0f, 343.9f, 244.4f, 343.2f, 252.9f)
                curveTo(346.8f, 251.8f, 347.4f, 250.5f, 351.3f, 250.6f)
                curveTo(358.8f, 250.9f, 366.8f, 266.8f, 359.7f, 271.4f)
                curveTo(352.9f, 275.8f, 349.7f, 275.7f, 341.9f, 273.9f)
                curveTo(341.2f, 275.8f, 345.0f, 285.6f, 346.0f, 289.0f)
                curveTo(342.1f, 298.3f, 332.8f, 304.4f, 324.2f, 296.7f)
                curveTo(324.1f, 294.4f, 324.3f, 293.0f, 322.9f, 291.3f)
                lineTo(316.4f, 294.3f)
                curveTo(315.9f, 297.6f, 336.5f, 312.6f, 322.1f, 321.8f)
                curveTo(318.3f, 324.2f, 318.7f, 324.8f, 314.2f, 323.2f)
                curveTo(308.2f, 317.2f, 308.6f, 313.9f, 308.2f, 305.7f)
                curveTo(303.3f, 316.6f, 295.9f, 326.4f, 289.2f, 336.3f)
                curveTo(289.4f, 326.2f, 289.5f, 316.1f, 289.4f, 306.0f)
                curveTo(279.6f, 317.8f, 265.1f, 338.8f, 260.5f, 353.3f)
                curveTo(259.3f, 357.8f, 255.7f, 374.8f, 248.1f, 368.9f)
                curveTo(243.7f, 359.7f, 245.1f, 310.5f, 246.4f, 298.5f)
                curveTo(251.0f, 254.7f, 277.4f, 201.8f, 311.3f, 173.4f)
                curveTo(301.1f, 200.8f, 299.5f, 203.5f, 292.7f, 232.4f)
                curveTo(306.5f, 216.4f, 313.3f, 207.8f, 325.8f, 190.4f)
                curveTo(324.2f, 199.6f, 322.8f, 205.9f, 320.3f, 215.0f)
                curveTo(337.5f, 194.2f, 344.7f, 177.3f, 358.9f, 154.8f)
                curveTo(364.9f, 145.2f, 374.9f, 134.6f, 382.8f, 126.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(282.9f, 513.2f)
                curveTo(303.3f, 511.7f, 293.1f, 523.8f, 309.0f, 529.3f)
                curveTo(317.3f, 532.2f, 327.0f, 528.2f, 334.4f, 524.4f)
                curveTo(342.2f, 525.2f, 353.6f, 545.8f, 355.2f, 553.1f)
                curveTo(358.9f, 569.9f, 359.1f, 591.4f, 350.3f, 606.6f)
                curveTo(342.0f, 620.9f, 330.8f, 625.9f, 315.7f, 630.0f)
                curveTo(301.5f, 615.1f, 290.8f, 597.5f, 282.7f, 578.8f)
                curveTo(278.4f, 567.5f, 275.6f, 555.7f, 274.5f, 543.7f)
                lineTo(260.0f, 556.0f)
                curveTo(259.3f, 575.3f, 260.1f, 583.4f, 265.1f, 602.0f)
                curveTo(253.3f, 580.6f, 244.2f, 550.2f, 255.9f, 527.0f)
                curveTo(262.4f, 522.1f, 268.2f, 519.9f, 275.6f, 516.7f)
                curveTo(288.6f, 527.9f, 280.1f, 524.6f, 280.8f, 531.8f)
                curveTo(286.5f, 533.8f, 295.6f, 535.8f, 301.6f, 537.3f)
                curveTo(301.8f, 534.2f, 286.0f, 518.8f, 282.9f, 513.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(571.4f, 141.6f)
                curveTo(572.1f, 142.1f, 572.5f, 142.3f, 573.0f, 143.1f)
                curveTo(580.3f, 152.0f, 588.2f, 156.4f, 599.0f, 159.5f)
                curveTo(586.3f, 179.2f, 599.0f, 168.6f, 607.8f, 180.6f)
                curveTo(612.7f, 187.1f, 602.1f, 195.5f, 600.5f, 200.2f)
                curveTo(605.7f, 202.8f, 606.5f, 197.9f, 616.4f, 203.5f)
                curveTo(623.7f, 214.8f, 614.3f, 220.3f, 608.5f, 228.6f)
                curveTo(611.7f, 233.4f, 623.3f, 222.5f, 632.3f, 237.6f)
                curveTo(628.9f, 257.9f, 627.2f, 246.5f, 620.3f, 253.6f)
                curveTo(620.0f, 255.9f, 619.0f, 260.5f, 620.0f, 262.3f)
                curveTo(623.6f, 258.8f, 625.8f, 256.1f, 630.7f, 255.0f)
                curveTo(635.9f, 255.7f, 638.5f, 257.7f, 641.7f, 261.8f)
                lineTo(642.2f, 262.6f)
                curveTo(641.7f, 269.4f, 643.1f, 274.6f, 636.5f, 277.5f)
                curveTo(631.8f, 277.3f, 622.6f, 272.7f, 617.8f, 270.6f)
                curveTo(617.3f, 279.3f, 617.1f, 288.2f, 616.8f, 296.9f)
                curveTo(602.4f, 268.2f, 591.3f, 226.8f, 580.1f, 196.5f)
                curveTo(576.1f, 185.6f, 567.2f, 174.0f, 563.3f, 162.5f)
                curveTo(573.7f, 153.9f, 572.6f, 155.0f, 571.4f, 141.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.1f, 298.5f)
                curveTo(468.6f, 303.3f, 482.7f, 361.9f, 483.9f, 372.8f)
                curveTo(484.9f, 382.0f, 485.4f, 394.4f, 485.4f, 404.3f)
                curveTo(472.4f, 402.4f, 465.9f, 402.5f, 452.8f, 403.3f)
                curveTo(444.6f, 404.4f, 440.8f, 404.8f, 433.0f, 407.2f)
                curveTo(436.5f, 366.6f, 446.4f, 335.0f, 464.1f, 298.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(731.6f, 393.8f)
                curveTo(735.9f, 394.9f, 743.9f, 399.8f, 749.4f, 402.0f)
                curveTo(738.3f, 420.6f, 730.8f, 439.0f, 728.2f, 460.8f)
                curveTo(727.4f, 467.5f, 728.8f, 473.1f, 727.6f, 480.3f)
                curveTo(725.7f, 480.5f, 723.8f, 480.7f, 721.8f, 480.9f)
                curveTo(721.3f, 483.2f, 723.1f, 484.5f, 724.7f, 486.4f)
                curveTo(727.5f, 489.7f, 726.9f, 491.5f, 727.5f, 495.8f)
                lineTo(727.2f, 496.3f)
                curveTo(724.2f, 496.6f, 708.3f, 488.6f, 704.3f, 486.8f)
                curveTo(703.7f, 478.3f, 704.2f, 465.4f, 705.6f, 457.2f)
                curveTo(709.9f, 431.4f, 709.7f, 410.9f, 731.6f, 393.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(714.2f, 347.9f)
                lineTo(716.5f, 347.8f)
                curveTo(719.4f, 349.2f, 721.4f, 352.7f, 723.4f, 355.4f)
                curveTo(713.3f, 367.2f, 699.5f, 372.6f, 689.7f, 388.9f)
                curveTo(680.0f, 404.9f, 679.4f, 411.5f, 674.8f, 429.4f)
                curveTo(672.4f, 439.2f, 672.5f, 465.2f, 669.4f, 469.4f)
                curveTo(665.6f, 463.7f, 663.9f, 462.6f, 657.9f, 459.3f)
                curveTo(656.8f, 437.8f, 660.0f, 419.2f, 667.8f, 399.2f)
                curveTo(678.3f, 372.3f, 688.4f, 359.6f, 714.2f, 347.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(395.5f, 230.7f)
                curveTo(411.9f, 231.7f, 413.0f, 248.3f, 399.5f, 256.6f)
                curveTo(381.4f, 253.0f, 379.5f, 239.2f, 395.5f, 230.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(374.5f, 256.1f)
                curveTo(393.9f, 254.9f, 396.5f, 267.8f, 383.0f, 279.2f)
                curveTo(370.8f, 280.0f, 361.3f, 266.7f, 374.5f, 256.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(637.4f, 203.8f)
                lineTo(640.4f, 204.3f)
                curveTo(646.9f, 209.4f, 648.6f, 216.0f, 645.6f, 223.9f)
                curveTo(644.3f, 227.5f, 640.0f, 229.0f, 636.7f, 230.3f)
                curveTo(631.1f, 227.8f, 628.8f, 225.1f, 624.4f, 220.9f)
                lineTo(628.0f, 209.3f)
                curveTo(630.4f, 207.6f, 634.7f, 205.3f, 637.4f, 203.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(366.7f, 228.4f)
                curveTo(373.0f, 227.2f, 379.1f, 231.4f, 380.2f, 237.7f)
                curveTo(381.3f, 244.0f, 377.1f, 250.0f, 370.8f, 251.1f)
                curveTo(364.5f, 252.2f, 358.6f, 248.0f, 357.5f, 241.8f)
                curveTo(356.3f, 235.5f, 360.5f, 229.5f, 366.7f, 228.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(361.4f, 277.8f)
                curveTo(367.1f, 279.3f, 369.4f, 281.3f, 374.1f, 284.6f)
                curveTo(374.1f, 291.7f, 374.2f, 303.6f, 363.8f, 302.4f)
                curveTo(363.3f, 299.7f, 363.2f, 299.1f, 361.9f, 296.6f)
                curveTo(357.3f, 295.3f, 356.7f, 299.3f, 352.0f, 297.9f)
                curveTo(346.6f, 288.1f, 354.4f, 282.2f, 361.4f, 277.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(380.7f, 201.1f)
                curveTo(385.9f, 206.0f, 381.9f, 209.0f, 386.0f, 212.9f)
                curveTo(391.0f, 211.1f, 389.0f, 205.9f, 395.3f, 208.6f)
                curveTo(399.4f, 214.4f, 399.2f, 219.7f, 393.8f, 224.5f)
                lineTo(382.8f, 229.9f)
                curveTo(379.8f, 226.6f, 376.4f, 222.8f, 373.1f, 220.0f)
                curveTo(374.4f, 207.0f, 379.2f, 209.2f, 380.7f, 201.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(647.4f, 233.1f)
                curveTo(649.2f, 233.1f, 650.6f, 233.4f, 652.3f, 233.7f)
                curveTo(658.8f, 238.6f, 659.2f, 247.4f, 655.3f, 254.2f)
                curveTo(652.9f, 256.7f, 649.9f, 256.5f, 646.4f, 256.9f)
                curveTo(632.8f, 248.9f, 630.9f, 237.5f, 647.4f, 233.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(518.8f, 364.6f)
                curveTo(522.9f, 369.4f, 532.5f, 398.8f, 532.4f, 406.3f)
                lineTo(531.0f, 407.2f)
                lineTo(514.5f, 405.5f)
                curveTo(517.7f, 392.8f, 518.3f, 377.7f, 518.8f, 364.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(624.2f, 178.0f)
                curveTo(628.7f, 179.6f, 637.0f, 192.5f, 634.4f, 198.9f)
                curveTo(631.9f, 201.8f, 630.0f, 202.0f, 626.3f, 203.1f)
                curveTo(620.9f, 202.0f, 617.2f, 197.6f, 613.4f, 193.8f)
                lineTo(613.5f, 193.4f)
                curveTo(616.4f, 184.3f, 615.9f, 183.2f, 624.2f, 178.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(367.7f, 178.0f)
                curveTo(370.9f, 177.0f, 373.9f, 175.7f, 377.3f, 176.2f)
                curveTo(382.4f, 180.7f, 379.5f, 193.7f, 380.7f, 201.1f)
                curveTo(361.6f, 200.5f, 359.3f, 192.7f, 367.7f, 178.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(655.1f, 259.8f)
                curveTo(671.4f, 259.8f, 667.0f, 281.1f, 658.7f, 283.3f)
                curveTo(651.6f, 280.9f, 649.6f, 276.8f, 644.9f, 270.9f)
                curveTo(648.4f, 265.4f, 649.6f, 263.2f, 655.1f, 259.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(387.6f, 282.9f)
                curveTo(411.2f, 281.6f, 394.4f, 306.7f, 391.0f, 307.7f)
                lineTo(389.5f, 305.7f)
                curveTo(389.0f, 301.8f, 388.8f, 300.3f, 387.6f, 296.6f)
                lineTo(385.9f, 296.3f)
                curveTo(384.4f, 298.5f, 384.2f, 299.0f, 382.2f, 300.5f)
                lineTo(380.6f, 299.8f)
                curveTo(376.7f, 292.1f, 382.6f, 287.6f, 387.6f, 282.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(704.1f, 496.8f)
                curveTo(709.6f, 497.3f, 726.0f, 503.0f, 728.4f, 508.1f)
                curveTo(727.2f, 512.4f, 725.8f, 509.2f, 723.3f, 514.0f)
                curveTo(725.6f, 518.1f, 726.5f, 519.9f, 728.1f, 524.3f)
                lineTo(727.5f, 525.7f)
                lineTo(725.8f, 526.3f)
                curveTo(717.8f, 521.5f, 706.2f, 505.9f, 704.1f, 496.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(482.8f, 465.8f)
                curveTo(484.5f, 467.6f, 484.3f, 490.0f, 484.8f, 495.2f)
                curveTo(479.6f, 494.8f, 474.1f, 494.6f, 468.9f, 494.4f)
                lineTo(467.6f, 494.6f)
                lineTo(467.2f, 493.3f)
                curveTo(472.2f, 476.6f, 473.7f, 478.6f, 482.8f, 465.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(412.6f, 208.2f)
                curveTo(416.1f, 207.8f, 416.6f, 207.8f, 420.1f, 208.3f)
                lineTo(420.8f, 209.4f)
                curveTo(420.4f, 215.2f, 417.5f, 227.7f, 414.4f, 232.5f)
                curveTo(401.6f, 226.6f, 397.7f, 213.2f, 412.6f, 208.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(322.7f, 325.8f)
                lineTo(334.3f, 327.8f)
                curveTo(331.5f, 334.4f, 327.7f, 342.1f, 324.6f, 348.7f)
                lineTo(323.4f, 349.7f)
                curveTo(321.1f, 348.0f, 316.7f, 336.8f, 315.1f, 333.3f)
                curveTo(318.3f, 331.0f, 320.2f, 328.6f, 322.7f, 325.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(285.1f, 471.6f)
                lineTo(285.7f, 471.9f)
                curveTo(287.9f, 475.3f, 288.0f, 495.7f, 284.0f, 498.8f)
                lineTo(280.5f, 497.9f)
                curveTo(268.4f, 491.0f, 279.5f, 479.3f, 285.1f, 471.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(340.7f, 302.9f)
                curveTo(344.4f, 302.6f, 346.3f, 301.8f, 348.0f, 305.3f)
                curveTo(347.1f, 310.0f, 341.6f, 316.2f, 338.9f, 323.7f)
                curveTo(328.9f, 316.2f, 329.5f, 308.5f, 340.7f, 302.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(640.3f, 281.3f)
                curveTo(646.5f, 282.5f, 651.8f, 289.4f, 655.9f, 294.0f)
                lineTo(649.9f, 302.4f)
                lineTo(648.8f, 304.0f)
                lineTo(647.1f, 304.1f)
                curveTo(643.2f, 299.3f, 639.4f, 287.6f, 640.3f, 281.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(373.8f, 303.6f)
                lineTo(376.2f, 304.5f)
                curveTo(380.2f, 310.4f, 372.8f, 322.3f, 368.3f, 326.3f)
                curveTo(358.1f, 317.6f, 365.7f, 309.2f, 373.8f, 303.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(657.6f, 468.8f)
                curveTo(669.5f, 468.6f, 673.5f, 472.6f, 668.6f, 484.0f)
                curveTo(665.0f, 485.4f, 662.5f, 485.5f, 659.2f, 483.8f)
                curveTo(656.1f, 479.2f, 657.1f, 474.3f, 657.6f, 468.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(411.4f, 191.8f)
                curveTo(413.6f, 191.5f, 413.7f, 191.6f, 415.8f, 192.6f)
                curveTo(416.8f, 198.7f, 409.0f, 202.4f, 404.3f, 204.3f)
                curveTo(401.6f, 205.2f, 402.5f, 205.4f, 400.4f, 204.5f)
                lineTo(400.2f, 202.1f)
                curveTo(402.4f, 196.6f, 406.5f, 194.5f, 411.4f, 191.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(406.5f, 256.9f)
                lineTo(407.4f, 258.4f)
                curveTo(404.9f, 265.9f, 403.5f, 273.8f, 397.4f, 278.0f)
                lineTo(395.8f, 275.0f)
                curveTo(395.3f, 271.1f, 397.5f, 266.1f, 398.9f, 262.2f)
                lineTo(406.5f, 256.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(603.8f, 160.1f)
                curveTo(609.4f, 161.0f, 618.1f, 169.6f, 619.1f, 175.2f)
                curveTo(609.9f, 174.9f, 602.5f, 170.1f, 603.8f, 160.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(387.6f, 149.8f)
                curveTo(391.2f, 155.7f, 387.0f, 167.2f, 382.0f, 171.6f)
                curveTo(376.6f, 165.8f, 384.2f, 155.5f, 387.6f, 149.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(429.6f, 185.1f)
                curveTo(430.4f, 185.6f, 430.4f, 186.0f, 431.0f, 187.0f)
                curveTo(429.8f, 191.2f, 426.1f, 199.0f, 424.3f, 203.6f)
                curveTo(421.5f, 201.5f, 420.6f, 196.0f, 421.6f, 192.7f)
                curveTo(423.0f, 187.8f, 425.4f, 187.2f, 429.6f, 185.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(521.5f, 522.6f)
                curveTo(536.2f, 518.3f, 531.8f, 517.2f, 541.2f, 511.1f)
                curveTo(538.0f, 516.6f, 534.9f, 522.3f, 529.9f, 526.3f)
                curveTo(527.5f, 522.7f, 525.2f, 523.1f, 521.5f, 522.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(279.3f, 394.6f)
                lineTo(280.4f, 395.6f)
                curveTo(282.0f, 400.1f, 281.9f, 406.9f, 281.3f, 411.6f)
                curveTo(280.0f, 411.1f, 279.4f, 410.3f, 278.4f, 409.3f)
                curveTo(277.2f, 404.8f, 278.5f, 399.3f, 279.3f, 394.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, fillAlpha = 0.988235f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(391.2f, 313.6f)
                lineTo(393.3f, 315.3f)
                curveTo(394.2f, 319.7f, 393.1f, 325.8f, 392.6f, 330.3f)
                lineTo(391.2f, 328.9f)
                curveTo(389.8f, 323.7f, 389.7f, 318.8f, 391.2f, 313.6f)
                close()
            }
        }
        .build()
        return _standardFutabaSakura!!
    }

private var _standardFutabaSakura: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = StandardSenderAvatar.StandardFutabaSakura, contentDescription = "")
    }
}
