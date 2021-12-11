package com.project.HMS.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "doctors")
public class Doctor {
    @Id
    @Column(name = "Doctor_id")
    private Long id;

    @Column(name = "filepath")
    private String filepath;

    @Column(name = "Name")
    private String name;

    @Column(name = "Contact")
    private long contact;

    @Column(name = "Email")
    private String email;

    @Column(name = "Department")
    private String dept;

    @Column(name = "Role")
    private String role;

    @Column(name = "district")
    private String district;

    @Column(name = "state")
    private String state;

    @Column(name = "Country")
    private String country;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "Age")
    private Integer age;

    @Column(name = "Address")
    private String address;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;

    public Doctor(){}

    public Doctor(String name, String district, String state, String country, String filepath, Long contact, String email, String gender, Integer age, String address, Hospital works_at, String dept, String role){
        super();
        this.name = name;
        this.district = district;
        this.state = state;
        this.country = country;
        this.filepath = filepath;
        this.contact = contact;
        this.email = email;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.hospital = works_at;
        this.dept = dept;
        this.role = role;
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

    public String getAddress() {
        return address;
    }

    public String getFilepath() {
        return filepath;
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

    public String getName() {
        return name;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public String getDept() {
        return dept;
    }

    public Long getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRole(String role) {
        this.role = role;
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

    public void setName(String name) {
        this.name = name;
    }

    
}