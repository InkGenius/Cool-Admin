package com.order.admin.service.impl;

import com.order.admin.dao.IUserDao;
import com.order.admin.service.IUserService;
import com.order.model.User;
import com.order.model.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 15-11-21
 * Time: 下午2:25
 * To change this template use File | Settings | File Templates.
 */
@Service
public class UserServiceImpl implements IUserService {

    public boolean isValidateUser(User user) {
        return isValidateUser(user.getUsername(),user.getPassword());
    }

    public User findUserByEmail(String email) {
        return userDao.findUserByEmail(email);
    }

    public boolean isValidateUser(String username, String password) {
        User user = userDao.findUserByUsername(username);
        if(user != null && user.getPassword().equals(password)){
            return true;
        }

        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public boolean isAdminUser(String username, String password) {
        User user = userDao.findUserByUsername(username);
        if(user != null && user.getPassword().equals(password) && user.getRole() == UserRole.ADMIN){
            return true;
        }
        return false;
    }


    public List<Map<String, Object>> convertUsersToMap(List<User> users) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        for(User user:users){
            list.add(convertUserToMap(user));
        }
        return list;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public Map<String, Object> convertUserToMap(User user) {
        return userDao.convertObjectToMap(user);
    }


    public User findUserByGuid(String guid) {
        return userDao.findByGuid(guid);
    }

    public void updateUser(User user) {
        userDao.update(user);
    }


    public void addUser(User user) {
        userDao.create(user);
    }


    public void deleteUser(User user) {
        userDao.delete(user);
    }


    public void deleteUserByGuid(String guid) {
        userDao.deleteByGuid(guid);
    }

    public List<User> findAllUsers() {
        return userDao.findAll();
    }

    public User findUserByUsername(String username){
        return userDao.findUserByUsername(username);
    }

    @Autowired
    private IUserDao userDao;
}
