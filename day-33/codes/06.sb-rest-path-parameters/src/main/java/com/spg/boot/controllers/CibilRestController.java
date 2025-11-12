package com.spg.boot.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/cibil")
public class CibilRestController {
	
	@GetMapping(path = "/score/{name}/{pan}")
	public ResponseEntity<?> getCibilScore(@PathVariable("name") String customerName, 
										  @PathVariable(value =  "pan") String pan)
	{	
		String responseText = "";
		
		if(pan !=null && pan.length() == 10) {
			responseText = String.format("Hi %s, your CIBIL Score is 798", customerName);
			return ResponseEntity.ok().body(responseText);
		}else {
			responseText = String.format("Hi %s, please submit a valid PAN", customerName);
			return ResponseEntity.badRequest().body(responseText);
		}
		
	}
}
