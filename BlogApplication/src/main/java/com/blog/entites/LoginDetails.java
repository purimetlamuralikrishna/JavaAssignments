package com.blog.entites;

import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer log_Id;
	
	private Integer cid;
	
	private LocalDateTime localDateTime;
	
	private String uuid;
}
