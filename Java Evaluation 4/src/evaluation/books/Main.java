package evaluation.books;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Library library = new Library();
		
		System.out.println("1. Add Book");
		System.out.println("2.Display all book");
		System.out.println("3.Search Book by author");
		System.out.println("4.Count number of books - by book name");
		System.out.println("5.Exit");
		
		
		Boolean search = true;
		while(search) {
			System.out.println("Enter your choosen number");
			int number = sc.nextInt();
			
			switch (number) {
			case 1:
				Book book = new Book();
					System.out.println("Enter the isbn no:");
					book.isbn = sc.nextInt();
					System.out.println("Enter the book name:");
					book.bookName = sc.next();
					System.out.println("Enter the author name:");
					book.author = sc.next();
				library.addBook(book);
				System.out.println("Book added Scuessfully");
				break;
			case 2:
				System.out.println(library.viewAllBooks().toString());
				break;
			case 3:
				System.out.println("Enter Author Name");
				System.out.println(library.viewBooksByAuthor(sc.next()).toString());
				break;
			case 4:
				System.out.println("Enter Book Name");
				System.out.println(library.countNoOfBook(sc.next()));
				break;
			case 5:
				search = false;
				break;
			default:
				System.out.println("Invalid Number");
				break;
			}
		}
		sc.close();
	}
	

}
