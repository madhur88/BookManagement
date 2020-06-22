package com.spring.model;

public class Book {
	
	
	private long book_ID;
	private String book_Author;
	private String book_Name;
	
	public Book(long book_ID, String book_Author, String book_Name) {
		super();
		this.book_ID = book_ID;
		this.book_Author = book_Author;
		this.book_Name = book_Name;
	}
	
	public long getBook_ID() {
		return book_ID;
	}
	public void setBook_ID(long book_ID) {
		this.book_ID = book_ID;
	}
	public String getBook_Author() {
		return book_Author;
	}
	public void setBook_Author(String book_Author) {
		this.book_Author = book_Author;
	}
	public String getBook_Name() {
		return book_Name;
	}
	public void setBook_Name(String book_Name) {
		this.book_Name = book_Name;
	}
	
	

}
