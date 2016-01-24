package com.order.admin.service;

import com.order.model.Food;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 16-1-24
 * Time: 11:25
 * To change this template use File | Settings | File Templates.
 */
public interface IFoodService {

    Food findFoodByGuid(String guid);
    void updateFood(Food food);
    void addFood(Food food);
    void deleteFood(Food food);

    void deleteFoodByGuid(String guid);
    List<Food> findAllFoods();

    List<Map<String,Object>> converFoodsToMap(List<Food> foods);
    Map<String,Object> convertFoodToMap(Food food);
}
