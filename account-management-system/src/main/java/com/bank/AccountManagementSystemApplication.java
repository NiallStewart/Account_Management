package com.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.bank.service.EmailService;

@SpringBootApplication
public class AccountManagementSystemApplication {
	
//	@Autowired
//	private EmailService emailService;

	public static void main(String[] args) {
		SpringApplication.run(AccountManagementSystemApplication.class, args);
	}
	
//	@EventListener(ApplicationReadyEvent.class)
//	public void sendMail() {
//		emailService.sendEmail("jess1736@hotmail.co.uk", "Test Subject", "This is a test email message");
//	}

}
