package com.users.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.users.app.IAccountMS;
import com.users.app.model.Account;
import com.users.app.model.User;

import feign.FeignException;

@RestController
@RequestMapping("/users")
@RefreshScope
public class UserController {

	@Autowired
	private Environment env;
	
	@Value("${bank.name}")
	private String bankName;
	
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/details")
	public String getUserDetails() {
		return "User: Sabari:"+env.getProperty("local.server.port");
	}
	
	/*
	 * @Autowired RestTemplate restTemplate;
	 */
	
	@Autowired
	IAccountMS iAccountMS;
	
	@GetMapping("/userdetails/{userId}")
	public User getDetails(@PathVariable int userId) {
		
		/*
		 * String url = String.format("http://account-ms/account/useraccount/%s",
		 * userId);
		 * 
		 * ResponseEntity<Account> responseEntity =
		 * restTemplate.exchange(url,HttpMethod.GET,null, new
		 * ParameterizedTypeReference<Account>() { });
		 * 
		 * Account account = responseEntity.getBody();
		 */
		
		User user = new User(userId,"Balaji","Chennai",bankName);
	
		Account account = null;
		
		try {
			account = iAccountMS.getData(userId);//helping the user ms to connect with account ms
		} catch (FeignException e) {
			logger.error(e.getLocalizedMessage());
		} 
		
		user.setAccount(account);
		
		return user;
	}
	
}
