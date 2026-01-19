package com.example.simplecalculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var display: TextView
    private val calculator = CalculatorLogic()
    private var isCalculatorOn = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        display = findViewById(R.id.tvDisplay)

        val buttonMap = mapOf(
            R.id.btn0 to "0",
            R.id.btn1 to "1",
            R.id.btn2 to "2",
            R.id.btn3 to "3",
            R.id.btn4 to "4",
            R.id.btn5 to "5",
            R.id.btn6 to "6",
            R.id.btn7 to "7",
            R.id.btn8 to "8",
            R.id.btn9 to "9",
            R.id.btnPlus to "+",
            R.id.btnMinus to "−",
            R.id.btnMultiply to "×",
            R.id.btnDivide to "÷",
            R.id.btnEquals to "=",
            R.id.btnClear to "C"
        )

        for ((id, value) in buttonMap) {
            findViewById<Button>(id)?.setOnClickListener {
                if (isCalculatorOn) {
                    onButtonClick(value)
                }
            }
        }

        findViewById<Button>(R.id.btnOnOff)?.setOnClickListener {
            toggleCalculator()
        }
    }

    private fun onButtonClick(value: String) {
        when {
            value.matches(Regex("[0-9]")) -> {
                display.text = calculator.inputNumber(display.text.toString(), value)
            }
            value in setOf("+", "−", "×", "÷") -> {
                display.text = calculator.setOperator(display.text.toString(), value)
            }
            value == "=" -> {
                display.text = calculator.calculate(display.text.toString())
            }
            value == "C" -> {
                calculator.clear()
                display.text = "0"
            }
        }
    }

    private fun toggleCalculator() {
        isCalculatorOn = !isCalculatorOn
        if (!isCalculatorOn) {
            display.text = ""
            calculator.clear()
        } else {
            display.text = "0"
        }
    }
}
