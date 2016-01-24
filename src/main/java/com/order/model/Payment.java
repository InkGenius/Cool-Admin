package com.order.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 2016/1/23
 * Time: 18:15
 * To change this template use File | Settings | File Templates.
 */
public class Payment implements Serializable {

    public Payment() {
    }

    private String guid;
    private String siteGuid;
    private int amount;
    private Date date;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getSiteGuid() {
        return siteGuid;
    }

    public void setSiteGuid(String siteGuid) {
        this.siteGuid = siteGuid;
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
}
