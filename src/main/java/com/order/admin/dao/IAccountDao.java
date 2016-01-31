package com.order.admin.dao;

import com.order.model.Account;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 15-12-23
 * Time: ионГ8:43
 */
public interface IAccountDao  extends IBaseModelDao<Account,String>{
    Account findLatestRecord();
}
