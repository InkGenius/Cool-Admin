package com.order.admin.service.impl;

import com.order.admin.dao.IFoodGradeDao;
import com.order.admin.service.IFoodGradeService;
import com.order.model.FoodGrade;
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
public class FoodGradeServiceImpl implements IFoodGradeService{

    @Autowired
    private IFoodGradeDao foodGradeDao;

    public FoodGrade findFoodGradeByGuid(String guid) {
        return foodGradeDao.findByGuid(guid);
    }

    public void updateFoodGrade(FoodGrade foodGrade) {
        foodGradeDao.update(foodGrade);
    }

    public void addFoodGrade(FoodGrade foodGrade) {
        foodGradeDao.create(foodGrade);
    }

    public void deleteFoodGrade(FoodGrade foodGrade) {
        foodGradeDao.delete(foodGrade);
    }

    public void deleteFoodGradeByGuid(String guid) {
        foodGradeDao.deleteByGuid(guid);
    }

    public List<FoodGrade> findAllFoodGrades() {
        return foodGradeDao.findAll();
    }

    public List<Map<String, Object>> converFoodGradesToMap(List<FoodGrade> foodGrades) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        for(FoodGrade foodGrade:foodGrades){
            list.add(convertFoodGradeToMap(foodGrade));
        }
        return list;
    }

    public Map<String, Object> convertFoodGradeToMap(FoodGrade foodGrade) {
        return foodGradeDao.convertObjectToMap(foodGrade);
    }
}
