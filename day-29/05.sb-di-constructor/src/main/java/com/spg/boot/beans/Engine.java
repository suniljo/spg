package com.spg.boot.beans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	public Engine() {
		System.out.println("Engine :: Constructor");
	}
	
	public boolean startEngine() {
		System.out.println("staring engine...");
		return new Random().nextBoolean();
	}
}
