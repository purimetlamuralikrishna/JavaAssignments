package com.employee.exception;

public class EmployeeNotFound extends RuntimeException{

	public EmployeeNotFound() {
		
	}
	
	public EmployeeNotFound(String message) {
		super(message);
	}
}
