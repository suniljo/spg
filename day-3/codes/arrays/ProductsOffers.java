package com.spg.java.arrays;

public class ProductsOffers {

	public static void main(String[] args) {
		String productDetails = "mobile,10000,20";
		String[] details = productDetails.split(",");
		
		String productName = details[0];
	    String productPrice = details[1];
	    String productQty = details[2];

	    System.out.println("Product Name: " + productName);
	    System.out.println("Product Price: " + productPrice);
	    System.out.println("Product Quantity: " + productQty);
	}

}
