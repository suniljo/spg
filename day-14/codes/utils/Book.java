package com.spg.java.utils;

public class Book {
	private Integer bookId;
	private String bookTitle;
	private String bookAuthor;

	public Book() {
		super();		
	}

	public Book(Integer bookId, String bookTitle, String bookAuthor) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	@Override
	public String toString() {
		return String.format("Book [%-6d | %-30s | %-20s]", bookId, bookTitle, bookAuthor);
	}

}
