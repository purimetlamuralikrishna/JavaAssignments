package com.murali;

import java.util.Scanner;

public class Demo {
	
	
	
	

	public static void main(String[] args) {
		
		int numberOfStudents;
		int sum = 0;
		
		Scanner S = new Scanner(System.in);
		System.out.println("Enter Number Of Students");
		numberOfStudents = S.nextInt();
		DemoStudent[] studentsData = new DemoStudent[numberOfStudents];
		
		
		for(int i=0;i<numberOfStudents;i++) {
			
			DemoStudent student = new DemoStudent();
			
			System.out.println("Enter Student Roll No;");
			student.roll =  S.nextInt();
			System.out.println("Enter Student Name");
			student.name =  S.nextLine();
			student.name =  S.nextLine();
			System.out.println("Enter Student Address");
			student.address =  S.nextLine();
			System.out.println("Enter Student Marks");
			student.marks =  S.nextInt();
			
			studentsData[i]=student;
			sum += studentsData[i].marks;
			
			System.out.println("Student Name: "+ studentsData[i].name);
			System.out.println("Student Roll No: "+ studentsData[i].roll);
			System.out.println("Student Address: "+ studentsData[i].address);
			System.out.println("Student marks: "+ studentsData[i].marks);
			
		}
		S.close();
		
		System.out.println("Average Marks Of total Students: "+sum/numberOfStudents);
		
		
		
		
		
		
		
		
	}

}

class DemoStudent{
	
	int roll;
	String name;
	String address;
	int marks;
	
}
