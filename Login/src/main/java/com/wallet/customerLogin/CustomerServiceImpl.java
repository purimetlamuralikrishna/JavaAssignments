package com.wallet.customerLogin;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wallet.repositery.CustomerDao;
import com.wallet.userLogin.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerDao cDao;

	@Override
	public Customer createAccount(Customer customer) {
		
		Optional<Customer> newcustomer = cDao.findByMobileNumber(customer.getMobileNumber());
		
		if(newcustomer.isPresent()) {
			return null;
		}
		 
		return cDao.save(customer);
	}

	
}
