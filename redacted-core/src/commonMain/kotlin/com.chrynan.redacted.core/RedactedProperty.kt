@file:Suppress("unused")

package com.chrynan.redacted.core

/**
 * A wrapper class for any type that needs to be redacted when calling [toString] so that it doesn't output sensitive
 * data.
 */
class RedactedProperty<T>(
    val value: T,
    private val redactedString: String = "█████████",
    private val repeatCount: RepeatCount = RepeatCount.Exact(count = 1)
) {

    override fun equals(other: Any?): Boolean {
        if (other !is RedactedProperty<*>) return false

        return value == other.value
    }

    override fun hashCode(): Int = value.hashCode()

    override fun toString(): String = buildString {
        when (repeatCount) {
            is RepeatCount.Exact -> {
                if (repeatCount.count <= 0) {
                    append("")
                } else {
                    for (i in 0 until repeatCount.count) {
                        append(redactedString)
                    }
                }
            }
            is RepeatCount.MatchLength -> {
                val string = value.toString()

                for (i in string.indices) {
                    append(redactedString)
                }
            }
        }
    }

    companion object
}
