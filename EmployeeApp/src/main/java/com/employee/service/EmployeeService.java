package com.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.models.Address;
import com.employee.models.Employee;
import com.employee.repositery.AddressRepo;
import com.employee.repositery.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo eRepo;
	
	@Autowired
	AddressRepo aRepo;
	
	
	
	public List<Employee> getAllEmployees(){
		
		return eRepo.findAll();
	}
	
	
	public Employee getByEmployeeId(int id) {
		
		Optional<Employee> emp = eRepo.findById(id);
		
		if(emp.isPresent()) {
			return emp.get();
		}
		
		return null;
	}
	
	
	public Employee saveNewEmployee(Employee emp) {
		
		if(emp!=null) {
			
			List<Address> list = emp.getAddresses();
			for(Address ads:list) {
				aRepo.save(ads);
			}
			eRepo.save(emp);
			return emp;
		}
		return null;
	}
	
	public Employee updateEmployee(Integer id,Employee emp) {
		
		Employee oldEmp = getByEmployeeId(id);
		if(oldEmp!=null) {
			
			oldEmp.setFirstName(emp.getFirstName());
			oldEmp.setLastName(emp.getLastName());
			oldEmp.setPhoneNumber(emp.getPhoneNumber());
			
			if(emp.getAddresses()!=null) {
				oldEmp.setAddresses(emp.getAddresses());
			}
			
			saveNewEmployee(oldEmp);
			return oldEmp;
		}
		return null;
	}
	
	public Employee removeEmployee(Integer id) {
		
		Employee emp = getByEmployeeId(id);
		
		if(emp!=null) {
			
			eRepo.delete(emp);
			return emp;
		}
		return null;
		
	}
	
}
