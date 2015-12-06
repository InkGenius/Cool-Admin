package com.order.admin.service;

import com.order.model.Account;
import com.order.model.Consume;
import com.order.model.Expend;

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
     boolean expend(Expend expend);
     boolean append(int amount);

     int getTodayConsume();

}
