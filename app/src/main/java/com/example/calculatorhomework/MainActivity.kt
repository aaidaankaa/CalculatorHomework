package com.example.calculatorhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    lateinit var FirstNumber: EditText
    lateinit var Symbol: EditText
    lateinit var SecondNumber: EditText
    lateinit var resultBtn: Button
    lateinit var result: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FirstNumber = findViewById(R.id.FirstNumber)
        Symbol = findViewById(R.id.Symbol)
        SecondNumber = findViewById(R.id.SecondNumber)
        resultBtn = findViewById(R.id.resultBtn)
        result = findViewById(R.id.result)

        resultBtn.setOnClickListener {
            result.text = getResult()
        }

    }

    fun getResult(): String {
        val fNumber = FirstNumber.text.toString().toInt()
        val sNumber = SecondNumber.text.toString().toInt()
        val symb = Symbol.text.toString()

        if (symb == "+") {
            return (fNumber + sNumber).toString()
        }
        if (symb == "-") {
            return (fNumber - sNumber).toString()}
        if (symb == "/") {
            return (fNumber / sNumber).toString()
        }
        if (symb == "*") {
            return (fNumber * sNumber).toString()
        }
        if (symb=="="){
        return(fNumber==sNumber).toString()}
            if (symb==">"){
                return(fNumber>sNumber).toString()}
                if (symb=="<"){
                    return(fNumber<sNumber).toString()}
        return "нет результата"
        }
    }


