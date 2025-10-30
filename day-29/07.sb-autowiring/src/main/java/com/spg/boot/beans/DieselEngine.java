package com.spg.boot.beans;

import java.util.Random;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DieselEngine implements Engine {

	@Override
	public boolean startEngine()  {
		System.out.println("staring diesel engine...");
		return new Random().nextBoolean();
	}

}
