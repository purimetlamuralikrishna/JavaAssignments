package com.murali.main;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.murali.entites.Address;
import com.murali.entites.Employee;
import com.murali.entity.Entity;

public class Main {

	public static void main(String[] args) {
		
		EntityManager em = Entity.createEntityManager();
		
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<4;i++) {
			Employee emp = new Employee();
			
			System.out.println("Enter Employee Id");
			emp.setPid(sc.nextInt());
			
			System.out.println("Enter Employee Name");
			emp.setName(sc.next());
			
			
			System.out.println("Enter Employee Salary");
			emp.setSalary(sc.nextInt());
			
			
			System.out.println("Enter Employee Home Address");
			Address homeAddress = new Address();
			
			System.out.println("Enter Employee Home Address City");
			homeAddress.setCity(sc.next());
			
			System.out.println("Enter Employee Home Address State");
			homeAddress.setState(sc.next());
			
			System.out.println("Enter Employee Home Address pincode");
			homeAddress.setPincode(sc.next());
			
			System.out.println("Enter Employee Office Address");
			Address officeAddress = new Address();
			
			System.out.println("Enter Employee Office Address City");
			officeAddress.setCity(sc.next());
			
			System.out.println("Enter Employee Office Address State");
			officeAddress.setState(sc.next());
			
			System.out.println("Enter Employee Office Address State");
			officeAddress.setPincode(sc.next());
			
			
			emp.setHomeAddress(homeAddress);
			emp.setOfficeAddress(officeAddress);
			
			em.getTransaction().begin();
			
			em.persist(emp);
			em.persist(emp);
			
			em.getTransaction().commit();
		}
		
		sc.close();
		em.close();
		
		
		
		

	}

}
