package com.order.admin.service;

import com.order.model.FoodType;
import com.order.model.Food;
import com.order.model.Site;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 2015/11/28
 * Time: 21:31
 * To change this template use File | Settings | File Templates.
 */
 public interface IDishService {

    Food findDishById(long id);
    Food findDishByhname(String dishname);

    boolean addDish(Food dish);

    boolean deleteDishById(long id);
    boolean deleteDishByName(String name);

    boolean updateDish(Food dish);

    boolean updateScore(String name,int score);
    boolean updateTimes(String name,int times);
    int getPrice(String name);
    boolean setBlack(String name,boolean isBlack);
    boolean setBackup(String name,String message);

    List<Food> findAllDishesOfType(int type);
    List<Food> findAllDishes();
    List<Food> findAllDishesOfRes(String res);
    List<FoodType> findCatagorys();
    List<Site> findAllRes();
}
