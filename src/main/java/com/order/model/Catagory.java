package com.order.model;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 2015/11/30
 * Time: 21:06
 * To change this template use File | Settings | File Templates.
 */
public class Catagory {

    public Catagory() {
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    private long id;
    private String name;
    private int  type;

    public Catagory(long id, String name, int type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }
}
