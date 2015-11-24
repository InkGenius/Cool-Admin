package com.article.admin.dao;

import com.article.model.Account;

import java.io.Serializable;

/**
 * Created by daisong on 2015/11/23.
 */
public interface IAccountDao {

    public Account findAccountById(Long id);

    public boolean update(Account account);

}
