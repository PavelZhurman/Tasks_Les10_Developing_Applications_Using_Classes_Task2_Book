package by.htp.les10.view;

import java.util.List;

import by.htp.les10.entity.Book;

public class BookViewer {

	public void printAll(List<Book> bookArray) {
		for (int i = 0; i < bookArray.size(); i++) {

			Book b1 = bookArray.get(i);
			System.out.println("id= " + b1.getId() + ", Title= " + b1.getTitle() + ", Authors=" + b1.getAuthors()
					+ ", PublishingHouse=" + b1.getPublishingHouse() + ", YearOfPublishing=" + b1.getYearOfPublishing()
					+ ", NumberOfPages=" + b1.getNumberOfPages() + ", BindingType=" + b1.getBindingType() + ", price="
					+ b1.getPrice());
		}
		System.out.println();

	}

}
