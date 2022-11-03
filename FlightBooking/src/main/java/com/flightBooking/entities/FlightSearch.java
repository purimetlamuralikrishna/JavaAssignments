package com.flightBooking.entities;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightSearch {

	private String fromCity;
	private String toCity;
	private LocalDateTime onDate;
	
}
