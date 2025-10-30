package com.spg.boot.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private Engine engine;
	
	public Car() {
		System.out.println("Car : no args constructor");
	}
	
	@Autowired
	public Car(Engine engine) {
		this.engine = engine;
		System.out.println("Car :: argument Constructor");
	}
	
	public void startJourney() {
		boolean engineStatus = engine.startEngine();		
		
		if(engineStatus)
			System.out.println("Happy Journey");
		else
			System.err.println("Journey Cancelled!!!");
	}
}
