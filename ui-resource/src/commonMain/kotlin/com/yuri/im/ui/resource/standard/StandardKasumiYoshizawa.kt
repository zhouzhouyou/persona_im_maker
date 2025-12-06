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

public val StandardSenderAvatar.StandardKasumiYoshizawa: ImageVector
    get() {
        if (_standardKasumiYoshizawa != null) {
            return _standardKasumiYoshizawa!!
        }
        _standardKasumiYoshizawa = Builder(name = "StandardKasumiYoshizawa", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 1024.0f, viewportHeight =
                1024.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(325.3f, 820.3f)
                lineTo(325.4f, 819.9f)
                curveTo(330.7f, 807.6f, 331.0f, 788.1f, 326.6f, 776.2f)
                curveTo(323.3f, 767.4f, 304.7f, 745.1f, 309.0f, 738.6f)
                curveTo(318.0f, 725.0f, 317.0f, 725.8f, 301.8f, 710.3f)
                curveTo(290.6f, 698.7f, 278.9f, 687.6f, 266.7f, 677.0f)
                curveTo(244.2f, 657.3f, 223.2f, 642.1f, 211.0f, 613.6f)
                curveTo(205.4f, 600.3f, 200.8f, 586.9f, 195.3f, 573.6f)
                curveTo(179.6f, 536.0f, 152.8f, 508.3f, 158.2f, 464.8f)
                curveTo(161.0f, 441.5f, 156.8f, 431.0f, 145.6f, 411.0f)
                curveTo(139.5f, 398.5f, 132.5f, 372.5f, 130.7f, 357.9f)
                curveTo(130.7f, 322.0f, 139.2f, 285.4f, 151.6f, 252.1f)
                curveTo(163.8f, 219.5f, 187.6f, 191.9f, 214.2f, 170.2f)
                curveTo(220.1f, 165.3f, 235.8f, 150.4f, 242.1f, 146.9f)
                curveTo(259.8f, 137.4f, 286.2f, 122.0f, 304.2f, 114.3f)
                curveTo(342.8f, 99.3f, 391.1f, 92.9f, 432.1f, 91.7f)
                curveTo(448.5f, 91.2f, 477.7f, 97.8f, 492.4f, 103.1f)
                curveTo(513.9f, 111.2f, 535.6f, 119.8f, 556.9f, 128.3f)
                curveTo(563.4f, 130.8f, 578.6f, 144.8f, 583.0f, 145.2f)
                curveTo(609.2f, 147.8f, 653.7f, 163.3f, 672.8f, 181.6f)
                curveTo(685.8f, 194.1f, 708.5f, 235.3f, 719.4f, 253.6f)
                curveTo(717.1f, 258.2f, 714.7f, 263.6f, 712.1f, 267.6f)
                curveTo(708.4f, 273.5f, 693.5f, 277.4f, 697.9f, 285.5f)
                curveTo(713.7f, 314.3f, 720.3f, 344.2f, 726.6f, 376.1f)
                curveTo(728.2f, 384.4f, 729.8f, 392.9f, 732.2f, 401.0f)
                curveTo(737.5f, 418.9f, 755.2f, 446.7f, 759.0f, 463.9f)
                curveTo(738.2f, 476.9f, 729.9f, 480.3f, 711.7f, 498.3f)
                lineTo(709.8f, 511.7f)
                curveTo(706.4f, 514.2f, 703.3f, 516.7f, 699.7f, 518.8f)
                curveTo(705.9f, 533.2f, 708.6f, 548.9f, 714.1f, 563.4f)
                curveTo(721.5f, 583.4f, 727.1f, 604.0f, 733.7f, 624.2f)
                curveTo(744.2f, 656.3f, 756.3f, 692.4f, 762.2f, 725.5f)
                curveTo(768.5f, 761.1f, 770.6f, 757.8f, 790.4f, 787.4f)
                curveTo(825.4f, 788.5f, 819.6f, 792.6f, 840.6f, 819.6f)
                curveTo(849.7f, 831.4f, 860.7f, 843.1f, 867.8f, 856.5f)
                curveTo(886.5f, 894.4f, 879.1f, 932.4f, 880.6f, 972.6f)
                curveTo(881.2f, 986.3f, 884.1f, 1010.6f, 886.1f, 1024.0f)
                lineTo(127.9f, 1024.0f)
                curveTo(125.0f, 1008.4f, 125.0f, 987.2f, 124.6f, 971.0f)
                curveTo(139.5f, 948.8f, 156.8f, 922.9f, 172.9f, 901.9f)
                curveTo(176.0f, 897.9f, 221.9f, 883.5f, 232.2f, 877.3f)
                curveTo(263.2f, 858.6f, 295.0f, 840.2f, 325.3f, 820.3f)
                close()
                moveTo(501.3f, 400.2f)
                curveTo(497.5f, 395.5f, 493.4f, 387.8f, 490.2f, 384.4f)
                curveTo(492.3f, 390.5f, 494.9f, 398.5f, 498.6f, 403.9f)
                lineTo(501.3f, 400.2f)
                close()
                moveTo(580.1f, 183.0f)
                curveTo(579.9f, 178.0f, 578.2f, 173.0f, 572.6f, 171.6f)
                curveTo(572.4f, 177.8f, 575.2f, 179.5f, 580.1f, 183.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(217.2f, 426.7f)
                curveTo(226.9f, 425.8f, 237.7f, 423.6f, 247.2f, 425.1f)
                curveTo(266.0f, 427.9f, 284.7f, 431.8f, 299.5f, 444.5f)
                curveTo(304.2f, 448.6f, 311.8f, 459.0f, 317.6f, 458.8f)
                curveTo(318.9f, 457.7f, 320.3f, 456.6f, 321.6f, 455.5f)
                curveTo(336.6f, 457.5f, 378.9f, 474.4f, 380.5f, 449.3f)
                curveTo(376.6f, 447.4f, 368.5f, 453.2f, 367.5f, 452.9f)
                curveTo(337.9f, 445.8f, 323.7f, 420.6f, 331.3f, 391.6f)
                curveTo(331.9f, 389.2f, 334.7f, 386.8f, 336.9f, 385.6f)
                lineTo(337.9f, 386.0f)
                curveTo(335.3f, 394.6f, 338.6f, 398.6f, 341.0f, 406.4f)
                curveTo(350.7f, 437.3f, 370.9f, 434.4f, 397.2f, 430.7f)
                curveTo(400.7f, 427.0f, 404.3f, 423.3f, 407.5f, 419.5f)
                curveTo(410.4f, 419.7f, 423.1f, 422.4f, 422.6f, 422.5f)
                curveTo(457.5f, 415.4f, 487.3f, 409.9f, 520.2f, 428.3f)
                curveTo(522.4f, 429.5f, 526.8f, 431.7f, 529.5f, 431.1f)
                curveTo(530.5f, 425.3f, 504.3f, 411.4f, 498.6f, 403.9f)
                lineTo(501.3f, 400.2f)
                curveTo(511.1f, 408.6f, 524.2f, 414.1f, 536.9f, 416.1f)
                curveTo(545.7f, 411.7f, 548.9f, 410.5f, 557.9f, 407.3f)
                curveTo(557.2f, 425.7f, 562.1f, 424.0f, 563.7f, 436.8f)
                lineTo(562.8f, 437.4f)
                lineTo(557.4f, 434.1f)
                lineTo(556.2f, 434.4f)
                curveTo(556.1f, 439.3f, 561.5f, 451.8f, 563.6f, 456.7f)
                curveTo(560.3f, 479.5f, 558.7f, 500.3f, 534.5f, 509.7f)
                curveTo(534.2f, 513.8f, 533.9f, 512.3f, 535.5f, 515.7f)
                curveTo(547.2f, 521.4f, 564.8f, 504.8f, 569.0f, 495.0f)
                curveTo(573.0f, 485.6f, 570.4f, 482.7f, 572.4f, 473.6f)
                curveTo(574.9f, 465.7f, 587.0f, 457.6f, 586.7f, 449.6f)
                lineTo(584.2f, 445.6f)
                curveTo(585.7f, 440.5f, 605.3f, 432.7f, 610.5f, 430.3f)
                curveTo(617.9f, 442.3f, 630.8f, 462.0f, 626.4f, 476.5f)
                curveTo(623.5f, 485.9f, 623.1f, 495.4f, 620.1f, 504.6f)
                curveTo(611.6f, 531.3f, 592.0f, 548.6f, 569.0f, 562.8f)
                curveTo(566.3f, 564.5f, 563.6f, 566.1f, 560.8f, 567.6f)
                curveTo(554.7f, 567.3f, 552.4f, 567.2f, 546.2f, 567.9f)
                curveTo(542.8f, 577.8f, 538.7f, 590.2f, 533.4f, 599.2f)
                curveTo(513.2f, 631.8f, 478.2f, 664.6f, 444.0f, 681.9f)
                curveTo(418.3f, 694.8f, 390.4f, 708.0f, 363.0f, 715.8f)
                curveTo(345.1f, 719.8f, 330.6f, 702.0f, 318.2f, 692.8f)
                curveTo(285.8f, 668.6f, 251.9f, 642.0f, 235.0f, 604.1f)
                curveTo(214.8f, 558.7f, 207.7f, 508.3f, 186.1f, 463.4f)
                curveTo(182.1f, 455.2f, 178.5f, 442.1f, 175.7f, 433.0f)
                curveTo(189.7f, 445.5f, 201.8f, 443.2f, 219.9f, 442.7f)
                curveTo(220.0f, 448.6f, 220.2f, 453.4f, 220.8f, 459.3f)
                curveTo(216.7f, 457.1f, 208.6f, 451.8f, 205.0f, 451.8f)
                curveTo(199.5f, 461.8f, 215.3f, 462.7f, 215.3f, 468.7f)
                curveTo(211.3f, 474.7f, 207.6f, 471.6f, 201.2f, 472.5f)
                curveTo(201.7f, 476.4f, 208.4f, 480.4f, 211.7f, 482.6f)
                curveTo(211.1f, 484.8f, 210.9f, 485.0f, 209.7f, 487.0f)
                curveTo(211.1f, 493.0f, 217.5f, 490.7f, 215.7f, 498.4f)
                curveTo(213.2f, 501.1f, 212.1f, 501.4f, 211.8f, 504.4f)
                lineTo(213.3f, 505.9f)
                curveTo(218.6f, 504.6f, 218.1f, 503.0f, 221.7f, 504.6f)
                curveTo(223.8f, 508.7f, 225.1f, 514.7f, 227.6f, 516.8f)
                lineTo(230.4f, 516.6f)
                curveTo(235.8f, 509.3f, 221.4f, 493.5f, 222.8f, 485.3f)
                curveTo(223.5f, 481.0f, 224.1f, 477.1f, 224.2f, 472.8f)
                curveTo(227.1f, 468.9f, 232.6f, 460.6f, 237.4f, 459.9f)
                curveTo(240.6f, 467.8f, 226.9f, 487.1f, 240.1f, 493.7f)
                curveTo(241.2f, 494.2f, 246.4f, 493.9f, 248.0f, 494.0f)
                curveTo(250.9f, 501.0f, 240.6f, 500.0f, 252.1f, 514.0f)
                curveTo(265.5f, 514.3f, 279.7f, 511.3f, 280.8f, 494.9f)
                curveTo(281.2f, 489.0f, 275.5f, 485.0f, 276.6f, 479.9f)
                lineTo(278.3f, 478.3f)
                curveTo(285.2f, 478.9f, 290.6f, 490.1f, 295.4f, 488.0f)
                curveTo(297.0f, 477.2f, 273.8f, 455.7f, 267.4f, 447.2f)
                curveTo(271.7f, 448.6f, 275.9f, 449.7f, 280.0f, 451.9f)
                curveTo(285.9f, 455.1f, 289.4f, 461.9f, 295.5f, 463.3f)
                lineTo(297.1f, 462.2f)
                curveTo(297.9f, 449.9f, 274.9f, 440.1f, 264.6f, 440.1f)
                curveTo(250.5f, 440.1f, 239.6f, 441.9f, 225.8f, 437.8f)
                curveTo(222.9f, 433.8f, 220.5f, 430.5f, 217.2f, 426.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(406.4f, 460.8f)
                curveTo(409.9f, 450.9f, 416.6f, 453.1f, 413.9f, 447.1f)
                curveTo(411.6f, 441.9f, 406.7f, 440.3f, 408.5f, 434.0f)
                lineTo(410.2f, 433.6f)
                curveTo(415.2f, 437.5f, 422.5f, 450.7f, 431.2f, 442.8f)
                curveTo(434.1f, 435.4f, 431.4f, 427.9f, 431.3f, 419.8f)
                curveTo(443.5f, 437.7f, 443.2f, 438.9f, 464.7f, 439.5f)
                curveTo(462.0f, 436.8f, 455.7f, 431.5f, 455.2f, 428.1f)
                curveTo(457.3f, 426.3f, 458.2f, 425.3f, 460.9f, 424.4f)
                curveTo(462.9f, 426.0f, 466.2f, 433.7f, 470.2f, 438.3f)
                curveTo(478.8f, 441.3f, 488.2f, 443.8f, 495.2f, 449.6f)
                curveTo(497.9f, 445.7f, 499.4f, 443.2f, 503.5f, 440.6f)
                lineTo(505.3f, 440.8f)
                curveTo(507.3f, 447.5f, 500.9f, 457.9f, 502.7f, 462.3f)
                curveTo(506.5f, 463.2f, 513.0f, 459.3f, 516.8f, 457.4f)
                curveTo(515.9f, 459.3f, 513.0f, 464.8f, 511.7f, 465.8f)
                curveTo(496.6f, 476.7f, 508.2f, 480.8f, 506.4f, 488.4f)
                curveTo(491.5f, 499.6f, 500.5f, 467.8f, 490.4f, 463.1f)
                curveTo(486.6f, 463.3f, 487.7f, 463.3f, 484.3f, 465.6f)
                curveTo(480.7f, 472.6f, 504.8f, 494.7f, 465.1f, 511.7f)
                curveTo(452.5f, 509.1f, 448.4f, 508.6f, 439.3f, 499.0f)
                curveTo(443.1f, 494.4f, 445.5f, 491.5f, 448.8f, 486.5f)
                lineTo(435.1f, 484.9f)
                curveTo(436.3f, 466.9f, 436.6f, 462.7f, 448.9f, 448.7f)
                curveTo(438.3f, 452.5f, 438.7f, 452.0f, 429.7f, 458.0f)
                curveTo(421.2f, 463.7f, 412.6f, 481.4f, 407.5f, 482.9f)
                curveTo(405.7f, 480.9f, 406.3f, 481.7f, 406.0f, 478.6f)
                curveTo(406.0f, 474.4f, 403.2f, 472.4f, 402.5f, 466.5f)
                curveTo(403.2f, 463.4f, 404.1f, 462.9f, 406.4f, 460.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEAE9EA)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(406.4f, 460.8f)
                curveTo(408.8f, 460.1f, 410.1f, 459.8f, 412.7f, 459.6f)
                curveTo(417.3f, 463.5f, 408.4f, 473.1f, 406.0f, 478.6f)
                curveTo(406.0f, 474.4f, 403.2f, 472.4f, 402.5f, 466.5f)
                curveTo(403.2f, 463.4f, 404.1f, 462.9f, 406.4f, 460.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(337.4f, 626.1f)
                curveTo(347.8f, 625.6f, 391.3f, 626.9f, 396.5f, 635.0f)
                curveTo(394.1f, 641.5f, 360.4f, 649.9f, 354.8f, 653.4f)
                lineTo(354.5f, 655.6f)
                curveTo(360.5f, 658.2f, 369.2f, 656.3f, 371.1f, 661.5f)
                curveTo(366.7f, 667.9f, 340.8f, 667.9f, 336.3f, 661.0f)
                curveTo(335.6f, 658.4f, 336.4f, 657.3f, 337.6f, 655.0f)
                lineTo(338.0f, 654.2f)
                curveTo(337.8f, 653.5f, 324.2f, 638.6f, 321.3f, 634.0f)
                curveTo(326.7f, 631.3f, 332.0f, 628.6f, 337.4f, 626.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEAE9EA)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(347.1f, 635.3f)
                curveTo(352.6f, 635.0f, 367.4f, 633.3f, 370.9f, 636.4f)
                curveTo(369.9f, 639.3f, 368.7f, 639.3f, 365.5f, 641.2f)
                curveTo(360.8f, 643.4f, 356.9f, 644.5f, 352.0f, 646.1f)
                curveTo(349.8f, 642.2f, 348.0f, 639.6f, 347.1f, 635.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(593.5f, 462.0f)
                curveTo(600.4f, 462.5f, 610.6f, 481.1f, 611.9f, 487.6f)
                curveTo(610.4f, 491.7f, 605.7f, 489.6f, 604.7f, 492.1f)
                curveTo(596.5f, 512.7f, 594.7f, 522.7f, 572.5f, 533.4f)
                curveTo(568.0f, 534.9f, 560.8f, 537.1f, 558.9f, 531.5f)
                curveTo(561.7f, 523.7f, 575.1f, 515.3f, 582.2f, 505.8f)
                lineTo(576.0f, 495.7f)
                curveTo(577.1f, 487.8f, 578.5f, 483.2f, 579.1f, 474.6f)
                curveTo(583.9f, 468.9f, 587.5f, 466.5f, 593.5f, 462.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(331.6f, 566.7f)
                lineTo(332.8f, 567.0f)
                curveTo(333.9f, 569.1f, 330.9f, 579.4f, 330.6f, 583.1f)
                curveTo(329.8f, 593.7f, 346.9f, 593.0f, 345.7f, 605.0f)
                curveTo(342.6f, 607.8f, 343.9f, 607.0f, 339.6f, 607.9f)
                curveTo(330.4f, 603.6f, 326.8f, 601.2f, 319.4f, 594.6f)
                curveTo(319.4f, 594.1f, 319.5f, 593.6f, 319.5f, 593.1f)
                curveTo(320.6f, 581.4f, 322.5f, 574.3f, 331.6f, 566.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(313.8f, 468.2f)
                curveTo(319.6f, 467.7f, 324.2f, 466.8f, 329.0f, 470.5f)
                curveTo(333.1f, 476.2f, 330.4f, 482.8f, 329.6f, 490.2f)
                curveTo(326.2f, 489.1f, 317.2f, 478.1f, 314.6f, 474.7f)
                curveTo(312.6f, 471.9f, 313.2f, 471.0f, 313.8f, 468.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.8f, 587.5f)
                curveTo(360.3f, 589.2f, 366.5f, 588.8f, 368.2f, 596.9f)
                curveTo(364.0f, 596.8f, 358.4f, 597.2f, 354.9f, 595.4f)
                curveTo(352.2f, 592.1f, 353.1f, 592.6f, 352.8f, 587.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(308.1f, 248.4f)
                curveTo(317.1f, 224.8f, 334.1f, 212.0f, 353.2f, 196.4f)
                curveTo(346.3f, 209.2f, 313.9f, 247.5f, 348.4f, 247.2f)
                curveTo(355.9f, 247.1f, 360.8f, 245.4f, 367.7f, 243.0f)
                curveTo(378.1f, 245.6f, 380.3f, 245.5f, 387.6f, 253.3f)
                curveTo(389.5f, 256.0f, 388.8f, 256.8f, 388.8f, 260.8f)
                curveTo(395.3f, 261.1f, 395.5f, 259.2f, 401.9f, 256.9f)
                curveTo(405.0f, 256.8f, 407.7f, 259.6f, 410.3f, 261.6f)
                curveTo(412.8f, 268.6f, 415.3f, 280.8f, 404.2f, 282.3f)
                curveTo(396.4f, 283.3f, 391.7f, 278.1f, 386.2f, 273.4f)
                curveTo(367.7f, 289.5f, 364.4f, 281.6f, 353.7f, 264.5f)
                curveTo(351.0f, 292.1f, 339.3f, 278.7f, 331.8f, 281.7f)
                curveTo(330.9f, 291.0f, 348.9f, 293.5f, 325.4f, 309.6f)
                curveTo(321.7f, 307.1f, 317.9f, 304.9f, 313.9f, 302.6f)
                curveTo(313.9f, 294.6f, 314.3f, 292.5f, 315.7f, 284.6f)
                curveTo(313.6f, 283.0f, 309.1f, 283.0f, 306.0f, 281.4f)
                curveTo(302.3f, 279.4f, 299.5f, 277.0f, 296.3f, 274.4f)
                curveTo(290.5f, 279.8f, 284.4f, 285.2f, 278.5f, 290.6f)
                lineTo(277.3f, 302.3f)
                curveTo(272.2f, 305.9f, 268.8f, 307.9f, 263.3f, 311.0f)
                curveTo(240.3f, 287.1f, 270.6f, 288.8f, 265.4f, 274.1f)
                curveTo(259.9f, 274.3f, 253.1f, 286.2f, 247.9f, 282.3f)
                curveTo(245.9f, 277.1f, 251.6f, 268.8f, 254.8f, 264.8f)
                curveTo(262.9f, 254.7f, 257.3f, 258.4f, 257.1f, 252.8f)
                curveTo(264.2f, 240.3f, 299.1f, 207.2f, 310.8f, 200.3f)
                curveTo(303.1f, 217.8f, 297.3f, 216.6f, 290.7f, 241.6f)
                curveTo(297.3f, 243.8f, 301.7f, 245.5f, 308.1f, 248.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(659.6f, 473.4f)
                curveTo(665.5f, 476.3f, 661.4f, 507.3f, 664.3f, 513.7f)
                curveTo(667.4f, 520.8f, 673.6f, 521.3f, 672.2f, 531.5f)
                curveTo(669.7f, 534.0f, 669.0f, 533.5f, 664.8f, 534.5f)
                curveTo(663.0f, 538.8f, 674.0f, 544.1f, 672.1f, 550.4f)
                curveTo(670.3f, 556.4f, 662.6f, 557.1f, 662.2f, 563.3f)
                curveTo(667.8f, 565.7f, 675.7f, 559.4f, 680.0f, 564.0f)
                curveTo(682.6f, 566.6f, 686.3f, 574.4f, 688.1f, 577.9f)
                curveTo(681.8f, 583.9f, 677.9f, 584.6f, 673.1f, 589.2f)
                curveTo(672.8f, 592.4f, 672.5f, 591.1f, 674.2f, 594.0f)
                lineTo(676.4f, 594.4f)
                curveTo(680.2f, 592.9f, 685.6f, 587.0f, 689.3f, 583.9f)
                curveTo(692.5f, 592.3f, 695.2f, 599.4f, 699.1f, 607.6f)
                curveTo(689.0f, 613.6f, 685.1f, 608.8f, 681.4f, 610.9f)
                curveTo(680.8f, 620.2f, 700.0f, 627.2f, 674.7f, 636.8f)
                lineTo(669.7f, 635.3f)
                curveTo(665.2f, 633.8f, 656.5f, 630.9f, 652.1f, 633.2f)
                curveTo(654.4f, 636.7f, 661.3f, 638.1f, 665.3f, 639.1f)
                curveTo(667.6f, 641.1f, 670.3f, 644.7f, 672.2f, 647.2f)
                curveTo(671.1f, 651.3f, 668.7f, 657.2f, 667.2f, 661.4f)
                lineTo(652.8f, 663.4f)
                curveTo(655.6f, 673.8f, 660.6f, 688.4f, 664.7f, 698.5f)
                curveTo(665.6f, 700.6f, 670.5f, 705.9f, 672.4f, 709.7f)
                lineTo(672.7f, 710.4f)
                curveTo(674.2f, 712.8f, 674.7f, 713.4f, 675.1f, 716.3f)
                curveTo(673.4f, 717.0f, 673.6f, 717.2f, 671.4f, 716.2f)
                curveTo(648.4f, 706.0f, 653.2f, 686.6f, 644.5f, 666.7f)
                curveTo(640.4f, 665.7f, 634.4f, 664.9f, 630.0f, 664.2f)
                curveTo(611.1f, 638.7f, 617.8f, 628.5f, 608.4f, 600.5f)
                curveTo(612.5f, 606.5f, 624.1f, 627.4f, 628.2f, 629.4f)
                lineTo(629.9f, 628.1f)
                curveTo(636.8f, 612.8f, 634.7f, 599.6f, 632.1f, 583.6f)
                curveTo(642.2f, 599.1f, 647.0f, 603.8f, 662.9f, 613.1f)
                curveTo(638.9f, 565.5f, 640.3f, 522.4f, 659.6f, 473.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.6f, 356.2f)
                curveTo(171.6f, 334.0f, 160.5f, 298.7f, 167.0f, 275.2f)
                curveTo(179.7f, 228.9f, 217.2f, 194.7f, 256.7f, 170.1f)
                curveTo(257.9f, 171.0f, 260.1f, 172.6f, 261.1f, 173.5f)
                curveTo(244.5f, 187.5f, 226.1f, 203.4f, 220.0f, 225.8f)
                lineTo(220.4f, 227.9f)
                curveTo(224.0f, 227.8f, 226.1f, 224.5f, 229.6f, 224.1f)
                curveTo(233.9f, 223.5f, 235.5f, 228.0f, 238.0f, 228.3f)
                curveTo(240.1f, 228.5f, 261.2f, 208.9f, 267.2f, 205.8f)
                curveTo(247.6f, 230.9f, 236.3f, 252.4f, 231.5f, 284.8f)
                curveTo(230.3f, 293.4f, 231.6f, 304.5f, 231.0f, 312.9f)
                curveTo(230.9f, 315.9f, 232.6f, 320.6f, 232.4f, 321.8f)
                curveTo(227.5f, 352.3f, 188.6f, 312.9f, 218.7f, 309.0f)
                curveTo(220.2f, 308.7f, 226.0f, 311.1f, 228.7f, 311.5f)
                curveTo(222.7f, 300.5f, 221.2f, 297.6f, 219.7f, 285.2f)
                curveTo(213.5f, 278.8f, 209.5f, 278.4f, 207.0f, 268.7f)
                curveTo(208.8f, 259.3f, 224.6f, 261.9f, 222.0f, 252.2f)
                lineTo(220.2f, 251.2f)
                curveTo(215.3f, 252.7f, 210.5f, 259.8f, 207.4f, 264.0f)
                curveTo(205.0f, 260.3f, 204.1f, 258.1f, 200.1f, 256.5f)
                lineTo(199.1f, 257.9f)
                curveTo(198.6f, 263.2f, 200.6f, 269.1f, 202.0f, 274.4f)
                curveTo(196.3f, 280.9f, 194.0f, 280.8f, 186.0f, 284.3f)
                curveTo(182.6f, 291.1f, 180.9f, 346.3f, 180.6f, 356.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(603.9f, 214.8f)
                curveTo(607.8f, 217.2f, 614.0f, 229.2f, 617.6f, 233.0f)
                curveTo(620.0f, 235.6f, 627.9f, 240.5f, 629.4f, 242.9f)
                curveTo(631.9f, 247.2f, 621.1f, 258.4f, 620.6f, 263.5f)
                curveTo(619.6f, 274.0f, 627.9f, 270.6f, 632.3f, 277.1f)
                curveTo(633.2f, 281.2f, 631.5f, 285.0f, 630.1f, 289.1f)
                lineTo(643.0f, 294.1f)
                curveTo(644.7f, 289.6f, 646.0f, 279.1f, 650.4f, 277.9f)
                lineTo(651.7f, 279.5f)
                curveTo(652.3f, 294.2f, 655.7f, 318.7f, 652.1f, 332.4f)
                curveTo(649.1f, 344.2f, 624.8f, 351.3f, 613.3f, 356.8f)
                curveTo(619.4f, 347.0f, 624.8f, 336.9f, 629.5f, 326.4f)
                curveTo(631.9f, 319.9f, 636.5f, 305.9f, 631.7f, 300.3f)
                lineTo(629.1f, 300.3f)
                curveTo(621.3f, 303.9f, 613.5f, 315.5f, 608.0f, 322.6f)
                curveTo(609.1f, 317.9f, 616.5f, 281.7f, 616.2f, 280.0f)
                curveTo(616.0f, 279.1f, 614.9f, 278.8f, 614.2f, 278.3f)
                curveTo(606.7f, 279.3f, 593.7f, 289.9f, 586.8f, 294.7f)
                curveTo(592.4f, 286.4f, 604.5f, 266.3f, 606.0f, 255.4f)
                curveTo(606.2f, 253.9f, 604.8f, 253.2f, 603.8f, 252.4f)
                curveTo(598.3f, 252.2f, 601.3f, 252.4f, 595.7f, 255.9f)
                curveTo(591.9f, 255.8f, 591.4f, 255.8f, 588.1f, 254.0f)
                curveTo(582.0f, 245.4f, 590.2f, 237.1f, 596.2f, 231.4f)
                lineTo(609.5f, 237.4f)
                curveTo(603.2f, 227.7f, 601.6f, 226.1f, 603.9f, 214.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(428.1f, 353.9f)
                curveTo(438.8f, 366.4f, 442.8f, 377.1f, 452.6f, 388.9f)
                curveTo(457.2f, 394.4f, 470.9f, 395.8f, 475.0f, 404.6f)
                curveTo(445.2f, 407.5f, 437.4f, 395.1f, 430.5f, 367.2f)
                curveTo(429.4f, 362.5f, 428.1f, 359.0f, 428.1f, 353.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(658.4f, 354.8f)
                curveTo(660.6f, 356.9f, 660.6f, 366.3f, 660.3f, 369.3f)
                curveTo(658.0f, 386.5f, 648.5f, 400.8f, 635.7f, 411.6f)
                curveTo(633.4f, 408.1f, 633.6f, 398.0f, 633.3f, 393.0f)
                curveTo(653.2f, 378.5f, 648.3f, 368.0f, 658.4f, 354.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(173.7f, 475.3f)
                curveTo(183.2f, 478.6f, 201.6f, 520.5f, 200.6f, 532.7f)
                curveTo(188.8f, 528.9f, 171.4f, 487.4f, 173.7f, 475.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(202.9f, 281.7f)
                curveTo(205.6f, 281.8f, 212.3f, 285.6f, 214.1f, 287.6f)
                curveTo(222.0f, 296.7f, 211.1f, 305.8f, 206.2f, 310.4f)
                curveTo(201.7f, 312.1f, 181.0f, 298.6f, 202.9f, 281.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(536.9f, 180.8f)
                curveTo(539.4f, 180.9f, 547.4f, 186.6f, 550.2f, 188.4f)
                lineTo(549.8f, 201.1f)
                curveTo(545.7f, 203.3f, 542.9f, 205.3f, 539.1f, 208.0f)
                curveTo(518.2f, 199.0f, 521.7f, 192.6f, 536.9f, 180.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(353.9f, 281.6f)
                curveTo(356.3f, 281.8f, 361.7f, 284.6f, 363.5f, 286.2f)
                curveTo(374.2f, 295.8f, 367.0f, 303.2f, 359.2f, 308.4f)
                curveTo(357.7f, 309.1f, 356.5f, 309.4f, 355.0f, 309.9f)
                curveTo(347.0f, 307.9f, 345.9f, 303.0f, 346.1f, 295.4f)
                curveTo(346.2f, 288.7f, 349.1f, 286.0f, 353.9f, 281.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.9f, 281.8f)
                curveTo(428.1f, 282.1f, 433.2f, 305.1f, 416.9f, 309.8f)
                curveTo(403.7f, 308.2f, 405.5f, 300.2f, 405.4f, 289.6f)
                curveTo(408.9f, 287.1f, 413.3f, 284.2f, 416.9f, 281.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(550.3f, 155.6f)
                curveTo(552.9f, 156.0f, 560.1f, 159.1f, 562.0f, 160.9f)
                curveTo(570.3f, 169.1f, 560.2f, 177.5f, 555.1f, 182.3f)
                curveTo(545.5f, 181.8f, 543.9f, 177.1f, 539.1f, 169.8f)
                curveTo(542.9f, 163.8f, 544.8f, 160.1f, 550.3f, 155.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(386.2f, 281.8f)
                curveTo(390.0f, 283.2f, 396.4f, 290.8f, 399.2f, 294.0f)
                curveTo(395.4f, 300.3f, 392.2f, 307.0f, 386.0f, 310.8f)
                curveTo(378.4f, 308.2f, 370.1f, 300.0f, 374.9f, 292.1f)
                curveTo(377.8f, 287.5f, 382.0f, 285.0f, 386.2f, 281.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(703.1f, 661.8f)
                curveTo(720.4f, 667.7f, 720.8f, 680.4f, 703.7f, 687.7f)
                curveTo(701.1f, 686.7f, 693.1f, 681.8f, 690.2f, 680.2f)
                curveTo(690.6f, 678.6f, 691.0f, 677.1f, 691.4f, 675.6f)
                curveTo(693.7f, 667.2f, 695.7f, 666.1f, 703.1f, 661.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(564.5f, 232.9f)
                curveTo(574.7f, 232.8f, 575.4f, 235.9f, 580.5f, 243.8f)
                curveTo(578.7f, 250.2f, 577.7f, 253.6f, 573.5f, 258.7f)
                curveTo(561.3f, 256.7f, 560.4f, 255.1f, 554.5f, 244.7f)
                curveTo(557.7f, 240.2f, 560.1f, 236.3f, 564.5f, 232.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(294.2f, 283.8f)
                curveTo(308.5f, 284.1f, 314.0f, 300.6f, 296.3f, 307.9f)
                curveTo(295.3f, 308.1f, 294.2f, 308.1f, 293.1f, 308.0f)
                curveTo(277.2f, 306.0f, 282.8f, 290.7f, 294.2f, 283.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(564.5f, 180.7f)
                curveTo(577.9f, 181.1f, 586.0f, 195.2f, 570.7f, 206.5f)
                curveTo(554.7f, 207.7f, 552.7f, 190.9f, 564.5f, 180.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(685.6f, 637.9f)
                curveTo(696.1f, 637.3f, 705.1f, 643.7f, 698.3f, 655.8f)
                curveTo(697.6f, 657.0f, 693.0f, 660.6f, 691.7f, 661.7f)
                curveTo(684.8f, 663.2f, 681.3f, 657.9f, 676.7f, 653.3f)
                curveTo(678.3f, 644.1f, 676.9f, 642.6f, 685.6f, 637.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(580.9f, 207.8f)
                curveTo(601.0f, 208.9f, 595.3f, 225.1f, 583.4f, 234.3f)
                curveTo(568.9f, 223.4f, 565.6f, 220.5f, 580.9f, 207.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(337.7f, 309.0f)
                curveTo(345.3f, 308.8f, 346.9f, 308.6f, 350.3f, 315.9f)
                curveTo(352.3f, 320.1f, 351.3f, 324.1f, 349.9f, 328.3f)
                curveTo(348.9f, 331.1f, 345.3f, 331.8f, 342.7f, 332.7f)
                curveTo(324.9f, 331.4f, 326.1f, 318.2f, 337.7f, 309.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(368.4f, 308.8f)
                curveTo(370.2f, 309.0f, 374.5f, 309.9f, 376.1f, 310.5f)
                curveTo(378.9f, 311.6f, 381.1f, 313.8f, 382.3f, 316.5f)
                curveTo(385.4f, 324.4f, 378.8f, 330.9f, 372.1f, 333.8f)
                curveTo(367.7f, 331.4f, 360.2f, 321.6f, 357.1f, 317.3f)
                curveTo(360.8f, 314.3f, 364.5f, 311.5f, 368.4f, 308.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEAE9EA)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(215.8f, 382.8f)
                curveTo(221.3f, 388.4f, 212.5f, 400.0f, 232.5f, 415.4f)
                curveTo(230.5f, 417.0f, 226.0f, 419.8f, 223.7f, 421.4f)
                curveTo(221.2f, 422.1f, 220.7f, 422.4f, 218.1f, 422.1f)
                curveTo(213.1f, 418.6f, 210.4f, 404.9f, 208.7f, 398.5f)
                curveTo(210.1f, 392.9f, 213.1f, 388.0f, 215.8f, 382.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(414.3f, 233.9f)
                curveTo(422.5f, 235.2f, 426.3f, 247.3f, 424.2f, 255.0f)
                curveTo(421.2f, 257.8f, 421.8f, 256.9f, 417.1f, 257.7f)
                curveTo(402.7f, 252.8f, 400.3f, 242.1f, 414.3f, 233.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(277.7f, 309.0f)
                curveTo(292.5f, 311.4f, 301.5f, 324.3f, 285.4f, 331.5f)
                curveTo(279.3f, 326.2f, 274.0f, 320.6f, 266.6f, 317.5f)
                curveTo(271.1f, 313.5f, 272.5f, 312.2f, 277.7f, 309.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(546.9f, 208.1f)
                curveTo(553.4f, 207.9f, 559.3f, 209.1f, 563.3f, 214.6f)
                curveTo(568.1f, 221.3f, 562.9f, 225.8f, 558.6f, 229.8f)
                lineTo(550.9f, 235.9f)
                curveTo(549.5f, 221.7f, 546.4f, 220.2f, 544.8f, 210.4f)
                lineTo(546.9f, 208.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(444.1f, 282.7f)
                curveTo(446.8f, 283.8f, 456.9f, 297.0f, 459.5f, 300.2f)
                lineTo(449.8f, 302.7f)
                curveTo(445.7f, 303.8f, 441.7f, 305.2f, 437.7f, 306.6f)
                curveTo(435.7f, 294.0f, 434.1f, 291.6f, 444.1f, 282.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(421.4f, 260.3f)
                curveTo(429.8f, 260.8f, 436.1f, 269.9f, 439.7f, 277.1f)
                curveTo(440.5f, 278.8f, 438.9f, 280.8f, 438.0f, 282.3f)
                curveTo(427.0f, 284.2f, 426.3f, 281.9f, 419.6f, 274.1f)
                curveTo(420.0f, 269.8f, 420.8f, 264.6f, 421.4f, 260.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(698.3f, 612.5f)
                curveTo(705.8f, 613.9f, 709.0f, 627.4f, 708.9f, 634.0f)
                curveTo(707.3f, 637.0f, 708.3f, 636.1f, 704.7f, 637.3f)
                curveTo(691.7f, 632.4f, 685.7f, 622.4f, 698.3f, 612.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEAE9EA)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.2f, 309.0f)
                curveTo(253.9f, 309.1f, 259.7f, 310.9f, 262.2f, 317.9f)
                curveTo(263.9f, 323.0f, 262.0f, 324.8f, 259.8f, 329.3f)
                curveTo(256.0f, 332.0f, 253.7f, 333.1f, 249.4f, 330.9f)
                curveTo(245.6f, 326.1f, 247.0f, 315.2f, 247.2f, 309.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(521.6f, 158.1f)
                curveTo(537.4f, 161.0f, 539.6f, 172.7f, 526.9f, 182.0f)
                lineTo(524.9f, 180.9f)
                curveTo(523.8f, 175.6f, 517.7f, 167.2f, 514.6f, 162.1f)
                curveTo(516.9f, 159.3f, 517.8f, 159.7f, 521.6f, 158.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(251.6f, 385.5f)
                curveTo(256.1f, 388.4f, 266.1f, 413.4f, 271.6f, 421.5f)
                curveTo(270.8f, 421.4f, 270.1f, 421.4f, 269.3f, 421.3f)
                curveTo(252.6f, 419.9f, 250.4f, 398.8f, 251.6f, 385.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(303.0f, 309.2f)
                curveTo(315.0f, 308.8f, 329.0f, 315.7f, 322.3f, 329.3f)
                curveTo(316.3f, 326.0f, 303.9f, 320.2f, 301.2f, 314.4f)
                curveTo(301.1f, 310.8f, 300.7f, 312.2f, 303.0f, 309.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(495.7f, 139.1f)
                curveTo(502.2f, 138.8f, 514.6f, 141.1f, 521.1f, 142.7f)
                lineTo(521.1f, 144.4f)
                curveTo(518.3f, 148.2f, 518.2f, 149.1f, 517.3f, 153.8f)
                curveTo(515.2f, 156.3f, 513.5f, 157.2f, 510.4f, 156.9f)
                curveTo(504.2f, 153.0f, 499.9f, 145.2f, 495.7f, 139.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEAE9EA)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(189.0f, 308.0f)
                curveTo(193.3f, 309.4f, 199.0f, 314.3f, 202.8f, 317.2f)
                lineTo(198.8f, 329.7f)
                lineTo(196.0f, 331.0f)
                curveTo(188.7f, 328.9f, 188.1f, 314.2f, 189.0f, 308.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEAE9EA)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(407.2f, 209.5f)
                curveTo(408.7f, 210.5f, 414.3f, 218.7f, 415.9f, 220.8f)
                curveTo(412.2f, 225.0f, 408.8f, 228.4f, 404.8f, 232.3f)
                curveTo(403.9f, 233.4f, 403.2f, 233.5f, 401.8f, 234.0f)
                lineTo(400.7f, 232.8f)
                curveTo(399.6f, 227.9f, 405.4f, 216.6f, 407.2f, 209.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEAE9EA)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(199.2f, 334.3f)
                curveTo(203.7f, 334.1f, 211.2f, 332.8f, 214.1f, 336.5f)
                curveTo(212.9f, 340.4f, 212.2f, 340.0f, 208.7f, 343.2f)
                curveTo(206.6f, 345.8f, 205.0f, 346.0f, 202.0f, 346.1f)
                curveTo(197.3f, 343.0f, 195.8f, 339.0f, 199.2f, 334.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEAE9EA)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(526.2f, 144.4f)
                curveTo(530.7f, 144.8f, 541.1f, 148.0f, 543.9f, 151.5f)
                curveTo(545.1f, 153.0f, 544.6f, 153.5f, 544.6f, 155.7f)
                curveTo(535.0f, 161.0f, 527.7f, 154.6f, 526.2f, 144.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(588.0f, 185.9f)
                curveTo(595.5f, 192.5f, 597.8f, 196.5f, 596.3f, 206.2f)
                curveTo(593.1f, 204.4f, 589.4f, 202.7f, 586.1f, 201.0f)
                curveTo(586.5f, 196.0f, 586.6f, 190.7f, 588.0f, 185.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEAE9EA)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.4f, 334.5f)
                curveTo(232.6f, 336.7f, 232.5f, 347.5f, 229.7f, 351.0f)
                curveTo(228.8f, 352.1f, 225.9f, 351.9f, 224.3f, 352.0f)
                curveTo(222.5f, 350.7f, 222.5f, 350.5f, 221.7f, 348.4f)
                curveTo(221.9f, 342.6f, 224.3f, 338.5f, 228.4f, 334.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(711.5f, 641.7f)
                curveTo(713.9f, 643.7f, 715.3f, 656.0f, 716.6f, 660.0f)
                lineTo(715.3f, 661.0f)
                curveTo(705.5f, 654.7f, 704.4f, 651.3f, 711.5f, 641.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEAE9EA)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.7f, 170.1f)
                curveTo(265.0f, 164.3f, 271.4f, 161.6f, 280.5f, 157.4f)
                lineTo(281.2f, 157.6f)
                curveTo(278.4f, 160.5f, 264.7f, 171.4f, 261.1f, 173.5f)
                curveTo(260.1f, 172.6f, 257.9f, 171.0f, 256.7f, 170.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEAE9EA)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(387.6f, 253.3f)
                curveTo(395.2f, 247.1f, 389.3f, 243.0f, 397.7f, 241.6f)
                curveTo(402.2f, 246.2f, 395.8f, 252.3f, 392.1f, 255.5f)
                curveTo(391.4f, 256.1f, 390.7f, 256.6f, 390.1f, 257.2f)
                lineTo(388.8f, 260.8f)
                curveTo(388.8f, 256.8f, 389.5f, 256.0f, 387.6f, 253.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFDFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(262.0f, 333.6f)
                lineTo(264.1f, 334.0f)
                curveTo(266.3f, 336.1f, 265.6f, 335.0f, 266.2f, 338.5f)
                curveTo(265.3f, 342.0f, 265.2f, 342.6f, 262.3f, 344.9f)
                curveTo(258.5f, 343.2f, 256.7f, 342.3f, 255.9f, 338.1f)
                curveTo(258.1f, 334.5f, 257.6f, 335.5f, 262.0f, 333.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEAE9EA)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.5f, 287.7f)
                curveTo(245.2f, 289.2f, 247.6f, 290.7f, 249.3f, 294.1f)
                curveTo(248.2f, 298.1f, 248.3f, 297.0f, 244.7f, 300.1f)
                curveTo(244.3f, 300.5f, 243.1f, 301.1f, 242.6f, 301.4f)
                curveTo(240.7f, 299.0f, 241.4f, 291.2f, 241.5f, 287.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEAE9EA)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(672.2f, 662.2f)
                curveTo(679.0f, 661.2f, 685.3f, 666.0f, 684.2f, 673.3f)
                curveTo(680.1f, 673.1f, 674.6f, 665.7f, 672.2f, 662.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEAE9EA)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(584.1f, 256.5f)
                curveTo(592.1f, 261.2f, 592.6f, 262.4f, 590.6f, 271.3f)
                lineTo(588.9f, 270.5f)
                curveTo(585.7f, 266.5f, 584.7f, 261.6f, 584.1f, 256.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEAE9EA)), stroke = null, fillAlpha = 0.988235f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(490.2f, 384.4f)
                curveTo(493.4f, 387.8f, 497.5f, 395.5f, 501.3f, 400.2f)
                lineTo(498.6f, 403.9f)
                curveTo(494.9f, 398.5f, 492.3f, 390.5f, 490.2f, 384.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEAE9EA)), stroke = null, fillAlpha = 0.984314f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(572.6f, 171.6f)
                curveTo(578.2f, 173.0f, 579.9f, 178.0f, 580.1f, 183.0f)
                curveTo(575.2f, 179.5f, 572.4f, 177.8f, 572.6f, 171.6f)
                close()
            }
        }
        .build()
        return _standardKasumiYoshizawa!!
    }

private var _standardKasumiYoshizawa: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = StandardSenderAvatar.StandardKasumiYoshizawa, contentDescription = "")
    }
}
