package com.java.order.app.user;

/**
 * @author sathishkumar
 *
 */
public class User {

	public String userName;
	public String userEmail;
	public String physicalAddress;
	public String creditCardNumber;
	
	public User() { }
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getPhysicalAddress() {
		return physicalAddress;
	}
	public void setPhysicalAddress(String physicalAddress) {
		this.physicalAddress = physicalAddress;
	}
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public User(String userName, String userEmail, String physicalAddress, String creditCardNumber) {
		this.userName = userName;
		this.userEmail = userEmail;
		this.physicalAddress = physicalAddress;
		this.creditCardNumber = creditCardNumber;
	}
	
}
