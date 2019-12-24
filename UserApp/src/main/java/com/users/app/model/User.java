package com.users.app.model;

public class User {

	private int userId;
	private String userName;
	private String address;
	private Account account;
	private String bankName;
	
	
	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(int userId, String userName, String address,String bankName) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.address = address;
		this.bankName = bankName;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	
}
