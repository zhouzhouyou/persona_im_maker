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

public val StandardSenderAvatar.StandardMakotoNiijima: ImageVector
    get() {
        if (_standardMakotoNiijima != null) {
            return _standardMakotoNiijima!!
        }
        _standardMakotoNiijima = Builder(name = "StandardMakotoNiijima", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 1024.0f, viewportHeight = 1024.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(259.6f, 398.2f)
                curveTo(256.2f, 396.6f, 252.6f, 395.1f, 250.5f, 391.9f)
                curveTo(244.0f, 382.0f, 240.1f, 328.5f, 240.8f, 314.2f)
                curveTo(241.5f, 301.8f, 243.9f, 288.9f, 246.5f, 276.8f)
                curveTo(248.1f, 269.5f, 250.0f, 262.2f, 253.4f, 255.5f)
                curveTo(258.1f, 246.4f, 265.4f, 238.0f, 271.3f, 229.6f)
                curveTo(286.8f, 207.5f, 300.5f, 185.3f, 320.0f, 166.2f)
                curveTo(329.6f, 156.7f, 341.4f, 148.5f, 352.7f, 141.2f)
                curveTo(389.3f, 117.8f, 403.7f, 116.2f, 444.5f, 105.5f)
                curveTo(461.4f, 101.0f, 477.7f, 93.5f, 494.9f, 90.3f)
                curveTo(505.9f, 88.3f, 517.3f, 86.9f, 528.5f, 86.7f)
                curveTo(540.6f, 86.6f, 552.9f, 88.2f, 564.9f, 89.1f)
                curveTo(594.2f, 91.1f, 624.1f, 92.6f, 652.8f, 98.9f)
                curveTo(702.0f, 109.8f, 762.3f, 151.9f, 789.4f, 194.5f)
                curveTo(817.2f, 238.3f, 828.3f, 311.2f, 833.1f, 362.4f)
                curveTo(834.6f, 379.0f, 834.3f, 396.4f, 836.9f, 412.8f)
                curveTo(838.8f, 425.5f, 842.7f, 438.2f, 845.9f, 450.7f)
                curveTo(848.1f, 459.3f, 850.1f, 468.0f, 853.0f, 476.4f)
                curveTo(857.1f, 488.4f, 881.6f, 547.2f, 880.0f, 554.5f)
                curveTo(877.5f, 554.6f, 861.0f, 544.0f, 857.6f, 541.9f)
                curveTo(861.2f, 549.8f, 865.4f, 559.4f, 868.0f, 567.7f)
                curveTo(867.8f, 569.4f, 867.5f, 575.8f, 867.2f, 577.1f)
                lineTo(869.7f, 577.2f)
                lineTo(869.1f, 579.2f)
                lineTo(867.7f, 579.7f)
                lineTo(865.9f, 577.8f)
                curveTo(864.0f, 578.2f, 863.8f, 579.4f, 862.5f, 581.3f)
                curveTo(852.5f, 576.0f, 844.3f, 575.3f, 833.4f, 573.4f)
                curveTo(836.3f, 590.4f, 843.5f, 613.0f, 848.2f, 630.1f)
                curveTo(844.0f, 626.9f, 805.7f, 606.3f, 801.8f, 606.2f)
                curveTo(800.9f, 609.6f, 803.9f, 610.7f, 804.2f, 614.3f)
                curveTo(804.7f, 618.7f, 804.8f, 623.5f, 805.0f, 627.9f)
                curveTo(800.3f, 623.0f, 797.1f, 616.6f, 789.8f, 616.1f)
                curveTo(785.9f, 619.8f, 776.6f, 651.5f, 774.3f, 658.9f)
                curveTo(759.7f, 645.9f, 753.6f, 639.7f, 737.5f, 627.3f)
                curveTo(735.7f, 636.2f, 732.9f, 646.1f, 730.6f, 655.0f)
                curveTo(722.5f, 646.8f, 708.2f, 630.5f, 697.8f, 627.3f)
                curveTo(692.8f, 625.8f, 687.8f, 629.5f, 683.5f, 632.0f)
                curveTo(682.9f, 634.5f, 681.0f, 642.6f, 680.1f, 644.4f)
                curveTo(672.8f, 657.7f, 665.2f, 660.1f, 666.5f, 676.9f)
                curveTo(669.7f, 716.0f, 658.0f, 746.4f, 690.9f, 775.8f)
                curveTo(706.9f, 790.1f, 722.0f, 805.8f, 739.1f, 819.5f)
                curveTo(769.7f, 823.8f, 824.3f, 812.2f, 850.9f, 822.4f)
                curveTo(859.6f, 828.8f, 911.0f, 876.7f, 912.0f, 882.0f)
                curveTo(919.8f, 921.0f, 944.8f, 968.9f, 955.3f, 1005.0f)
                curveTo(946.0f, 1005.0f, 936.7f, 1005.9f, 927.2f, 1006.0f)
                lineTo(780.8f, 1007.3f)
                lineTo(420.5f, 1009.5f)
                lineTo(260.5f, 1011.6f)
                curveTo(238.6f, 1011.9f, 207.9f, 1010.7f, 186.9f, 1012.2f)
                curveTo(185.0f, 980.0f, 180.4f, 960.7f, 193.8f, 930.1f)
                curveTo(205.6f, 902.9f, 225.5f, 878.5f, 246.8f, 857.4f)
                curveTo(253.6f, 850.6f, 303.0f, 842.0f, 314.5f, 838.9f)
                curveTo(344.6f, 834.1f, 377.9f, 833.3f, 408.3f, 827.6f)
                curveTo(418.2f, 815.6f, 434.2f, 793.2f, 439.3f, 778.7f)
                curveTo(442.6f, 769.4f, 434.8f, 739.3f, 436.0f, 728.0f)
                curveTo(436.6f, 722.2f, 439.0f, 715.5f, 439.3f, 710.3f)
                curveTo(439.9f, 701.2f, 436.8f, 690.1f, 430.9f, 682.9f)
                curveTo(399.0f, 672.5f, 382.2f, 688.1f, 351.5f, 692.8f)
                curveTo(338.8f, 681.3f, 328.5f, 669.9f, 317.0f, 688.9f)
                curveTo(316.0f, 684.1f, 315.7f, 679.5f, 311.6f, 676.5f)
                curveTo(305.8f, 677.1f, 308.5f, 679.4f, 302.7f, 681.6f)
                lineTo(300.8f, 680.3f)
                curveTo(298.3f, 676.1f, 298.0f, 669.2f, 297.4f, 664.2f)
                curveTo(289.8f, 663.9f, 285.6f, 664.4f, 278.4f, 666.3f)
                curveTo(275.9f, 669.1f, 266.5f, 679.7f, 263.4f, 680.2f)
                curveTo(265.3f, 674.6f, 271.2f, 667.6f, 274.5f, 661.3f)
                curveTo(290.2f, 631.2f, 306.8f, 588.6f, 285.2f, 557.2f)
                curveTo(278.2f, 546.8f, 267.4f, 543.6f, 262.2f, 529.4f)
                curveTo(256.6f, 514.3f, 300.1f, 490.6f, 280.8f, 480.5f)
                curveTo(273.4f, 480.1f, 266.5f, 485.6f, 259.9f, 489.6f)
                curveTo(260.9f, 478.3f, 260.2f, 458.7f, 260.2f, 446.8f)
                curveTo(260.2f, 431.7f, 260.8f, 412.7f, 259.6f, 398.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(306.6f, 267.7f)
                curveTo(308.8f, 269.7f, 308.6f, 283.7f, 308.8f, 287.4f)
                curveTo(309.4f, 298.6f, 310.6f, 309.7f, 312.4f, 320.7f)
                curveTo(314.4f, 332.2f, 316.0f, 339.1f, 321.1f, 349.5f)
                curveTo(329.5f, 345.0f, 337.1f, 341.5f, 346.5f, 340.7f)
                curveTo(349.1f, 331.4f, 352.9f, 320.8f, 356.0f, 311.6f)
                curveTo(357.0f, 319.7f, 358.0f, 331.8f, 358.2f, 339.8f)
                curveTo(365.5f, 335.6f, 371.2f, 333.2f, 377.6f, 327.5f)
                curveTo(379.0f, 323.1f, 380.5f, 309.6f, 383.6f, 308.2f)
                curveTo(387.3f, 312.1f, 388.7f, 320.2f, 389.7f, 325.5f)
                curveTo(400.2f, 323.7f, 410.3f, 323.8f, 420.9f, 321.6f)
                curveTo(422.1f, 314.5f, 428.2f, 296.7f, 430.6f, 288.5f)
                curveTo(431.2f, 300.0f, 431.2f, 309.9f, 431.1f, 321.4f)
                curveTo(438.8f, 319.0f, 451.1f, 315.5f, 457.9f, 312.0f)
                curveTo(459.1f, 334.7f, 459.7f, 368.7f, 456.4f, 391.0f)
                curveTo(454.7f, 402.6f, 448.8f, 419.5f, 446.5f, 433.5f)
                curveTo(450.1f, 427.0f, 455.4f, 412.0f, 459.0f, 408.3f)
                curveTo(460.1f, 411.1f, 454.1f, 444.4f, 453.0f, 450.5f)
                curveTo(460.7f, 448.3f, 475.2f, 446.4f, 484.2f, 444.3f)
                curveTo(492.4f, 434.4f, 507.0f, 409.8f, 513.1f, 398.4f)
                curveTo(510.2f, 412.1f, 507.9f, 428.9f, 504.5f, 442.0f)
                curveTo(519.6f, 437.7f, 534.5f, 432.7f, 549.2f, 427.2f)
                curveTo(550.2f, 431.9f, 554.4f, 459.4f, 555.5f, 461.2f)
                lineTo(556.9f, 460.9f)
                curveTo(559.5f, 457.8f, 571.7f, 428.6f, 572.4f, 424.3f)
                lineTo(573.4f, 423.5f)
                curveTo(576.4f, 427.9f, 577.9f, 429.5f, 581.7f, 433.3f)
                curveTo(579.4f, 447.8f, 575.5f, 464.1f, 572.9f, 479.0f)
                lineTo(590.1f, 470.4f)
                curveTo(598.3f, 447.7f, 601.8f, 415.6f, 597.5f, 391.5f)
                curveTo(600.4f, 394.1f, 604.6f, 398.5f, 608.3f, 399.1f)
                lineTo(608.9f, 397.2f)
                curveTo(607.1f, 390.4f, 600.9f, 378.4f, 592.7f, 378.4f)
                curveTo(587.0f, 380.7f, 576.4f, 398.6f, 571.8f, 404.9f)
                curveTo(573.2f, 394.0f, 572.2f, 375.7f, 571.9f, 364.4f)
                curveTo(577.2f, 361.9f, 586.3f, 356.5f, 590.7f, 352.8f)
                curveTo(598.6f, 355.0f, 605.4f, 357.3f, 613.1f, 360.0f)
                curveTo(636.0f, 370.6f, 641.6f, 393.0f, 643.4f, 415.8f)
                curveTo(628.2f, 447.2f, 629.0f, 469.6f, 598.0f, 494.9f)
                curveTo(590.2f, 501.2f, 586.9f, 503.4f, 577.5f, 502.4f)
                curveTo(564.6f, 529.7f, 562.8f, 573.2f, 542.0f, 595.0f)
                curveTo(532.6f, 604.9f, 520.6f, 612.6f, 508.7f, 619.3f)
                curveTo(490.2f, 629.7f, 386.1f, 676.8f, 369.3f, 677.1f)
                curveTo(358.6f, 677.3f, 351.2f, 672.5f, 343.8f, 665.3f)
                curveTo(339.0f, 652.8f, 340.7f, 638.1f, 337.6f, 625.1f)
                curveTo(336.4f, 620.2f, 326.2f, 610.9f, 329.8f, 605.9f)
                curveTo(335.5f, 598.0f, 348.3f, 596.1f, 357.3f, 593.5f)
                curveTo(362.6f, 591.9f, 367.6f, 590.6f, 373.0f, 588.6f)
                curveTo(352.9f, 585.7f, 332.0f, 577.4f, 311.3f, 572.8f)
                curveTo(310.8f, 563.5f, 310.9f, 559.1f, 313.0f, 550.3f)
                curveTo(304.3f, 547.8f, 287.1f, 541.4f, 280.8f, 535.4f)
                curveTo(280.3f, 535.0f, 279.9f, 534.5f, 279.5f, 534.1f)
                curveTo(272.9f, 526.2f, 286.0f, 512.1f, 290.2f, 504.7f)
                curveTo(304.6f, 479.4f, 303.3f, 461.9f, 302.3f, 434.6f)
                curveTo(294.5f, 427.0f, 290.3f, 420.3f, 284.2f, 411.3f)
                lineTo(299.9f, 409.7f)
                curveTo(294.5f, 402.0f, 290.7f, 397.4f, 283.0f, 391.8f)
                curveTo(285.6f, 382.6f, 289.5f, 368.0f, 293.0f, 359.4f)
                curveTo(296.6f, 357.5f, 296.8f, 361.9f, 301.2f, 360.7f)
                curveTo(301.8f, 357.4f, 299.8f, 341.5f, 299.3f, 337.0f)
                curveTo(295.9f, 310.9f, 302.0f, 292.6f, 306.6f, 267.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(388.8f, 361.3f)
                curveTo(399.7f, 360.6f, 429.9f, 371.9f, 437.0f, 380.0f)
                curveTo(448.1f, 392.7f, 422.1f, 411.4f, 414.3f, 417.3f)
                curveTo(418.0f, 410.1f, 423.2f, 402.2f, 426.1f, 394.8f)
                curveTo(432.0f, 379.4f, 414.5f, 380.2f, 405.1f, 379.8f)
                curveTo(406.9f, 391.2f, 408.9f, 395.9f, 401.1f, 405.4f)
                curveTo(399.5f, 407.4f, 398.5f, 408.7f, 398.0f, 411.3f)
                curveTo(399.5f, 415.8f, 401.6f, 416.4f, 405.7f, 419.5f)
                curveTo(401.2f, 431.1f, 394.5f, 433.2f, 383.6f, 436.8f)
                lineTo(383.0f, 436.1f)
                curveTo(373.1f, 423.3f, 369.2f, 411.9f, 371.1f, 395.9f)
                curveTo(364.8f, 405.5f, 360.1f, 410.9f, 352.0f, 419.0f)
                curveTo(354.1f, 410.3f, 356.9f, 400.5f, 357.6f, 391.6f)
                curveTo(352.1f, 390.0f, 339.8f, 390.1f, 338.8f, 384.1f)
                curveTo(344.7f, 374.8f, 376.8f, 362.9f, 388.8f, 361.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(398.1f, 335.1f)
                curveTo(403.4f, 334.5f, 428.5f, 337.9f, 434.3f, 338.9f)
                curveTo(424.2f, 340.2f, 409.7f, 340.1f, 400.3f, 341.9f)
                curveTo(386.7f, 344.5f, 366.9f, 355.4f, 353.6f, 361.7f)
                curveTo(346.5f, 365.2f, 338.2f, 371.8f, 330.7f, 371.0f)
                curveTo(327.5f, 369.0f, 328.6f, 370.2f, 326.9f, 366.7f)
                lineTo(327.8f, 364.3f)
                curveTo(337.5f, 357.5f, 386.2f, 338.2f, 398.1f, 335.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(584.5f, 551.0f)
                lineTo(585.9f, 551.8f)
                curveTo(586.9f, 554.9f, 581.3f, 575.0f, 580.2f, 580.3f)
                curveTo(575.1f, 604.3f, 572.3f, 630.1f, 562.0f, 652.4f)
                curveTo(569.9f, 646.9f, 581.0f, 636.4f, 589.9f, 629.6f)
                curveTo(588.1f, 636.5f, 587.1f, 642.6f, 586.0f, 649.6f)
                curveTo(593.7f, 642.9f, 611.6f, 634.5f, 621.5f, 628.9f)
                curveTo(619.2f, 638.7f, 617.0f, 653.1f, 616.9f, 663.1f)
                curveTo(599.0f, 667.9f, 583.7f, 675.6f, 566.2f, 680.9f)
                curveTo(553.5f, 684.9f, 512.1f, 690.0f, 497.5f, 690.1f)
                curveTo(494.1f, 690.1f, 484.3f, 687.5f, 480.3f, 686.5f)
                curveTo(486.0f, 673.5f, 505.2f, 639.9f, 515.8f, 630.1f)
                curveTo(523.7f, 622.9f, 542.0f, 611.9f, 548.7f, 602.6f)
                curveTo(566.8f, 577.3f, 553.4f, 568.2f, 584.5f, 551.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(431.4f, 134.2f)
                curveTo(428.2f, 138.4f, 426.0f, 141.6f, 423.1f, 146.1f)
                curveTo(422.4f, 147.2f, 419.6f, 148.8f, 417.7f, 151.4f)
                curveTo(420.7f, 154.4f, 425.9f, 152.8f, 430.1f, 156.5f)
                curveTo(435.6f, 161.2f, 435.0f, 172.0f, 429.8f, 176.9f)
                curveTo(421.7f, 179.3f, 416.4f, 173.2f, 411.7f, 174.9f)
                curveTo(412.2f, 181.6f, 425.6f, 189.3f, 418.2f, 200.0f)
                curveTo(415.4f, 206.0f, 399.9f, 201.0f, 401.0f, 207.9f)
                curveTo(401.9f, 213.9f, 407.8f, 219.7f, 403.8f, 225.7f)
                curveTo(400.9f, 229.9f, 388.8f, 232.5f, 385.8f, 229.1f)
                curveTo(379.1f, 221.4f, 386.5f, 213.9f, 375.0f, 208.0f)
                curveTo(374.5f, 207.9f, 366.8f, 204.3f, 364.9f, 203.5f)
                curveTo(357.1f, 197.5f, 359.5f, 201.1f, 350.5f, 204.1f)
                curveTo(347.3f, 205.1f, 342.9f, 203.2f, 339.5f, 205.1f)
                curveTo(346.9f, 219.1f, 350.1f, 237.5f, 327.4f, 229.1f)
                curveTo(324.9f, 228.1f, 322.0f, 221.5f, 320.7f, 218.9f)
                curveTo(312.9f, 226.6f, 300.6f, 236.9f, 291.1f, 242.6f)
                curveTo(314.5f, 203.5f, 321.2f, 197.7f, 355.0f, 169.2f)
                curveTo(357.8f, 170.9f, 361.7f, 172.9f, 364.1f, 175.1f)
                curveTo(374.6f, 168.9f, 385.5f, 160.9f, 394.9f, 153.2f)
                curveTo(408.4f, 142.1f, 414.0f, 137.4f, 431.4f, 134.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(548.7f, 166.1f)
                curveTo(559.6f, 165.6f, 572.5f, 168.5f, 580.5f, 176.4f)
                curveTo(583.5f, 179.4f, 584.6f, 182.7f, 588.4f, 185.9f)
                lineTo(590.2f, 185.5f)
                curveTo(592.8f, 182.3f, 592.1f, 183.7f, 592.5f, 179.3f)
                curveTo(594.7f, 177.3f, 601.8f, 177.0f, 605.0f, 177.0f)
                curveTo(607.3f, 177.0f, 608.6f, 184.1f, 612.3f, 187.3f)
                curveTo(612.7f, 191.9f, 610.2f, 188.6f, 608.2f, 195.0f)
                curveTo(608.0f, 199.7f, 608.0f, 202.0f, 606.8f, 206.6f)
                curveTo(603.7f, 206.6f, 594.5f, 195.4f, 588.8f, 193.2f)
                curveTo(587.2f, 194.3f, 586.7f, 194.7f, 585.0f, 195.6f)
                curveTo(580.8f, 192.9f, 547.4f, 172.0f, 546.9f, 171.2f)
                curveTo(546.8f, 168.1f, 546.6f, 169.3f, 548.7f, 166.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(572.7f, 213.9f)
                curveTo(575.1f, 213.8f, 578.3f, 213.4f, 580.5f, 214.9f)
                curveTo(590.2f, 221.5f, 603.3f, 233.0f, 606.8f, 244.4f)
                curveTo(608.0f, 248.2f, 606.3f, 251.6f, 604.5f, 254.5f)
                curveTo(592.0f, 256.3f, 577.5f, 231.4f, 571.8f, 221.9f)
                curveTo(570.3f, 219.5f, 571.7f, 216.3f, 572.7f, 213.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(359.2f, 205.5f)
                curveTo(364.8f, 206.8f, 367.9f, 207.2f, 372.7f, 210.4f)
                curveTo(379.1f, 220.7f, 374.0f, 230.2f, 361.8f, 231.6f)
                curveTo(353.5f, 232.5f, 350.8f, 221.9f, 352.1f, 215.6f)
                curveTo(353.1f, 210.2f, 354.8f, 208.8f, 359.2f, 205.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(449.7f, 152.8f)
                curveTo(467.0f, 152.0f, 471.2f, 170.1f, 454.6f, 178.5f)
                curveTo(438.2f, 175.9f, 435.1f, 162.0f, 449.7f, 152.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(734.6f, 231.9f)
                curveTo(743.7f, 232.9f, 750.3f, 239.3f, 747.3f, 248.8f)
                curveTo(745.5f, 254.5f, 742.5f, 255.5f, 737.5f, 258.2f)
                lineTo(735.9f, 258.7f)
                curveTo(732.7f, 258.0f, 727.9f, 254.5f, 724.9f, 252.6f)
                curveTo(724.9f, 240.8f, 723.1f, 237.5f, 734.6f, 231.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(750.9f, 259.2f)
                curveTo(765.3f, 258.7f, 769.1f, 277.2f, 752.7f, 283.5f)
                curveTo(735.0f, 281.7f, 733.3f, 262.7f, 750.9f, 259.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(703.4f, 232.9f)
                curveTo(719.6f, 233.2f, 724.5f, 247.9f, 710.2f, 257.0f)
                curveTo(695.9f, 261.9f, 687.2f, 241.6f, 703.4f, 232.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(716.9f, 206.4f)
                curveTo(721.1f, 205.0f, 725.7f, 205.9f, 729.0f, 208.9f)
                curveTo(732.3f, 211.9f, 733.6f, 216.5f, 732.6f, 220.8f)
                curveTo(731.5f, 225.1f, 728.2f, 228.5f, 723.9f, 229.6f)
                curveTo(717.5f, 231.3f, 711.1f, 227.6f, 709.2f, 221.4f)
                curveTo(707.3f, 215.1f, 710.7f, 208.5f, 716.9f, 206.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(703.5f, 180.4f)
                curveTo(707.1f, 179.6f, 710.9f, 180.3f, 713.8f, 182.6f)
                curveTo(716.7f, 184.9f, 718.5f, 188.3f, 718.5f, 192.0f)
                curveTo(718.6f, 197.6f, 714.8f, 202.5f, 709.5f, 203.9f)
                curveTo(703.0f, 205.5f, 696.4f, 201.6f, 694.7f, 195.2f)
                curveTo(693.1f, 188.7f, 697.0f, 182.1f, 703.5f, 180.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(716.0f, 259.9f)
                curveTo(733.7f, 257.2f, 739.1f, 275.3f, 726.4f, 282.1f)
                curveTo(708.2f, 284.9f, 703.2f, 267.5f, 716.0f, 259.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(750.0f, 205.7f)
                curveTo(753.4f, 206.4f, 758.7f, 210.9f, 760.1f, 213.9f)
                curveTo(765.2f, 224.1f, 760.1f, 228.4f, 752.4f, 232.5f)
                curveTo(749.0f, 232.0f, 742.3f, 227.8f, 740.9f, 224.7f)
                curveTo(736.4f, 215.2f, 743.2f, 209.6f, 750.0f, 205.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(467.8f, 129.1f)
                curveTo(469.7f, 128.8f, 471.6f, 128.9f, 473.5f, 128.8f)
                curveTo(480.8f, 132.1f, 481.6f, 137.5f, 479.0f, 144.5f)
                curveTo(477.3f, 149.1f, 473.8f, 150.1f, 469.5f, 151.9f)
                curveTo(459.0f, 151.4f, 453.8f, 145.3f, 458.6f, 134.7f)
                curveTo(460.2f, 131.1f, 464.2f, 130.4f, 467.8f, 129.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(690.1f, 206.1f)
                curveTo(706.3f, 209.9f, 709.6f, 221.0f, 694.1f, 230.5f)
                curveTo(691.8f, 231.7f, 691.8f, 231.8f, 689.4f, 231.4f)
                curveTo(682.5f, 227.2f, 680.1f, 219.5f, 682.3f, 211.8f)
                curveTo(683.3f, 208.1f, 686.9f, 207.4f, 690.1f, 206.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(684.2f, 154.4f)
                curveTo(701.2f, 152.2f, 712.9f, 164.8f, 697.9f, 175.0f)
                curveTo(693.8f, 177.2f, 692.1f, 178.8f, 687.9f, 175.5f)
                curveTo(681.0f, 170.2f, 679.3f, 161.7f, 684.2f, 154.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(763.5f, 285.7f)
                curveTo(778.1f, 286.9f, 783.6f, 301.5f, 771.4f, 310.1f)
                curveTo(760.0f, 310.1f, 747.7f, 294.4f, 763.5f, 285.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(481.2f, 153.0f)
                curveTo(492.8f, 151.4f, 501.9f, 172.9f, 486.9f, 175.4f)
                curveTo(480.2f, 169.8f, 478.2f, 170.3f, 469.5f, 169.7f)
                curveTo(471.1f, 159.4f, 470.2f, 156.0f, 481.2f, 153.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(619.5f, 239.6f)
                curveTo(632.3f, 243.0f, 626.9f, 256.1f, 624.9f, 266.3f)
                curveTo(623.1f, 268.5f, 620.2f, 271.3f, 618.2f, 273.5f)
                lineTo(616.4f, 274.2f)
                lineTo(614.5f, 273.3f)
                curveTo(609.8f, 263.4f, 611.9f, 247.6f, 619.5f, 239.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(775.7f, 313.0f)
                curveTo(777.3f, 312.9f, 778.8f, 312.9f, 780.4f, 313.0f)
                curveTo(793.8f, 313.4f, 794.7f, 329.3f, 785.3f, 337.3f)
                curveTo(774.5f, 340.4f, 770.6f, 324.6f, 771.6f, 316.6f)
                curveTo(771.8f, 314.8f, 774.3f, 313.8f, 775.7f, 313.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(433.4f, 181.0f)
                curveTo(443.1f, 180.5f, 444.8f, 181.8f, 451.3f, 189.0f)
                curveTo(447.3f, 193.5f, 443.9f, 197.0f, 439.7f, 201.3f)
                curveTo(438.4f, 202.6f, 437.8f, 203.1f, 436.3f, 204.3f)
                curveTo(429.4f, 203.2f, 426.6f, 196.8f, 426.7f, 190.5f)
                curveTo(426.8f, 186.3f, 430.4f, 183.5f, 433.4f, 181.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(764.6f, 231.9f)
                lineTo(765.8f, 232.1f)
                curveTo(771.0f, 235.4f, 775.1f, 249.0f, 771.9f, 255.1f)
                curveTo(769.2f, 257.4f, 767.9f, 257.4f, 764.5f, 258.2f)
                curveTo(756.5f, 254.5f, 755.9f, 252.0f, 751.5f, 244.4f)
                curveTo(756.5f, 238.4f, 757.9f, 236.1f, 764.6f, 231.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(667.4f, 182.1f)
                curveTo(674.4f, 184.7f, 687.1f, 187.6f, 688.2f, 196.0f)
                curveTo(687.6f, 199.4f, 687.0f, 199.8f, 684.6f, 202.2f)
                curveTo(667.0f, 209.1f, 663.3f, 197.1f, 667.4f, 182.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(727.0f, 182.2f)
                lineTo(732.5f, 181.8f)
                curveTo(738.1f, 183.5f, 746.1f, 192.2f, 745.7f, 198.5f)
                curveTo(745.5f, 200.9f, 743.9f, 201.6f, 742.2f, 203.1f)
                curveTo(733.4f, 206.5f, 731.7f, 204.0f, 724.8f, 198.9f)
                curveTo(725.0f, 194.5f, 725.6f, 186.1f, 727.0f, 182.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(377.0f, 232.0f)
                curveTo(382.2f, 233.1f, 387.7f, 234.2f, 388.6f, 239.8f)
                curveTo(387.2f, 243.8f, 380.8f, 250.0f, 377.4f, 254.4f)
                curveTo(376.7f, 256.3f, 377.3f, 255.6f, 375.2f, 256.5f)
                curveTo(364.5f, 250.4f, 365.0f, 238.0f, 377.0f, 232.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(544.0f, 136.6f)
                lineTo(548.0f, 137.6f)
                curveTo(565.5f, 141.8f, 566.3f, 144.9f, 575.7f, 160.3f)
                curveTo(562.3f, 160.2f, 547.3f, 150.3f, 544.0f, 136.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(733.6f, 285.9f)
                curveTo(739.1f, 285.4f, 743.5f, 288.7f, 748.1f, 291.5f)
                curveTo(743.7f, 297.4f, 742.0f, 299.1f, 736.7f, 304.0f)
                curveTo(735.0f, 305.6f, 734.9f, 305.8f, 732.7f, 306.2f)
                curveTo(727.3f, 302.3f, 726.2f, 296.4f, 727.5f, 290.2f)
                curveTo(728.1f, 287.7f, 731.4f, 286.8f, 733.6f, 285.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(422.1f, 205.8f)
                curveTo(425.6f, 206.2f, 429.3f, 208.9f, 432.4f, 210.7f)
                curveTo(428.5f, 216.1f, 426.6f, 219.3f, 420.7f, 222.0f)
                lineTo(420.1f, 222.2f)
                curveTo(415.9f, 223.7f, 414.8f, 224.3f, 411.3f, 222.6f)
                curveTo(407.7f, 214.5f, 415.7f, 208.7f, 422.1f, 205.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(450.5f, 135.2f)
                lineTo(451.3f, 135.4f)
                lineTo(451.8f, 136.9f)
                curveTo(447.2f, 149.8f, 446.3f, 152.3f, 432.1f, 150.7f)
                curveTo(430.1f, 149.8f, 428.7f, 149.5f, 427.7f, 147.7f)
                lineTo(428.8f, 144.8f)
                curveTo(434.2f, 139.4f, 443.2f, 137.4f, 450.5f, 135.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(774.2f, 261.5f)
                curveTo(774.7f, 261.6f, 776.0f, 262.4f, 776.5f, 262.7f)
                curveTo(778.1f, 267.2f, 783.3f, 281.0f, 782.0f, 285.2f)
                lineTo(780.8f, 285.1f)
                curveTo(768.9f, 278.4f, 761.2f, 273.7f, 774.2f, 261.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(710.7f, 159.0f)
                curveTo(715.1f, 160.8f, 727.0f, 170.1f, 726.8f, 175.3f)
                lineTo(723.2f, 177.9f)
                curveTo(718.8f, 179.4f, 713.5f, 175.9f, 709.1f, 173.8f)
                curveTo(709.2f, 168.9f, 709.0f, 163.4f, 710.7f, 159.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(664.9f, 139.0f)
                curveTo(669.3f, 138.9f, 674.2f, 139.1f, 678.7f, 139.1f)
                curveTo(681.4f, 141.6f, 686.1f, 144.7f, 686.7f, 147.6f)
                lineTo(684.7f, 148.7f)
                curveTo(673.4f, 154.5f, 667.0f, 151.9f, 664.9f, 139.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(594.9f, 278.2f)
                curveTo(607.8f, 277.7f, 614.3f, 283.5f, 612.3f, 296.7f)
                curveTo(606.9f, 294.2f, 596.5f, 284.4f, 594.9f, 278.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(315.8f, 232.3f)
                curveTo(320.3f, 233.8f, 327.0f, 234.3f, 330.0f, 236.5f)
                lineTo(329.7f, 238.1f)
                lineTo(326.3f, 240.1f)
                curveTo(321.3f, 242.2f, 316.6f, 243.3f, 312.9f, 238.5f)
                curveTo(313.2f, 234.6f, 313.0f, 235.8f, 315.8f, 232.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFEFEFE)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(646.3f, 181.8f)
                curveTo(655.4f, 182.5f, 657.8f, 185.8f, 659.0f, 194.3f)
                curveTo(649.4f, 191.9f, 646.1f, 192.6f, 646.3f, 181.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.835294f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(868.0f, 567.7f)
                curveTo(871.7f, 575.2f, 876.2f, 585.1f, 880.4f, 592.2f)
                curveTo(874.4f, 588.6f, 868.4f, 584.9f, 862.5f, 581.3f)
                curveTo(863.8f, 579.4f, 864.0f, 578.2f, 865.9f, 577.8f)
                lineTo(867.7f, 579.7f)
                lineTo(869.1f, 579.2f)
                lineTo(869.7f, 577.2f)
                lineTo(867.2f, 577.1f)
                curveTo(867.5f, 575.8f, 867.8f, 569.4f, 868.0f, 567.7f)
                close()
            }
        }
        .build()
        return _standardMakotoNiijima!!
    }

private var _standardMakotoNiijima: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = StandardSenderAvatar.StandardMakotoNiijima, contentDescription = "")
    }
}
