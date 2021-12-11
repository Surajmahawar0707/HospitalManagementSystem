package com.project.HMS.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "receptionists")
public class Receptionist {
    @Id
    @Column(name = "Receptionist")
    private String email;

    @Column(name = "First_Name")
    private String fname;

    @Column(name = "Last_Name")
    private String lname;

    @Column(name = "Contact")
    private long contact;

    @Column(name = "filepath")
    private String filepath;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "Age")
    private Integer age;

    @Column(name = "Address")
    private String address;

    @Column(name = "district")
    private String district;

    @Column(name = "state")
    private String state;

    @Column(name = "couontry")
    private String country;

    @Column(name = "Hospital")
    private Long hid;

    public Receptionist(){

    }

    public Receptionist(String fname, String lname, Long hid, String district, String state, String country, String filepath, Long contact, String email, String gender, Integer age, String address){
        super();
        this.fname = fname;
        this.lname = lname;
        this.hid = hid;
        this.filepath = filepath;
        this.contact = contact;
        this.email = email;
        this.gender = gender;
        this.age = age;
        this.district = district;
        this.state = state;
        this.country = country;
        this.address = address;
    }

    public Long getHid() {
        return hid;
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
    public void setHid(Long hid) {
        this.hid = hid;
    }
    public String getAddress() {
        return address;
    }

    public String getFilepath() {
        return filepath;
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
    public void setCountry(String country) {
        this.country = country;
    }
    public void setDistrict(String district) {
        this.district = district;
    }
    public void setState(String state) {
        this.state = state;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public Integer getAge() {
        return age;
    }

    public long getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    
    public void setContact(long contact) {
        this.contact = contact;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }  
}