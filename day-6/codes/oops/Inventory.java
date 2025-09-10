package com.spg.java.oops;

public class Inventory {

	public static void main(String[] args) {
		Product prod = new Product();
		//System.out.println(prod.productId); //The field Product.productId is not visible
		
		System.out.println(prod.getProductId() + " | " + prod.getProductName() + " | " + prod.getProductPrice());
		
		prod.setProductId(2541639);
		prod.setProductName("Mobile Phone");
		prod.setProductPrice(4500.5f);
		
		System.out.println(prod.getProductId() + " | " + prod.getProductName() + " | " + prod.getProductPrice());
	}

}
