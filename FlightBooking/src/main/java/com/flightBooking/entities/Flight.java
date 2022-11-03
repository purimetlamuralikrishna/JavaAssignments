package com.flightBooking.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Flight {

	@Id
	private Integer id;
	private String flightNumber;
	private String fromCity;
	private String toCity;
	private LocalDateTime startOn;
	private LocalDateTime endOn;
	private String flightModel;
	private Integer bussinessSeats;
	private Integer nonBussinessSeats;
	private Integer bussinessClassTicketCost;
	private Integer nonBussinessClassTicketCost;
	private String meal;
	private String airline;
	private Boolean blocked;
}
