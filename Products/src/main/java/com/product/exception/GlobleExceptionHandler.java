package com.product.exception;



import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobleExceptionHandler {

	
	@ExceptionHandler(ProductException.class)
	public ResponseEntity<ErrorDetails> productExceptionhandler(ProductException pr,WebRequest wr){
		
		
		ErrorDetails er = new ErrorDetails();
		er.setLdt(LocalDateTime.now());
		er.setMessage(pr.getMessage());
		er.setDetails(wr.getDescription(false));
		
		
		return new ResponseEntity<ErrorDetails>(er,HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> productExceptionhandler2(Exception e,WebRequest wr){
		
		
		ErrorDetails er = new ErrorDetails();
		er.setLdt(LocalDateTime.now());
		er.setMessage(e.getMessage());
		er.setDetails(wr.getDescription(false));
		
		
		return new ResponseEntity<ErrorDetails>(er,HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<ErrorDetails> productExceptionhandler3(NoHandlerFoundException no,WebRequest wr){
		
		
		ErrorDetails er = new ErrorDetails();
		er.setLdt(LocalDateTime.now());
		er.setMessage(no.getMessage());
		er.setDetails(wr.getDescription(false));
		
		
		return new ResponseEntity<ErrorDetails>(er,HttpStatus.BAD_REQUEST);
		
	}
	
	
	
	
}
