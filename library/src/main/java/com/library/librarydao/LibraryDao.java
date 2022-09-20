package com.library.librarydao;

import java.util.List;

import com.library.entites.Book;
import com.library.entites.Book_Genre;
import com.library.exceptions.BookNotFound;
import com.library.exceptions.GenreNotFound;

public interface LibraryDao {

	boolean addBook(Book book);
	boolean addGenre(Book_Genre bookGenre);
	List<Book> getBooksByGenre(String genre) throws GenreNotFound;
	String updateAuthorName(String bookName, String authorName) throws BookNotFound;
	void removeGenre(String genre) throws GenreNotFound;
	void removeBook(String bookName) throws BookNotFound;
}
