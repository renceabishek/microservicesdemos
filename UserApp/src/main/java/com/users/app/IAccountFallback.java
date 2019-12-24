package com.users.app;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.users.app.model.Account;

@Component
@RequestMapping("/account")
public class IAccountFallback implements IAccountMS {

	@Override
	@GetMapping("/useraccount/{userId}")
	public Account getData(int userId) {
		return new Account(userId,0,"Sorry Account Service Unavailable",0.0f,0.0f);
	}
}
