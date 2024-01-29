package com.bank.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Account {
	
	@Id
	@GeneratedValue
	private Long accountNumber;
	private Long customerId;
	private int currentBalance;
	
	public Account() {
		super();
	}
	
	public Account(Long customerId, int currentBalance) {
		super();
		this.customerId = customerId;
		this.currentBalance = currentBalance;
	}
	
	public Long getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public Long getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	
	public int getCurrentBalance() {
		return currentBalance;
	}
	
	public void setCurrentBalance(int currentBalance) {
		this.currentBalance = currentBalance;
	}
	
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", customerId=" + customerId + ", currentBalance="
				+ currentBalance + "]";
	}
	
	

}
