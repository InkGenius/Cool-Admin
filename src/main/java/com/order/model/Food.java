package com.order.model;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 2015/11/28
 * Time: 21:16
 * To change this template use File | Settings | File Templates.
 */
public class Food implements Serializable{

    private String guid;
    private String siteGuid;
    private String typeGuid;
    private String name;
    private int price;
    private String remark;

    public Food() {
    }

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

    public String getTypeGuid() {
        return typeGuid;
    }

    public void setTypeGuid(String typeGuid) {
        this.typeGuid = typeGuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
