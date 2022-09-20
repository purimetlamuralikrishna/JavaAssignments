package com.murali.main;

import com.murali.dao.EmployeeDaoImpl;

public class Main {

	public static void main(String[] args) {
		
		EmployeeDaoImpl empl = new EmployeeDaoImpl();
		
		System.out.println(empl.getAddressOfEmployee(1));
		
		System.out.println(empl.giveBonusToEmployee(1, 50));
		
		System.out.println(empl.deleteEmployee(1));
		
		System.out.println(empl.getNameAndAddress(1));
		
		System.out.println(empl.getAllEmployee());
		
		
		
		
		System.out.println("Done.....");
		
		

	}

}
