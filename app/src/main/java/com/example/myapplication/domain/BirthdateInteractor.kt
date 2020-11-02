package com.example.myapplication.domain

import com.example.myapplication.green.BirthdateRepository
import com.example.myapplication.green.BirthdayError
import com.example.myapplication.green.MainPresenter

class BirthdateInteractor(
    private val repository: BirthdateRepository,
    private val mainPresenter: MainPresenter
) {

    fun validateBirthdate(birthdate: Birthdate) {
        if (birthdate.is18YearsOld()) {
            try {
                repository.sendBirthdateToNetwork(birthdate)
                mainPresenter.displayBirthdate(birthdate)
            } catch (e: BirthdayError) {
                mainPresenter.displayError()
            }
        } else {
            mainPresenter.displayError()
        }
    }
}
