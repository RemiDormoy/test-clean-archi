package com.example.myapplication.domain

import org.junit.Assert.*
import org.junit.Test

class BirthdateTest {

    @Test
    fun `when year is 18 years old should return true`() {
        assert(Birthdate(1, 1, 2001).is18YearsOld())
    }

    @Test
    fun `when year is not 18 years old should return false`() {
        assert(!Birthdate(1, 1, 2003).is18YearsOld())
    }
}