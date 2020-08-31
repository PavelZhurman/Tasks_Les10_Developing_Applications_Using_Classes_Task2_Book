package by.htp.les10.main;

import java.util.ArrayList;
import java.util.List;

import by.htp.les10.entity.Book;
import by.htp.les10.entity.BookArray;
import by.htp.les10.logic.BookLogic;
import by.htp.les10.view.BookViewer;

public class Main {

	public static void main(String[] args) {
		Book b1 = new Book("Abcd", "Someone", "Rosman", 1999, 60, 10, "Hard");
		Book b2 = new Book("Head First Java, Learn Java", "Katie Sierra, Bert Bates", "Eksmo", 2012, 708, 30, "Soft");
		Book b3 = new Book("Java. A Beginner's Guide", "Herbert Schildt", "Williams", 2019, 816, 90, "Soft");
		Book b4 = new Book("Абвг", "Someone", "Eksmo", 2001, 50, 12, "Soft");

		BookArray bookArray = new BookArray();

		bookArray.addBook(b1);
		bookArray.addBook(b2);
		bookArray.addBook(b3);
		bookArray.addBook(b4);

		BookViewer bookViewer = new BookViewer();

		List<Book> books = new ArrayList<Book>();

		books = bookArray.getBookList();

		bookViewer.printAll(books);

		BookLogic bookLogic = new BookLogic();

		List<Book> sorted = new ArrayList<Book>();

		sorted = bookLogic.findAuthorsBooks(books, "Katie Sierra, Bert Bates");
		bookViewer.printAll(sorted);
		
		sorted = bookLogic.findPublishmentHouseBooks(books, "Eksmo");
		bookViewer.printAll(sorted);
		
		sorted = bookLogic.findBooksReleasedAfterAGivenYear(books, 2001);
		bookViewer.printAll(sorted);

	}

}
