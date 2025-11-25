package com.spg.accounts.service.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spg.accounts.dto.LoansDto;

//@FeignClient(value = "LOANS")
@FeignClient(name="loans-service", url = "http://localhost:8090")
public interface LoansFeignClient {
    @GetMapping("/api/fetch")
    public ResponseEntity<LoansDto> fetchLoanDetails(@RequestParam String mobileNumber);	
}
