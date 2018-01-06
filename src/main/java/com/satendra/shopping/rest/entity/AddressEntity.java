package com.satendra.shopping.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESS")
public class AddressEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ADDR_ID")
	private int addrId;
	
	@Column(name="USER_NAME")
	private String loginUserName;
	
	@Column(name="USER_EMAIL")
	private String loginUserEmail;
	
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
	
	@Column(name="ADDR_DEFAULT")
	private boolean addrDefault;

	
	public boolean isAddrDefault() {
		return addrDefault;
	}

	public void setAddrDefault(boolean addrDefault) {
		this.addrDefault = addrDefault;
	}

	public int getAddrId() {
		return addrId;
	}

	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}

	public String getLoginUserName() {
		return loginUserName;
	}

	public void setLoginUserName(String loginUserName) {
		this.loginUserName = loginUserName;
	}

	public String getLoginUserEmail() {
		return loginUserEmail;
	}

	public void setLoginUserEmail(String loginUserEmail) {
		this.loginUserEmail = loginUserEmail;
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

	public String getAddrPin() {
		return addrPin;
	}

	public void setAddrPin(String addrPin) {
		this.addrPin = addrPin;
	}

	public String getAddrState() {
		return addrState;
	}

	public void setAddrState(String addrState) {
		this.addrState = addrState;
	}
	
	
}
