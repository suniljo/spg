package com.spg.boot.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spg.boot.data.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
