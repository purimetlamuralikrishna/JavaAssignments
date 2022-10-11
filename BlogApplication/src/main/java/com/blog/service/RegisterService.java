package com.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.entites.Register;
import com.blog.models.RegModel;
import com.blog.repositery.RegisterRepo;

@Service
public class RegisterService {

	@Autowired
	RegisterRepo rRepo;
	
	
	public RegModel register(Register reg) {
		
		rRepo.save(reg);
		return new RegModel(reg.getEmail());
		
	}
}
