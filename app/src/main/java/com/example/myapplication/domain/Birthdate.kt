package com.example.myapplication.domain

data class Birthdate(
    val day: Int,
    val month: Int,
    val year: Int
) {
    fun is18YearsOld(): Boolean {
        return year < 2002
    }
}
