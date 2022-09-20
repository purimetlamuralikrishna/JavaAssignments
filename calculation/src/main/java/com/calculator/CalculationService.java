package com.calculator;

public class CalculationService implements CalculationIntr {
	
	
	public int add(int a,int b) {
		return a+b;
	}
	public int subtract(int a,int b) {
		return a-b;
	}
	public int multiply(int a, int b) {
		return a*b;
	}
	public double divide(int a,int b) {
		return a/b;
	}
	
	
	
	

	public int addition(int a,int b) {
		
		System.out.println("Performing Addition");
		return add(a,b);
	}
	
	public int subtraction(int a,int b) {
		
		System.out.println("Performing subtraction");	
		return subtract(a,b);
	}
		
	public int multiplaction(int a,int b) {
		
		System.out.println("Performing multiplaction");
		return multiply(a, b);
	}
	
	public double division(int a,int b) {
		
		System.out.println("Performing division");
		return divide(a, b);
	}
	
	
}
