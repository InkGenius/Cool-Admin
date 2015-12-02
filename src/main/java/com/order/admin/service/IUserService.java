package com.order.admin.service;

import com.order.model.User;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 15-11-22
 * Time: 下午2:22
 * To change this template use File | Settings | File Templates.
 */
public interface IUserService {

    public User findUserById(long id);
    public User findUserByUsername(String username);
    public User findUserByEmail(String email);
    public void updateUser(User user);
    public void addUser(User user);
    public void deleteUser(User user);
    public void deleteUserById(long id);
    public List<User> findAllUsers();

    public boolean isValidateUser(User user);
    public boolean isValidateUser(String username, String password);
    public boolean isAdminUser(String username, String password);

    public List<Map<String,Object>> convertUsersToMap(List<User> users);
    public Map<String,Object> convertUserToMap(User user);
}