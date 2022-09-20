package com.library.demo;

import com.library.entites.Book;
import com.library.entites.Book_Genre;
import com.library.exceptions.BookNotFound;
import com.library.librarydao.LibraryDaoImpl;

public class Demo {

	public static void main(String[] args) {
		
		LibraryDaoImpl lib = new LibraryDaoImpl();
		
		Book book = new Book();
		book.setBook_id(1);
		book.setBook_name("Java");
		book.setAuthor_name("Murali");
		book.setPublished_date("02/05/1995");
		
		lib.addBook(book);
		
		
		Book_Genre bg = new Book_Genre();
		
		bg.setGenre_id(10);
		bg.setGenre_name("Masai");
		bg.getBookList().add(book);
		lib.addGenre(bg);
		
//		try {
//			lib.updateAuthorName("Java", "Sai");
//		} catch (BookNotFound e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
	}

}
