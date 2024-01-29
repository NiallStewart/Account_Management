package com.bank.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "ID_GENERATOR")
	@SequenceGenerator(name = "ID_GENERATOR", allocationSize = 1, initialValue = 100000)
	private Long id;
	private Long panCardNumber;
	private Long nationalInsuranceNumber;
	private String firstName;
	private String lastName;
	private String postalAddress;
	private String emailAddress;
	private LocalDate dateOfBirth;
	
	public Customer() {
		super();
	}
	
	public Customer(Long panCardNumber, Long nationalInsuranceNumber, String firstName, String lastName, String postalAddress,
			String emailAddress, LocalDate dateOfBirth) {
		super();
		this.panCardNumber = panCardNumber;
		this.nationalInsuranceNumber = nationalInsuranceNumber;
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
	
	public Long getNationalInsuranceNumber() {
		return nationalInsuranceNumber;
	}
	
	public void setAadharNumber(Long nationalInsuranceNumber) {
		this.nationalInsuranceNumber = nationalInsuranceNumber;
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
		return "Customer [id=" + id + ", panCardNumber=" + panCardNumber + ", aadharNumber=" + nationalInsuranceNumber
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", postalAddress=" + postalAddress
				+ ", emailAddress=" + emailAddress + ", dateOfBirth=" + dateOfBirth + "]";
	}

}
