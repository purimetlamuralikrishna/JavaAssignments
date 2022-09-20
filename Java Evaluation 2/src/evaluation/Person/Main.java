package evaluation.Person;

import java.util.Scanner;

public class Main {
	
	
	public static Person generatePerson(Person person) {
		
		Person student = new Student(null, null, null, null, null, 0, null, 0);
		return student;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student name");
		System.out.println("Enter student id");
		System.out.println("Enter student city");
		System.out.println("Enter student pincode");
		System.out.println("Enter student state");
		
		
		
		Person newStudent = generatePerson(new Student(sc.next(), null, null, null, null, 0, null, 0));
		
		Person newTeacher = generatePerson(new Instructor(null, null, null, null, null, 0, 0));
		
		System.out.println(newStudent.toString());
		System.out.println(newStudent.toString());
		
	}

}
