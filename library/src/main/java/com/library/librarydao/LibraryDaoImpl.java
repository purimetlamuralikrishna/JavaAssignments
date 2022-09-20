package com.library.librarydao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.library.entites.Book;
import com.library.entites.Book_Genre;
import com.library.exceptions.BookNotFound;
import com.library.exceptions.GenreNotFound;
import com.library.utill.Emanager;

public class LibraryDaoImpl implements LibraryDao {

	@Override
	public boolean addBook(Book book) {
		
		boolean result = false;
		
		EntityManager em=Emanager.createEmanager();
		
		Book b = em.find(Book.class,book.getBook_id());
		
		if(b == null) {
			em.getTransaction().begin();
			em.persist(book);
			result = true;
			em.getTransaction().commit();
			em.close();
		}
		
		
		return result;
	}

	@Override
	public boolean addGenre(Book_Genre bookGenre) {
		
boolean result = false;
		
		EntityManager em=Emanager.createEmanager();
		
		Book_Genre b = em.find(Book_Genre.class,bookGenre.getGenre_id());
		
		if(b == null) {
			em.getTransaction().begin();
			em.persist(bookGenre);
			result = true;
			em.getTransaction().commit();
			em.close();
		}
		
		
		return result;
		
	}

	@Override
	public List<Book> getBooksByGenre(String genre) throws GenreNotFound {
		
		List<Book> list = new ArrayList<>();
		
		String str = "";
		
		return list;
	}

	@Override
	public String updateAuthorName(String bookName, String authorName) throws BookNotFound {
		String result = "Not Updated";
		EntityManager em=Emanager.createEmanager();
		
		String str = "update book set author_name = ?1 where book_name = ?2";
		
		Query q = em.createQuery(str);
		q.setParameter(1,authorName);
		q.setParameter(2,bookName);
			
		
		
			em.getTransaction().begin();
			
			int x = q.executeUpdate();
			
			em.getTransaction().commit();
			
			em.close();
			
			if(x!=0) {
				result = "Updated Scussfully";
			}
			else {
				throw  new BookNotFound();
			}
		
		
		return result;
	}

	@Override
	public void removeGenre(String genre) throws GenreNotFound {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeBook(String bookName) throws BookNotFound {
		// TODO Auto-generated method stub
		
	}

}
