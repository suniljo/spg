package com.spg.boot.controllers;

import java.util.Enumeration;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(path = "/api/v1")
public class ProcessRequestHeaderAndBody {
	
	@PostMapping(path = "/data")
	public ResponseEntity<?> processRequestHeaderAndData(@RequestHeader("Host") String hostName,
														 @RequestHeader(name = "company", required=false, defaultValue = "NA") String company,
														 @RequestBody(required = false) String requestData, HttpServletRequest request){
		String responseText = String.format("Host: %s\nCompany: %s\nRequest Data: %s", hostName, company, requestData);
		
		Enumeration<String> en = request.getHeaderNames();
		while(en.hasMoreElements()) {
			String headerName = en.nextElement();
			String headerValue = request.getHeader(headerName);
			System.out.println(headerName + " = " + headerValue);
		}
		
		ResponseEntity<String> respEntity = new  ResponseEntity<String>(responseText, HttpStatus.OK);
		
		if(requestData==null)
			//respEntity = new  ResponseEntity<String>(HttpStatus.BAD_REQUEST);
			respEntity = ResponseEntity.badRequest().build();
		
		return respEntity;
	}	
}
