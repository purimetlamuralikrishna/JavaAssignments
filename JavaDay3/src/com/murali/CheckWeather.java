package com.murali;

public class CheckWeather {
	
	static boolean isSnowing = false;
	static boolean isRaining = false;
	static double temperature = 49.0;
	
	

	public static void main(String[] args) {
		
		if(isSnowing == true || isRaining == true || temperature >= 50.0) {
			System.out.println("Let’s stay home");
		}
		else {
			System.out.println("Let’s go out!");
		}
		

	}

}
