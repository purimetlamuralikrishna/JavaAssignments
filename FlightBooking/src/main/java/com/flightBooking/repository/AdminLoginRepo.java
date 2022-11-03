package com.flightBooking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightBooking.entities.AdminLoginDao;

@Repository
public interface AdminLoginRepo extends JpaRepository<AdminLoginDao,Integer>{
	
	public Optional<AdminLoginDao> findByUserKey(String userKey);
	
	public Optional<AdminLoginDao> findByEmailId(String emailId);
	
}
