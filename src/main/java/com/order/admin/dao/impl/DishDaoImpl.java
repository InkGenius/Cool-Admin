package com.order.admin.dao.impl;

import com.order.admin.dao.IDishDao;
import com.order.model.Food;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 2015/11/29
 * Time: 21:40
 */
@Repository
public class DishDaoImpl extends BaseModelDaoImpl<Food,Long> implements IDishDao{

    public Food findDishByName(String dishname) {
        String hsql = "FROM Food as a WHERE a.name =" + dishname;
        Food res = (Food)currentSession().createQuery(hsql).list().get(0);
        return res;
    }

    public boolean deleteDishByName(String name) {
        this.currentSession().delete(findDishByName(name));
        return true;
    }

    public boolean updateScore(String name,int score) {
        Food dish = findDishByName(name);
        dish.setScore(score);
        update(dish);
        return true;
    }

    public boolean updateTimes(String name,int times) {
        Food dish = findDishByName(name);
        dish.setTimes(dish.getTimes() + times);
        update(dish);
        return true;
    }

    public int getPrice(String name) {
        Food dish = findDishByName(name);
        return dish.getPrice();
    }

    public boolean setBlack(String name,boolean isBlack) {
        Food dish = findDishByName(name);
        dish.setBlack(isBlack);
        update(dish);
        return true;
    }

    public boolean setBackup(String name,String message) {
        Food dish = findDishByName(name);
        dish.setBackup(message);
        update(dish);
        return true;
    }

    public List<Food> findAllDishesOfRes(String res) {
        String hql = "from Food as a where a.restaurant = " + res;
        return this.currentSession().createQuery(hql).list();
    }

    public List<Food> findAllDishesOfType(int type) {
        String hql = "from Food as a where a.type = " + type;
        return this.currentSession().createQuery(hql).list();
    }

}
