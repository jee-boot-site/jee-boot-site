package com.boot.model;

import javax.persistence.Entity;

/**
 * Created by Ming on 2016/2/22.
 */
@Entity
public class User {

    private String account;

    private  String password;

    public User(){
        super();
    }
    public User(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
