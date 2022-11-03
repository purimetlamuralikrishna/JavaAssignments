package com.flightBooking.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserLoginDao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String emailId;
	private LocalDateTime loginTime;
	private String userKey;
	
	
}
