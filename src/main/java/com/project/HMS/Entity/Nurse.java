package com.project.HMS.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nurses")
public class Nurse {
    @Id
    @Column(name = "Nurse_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Contact")
    private long contact;

    @Column(name = "Email")
    private String email;

    @Column(name = "Role")
    private String role;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "Age")
    private Integer age;

    @Column(name = "Address")
    private String address;

    @Column(name = "Works_at")
    private Long hospital_id;

    public Nurse(){

    }

    public Nurse(String name, Long contact, String email, String gender, Integer age, String address, Long works_at, String role){
        super();
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.hospital_id = works_at;
        this.role = role;
    }

    public String getAddress() {
        return address;
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

    public Long getHospital_id() {
        return hospital_id;
    }

    public Long getId() {
        return id;
    }

    public String getRole() {
        return role;
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

    public void setHospital_id(Long hospital_id) {
        this.hospital_id = hospital_id;
    }

    
}