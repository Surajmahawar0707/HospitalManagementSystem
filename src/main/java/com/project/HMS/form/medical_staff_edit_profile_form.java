package com.project.HMS.form;

public class medical_staff_edit_profile_form {
    private String name;
    private Long contact;
    private String email;
    private String password;
    private String dept;
    private String role;
    private String district;
    private String state;
    private String country;
    private Integer age;
    private String address;

    public medical_staff_edit_profile_form(){}

    public medical_staff_edit_profile_form(String name, String password, Long contact, String email, String dept, String role, String district, String state, String country, Integer age, String address){
        super();
        this.name = name;
        this.contact = contact;
        this.password = password;
        this.email = email;
        this.dept = dept;
        this.role = role;
        this.district = district;
        this.state = state;
        this.country = country;
        this.age = age;
        this.address = address;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }    
    public String getAddress() {
        return address;
    }
    public Integer getAge() {
        return age;
    }
    public Long getContact() {
        return contact;
    }
    public String getCountry() {
        return country;
    }
    public String getDept() {
        return dept;
    }
    public String getDistrict() {
        return district;
    }
    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }
    public String getRole() {
        return role;
    }
    public String getState() {
        return state;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public void setContact(Long contact) {
        this.contact = contact;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public void setDistrict(String district) {
        this.district = district;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public void setState(String state) {
        this.state = state;
    }
}
