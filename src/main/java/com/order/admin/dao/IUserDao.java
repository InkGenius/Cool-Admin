package com.order.admin.dao;

import com.order.model.User;
/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 15-11-22
 * Time: 下午2:49
 * To change this template use File | Settings | File Templates.
 */
public interface IUserDao extends IBaseModelDao<User,Long>{
    /**
     * Check if the user is system user.
     *
     * @param username
     * @param password
     * @return
     */
    public boolean checkUser(String username, String password);

    /**
     * Find the unique User by its name.
     * @param username
     * @return
     */
    public User findUserByUsername(String username);

    public User findUserByEmail(String email);
}
