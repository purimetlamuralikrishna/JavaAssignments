package com.flightBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightBooking.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User,String> {

}
