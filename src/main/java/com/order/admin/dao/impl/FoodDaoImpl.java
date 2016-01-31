package com.order.admin.dao.impl;

import com.order.admin.dao.IAccountDao;
import com.order.admin.dao.IFoodDao;
import com.order.model.Account;
import com.order.model.Food;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 15-12-22
 * Time: ÉÏÎç8:43
 */
@Repository
public class FoodDaoImpl extends BaseModelDaoImpl<Food,String> implements IFoodDao {

    public List<Food> findFoodByType(String typeGuid) {
        String hsql = "FROM Food where typeGuid = '" + typeGuid + "'";
        Query query = currentSession().createQuery(hsql);
        return query.list();
    }
}
