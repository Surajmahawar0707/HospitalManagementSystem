package com.project.HMS.form;

public class medical_staff_form {
    private String email;
	private String password;
	
	public medical_staff_form() {
		
	}
	
	public medical_staff_form(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
}
