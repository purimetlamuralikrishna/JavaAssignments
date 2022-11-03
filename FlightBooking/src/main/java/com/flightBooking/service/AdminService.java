package com.flightBooking.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightBooking.entities.Airline;
import com.flightBooking.entities.Flight;
import com.flightBooking.entities.AdminLoginDao;
import com.flightBooking.entities.LoginDetails;
import com.flightBooking.entities.PredefinedAdminDetails;
import com.flightBooking.repository.AdminLoginRepo;
import com.flightBooking.repository.AirlineRepo;
import com.flightBooking.repository.FlightsRepo;
import com.flightBooking.repository.PreDefinedRepo;

import net.bytebuddy.utility.RandomString;

@Service
public class AdminService {

	
	@Autowired
	PreDefinedRepo pre;
	
	@Autowired
	AirlineRepo airlineRepo;
	
	@Autowired
	AdminLoginRepo adminRepo;
	
	@Autowired
	FlightsRepo flightRepo;
	
	
	public boolean checkLogin(String key) {
		
		Optional<AdminLoginDao> opt = adminRepo.findByUserKey(key);
		if(opt.isEmpty()) {
			return false;
		}
		
		return true ;
	}
	
	public AdminLoginDao adminLogin(LoginDetails login) {
		
		Optional<PredefinedAdminDetails> admin =  pre.findById(login.getUserId());
		
		if(admin.isEmpty()) {
			return null ;
		}
		
		if(!admin.get().getPassword().equals(login.getPassword())) {
			return null;
		}
		
		Optional<AdminLoginDao> opt = adminRepo.findByEmailId(login.getUserId());
		
		if(opt.isPresent()) {
			return null; 
		}
		
		
		AdminLoginDao log = new AdminLoginDao();
		log.setEmailId(login.getUserId());
		log.setLoginTime(LocalDateTime.now());
		String str = RandomString.make(6);
		log.setUserKey(str);
		
		adminRepo.save(log);
		
		return log;
	}
	
	public String adminLogout(String key) {
		
		if(!checkLogin(key)) {
			return null;
		}
		
		Optional<AdminLoginDao> log =  adminRepo.findByUserKey(key);
		adminRepo.deleteById(log.get().getId());
		return "Loggout Sucessfully";
	}
	
	public Airline addAirline(Airline airline,String key) {
		
		
		if(!checkLogin(key)) {
			return null;
		}
		
		if(!airlineRepo.existsById(airline.getAirlineName())){
			airlineRepo.save(airline);
			return airline;
		}
		return null;
		
		
	}
	
	public Flight addInventory(Flight flight,String key) {
		
		if(!checkLogin(key)) {
			return null;
		}
		
		
		Optional<Airline>airline = airlineRepo.findById(flight.getAirline());
		
		if(airline.isEmpty()) {
			return null;
		}
		
		List<Flight>flightsList =  airline.get().getFlights();
		
		for(Flight fly:flightsList) {
			if(fly.getFlightNumber().equals(flight.getFlightNumber())) {
				return null;
			}
		}
		
		airline.get().getFlights().add(flight);
		airlineRepo.save(airline.get());
		
		return flight;
	}
	
	
}
