package bean.citizen;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
	
	
	public boolean validate(String name, String mobileNum, String aadharCard) {
		
		if(Pattern.matches("[a-zA-Z]{3,8}", name)&&Pattern.matches("[0-9]{12}",aadharCard)&&Pattern.matches("[6789]{1}[0-9]{9}",mobileNum)){
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			Demo demo = new Demo();
			
			System.out.println("Enter Name");
			String name = sc.next();
			System.out.println("Enter Mobile Number");
			String mobile = sc.next();
			System.out.println("Enter Aadhar Number");
			String aadhar = sc.next();
			
			if(demo.validate(name,mobile,aadhar)) {
				Citizen citizen = new Citizen(name, aadhar, mobile);
				System.out.println(citizen.toString());
			}
			else {
				System.out.println("Please Enter valid Details");
			}
			sc.close();
	}

}
