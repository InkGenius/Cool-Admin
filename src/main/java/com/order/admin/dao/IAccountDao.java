package com.order.admin.dao;

import com.order.model.Account;
import com.order.model.Consume;

/**
 * Created by daisong on 2015/11/23.
 */
public interface IAccountDao {

    public Account findAccountById(Long id);

    public boolean update(Account account);

    public boolean create(Consume consume);
}
