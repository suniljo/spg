package com.spg.boot.beans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class PetrolEngine implements Engine {

	@Override
	public boolean startEngine()  {
		System.out.println("starting Petrol engine...");
		return new Random().nextBoolean();
	}

}
