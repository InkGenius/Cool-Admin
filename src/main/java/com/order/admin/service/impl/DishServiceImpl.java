package com.order.admin.service.impl;

import com.order.admin.dao.IDishDao;
import com.order.admin.service.IDishService;
import com.order.model.FoodType;
import com.order.model.Food;
import com.order.model.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 2015/11/29
 * Time: 21:55
 * To change this template use File | Settings | File Templates.
 */
@Service
public class DishServiceImpl implements IDishService {

    @Autowired
    private IDishDao dishDao;

    public Food findDishById(long id) {
        return dishDao.findDishById(id);
    }

    public Food findDishByhname(String name) {
        return dishDao.findDishByhname(name);
    }

    public boolean addDish(Food dish) {
        return dishDao.addDish(dish);
    }

    public boolean deleteDishById(long id) {
        return dishDao.deleteDishById(id);
    }

    public boolean deleteDishByName(String name) {
        return dishDao.deleteDishByName(name);
    }

    public boolean updateDish(Food dish) {
        return dishDao.updateDish(dish);
    }

    public boolean updateScore(String name, int score) {
        return dishDao.updateScore(name,score);
    }

    public boolean updateTimes(String name, int times) {
        return dishDao.updateTimes(name,times);
    }


    public int getPrice(String name) {
        return dishDao.getPrice(name);
    }

    public boolean setBlack(String name, boolean isBlack) {
        return dishDao.setBlack(name,isBlack);
    }

    public boolean setBackup(String name, String message) {
        return dishDao.setBackup(name, message);
    }

    public List<Food> findAllDishesOfType(int type) {
        return dishDao.findAllDishesOfType(type);
    }

    public List<Food> findAllDishes() {
        return dishDao.findAllDishes();
    }

    public List<Food> findAllDishesOfRes(String res) {
        return dishDao.findAllDishesOfRes(res);
    }

    public List<FoodType> findCatagorys() {
        return dishDao.findCatagorys();
    }

    public List<Site> findAllRes() {
        return dishDao.findAllRes();
    }

}
