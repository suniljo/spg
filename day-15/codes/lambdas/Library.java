package com.spg.java.lambdas;

import java.util.Iterator;
import java.util.List;

public class Library {

	public static void main(String[] args) throws InterruptedException {
		BooksDAO dao = new BooksDAO();
		List<Book> booksList = dao.getAllBooks();
		System.out.println(booksList);
		System.out.println("=".repeat(100) + "\n");
		
		BooksService libraryService = new BooksService();
		
		List<Book> books = libraryService.getBooksInOrderOfBookId();

		Iterator<Book> it = books.iterator();
		while(it.hasNext()) {
			Book bk = it.next();
			System.out.println(bk);
			Thread.sleep(1000);
		}
	}
}