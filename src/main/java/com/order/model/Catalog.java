package com.order.model;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 15-11-22
 * Time: 上午8:21
 * To change this template use File | Settings | File Templates.
 */
public class Catalog {

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNavigate() {
        return isNavigate;
    }

    public void setNavigate(boolean navigate) {
        isNavigate = navigate;
    }

    public boolean isImageItem() {
        return isImageItem;
    }

    public void setImageItem(boolean imageItem) {
        isImageItem = imageItem;
    }

    public boolean isSideImage() {
        return isSideImage;
    }

    public void setSideImage(boolean sideImage) {
        isSideImage = sideImage;
    }

    private long id;
    private String name;
    private boolean isNavigate;
    private boolean isImageItem;
    private boolean isSideImage;
}
