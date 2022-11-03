package com.flightBooking.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.flightBooking.entities.Flight;

@Repository
public interface FlightsRepo extends JpaRepository<Flight, Integer>{

	@Query("SELECT f from Flight f where f.fromCity = :fc AND f.toCity = :tc AND f.startOn >= :d")
	public List<Flight> findFlights(@Param("fc") String fcity,@Param("tc") String tcity,@Param("d") LocalDateTime date);

//	public List<Flight> findByFrom(String fromcity,String toCity);

//	public List<Flight> findByFromCityAndToCityList(String fromCity,String toCity);
}
