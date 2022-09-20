package com.Arrays;

public class CommandLineArg {
	
	
	public static void factorial(int input) {
		
			int num = input;
			int factor = 1;
			for(int i=1;i<=num;i++) {
				factor *= i;
			}
			System.out.println(factor);
			
		
	}

	public static void main(String[] args) {
		
		if(args.length==1) {
			int num = Integer.parseInt(args[0]);
			CommandLineArg.factorial(num);
		}
		else if(args.length==2) {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			CommandLineArg.factorial(Math.abs(num1-num2));
			
		}
		else {
			System.out.println("Error");
		}
		

	}

}
