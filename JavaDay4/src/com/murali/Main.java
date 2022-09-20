package com.murali;

public class Main {

	public static void main(String[] args) {
		
		Student S1 = new Student();
		Student S2 = new Student(20, "Murali",28, 325);
		S1.roll = 52;
		S1.name = "Krishna";
		S1.age = 25;
		S1.marks = 388;
		
		System.out.println(S2.name);
		System.out.println(S1.name);

	}

}

class Student {
	
	int roll;
	String name;
	int age;
	int marks;
	
	Student(){
		
		
	}
	
	Student(int roll,String name,int age,int marks){
		
		if(age>18 && age<60&&marks>0&&marks<500) {
			this.roll = roll;
			this.name = name;
			this.age = age;
			this.marks = marks;
		}
		else {
			System.out.println("Check age and marks");
		}
	
	}

}
