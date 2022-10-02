package com.example.entitys;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

	@Id
	int bookId;
	String name;
	String author;
	String publication;
	String category;
	int pages;
	int price;
	
	
}
