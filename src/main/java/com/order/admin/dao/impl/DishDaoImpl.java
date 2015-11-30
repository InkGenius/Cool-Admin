package com.order.admin.dao.impl;

import com.order.admin.dao.IAccountDao;
import com.order.admin.dao.IDishDao;
import com.order.model.Account;
import com.order.model.Catagory;
import com.order.model.Dish;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 2015/11/29
 * Time: 21:40
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class DishDaoImpl extends HibernateDaoSupport implements IDishDao{

    @Autowired
    public void setSuperSessionFactory(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }

    public Dish findDishById(long id) {
        String hsql = "FROM Dish as a WHERE a.id =" + id;
        Dish res = (Dish)getSession().createQuery(hsql).list().get(0);
        return res;
    }

    public Dish findDishByhname(String dishname) {
        String hsql = "FROM Dish as a WHERE a.name =" + dishname;
        Dish res = (Dish)getSession().createQuery(hsql).list().get(0);
        return res;
    }

    public boolean addDish(Dish dish) {
        this.getHibernateTemplate().save(dish);
        return true;
    }

    public boolean deleteDishById(long id) {
        this.getHibernateTemplate().delete(findDishById(id));
        return true;
    }

    public boolean deleteDishByName(String name) {
        this.getHibernateTemplate().delete(findDishByhname(name));
        return true;
    }

    public boolean updateDish(Dish dish) {
        this.getHibernateTemplate().update(dish);
        return true;
    }

    public boolean updateScore(String name,int score) {
        Dish dish = findDishByhname(name);
        dish.setScore(score);
        updateDish(dish);
        return true;
    }

    public boolean updateTimes(String name,int times) {
        Dish dish = findDishByhname(name);
        dish.setTimes(dish.getTimes() + times);
        updateDish(dish);
        return true;
    }

    public int getPrice(String name) {
        Dish dish = findDishByhname(name);
        return dish.getPrice();
    }

    public boolean setBlack(String name,boolean isBlack) {
        Dish dish = findDishByhname(name);
        dish.setBlack(isBlack);
        updateDish(dish);
        return true;
    }

    public boolean setBackup(String name,String message) {
        Dish dish = findDishByhname(name);
        dish.setBackup(message);
        updateDish(dish);
        return true;
    }

    public List<Dish> findAllDishes() {
        String hql = "from Dish";
        return this.getHibernateTemplate().find(hql);
    }

    public List<Dish> findAllDishesOfRes(String res) {
        String hql = "from Dish as a where a.restaurant = " + res;
        return this.getHibernateTemplate().find(hql);
    }

    public List<Dish> findAllDishesOfType(int type) {
        String hql = "from Dish as a where a.type = " + type;
        return this.getHibernateTemplate().find(hql);
    }

    public List<Catagory> findCatagorys() {
        String hql = "from Catagory";
        return this.getHibernateTemplate().find(hql);
    }
}
