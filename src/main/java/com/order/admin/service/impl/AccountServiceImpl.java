package com.order.admin.service.impl;

import com.order.admin.dao.IAccountDao;
import com.order.admin.service.IAccountService;
import com.order.model.Account;
import com.order.model.Consume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by daisong on 2015/11/24.
 */

@Service
public class AccountServiceImpl implements IAccountService{

    @Autowired
    private IAccountDao accountDao;


    public Account findAccountById(long id) {

        return accountDao.findAccountById(id);
    }

    public int getSum() {
       return findAccountById(1).getSum();
    }

    public int getReminder() {

        return findAccountById(1).getRemainder();
    }

    public int getCount() {
        return findAccountById(1).getCount();
    }

    public boolean consume(Consume consume) {
        Account account = findAccountById(1);
        account.setRemainder(account.getRemainder() - consume.getSpend());
        accountDao.update(account);
        accountDao.create(consume);
        return true;
    }

    public boolean submit(int amount, int people) {
        Account account = findAccountById(1);
        account.setRemainder(account.getRemainder() + amount * people);
        account.setCount(account.getCount() + 1);
        account.setSum(account.getSum() + amount * people);
        return true;
    }
}
