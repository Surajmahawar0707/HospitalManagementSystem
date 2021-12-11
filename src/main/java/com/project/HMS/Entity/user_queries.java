package com.project.HMS.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_queries")
public class user_queries {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fname")
    private String fname;

    @Column(name = "lname")
    private String lname;

    @Column(name = "email")
    private String email;

    @Column(name = "contact")
    private Long contact;

    @Column(name = "description")
    private String description;

    public user_queries(){

    }

    public user_queries(String fname, String lname, String email, Long contact, String description){
        super();
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.contact = contact;
        this.description = description;
    }

    public Long getContact() {
        return contact;
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

    public Long getId() {
        return id;
    }

    public String getLname() {
        return lname;
    }

    public void setContact(Long contact) {
        this.contact = contact;
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

    public void setId(Long id) {
        this.id = id;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
