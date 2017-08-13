package com.kiran.model;

import java.util.ArrayList;
import java.util.List;

public class Reward {

	List<String> credit=new ArrayList<>();
	List<String> voucher=new ArrayList<>();
	String firstname;
	String lastname;
	
	
	public Reward(List<String> credit, List<String> voucher, String firstname, String lastname) {
		super();
		this.credit = credit;
		this.voucher = voucher;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public List<String> getCredit() {
		return credit;
	}
	public void setCredit(List<String> credit) {
		this.credit = credit;
	}
	public List<String> getVoucher() {
		return voucher;
	}
	public void setVoucher(List<String> voucher) {
		this.voucher = voucher;
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
