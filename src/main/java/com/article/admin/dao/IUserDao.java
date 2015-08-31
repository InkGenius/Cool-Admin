package com.article.admin.dao;

import com.article.model.User;
/**
 * Created with IntelliJ IDEA.
 * User: yifan
 * Date: 13-11-8
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
}
