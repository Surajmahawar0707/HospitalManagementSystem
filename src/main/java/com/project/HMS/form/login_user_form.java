package com.project.HMS.form;

public class login_user_form {

    private String email;
    private String password;

    public login_user_form(){

    }

    public login_user_form(String email, String password){
        super();
        this.email = email;
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    
}
