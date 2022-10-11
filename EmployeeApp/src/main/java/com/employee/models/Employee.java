package com.employee.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Address> addresses;
	
}
