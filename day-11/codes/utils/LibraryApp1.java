package com.spg.java.utils;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LibraryApp1 {

	public static void main(String[] args) {
		Set<Book> library = new TreeSet<Book>(new BookComparator());
		
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

	private static void printBookDetails(Set<Book> library) {
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

class BookComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		int bookIdDiff = o1.getBookId().compareTo(o2.getBookId());
		return bookIdDiff;
	}
	
}
