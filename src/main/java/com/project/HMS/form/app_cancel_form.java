package com.project.HMS.form;

public class app_cancel_form {
    private Long appid;
    public app_cancel_form(){}

    public app_cancel_form(Long appid){
        super();
        this.appid = appid;
    }

    public Long getAppid() {
        return appid;
    }
    public void setAppid(Long appid) {
        this.appid = appid;
    }
}
