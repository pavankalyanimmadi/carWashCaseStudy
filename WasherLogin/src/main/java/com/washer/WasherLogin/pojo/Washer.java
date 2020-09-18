package com.washer.WasherLogin.pojo;

import org.springframework.data.annotation.Id;

public class Washer {
	
	private boolean loginStatus;
	
	@Id
	private String emailId;
	private String name;
	private String phoneNumber;
	private String password;
	private String address;
	private String washServiceName;
	
	
	public boolean isLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(boolean loginStatus) {
		this.loginStatus = loginStatus;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String adress) {
		this.address = adress;
	}
	public String getWashServiceName() {
		return washServiceName;
	}
	public void setWashServiceName(String washServiceName) {
		this.washServiceName = washServiceName;
	}
	@Override
	public String toString() {
		return "Washer [emailId=" + emailId + ", name=" + name + ", phoneNumber=" + phoneNumber + ", password="
				+ password + ", adress=" + address + ", washServiceName=" + washServiceName + "]";
	}
	
	
	
	
	
	
	

}
