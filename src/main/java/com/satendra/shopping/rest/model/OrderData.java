package com.satendra.shopping.rest.model;

import java.util.Date;

public class OrderData implements Comparable<OrderData>{

	private String orderID;
	private String email;
	private String userName;

	private String productAndQuantityCost;

	private String price;
	private Date date;
	private String orderShipped;
	
	private String addrName;
	
	private String addrAddress;
	
	private String addrCity;
	
	private String addrState;
	
	private String addrPin;

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getProductAndQuantityCost() {
		return productAndQuantityCost;
	}

	public void setProductAndQuantityCost(String productAndQuantityCost) {
		this.productAndQuantityCost = productAndQuantityCost;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getOrderShipped() {
		return orderShipped;
	}

	public void setOrderShipped(String orderShipped) {
		this.orderShipped = orderShipped;
	}

	public String getAddrName() {
		return addrName;
	}

	public void setAddrName(String addrName) {
		this.addrName = addrName;
	}

	public String getAddrAddress() {
		return addrAddress;
	}

	public void setAddrAddress(String addrAddress) {
		this.addrAddress = addrAddress;
	}

	public String getAddrCity() {
		return addrCity;
	}

	public void setAddrCity(String addrCity) {
		this.addrCity = addrCity;
	}

	public String getAddrState() {
		return addrState;
	}

	public void setAddrState(String addrState) {
		this.addrState = addrState;
	}

	public String getAddrPin() {
		return addrPin;
	}

	public void setAddrPin(String addrPin) {
		this.addrPin = addrPin;
	}

	@Override
	public int compareTo(OrderData o) {
		
		return o.date.compareTo(this.date);
	}
	
	

}
