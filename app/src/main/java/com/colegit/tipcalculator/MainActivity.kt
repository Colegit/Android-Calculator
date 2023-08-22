package com.colegit.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var baseAmount: EditText
    private lateinit var tipSlider: SeekBar
    private lateinit var tipAmount: TextView
    private lateinit var totalToPay: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        baseAmount = findViewById(R.id.baseAmount)
        tipSlider = findViewById(R.id.tipSlider)
        tipAmount = findViewById(R.id.tipAmount)
        totalToPay = findViewById(R.id.totalToPay)
    }
}