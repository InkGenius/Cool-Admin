package com.order.admin.service;

import com.order.model.Account;
import com.order.model.Consume;

/**
 * Created by daisong on 2015/11/23.
 */
public interface IAccountService {

    public Account findAccountById(long id);

    public int getSum();
    public int getReminder();
    public int getCount();

    public boolean consume(Consume consume);
    public boolean submit(int amount,int people);

}
