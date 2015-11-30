package com.order.model;

import java.util.Date;


public class Consume {

    public Consume() {
    }

    public String getDishOne() {
        return dishOne;
    }

    public void setDishOne(String dishOne) {
        this.dishOne = dishOne;
    }

    public int getSpend() {
        return spend;
    }

    public void setSpend(int spend) {
        this.spend = spend;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDishTwo() {
        return dishTwo;
    }

    public void setDishTwo(String dishTwo) {
        this.dishTwo = dishTwo;
    }

    public String getDishThree() {
        return dishThree;
    }

    public void setDishThree(String dishThree) {
        this.dishThree = dishThree;
    }

    public String getDishFour() {
        return dishFour;
    }

    public void setDishFour(String dishFour) {
        this.dishFour = dishFour;
    }

    public String getDishFive() {
        return dishFive;
    }

    public void setDishFive(String dishFive) {
        this.dishFive = dishFive;
    }

    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private int spend;
    private Date date;

    public Consume( int spend, Date date, String location, String dishOne, String dishTwo, String dishThree, String dishFour, String dishFive) {
        this.spend = spend;
        this.date = date;
        this.location = location;
        this.dishOne = dishOne;
        this.dishTwo = dishTwo;
        this.dishThree = dishThree;
        this.dishFour = dishFour;
        this.dishFive = dishFive;
    }

    private String location;

    private String dishOne;
    private String dishTwo;
    private String dishThree;
    private String dishFour;
    private String dishFive;

}
