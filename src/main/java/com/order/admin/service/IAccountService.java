package com.order.admin.service;

import com.order.model.Account;
import com.order.model.Consume;

import java.util.Date;

/**
 * Created by daisong on 2015/11/23.
 */
 public interface IAccountService {

      Account findAccountById(long id);

     int getSum();
     int getReminder();
     int getCount();

     boolean consume(Consume consume);
     boolean submit(int amount,int people);

     int getTodayConsume();

}
