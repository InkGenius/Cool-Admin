package com.order.model;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 2015/12/5
 * Time: 10:11
 * To change this template use File | Settings | File Templates.
 */
public class Restaurant {

    private long id;
    private String name;
    private String location;
    private String phone;
    private int grade;

    public Restaurant(String name, String location, String phone) {
        this.name = name;
        this.location = location;
        this.phone = phone;
    }

    public Restaurant() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
