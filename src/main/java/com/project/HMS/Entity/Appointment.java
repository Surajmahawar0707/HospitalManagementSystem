package com.project.HMS.Entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "appointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Appointment_id")
    private Long id;

    @Column(name = "fname")
    private String fname;

    @Column(name = "lname")
    private String lname;

    @Column(name = "contact")
    private Long contact;

    @Column(name = "email")
    private String email;

    @Column(name = "Appointment_of_user")
    private String user;

    @Column(name = "Appointment_with_doctor")
    private Long doctorid;

    @DateTimeFormat(pattern = "yyyy-dd-MM")
    private Date date;

    @Column(name = "doctor_name")
    private String doctorname;

    @Column(name = "time")
    private String time;

    @Column(name = "status")
    private String status;

    @Column(name = "Description")
    private String description;

    @Column(name = "Doctor_prescription")
    private String d_p;

    @Column(name = "Hospital")
    private Long hid;

    public Appointment(){

    }

    public Appointment(Long id, String user_id, Long hid, String doctorname, String time, String status, String fname, String lname, Long contact, String email, Long doctor_id, Date date, String doc_pres, String description){
        super();
        this.id = id;
        this.user = user_id;
        this.hid = hid;
        this.doctorname = doctorname;
        this.status = status;
        this.time = time;
        this.fname = fname;
        this.lname = lname;
        this.contact = contact;
        this.email = email;
        this.doctorid = doctor_id;
        this.description = description;
        this.d_p = doc_pres;
        this.date = date;
    } 

    public Long getHid() {
        return hid;
    }
    public void setHid(Long hid) {
        this.hid = hid;
    }
    public String getTime() {
        return time;
    }
    public String getDoctorname() {
        return doctorname;
    }
    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
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
    public String getDescription() {
        return description;
    }
    public Long getDoctorid() {
        return doctorid;
    }

    public String getUser() {
        return user;
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
    
    public String getD_p() {
        return d_p;
    }

    public Long getId() {
        return id;
    }

    public Date getDate() {
        return date;
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
    
    public void setDescription(String description) {
        this.description = description;
    }

    public void setDoctorid(Long doctor_id) {
        this.doctorid = doctor_id;
    }

    public void setUser(String user_id) {
        this.user = user_id;
    }

    public void setD_p(String d_p) {
        this.d_p = d_p;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
