package com.order.admin.controller;

import com.order.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 15-11-23
 * Time: 下午22:39
 * To change this template use File | Settings | File Templates.
*/
@Controller
public class FoodController {

    @RequestMapping(value = "/admin/dishesManage.html",method = RequestMethod.GET)
    public ModelAndView manageDishes(){

        ModelAndView modelAndView = new ModelAndView(index);
        ModelMap modelMap = modelAndView.getModelMap();

        List<String> contentPages = new ArrayList<String>();
        contentPages.add(dishManage+JSPSUFFIX);
        modelMap.put(CONTENTPAGE,contentPages);

        List<StepBean> steps = new ArrayList<StepBean>();
        steps.add(StepBean.DishesManage);
        modelMap.put(STEPS,steps);

//        List<Dish> dishes = dishService.findAllDishes();
//        modelMap.put(DISHES, dishes);

        List<FoodType> catagorys = dishService.findCatagorys();

        Map<String,List<Food>> map = new HashMap<String, List<Food>>();

        for (FoodType cata : catagorys) {
            List<Food> dishs = dishService.findAllDishesOfType(cata.getType());
            if (dishs.size() > 0) {
                map.put(cata.getName(), dishs);
            }
        }
        modelMap.put(CATAGORYS, map);

        return modelAndView;
    }

    @RequestMapping(value = "/admin/dishSelect.html",method = RequestMethod.GET)
    public ModelAndView selectDishes(){

        ModelAndView modelAndView = new ModelAndView(index);
        ModelMap modelMap = modelAndView.getModelMap();

        List<String> contentPages = new ArrayList<String>();
        contentPages.add(dishSelect+JSPSUFFIX);
        modelMap.put(CONTENTPAGE,contentPages);

        List<StepBean> steps = new ArrayList<StepBean>();
        steps.add(StepBean.DishesManage);
        modelMap.put(STEPS,steps);

        List<FoodType> catagorys = dishService.findCatagorys();

        Map<String,List<Food>> map = new HashMap<String, List<Food>>();

        for (FoodType cata : catagorys) {
            List<Food> dishs = dishService.findAllDishesOfType(cata.getType());
            if (dishs.size() > 0) {
                map.put(cata.getName(), dishs);
            }
        }
        modelMap.put(CATAGORYS, map);

        return modelAndView;
    }

    @RequestMapping(value = "/admin/dishSelect.html",method = RequestMethod.POST)
    public @ResponseBody
    ModelAndView selectDishes(HttpServletRequest req, HttpServletResponse resp){

        ModelAndView modelAndView = new ModelAndView(index);
        ModelMap modelMap = modelAndView.getModelMap();

        List<String> contentPages = new ArrayList<String>();
        contentPages.add(consumption+JSPSUFFIX);
        modelMap.put(CONTENTPAGE,contentPages);

        List<StepBean> steps = new ArrayList<StepBean>();
        steps.add(StepBean.Consumption);
        modelMap.put(STEPS, steps);

        List<Expend> expends = expendService.findAll();
        modelMap.put(EXPENDS, expends);

        String[] dishes = req.getParameterValues("dishes");
        String riches = req.getParameter("riches");

        int sum = 0;
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i< dishes.length;i++){
            String val[] = dishes[i].split(",");
            sb.append(val[0]+" ");
            sum += Integer.parseInt(val[1]);
        }
        sum +=  Integer.parseInt(riches);
        Date date = new Date();
        Expend expend = new Expend(sum,date,"成都小吃",sb.toString());
        accountService.expend(expend);

        return modelAndView;
    }

}
