package com.murali;

public class StudentDetails {
	
	int roll;
	String name;
	String address;
	String collageName;
	
	StudentDetails() {

	}

	
	StudentDetails(int roll,String name,String address,String collageName){
		this(roll, name, address);
		this.collageName = collageName;
	}
	
	StudentDetails(int roll,String name,String address){
		
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collageName = "NIT";
		
	}
	
	public void printdetails() {
		System.out.println("Student Roll: "+this.roll);
		System.out.println("Student Name: "+this.name);
		System.out.println("Student Address: "+this.address);
		System.out.println("Student Collage Name: "+this.collageName);
	}
	
	
	public static void main(String[] agrs) {
		
		int roll = 25;
		String name = "Murali";
		String address = "Kurnool";
		String collageName = "NIT";
		StudentDetails S = new StudentDetails();
		
		if(collageName == "NIT") {
			S = new StudentDetails(roll, name, address);
		}
		else {
			S = new StudentDetails(roll, name, address, collageName);
		}
		
		S.printdetails();
		
			
	}
	
	
}
