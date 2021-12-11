package com.project.HMS.Entity;

import java.sql.Blob;
import java.util.List;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "hospitals")
public class Hospital {
    @Id
    @Column(name = "hospital_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "image")
    private Blob image;

    @OneToMany(mappedBy = "hospital")
    private List<Doctor> doctors = new ArrayList<Doctor>();

    @Column(name = "filepath")
    private String filepath;

    @Column(name = "Name")
    private String name;

    @Column(name = "About")
    private String about;

    @Column(name = "tags")
    private String tags;

    @Column(name = "Address")
    private String address;

    @Column(name = "pincode")
    private Long pincode;

    @Column(name = "district")
    private String district;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

    @Column(name = "contact")
    private Long contact;

    @Column(name = "email")
    private String email;

    @Column(name = "Head")
    private String head;

    @Column(name = "Departments")
    private String depts;

    public Hospital(){

    }

    public Hospital(String name, List<Doctor> doctors, String email, Long contact, Blob image, String about, String address, String head, String depts, String filepath, Long pincode, String district, String state, String country){
        super();
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.filepath = filepath;
        this.image = image;
        this.address = address;
        this.about = about;
        this.head = head;
        this.doctors = doctors;
        this.depts = depts;
        this.pincode = pincode;
        this.district = district;
        this.state = state;
        this.country = country;
        String temp = "";
        temp += name + ",";
        temp += Long.toString(pincode)+",";
        temp += district+",";
        temp += state+",";
        temp += country;
        this.tags = temp;
    }


    public List<Doctor> getDoctors() {
        return doctors;
    }
    public void setContact(Long contact) {
        this.contact = contact;
    }
    public Long getContact() {
        return contact;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public String getAbout() {
        return about;
    }
    public String getFilepath() {
        return filepath;
    }
    public String getAddress() {
        return address;
    }
    public String getDepts() {
        return depts;
    }
    public String getHead() {
        return head;
    }
    public String getCountry() {
        return country;
    }
    public String getDistrict() {
        return district;
    }
    public Long getPincode() {
        return pincode;
    }
    public String getState() {
        return state;
    }
    public String getTags() {
        return tags;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Blob getImage() {
        return image;
    }
    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }
    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setDistrict(String district) {
        this.district = district;
    }
    public void setPincode(Long pincode) {
        this.pincode = pincode;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setTags(String tags) {
        this.tags = tags;
    }
    public void setImage(Blob image) {
        this.image = image;
    }
    public void setAbout(String about) {
        this.about = about;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setDepts(String depts) {
        this.depts = depts;
    }
    public void setHead(String head) {
        this.head = head;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void addDoctors(Doctor d){
        this.doctors.add(d);
    }

}