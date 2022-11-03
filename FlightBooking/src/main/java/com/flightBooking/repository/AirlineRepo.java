package com.flightBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightBooking.entities.Airline;

@Repository
public interface AirlineRepo extends JpaRepository<Airline,String> {

}
