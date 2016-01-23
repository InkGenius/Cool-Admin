package com.order.model;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 16-1-23
 * Time: 下午17:52
 * To change this template use File | Settings | File Templates.
 */
public enum AccountAlertType {

    CONSUME(0),INCOME(1);

    private int type;

    AccountAlertType(int type){
        this.type = type;
    }

    public int getType(){
        return this.type;
    }

    public static AccountAlertType getObjectByType(int type){
        AccountAlertType[] types = values();
        for(AccountAlertType account : types){
            if(account.type == type){
                return account;
            }
        }
        return null;
    }
}
