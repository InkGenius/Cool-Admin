package com.article.admin.controller;

import com.article.admin.service.IUserService;
import com.article.model.StepBean;
import com.article.model.Test;
import com.article.model.User;
import com.article.model.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 15-11-23
 * Time: 下午22:39
 * To change this template use File | Settings | File Templates.
*/
@Controller
public class AccountController {

    @RequestMapping(value = "/admin/coo.html",method = RequestMethod.GET)
    public ModelAndView kll(HttpSession session){
        ModelAndView modelAndView = new ModelAndView();



        return modelAndView;
    }
}
