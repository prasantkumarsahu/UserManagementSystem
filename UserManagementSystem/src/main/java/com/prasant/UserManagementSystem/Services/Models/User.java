package com.prasant.UserManagementSystem.Services.Models;

public class User {
	private int userId;
	private String userName;
	private String address;
	private long phoneNumber;

	public User(int userId, String userName, String address, long phoneNumber) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.address = address;
		this.phoneNumber = phoneNumber;
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

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
