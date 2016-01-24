package com.order.admin.service.impl;

import com.order.admin.dao.IFoodDao;
import com.order.admin.service.IFoodService;
import com.order.model.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 16-1-24
 * Time: 11:25
 * To change this template use File | Settings | File Templates.
 */
@Service
public class FoodServiceImpl implements IFoodService{

    @Autowired
    private IFoodDao foodDao;

    public Food findFoodByGuid(String guid) {
        return foodDao.findByGuid(guid);
    }

    public void updateFood(Food food) {
        foodDao.update(food);
    }

    public void addFood(Food food) {
        foodDao.create(food);
    }

    public void deleteFood(Food food) {
        foodDao.delete(food);
    }

    public void deleteFoodByGuid(String guid) {
        foodDao.deleteByGuid(guid);
    }

    public List<Food> findAllFoods() {
        return foodDao.findAll();
    }

    public List<Map<String, Object>> converFoodsToMap(List<Food> foods) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        for(Food Food:foods){
            list.add(convertFoodToMap(Food));
        }
        return list;
    }

    public Map<String, Object> convertFoodToMap(Food food) {
        return foodDao.convertObjectToMap(food);
    }
}
