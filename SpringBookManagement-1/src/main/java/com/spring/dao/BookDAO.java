package com.spring.dao;

import java.util.ArrayList;
import java.util.List;

import com.spring.model.Book;

public class BookDAO {
	private List<Book> testBooks = new ArrayList<Book>();
	
	public List<Book> getBooks(){
		return new ArrayList<Book>(testBooks);
	}
	
	public void addBook(Book book) {
		testBooks.add(book);
	}
}
