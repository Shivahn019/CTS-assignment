package com.shivu.calculator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shivu.calculator.application.CalculatorApplication;
import com.shivu.calculator.entity.Calculator;
import com.shivu.calculator.exception.CalculatorException;

@RestController
public class CalculatorController {

	@Autowired
	private CalculatorApplication calculatorApplication;
	
	@PostMapping(path = "/Calculator/result", consumes = "application/json", produces = "application/json")
	
	public Calculator getResult(@RequestBody Calculator calculator) throws CalculatorException
	{
		
		return calculatorApplication.getResult(calculator);
		
	}
	
	@GetMapping(path = "/Calculator/AllResults/{operation}")
	
	public List<Calculator> getAllResults(@PathVariable("operation") String operation)
	{
		return calculatorApplication.getAllResults(operation);
		
	}

}
