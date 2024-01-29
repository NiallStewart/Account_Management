package com.bank.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;

import com.bank.entity.Account;
import com.bank.entity.Customer;
import com.bank.repository.AccountRepo;
import com.bank.repository.CustomerRepo;

public class BankManagerService {
	
	@Autowired
	private CustomerRepo customerRepo;

	@Autowired
	private AccountRepo accountRepo;
	
	public boolean checkCustomerAccountExists(Long customer_id) {
		Customer customer = customerRepo.findById(customer_id).get();
		if(!customer.equals(null)) {
			return true;
		}
		return false;
	}
	
	/**
	 * Create account for an already existing customer
	 */
	public String createAccount(Long customer_id) {
		// Create account
	    Account account = new Account(customer_id, 0);
	    
	    // Save account to the account repository
	    accountRepo.save(account);
		return "Account Created";
	}

	/**
	 * Create account the initial account for a new customer
	 */
	public String createAccount(Long panCardNumber, Long nationalInsuranceNumber, String firstName, String lastName, String postalAddress, String emailAddress, LocalDate dateOfBirth) {
	    // create new customer
	    Customer customer = new Customer(panCardNumber, nationalInsuranceNumber, firstName, lastName, postalAddress, emailAddress, dateOfBirth);
	    
	    // Save customer to the customer repository
	    customerRepo.save(customer);
	    
	    // Create account
	    Account account = new Account(customer.getId(), 0);
	    
	    // Save account to the account repository
	    accountRepo.save(account);
	    return "Account created";
	}

}
