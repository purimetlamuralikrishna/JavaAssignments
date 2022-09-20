package com.assignment3;

import java.util.List;
import java.util.Map;

public class Application {

	
	 private List<String> cities;
	 
	 private List<Student> students;
	 
	 private Map<Student,String> studentsCities;
	 
	 

	public void setCities(List<String> cities) {
		this.cities = cities;
	}



	public void setStudents(List<Student> students) {
		this.students = students;
	}



	public void setStudentsCities(Map<Student, String> studentsCities) {
		this.studentsCities = studentsCities;
	}



	public void printCities() {
	
		System.out.println(cities);
		System.out.println(students.toString());
		System.out.println(studentsCities.toString());
	}
	
}
