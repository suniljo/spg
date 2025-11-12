package com.spg.boot.rest.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spg.boot.rest.models.Book;
import com.spg.boot.rest.repository.LibraryRepository;
import com.spg.boot.rest.services.LibraryServices;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor //constructor injection
public class LibraryServicesImpl implements LibraryServices {
	
	private LibraryRepository libRepo;
	
	@Override
	public Book findBookById(Integer bid) {
		List<Book> books = libRepo.getBooks();
		
		Book searchedBook = books.stream()
						 .filter(bk -> bk.getBookId().equals(bid))
						 .findFirst()
						 .orElse(null);
		return searchedBook;
	}

	@Override
	public List<Book> findAll() {
		List<Book> books = libRepo.getBooks();
		return books;
	}

}
