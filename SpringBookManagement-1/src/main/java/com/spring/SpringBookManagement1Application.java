package com.spring;

import java.util.List;
import com.spring.dao.BookDAO;
import com.spring.model.Book;
import com.spring.service.BookService;

public class SpringBookManagement1Application {

	public static void main(String[] args) {
		BookDAO bookDAO = new BookDAO();
		BookService bookService = new BookService();
		bookService.setBookDAO(bookDAO);
		Book book1 = new Book(1, "Madhur", "Fundamentals of Java");
		Book book2 = new Book(2, "Madhur", "Fundamentals of Java 1");
		Book book3 = new Book(3, "Madhur", "Fundamentals of Java 2");
		Book book4 = new Book(4, "Madhur", "Fundamentals of Java 3");
		Book book5 = new Book(5, "Madhur", "Fundamentals of Java 4");

		bookService.addBook(book1);
		bookService.addBook(book2);
		bookService.addBook(book3);
		bookService.addBook(book4);
		bookService.addBook(book5);
		List<Book> Books = bookService.getBooks();
		for (Book Book : Books) {
			System.out.println(Book.getBook_Name());
			
		}
	}
}
