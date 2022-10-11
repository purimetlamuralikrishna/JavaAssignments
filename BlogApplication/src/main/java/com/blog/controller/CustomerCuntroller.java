package com.blog.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.blog.entites.Login;
import com.blog.entites.LoginDetails;
import com.blog.entites.Register;
import com.blog.models.RegModel;
import com.blog.service.LoginService;
import com.blog.service.RegisterService;

@RestController
public class CustomerCuntroller {
	
	@Autowired
	RegisterService rService;
	
	@Autowired
	LoginService lService;
	
	
	@GetMapping("/hello")
	public ResponseEntity<String> hello(){
		
		return new ResponseEntity<String>("Hello World",HttpStatus.ACCEPTED);
		
	}
	
	@PostMapping("/Register")
	public ResponseEntity<RegModel> register(@Valid @RequestBody Register reg){
		
		RegModel regModel = rService.register(reg);
		
		return new ResponseEntity<RegModel>(regModel,HttpStatus.ACCEPTED);
		
	}
	
	@PostMapping("/Login")
	public ResponseEntity<LoginDetails> login(@RequestBody Login log){
		
		LoginDetails logDetails = lService.login(log); 
		
		if(logDetails!=null) {
			return new ResponseEntity<LoginDetails>(logDetails,HttpStatus.ACCEPTED);
		}
		
		return new ResponseEntity<LoginDetails>(HttpStatus.NO_CONTENT);
		
	}
	
	
	
	
	

}
