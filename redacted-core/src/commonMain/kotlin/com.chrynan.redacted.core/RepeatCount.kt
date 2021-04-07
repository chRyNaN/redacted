package com.chrynan.redacted.core

sealed class RepeatCount {

    data class Exact(val count: Int) : RepeatCount()

    object MatchLength : RepeatCount()
}
