package com.areaCalculation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext app = new AnnotationConfigApplicationContext(Config.class);
		CalculatePresentation cp =app.getBean("calculatePresentation",CalculatePresentation.class);
		cp.calculateareaOfCircle(5);
		cp.calculateareaOfRectangle(5, 2);
		cp.calculateareaOfSquare(4);
		cp.calculateareaOfTriangle(10, 5);
		
		((AnnotationConfigApplicationContext)app).close();

	}

}
