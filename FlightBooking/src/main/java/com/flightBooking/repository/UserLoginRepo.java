package com.flightBooking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightBooking.entities.UserLoginDao;

@Repository
public interface UserLoginRepo extends JpaRepository<UserLoginDao, Integer> {

	public Optional<UserLoginDao> findByEmailId(String email);
	
	public Optional<UserLoginDao> findByUserKey(String key);
	
}
