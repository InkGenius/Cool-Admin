package com.order.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 2015/12/6
 * Time: 16:04
 * To change this template use File | Settings | File Templates.
 */
public class Expend implements Serializable{

    private long id;
    private int amount;
    private Date date;
    private String restaurant;
    private String menu;

    public Expend() {
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public Expend(int amount, Date date, String restaurant, String menu) {
        this.amount = amount;
        this.date = date;
        this.restaurant = restaurant;
        this.menu = menu;
    }
}
