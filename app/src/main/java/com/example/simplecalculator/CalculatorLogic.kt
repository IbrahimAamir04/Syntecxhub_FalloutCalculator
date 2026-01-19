package com.example.simplecalculator

class CalculatorLogic {

    private var firstNumber: Double? = null
    private var operator: String? = null
    private var waitingForSecond = false

    fun inputNumber(currentText: String, digit: String): String {
        if (currentText == "0" || waitingForSecond) {
            waitingForSecond = false
            return digit
        }
        return currentText + digit
    }

    private fun doCalculation(num1: Double, op: String, num2: Double): Double? {
        return when (op) {
            "+" -> num1 + num2
            "−" -> num1 - num2
            "×" -> num1 * num2
            "÷" -> if (num2 == 0.0) null else num1 / num2
            else -> null
        }
    }

    fun setOperator(currentText: String, op: String): String {
        val currentNumber = currentText.toDoubleOrNull() ?: return currentText

        if (firstNumber != null && operator != null && !waitingForSecond) {
            val result = doCalculation(firstNumber!!, operator!!, currentNumber)
            if (result == null) { // Division by zero
                clear()
                return "Error"
            }
            firstNumber = result
            operator = op
            waitingForSecond = true
            return result.toString().removeSuffix(".0")
        } else {
            firstNumber = currentNumber
            operator = op
            waitingForSecond = true
            return currentText
        }
    }

    fun calculate(currentText: String): String {
        val secondNumber = currentText.toDoubleOrNull()

        if (firstNumber == null || operator == null || secondNumber == null) {
            return currentText
        }

        val result = doCalculation(firstNumber!!, operator!!, secondNumber)
        clear()
        if (result == null) {
            return "Error"
        }
        return result.toString().removeSuffix(".0")
    }

    fun clear() {
        firstNumber = null
        operator = null
        waitingForSecond = false
    }
}
