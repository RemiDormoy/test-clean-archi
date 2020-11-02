package com.example.myapplication.green

import com.example.myapplication.domain.Birthdate
import com.example.myapplication.domain.BirthdateInteractor

class MainController(private val interactor: BirthdateInteractor) {

    fun onDateEntered(day: Int, month: Int, year: Int) {
        val birthdate = Birthdate(day, month, year)
        interactor.validateBirthdate(birthdate)
    }
}