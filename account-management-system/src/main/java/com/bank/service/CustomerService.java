package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bank.repository.AccountRepo;
import com.bank.repository.CustomerRepo;

public class CustomerService {
	
	@Autowired
	private CustomerRepo customerRepo;

	@Autowired
	private AccountRepo accountRepo;

}
