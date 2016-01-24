package com.order.admin.service;

import com.order.model.FoodType;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 16-1-24
 * Time: 11:25
 * To change this template use File | Settings | File Templates.
 */
public interface IFoodTypeService {

    FoodType findFoodTypeByGuid(String guid);
    void updateFoodType(FoodType foodType);
    void addFoodType(FoodType foodType);
    void deleteFoodType(FoodType foodType);

    void deleteFoodTypeByGuid(String guid);
    List<FoodType> findAllFoodTypes();

    List<Map<String,Object>> converFoodTypesToMap(List<FoodType> foodTypes);
    Map<String,Object> convertFoodTypeToMap(FoodType foodType);
}
