package com.order.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by daisong on 2015/11/23.
 */
public class Account implements Serializable {

    public String getGuid(){
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public AccountAlertType getType() {
        return type;
    }

    public void setType(AccountAlertType type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getRemainder() {
        return remainder;
    }

    public void setRemainder(int remainder) {
        this.remainder = remainder;
    }

    public Account() {

    }

    public String getAlertGuid() {
        return alertGuid;
    }

    public void setAlertGuid(String alertGuid) {
        this.alertGuid = alertGuid;
    }

    private String guid;
    private String alertGuid;
    private AccountAlertType type;
    private int amount;
    private Date date;
    private int remainder;


}
