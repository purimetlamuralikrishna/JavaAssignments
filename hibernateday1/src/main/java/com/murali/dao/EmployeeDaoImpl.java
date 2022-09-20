package com.murali.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.murali.employee.Employee;
import com.murali.utill.Emutill;

public class EmployeeDaoImpl implements EmployeeDao {

	public List<Employee> getAllEmployee() {
		
		EntityManager em = Emutill.createEntity();
		Query q = em.createQuery("from Employee");
		
		
		List<Employee> results = q.getResultList ();
		
		em.close();
		return results;
	}

	public String getAddressOfEmployee(int empId) {
		
		String address = null;
		
		EntityManager em = Emutill.createEntity();
		
		em.getTransaction().begin();
		
		Employee employee = em.find(Employee.class,empId);
		if(employee != null) {
			
			address = "Employee Address is: "+employee.getAddress();
		}
		else {
			address = "Employee Address NotFound";
		}
		
		em.getTransaction().commit();
		em.close();
		return address;
	}

	public String giveBonusToEmployee(int empId, int bonus) {
		
		String result = "Bonus Not Added SucessFully";
		
		EntityManager em = Emutill.createEntity();
		
		Employee emp =em.find(Employee.class,empId);
		
		em.getTransaction().begin();
		
		if(emp != null) {
			emp.setSalary(emp.getSalary()+bonus);
			result = "Bonus Added Sucessfully";
		}
		
		em.getTransaction().commit();
		em.close();
		
		
		return result;
	}

	public boolean deleteEmployee(int empId) {
		
		boolean result = false;
		
		EntityManager em = Emutill.createEntity();
		
		Employee emp =em.find(Employee.class,empId);
		
		em.getTransaction().begin();
		
		if(emp != null) {
			em.remove(emp);
			result =true;
		}
		
		em.getTransaction().commit();
		em.close();
		
		return result;
	}

	public String[] getNameAndAddress(int empId) {
		
		String[] details = new String[2];
		
		EntityManager em = Emutill.createEntity();
		
		Employee emp =em.find(Employee.class,empId);
		
		em.getTransaction().begin();
		
		if(emp != null) {
			
			details[0] = emp.getName();
			details[1] = emp.getAddress();
		}
		
		em.getTransaction().commit();
		em.close();
		
		return details;
	}

}
