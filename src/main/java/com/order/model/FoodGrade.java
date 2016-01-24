package com.order.model;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 2016/1/24
 * Time: 9:49
 * To change this template use File | Settings | File Templates.
 */
public class FoodGrade implements Serializable {

    private String guid;
    private String payDetailGuid;
    private int grade;
    private String remark;

    public FoodGrade() {
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getPayDetailGuid() {
        return payDetailGuid;
    }

    public void setPayDetailGuid(String payDetailGuid) {
        this.payDetailGuid = payDetailGuid;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
