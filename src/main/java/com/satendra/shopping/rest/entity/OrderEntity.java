package com.satendra.shopping.rest.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDERS")
public class OrderEntity {

	@Id
	@Column(name = "ORDER_ID")
	private String orderID;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "PRODCT_DESC")
	private String productAndQuantityCost;

	@Column(name = "PRICE")
	private String price;

	@Column(name = "ORDER_DATE")
	private Date date;

	@Column(name = "ORDER_SHIPPED")
	private String orderShipped;
	
	
	@Column(name="ADDR_NAME")
	private String addrName;
	
	@Column(name="ADDR_ADDRESS")
	private String addrAddress;
	
	@Column(name="ADDR_CITY")
	private String addrCity;
	
	@Column(name="ADDR_STATE")
	private String addrState;
	
	@Column(name="ADDR_PIN")
	private String addrPin;
	
	

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

}
