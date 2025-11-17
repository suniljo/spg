package com.spg.boot.rest.services;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

	public String getWelcomeMsg() {
		return "Welcome to Spring Boot REST Testing";
	}

}
