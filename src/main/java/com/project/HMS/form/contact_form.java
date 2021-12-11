package com.project.HMS.form;

public class contact_form {
    private String fname;
    private String lname;
    private String email;
    private Long contact;
    private String queries;

    public contact_form(){

    }

    public contact_form(String fname, String lname, String email, Long contact, String queries){
        super();
        this.fname = fname;
        this.email = email;
        this.contact = contact;
        this.queries = queries;
        this.lname = lname;
    }

    public Long getContact() {
        return contact;
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

    public String getQueries() {
        return queries;
    }

    public void setContact(Long contact) {
        this.contact = contact;
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

    public void setQueries(String queries) {
        this.queries = queries;
    }
    
}
