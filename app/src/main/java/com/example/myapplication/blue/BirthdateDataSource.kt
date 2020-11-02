package com.example.myapplication.blue

import com.example.myapplication.green.BirthdayError

class BirthdateDataSource(
) {

    fun sendToNetwork(formatedDate: String) {
        try {
            // Send string to network
        } catch (e: Throwable) {
            throw BirthdayError()
        }
    }
}
