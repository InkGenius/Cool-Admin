package com.order.admin.dao;

import com.order.model.Payment;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 2016/1/24
 * Time: ионГ10:05
 * To change this template use File | Settings | File Templates.
 */
public interface IPaymentDao extends IBaseModelDao<Payment,String>{
    Payment getPaymentOfToday();
}
