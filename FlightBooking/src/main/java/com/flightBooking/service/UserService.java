package com.flightBooking.service;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightBooking.entities.AdminLoginDao;
import com.flightBooking.entities.Flight;
import com.flightBooking.entities.FlightSearch;
import com.flightBooking.entities.LoginDetails;
import com.flightBooking.entities.User;
import com.flightBooking.entities.UserLoginDao;
import com.flightBooking.repository.FlightsRepo;
import com.flightBooking.repository.UserLoginRepo;
import com.flightBooking.repository.UserRepo;

import net.bytebuddy.utility.RandomString;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;
	
	@Autowired
	UserLoginRepo loginRepo;
	
	@Autowired
	FlightsRepo flightRepo;
	
	public User userRegister(User user) {
		
		Optional<User> opt = userRepo.findById(user.getEmailId());
		
		if(opt.isPresent()) {
			return null;
		}
		
		userRepo.save(user);
		
		return user;
	}
	
	public UserLoginDao userLogin(LoginDetails userLog ) {
		
		Optional<User> opt = userRepo.findById(userLog.getUserId());
		
		if(!opt.isPresent()) {
			return null;
		}
		
		if(!opt.get().getPassword().equals(userLog.getPassword())) {
			return null;
		}
		
		Optional<UserLoginDao> user = loginRepo.findByEmailId(userLog.getUserId());
		
		if(user.isPresent()) {
			return null;
		}
		
		UserLoginDao newUser = new UserLoginDao();
		
		newUser.setEmailId(userLog.getUserId());
		newUser.setLoginTime(LocalDateTime.now());
		newUser.setUserKey(RandomString.make(7));
		
		loginRepo.save(newUser);
		
		return newUser;
	}
	
	
	public boolean checkLogin(String key) {
		
		Optional<UserLoginDao> opt = loginRepo.findByUserKey(key);
		if(opt.isEmpty()) {
			return false;
		}
		
		return true ;
	}
	
	
	public String userLogout(String key) {
		
		if(!checkLogin(key)) {
			return null;
		}
		
		Optional<UserLoginDao> log =  loginRepo.findByUserKey(key);
		loginRepo.deleteById(log.get().getId());
		return "Loggout Sucessfully";
	}
	
	
	public List<Flight> flightList(FlightSearch searchDetails,String key){
		
		if(!checkLogin(key)) {
			return null;
		}
		
		//List<Flight> flights =  flightRepo.findByFromCityAndToCityList(searchDetails.getFromCity(),searchDetails.getToCity());
		
		
		
		return flightRepo.findFlights(searchDetails.getFromCity(), searchDetails.getToCity(), searchDetails.getOnDate());
		
	}
	
	
	
	
	
	
}
