package com.order.model;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 2015/12/5
 * Time: 10:11
 * To change this template use File | Settings | File Templates.
 */
public class Site {

    private String guid;
    private String name;
    private String location;
    private String phone;

    public Site() {
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
