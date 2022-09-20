package com.murali.main;

import javax.persistence.EntityManager;

import com.murali.Entites.Department;
import com.murali.Entites.Employee;
import com.murali.utill.utility;

public class Main {

	public static void main(String[] args) {
		
		
		EntityManager em=utility.createEmanager();
		
		Department dept1 = new Department();
		dept1.setDeptId(1);
		dept1.setDname("HR");
		dept1.setLocation("Delhi");
		
		
//		Department dept2 = new Department();
//		dept2.setDeptId(2);
//		dept2.setDname("Technical");
//		dept2.setLocation("Pune");
		
		
		Employee emp1 = new Employee();
		emp1.setEmpId(10);
		emp1.setEname("Kittu");
		emp1.setAddress("Hyderabad");
		emp1.setSalary(25000);
		emp1.setDept(dept1);
		
		Employee emp2 = new Employee();
		emp2.setEmpId(11);
		emp2.setEname("Ravi");
		emp2.setAddress("Hyderabad");
		emp2.setSalary(25000);
		emp2.setDept(dept1);
		
		
		Employee emp3 = new Employee();
		emp3.setEmpId(12);
		emp3.setEname("Sai");
		emp3.setAddress("Bangalore");
		emp3.setSalary(30000);
		emp3.setDept(dept1);
		
		dept1.getEmpList().add(emp1);
		dept1.getEmpList().add(emp2);
		dept1.getEmpList().add(emp3);
		
		em.getTransaction().begin();
		
		em.persist(dept1);
		
		em.getTransaction().commit();
		
		
		
		em.close();
	}

}
