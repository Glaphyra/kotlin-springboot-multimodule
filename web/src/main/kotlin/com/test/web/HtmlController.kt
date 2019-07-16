package com.test.web

import com.test.config.TestProperties
import com.test.model.MathOperation
import com.test.model.Operation
import com.test.services.CalculatorService
import mu.KotlinLogging
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping

@Controller
class HtmlController(private val properties: TestProperties) {

	companion object {
		private val logger = KotlinLogging.logger {}
	}

	@GetMapping("/")
	fun hello(model: Model): String {
		model["title"] = properties.title
		model["mathOperation"] = MathOperation(Operation.ADD, 1, 1)
		return "calculate"
	}

	@PostMapping("/")
	fun calculate(model: Model, mathOperation: MathOperation): String {
		logger.info("Calculating ${mathOperation.operation} with values ${mathOperation.intA} and ${mathOperation.intB}")
		model["title"] = properties.title
		model["mathOperation"] = mathOperation
		model["result"] = CalculatorService().calculate(mathOperation)
		return "calculate"
	}
}