package com.book.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.book.entity.Book;

@Service
public class BookService {

	List<Book> book = new ArrayList<>();
	
	public BookService() {
		book.add(new Book(1,"Java","Ratan",8000));
		book.add(new Book(2,"SQL","Arjun",3500));
		book.add(new Book(3,"MangoDB","Nrupul",2500));
		book.add(new Book(4,"JavaScript","Ankush",4000));
	}
	
	public List<Book> getBooks(){
		
		return book;
	}
	
	
	public Book getBookById(int i) {
		
		Book b = new Book();
		
		for(int j=0;j<book.size();j++) {
			
			Book s = book.get(j);
			if(s.getBook_id()==i) {
				b.setBook_id(s.getBook_id());
				b.setAuthor(s.getAuthor());
				b.setName(s.getName());
				b.setPrice(s.getPrice());
				break;
			}	
		}
		
		return b;	
	}
	
	
	public boolean addBook(Book b) {
		
		book.add(b);
		
		return true;
	}
	
	
	public boolean removeBook(int i) {
		
		int index = 0;
		while(index<book.size()) {
			Book s = book.get(index);
			
			if(s.getBook_id()==i) {
				book.remove(index);
				return true;
			}
			
			index++;
		}
		
		return false;
	}
	
	
	
	
}
