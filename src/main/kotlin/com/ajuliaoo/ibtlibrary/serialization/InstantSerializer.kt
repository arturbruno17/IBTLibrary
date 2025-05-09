package com.ajuliaoo.ibtlibrary.serialization

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import java.time.Instant

object InstantSerializer : KSerializer<Instant> {
    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor(
        "com.ajuliaoo.ibtlibrary.serialization.InstantSerializer",
        PrimitiveKind.STRING
    )

    override fun deserialize(decoder: Decoder): Instant =
        Instant.parse(decoder.decodeString())

    override fun serialize(encoder: Encoder, value: Instant) =
        encoder.encodeString(value.toString())

}