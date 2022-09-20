package com.jpa.EmployeeDao;

import javax.persistence.EntityManager;

import com.jpa.Employee.Employee;
import com.jpa.Emutill.Emtill;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public String createEmployeeDetails(Employee employee) {
		
		String result = "Not Created";
		
		if(employee != null) {
			
			EntityManager em = Emtill.createEmanager();
			Employee emp = em.find(Employee.class,employee.getEmpID());
			
			if(emp == null) {
				
				em.getTransaction().begin();
				em.persist(employee);
				em.getTransaction().commit();
				result = "Created Sucessfully";
			}
			else {
				result = "Details Already Exists";
			}
	
		}
		else {
			result = "Invalid Employee Details";
		}
		
		return result;
	}

}
