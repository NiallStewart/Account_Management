package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bank.repository.AccountRepo;
import com.bank.repository.CustomerRepo;
import com.bank.repository.TransactionRepo;

public class TransactionService {
	
	@Autowired
	private TransactionRepo transactionRepo;

	@Autowired
	private CustomerRepo customerRepo;

	@Autowired
	private AccountRepo accountRepo;

}
