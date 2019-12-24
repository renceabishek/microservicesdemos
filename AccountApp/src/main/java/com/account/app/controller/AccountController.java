package com.account.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.account.app.model.Account;

@RestController
@RequestMapping("/account")
@RefreshScope
public class AccountController {

	@GetMapping("/details")
	public String getAccountDetails() {
		return "Saving Account";
	}
	
	@Value("${interest.rate}")
	private float interestRate;
	
	@GetMapping("/useraccount/{userId}")
	public Account getUserAccountDetails(@PathVariable int userId) {
		return new Account(101,23418,"Savings",300f,interestRate);
	}
	
}
