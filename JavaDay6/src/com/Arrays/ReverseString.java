package com.Arrays;

import java.util.Scanner;

public class ReverseString {

	
	
	public static String reversString(String input){
		   	
			String str = "";
			for(int i=input.length()-1;i>=0;i--) {
				str += input.charAt(i);
			}
			return str;
			
		}
	
	
	public static void main(String[] args) {
		
		String input;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter required string to reverse");
		input = scanner.nextLine();
		String output = reversString(input);
		System.out.println(output);
		scanner.close();

	}

}
