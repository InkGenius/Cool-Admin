package com.order.admin.dao;

import com.order.model.Account;
import com.order.model.Append;
import com.order.model.Consume;

/**
 * Created by daisong on 2015/11/23.
 */
public interface IAccountDao {

     Account findAccountById(Long id);
     Consume findAccountByDate();
     boolean update(Account account);
     boolean create(Consume consume);
     boolean save(Append append);
}
