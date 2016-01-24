package com.order.admin.service.impl;

import com.order.admin.dao.IFoodTypeDao;
import com.order.admin.service.IFoodTypeService;
import com.order.model.FoodType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 16-1-24
 * Time: 11:28
 * To change this template use File | Settings | File Templates.
 */
@Service
public class FoodTypeServiceImpl implements IFoodTypeService{

    @Autowired
    private IFoodTypeDao foodTypeDao;

    public FoodType findFoodTypeByGuid(String guid) {
        return foodTypeDao.findByGuid(guid);
    }

    public void updateFoodType(FoodType foodType) {
        foodTypeDao.update(foodType);
    }

    public void addFoodType(FoodType foodType) {
        foodTypeDao.create(foodType);
    }

    public void deleteFoodType(FoodType foodType) {
        foodTypeDao.delete(foodType);
    }

    public void deleteFoodTypeByGuid(String guid) {
        foodTypeDao.deleteByGuid(guid);
    }

    public List<FoodType> findAllFoodTypes() {
        return foodTypeDao.findAll();
    }

    public List<Map<String, Object>> converFoodTypesToMap(List<FoodType> foodTypes) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        for(FoodType foodType:foodTypes){
            list.add(convertFoodTypeToMap(foodType));
        }
        return list;
    }

    public Map<String, Object> convertFoodTypeToMap(FoodType foodType) {
        return foodTypeDao.convertObjectToMap(foodType);
    }
}
