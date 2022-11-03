package com.flightBooking.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

	@Id
	private String emailId;
	private String password;
	private String userName;
	private String mobileNumber;
	
}
