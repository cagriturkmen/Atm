package com.atm2;

// parametreszi constructor
// toString
// getter and setter

public class Login {
	// özellikler
	private String userName;
	private String userPassword;
	private String userEmailAdress;
	
	// parametresiz constructor
	public Login() {
		
	}
	
	// parametreli constructor
	public Login(String userName, String userPassword) {
		
		this.userName = userName;
		this.userPassword = userPassword;
	}
	
	// parametreli constructor OVERLOADING
	public Login(String userName, String userPassword, String userEmailAdress) {
		
		this.userName = userName;
		this.userPassword = userPassword;
		this.userEmailAdress = userEmailAdress;
	}
	
	// to String
	@Override
	public String toString() {
		return "Login [userName=" + userName + ", userPassword=" + userPassword + ", userEmailAdress=" + userEmailAdress
				+ "]";
	}
	// getter and setter
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserPassword() {
		return userPassword;
	}
	
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	public String getUserEmailAdress() {
		return userEmailAdress;
	}
	
	public void setUserEmailAdress(String userEmailAdress) {
		this.userEmailAdress = userEmailAdress;
	}
	
}
