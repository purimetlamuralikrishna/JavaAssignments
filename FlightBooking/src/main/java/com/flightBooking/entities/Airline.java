package com.flightBooking.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Airline {

	@Id
	private String airlineName;
	private String code;
	private String logoUrl;
	private String number;
	private String city;
	private Boolean blocked = false;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Flight> flights = new ArrayList<>();
}
