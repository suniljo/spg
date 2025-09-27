package com.spg.java.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class LibraryApp {

	public static void main(String[] args) {
		List<Book> library = new ArrayList<Book>();
		
		Scanner sc = new Scanner(System.in);
		
		String req = null;
		
		do {
			System.out.print("enter book id: ");
			int bid = sc.nextInt();
			sc.nextLine();
			
			System.out.print("enter book title: ");
			String title = sc.nextLine();
			
			System.out.print("enter book author: ");
			String author = sc.nextLine();
			
			Book book = new Book(bid, title, author);
			library.add(book);			
			System.out.println("Book with title: \""+title+"\" added to library \n");
			
			System.out.print("do you want to add more books to library? [Y/N]: ");			
			req = sc.next();
		}while(req.equalsIgnoreCase("y"));
		
		System.out.println();		
		
		printBookDetails(library);		
	}

	private static void printBookDetails(List<Book> library) {
		System.out.println("================= S&P GLOBAL | LIBRARY =================");
		Iterator<Book> booksIt = library.iterator();
		while(booksIt.hasNext()) {
			Book bk = booksIt.next();
			System.out.println(bk);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
