package com.employee.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobleException {
	
	
	@ExceptionHandler(EmployeeNotFound.class)
	
	public ResponseEntity<ErrorDetails> myExpHandler(EmployeeNotFound ie, WebRequest wr)  {

		
		ErrorDetails err= new ErrorDetails();
		
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDescription(wr.getDescription(false));
		return new ResponseEntity<ErrorDetails>(err, HttpStatus.BAD_REQUEST );
	}
}