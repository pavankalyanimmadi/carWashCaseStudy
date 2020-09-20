package com.CustomerServedRequests.pojo;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;



public class Customer {
	
	

	
	@Id
	private String emailId;
	private String name;
	private String address;
	private String mobileNumber;
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
	@Override
	public String toString() {
		return "Customer [emailId=" + emailId + ", name=" + name + ", address=" + address + ", mobileNumber="
				+ mobileNumber + "]";
	}
	
	
	
	
	
	
	
	
	
	

	
	


	

}
