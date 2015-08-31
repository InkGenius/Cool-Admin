package com.article.admin.service.impl;

import com.article.admin.dao.IUserDao;
import com.article.admin.service.IUserService;
import com.article.model.User;
import com.article.model.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: yifan
 * Date: 13-11-12
 * Time: 下午2:25
 * To change this template use File | Settings | File Templates.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Override
    public boolean isValidateUser(User user) {
        return isValidateUser(user.getUsername(),user.getPassword());
    }

    @Override
    public boolean isValidateUser(String username, String password) {
        User user = userDao.findUserByUsername(username);
        if(user != null && user.getPassword().equals(password)){
            return true;
        }

        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isAdminUser(String username, String password) {
        User user = userDao.findUserByUsername(username);
        if(user != null && user.getPassword().equals(password) && user.getRole() == UserRole.ADMIN){
            return true;
        }
        return false;
    }

    @Override
    public List<Map<String, Object>> convertUsersToMap(List<User> users) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        for(User user:users){
            list.add(convertUserToMap(user));
        }
        return list;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Map<String, Object> convertUserToMap(User user) {
        return userDao.convertObjectToMap(user);
    }

    @Override
    public User findUserById(long id) {
        return userDao.findById(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.update(user);
    }

    @Override
    public void addUser(User user) {
        userDao.create(user);
    }

    @Override
    public void deleteUser(User user) {
        userDao.delete(user);
    }

    @Override
    public void deleteUserById(long id) {
        userDao.deleteById(id);
    }

    @Override
    public List<User> findAllUsers() {
        return userDao.findAll();
    }
    @Override
    public User findUserByUsername(String username){
        return userDao.findUserByUsername(username);
    }
    @Autowired
    private IUserDao userDao;
}
