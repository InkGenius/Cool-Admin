package com.order.model;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 2015/12/5
 * Time: 10:11
 * To change this template use File | Settings | File Templates.
 */
public class Site implements Serializable {

    private String guid;
    private String name;
    private String location;
    private String phone;
    private int grade;

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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
