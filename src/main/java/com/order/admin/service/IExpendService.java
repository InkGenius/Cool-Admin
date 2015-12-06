package com.order.admin.service;

import com.order.model.Catagory;
import com.order.model.Dish;
import com.order.model.Expend;
import com.order.model.Restaurant;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 2015/12/6
 * Time: 21:31
 * To change this template use File | Settings | File Templates.
 */
 public interface IExpendService {

    List<Expend> findAll();
}
