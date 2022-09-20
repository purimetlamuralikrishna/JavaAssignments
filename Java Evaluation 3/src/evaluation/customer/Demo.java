package evaluation.customer;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
	
	
	public static void validate(String username,String password,String mobileNumber,String email) {
		
		if(Pattern.matches("[a-zA-Z0-9]{3,8}",username)&&Pattern.matches("[A-Za-z0-9]{3,8}",password)&&Pattern.matches("[6789]{1}[0-9]{9}",mobileNumber)
			&&Pattern.matches("[a-z]{4,15}", email)) {
			Customer customer = new Customer(username, password, mobileNumber, email);
			System.out.println(customer.toString());
		}
		else {
			System.out.println("Please Enter Valid Details");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Username");
		String username = sc.next();
		System.out.println("Enter Password");
		String password =sc.next();
		System.out.println("Enter Mobile Number");
		String mobileNumber =sc.next();
		System.out.println("Enter Email");
		String email = sc.next();
		
		validate(username, password, mobileNumber, email);
		sc.close();
		
		
		

	}

}
