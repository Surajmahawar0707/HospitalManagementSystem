package com.project.HMS.form;

public class r_edit_form {
    private String email;
    private String fname;
    private String lname;
    private String address;
    private Long contact;
    private String password;
    private String district;
    private String state;
    private String country;
    public r_edit_form(){}

    public r_edit_form(String email, String district, String state, String country, String fname, String lname, Long contact, String password, String address){
        super();
        this.email = email;
        this.country = country;
        this.state = state;
        this.district = district;
        this.address = address;
        this.fname = fname;
        this.lname = lname;
        this.contact = contact;
        this.password = password;
    }

    public String getAddress() {
        return address;
    }
    public String getCountry() {
        return country;
    }
    public String getDistrict() {
        return district;
    }
    public String getState() {
        return state;
    }
    public String getFname() {
        return fname;
    }
    public String getLname() {
        return lname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setDistrict(String district) {
        this.district = district;
    }
    public void setState(String state) {
        this.state = state;
    }
    public Long getContact() {
        return contact;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setContact(Long contact) {
        this.contact = contact;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
