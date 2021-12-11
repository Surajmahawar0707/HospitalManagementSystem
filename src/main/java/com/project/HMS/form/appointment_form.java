package com.project.HMS.form;

import java.sql.Date;


public class appointment_form {
    private String fname;
    private String lname;
    private Long contact;
    private String email;
    private Date date;
    private String time;
    private String description;
    private String status;

    public appointment_form(){

    }

    public appointment_form(String fname, String time, String lname, Long contact, String email, Date date, String description, String status){
        super();
        this.fname = fname;
        this.time = time;
        this.lname = lname;
        this.contact = contact;
        this.email = email;
        this.date = date;
        this.description = description;
        this.status = status;
    } 

    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Long getContact() {
        return contact;
    }
    public Date getDate() {
        return date;
    }
    public String getDescription() {
        return description;
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
    public void setContact(Long contact) {
        this.contact = contact;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setDescription(String description) {
        this.description = description;
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
}
