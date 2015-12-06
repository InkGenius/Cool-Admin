package com.order.admin.dao;

import com.order.model.Account;
import com.order.model.Append;
import com.order.model.Consume;
import com.order.model.Expend;

/**
 * Created by daisong on 2015/11/23.
 */
public interface IAccountDao {

     Account findAccountById(Long id);
     Consume findAccountByDate();
     boolean update(Account account);
     boolean create(Consume consume);
     boolean saveExpend(Expend expend);
     boolean save(Append append);
}
