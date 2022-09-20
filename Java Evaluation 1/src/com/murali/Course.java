package com.murali;

public class Course {
	
	int courseId;
	String  courseName;
	int courseFee;
	
	Course(){
		
	}
	
	public void displayCourseDetails(){
		System.out.println("Course Name: FWD");
		System.out.println("Course ID: 245");
		System.out.println("Course Fee: 50000/-");
	}
	
	public void authenticate(String username,String password ) {
		if(username == "Admin" && password == "1234") {
			System.out.println(this.courseName);
			System.out.println(this.courseId);
			System.out.println(this.courseFee);
		}
		else {
			System.out.println("Invalid Username And Password");
		}
	}

	public static void main(String[] args) {
		
		Course cousre = new Course();
		
		cousre.courseFee = 2345;
		cousre.courseId = 235;
		cousre.courseName = "murali";
		cousre.authenticate("asd","124");
		cousre.authenticate("Admin","1234");
		
		
	}

}
