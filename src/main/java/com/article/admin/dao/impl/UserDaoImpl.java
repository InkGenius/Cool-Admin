package com.article.admin.dao.impl;

import com.article.admin.dao.IUserDao;
import com.article.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 15-11-21
 * Time: 下午3:01
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class UserDaoImpl extends BaseModelDaoImpl<User,Long> implements IUserDao{

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
