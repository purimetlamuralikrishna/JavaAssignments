package com.areaCalculation;

import org.springframework.stereotype.Service;

@Service
public class CalculateArea {
	

	public double squareArea(int length) {
		return length*length;
	}
	
	
	public double rectangleArea(int length,int breath) {
		return length*breath;
	}
	
	
	public double circleArea(int radius) {
		return 2*3.14*(radius*radius);
	}
	
	
	public double triangleArea(int height,int breath) {
		return (height*breath)/2;
		
	}
}
