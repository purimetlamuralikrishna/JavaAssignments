package com.flightBooking.component;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.flightBooking.entities.PredefinedAdminDetails;
import com.flightBooking.repository.PreDefinedRepo;

@Component
public class PreDefined {

	@Autowired
	PreDefinedRepo pre;
	
	@Bean
	public CommandLineRunner adminDetails() {
		
		return n -> {
			List<PredefinedAdminDetails> list = new ArrayList<>();
			
			list.add(new PredefinedAdminDetails("venky@gmail.com","123456789"));
			pre.saveAll(list);
			
			
		};
		
	}
}
