package com.spg.accounts.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spg.accounts.dto.AccountDto;
import com.spg.accounts.dto.CardsDto;
import com.spg.accounts.dto.CustomerDetailsDto;
import com.spg.accounts.dto.LoansDto;
import com.spg.accounts.entities.Account;
import com.spg.accounts.entities.Customer;
import com.spg.accounts.exception.ResourceNotFoundException;
import com.spg.accounts.mapper.AccountMapper;
import com.spg.accounts.mapper.CustomerMapper;
import com.spg.accounts.repositories.AccountRepository;
import com.spg.accounts.repositories.CustomerRepository;
import com.spg.accounts.service.clients.CardsFeignClient;
import com.spg.accounts.service.clients.LoansFeignClient;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerDetailsService implements ICustomerDetailsService {
	private AccountRepository accountRepo;
	private CustomerRepository customerRepo;
	
	private CardsFeignClient cardsFeignClient;
	private LoansFeignClient loansFeignClient;
	
	@Override
	public CustomerDetailsDto fetchCustomerDetails(String mobileNumber) {
		Customer customer = customerRepo.findByMobileNumber(mobileNumber)
									.orElseThrow(() -> new ResourceNotFoundException("Customer", "mobileNumber", mobileNumber));
		
		Account accounts = accountRepo.findByCustomerId(customer.getCustomerId())
									.orElseThrow(() -> new ResourceNotFoundException("Account", "customerId", customer.getCustomerId().toString()));
		
        CustomerDetailsDto customerDetailsDto = CustomerMapper.mapToCustomerDetailsDto(customer, new CustomerDetailsDto());
        customerDetailsDto.setAccountDto(AccountMapper.mapToAccountsDto(accounts, new AccountDto()));
		
        ResponseEntity<CardsDto> cardsReponse = cardsFeignClient.fetchCardDetails(mobileNumber);
        CardsDto cardsDto = cardsReponse.getBody();
        customerDetailsDto.setCardsDto(cardsDto);
        
        ResponseEntity<LoansDto> loansDtoResponseEntity = loansFeignClient.fetchLoanDetails(mobileNumber);
        customerDetailsDto.setLoansDto(loansDtoResponseEntity.getBody());
        
		return customerDetailsDto;
	}

}
