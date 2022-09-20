package com.murali;

public class MainStudent {

	public static void main(String[] args) {
		
		Student student1 = new Student(23,"Murali",60);
		
		student1.getter();

	}

}
class Student{
	
	int rollNumber;
	String studentName;
	int marks;
	
	Student(){
		
	}
	Student(int roll,String name,int mark){
		this.rollNumber = roll;
		this.studentName = name;
		this.marks = mark;
		
	}
	
	public void setter() {
		
	}
	public void getter() {
		System.out.println("Roll Number: "+this.rollNumber);
		System.out.println("Student Name: "+this.studentName);
		System.out.println("Student Marks: "+this.marks);
	}
}
