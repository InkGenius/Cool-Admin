package com.article.admin.dao;

import com.article.model.Account;

import java.io.Serializable;

/**
 * Created by daisong on 2015/11/23.
 */
public interface IAccountService<T extends Serializable,PK extends Serializable> {
    public T findAccountById(PK id);
    public int getSum();
    public int getReminder();
    public int getCount();

    public void consume(int amount);
    public void submit(int amount,int people);
}
