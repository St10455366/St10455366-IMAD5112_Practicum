package com.example.st10455366_imad5112_practicum

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat



class DetailedView : AppCompatActivity() {

    private val minWeather = arrayOf("12","15","18","17","15","10","10")
    private val maxWeather = arrayOf("25","29","30","28","24","18","16")
    private val conditionWeather = arrayOf("sunny","sunny", "sunny","sunny","cloudy","Raining","cold")
    private val dayData = arrayOf("Monday","Tuesday", "Wednesday","Thursday","Friday","Saturday","Sunday")

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val Day: TextView = findViewById(R.id.Day)
        val minData: TextView = findViewById(R.id.minData)
        val maxData: TextView = findViewById(R.id.maxData)
        val condition: TextView = findViewById(R.id.condition)

        Day.text = "${dayData}"
        minData.text = "${minWeather}"
        maxData.text = "${maxWeather}"
        condition.text = "${conditionWeather}"

    }
}