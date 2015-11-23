package com.article.admin.service;

import com.article.model.Account;

/**
 * Created by daisong on 2015/11/23.
 */
public interface IAccountService {

    public Account findAccountById();
    public int getSum();
    public int getReminder();
    public int getCount();

    public void consume(int amount);
    public void submit(int amount,int people);

}
