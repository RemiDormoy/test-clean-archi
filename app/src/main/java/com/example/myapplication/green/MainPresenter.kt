package com.example.myapplication.green

import com.example.myapplication.MainView
import com.example.myapplication.domain.Birthdate

class MainPresenter(
    private val mainView: MainView
) {

    fun displayBirthdate(birthdate: Birthdate) {
        val formatedDate = "Anniversaire : ${birthdate.day} ${birthdate.month.toFrench()}"
        mainView.displayBirtdate(formatedDate)
    }

    fun Int.toFrench() : String {
        return when(this) {
            1 -> "Janvier"
            2 -> "Fevrier"
            3 -> "Mars"
            4 -> "Avril"
            else -> "Mai"
        }
    }

    fun displayError() {
        mainView.displayError()
    }
}