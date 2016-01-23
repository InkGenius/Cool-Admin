package com.order.admin.dao;

import com.order.model.Food;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 2015/11/29
 * Time: 21:3
 * To change this template use File | Settings | File Templates.
 */
 public interface IDishDao {

    Food findDishByName(String name);
    boolean deleteDishByName(String name);

    boolean updateScore(String name,int score);
    boolean updateTimes(String name,int times);

    int getPrice(String name);

    boolean setBlack(String name,boolean isBlack);
    boolean setBackup(String name,String message);

    List<Food> findAllDishesOfRes(String res);
    List<Food> findAllDishesOfType(int type);
 }
