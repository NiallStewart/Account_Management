package com.bank.entity;

import java.time.LocalDate;

public class Customer {
	
	private Long id;
	private Long panCardNumber;
	private Long aadharNumber;
	private String firstName;
	private String lastName;
	private String postalAddress;
	private String emailAddress;
	private LocalDate dateOfBirth;
	
	public Customer() {
		super();
	}
	
	public Customer(Long panCardNumber, Long aadharNumber, String firstName, String lastName, String postalAddress,
			String emailAddress, LocalDate dateOfBirth) {
		super();
		this.panCardNumber = panCardNumber;
		this.aadharNumber = aadharNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.postalAddress = postalAddress;
		this.emailAddress = emailAddress;
		this.dateOfBirth = dateOfBirth;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getPanCardNumber() {
		return panCardNumber;
	}
	
	public void setPanCardNumber(Long panCardNumber) {
		this.panCardNumber = panCardNumber;
	}
	
	public Long getAadharNumber() {
		return aadharNumber;
	}
	
	public void setAadharNumber(Long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPostalAddress() {
		return postalAddress;
	}
	
	public void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", panCardNumber=" + panCardNumber + ", aadharNumber=" + aadharNumber
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", postalAddress=" + postalAddress
				+ ", emailAddress=" + emailAddress + ", dateOfBirth=" + dateOfBirth + "]";
	}

}
