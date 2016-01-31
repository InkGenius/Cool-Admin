package com.order.admin.service;

import com.order.model.Account;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 16-1-24
 * Time: 11:25
 * To change this template use File | Settings | File Templates.
 */
public interface IAccountService {

    Account findAccountByGuid(String guid);
    void updateAccount(Account account);
    void addAccount(Account account);
    void deleteAccount(Account account);

    void deleteAccountByGuid(String guid);
    List<Account> findAllAccounts();

    List<Map<String,Object>> converAccountsToMap(List<Account> accounts);
    Map<String,Object> convertAccountToMap(Account account);
    Account findLatestRecord();
}
