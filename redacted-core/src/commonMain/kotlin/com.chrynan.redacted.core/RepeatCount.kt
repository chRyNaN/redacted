package com.chrynan.redacted.core

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed class RepeatCount {

    @Serializable
    data class Exact(@SerialName(value = "count") val count: Int) : RepeatCount()

    @Serializable
    object MatchLength : RepeatCount()

    companion object
}
