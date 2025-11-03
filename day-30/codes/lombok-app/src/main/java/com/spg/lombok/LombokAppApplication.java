package com.spg.lombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spg.lombok.models.Product;

@SpringBootApplication
public class LombokAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokAppApplication.class, args);
		/*
		Product prod = Product.builder()
							  .productId(101)
							  .productName("Mobile")
							  .productPrice(75000f)
							  .build();
		System.out.println(prod);
		*/
		Product prod1 = new Product();		
	}

}
