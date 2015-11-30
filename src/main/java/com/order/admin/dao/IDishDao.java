package com.order.admin.dao;

import com.order.model.Catagory;
import com.order.model.Dish;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 2015/11/29
 * Time: 21:3
 * To change this template use File | Settings | File Templates.
 */
 public interface IDishDao {

    Dish findDishById(long id);
    Dish findDishByhname(String dishname);

    boolean addDish(Dish dish);

    boolean deleteDishById(long id);
    boolean deleteDishByName(String name);

    boolean updateDish(Dish dish);

    boolean updateScore(String name,int score);
    boolean updateTimes(String name,int times);
    int getPrice(String name);
    boolean setBlack(String name,boolean isBlack);
    boolean setBackup(String name,String message);

    List<Dish> findAllDishes();
    List<Dish> findAllDishesOfRes(String res);
    List<Dish> findAllDishesOfType(int type);
   List<Catagory> findCatagorys();
 }
