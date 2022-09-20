package exception.student;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name");
		String name = sc.next();
		System.out.println("Enter student country");
		String country = sc.next();
		
		try {
			UserRegistration.registerUser(name,country);
		} catch (InvalidCountryException e) {
			
			System.out.println("User Outside India cannot be registered");
		}
		sc.close();

	}

}
