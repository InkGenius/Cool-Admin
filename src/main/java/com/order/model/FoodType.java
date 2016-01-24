package com.order.model;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 2015/11/30
 * Time: 21:06
 * To change this template use File | Settings | File Templates.
 */
public class FoodType implements Serializable {

    public FoodType() {
    }

    private String guid;
    private String siteGuid;
    private String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
