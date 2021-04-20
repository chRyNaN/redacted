//[redacted-core](../../../index.md)/[com.chrynan.redacted.core](../index.md)/[RedactedProperty](index.md)



# RedactedProperty  
 [common] class [RedactedProperty](index.md)<[T](index.md)>(**value**: [T](index.md), **redactedString**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **repeatCount**: [RepeatCount](../-repeat-count/index.md))

A wrapper class for any type that needs to be redacted when calling [toString](to-string.md) so that it doesn't output sensitive data.

   


## Constructors  
  
| | |
|---|---|
| <a name="com.chrynan.redacted.core/RedactedProperty/RedactedProperty/#TypeParam(bounds=[kotlin.Any?])#kotlin.String#com.chrynan.redacted.core.RepeatCount/PointingToDeclaration/"></a>[RedactedProperty](-redacted-property.md)| <a name="com.chrynan.redacted.core/RedactedProperty/RedactedProperty/#TypeParam(bounds=[kotlin.Any?])#kotlin.String#com.chrynan.redacted.core.RepeatCount/PointingToDeclaration/"></a> [common] fun <[T](index.md)> [RedactedProperty](-redacted-property.md)(value: [T](index.md), redactedString: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = "█████████", repeatCount: [RepeatCount](../-repeat-count/index.md) = RepeatCount.Exact(count = 1))   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.redacted.core/RedactedProperty/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](equals.md)| <a name="com.chrynan.redacted.core/RedactedProperty/equals/#kotlin.Any?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator override fun [equals](equals.md)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>|
| <a name="com.chrynan.redacted.core/RedactedProperty/hashCode/#/PointingToDeclaration/"></a>[hashCode](hash-code.md)| <a name="com.chrynan.redacted.core/RedactedProperty/hashCode/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [hashCode](hash-code.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>|
| <a name="com.chrynan.redacted.core/RedactedProperty/toString/#/PointingToDeclaration/"></a>[toString](to-string.md)| <a name="com.chrynan.redacted.core/RedactedProperty/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.redacted.core/RedactedProperty/value/#/PointingToDeclaration/"></a>[value](value.md)| <a name="com.chrynan.redacted.core/RedactedProperty/value/#/PointingToDeclaration/"></a> [common] val [value](value.md): [T](index.md)   <br>|

