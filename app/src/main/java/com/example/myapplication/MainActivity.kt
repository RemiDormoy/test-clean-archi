package com.example.myapplication

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import com.example.myapplication.green.MainController

class MainActivity : MainView, AppCompatActivity(){

    lateinit var controller: MainController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener {
            val datePicker = findViewById<DatePicker>(R.id.datePicker)
            val day = datePicker.dayOfMonth
            val month = datePicker.month
            val year = datePicker.year
            controller.onDateEntered(day, month, year)
        }
        controller = MainModule(this).inject()
    }

    override fun displayBirtdate(formatedDate: String) {
      findViewById<TextView>(R.id.textView).text = formatedDate
    }

    override fun displayError() {
        findViewById<TextView>(R.id.textView).text = "Erreur"
    }
}