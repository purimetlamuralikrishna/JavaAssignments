package com.example.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entitys.Book;
import com.example.service.BookService;

@RestController
public class BookController {

	@Autowired
	BookService bService;
	
	
	@GetMapping("/bookservice/books")
	public ArrayList<Book> getBooks(){
		
		return bService.getBooksList();
		
	}
	
	@PostMapping("/bookservice/books")
	public Book saveBook(@RequestBody Book book) {
		return bService.saveBook(book);
	}
	
	
	@GetMapping("/bookservice/books/{id}")
	public Book bookById(@PathVariable("id") Integer id) {
		
		return bService.getBook(id);
		
	}
	
	@DeleteMapping("/bookservice/books/{id}")
	public String removeBookById(@PathVariable("id") Integer id) {
		
		return bService.removeBook(id);
		
	}
	
	@PutMapping("/bookservice/books/{id}")
	public Book updateBook(@PathVariable("id") Integer id,@RequestBody Book book) {
		
		return bService.updateBook(id, book);
		
	}
	
}
