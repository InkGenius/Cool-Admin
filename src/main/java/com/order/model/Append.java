package com.order.model;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 2015/12/3
 * Time: 21:57
 * To change this template use File | Settings | File Templates.
 */
public class Append {

    public Append() {
    }

    private long id;

    public Append(int amount) {
        this.amount = amount;
    }

    private int amount;
    private Date date;

    //±¸Ñ¡×Ö¶Î
    //private List<User> users;

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
}
