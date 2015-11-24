package com.article.admin.service;

import com.article.model.Account;

/**
 * Created by daisong on 2015/11/23.
 */
public interface IAccountService {

    public Account findAccountById(long id);

    public int getSum();
    public int getReminder();
    public int getCount();

    public boolean consume(int amount);
    public boolean submit(int amount,int people);

}
