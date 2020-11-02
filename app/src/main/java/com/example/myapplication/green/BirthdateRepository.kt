package com.example.myapplication.green

import com.example.myapplication.blue.BirthdateDataSource
import com.example.myapplication.domain.Birthdate

class BirthdateRepository(private val dataSource: BirthdateDataSource) {

    @Throws(BirthdayError::class)
    fun sendBirthdateToNetwork(birthdate: Birthdate) {
        val formatedBirthdate = "${birthdate.day}/${birthdate.month}/${birthdate.year}"
        dataSource.sendToNetwork(formatedBirthdate)
    }
}

class BirthdayError : Exception()
