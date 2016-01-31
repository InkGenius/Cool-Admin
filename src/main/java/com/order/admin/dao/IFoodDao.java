package com.order.admin.dao;

import com.order.model.Food;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 2016/1/24
 * Time: ионГ10:00
 * To change this template use File | Settings | File Templates.
 */
public interface IFoodDao extends IBaseModelDao<Food,String>{
    List<Food> findFoodByType(String typeGuid);
}
