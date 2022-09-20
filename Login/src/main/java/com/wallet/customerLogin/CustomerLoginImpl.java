package com.wallet.customerLogin;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wallet.repositery.CustomerDao;
import com.wallet.repositery.CustomerSessionDao;
import com.wallet.userLogin.Customer;
import com.wallet.userLogin.CustomerLoginDto;
import com.wallet.userLogin.CustomerSession;

import net.bytebuddy.utility.RandomString;

@Service
public class CustomerLoginImpl implements CustomerLoginService {
	
	
	@Autowired
	CustomerSessionDao cSession;
	
	@Autowired
	CustomerDao cDao;

	@Override
	public CustomerSession login(CustomerLoginDto customerDto) {
		
		Optional<Customer> loginCustomer = cDao.findByMobileNumber(customerDto.getMobileNumber());
		Optional<CustomerSession> existsCustomer = cSession.findByCustomerId(loginCustomer.get().getCustomerId());
		
		if(existsCustomer.isPresent()) {
			return null;
		}
		CustomerSession cs = new CustomerSession();
		cs.setCustomerId(loginCustomer.get().getCustomerId());
		cs.setUuid(RandomString.make(5));
		cs.setDateAndTime(LocalDateTime.now());
		cSession.save(cs);
		
		return cs;
	}

	@Override
	public Customer logout(String uuid) {
		
		Optional<CustomerSession> existsCustomer = cSession.findByUuid(uuid);
		
		if(!existsCustomer.isPresent()) {
			return null;
		}
		
		cSession.delete(existsCustomer.get());
		
		Optional<Customer> c =  cDao.findById(existsCustomer.get().getCustomerId());
		
		return c.get();
	}

	@Override
	public boolean checkOnline(Integer id) {
		
		boolean result = false;
		
		Optional<CustomerSession> cs = cSession.findByCustomerId(id);
		
		if(cs.isPresent()) {
			result = true;
		}
		
		return result;
	}
	
	

}
