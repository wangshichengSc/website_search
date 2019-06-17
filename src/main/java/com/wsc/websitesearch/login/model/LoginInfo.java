package com.wsc.websitesearch.login.model;


import java.sql.Timestamp;

public class LoginInfo {
    private String loginName;
    private String password;
    private String token;
    private Timestamp timeStamp;

    public LoginInfo() {
        this.timeStamp = new Timestamp(System.currentTimeMillis());
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }
}
