package com.project.HMS.form;

public class receptionist {
	private String email;
	private String password;
	
	public receptionist() {
		
	}
	
	public receptionist(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
