package com.jpa.EmployeeMain;

import java.util.HashSet;
import java.util.Set;

import com.jpa.Employee.Address;
import com.jpa.Employee.Employee;
import com.jpa.EmployeeDao.EmployeeDao;
import com.jpa.EmployeeDao.EmployeeDaoImpl;

public class Main {

	public static void main(String[] args) {
		
		
		//Employeee 1
		
		Address muraliHome = new Address("AP","Kurnool","518347","Home");
		Address muraliEducation = new Address("Karnatak","Banglore","515002","Education");
		Set<Address> muraliaddresses = new HashSet<Address>();
		muraliaddresses.add(muraliHome);
		muraliaddresses.add(muraliEducation);
		
		Employee emp1 = new Employee(1,"Murali","Male",10000,muraliaddresses);
		
		
		//Employeee 2
		
		Address saiHome = new Address("AP","Kurnool","518347","Home");
		Address saiEducation = new Address("Karnatak","Banglore","515002","Education");
		Set<Address> saiaddresses = new HashSet<Address>();
		saiaddresses.add(saiHome);
		saiaddresses.add(saiEducation);
		
		Employee emp2 = new Employee(2,"Sai","Male",20000,saiaddresses);
		
		
		
		//Employeee 3
		Address kittuHome = new Address("AP","Kurnool","518347","Home");
		Address kittuEducation = new Address("Karnatak","Banglore","515002","Education");
		Set<Address> kittuaddresses = new HashSet<Address>();
		kittuaddresses.add(kittuHome);
		kittuaddresses.add(kittuEducation);

		Employee emp3 = new Employee(3,"Kittu","female",30000,kittuaddresses);
		
		
		
		//Employeee 4
		Address VijjiHome = new Address("AP","Kurnool","518347","Home");
		Address VijjiEducation = new Address("Karnatak","Banglore","515002","Education");
		Set<Address> Vijjiaddresses = new HashSet<Address>();
		Vijjiaddresses.add(VijjiHome);
		Vijjiaddresses.add(VijjiEducation);
		
		Employee emp4 = new Employee(4,"vijji","female",40000,Vijjiaddresses);
		
		
		
		
		EmployeeDao empDb = new EmployeeDaoImpl();
		
		System.out.println(empDb.createEmployeeDetails(emp1));
		System.out.println(empDb.createEmployeeDetails(emp2));
		System.out.println(empDb.createEmployeeDetails(emp3));
		System.out.println(empDb.createEmployeeDetails(emp4));

	}

}
