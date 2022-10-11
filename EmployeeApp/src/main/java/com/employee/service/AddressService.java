package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.models.Address;
import com.employee.models.Employee;
import com.employee.repositery.AddressRepo;

@Service
public class AddressService {

	@Autowired
	EmployeeService empService;
	
	@Autowired
	AddressRepo aRepo;
	
	public List<Address> employeeAddressList(Integer id){
		
		Employee emp = empService.getByEmployeeId(id);
		
		if(emp!=null&&emp.getAddresses()!=null) {
			
			return emp.getAddresses();
		}
		return null;
	}
	
	
	public Address employeeAddress(Integer empId,Integer aId) {
		
		List<Address> list = employeeAddressList(empId);
		if(list!=null) {
			
			for(Address ads:list) {
				if(ads.getAddressId()==aId) {
					return ads;
				}
			}			
		}
		return null;
		
	}
	
	public Address addAddress(Integer empId,Address ads) {
		
		Employee emp = empService.getByEmployeeId(empId);
		if(emp!=null) {	
			emp.getAddresses().add(ads);
			empService.saveNewEmployee(emp);
			return ads;
		}
		
		return null;
	}
	
	public Address updateAddress(Integer empId,Integer aId,Address ads) {
		
		Address ads1 = employeeAddress(empId, aId);
		
		if(ads1!=null) {
			ads1.setCity(ads.getCity());
			ads1.setCountry(ads.getCountry());
			ads1.setState(ads.getState());
			ads1.setStreet(ads.getStreet());
			aRepo.save(ads1);
			return ads1;
		}
		return null;
	}
	
	public Address removeAddress(Integer empId,Integer aId) {
		
		Address ads = employeeAddress(empId, aId);
		if(ads!=null) {
			aRepo.deleteById(aId);
			return ads;
		}
		
		return null;
	}
	
}
