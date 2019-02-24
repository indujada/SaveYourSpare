package com.dbs.hack2hire.saveyourspare.model;

import com.google.gson.annotations.SerializedName;

public class TransactionDetails {

    @SerializedName("transactionDate")
    private String transactionDate = "";

    @SerializedName("fromAccount")
    private String fromAccount = "";

    @SerializedName("toAccount")
    private String toAccount = "";

    @SerializedName("amountTransferred")
    private String amountTransferred = "";

    @SerializedName("savingsDone")
    private String savingsDone = "";

    @SerializedName("category")
    private String category = "";

    public TransactionDetails(){

    }

    public TransactionDetails(String fromAccount, String toAccount, String amountTransferred, String savingsDone,
                              String category, String transactionDate) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amountTransferred = amountTransferred;
        this.savingsDone = savingsDone;
        this.category = category;
        this.transactionDate = transactionDate;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public String getAmountTransferred() {
        return amountTransferred;
    }

    public void setAmountTransferred(String amountTransferred) {
        this.amountTransferred = amountTransferred;
    }

    public String getSavingsDone() {
        return savingsDone;
    }

    public void setSavingsDone(String savingsDone) {
        this.savingsDone = savingsDone;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
