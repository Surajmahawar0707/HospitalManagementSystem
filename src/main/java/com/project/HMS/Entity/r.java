package com.project.HMS.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rids")
public class r {
    @Id
    @Column(name = "email")
    private String email;

    @Column(name = "rid")
    private Long rid;

    @Column(name = "password")
    private String password;

    public r(){}

    public r(String email, String password, Long id){
        super();
        this.rid = id;
        this.email = email;
        this.password = password;
    }
    public Long getId() {
        return rid;
    }
    public void setId(Long id) {
        this.rid = id;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
