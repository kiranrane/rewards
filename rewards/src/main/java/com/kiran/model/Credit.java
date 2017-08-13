package com.kiran.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Credit {

	@JsonProperty("credit-id")
	String creditId;
	int points;
	String firstname;
	String lastname;
	
	
	public Credit(String creditId, int points, String firstname, String lastname) {
		super();
		this.creditId = creditId;
		this.points = points;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public String getCreditId() {
		return creditId;
	}
	public void setCreditId(String creditId) {
		this.creditId = creditId;
	}
	public int getPoints() {
		return points;
	}
	public String getFullName(){
		return firstname+"-"+lastname;
	}
	public void setPoints(int points) {
		this.points = points;
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
