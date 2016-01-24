package com.order.admin.service;

import com.order.model.User;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 15-12-22
 * Time: 下午2:22
 * To change this template use File | Settings | File Templates.
 */
public interface IUserService {

     User findUserByGuid(String guid);
     User findUserByUsername(String username);
     User findUserByEmail(String email);
     void updateUser(User user);
     void addUser(User user);
     void deleteUser(User user);
     void deleteUserByGuid(String guid);
     List<User> findAllUsers();

     boolean isValidateUser(User user);
     boolean isValidateUser(String username, String password);
     boolean isAdminUser(String username, String password);

     List<Map<String,Object>> convertUsersToMap(List<User> users);
     Map<String,Object> convertUserToMap(User user);
}
