package com.murali;

public class StudentDetails {

	
	int roll;
	String name;
	int marks;
	
	void displayStudentDetails() {
		System.out.println("roll is "+roll);
		System.out.println("name is "+name);
		System.out.println("marks is "+marks);
	}
	
	public static void main(String[] args) {
		
		StudentDetails S1 = new StudentDetails();
		S1.roll = 25;
		S1.name = "Murali";
		S1.marks = 69;
		S1.displayStudentDetails();
		S1 = null;
		
		StudentDetails S2 = new StudentDetails();
		S2.roll = 03;
		S2.name = "Krishna";
		S2.marks = 58;
		S2.displayStudentDetails();
		S2 = null;
		
	}

}
