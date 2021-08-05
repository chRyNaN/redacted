//[redacted-core](../../index.md)/[com.chrynan.redacted.core](index.md)

# Package com.chrynan.redacted.core

## Types

| Name | Summary |
|---|---|
| [RedactedProperty](-redacted-property/index.md) | [common]<br>class [RedactedProperty](-redacted-property/index.md)<[T](-redacted-property/index.md)>(**value**: [T](-redacted-property/index.md), **redactedString**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **repeatCount**: [RepeatCount](-repeat-count/index.md))<br>A wrapper class for any type that needs to be redacted when calling [toString](-redacted-property/to-string.md) so that it doesn't output sensitive data. |
| [RedactedPropertyEncoder](-redacted-property-encoder/index.md) | [common]<br>class [RedactedPropertyEncoder](-redacted-property-encoder/index.md)<[T](-redacted-property-encoder/index.md)> : KSerializer<[RedactedProperty](-redacted-property/index.md)<[T](-redacted-property-encoder/index.md)>> |
| [RepeatCount](-repeat-count/index.md) | [common]<br>sealed class [RepeatCount](-repeat-count/index.md) |

## Functions

| Name | Summary |
|---|---|
| [serializer](serializer.md) | [common]<br>inline fun <[T](serializer.md)> [RedactedProperty.Companion](-redacted-property/-companion/index.md).[serializer](serializer.md)(): KSerializer<[RedactedProperty](-redacted-property/index.md)<[T](serializer.md)>> |
