package com.project.HMS.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @Column(name = "Patient_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Contact")
    private long contact;

    @Column(name = "Email")
    private String email;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "Age")
    private Integer age;

    @Column(name = "Address")
    private String address;

    @Column(name = "Disease_discription")
    private String disease_description;

    @Column(name = "Room")
    private long room;

    @Column(name = "Fee_Details")
    private String fee_details;

    @Column(name = "In_Time")
    private String in_time;

    @Column(name = "Out_Time")
    private String out_time;

    @Column(name = "Treated_by")
    private Long did;

    @Column(name = "Treated_in")
    private Long hid;

    public Patient(){

    }

    public Patient(String name, Long contact, String email, String gender, Integer age, String address, String disease_description, Long room, String fee_details, String in_time, String out_time, Long treated_by, Long treated_in){
        super();
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.disease_description = disease_description;
        this.room = room;
        this.fee_details = fee_details;
        this.in_time = in_time;
        this.out_time = out_time;
        this.did = treated_by;
        this.hid = treated_in;
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
    public String getDisease_description() {
        return disease_description;
    }
    public String getEmail() {
        return email;
    }
    public String getFee_details() {
        return fee_details;
    }
    public String getGender() {
        return gender;
    }
    public Long getId() {
        return id;
    }
    public String getIn_time() {
        return in_time;
    }
    public String getName() {
        return name;
    }
    public String getOut_time() {
        return out_time;
    }
    public long getRoom() {
        return room;
    }
    public Long getDid() {
        return did;
    }
    public Long getHid() {
        return hid;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setDid(Long did) {
        this.did = did;
    }
    public void setHid(Long hid) {
        this.hid = hid;
    }
    public void setRoom(long room) {
        this.room = room;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public void setContact(long contact) {
        this.contact = contact;
    }
    public void setDisease_description(String disease_description) {
        this.disease_description = disease_description;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setFee_details(String fee_details) {
        this.fee_details = fee_details;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setIn_time(String in_time) {
        this.in_time = in_time;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setOut_time(String out_time) {
        this.out_time = out_time;
    }

    
}