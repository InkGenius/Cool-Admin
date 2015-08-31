package com.article.admin.controller;

import com.article.admin.dao.IUserDao;
import com.article.admin.service.IUserService;
import com.article.model.StepBean;
import com.article.model.User;
import com.article.model.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import sun.org.mozilla.javascript.internal.ast.IfStatement;

import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 13-11-8
 * Time: 下午1:31
 * To change this template use File | Settings | File Templates.
*/
@Controller
public class UserController {


    @RequestMapping(value = "/admin/login.html",method = RequestMethod.GET)
    public ModelAndView login(HttpSession session){
        ModelAndView modelAndView = new ModelAndView();

        if(session.getAttribute(USERNAME) != null){
            modelAndView = index();
        } else {
            modelAndView.setViewName(login);
        }

        return modelAndView;
    }

    @RequestMapping(value = "/admin/login.html",method = RequestMethod.POST)
    public ModelAndView loginIn(HttpSession session,String username,String password){

        ModelAndView target = new ModelAndView();

        if(isValidUser(username,password)){
            session.setAttribute(USERNAME,username);
            target = index();
        } else {
            ModelMap modelMap = target.getModelMap();
            modelMap.put(ERRORMSG,"用户名或密码错误");
            target.setViewName(login);
        }

        return target;
    }

    @RequestMapping(value = "/admin/index.html",method = RequestMethod.GET)
    public ModelAndView index(){

        ModelAndView modelAndView = new ModelAndView(index);
        ModelMap modelMap = modelAndView.getModelMap();

        List<User> users = userService.findAllUsers();
        modelMap.put(USERS, users);

        List<String> contentPages = new ArrayList<String>();
        contentPages.add(dashboard + JSPSUFFIX);
        contentPages.add(userManage + JSPSUFFIX);
        modelMap.put(CONTENTPAGE,contentPages);

        List<StepBean> emptyStepBean = Collections.emptyList();
        modelMap.put(STEPS,emptyStepBean);

        return modelAndView;
    }

    @RequestMapping(value = "/admin/updateUser.html",method = RequestMethod.GET)
    public ModelAndView ajaxUpdateUser(long id){
        User currentUser = userService.findUserById(id);
        ModelAndView modelAndView = new ModelAndView(userInfo);
        ModelMap modelMap = modelAndView.getModelMap();
        modelMap.put(USER,currentUser);
        modelMap.put(ROLE, UserRole.values());

        return modelAndView;
    }
    @RequestMapping(value = "/admin/updateUser.html",method = RequestMethod.POST)
    public ModelAndView updateUser(long id,String realName,String phoneNumber,String email,String roleText){

        User user = userService.findUserById(id);
        user.setRealName(realName);
        user.setPhoneNumber(phoneNumber);
        user.setEmail(email);
        user.setRole(roleText);
        userService.updateUser(user);

        return index();
    }

    @RequestMapping(value = "/admin/deleteUser.html")
    public ModelAndView deleteUser(long id){

        User user = userService.findUserById(id);
        if(user != null){
            userService.deleteUserById(id);
        }

        return index();
    }

    @RequestMapping(value = "/admin/addUser.html", method = RequestMethod.GET)
    public ModelAndView addUser(){
        ModelAndView modelAndView = new ModelAndView();
        ModelMap modelMap = modelAndView.getModelMap();
        modelMap.put(ROLE, UserRole.values());
        modelAndView.setViewName(createUser);

        return modelAndView;
    }

    @RequestMapping(value = "/admin/addUser.html",method = RequestMethod.POST)
    public ModelAndView addUser(String username,String password,String realName,
                                String email,String phoneNumber,String roleText){
        User user = userService.findUserByUsername(username);
        if(user == null){
            User newUser = new User(username,password, realName,email,phoneNumber, roleText,new Date());
            userService.addUser(newUser);
        }

        return index();
    }

    @RequestMapping(value = "/admin/userManage.html",method = RequestMethod.GET)
    public ModelAndView manageUser(){

        ModelAndView modelAndView = new ModelAndView(index);
        ModelMap modelMap = modelAndView.getModelMap();

        List<String> contentPages = new ArrayList<String>();
        contentPages.add(userManage+JSPSUFFIX);
        modelMap.put(CONTENTPAGE,contentPages);

        List<StepBean> steps = new ArrayList<StepBean>();
        steps.add(StepBean.UserManage);
        modelMap.put(STEPS,steps);

        List<User> users = userService.findAllUsers();
//        List<Map<String,Object>> userMapList = userService.convertUsersToMap(users);
//        for(Map<String,Object> map : userMapList){
//            Iterator<String> iter = map.keySet().iterator();
//            while (iter.hasNext()) {
//                System.out.println(iter.next());
//            }
//        }
        modelMap.put(USERS, users);

        return modelAndView;
    }

    @RequestMapping(value = "/admin/logout.html")
    public String logout(HttpSession session){
        session.removeAttribute(USERNAME);
        return login;
    }

    private boolean isValidUser(String username,String password){
        return userService.isValidateUser(username, password);
    }


    public static final String CONTENTPAGE = "contentpages";
    public static final String ROLE = "roles";
    public static final String USERS = "users";
    public static final String USER= "user";
    public static final String USERNAME = "username";
    public static final String ERRORMSG = "error";
    public static final String STEPS = "steps";
    public static final String JSPSUFFIX = ".jsp";


    @Value("dashboard")
    private String dashboard;

    @Value("userManage")
    private String userManage;

    @Value("/admin/mainFrame")
    private String mainFrame;

    @Value("/admin/createUserDialog")
    private String createUser;

    @Value("/admin/userInfo")
    private String userInfo;

    @Value("/admin/login")
    private String login;

    @Value("/admin/index")
    private String index;

    @Autowired
    private IUserService userService;
}
