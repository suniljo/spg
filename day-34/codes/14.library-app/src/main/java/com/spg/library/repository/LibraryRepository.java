package com.spg.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spg.library.entity.Book;

public interface LibraryRepository extends JpaRepository<Book, Integer> {

}
