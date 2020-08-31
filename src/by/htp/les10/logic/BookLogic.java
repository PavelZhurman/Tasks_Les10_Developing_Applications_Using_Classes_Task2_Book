package by.htp.les10.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.les10.entity.Book;

public class BookLogic {

	public List<Book> findAuthorsBooks(List<Book> books, String Authors) {
		List<Book> result = new ArrayList<Book>();
		for (int i = 0; i < books.size(); i++) {

			Book b1 = books.get(i);
			if (b1.getAuthors().equals(Authors)) {
				result.add(b1);
			}

		}
		return result;
	}

	public List<Book> findPublishmentHouseBooks(List<Book> books, String publishmentHouse) {
		List<Book> result = new ArrayList<Book>();

		for (int i = 0; i < books.size(); i++) {
			Book b1 = books.get(i);
			if (b1.getPublishingHouse().equals(publishmentHouse)) {
				result.add(b1);
			}
		}
		return result;
	}

	public List<Book> findBooksReleasedAfterAGivenYear(List<Book> books, int year) {
		List<Book> result = new ArrayList<Book>();

		for (int i = 0; i < books.size(); i++) {
			Book b1 = books.get(i);
			if (year <= b1.getYearOfPublishing()) {
				result.add(b1);
			}
		}
		return result;
	}
}
