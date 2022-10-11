package com.blog.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.entites.Login;
import com.blog.entites.LoginDetails;
import com.blog.entites.Register;
import com.blog.repositery.LoginRepositery;
import com.blog.repositery.RegisterRepo;

import net.bytebuddy.utility.RandomString;

@Service
public class LoginService {

	@Autowired
	LoginRepositery lRepo;
	
	@Autowired
	RegisterRepo rRepo;
	
	public LoginDetails login(Login login) {
		
		Optional<Register> reg = rRepo.findByEmail(login.getEmail());
		
		if(reg!=null) {
			
			Optional<LoginDetails> log = lRepo.findById(reg.get().getId());
			
			if(log==null) {
				
				LoginDetails logDetails = new LoginDetails();
				logDetails.setCid(reg.get().getId());
				logDetails.setLocalDateTime(LocalDateTime.now());
				logDetails.setUuid(RandomString.make(6));
				
				lRepo.save(logDetails);
				
				return logDetails;
			}	
		}
		
		return null;
	}
	
}
