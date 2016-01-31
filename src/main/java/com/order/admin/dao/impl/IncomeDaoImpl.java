package com.order.admin.dao.impl;

import com.order.admin.dao.IIncomeDao;
import com.order.model.Account;
import com.order.model.Income;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 15-12-22
 * Time: ÉÏÎç8:43
 */
@Repository
public class IncomeDaoImpl extends BaseModelDaoImpl<Income,String> implements IIncomeDao {

    public int getTotal() {
        String hsql = "select sum(amount) from Income";
        Query query = currentSession().createQuery(hsql);
        Object count = query.uniqueResult();
        if(count != null){
            return (Integer)count;
        }else{
            return 0;
        }
    }
}

