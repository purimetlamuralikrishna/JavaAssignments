package com.flightBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightBooking.entities.PredefinedAdminDetails;

public interface PreDefinedRepo extends JpaRepository<PredefinedAdminDetails,String> {
	
	
}
