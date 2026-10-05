package com.yuri.im

import com.yuri.im.json.JsonSerialUtil
import com.yuri.im.schema.*
import kotlin.io.encoding.Base64
import kotlin.test.*
import kotlinx.serialization.json.*

class ImageMessageTest {
    private val png = Base64.decode("iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mP8/x8AAwMCAO+a2ioAAAAASUVORK5CYII=")
    private val image = ImageAsset.fromBytes("photo", png)
    private fun session(messages: List<ChatMessage>) = ChatSession("images", "Images", messages, BackgroundParticle.NONE)

    @Test
    fun imageMessagesRoundTripAndShareOneExportedResource() {
        val original = session(listOf(
            ImageMessage(StandardMessageSender.SENDER_ANN, image),
            ImageMessage(MessageSenderSelf, image),
            ImageMessage(BuildInCustomMessageSender.CUSTOM_SENDER_SAE, image),
            ReceiveMessage(StandardMessageSender.SENDER_ANN, content = "Next text"),
        ))
        val json = JsonSerialUtil.toJson(original)
        assertEquals(original, JsonSerialUtil.fromJson(json))
        assertEquals(1, Json.parseToJsonElement(json).jsonObject.getValue("images").jsonArray.size)
    }

    @Test
    fun versionOneTextSessionRemainsReadable() {
        val original = session(listOf(PlainText("old session")))
        val json = JsonSerialUtil.toJson(original).replace("\"schemaVersion\": 2", "\"schemaVersion\": 1")
        assertEquals(original, JsonSerialUtil.fromJson(json))
    }

    @Test
    fun missingImageReferenceAndInvalidMetadataAreRejected() {
        val json = JsonSerialUtil.toJson(session(listOf(ImageMessage(MessageSenderSelf, image))))
        assertFailsWith<IllegalArgumentException> {
            JsonSerialUtil.fromJson(json.replace("\"imageId\": \"photo\"", "\"imageId\": \"missing\""))
        }
        assertFailsWith<IllegalArgumentException> { image.copy(width = 999).validate() }
        assertFailsWith<IllegalArgumentException> { ImageAsset.fromBytes("bad", byteArrayOf(1, 2, 3)) }
        assertFailsWith<IllegalArgumentException> { ImageAsset.fromBytes("large", ByteArray(ImageAsset.MAX_BYTES + 1)) }
    }

    @Test
    fun conflictingResourceIdsAreRejected() {
        val different = image.copy(base64 = Base64.encode(png + byteArrayOf(0)))
        assertFailsWith<IllegalArgumentException> {
            JsonSerialUtil.toJson(session(listOf(ImageMessage(MessageSenderSelf, image), ImageMessage(MessageSenderSelf, different))))
        }
    }
}
