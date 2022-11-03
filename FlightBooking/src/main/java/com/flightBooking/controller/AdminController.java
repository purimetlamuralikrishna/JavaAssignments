package com.flightBooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flightBooking.entities.Airline;
import com.flightBooking.entities.Flight;
import com.flightBooking.entities.AdminLoginDao;
import com.flightBooking.entities.LoginDetails;
import com.flightBooking.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	AdminService adService;

		
	@PostMapping("/admin/login")
	public ResponseEntity<AdminLoginDao> adminLogin(@RequestBody LoginDetails login) {
		
		return new ResponseEntity<AdminLoginDao>(adService.adminLogin(login),HttpStatus.ACCEPTED);
	}
	
	
	@GetMapping("/admin/logout")
	public ResponseEntity<String> adminLogin(@RequestParam String key) {
		
		return new ResponseEntity<String>(adService.adminLogout(key),HttpStatus.ACCEPTED);
	}
	
	
	
	@PostMapping("/airline/register")
	public ResponseEntity<Airline> airlineRegister(@RequestBody Airline airline,@RequestParam String key) {
		
		return new ResponseEntity<Airline>(adService.addAirline(airline,key),HttpStatus.ACCEPTED);
	}
	
	
	
	@PostMapping("/airline/inventory/add")
	public ResponseEntity<Flight> addInventory(@RequestBody Flight flightDetails,
														@RequestParam String key) {
		
		return new ResponseEntity<Flight>(adService.addInventory(flightDetails,key),HttpStatus.ACCEPTED);
		
	}
	
}
