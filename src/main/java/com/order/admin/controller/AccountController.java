//package com.order.admin.controller;
//
//import com.order.model.Payment;
//import com.order.model.Site;
//import com.order.model.StepBean;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
///**
// * Created with IntelliJ IDEA.
// * User: daisong
// * Date: 15-11-23
// * Time: 下午22:39
// * To change this template use File | Settings | File Templates.
//*/
//@Controller
//public class AccountController {
//
//    @RequestMapping(value = "/admin/expense.html", method = RequestMethod.GET)
//    public ModelAndView expense(){
//        ModelAndView modelAndView = new ModelAndView();
//        List<Site> resList = dishService.findAllRes();
//        ModelMap modelMap = modelAndView.getModelMap();
//        modelMap.put(RESTAURANT, resList);
//        modelAndView.setViewName(expense);
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/admin/expense.html", method = RequestMethod.POST)
//    public ModelAndView expense(String expense,String location,String dishOne, String dishTwo,String dishThree,String dishFour,String dishFive){
//        Date date = new Date();
//        //System.out.println("test:"+expense + " "+ dishOne);
//        Payment consume = new Payment(Integer.parseInt(expense),date,location,dishOne,dishTwo,dishThree,dishFour,dishFive);
//        accountService.consume(consume);
//        return index();
//    }
//
//    @RequestMapping(value = "/admin/append.html", method = RequestMethod.GET)
//    public ModelAndView append(){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName(append);
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/admin/append.html", method = RequestMethod.POST)
//    public ModelAndView append(String append){
//        Date date = new Date();
//        accountService.append(Integer.parseInt(append));
//        return index();
//    }
//
//    @RequestMapping(value = "/admin/record.html",method = RequestMethod.GET)
//    public ModelAndView manageRecord(){
//
//        ModelAndView modelAndView = new ModelAndView(index);
//        ModelMap modelMap = modelAndView.getModelMap();
//
//        List<String> contentPages = new ArrayList<String>();
//        contentPages.add(consumption+JSPSUFFIX);
//        modelMap.put(CONTENTPAGE,contentPages);
//
//        List<StepBean> steps = new ArrayList<StepBean>();
//        steps.add(StepBean.Consumption);
//        modelMap.put(STEPS, steps);
//
//        List<Expend> expends = expendService.findAll();
//        modelMap.put(EXPENDS, expends);
//
//        return modelAndView;
//    }
//}
