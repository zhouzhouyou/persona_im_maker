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

public val StandardSenderAvatar.StandardHifumiTogo: ImageVector
    get() {
        if (_standardHifumiTogo != null) {
            return _standardHifumiTogo!!
        }
        _standardHifumiTogo = Builder(name = "StandardHifumiTogo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 1024.0f, viewportHeight = 1024.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(488.7f, 54.4f)
                curveTo(488.9f, 54.4f, 489.0f, 54.3f, 489.1f, 54.3f)
                curveTo(516.2f, 51.5f, 583.9f, 56.5f, 609.3f, 66.6f)
                curveTo(623.5f, 72.2f, 636.3f, 81.8f, 649.6f, 89.2f)
                curveTo(660.9f, 95.4f, 673.7f, 100.9f, 683.7f, 109.0f)
                curveTo(694.8f, 117.9f, 717.0f, 164.5f, 725.4f, 179.8f)
                lineTo(761.8f, 246.8f)
                curveTo(764.8f, 252.3f, 776.1f, 271.1f, 777.1f, 275.8f)
                curveTo(779.9f, 289.0f, 778.4f, 311.1f, 778.1f, 325.1f)
                curveTo(777.5f, 349.0f, 778.0f, 374.6f, 775.7f, 398.4f)
                curveTo(768.2f, 475.4f, 757.9f, 551.6f, 758.1f, 629.2f)
                curveTo(758.2f, 653.6f, 754.9f, 680.6f, 757.5f, 704.8f)
                curveTo(761.9f, 732.5f, 768.0f, 759.7f, 774.7f, 787.2f)
                curveTo(778.5f, 802.6f, 786.5f, 869.1f, 802.5f, 875.1f)
                curveTo(822.9f, 882.6f, 853.6f, 887.2f, 873.0f, 900.1f)
                curveTo(878.2f, 903.6f, 882.5f, 913.5f, 885.9f, 918.6f)
                curveTo(903.8f, 949.3f, 908.7f, 973.8f, 911.9f, 1008.3f)
                curveTo(899.8f, 1007.5f, 881.3f, 1007.9f, 868.7f, 1007.9f)
                lineTo(793.7f, 1007.9f)
                lineTo(561.5f, 1007.9f)
                lineTo(280.0f, 1007.9f)
                lineTo(186.9f, 1007.9f)
                curveTo(169.3f, 1007.9f, 149.7f, 1007.5f, 132.3f, 1008.3f)
                curveTo(138.2f, 988.6f, 151.9f, 933.6f, 163.0f, 917.8f)
                curveTo(172.1f, 912.6f, 199.4f, 900.9f, 203.8f, 894.4f)
                curveTo(212.1f, 878.1f, 215.5f, 852.6f, 217.9f, 834.5f)
                curveTo(224.1f, 788.2f, 231.4f, 737.5f, 233.1f, 691.0f)
                curveTo(235.0f, 640.0f, 231.3f, 587.6f, 229.0f, 536.8f)
                lineTo(225.7f, 473.5f)
                curveTo(225.2f, 462.3f, 225.2f, 450.2f, 224.2f, 439.0f)
                curveTo(223.2f, 427.3f, 218.4f, 413.2f, 217.3f, 400.8f)
                curveTo(213.9f, 361.5f, 212.4f, 313.1f, 219.2f, 274.4f)
                curveTo(220.8f, 265.2f, 236.6f, 234.4f, 240.9f, 224.9f)
                curveTo(244.8f, 216.3f, 255.1f, 192.8f, 260.9f, 185.8f)
                curveTo(267.6f, 177.6f, 281.5f, 164.5f, 289.8f, 156.6f)
                curveTo(304.1f, 143.0f, 320.3f, 125.2f, 335.6f, 113.5f)
                curveTo(338.6f, 111.2f, 360.3f, 101.9f, 364.7f, 99.9f)
                curveTo(389.0f, 89.0f, 413.7f, 78.9f, 438.7f, 69.7f)
                curveTo(456.0f, 63.1f, 470.1f, 56.4f, 488.7f, 54.4f)
                close()
                moveTo(303.1f, 832.4f)
                curveTo(303.8f, 829.2f, 305.5f, 805.2f, 304.4f, 803.0f)
                lineTo(304.8f, 804.2f)
                lineTo(303.4f, 804.3f)
                curveTo(301.5f, 809.1f, 301.0f, 815.0f, 300.4f, 820.1f)
                curveTo(297.9f, 827.6f, 288.7f, 853.1f, 289.5f, 859.8f)
                curveTo(291.1f, 860.3f, 292.4f, 859.8f, 293.8f, 858.7f)
                curveTo(310.2f, 845.9f, 327.2f, 834.2f, 344.1f, 822.1f)
                curveTo(349.8f, 818.0f, 356.4f, 814.8f, 362.0f, 810.9f)
                curveTo(357.0f, 795.8f, 352.0f, 779.9f, 348.0f, 764.4f)
                curveTo(344.7f, 751.6f, 342.4f, 738.6f, 338.9f, 725.8f)
                curveTo(336.2f, 737.9f, 334.6f, 750.0f, 331.9f, 762.0f)
                curveTo(327.3f, 781.7f, 321.4f, 801.1f, 314.2f, 820.1f)
                curveTo(312.2f, 825.6f, 308.8f, 835.6f, 305.0f, 839.9f)
                lineTo(302.9f, 840.6f)
                curveTo(301.2f, 838.1f, 302.1f, 835.2f, 303.1f, 832.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(429.6f, 367.8f)
                lineTo(430.5f, 369.0f)
                curveTo(431.0f, 372.3f, 428.7f, 378.0f, 427.9f, 381.5f)
                curveTo(423.4f, 400.6f, 416.9f, 467.9f, 425.9f, 482.7f)
                curveTo(430.3f, 485.6f, 432.7f, 482.5f, 436.7f, 479.3f)
                curveTo(444.0f, 473.3f, 442.9f, 477.2f, 450.0f, 477.3f)
                curveTo(459.8f, 469.6f, 460.2f, 436.2f, 475.8f, 443.8f)
                curveTo(476.9f, 448.0f, 473.9f, 450.4f, 473.4f, 454.8f)
                curveTo(473.0f, 459.4f, 472.9f, 464.4f, 472.8f, 469.0f)
                curveTo(479.7f, 466.5f, 483.2f, 465.7f, 490.4f, 464.2f)
                curveTo(486.3f, 470.0f, 476.4f, 477.8f, 470.8f, 482.4f)
                curveTo(474.1f, 484.6f, 477.4f, 486.6f, 480.8f, 488.6f)
                curveTo(484.1f, 487.5f, 483.4f, 483.1f, 487.7f, 478.6f)
                curveTo(494.8f, 471.2f, 499.1f, 469.8f, 508.1f, 466.2f)
                curveTo(514.4f, 473.9f, 517.1f, 473.6f, 526.8f, 476.3f)
                curveTo(520.1f, 483.1f, 515.7f, 488.1f, 509.7f, 495.4f)
                curveTo(523.0f, 493.8f, 540.6f, 493.1f, 554.3f, 492.2f)
                curveTo(565.6f, 480.6f, 566.9f, 472.0f, 581.0f, 459.1f)
                curveTo(568.1f, 504.2f, 568.3f, 547.0f, 562.7f, 593.1f)
                curveTo(558.8f, 626.3f, 564.7f, 646.7f, 536.3f, 670.2f)
                curveTo(507.9f, 693.6f, 467.8f, 725.1f, 429.5f, 726.4f)
                curveTo(412.4f, 727.0f, 386.3f, 693.5f, 375.1f, 680.9f)
                curveTo(357.9f, 662.1f, 332.4f, 635.5f, 318.3f, 615.5f)
                curveTo(297.5f, 586.1f, 288.6f, 529.6f, 283.8f, 493.9f)
                curveTo(285.5f, 490.7f, 287.2f, 495.0f, 290.7f, 493.4f)
                curveTo(290.7f, 487.1f, 285.0f, 480.6f, 286.1f, 475.5f)
                curveTo(289.6f, 488.2f, 303.1f, 499.7f, 314.3f, 505.8f)
                curveTo(325.6f, 504.1f, 334.8f, 502.8f, 346.3f, 503.9f)
                curveTo(348.8f, 504.2f, 351.7f, 502.4f, 352.4f, 499.6f)
                curveTo(350.9f, 496.9f, 346.9f, 494.8f, 344.0f, 493.1f)
                curveTo(348.1f, 490.1f, 350.7f, 487.9f, 354.5f, 484.5f)
                curveTo(358.1f, 487.7f, 366.0f, 494.1f, 370.1f, 496.2f)
                lineTo(371.0f, 495.3f)
                curveTo(370.1f, 488.5f, 364.7f, 482.9f, 363.2f, 475.9f)
                curveTo(363.9f, 475.9f, 367.1f, 478.8f, 368.8f, 479.6f)
                curveTo(375.9f, 482.6f, 383.3f, 481.8f, 390.6f, 481.3f)
                curveTo(392.2f, 485.5f, 395.0f, 490.0f, 396.2f, 494.0f)
                curveTo(407.4f, 529.5f, 400.4f, 571.3f, 386.2f, 604.2f)
                curveTo(395.8f, 615.0f, 407.9f, 619.8f, 421.3f, 624.7f)
                curveTo(415.8f, 616.5f, 410.8f, 608.9f, 405.7f, 600.3f)
                curveTo(408.7f, 574.2f, 406.3f, 535.8f, 405.7f, 508.9f)
                curveTo(405.6f, 506.5f, 402.0f, 491.3f, 401.2f, 486.5f)
                curveTo(405.0f, 480.4f, 401.8f, 475.2f, 403.2f, 466.8f)
                curveTo(408.0f, 436.9f, 410.0f, 391.5f, 429.6f, 367.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(415.9f, 641.4f)
                curveTo(425.3f, 641.1f, 472.1f, 641.1f, 476.8f, 647.1f)
                lineTo(475.9f, 648.7f)
                curveTo(471.6f, 650.2f, 457.8f, 651.5f, 452.1f, 652.3f)
                curveTo(441.7f, 655.9f, 402.3f, 655.5f, 394.8f, 647.2f)
                lineTo(395.1f, 645.5f)
                curveTo(400.6f, 641.8f, 409.3f, 641.8f, 415.9f, 641.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(413.8f, 667.4f)
                curveTo(414.7f, 667.6f, 420.5f, 669.8f, 421.2f, 670.2f)
                curveTo(426.7f, 673.7f, 446.0f, 672.4f, 449.7f, 674.2f)
                curveTo(449.3f, 677.0f, 448.0f, 677.6f, 445.8f, 680.0f)
                curveTo(440.4f, 683.2f, 437.7f, 683.8f, 431.9f, 685.5f)
                lineTo(417.6f, 681.2f)
                curveTo(417.0f, 677.2f, 415.0f, 671.5f, 413.8f, 667.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(395.6f, 142.6f)
                curveTo(398.5f, 144.3f, 405.4f, 157.9f, 407.6f, 161.8f)
                curveTo(399.2f, 179.1f, 392.6f, 196.0f, 387.9f, 214.7f)
                curveTo(386.1f, 221.9f, 376.0f, 260.0f, 378.5f, 264.4f)
                curveTo(379.1f, 264.5f, 379.8f, 264.5f, 380.4f, 264.6f)
                curveTo(387.9f, 265.2f, 397.1f, 267.5f, 395.2f, 277.8f)
                curveTo(393.9f, 285.6f, 389.7f, 287.9f, 383.7f, 292.0f)
                curveTo(379.4f, 287.5f, 373.9f, 282.7f, 369.3f, 278.5f)
                curveTo(359.7f, 299.6f, 375.8f, 288.7f, 378.3f, 294.7f)
                curveTo(386.6f, 314.5f, 368.9f, 314.3f, 359.9f, 313.7f)
                curveTo(355.2f, 318.5f, 374.7f, 324.5f, 355.0f, 342.6f)
                curveTo(351.0f, 340.8f, 344.3f, 336.2f, 340.4f, 333.7f)
                curveTo(340.8f, 322.3f, 340.1f, 324.0f, 348.4f, 316.3f)
                curveTo(350.0f, 314.9f, 350.3f, 312.9f, 350.1f, 310.9f)
                lineTo(348.3f, 310.2f)
                curveTo(343.6f, 312.2f, 337.4f, 314.5f, 333.5f, 317.6f)
                curveTo(330.1f, 325.7f, 349.1f, 325.0f, 321.0f, 342.1f)
                curveTo(318.9f, 326.8f, 322.6f, 309.3f, 325.2f, 294.0f)
                curveTo(322.2f, 297.9f, 315.7f, 306.2f, 311.3f, 308.2f)
                lineTo(310.1f, 307.3f)
                curveTo(310.2f, 305.4f, 310.2f, 303.5f, 310.1f, 301.7f)
                curveTo(310.0f, 299.0f, 310.5f, 300.0f, 308.8f, 298.4f)
                curveTo(304.2f, 300.4f, 303.2f, 308.7f, 301.0f, 313.1f)
                curveTo(283.8f, 346.9f, 292.0f, 383.2f, 290.9f, 419.7f)
                curveTo(283.0f, 394.1f, 283.0f, 375.0f, 281.6f, 348.5f)
                curveTo(280.2f, 351.0f, 275.9f, 358.6f, 275.3f, 361.1f)
                curveTo(270.9f, 382.4f, 274.5f, 407.6f, 274.2f, 429.5f)
                curveTo(274.1f, 434.2f, 275.5f, 442.0f, 274.6f, 445.8f)
                lineTo(273.0f, 445.4f)
                curveTo(257.5f, 427.6f, 265.4f, 368.5f, 256.2f, 363.9f)
                curveTo(248.7f, 369.8f, 245.7f, 408.4f, 243.5f, 419.4f)
                curveTo(243.2f, 418.1f, 243.0f, 416.9f, 242.8f, 415.6f)
                curveTo(238.3f, 380.5f, 240.3f, 330.0f, 244.2f, 294.5f)
                curveTo(247.1f, 268.4f, 271.7f, 217.3f, 287.9f, 196.2f)
                curveTo(285.7f, 208.9f, 281.4f, 219.8f, 281.2f, 233.0f)
                curveTo(289.9f, 213.5f, 292.5f, 195.7f, 311.2f, 184.9f)
                curveTo(307.4f, 201.3f, 302.6f, 217.5f, 298.7f, 234.5f)
                curveTo(312.1f, 228.6f, 319.2f, 230.3f, 327.5f, 216.0f)
                curveTo(340.8f, 192.9f, 348.8f, 162.7f, 364.4f, 141.1f)
                curveTo(360.1f, 155.4f, 353.2f, 191.4f, 352.7f, 206.0f)
                curveTo(357.1f, 200.4f, 362.0f, 190.8f, 366.1f, 184.5f)
                curveTo(374.9f, 170.6f, 384.6f, 154.8f, 395.6f, 142.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(649.6f, 241.1f)
                curveTo(659.6f, 242.5f, 669.4f, 248.3f, 671.4f, 258.8f)
                curveTo(674.0f, 272.4f, 669.1f, 280.9f, 662.0f, 291.7f)
                lineTo(662.4f, 293.0f)
                curveTo(669.3f, 295.0f, 679.1f, 293.8f, 683.2f, 295.4f)
                curveTo(698.5f, 301.5f, 704.1f, 324.9f, 698.6f, 338.9f)
                curveTo(695.9f, 345.9f, 685.9f, 348.5f, 680.0f, 350.8f)
                curveTo(670.7f, 346.9f, 665.7f, 344.1f, 658.2f, 337.4f)
                curveTo(656.5f, 346.7f, 655.5f, 348.5f, 649.5f, 355.5f)
                curveTo(646.1f, 358.1f, 646.1f, 358.9f, 642.4f, 359.4f)
                lineTo(641.5f, 357.7f)
                curveTo(641.8f, 352.9f, 644.1f, 349.4f, 646.4f, 345.2f)
                curveTo(638.0f, 348.7f, 632.2f, 351.9f, 623.3f, 354.9f)
                curveTo(596.6f, 344.7f, 601.8f, 319.6f, 618.2f, 301.1f)
                curveTo(623.5f, 295.0f, 634.2f, 296.0f, 641.8f, 296.1f)
                lineTo(642.9f, 294.8f)
                curveTo(633.9f, 283.5f, 624.4f, 270.5f, 631.6f, 254.5f)
                curveTo(634.8f, 247.5f, 642.5f, 243.5f, 649.6f, 241.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(667.1f, 300.5f)
                curveTo(672.6f, 300.5f, 676.5f, 302.5f, 681.3f, 304.7f)
                curveTo(686.9f, 313.9f, 693.6f, 328.9f, 682.9f, 337.0f)
                curveTo(660.1f, 342.7f, 656.9f, 313.2f, 667.1f, 300.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(629.8f, 305.8f)
                curveTo(648.2f, 304.7f, 638.6f, 327.6f, 632.4f, 335.0f)
                curveTo(630.3f, 337.5f, 627.7f, 339.4f, 625.2f, 341.3f)
                curveTo(617.4f, 340.7f, 612.5f, 332.1f, 614.8f, 324.7f)
                curveTo(617.7f, 315.0f, 621.2f, 310.9f, 629.8f, 305.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(649.5f, 250.5f)
                curveTo(656.6f, 251.5f, 661.3f, 260.7f, 663.5f, 266.6f)
                curveTo(661.1f, 275.1f, 661.2f, 277.8f, 654.2f, 282.8f)
                lineTo(653.5f, 282.8f)
                curveTo(632.8f, 281.8f, 637.1f, 261.0f, 649.5f, 250.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(471.2f, 197.9f)
                lineTo(472.6f, 199.0f)
                curveTo(473.8f, 222.2f, 455.8f, 272.6f, 447.8f, 294.9f)
                curveTo(444.2f, 291.2f, 435.0f, 282.2f, 429.5f, 283.3f)
                lineTo(429.3f, 284.3f)
                curveTo(431.2f, 291.9f, 438.3f, 297.1f, 444.0f, 302.4f)
                curveTo(439.4f, 308.2f, 437.5f, 310.3f, 432.0f, 315.2f)
                curveTo(427.2f, 313.9f, 419.9f, 310.6f, 415.4f, 311.2f)
                curveTo(415.6f, 313.8f, 418.9f, 316.9f, 420.7f, 319.1f)
                curveTo(432.1f, 332.8f, 425.3f, 333.0f, 414.0f, 340.9f)
                curveTo(406.5f, 336.9f, 405.4f, 336.3f, 400.7f, 329.2f)
                curveTo(404.0f, 320.4f, 405.5f, 318.9f, 411.4f, 311.7f)
                curveTo(404.8f, 312.8f, 402.4f, 313.3f, 396.1f, 315.5f)
                curveTo(393.1f, 312.4f, 389.3f, 309.1f, 386.0f, 306.1f)
                curveTo(387.2f, 302.4f, 388.7f, 295.5f, 391.6f, 293.6f)
                lineTo(396.3f, 290.2f)
                curveTo(399.3f, 289.6f, 402.4f, 291.3f, 405.3f, 292.5f)
                lineTo(406.8f, 291.8f)
                curveTo(407.0f, 287.5f, 401.7f, 280.6f, 401.6f, 278.0f)
                curveTo(401.3f, 272.7f, 406.6f, 272.1f, 404.5f, 264.4f)
                curveTo(401.7f, 262.5f, 401.5f, 262.6f, 397.9f, 262.5f)
                curveTo(383.4f, 262.1f, 387.7f, 248.6f, 389.7f, 238.2f)
                curveTo(393.8f, 239.0f, 398.5f, 240.4f, 402.3f, 239.0f)
                curveTo(405.2f, 236.5f, 404.4f, 237.7f, 405.6f, 234.5f)
                curveTo(403.7f, 231.5f, 404.7f, 232.5f, 401.0f, 230.8f)
                curveTo(397.3f, 230.5f, 394.6f, 232.6f, 391.4f, 234.4f)
                curveTo(397.6f, 223.7f, 400.7f, 214.8f, 408.1f, 203.0f)
                curveTo(416.9f, 205.3f, 423.1f, 207.2f, 431.3f, 211.2f)
                curveTo(433.2f, 214.3f, 435.1f, 218.4f, 436.7f, 221.8f)
                curveTo(433.9f, 237.2f, 429.3f, 244.8f, 428.2f, 262.3f)
                curveTo(437.1f, 240.3f, 450.5f, 211.5f, 471.2f, 197.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(548.8f, 168.6f)
                curveTo(565.6f, 185.8f, 574.4f, 201.8f, 577.2f, 225.8f)
                lineTo(580.5f, 225.4f)
                curveTo(581.2f, 217.5f, 581.8f, 209.1f, 582.6f, 201.3f)
                curveTo(589.5f, 217.6f, 595.0f, 238.6f, 591.1f, 256.2f)
                curveTo(590.1f, 295.4f, 588.7f, 315.0f, 580.9f, 353.2f)
                curveTo(579.9f, 349.8f, 579.3f, 349.3f, 577.1f, 346.6f)
                curveTo(577.2f, 277.6f, 573.3f, 233.4f, 548.8f, 168.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfefefe)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(582.6f, 201.3f)
                curveTo(589.5f, 217.6f, 595.0f, 238.6f, 591.1f, 256.2f)
                curveTo(590.6f, 252.1f, 591.2f, 244.5f, 591.5f, 240.1f)
                curveTo(587.1f, 240.1f, 582.2f, 240.4f, 578.1f, 239.0f)
                curveTo(575.7f, 235.6f, 576.8f, 230.0f, 577.2f, 225.8f)
                lineTo(580.5f, 225.4f)
                curveTo(581.2f, 217.5f, 581.8f, 209.1f, 582.6f, 201.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfefefe)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(577.2f, 225.8f)
                lineTo(580.5f, 225.4f)
                curveTo(580.3f, 229.1f, 580.3f, 234.8f, 579.1f, 238.1f)
                lineTo(578.1f, 239.0f)
                curveTo(575.7f, 235.6f, 576.8f, 230.0f, 577.2f, 225.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.2f, 453.8f)
                curveTo(246.0f, 456.8f, 258.4f, 486.6f, 259.3f, 493.1f)
                curveTo(261.0f, 505.8f, 261.4f, 520.7f, 261.9f, 533.6f)
                curveTo(263.3f, 566.9f, 263.4f, 600.3f, 262.0f, 633.5f)
                curveTo(261.1f, 633.6f, 261.2f, 633.5f, 260.1f, 633.0f)
                curveTo(258.6f, 629.8f, 255.4f, 620.5f, 255.3f, 617.1f)
                curveTo(253.7f, 563.0f, 243.7f, 507.7f, 242.2f, 453.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(664.1f, 463.1f)
                curveTo(665.2f, 463.4f, 668.1f, 464.2f, 668.9f, 464.8f)
                curveTo(693.3f, 483.0f, 668.3f, 530.9f, 657.2f, 550.2f)
                curveTo(653.7f, 555.6f, 652.3f, 557.1f, 647.9f, 561.7f)
                curveTo(651.3f, 540.5f, 656.9f, 520.3f, 660.6f, 499.3f)
                curveTo(662.7f, 487.8f, 663.2f, 474.9f, 664.1f, 463.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(638.2f, 806.0f)
                curveTo(644.8f, 811.0f, 650.7f, 866.1f, 633.8f, 869.5f)
                curveTo(632.7f, 856.2f, 627.5f, 830.5f, 624.9f, 816.8f)
                curveTo(627.1f, 813.2f, 634.3f, 808.9f, 638.2f, 806.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(641.9f, 550.1f)
                lineTo(642.3f, 550.6f)
                curveTo(643.1f, 553.3f, 641.7f, 564.6f, 641.0f, 567.6f)
                curveTo(637.4f, 581.2f, 637.4f, 588.7f, 625.5f, 596.9f)
                curveTo(622.2f, 592.2f, 626.9f, 568.2f, 628.5f, 561.7f)
                curveTo(629.8f, 556.2f, 637.2f, 552.7f, 641.9f, 550.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(631.0f, 639.8f)
                lineTo(632.7f, 641.0f)
                curveTo(636.4f, 658.3f, 632.0f, 674.6f, 621.0f, 688.1f)
                lineTo(620.1f, 687.5f)
                curveTo(618.4f, 683.8f, 620.2f, 651.9f, 620.8f, 645.4f)
                curveTo(624.1f, 643.1f, 627.4f, 641.6f, 631.0f, 639.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(656.5f, 357.7f)
                lineTo(657.3f, 358.4f)
                curveTo(658.5f, 361.5f, 658.7f, 374.7f, 658.4f, 378.4f)
                curveTo(656.9f, 392.2f, 653.5f, 397.9f, 643.7f, 406.5f)
                curveTo(641.4f, 403.5f, 643.9f, 379.6f, 644.0f, 373.4f)
                curveTo(646.9f, 368.9f, 652.9f, 362.0f, 656.5f, 357.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(335.4f, 339.4f)
                curveTo(341.9f, 339.4f, 348.2f, 346.7f, 352.6f, 351.1f)
                curveTo(349.7f, 355.4f, 346.2f, 361.5f, 342.1f, 364.4f)
                curveTo(330.8f, 365.8f, 327.8f, 360.2f, 324.3f, 350.7f)
                curveTo(328.6f, 345.5f, 330.2f, 343.8f, 335.4f, 339.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(647.9f, 500.9f)
                curveTo(651.2f, 504.2f, 644.5f, 530.6f, 642.8f, 535.7f)
                curveTo(640.1f, 538.3f, 635.1f, 541.7f, 632.0f, 544.0f)
                lineTo(631.1f, 542.0f)
                curveTo(632.7f, 526.4f, 632.0f, 507.9f, 647.9f, 500.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(631.7f, 687.8f)
                curveTo(634.1f, 691.2f, 632.9f, 713.1f, 632.8f, 718.8f)
                curveTo(629.4f, 724.1f, 626.7f, 726.4f, 621.5f, 729.8f)
                curveTo(619.4f, 722.5f, 620.1f, 706.1f, 620.3f, 698.0f)
                curveTo(624.3f, 693.4f, 626.9f, 691.5f, 631.7f, 687.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(295.1f, 466.5f)
                curveTo(300.8f, 467.3f, 303.6f, 469.1f, 308.5f, 471.8f)
                curveTo(309.2f, 475.7f, 309.5f, 480.1f, 312.7f, 482.6f)
                curveTo(315.9f, 482.7f, 314.9f, 482.7f, 317.9f, 480.5f)
                lineTo(319.7f, 480.9f)
                curveTo(321.2f, 485.3f, 320.1f, 491.7f, 319.8f, 496.8f)
                lineTo(318.0f, 498.0f)
                curveTo(304.6f, 496.9f, 295.9f, 478.8f, 295.1f, 466.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(653.8f, 450.0f)
                lineTo(654.6f, 451.1f)
                curveTo(654.0f, 459.5f, 652.3f, 476.4f, 650.4f, 484.2f)
                curveTo(646.0f, 489.5f, 643.9f, 491.0f, 638.5f, 495.2f)
                curveTo(636.9f, 492.5f, 639.1f, 486.2f, 639.7f, 482.8f)
                curveTo(641.1f, 475.0f, 641.4f, 468.2f, 641.1f, 460.3f)
                curveTo(645.2f, 457.4f, 649.9f, 453.3f, 653.8f, 450.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(653.8f, 407.9f)
                curveTo(654.3f, 408.0f, 655.0f, 408.7f, 655.5f, 409.0f)
                curveTo(656.4f, 417.0f, 656.0f, 428.2f, 655.9f, 436.4f)
                curveTo(652.0f, 441.1f, 649.2f, 444.9f, 644.1f, 448.3f)
                lineTo(642.6f, 447.6f)
                curveTo(641.9f, 441.4f, 643.9f, 424.2f, 644.0f, 416.3f)
                curveTo(646.7f, 413.6f, 650.8f, 410.4f, 653.8f, 407.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(637.1f, 770.9f)
                curveTo(637.4f, 772.6f, 636.7f, 776.5f, 636.9f, 778.4f)
                curveTo(638.8f, 794.1f, 640.4f, 796.2f, 626.7f, 805.1f)
                lineTo(626.1f, 804.9f)
                curveTo(624.7f, 802.8f, 624.6f, 779.8f, 624.4f, 775.2f)
                curveTo(629.5f, 773.9f, 632.5f, 773.3f, 637.1f, 770.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(632.3f, 731.1f)
                curveTo(635.1f, 734.0f, 634.4f, 753.5f, 634.4f, 758.9f)
                curveTo(631.1f, 762.5f, 628.8f, 765.0f, 625.2f, 768.3f)
                curveTo(623.4f, 762.1f, 622.4f, 744.1f, 622.0f, 737.3f)
                lineTo(632.3f, 731.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(382.7f, 315.0f)
                lineTo(383.8f, 314.7f)
                curveTo(406.4f, 320.0f, 391.1f, 346.7f, 383.0f, 339.0f)
                lineTo(383.0f, 336.3f)
                lineTo(383.0f, 316.1f)
                curveTo(380.6f, 320.7f, 378.4f, 326.1f, 372.7f, 326.8f)
                lineTo(372.7f, 324.8f)
                curveTo(375.3f, 319.5f, 377.8f, 318.6f, 382.7f, 315.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(632.3f, 601.8f)
                lineTo(634.2f, 603.4f)
                curveTo(635.0f, 609.0f, 634.3f, 617.5f, 634.0f, 623.4f)
                curveTo(629.9f, 629.3f, 629.2f, 630.4f, 623.6f, 635.0f)
                lineTo(622.3f, 635.1f)
                lineTo(621.2f, 633.5f)
                curveTo(621.4f, 624.6f, 621.0f, 615.3f, 624.5f, 606.9f)
                curveTo(625.8f, 603.9f, 629.2f, 603.0f, 632.3f, 601.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(475.5f, 410.2f)
                curveTo(491.7f, 410.9f, 482.7f, 422.3f, 477.8f, 431.9f)
                curveTo(475.3f, 433.0f, 474.6f, 433.5f, 471.9f, 433.5f)
                curveTo(469.2f, 429.6f, 474.6f, 418.5f, 475.5f, 410.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(562.6f, 428.8f)
                curveTo(563.5f, 429.7f, 563.5f, 430.1f, 563.9f, 431.4f)
                curveTo(562.8f, 441.1f, 558.9f, 447.2f, 551.8f, 453.6f)
                curveTo(545.2f, 445.5f, 557.3f, 434.3f, 562.6f, 428.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(326.1f, 367.2f)
                curveTo(336.2f, 371.2f, 337.0f, 376.2f, 334.0f, 385.9f)
                curveTo(331.8f, 387.3f, 331.3f, 387.4f, 328.9f, 388.2f)
                lineTo(327.0f, 387.1f)
                curveTo(324.9f, 382.7f, 325.9f, 372.6f, 326.1f, 367.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfefefe)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(412.3f, 364.8f)
                lineTo(413.3f, 365.2f)
                lineTo(413.8f, 366.9f)
                curveTo(411.6f, 374.4f, 408.5f, 381.5f, 403.5f, 387.5f)
                curveTo(402.9f, 387.3f, 401.9f, 386.4f, 401.3f, 386.0f)
                curveTo(399.4f, 377.9f, 405.5f, 368.8f, 412.3f, 364.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(406.9f, 346.0f)
                curveTo(410.5f, 347.2f, 411.1f, 348.2f, 412.5f, 351.4f)
                curveTo(412.4f, 355.2f, 410.2f, 358.2f, 408.3f, 361.5f)
                lineTo(405.4f, 362.4f)
                lineTo(404.5f, 361.0f)
                curveTo(405.0f, 355.3f, 405.7f, 351.7f, 406.9f, 346.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.27451f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(300.4f, 820.1f)
                curveTo(301.0f, 815.0f, 301.5f, 809.1f, 303.4f, 804.3f)
                lineTo(304.8f, 804.2f)
                lineTo(304.4f, 803.0f)
                curveTo(305.5f, 805.2f, 303.8f, 829.2f, 303.1f, 832.4f)
                curveTo(302.5f, 828.3f, 303.3f, 823.5f, 301.9f, 820.0f)
                lineTo(300.4f, 820.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFfefefe)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(577.1f, 346.6f)
                curveTo(579.3f, 349.3f, 579.9f, 349.8f, 580.9f, 353.2f)
                curveTo(580.4f, 355.5f, 579.9f, 359.2f, 578.1f, 360.4f)
                curveTo(576.6f, 356.4f, 577.1f, 351.0f, 577.1f, 346.6f)
                close()
            }
        }
        .build()
        return _standardHifumiTogo!!
    }

private var _standardHifumiTogo: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = StandardSenderAvatar.StandardHifumiTogo, contentDescription = "")
    }
}
