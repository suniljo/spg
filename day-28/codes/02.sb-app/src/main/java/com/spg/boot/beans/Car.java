package com.spg.boot.beans;

import java.util.Random;
import org.springframework.stereotype.Component;

//@Component
//@Component("mycar")
@Component(value = "mycar")
public class Car {

	public Car() {
		System.out.println("Car :: Constructor");
	}
	
	public void startJourney() {
		boolean carStatus = new Random().nextBoolean();
		
		if(carStatus)
			System.out.println("Happy Journey");
		else
			System.err.println("Journey Cancelled!!!");
	}
}
