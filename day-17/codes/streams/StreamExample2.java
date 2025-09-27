package com.spg.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class StreamExample2 {

	public static void main(String[] args) {
		List<Book> books = new BooksDAO().getAllBooks();
		
		//search a book based on book ID
		int bid = 3658;
		
		Optional<Book> optBook = books.stream()
									  .filter(bk -> bk.getBookId()==bid)
									  .findFirst();
		if(optBook.isPresent()) {
			System.out.println(optBook.get());
		}else {
			System.out.println("no matching book found with Book ID: " + bid);
		}
		System.out.println();

		//another approach
		Book matchingBook = books.stream()
				  				 .filter(bk -> bk.getBookId()==bid)
				  				 .findFirst()
				  				 .orElse(null);
		System.out.println(matchingBook);

		//another approach
		Book matchingBook1 = books.stream()
				  						.filter(bk -> bk.getBookId()==bid)
				  						.findFirst()
				  						.orElse(new Book());
		System.out.println(matchingBook1);	
		/*
		//another approach
		Book matchingBook2 = books.stream()
				  						.filter(bk -> bk.getBookId()==bid)
				  						.findFirst()
				  						.orElseThrow();
		System.out.println(matchingBook2);
		*/
		//another approach
		Book matchingBook3 = books.stream()
				  				  .filter(bk -> bk.getBookId()==bid)
				  				  .findFirst()
				  				  .orElseThrow(() -> new NoMatchingBookFound("no matching book found with Book ID: " + bid)); //java.util.function.Supplier
		System.out.println(matchingBook3);	
		
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        // Finding an element that starts with 'B'
        String foundName = names.stream()
                                .filter(name -> name.startsWith("B"))
                                .findFirst() // Returns Optional<String>
                                .orElseThrow(() -> new NoSuchElementException("No name starting with 'B' found."));
        System.out.println(foundName);
	}

}
