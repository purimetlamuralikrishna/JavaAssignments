package evaluation.books;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	
	List<Book> bookList = new ArrayList<>();
	
	
	void addBook(Book book) {
		bookList.add(book);
	}
	
	
	boolean isEmpty() {
		
		if(bookList.isEmpty()) {
			return true;
		}
		return false;
	}
	
	
	List<Book> viewAllBooks(){	
		return bookList;
	}
	
	
	List<Book> viewBooksByAuthor(String author ){
		
		List<Book> authorlist = new ArrayList<>();
		for(Book list:bookList) {
			
			if(list.author.equals(author)) {
				authorlist.add(list);
			}	
		}
		if(authorlist.isEmpty()) {
			System.out.println("The list is empty");
		}
		return authorlist;
	}
	
	
	int countNoOfBook(String bookName) {
		
		int count = 0;
		for(Book book:bookList) {
			if(book.bookName.equals(bookName)) {
				count++;
			}	
		}
		System.out.println("Number of books with this name "+ bookName+" is"+ count);
		return count;
		
	}
}
