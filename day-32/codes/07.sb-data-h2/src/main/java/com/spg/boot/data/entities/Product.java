package com.spg.boot.data.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "PRODUCT_MASTER")
@Data
@RequiredArgsConstructor
public class Product {
	@Id
	//@GeneratedValue
	//@GeneratedValue(strategy = GenerationType.AUTO)
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	//@GeneratedValue(strategy = GenerationType.TABLE)
		
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pid_gen")
	@SequenceGenerator(name = "pid_gen", sequenceName = "product_seq", initialValue = 1001, allocationSize = 1)
	private Integer productId;
	
	private final String productName;
	private final Float productPrice;
}
