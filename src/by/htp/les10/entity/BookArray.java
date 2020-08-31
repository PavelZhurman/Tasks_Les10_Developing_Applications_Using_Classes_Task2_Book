package by.htp.les10.entity;

import java.util.ArrayList;
import java.util.List;

public class BookArray {

	private List<Book> bookArray;

	public BookArray() {
		bookArray = new ArrayList<Book>();
	}

	public void addBook(Book book) {
		bookArray.add(book);
	}

	public List<Book> getBookList() {
		return bookArray;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookArray == null) ? 0 : bookArray.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookArray other = (BookArray) obj;
		if (bookArray == null) {
			if (other.bookArray != null)
				return false;
		} else if (!bookArray.equals(other.bookArray))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BookArray [bookArray=" + bookArray + "]";
	}

}
