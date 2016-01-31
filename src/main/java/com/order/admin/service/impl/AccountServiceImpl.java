package com.order.admin.service.impl;

import com.order.admin.dao.IAccountDao;
import com.order.admin.service.IAccountService;
import com.order.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 16-1-24
 * Time: ÏÂÎç2:25
 * To change this template use File | Settings | File Templates.
 */
@Service
public class AccountServiceImpl  implements IAccountService{

    @Autowired
    private IAccountDao accountDao;

    public Account findAccountByGuid(String guid) {
        return accountDao.findByGuid(guid);
    }

    public void updateAccount(Account account) {
        accountDao.update(account);
    }

    public void addAccount(Account account) {
        accountDao.create(account);
    }

    public void deleteAccount(Account account) {
        accountDao.delete(account);
    }

    public void deleteAccountByGuid(String guid) {
        accountDao.deleteByGuid(guid);
    }

    public List<Account> findAllAccounts() {
        return accountDao.findAll();
    }

    public List<Map<String, Object>> converAccountsToMap(List<Account> accounts) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        for(Account account:accounts){
            list.add(convertAccountToMap(account));
        }
        return list;
    }

    public Map<String, Object> convertAccountToMap(Account account) {
        return accountDao.convertObjectToMap(account);
    }

    public Account findLatestRecord() {
        return accountDao.findLatestRecord();
    }
}
