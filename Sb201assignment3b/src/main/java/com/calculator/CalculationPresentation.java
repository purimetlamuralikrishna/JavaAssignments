package com.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller(value="CalPresention")
public class CalculationPresentation {

	@Autowired
	private CalculationIntr cs;

	public CalculationPresentation(CalculationService cs) {
		super();
		this.cs = cs;
	}
	
	public void performAddition(int a, int b) {
		System.out.println("Addition of two values is: "+cs.addition(a, b));
	}
	
	public void performSubstraction(int a, int b) {
		System.out.println("Subtraction of two values is: "+cs.subtraction(a, b));
	}
	
	public void performMultiplaction(int a, int b) {
		System.out.println("Multiplaction of two values is: "+cs.multiplaction(a, b));
	}
	
	public void performDivision(int a, int b) {
		System.out.println("Division of two values is: "+cs.division(a, b));
	}
	
}
