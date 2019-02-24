package com.dbs.hack2hire.saveyourspare.model;

import com.google.gson.annotations.SerializedName;

public class LoginResponse {

    @SerializedName("result")
    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
