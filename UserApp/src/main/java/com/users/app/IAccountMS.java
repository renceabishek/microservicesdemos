package com.users.app;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.users.app.model.Account;

@FeignClient(name = "ACCOUNT-MS",fallback = IAccountFallback.class,path = "/account")
//@RequestMapping("/account")
public interface IAccountMS {

	//Abstract Method , i.e, your account ms endpoint method
	
	@GetMapping("/useraccount/{userId}")
	public Account getData(@PathVariable int userId);
	
	/*
	 * @GetMapping public x getX();
	 */
}
