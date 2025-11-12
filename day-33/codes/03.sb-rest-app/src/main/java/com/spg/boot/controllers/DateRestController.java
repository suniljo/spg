package com.spg.boot.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateRestController {
	@GetMapping(path = {"/date", "/today"})
	public ResponseEntity<String> showTodaysDateAndTime(){
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy :: HH:mm:ss");
		
		String dt = formatter.format(ldt);
		
		//return ResponseEntity.ok().build();
		//return ResponseEntity.ok(dt);
		//return ResponseEntity.ok().body(dt);
		
		//ResponseEntity<String> responseEntity = new ResponseEntity<String>(HttpStatus.OK);
		//ResponseEntity<String> responseEntity = new ResponseEntity<String>(dt, HttpStatus.OK);
		
		//---- include response headers with ResponseEntity ----
		HttpHeaders respHeaders = new HttpHeaders();
		respHeaders.add("company", "S&P Globals");
		respHeaders.add("location", "Chicago");
		
		ResponseEntity<String> responseEntity = new ResponseEntity<String>(dt, respHeaders, HttpStatus.OK);
		//return responseEntity;
		
		//return ResponseEntity.ok().headers(respHeaders).body(dt);
		return ResponseEntity.badRequest().body(dt);
	}
}
