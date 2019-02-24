package com.dbs.hack2hire.saveyourspare.model;

import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("userName")
    private String userName = "";
    @SerializedName("passWord")
    private String passWord = "";

    public User() {
    }

    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }
}
