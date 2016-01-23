package com.order.admin.service.impl;

import com.order.admin.dao.IAccountDao;
import com.order.admin.service.IAccountService;
import com.order.model.Account;
import com.order.model.Payment;
import com.order.model.Expend;
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

    public boolean consume(Payment consume) {
        Account account = findAccountById(1);
        account.setRemainder(account.getRemainder() - consume.getSpend());
        accountDao.update(account);
        accountDao.create(consume);
        return true;
    }

    public boolean expend(Expend expend) {
        Account account = findAccountById(1);
        account.setRemainder(account.getRemainder() - expend.getAmount());

        accountDao.update(account);

        accountDao.saveExpend(expend);
        return true;
    }

    public boolean append(int amount) {
        Account account = findAccountById(1);
        account.setRemainder(account.getRemainder() + amount);
        System.out.println("”‡∂Ó£∫"+account.getRemainder());
        account.setCount(account.getCount() + 1);
        account.setSum(account.getSum() + amount);
        accountDao.update(account);

        Append append = new Append(amount);
        accountDao.save(append);

        return true;
    }

    public int getTodayConsume() {
        Payment account = accountDao.findAccountByDate();
        if(account != null){
            return account.getSpend();
        }
        return 0;
    }
}
