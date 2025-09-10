package com.spg.java.oops;

public class Circle extends Shape {
	float radius;
	
	public Circle(String color, float radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public void area() {
		System.out.println(String.format("area of circle = %.2f", (Math.PI * Math.pow(radius, 2))));
	}

}
