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

public val StandardSenderAvatar.StandardMunehisaIwai: ImageVector
    get() {
        if (_standardMunehisaIwai != null) {
            return _standardMunehisaIwai!!
        }
        _standardMunehisaIwai = Builder(name = "StandardMunehisaIwai", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 1024.0f, viewportHeight = 1024.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(556.7f, 45.4f)
                curveTo(605.2f, 43.1f, 604.6f, 45.8f, 647.8f, 65.0f)
                curveTo(678.6f, 78.5f, 709.3f, 92.4f, 739.9f, 106.7f)
                curveTo(743.4f, 108.3f, 756.9f, 115.3f, 758.3f, 118.4f)
                curveTo(771.5f, 145.8f, 786.0f, 175.3f, 793.8f, 204.8f)
                curveTo(796.8f, 216.4f, 799.2f, 226.8f, 803.3f, 238.2f)
                curveTo(801.6f, 246.2f, 798.2f, 262.8f, 796.9f, 270.0f)
                curveTo(796.3f, 273.8f, 814.2f, 287.6f, 818.6f, 291.4f)
                curveTo(837.6f, 308.1f, 838.0f, 324.3f, 838.8f, 348.6f)
                curveTo(830.5f, 357.7f, 810.8f, 372.6f, 798.9f, 377.6f)
                curveTo(797.3f, 378.3f, 783.4f, 379.5f, 780.7f, 379.8f)
                curveTo(779.4f, 383.3f, 776.1f, 401.1f, 774.9f, 405.9f)
                lineTo(760.2f, 466.1f)
                curveTo(748.0f, 517.3f, 733.9f, 569.8f, 721.1f, 621.1f)
                curveTo(732.5f, 643.1f, 729.8f, 666.4f, 727.0f, 690.2f)
                curveTo(757.5f, 697.1f, 793.0f, 692.7f, 822.8f, 699.4f)
                curveTo(841.5f, 708.9f, 871.3f, 730.7f, 884.7f, 745.5f)
                curveTo(901.9f, 764.3f, 914.6f, 801.6f, 932.4f, 816.7f)
                curveTo(956.7f, 837.3f, 988.0f, 851.1f, 1012.7f, 871.7f)
                curveTo(1013.3f, 916.5f, 1013.8f, 973.1f, 1012.1f, 1017.1f)
                curveTo(990.9f, 1015.1f, 955.2f, 1016.1f, 933.1f, 1016.1f)
                lineTo(793.1f, 1016.2f)
                lineTo(338.5f, 1016.2f)
                lineTo(210.6f, 1016.1f)
                curveTo(186.4f, 1016.1f, 159.9f, 1015.6f, 135.9f, 1016.5f)
                curveTo(161.8f, 958.3f, 199.9f, 907.2f, 232.9f, 853.4f)
                curveTo(240.9f, 834.1f, 235.1f, 808.9f, 250.7f, 793.0f)
                curveTo(271.7f, 771.7f, 296.3f, 752.6f, 320.8f, 735.6f)
                curveTo(325.4f, 732.4f, 331.9f, 731.3f, 337.3f, 728.9f)
                curveTo(339.6f, 725.1f, 334.1f, 717.6f, 331.5f, 713.6f)
                curveTo(313.9f, 686.5f, 313.5f, 665.6f, 309.3f, 634.8f)
                curveTo(287.4f, 637.4f, 248.3f, 644.5f, 225.3f, 645.8f)
                curveTo(221.2f, 646.0f, 214.0f, 631.4f, 211.8f, 626.3f)
                curveTo(234.0f, 604.8f, 273.2f, 601.2f, 303.1f, 596.4f)
                curveTo(301.4f, 578.8f, 296.0f, 557.4f, 293.8f, 539.5f)
                curveTo(288.0f, 493.9f, 279.7f, 447.1f, 275.1f, 401.5f)
                curveTo(249.2f, 390.5f, 230.3f, 405.6f, 204.2f, 411.2f)
                curveTo(182.7f, 415.9f, 163.8f, 418.0f, 141.8f, 413.9f)
                curveTo(133.2f, 406.5f, 115.0f, 383.3f, 106.3f, 373.5f)
                curveTo(113.3f, 364.3f, 123.7f, 344.2f, 130.8f, 338.0f)
                curveTo(139.3f, 330.5f, 237.6f, 296.3f, 256.4f, 290.9f)
                curveTo(252.4f, 283.5f, 247.3f, 277.0f, 244.3f, 268.7f)
                curveTo(234.0f, 240.0f, 232.8f, 205.1f, 224.5f, 176.2f)
                curveTo(226.6f, 173.4f, 228.9f, 170.7f, 231.2f, 168.1f)
                curveTo(250.6f, 146.9f, 279.2f, 111.4f, 307.7f, 104.4f)
                curveTo(340.8f, 96.3f, 359.7f, 70.5f, 387.9f, 54.6f)
                curveTo(394.0f, 51.2f, 434.6f, 51.0f, 445.4f, 50.5f)
                lineTo(556.7f, 45.4f)
                close()
                moveTo(205.3f, 333.9f)
                curveTo(201.5f, 333.1f, 197.6f, 333.1f, 194.2f, 331.2f)
                curveTo(189.3f, 331.0f, 181.1f, 332.4f, 176.0f, 333.2f)
                curveTo(186.3f, 334.6f, 195.0f, 334.3f, 205.3f, 333.9f)
                close()
                moveTo(594.5f, 297.4f)
                curveTo(600.9f, 297.2f, 607.1f, 303.7f, 612.0f, 301.8f)
                curveTo(608.5f, 298.7f, 603.9f, 296.6f, 599.2f, 296.4f)
                lineTo(594.5f, 297.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(624.5f, 361.3f)
                lineTo(627.5f, 361.2f)
                lineTo(628.7f, 362.5f)
                curveTo(627.7f, 367.1f, 623.1f, 367.3f, 620.6f, 372.7f)
                curveTo(622.3f, 376.9f, 628.2f, 375.2f, 628.9f, 380.6f)
                curveTo(627.4f, 382.4f, 625.9f, 383.9f, 624.3f, 385.6f)
                lineTo(624.4f, 388.0f)
                curveTo(627.5f, 389.5f, 633.8f, 392.0f, 634.1f, 395.7f)
                curveTo(629.8f, 397.6f, 623.4f, 396.0f, 618.5f, 395.3f)
                curveTo(624.5f, 401.5f, 633.8f, 408.9f, 640.5f, 415.0f)
                lineTo(640.5f, 415.5f)
                curveTo(638.7f, 430.2f, 633.7f, 449.1f, 631.2f, 463.7f)
                curveTo(629.1f, 475.5f, 625.2f, 512.6f, 616.2f, 519.6f)
                curveTo(612.0f, 521.4f, 609.4f, 520.3f, 604.7f, 519.5f)
                curveTo(602.6f, 524.8f, 607.2f, 528.2f, 604.7f, 532.9f)
                lineTo(603.4f, 532.8f)
                lineTo(602.4f, 528.8f)
                lineTo(600.7f, 528.0f)
                lineTo(598.7f, 529.0f)
                curveTo(598.2f, 531.8f, 600.3f, 536.3f, 601.4f, 539.3f)
                curveTo(604.3f, 547.4f, 605.5f, 554.3f, 605.3f, 562.9f)
                curveTo(602.9f, 564.7f, 602.4f, 559.7f, 598.3f, 560.3f)
                curveTo(597.0f, 568.5f, 602.4f, 567.1f, 605.1f, 573.5f)
                curveTo(603.9f, 577.3f, 602.2f, 574.8f, 598.8f, 578.6f)
                lineTo(599.2f, 580.1f)
                curveTo(601.7f, 580.9f, 602.1f, 581.0f, 604.2f, 582.5f)
                curveTo(605.0f, 594.7f, 588.9f, 610.3f, 580.8f, 618.9f)
                lineTo(592.1f, 631.4f)
                curveTo(561.6f, 645.2f, 534.5f, 663.7f, 505.2f, 679.5f)
                curveTo(499.5f, 682.6f, 494.0f, 686.0f, 488.5f, 689.5f)
                curveTo(484.1f, 689.6f, 485.0f, 684.2f, 479.7f, 682.9f)
                curveTo(472.2f, 684.7f, 479.0f, 693.2f, 473.8f, 697.1f)
                curveTo(458.1f, 709.0f, 464.0f, 687.2f, 450.9f, 688.3f)
                curveTo(451.6f, 694.3f, 455.5f, 705.0f, 452.4f, 709.7f)
                curveTo(448.2f, 709.1f, 441.0f, 698.9f, 437.7f, 695.0f)
                curveTo(438.4f, 700.2f, 441.2f, 710.5f, 435.6f, 713.0f)
                curveTo(431.8f, 711.5f, 427.8f, 705.8f, 423.8f, 702.6f)
                lineTo(422.5f, 703.3f)
                curveTo(421.6f, 709.9f, 422.5f, 711.2f, 425.3f, 717.2f)
                curveTo(417.7f, 716.1f, 409.4f, 716.1f, 401.6f, 715.9f)
                curveTo(402.5f, 710.7f, 403.6f, 707.4f, 402.5f, 702.3f)
                curveTo(400.1f, 699.1f, 401.4f, 700.0f, 397.5f, 698.7f)
                curveTo(389.9f, 700.4f, 396.8f, 705.5f, 393.5f, 710.7f)
                curveTo(390.3f, 709.0f, 391.2f, 704.8f, 387.6f, 700.9f)
                curveTo(384.2f, 703.4f, 385.1f, 711.1f, 381.1f, 713.9f)
                curveTo(374.2f, 710.3f, 386.8f, 684.1f, 376.1f, 681.5f)
                curveTo(374.4f, 687.4f, 376.2f, 703.2f, 370.5f, 708.1f)
                curveTo(367.6f, 709.0f, 367.2f, 709.0f, 364.4f, 708.1f)
                curveTo(360.4f, 701.4f, 365.7f, 692.5f, 364.4f, 685.0f)
                curveTo(363.2f, 685.1f, 350.9f, 698.2f, 348.1f, 700.6f)
                curveTo(355.3f, 677.0f, 373.2f, 664.8f, 368.4f, 639.1f)
                curveTo(368.1f, 637.5f, 369.3f, 629.7f, 369.5f, 627.6f)
                curveTo(394.4f, 645.4f, 400.4f, 654.4f, 432.9f, 644.0f)
                curveTo(422.2f, 634.0f, 416.6f, 629.9f, 403.3f, 624.2f)
                curveTo(395.5f, 621.6f, 390.6f, 622.0f, 382.5f, 622.2f)
                curveTo(387.5f, 617.3f, 392.3f, 612.1f, 395.7f, 605.9f)
                curveTo(411.9f, 610.1f, 429.9f, 613.8f, 445.8f, 618.1f)
                curveTo(470.3f, 624.8f, 479.0f, 633.3f, 505.6f, 632.7f)
                curveTo(496.4f, 611.4f, 496.2f, 623.0f, 480.6f, 618.3f)
                curveTo(442.2f, 606.9f, 402.6f, 594.4f, 362.4f, 590.6f)
                lineTo(367.2f, 575.3f)
                curveTo(373.8f, 581.0f, 376.0f, 581.7f, 384.0f, 584.1f)
                curveTo(404.4f, 573.6f, 419.7f, 565.4f, 440.9f, 556.5f)
                curveTo(408.4f, 540.8f, 386.5f, 553.2f, 358.9f, 544.3f)
                curveTo(359.4f, 530.9f, 362.3f, 513.6f, 364.0f, 500.0f)
                curveTo(365.8f, 486.7f, 367.6f, 469.2f, 370.8f, 456.5f)
                curveTo(405.8f, 457.7f, 415.0f, 452.8f, 448.0f, 442.5f)
                curveTo(456.6f, 450.4f, 460.2f, 458.0f, 467.9f, 466.1f)
                curveTo(470.0f, 468.4f, 472.7f, 467.9f, 475.2f, 467.5f)
                curveTo(483.4f, 460.4f, 469.0f, 446.0f, 470.0f, 435.0f)
                curveTo(475.3f, 427.1f, 486.5f, 437.0f, 491.2f, 441.1f)
                curveTo(518.9f, 464.9f, 545.4f, 463.3f, 568.8f, 434.5f)
                curveTo(569.6f, 433.7f, 568.7f, 430.0f, 570.3f, 427.4f)
                curveTo(575.6f, 426.6f, 581.4f, 434.3f, 586.6f, 430.7f)
                lineTo(586.6f, 428.6f)
                curveTo(575.5f, 413.8f, 537.9f, 404.9f, 520.6f, 399.9f)
                curveTo(551.0f, 377.2f, 587.7f, 367.2f, 624.5f, 361.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(470.4f, 585.0f)
                curveTo(475.6f, 585.0f, 483.9f, 584.7f, 487.7f, 588.7f)
                curveTo(489.5f, 590.5f, 490.5f, 593.1f, 490.4f, 595.7f)
                lineTo(488.2f, 597.1f)
                curveTo(478.7f, 593.3f, 478.5f, 594.4f, 468.8f, 598.2f)
                curveTo(469.2f, 594.0f, 469.9f, 589.2f, 470.4f, 585.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(449.8f, 578.5f)
                curveTo(455.6f, 580.8f, 463.3f, 592.8f, 460.8f, 599.3f)
                lineTo(457.4f, 600.6f)
                curveTo(451.7f, 590.9f, 450.9f, 594.9f, 445.5f, 588.7f)
                curveTo(445.5f, 584.8f, 447.7f, 582.2f, 449.8f, 578.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(420.8f, 573.3f)
                curveTo(422.1f, 574.0f, 434.8f, 587.2f, 435.5f, 589.7f)
                curveTo(436.2f, 592.8f, 435.6f, 593.1f, 434.3f, 595.4f)
                curveTo(428.6f, 593.2f, 422.0f, 584.4f, 418.7f, 579.3f)
                curveTo(418.3f, 575.7f, 418.2f, 576.9f, 420.8f, 573.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(421.4f, 685.8f)
                curveTo(424.4f, 686.0f, 427.7f, 685.7f, 430.0f, 687.6f)
                curveTo(431.1f, 691.0f, 430.6f, 690.5f, 429.7f, 694.5f)
                curveTo(426.2f, 696.0f, 427.3f, 696.1f, 423.9f, 695.4f)
                curveTo(421.8f, 693.3f, 421.7f, 689.0f, 421.4f, 685.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(194.2f, 331.2f)
                curveTo(196.8f, 330.9f, 205.9f, 329.7f, 207.4f, 328.6f)
                curveTo(222.4f, 317.5f, 234.6f, 308.3f, 252.3f, 301.2f)
                curveTo(273.7f, 292.6f, 296.1f, 291.9f, 318.9f, 291.7f)
                curveTo(333.8f, 291.6f, 380.0f, 293.6f, 390.2f, 302.7f)
                curveTo(390.0f, 310.1f, 376.7f, 313.5f, 370.6f, 316.0f)
                curveTo(378.2f, 330.5f, 375.6f, 331.7f, 362.6f, 339.3f)
                curveTo(357.8f, 336.4f, 355.9f, 335.0f, 350.3f, 334.2f)
                lineTo(348.6f, 334.8f)
                curveTo(351.1f, 342.0f, 361.4f, 349.3f, 357.7f, 358.0f)
                curveTo(355.9f, 362.2f, 348.3f, 367.1f, 343.7f, 364.5f)
                curveTo(338.5f, 361.5f, 336.9f, 351.3f, 332.9f, 349.2f)
                curveTo(324.7f, 353.5f, 322.7f, 380.6f, 302.8f, 351.0f)
                curveTo(298.6f, 356.9f, 288.5f, 370.0f, 279.6f, 363.5f)
                curveTo(277.2f, 361.7f, 277.2f, 359.6f, 277.2f, 356.8f)
                curveTo(277.1f, 355.9f, 277.1f, 355.1f, 277.1f, 354.3f)
                curveTo(265.1f, 351.9f, 255.8f, 349.7f, 243.9f, 346.2f)
                curveTo(229.2f, 341.9f, 220.2f, 333.6f, 205.3f, 333.9f)
                curveTo(201.5f, 333.1f, 197.6f, 333.1f, 194.2f, 331.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(664.7f, 168.4f)
                curveTo(664.9f, 168.4f, 665.0f, 168.3f, 665.2f, 168.3f)
                curveTo(717.7f, 163.8f, 712.5f, 238.5f, 690.8f, 266.9f)
                curveTo(683.3f, 276.8f, 675.1f, 278.6f, 664.7f, 279.9f)
                curveTo(632.5f, 278.4f, 618.7f, 251.0f, 622.6f, 221.9f)
                curveTo(625.9f, 196.9f, 635.8f, 170.5f, 664.7f, 168.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(289.6f, 149.2f)
                curveTo(291.4f, 145.5f, 294.2f, 140.6f, 296.8f, 137.2f)
                curveTo(314.7f, 114.9f, 345.4f, 97.3f, 372.1f, 88.2f)
                curveTo(393.1f, 82.2f, 415.2f, 80.5f, 436.9f, 77.6f)
                curveTo(450.7f, 75.7f, 468.9f, 73.5f, 482.4f, 78.3f)
                curveTo(486.2f, 79.7f, 493.1f, 86.9f, 496.9f, 89.9f)
                curveTo(501.1f, 90.2f, 504.2f, 89.9f, 507.2f, 92.7f)
                curveTo(496.1f, 97.1f, 485.8f, 103.1f, 474.5f, 106.8f)
                curveTo(467.4f, 109.2f, 455.8f, 108.2f, 449.0f, 109.8f)
                curveTo(432.3f, 113.8f, 414.9f, 117.4f, 398.3f, 121.6f)
                curveTo(365.2f, 129.9f, 323.1f, 145.6f, 289.6f, 149.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(653.0f, 516.2f)
                curveTo(659.9f, 490.9f, 662.9f, 464.7f, 671.5f, 439.2f)
                curveTo(677.0f, 422.7f, 674.9f, 405.1f, 687.9f, 390.3f)
                curveTo(699.1f, 377.6f, 704.3f, 374.9f, 720.3f, 372.8f)
                curveTo(731.5f, 384.6f, 736.9f, 395.9f, 740.1f, 411.6f)
                curveTo(736.7f, 424.1f, 707.1f, 475.8f, 698.1f, 484.4f)
                curveTo(694.9f, 484.7f, 695.5f, 484.2f, 692.2f, 481.7f)
                curveTo(688.8f, 481.3f, 687.7f, 484.7f, 682.1f, 487.6f)
                lineTo(678.0f, 490.5f)
                curveTo(674.8f, 491.8f, 674.2f, 492.5f, 671.7f, 494.7f)
                curveTo(669.1f, 502.4f, 677.4f, 503.6f, 678.1f, 509.7f)
                curveTo(674.1f, 515.0f, 663.9f, 510.8f, 653.9f, 515.8f)
                lineTo(653.0f, 516.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(706.2f, 390.1f)
                curveTo(712.2f, 389.7f, 721.2f, 388.5f, 725.4f, 394.1f)
                curveTo(737.4f, 411.1f, 720.7f, 429.9f, 712.6f, 444.1f)
                curveTo(703.8f, 459.7f, 691.9f, 468.6f, 679.0f, 480.6f)
                curveTo(675.7f, 483.3f, 673.4f, 485.5f, 668.8f, 484.8f)
                curveTo(658.3f, 474.9f, 684.1f, 446.9f, 682.5f, 434.9f)
                curveTo(682.0f, 430.7f, 678.5f, 427.2f, 675.8f, 424.0f)
                curveTo(681.8f, 411.9f, 694.0f, 396.5f, 706.2f, 390.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(707.1f, 396.5f)
                curveTo(715.8f, 397.1f, 724.6f, 405.5f, 718.3f, 413.3f)
                curveTo(713.3f, 407.2f, 706.7f, 405.4f, 705.2f, 399.6f)
                lineTo(707.1f, 396.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(561.7f, 263.2f)
                curveTo(560.5f, 255.4f, 559.5f, 249.5f, 557.7f, 241.8f)
                curveTo(559.3f, 238.3f, 560.0f, 241.6f, 564.5f, 239.0f)
                curveTo(564.8f, 234.2f, 560.4f, 231.5f, 560.3f, 228.8f)
                curveTo(559.7f, 212.8f, 579.2f, 164.2f, 595.6f, 160.1f)
                curveTo(613.0f, 155.7f, 642.9f, 158.7f, 663.1f, 155.7f)
                curveTo(619.3f, 173.5f, 610.6f, 202.4f, 609.6f, 247.6f)
                curveTo(608.6f, 249.1f, 607.5f, 251.3f, 606.2f, 252.5f)
                curveTo(599.7f, 256.7f, 592.8f, 260.9f, 586.3f, 265.0f)
                curveTo(579.6f, 260.9f, 575.1f, 252.5f, 570.0f, 252.9f)
                curveTo(566.5f, 255.4f, 564.1f, 259.5f, 561.7f, 263.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(300.8f, 199.7f)
                lineTo(306.9f, 199.8f)
                curveTo(308.2f, 201.4f, 308.1f, 200.9f, 308.4f, 202.6f)
                curveTo(307.8f, 213.7f, 313.8f, 254.8f, 315.9f, 267.2f)
                curveTo(312.3f, 268.2f, 310.4f, 268.8f, 306.7f, 268.7f)
                curveTo(299.4f, 261.5f, 300.0f, 217.9f, 292.6f, 208.7f)
                curveTo(289.5f, 207.3f, 290.7f, 207.3f, 287.9f, 208.2f)
                curveTo(285.2f, 216.1f, 292.5f, 262.3f, 295.9f, 271.2f)
                curveTo(293.6f, 271.6f, 283.3f, 274.1f, 281.6f, 272.7f)
                curveTo(270.8f, 262.9f, 278.9f, 221.6f, 267.0f, 214.5f)
                curveTo(264.4f, 214.6f, 263.6f, 214.5f, 261.7f, 216.1f)
                curveTo(257.4f, 225.7f, 269.1f, 262.1f, 269.1f, 273.3f)
                curveTo(267.2f, 276.6f, 266.2f, 277.0f, 262.9f, 276.2f)
                curveTo(255.5f, 270.2f, 246.5f, 229.6f, 243.3f, 217.8f)
                curveTo(259.9f, 208.9f, 282.1f, 202.5f, 300.8f, 199.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(355.1f, 598.4f)
                curveTo(359.2f, 597.6f, 369.5f, 598.6f, 373.5f, 600.1f)
                lineTo(373.6f, 601.3f)
                curveTo(369.4f, 605.6f, 332.1f, 613.5f, 324.2f, 615.4f)
                lineTo(251.6f, 632.8f)
                curveTo(248.5f, 633.6f, 243.0f, 634.8f, 240.1f, 633.3f)
                curveTo(234.9f, 630.6f, 232.4f, 625.3f, 235.2f, 619.8f)
                curveTo(243.9f, 616.7f, 262.6f, 615.8f, 272.8f, 613.5f)
                curveTo(301.1f, 607.4f, 326.3f, 601.5f, 355.1f, 598.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(502.3f, 422.2f)
                curveTo(515.9f, 420.3f, 508.9f, 431.5f, 516.4f, 436.3f)
                curveTo(524.8f, 441.6f, 547.6f, 427.5f, 554.7f, 432.6f)
                lineTo(554.6f, 434.9f)
                curveTo(552.0f, 438.9f, 550.2f, 440.2f, 546.5f, 443.2f)
                curveTo(522.1f, 456.5f, 507.9f, 442.7f, 489.2f, 428.6f)
                curveTo(493.4f, 426.7f, 498.1f, 424.2f, 502.3f, 422.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(728.3f, 241.0f)
                curveTo(735.2f, 239.2f, 740.3f, 236.8f, 746.8f, 240.1f)
                lineTo(747.3f, 240.3f)
                curveTo(755.2f, 244.3f, 756.2f, 249.8f, 763.2f, 253.3f)
                curveTo(764.7f, 254.0f, 765.4f, 254.5f, 766.8f, 255.4f)
                lineTo(765.4f, 256.7f)
                lineTo(764.9f, 256.4f)
                curveTo(763.2f, 255.3f, 762.9f, 255.1f, 761.0f, 254.5f)
                curveTo(759.1f, 256.4f, 759.7f, 255.5f, 759.3f, 258.6f)
                curveTo(757.2f, 262.3f, 752.9f, 265.7f, 748.7f, 265.7f)
                curveTo(734.1f, 265.8f, 729.4f, 251.4f, 728.3f, 241.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(300.8f, 199.7f)
                curveTo(314.9f, 197.5f, 338.5f, 194.5f, 352.6f, 194.6f)
                lineTo(353.6f, 195.8f)
                curveTo(348.1f, 199.2f, 329.0f, 195.9f, 324.5f, 203.5f)
                curveTo(325.2f, 208.9f, 332.4f, 264.1f, 332.2f, 264.6f)
                curveTo(318.5f, 262.8f, 324.5f, 202.7f, 318.2f, 201.5f)
                curveTo(314.6f, 204.5f, 312.4f, 204.3f, 308.4f, 202.6f)
                curveTo(308.1f, 200.9f, 308.2f, 201.4f, 306.9f, 199.8f)
                lineTo(300.8f, 199.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(254.7f, 170.9f)
                curveTo(256.0f, 172.6f, 258.1f, 196.1f, 258.6f, 200.5f)
                curveTo(254.6f, 201.0f, 249.9f, 201.9f, 245.8f, 202.5f)
                curveTo(244.0f, 202.5f, 244.0f, 202.3f, 242.5f, 201.2f)
                curveTo(241.2f, 195.9f, 241.5f, 183.3f, 241.4f, 177.1f)
                curveTo(246.5f, 175.1f, 250.0f, 173.3f, 254.7f, 170.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(391.6f, 313.9f)
                curveTo(396.5f, 313.7f, 402.0f, 318.0f, 403.5f, 322.8f)
                curveTo(402.7f, 331.2f, 399.4f, 332.5f, 393.0f, 338.3f)
                curveTo(389.1f, 337.8f, 383.0f, 334.5f, 381.5f, 330.9f)
                curveTo(377.2f, 320.9f, 384.8f, 317.0f, 391.6f, 313.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(268.5f, 171.2f)
                curveTo(272.8f, 171.0f, 275.4f, 171.0f, 279.7f, 171.2f)
                curveTo(283.7f, 174.2f, 283.4f, 192.0f, 280.8f, 196.0f)
                curveTo(276.1f, 196.8f, 274.2f, 197.4f, 269.5f, 197.0f)
                curveTo(265.7f, 193.6f, 265.9f, 174.9f, 268.5f, 171.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(300.8f, 164.3f)
                lineTo(303.4f, 164.1f)
                curveTo(306.4f, 166.8f, 307.8f, 183.4f, 308.4f, 188.2f)
                lineTo(300.7f, 190.5f)
                curveTo(297.9f, 191.3f, 296.0f, 192.1f, 293.4f, 191.1f)
                curveTo(290.0f, 186.8f, 291.9f, 173.6f, 291.8f, 166.5f)
                lineTo(300.8f, 164.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(359.2f, 364.1f)
                curveTo(365.6f, 366.1f, 378.0f, 369.5f, 373.9f, 378.8f)
                curveTo(371.2f, 381.4f, 368.6f, 381.4f, 364.8f, 381.9f)
                curveTo(360.1f, 382.7f, 354.6f, 383.3f, 349.8f, 383.9f)
                curveTo(350.6f, 373.5f, 349.4f, 369.7f, 359.2f, 364.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(331.9f, 363.9f)
                lineTo(334.0f, 364.1f)
                curveTo(340.5f, 368.4f, 347.0f, 374.6f, 341.9f, 382.4f)
                curveTo(337.8f, 384.2f, 336.9f, 383.3f, 331.9f, 382.6f)
                curveTo(325.6f, 382.1f, 320.9f, 382.6f, 320.2f, 375.4f)
                curveTo(322.8f, 368.1f, 325.1f, 367.5f, 331.9f, 363.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(371.3f, 340.0f)
                curveTo(380.6f, 339.9f, 381.8f, 341.0f, 389.3f, 346.2f)
                curveTo(385.8f, 349.0f, 380.8f, 352.3f, 376.9f, 354.9f)
                curveTo(375.2f, 356.2f, 373.4f, 357.4f, 371.5f, 358.7f)
                curveTo(368.1f, 358.4f, 369.3f, 359.0f, 366.9f, 356.5f)
                curveTo(365.0f, 350.6f, 366.5f, 344.1f, 371.3f, 340.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(572.1f, 262.8f)
                curveTo(583.0f, 263.8f, 587.3f, 282.1f, 578.7f, 287.5f)
                curveTo(574.0f, 280.8f, 566.6f, 276.0f, 566.1f, 268.2f)
                curveTo(567.8f, 264.4f, 567.9f, 265.3f, 572.1f, 262.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(315.3f, 160.2f)
                curveTo(318.1f, 160.0f, 318.6f, 160.0f, 321.4f, 160.5f)
                curveTo(325.3f, 165.5f, 323.9f, 180.7f, 323.8f, 187.6f)
                curveTo(321.6f, 187.3f, 320.9f, 187.0f, 318.8f, 186.4f)
                curveTo(314.3f, 180.2f, 314.2f, 167.5f, 315.3f, 160.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(600.0f, 262.8f)
                curveTo(604.8f, 263.6f, 612.2f, 267.3f, 613.1f, 272.6f)
                lineTo(612.0f, 274.0f)
                curveTo(609.6f, 273.9f, 608.1f, 273.7f, 605.8f, 274.7f)
                curveTo(604.5f, 275.0f, 603.3f, 275.3f, 602.0f, 275.6f)
                curveTo(597.7f, 276.5f, 596.5f, 276.8f, 592.7f, 274.4f)
                curveTo(589.6f, 267.9f, 595.0f, 265.5f, 600.0f, 262.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(606.2f, 252.5f)
                curveTo(607.5f, 251.3f, 608.6f, 249.1f, 609.6f, 247.6f)
                curveTo(616.4f, 248.2f, 620.4f, 251.6f, 621.3f, 258.7f)
                curveTo(620.1f, 262.4f, 620.9f, 261.4f, 618.3f, 263.4f)
                curveTo(612.1f, 263.3f, 608.2f, 258.0f, 606.2f, 252.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(301.0f, 363.8f)
                curveTo(306.2f, 365.7f, 314.0f, 369.9f, 313.8f, 376.1f)
                lineTo(312.4f, 376.8f)
                lineTo(309.7f, 375.8f)
                curveTo(305.2f, 374.5f, 295.7f, 372.8f, 293.9f, 368.5f)
                curveTo(296.3f, 365.1f, 296.7f, 365.7f, 301.0f, 363.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(759.3f, 258.6f)
                curveTo(759.7f, 255.5f, 759.1f, 256.4f, 761.0f, 254.5f)
                curveTo(762.9f, 255.1f, 763.2f, 255.3f, 764.9f, 256.4f)
                lineTo(765.4f, 256.7f)
                lineTo(766.8f, 255.4f)
                curveTo(776.0f, 259.6f, 783.7f, 264.6f, 789.4f, 273.1f)
                curveTo(780.7f, 268.5f, 765.5f, 262.1f, 759.3f, 258.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(380.9f, 368.2f)
                lineTo(383.3f, 368.2f)
                curveTo(387.6f, 368.2f, 396.2f, 367.5f, 399.0f, 370.4f)
                curveTo(397.1f, 373.2f, 395.9f, 373.0f, 392.3f, 374.7f)
                curveTo(387.6f, 376.4f, 383.9f, 378.6f, 379.7f, 376.8f)
                curveTo(378.8f, 372.8f, 379.6f, 372.6f, 380.9f, 368.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.9f, 89.9f)
                curveTo(511.1f, 88.2f, 516.5f, 83.6f, 528.5f, 80.2f)
                curveTo(521.6f, 85.3f, 515.5f, 90.0f, 507.2f, 92.7f)
                curveTo(504.2f, 89.9f, 501.1f, 90.2f, 496.9f, 89.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(678.0f, 490.5f)
                lineTo(682.1f, 487.6f)
                curveTo(685.9f, 489.9f, 689.9f, 491.8f, 690.2f, 496.7f)
                curveTo(685.7f, 499.6f, 681.0f, 493.9f, 678.0f, 490.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(396.2f, 303.5f)
                curveTo(401.6f, 304.3f, 407.3f, 308.8f, 408.7f, 314.2f)
                curveTo(400.8f, 313.9f, 396.2f, 311.9f, 396.2f, 303.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFDFD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(413.2f, 316.6f)
                curveTo(415.3f, 315.5f, 418.0f, 316.3f, 419.3f, 318.3f)
                curveTo(420.6f, 320.4f, 420.1f, 323.1f, 418.2f, 324.6f)
                curveTo(416.8f, 325.7f, 414.8f, 325.9f, 413.2f, 325.1f)
                curveTo(411.6f, 324.3f, 410.6f, 322.7f, 410.6f, 320.9f)
                curveTo(410.6f, 319.1f, 411.6f, 317.5f, 413.2f, 316.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(594.5f, 297.4f)
                curveTo(590.6f, 295.5f, 585.7f, 294.1f, 584.6f, 289.7f)
                lineTo(586.5f, 289.1f)
                curveTo(593.4f, 290.3f, 594.8f, 291.0f, 599.2f, 296.4f)
                lineTo(594.5f, 297.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, fillAlpha = 0.984314f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(176.0f, 333.2f)
                curveTo(181.1f, 332.4f, 189.3f, 331.0f, 194.2f, 331.2f)
                curveTo(197.6f, 333.1f, 201.5f, 333.1f, 205.3f, 333.9f)
                curveTo(195.0f, 334.3f, 186.3f, 334.6f, 176.0f, 333.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfdfdfd)), stroke = null, fillAlpha = 0.988235f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(599.2f, 296.4f)
                curveTo(603.9f, 296.6f, 608.5f, 298.7f, 612.0f, 301.8f)
                curveTo(607.1f, 303.7f, 600.9f, 297.2f, 594.5f, 297.4f)
                lineTo(599.2f, 296.4f)
                close()
            }
        }
        .build()
        return _standardMunehisaIwai!!
    }

private var _standardMunehisaIwai: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = StandardSenderAvatar.StandardMunehisaIwai, contentDescription = "")
    }
}
