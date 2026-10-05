package com.yuri.persona_im_maker.chat.session

import com.yuri.im.json.PimSessionFile
import com.yuri.im.schema.*
import io.github.vinceglb.filekit.PlatformFile
import io.github.vinceglb.filekit.readBytes
import io.github.vinceglb.filekit.write
import java.awt.image.BufferedImage
import java.io.ByteArrayOutputStream
import java.nio.file.Files
import java.util.zip.ZipFile
import javax.imageio.ImageIO
import kotlinx.coroutines.runBlocking
import kotlin.test.*

class SessionFileIoTest {
    @Test
    fun nativeFileWriteReadAndStandardZipInterop() = runBlocking {
        val png = ByteArrayOutputStream().also {
            ImageIO.write(BufferedImage(2, 3, BufferedImage.TYPE_INT_ARGB), "png", it)
        }.toByteArray()
        val image = ImageAsset.fromBytes("shared", png)
        val original = ChatSession("test", "图片会话", listOf(
            ImageMessage(MessageSenderSelf, image.id),
            ImageMessage(StandardMessageSender.SENDER_ANN, image.id),
        ), BackgroundParticle.SAKURA, mapOf(image.id to image))
        val path = Files.createTempFile("persona-session-", ".pim")
        try {
            val file = PlatformFile(path.toFile())
            file.write(PimSessionFile.encode(original))
            assertEquals(original, PimSessionFile.decode(file.readBytes()))
            ZipFile(path.toFile()).use { zip ->
                assertEquals(2, zip.size())
                assertContentEquals(png, zip.getInputStream(zip.getEntry("images/shared.png")).use { it.readBytes() })
                assertTrue(zip.getInputStream(zip.getEntry("session.json")).use { it.readBytes().decodeToString() }.contains("图片会话"))
            }
        } finally {
            Files.deleteIfExists(path)
        }
    }
}
