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
@Table(name = "operations")
public class Operation {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "patient")
    private Long patient;

    @Column(name = "patient_name")
    private String patient_name;

    @DateTimeFormat(pattern = "yyyy-dd-MM")
    private Date date;

    @Column(name = "doctors")
    private String doctors;

    @Column(name = "time")
    private String time;

    @Column(name = "Hospital")
    private Long hid;

    @Column(name = "Hospital_name")
    private String hname;

    @Column(name = "operation_type")
    public String operation_type;

    @Column(name = "operation_theatre")
    public String operation_theatre;

    @Column(name = "operation_details")
    public String operation_details;

    public Operation(){}

    public Operation(String patient_name, Long hid, String hname, Long patient_id, String doctors, Date date, String time, String operation_type, String operation_details, String operation_theatre){
        super();
        this.hid = hid;
        this.hname = hname;
        this.patient =  patient_id;
        this.patient_name = patient_name;
        this.date = date;
        this.time = time;
        this.doctors = doctors;
        this.operation_details = operation_details;
        this.operation_theatre = operation_theatre;
        this.operation_type = operation_type;
    }

    public Long getHid() {
        return hid;
    }
    public String getHname() {
        return hname;
    }
    public void setHid(Long hid) {
        this.hid = hid;
    }
    public void setHname(String hname) {
        this.hname = hname;
    }
    public Date getDate() {
        return date;
    }
    public String getDoctors() {
        return doctors;
    }
    public Long getId() {
        return id;
    }
    public String getOperation_details() {
        return operation_details;
    }
    public String getOperation_theatre() {
        return operation_theatre;
    }
    public String getOperation_type() {
        return operation_type;
    }
    public Long getPatient() {
        return patient;
    }
    public String getPatient_name() {
        return patient_name;
    }
    public String getTime() {
        return time;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setDoctors(String doctors) {
        this.doctors = doctors;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setOperation_details(String operation_details) {
        this.operation_details = operation_details;
    }
    public void setOperation_theatre(String operation_theatre) {
        this.operation_theatre = operation_theatre;
    }
    public void setOperation_type(String operation_type) {
        this.operation_type = operation_type;
    }
    public void setPatient(Long patient_id) {
        this.patient = patient_id;
    }
    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }
    public void setTime(String time) {
        this.time = time;
    }
}
