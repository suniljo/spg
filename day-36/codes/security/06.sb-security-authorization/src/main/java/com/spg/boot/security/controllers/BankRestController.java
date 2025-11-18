package com.spg.boot.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {
	@GetMapping("/home")
	public String homePage() {
		return "Welcome to State Bank of India";
	}

	@GetMapping("/admin")
	public String adminPage() {
		return "This API is for Administrators";
	}

	@GetMapping("/manager")
	public String managerPage() {
		return "This API is for Administrators & Managers";
	}

	@GetMapping("/clerk")
	public String clerkPage() {
		return "This API is for Administrators, Managers & Clerks";
	}

	@GetMapping("/contact")
	public String customerCarePage() {
		return "Contact State Bank of India";
	}
}
