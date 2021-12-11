package com.project.HMS.form;


public class new_patient {
    private String name;
    private Long contact;
    private String email;
    private String gender;
    private Integer age;
    private String address;
    private String dd;
    private Long room;
    private String fee;
    private String in;
    private String out;
    private String doctor;

    public new_patient(){}

    public new_patient(String name, Long contact, String email, String gender, Integer age, String address, String dd, Long room, String fee, String in, String out, String doctor){
        super();
        this.address = address;
        this.age = age;
        this.contact = contact;
        this.dd = dd;
        this.doctor = doctor;
        this.email = email;
        this.fee = fee;
        this.gender = gender;
        this.in = in;
        this.name = name;
        this.out = out;
        this.room = room;        
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
    public String getDd() {
        return dd;
    }
    public String getDoctor() {
        return doctor;
    }
    public String getEmail() {
        return email;
    }
    public String getFee() {
        return fee;
    }
    public String getGender() {
        return gender;
    }
    public String getIn() {
        return in;
    }
    public String getName() {
        return name;
    }
    public String getOut() {
        return out;
    }
    public Long getRoom() {
        return room;
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
    public void setDd(String dd) {
        this.dd = dd;
    }
    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setFee(String fee) {
        this.fee = fee;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setIn(String in) {
        this.in = in;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setOut(String out) {
        this.out = out;
    }
    public void setRoom(Long room) {
        this.room = room;
    }
}
