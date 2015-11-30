package com.order.model;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 2015/11/28
 * Time: 21:16
 * To change this template use File | Settings | File Templates.
 */
public class Dish {

    public Dish() {
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public String getBackup() {
        return backup;
    }

    public void setBackup(String backup) {
        this.backup = backup;
    }

    public Dish(String name, int price, String restaurant,int type) {
        this.name = name;
        this.price = price;
        this.restaurant = restaurant;
        this.type = type;
    }

    private long id;
    private String name;
    private  int price;
    private String restaurant;
    private int score;
    private int times;
    private boolean black;
    private String backup;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    private int type;


    public boolean isBlack() {
        return black;
    }

    public void setBlack(boolean black) {
        this.black = black;
    }
}
