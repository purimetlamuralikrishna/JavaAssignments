package com.book.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class MainExceptionHandler {

	
	@ExceptionHandler(BookNotFound.class)
	public ResponseEntity<BookErrorDetails> bookNotFound(BookNotFound bk,WebRequest wr){
		
		BookErrorDetails ber = new BookErrorDetails(LocalDateTime.now(),bk.getMessage(), wr.getDescription(false));
		return new ResponseEntity<BookErrorDetails>(ber,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<BookErrorDetails> bookNotFound2(Exception bk,WebRequest wr){
		
		BookErrorDetails ber = new BookErrorDetails(LocalDateTime.now(),bk.getMessage(), wr.getDescription(false));
		return new ResponseEntity<BookErrorDetails>(ber,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<BookErrorDetails> bookNotFound3(NoHandlerFoundException bk,WebRequest wr){
		
		BookErrorDetails ber = new BookErrorDetails(LocalDateTime.now(),bk.getMessage(), wr.getDescription(false));
		return new ResponseEntity<BookErrorDetails>(ber,HttpStatus.BAD_REQUEST);
	}
}
