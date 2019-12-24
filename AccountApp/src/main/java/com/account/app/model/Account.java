package com.account.app.model;

public class Account {

	private int userId;
	private int accountId;
	private String accountType;
	private float balance;
	private float interestRate;
	
	
	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int userId, int accountId, String accountType, float balance,float interestRate ) {
		super();
		this.userId = userId;
		this.accountId = accountId;
		this.accountType = accountType;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	
}
