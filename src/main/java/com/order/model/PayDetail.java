package com.order.model;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 2016/1/23
 * Time: 18:35
 * To change this template use File | Settings | File Templates.
 */
public class PayDetail {

    private String guid;
    private String payGuid;
    private String foodGuid;

    public PayDetail() {
    }

    public String getGuid() {

        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getPayGuid() {
        return payGuid;
    }

    public void setPayGuid(String payGuid) {
        this.payGuid = payGuid;
    }

    public String getFoodGuid() {
        return foodGuid;
    }

    public void setFoodGuid(String foodGuid) {
        this.foodGuid = foodGuid;
    }
}
