package com.project.HMS.form;

public class selection_form {

    private Long appid;
    private String selection;

    public selection_form(){}

    public selection_form(Long appid, String selection){
        super();
        this.appid = appid;
        this.selection = selection;
    }

    public Long getAppid() {
        return appid;
    }
    public String getSelection() {
        return selection;
    }
    public void setAppid(Long appid) {
        this.appid = appid;
    }
    public void setSelection(String selection) {
        this.selection = selection;
    }
    
}
