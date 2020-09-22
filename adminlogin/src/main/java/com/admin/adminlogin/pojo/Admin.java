package com.admin.adminlogin.pojo;

import org.springframework.data.annotation.Id;

public class Admin {
	
	
	private boolean loginStatus;
	@Id
	private String emailId;
	private String name;
	private String address;
	private String mobileNumber;
	private String password;
	
	
	
	
	
	
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPassword() { 
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [emailId=" + emailId + ", name=" + name + ", address=" + address + ", mobileNumber="
				+ mobileNumber + ", password=" + password + "]";
	}
	
	
	

}
