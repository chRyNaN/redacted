@file:Suppress("unused")

package com.chrynan.redacted.core

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

class RedactedPropertyEncoder<T> : KSerializer<RedactedProperty<T>> {

    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("RedactedProperty", PrimitiveKind.STRING)

    override fun serialize(encoder: Encoder, value: RedactedProperty<T>) {
        encoder.encodeString(value.toString())
    }

    override fun deserialize(decoder: Decoder): RedactedProperty<T> =
        throw UnsupportedOperationException("Deserializing a RedactedProperty is not supported.")
}

inline fun <T> RedactedProperty.Companion.serializer(): KSerializer<RedactedProperty<T>> = RedactedPropertyEncoder()
