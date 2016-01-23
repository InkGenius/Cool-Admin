package com.order.admin.dao;

import com.order.model.User;
/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 15-11-22
 * Time: 下午2:49
 */
public interface IUserDao extends IBaseModelDao<User,Long>{
    /**
     * Check if the user is system user.
     * @param username
     * @param password
     * @return
     */
    boolean checkUser(String username, String password);

    /**
     * Find the unique User by its name.
     * @param username
     * @return
     */
    User findUserByUsername(String username);

    User findUserByEmail(String email);
}
