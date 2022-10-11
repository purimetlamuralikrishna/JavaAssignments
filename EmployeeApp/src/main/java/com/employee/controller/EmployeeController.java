package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.exception.EmployeeNotFound;
import com.employee.models.Address;
import com.employee.models.Employee;
import com.employee.service.AddressService;
import com.employee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	
	
	@Autowired
	AddressService aService;
	
	@GetMapping("/hello")
	public ResponseEntity<String> hello(){
		
		return new ResponseEntity<String>("Hello World",HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/api/employees")
	public ResponseEntity<List<Employee>> employeesList(){
		
		List<Employee> list = empService.getAllEmployees();
		if(list!=null) {
			return new ResponseEntity<List<Employee>>(list,HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<List<Employee>>(list,HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/api/employees")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp){
		
		Employee savedEmp = empService.saveNewEmployee(emp);
		if(savedEmp!=null) {
			return new ResponseEntity<Employee>(savedEmp,HttpStatus.ACCEPTED);
		}
		throw new EmployeeNotFound("Employees Not Found....");
	}
	
	
	@GetMapping("/api/employees/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("id") Integer id){
		
		Employee savedEmp = empService.getByEmployeeId(id);
		if(savedEmp!=null) {
			return new ResponseEntity<Employee>(savedEmp,HttpStatus.ACCEPTED);
		}
		throw new EmployeeNotFound("Employee Not Found....");
	}
	
	@PutMapping("/api/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Integer id, @RequestBody Employee emp){
		
		Employee savedEmp = empService.updateEmployee(id,emp);
		if(savedEmp!=null) {
			return new ResponseEntity<Employee>(savedEmp,HttpStatus.ACCEPTED);
		}
		throw new EmployeeNotFound("Employee Not Found....");
	}
	
	@DeleteMapping("/api/employees/{id}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable("id") Integer id){
		
		Employee savedEmp = empService.removeEmployee(id);
		if(savedEmp!=null) {
			return new ResponseEntity<Employee>(savedEmp,HttpStatus.ACCEPTED);
		}
		throw new EmployeeNotFound("Employee Not Found....");
	}
	
	@GetMapping("/employees/{empId}/address")
	public ResponseEntity<List<Address>> getEmployeeAddresses(@PathVariable("empId") Integer id){
		
		List<Address> addresses = aService.employeeAddressList(id);
		if(addresses!=null) {
			return new ResponseEntity<List<Address>>(addresses,HttpStatus.ACCEPTED);
		}
		throw new EmployeeNotFound("Addresses Not Found....");
	}
	
	
	
	@GetMapping("/employees/{empId}/address/{id}")
	public ResponseEntity<Address> getEmployeeAddressById(@PathVariable("empId") Integer empId
																,@PathVariable("id") Integer id){
		
		Address address = aService.employeeAddress(empId, id);
		if(address!=null) {
			return new ResponseEntity<Address>(address,HttpStatus.ACCEPTED);
		}
		throw new EmployeeNotFound("Addresses Not Found....");
	}
	
	
	@PostMapping("/employees/{empId}/address")
	public ResponseEntity<Address> addEmployeeAddress(@PathVariable("empId") Integer empId
														,@RequestBody Address ads){

		Address address = aService.addAddress(empId, ads);
		if(address!=null) {
			return new ResponseEntity<Address>(address,HttpStatus.ACCEPTED);
		}
		throw new EmployeeNotFound("Address Not Found....");
	}
	
	
	@PutMapping("/employees/{empId}/address/{id}")
	public ResponseEntity<Address> updateEmployeeAddress(@PathVariable("empId") Integer empId
														,@PathVariable("id") Integer id
														,@RequestBody Address ads){

		Address address = aService.updateAddress(empId, id, ads);
		if(address!=null) {
			return new ResponseEntity<Address>(address,HttpStatus.ACCEPTED);
		}
		throw new EmployeeNotFound("Addresses Not Found....");
	}
	
	
	@DeleteMapping("/employees/{empId}/address/{id}")
	public ResponseEntity<Address> deleteEmployeeAddress(@PathVariable("empId") Integer empId
														,@PathVariable("id") Integer id){

			Address address = aService.removeAddress(empId, id);
			if(address!=null) {
				return new ResponseEntity<Address>(address,HttpStatus.ACCEPTED);
			}
			throw new EmployeeNotFound("Addresses Not Found....");
}
	
	
}
