package com.order.model;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 2016/1/24
 * Time: 9:53
 * To change this template use File | Settings | File Templates.
 */
public class SiteGrade implements Serializable {
    private String guid;
    private String payGuid;
    private int grade;
    private String remark;

    public SiteGrade() {
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
