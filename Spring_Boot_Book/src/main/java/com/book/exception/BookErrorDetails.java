package com.book.exception;

import java.time.LocalDateTime;

public class BookErrorDetails {

	private LocalDateTime ldt;
	private String message;
	private String details;
	
	
	public BookErrorDetails(LocalDateTime ldt, String message, String details) {
		super();
		this.ldt = ldt;
		this.message = message;
		this.details = details;
	}


	public BookErrorDetails() {
		super();
	}


	public LocalDateTime getLdt() {
		return ldt;
	}


	public void setLdt(LocalDateTime ldt) {
		this.ldt = ldt;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getDetails() {
		return details;
	}


	public void setDetails(String details) {
		this.details = details;
	}
	
	
	
	
}
