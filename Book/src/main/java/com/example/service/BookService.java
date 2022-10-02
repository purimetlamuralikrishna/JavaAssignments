package com.example.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dao.BookDao;
import com.example.entitys.Book;

@Component
public class BookService {

	@Autowired
	BookDao bDao;
	
	public ArrayList<Book> getBooksList(){
		
		ArrayList<Book> list = (ArrayList<Book>) bDao.findAll();
		
		return list;	
	}
	
	
	public Book saveBook(Book book) {
		
		bDao.save(book);
		return book;
	}
	
	public Book getBook(Integer id) {
		
		Optional<Book> opt = bDao.findById(id);
		
		return opt.get();
	}
	
	
	public String removeBook(Integer id) {
		
		bDao.deleteById(id);
		
		return "Done";
	}
	
	
	public Book updateBook(Integer id,Book book) {
		
		return saveBook(book);
	}
}
