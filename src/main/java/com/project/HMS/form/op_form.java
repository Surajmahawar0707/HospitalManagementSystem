package com.project.HMS.form;

import java.sql.Date;

public class op_form {
    private String pname;
    private Date date;
    private String time;
    private String op_th;
    private String op_de;
    private String op_ty;

    public op_form(){}

    public op_form(String pname, Date date, String time, String op_ty, String op_de, String op_th){
        super();
        this.pname = pname;
        this.time = time;
        this.date = date;
        this.op_th = op_th;
        this.op_de = op_de;
        this.op_ty = op_ty;
    }

    public Date getDate() {
        return date;
    }
    public String getOp_de() {
        return op_de;
    }
    public String getOp_th() {
        return op_th;
    }
    public String getOp_ty() {
        return op_ty;
    }
    public String getPname() {
        return pname;
    }
    public String getTime() {
        return time;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setOp_de(String op_de) {
        this.op_de = op_de;
    }
    public void setOp_th(String op_th) {
        this.op_th = op_th;
    }
    public void setOp_ty(String op_ty) {
        this.op_ty = op_ty;
    }
    public void setPname(String pname) {
        this.pname = pname;
    }
    public void setTime(String time) {
        this.time = time;
    }
}
