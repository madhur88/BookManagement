package com.spring.service;
import java.util.List;

import com.spring.dao.BookDAO;
import com.spring.model.Book;

public class BookService {
	BookDAO bookDAO;
	
	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}
	
	public List<Book> getBooks(){
		return bookDAO.getBooks();
	}
	
	public void addBook(Book book){
		bookDAO.addBook(book);
	}
	

}
