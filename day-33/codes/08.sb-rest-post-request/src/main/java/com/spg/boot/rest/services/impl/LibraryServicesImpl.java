package com.spg.boot.rest.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spg.boot.rest.models.Book;
import com.spg.boot.rest.repository.LibraryRepository;
import com.spg.boot.rest.services.LibraryServices;

@Service
public class LibraryServicesImpl implements LibraryServices {
	
	private LibraryRepository libRepo;
	List<Book> books;
	
	//constructor injection
	public LibraryServicesImpl(LibraryRepository libRepo) {
		super();
		this.libRepo = libRepo;
		books = libRepo.getBooks();
	}

	@Override
	public Book findBookById(Integer bid) {		
		Book searchedBook = books.stream()
						 		.filter(bk -> bk.getBookId().equals(bid))
						 		.findFirst()
						 		.orElse(null);
		return searchedBook;
	}

	@Override
	public List<Book> findAll() {
		return books;
	}

	@Override
	public boolean saveBook(Book newBook) {
		Book book = books.stream()
					     .filter(bk -> bk.getBookId().equals(newBook.getBookId()))
					     .findAny()
					     .orElse(null);
		
		if(book == null) {
			books.add(newBook);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteBookById(Integer isbn) {
		Book book = books.stream()
			     	     .filter(bk -> bk.getBookId().equals(isbn))
			     	     .findAny()
			     	     .orElse(null);

		if(book != null) {
			books.remove(book);
			return true;
		}
		return false;
	}
	
}
