package com.project.HMS.form;

public class register_user_form {

    private String email;
    private String password1;
    private String password2;
    private String fname;
    private String lname;

    public register_user_form(){

    }

    public register_user_form(String fname, String lname, String email, String password1, String password2){
        super();
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.password1 = password1;
        this.password2 = password2;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword1() {
        return password1;
    }

    public String getPassword2() {
        return password2;
    }
    
}
