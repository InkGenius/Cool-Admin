package com.order.admin.dao;

import com.order.model.Income;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 2016/1/24
 * Time: ионГ10:04
 * To change this template use File | Settings | File Templates.
 */
public interface IIncomeDao extends IBaseModelDao<Income,String>{
    int getTotal();
}
