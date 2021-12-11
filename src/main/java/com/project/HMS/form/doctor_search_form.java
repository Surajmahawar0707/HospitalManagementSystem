package com.project.HMS.form;

public class doctor_search_form {

    private String doctor_name;

    public doctor_search_form(){

    }

    public doctor_search_form(String doctor_name){
        super();
        this.doctor_name = doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }
    public String getDoctor_name() {
        return doctor_name;
    }
    
}
