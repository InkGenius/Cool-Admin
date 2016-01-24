package com.order.admin.service;

import com.order.model.FoodGrade;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 16-1-24
 * Time: 11:25
 * To change this template use File | Settings | File Templates.
 */
public interface IFoodGradeService {

    FoodGrade findFoodGradeByGuid(String guid);
    void updateFoodGrade(FoodGrade foodGrade);
    void addFoodGrade(FoodGrade foodGrade);
    void deleteFoodGrade(FoodGrade foodGrade);

    void deleteFoodGradeByGuid(String guid);
    List<FoodGrade> findAllFoodGrades();

    List<Map<String,Object>> converFoodGradesToMap(List<FoodGrade> foodGrades);
    Map<String,Object> convertFoodGradeToMap(FoodGrade foodGrade);
}
