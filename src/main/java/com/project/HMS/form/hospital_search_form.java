package com.project.HMS.form;

public class hospital_search_form {
    
    public String hospital_name;

    public hospital_search_form(){

    }

    public hospital_search_form(String hospital_name){
        super();
        this.hospital_name = hospital_name;
    }

    public String getHospital_name() {
        return hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        this.hospital_name = hospital_name;
    }
    
}
