//[redacted-core](../../../index.md)/[com.chrynan.redacted.core](../index.md)/[RedactedProperty](index.md)

# RedactedProperty

[common]\
class [RedactedProperty](index.md)<[T](index.md)>(**value**: [T](index.md), **redactedString**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **repeatCount**: [RepeatCount](../-repeat-count/index.md))

A wrapper class for any type that needs to be redacted when calling [toString](to-string.md) so that it doesn't output sensitive data.

## Constructors

| | |
|---|---|
| [RedactedProperty](-redacted-property.md) | [common]<br>fun <[T](index.md)> [RedactedProperty](-redacted-property.md)(value: [T](index.md), redactedString: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = "█████████", repeatCount: [RepeatCount](../-repeat-count/index.md) = RepeatCount.Exact(count = 1)) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [equals](equals.md) | [common]<br>open operator override fun [equals](equals.md)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [hashCode](hash-code.md) | [common]<br>open override fun [hashCode](hash-code.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [toString](to-string.md) | [common]<br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

## Properties

| Name | Summary |
|---|---|
| [value](value.md) | [common]<br>val [value](value.md): [T](index.md) |
