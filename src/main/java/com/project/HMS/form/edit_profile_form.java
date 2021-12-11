package com.project.HMS.form;

public class edit_profile_form {

    private String fname;
    private String lname;
    private String email;
    private String password;

    public edit_profile_form(){

    }

    public edit_profile_form(String fname, String lname, String email, String password){
        super();
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.password = password;
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

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getPassword() {
        return password;
    }
    
}
