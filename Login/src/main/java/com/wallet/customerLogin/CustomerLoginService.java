package com.wallet.customerLogin;


import org.springframework.stereotype.Service;

import com.wallet.userLogin.Customer;
import com.wallet.userLogin.CustomerLoginDto;
import com.wallet.userLogin.CustomerSession;

@Service
public interface CustomerLoginService {

	public CustomerSession login(CustomerLoginDto customerDto);
	
	public Customer logout(String uuid);
	
	public boolean checkOnline(Integer id);
}
