package com.flightBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flightBooking.entities.Flight;
import com.flightBooking.entities.FlightSearch;
import com.flightBooking.entities.LoginDetails;
import com.flightBooking.entities.User;
import com.flightBooking.entities.UserLoginDao;
import com.flightBooking.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/user/register")
	public ResponseEntity<User> userRegistration(@RequestBody User user) {
		
		return new ResponseEntity<User>(userService.userRegister(user),HttpStatus.ACCEPTED);
		
		
	}
	
	
	@PostMapping("/user/login")
	public ResponseEntity<UserLoginDao> userLogin(@RequestBody LoginDetails login){
		
		return new ResponseEntity<UserLoginDao>(userService.userLogin(login),HttpStatus.ACCEPTED);
	}
	
	
	
	@GetMapping("/user/logout")
	public ResponseEntity<String> userLogout(@RequestParam String key){
		
		return new ResponseEntity<String>(userService.userLogout(key),HttpStatus.ACCEPTED);
		
	}
	
	
	@PostMapping("/user/flights")
	public ResponseEntity<List<Flight>> getFlightsList(@RequestBody FlightSearch search ,@RequestParam String key){
		
		return new ResponseEntity<List<Flight>>(userService.flightList(search, key),HttpStatus.ACCEPTED);
		
	}
	
	
	
}
