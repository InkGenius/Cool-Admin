package com.order.admin.service;

import com.order.model.Account;
import com.order.model.Payment;
import com.order.model.Expend;

/**
 * Created by daisong on 2015/11/23.
 */
 public interface IAccountService {

      Account findAccountById(long id);

     int getSum();
     int getReminder();
     int getCount();

     boolean consume(Payment consume);
     boolean expend(Expend expend);
     boolean append(int amount);

     int getTodayConsume();

}
