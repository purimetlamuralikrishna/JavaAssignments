package com.areaCalculation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CalculatePresentation {

	@Autowired
	CalculateArea cal;
	
	
	
	public void calculateareaOfCircle(int radius) {
		System.out.println("Area of Circle");
		System.out.println(cal.circleArea(radius));
	}
	
	
	public void calculateareaOfSquare(int length) {
		System.out.println("Area of Square");
		System.out.println(cal.squareArea(length));
	}
	
	
	public void calculateareaOfRectangle(int length,int breath) {
		System.out.println("Area of Rectangle");
		System.out.println(cal.rectangleArea(length,breath));
	}
	
	
	public void calculateareaOfTriangle(int length,int breath) {
		System.out.println("Area of Triangle");
		System.out.println(cal.triangleArea(length,breath));
	}
	
	
	
	
}
