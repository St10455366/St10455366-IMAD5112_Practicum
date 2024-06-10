package com.example.st10455366_imad5112_practicum

import android.content.Intent
import android.health.connect.datatypes.units.Temperature
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {

    private val dayData = arrayOf("Monday","Tuesday", "Wednesday","Thursday","Friday","Saturday","Sunday")
    private val AverageData = arrayOf("16","22","24","23","19","14","13")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val ButtonDetail = findViewById<Button>(R.id.ButtonDetail)
        ButtonDetail.setOnClickListener {
            val intent = Intent(this,DetailedView::class.java)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val Weekly: TextView = findViewById(R.id.Weekly)
        val Temperature: TextView = findViewById(R.id.Temperature)


        Weekly.text = "Day: ${dayData}"
        Temperature.text = "Average Temperature: ${AverageData}"
    }
}