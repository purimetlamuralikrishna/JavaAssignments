package com.wallet.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wallet.customerLogin.CustomerLoginService;
import com.wallet.customerLogin.CustomerService;
import com.wallet.userLogin.Customer;
import com.wallet.userLogin.CustomerLoginDto;
import com.wallet.userLogin.CustomerSession;

@RestController
public class CustomerController {

	@Autowired
	CustomerService cService;
	
	@Autowired
	CustomerLoginService clogin; 
	
	
	@PostMapping("/create")
	public Customer createcustomer(@RequestBody Customer customer) {
		
		return cService.createAccount(customer);
		
	}
	
	@PostMapping("/login")
	public CustomerSession login(@RequestBody CustomerLoginDto csLogin) {
		
		return clogin.login(csLogin);
	}
	
	@PostMapping("/logout")
	public Customer logout(@PathParam("key") String key) {
		
		return clogin.logout(key);
	}
	
	@PostMapping("/online")
	public boolean checkOnline(@PathParam("id") Integer id) {
		return clogin.checkOnline(id);
	}
}
