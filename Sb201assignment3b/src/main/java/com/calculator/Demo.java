package com.calculator;


import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(Config.class);
		CalculationPresentation cp = appContext.getBean("CalPresention", CalculationPresentation.class);
		
		System.out.println("Enter 1 for Addition");
		System.out.println("Enter 2 for Subtraction");
		System.out.println("Enter 3 for Multiplaction");
		System.out.println("Enter 4 for Division");
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		switch (number) {
			
		case 1:{
			System.out.println("Enter first Number");
			int num1 = sc.nextInt();
			System.out.println("Enter Second Number");
			int num2 = sc.nextInt();
			cp.performAddition(num1, num2);
			break;
		}
		case 2:{
			System.out.println("Enter first Number");
			int num1 = sc.nextInt();
			System.out.println("Enter Second Number");
			int num2 = sc.nextInt();
			cp.performSubstraction(num1, num2);
			break;
		}
		case 3:{
			System.out.println("Enter first Number");
			int num1 = sc.nextInt();
			System.out.println("Enter Second Number");
			int num2 = sc.nextInt();
			cp.performMultiplaction(num1, num2);
			break;
		}
		
		case 4:{
			System.out.println("Enter first Number");
			int num1 = sc.nextInt();
			System.out.println("Enter Second Number");
			int num2 = sc.nextInt();
			cp.performDivision(num1, num2);
			break;
		}
		
		default:{
			System.out.println("Invalid Input");
		}
		
		sc.close();
		((ClassPathXmlApplicationContext) appContext).close();
		}
		

	}

}
