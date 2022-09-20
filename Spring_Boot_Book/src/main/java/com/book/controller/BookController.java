package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.entity.Book;
import com.book.exception.BookNotFound;

@RestController
public class BookController {

	@Autowired
	BookService bs;
	
	@GetMapping("/books")
	public List<Book> getBooks(){
		
		List<Book> books = bs.getBooks();
		return books;
		
	}
	
	
	@GetMapping("/book/{id}")
	public Book getById(@PathVariable("id") int i) {
		
		Book b = bs.getBookById(i);
		if(b==null) {
			throw new BookNotFound("Book Not Found");
		}
		return b;
	}
	
	
	@PostMapping(value="/book",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addBook(@RequestBody Book book) {
		
		if(bs.addBook(book)) {
			return "Book Added Sucessfully";
		}
		throw new BookNotFound();
	}
	
	
	
	
	@DeleteMapping("/book/{id}")
	public String deleteBook(@PathVariable("id") int i) {
		
		if(bs.removeBook(i)) {
			return "Book Deleted Sucessfully";
		}
		
		throw new BookNotFound("Book Not Found");
	}
	
	
}
