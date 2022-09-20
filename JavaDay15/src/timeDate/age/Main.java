package timeDate.age;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year of Birth in yyyy-MM-dd Format");
		String dob = sc.next();
		
		Age age = new Age();
		age.findAge(dob);
		
		sc.close();

	}

}
