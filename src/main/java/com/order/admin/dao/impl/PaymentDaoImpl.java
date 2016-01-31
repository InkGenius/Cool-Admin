package com.order.admin.dao.impl;

import com.order.admin.dao.IPaymentDao;
import com.order.model.Account;
import com.order.model.Payment;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 16-01-31
 * Time: ÉÏÎç8:43
 */
@Repository
public class PaymentDaoImpl extends BaseModelDaoImpl<Payment,String> implements IPaymentDao {

    public Payment getPaymentOfToday() {
        Date date = new Date();
        String hsql = "FROM Payment where date =:date";
        Query query = currentSession().createQuery(hsql);
        query.setDate("date",date);
        return (Payment)query.uniqueResult();
    }
}
