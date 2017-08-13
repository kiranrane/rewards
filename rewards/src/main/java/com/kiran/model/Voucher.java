package com.kiran.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Voucher {

	@JsonProperty("voucher-number")
	String voucherNumber;
	@JsonProperty("voucher-value")
	int voucherValue;
	String currency;
	String firstname;
	String lastname;
	
	
	public Voucher(String voucherNumber, int voucherValue, String currency, String firstname, String lastname) {
		super();
		this.voucherNumber = voucherNumber;
		this.voucherValue = voucherValue;
		this.currency = currency;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public String getVoucherNumber() {
		return voucherNumber;
	}
	public void setVoucherNumber(String voucherNumber) {
		this.voucherNumber = voucherNumber;
	}
	public int getVoucherValue() {
		return voucherValue;
	}
	public String getFullName(){
		return firstname+"-"+lastname;
	}
	public void setVoucherValue(int voucherValue) {
		this.voucherValue = voucherValue;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
	
}
