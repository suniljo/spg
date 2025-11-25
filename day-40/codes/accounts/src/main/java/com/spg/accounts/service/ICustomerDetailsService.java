package com.spg.accounts.service;

import com.spg.accounts.dto.CustomerDetailsDto;

public interface ICustomerDetailsService {
	CustomerDetailsDto fetchCustomerDetails(String mobileNumber);
}
