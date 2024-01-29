package com.bank.service;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;

import com.bank.entity.Account;
import com.bank.entity.Transaction;
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
	
	public String withdrawTransaction(Long accountNumber, int amount, String type, String subtype) {
		Account customerAccount = accountRepo.findById(accountNumber).get();
		if(!customerAccount.equals(null)) {
			int currentBalance = customerAccount.getCurrentBalance();
			if(currentBalance - amount >= 0) {
				customerAccount.setCurrentBalance(customerAccount.getCurrentBalance() - amount);
				
				// Save the updated account information
				accountRepo.save(customerAccount);
				
				// Create a record of the transaction
				Transaction transaction = new Transaction();
				transaction.setCurrentBalance(currentBalance);
				transaction.setDateTime(LocalDateTime.now());
				transaction.setType(type);
				transaction.setSubType(subtype);
				
				// Save the transaction information
				transactionRepo.save(transaction);
				
				return "Withdrawal Transaction Successful!";
			} else {
				return "Insufficient Funds";
			}
		} else {
			return "Invalid Account Number!";
		}
	}
	
	public String depositTransaction(Long accountNumber, int amount, String type, String subtype) {
		Account customerAccount = accountRepo.findById(accountNumber).get();
		if(!customerAccount.equals(null)) {
			customerAccount.setCurrentBalance(customerAccount.getCurrentBalance() + amount);
			
			// Save the updated account information
			accountRepo.save(customerAccount);
			
			// Create a record of the transaction
			Transaction transaction = new Transaction();
			transaction.setCurrentBalance(customerAccount.getCurrentBalance());
			transaction.setDateTime(LocalDateTime.now());
			transaction.setType(type);
			transaction.setSubType(subtype);
			
			// Save the transaction information
			transactionRepo.save(transaction);
			
			return "Deposit Transaction Successful!";
		} else {
			return "Invalid Account Number!";
		}
	}

}
