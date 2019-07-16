package com.test.services

import com.test.model.MathOperation
import com.test.model.Operation
import org.tempuri.Calculator
import org.tempuri.CalculatorSoap
import java.net.URL

class CalculatorService {

    private val calculatorService: CalculatorSoap = Calculator(URL("http://www.dneonline.com/calculator.asmx?wsdl")).calculatorSoap

    fun calculate(mathOperation: MathOperation): Int {
        return when(mathOperation.operation) {
            Operation.ADD -> calculatorService.add(mathOperation.intA, mathOperation.intB)
            Operation.DIVIDE -> calculatorService.divide(mathOperation.intA, mathOperation.intB)
            Operation.MULTIPLY -> calculatorService.multiply(mathOperation.intA, mathOperation.intB)
            Operation.SUBSTRACT -> calculatorService.subtract(mathOperation.intA, mathOperation.intB)
        }
    }


}