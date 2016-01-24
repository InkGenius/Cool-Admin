package com.order.admin.dao.impl;

import com.order.admin.dao.IUserDao;
import com.order.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 15-12-21
 * Time: 下午3:01
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class UserDaoImpl extends BaseModelDaoImpl<User,String> implements IUserDao{

    public boolean checkUser(String username, String password) {
        User user = findUserByUsername(username);

        if(user != null){
            return user.getPassword().equals(password);
        }
        return false;
    }

    public User findUserByEmail(String email) {
        String hsql = "FROM User as u WHERE u.email ='" + email + "'";
        return findUniqueResultByHsql(hsql);
    }

    public User findUserByUsername(String username) {
        String hsql = "FROM User as u WHERE u.username ='" + username + "'";
        return findUniqueResultByHsql(hsql);

    }
}
