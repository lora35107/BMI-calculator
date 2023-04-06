package com.example.bmicalculator_lora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var height: EditText
    private lateinit var results: TextView
    private lateinit var weight: EditText
    private lateinit var submit: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        height = findViewById(R.id.edt_height)
        results = findViewById(R.id.txt_result)
        weight = findViewById(R.id.edt_weight)
        submit = findViewById(R.id.btn_submit)

        submit.setOnClickListener {
            var first_number = height.toString().trim()
            var second_number = weight.toString().trim()

            if (first_number.isEmpty() || second_number.isEmpty()) {
                Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show()
            } else {
                //means has some data
                var BMIheight1 = first_number.toDouble() / 100
                var BMIheight2 = BMIheight1.toDouble() * BMIheight1.toDouble()
                var BMIans = second_number.toDouble() / BMIheight2
                results.text = BMIans.toString()
            }


        }
    }
}