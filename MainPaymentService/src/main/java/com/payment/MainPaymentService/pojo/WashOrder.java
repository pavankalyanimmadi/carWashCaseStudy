package com.payment.MainPaymentService.pojo;

import org.springframework.data.annotation.Id;

public class WashOrder {
	
	@Id
	private String oredrId;
	private String orderStatus;
	private String pakcageId;
	
	private String date;
	private String time;
	private String location;
	
	
	private String carModel;
	private String carNumber;
	
	private String customerId;
	
	private String washerId;
	
	private boolean  paymentStatus;
	
	private String paymentId;
	
	
	

	public boolean isPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getOredrId() {
		return oredrId;
	}

	public void setOredrId(String oredrId) {
		this.oredrId = oredrId;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPakcageId() {
		return pakcageId;
	}

	public void setPakcageId(String pakcageId) {
		this.pakcageId = pakcageId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getWasherId() {
		return washerId;
	}

	public void setWasherId(String washerId) {
		this.washerId = washerId;
	}

	@Override
	public String toString() {
		return "WashOrder [oredrId=" + oredrId + ", orderStatus=" + orderStatus + ", pakcageId=" + pakcageId + ", date="
				+ date + ", time=" + time + ", location=" + location + ", carModel=" + carModel + ", carNumber="
				+ carNumber + ", customerId=" + customerId + ", washerId=" + washerId + "]";
	}
	
	
	
	
	
	
	
	

}
