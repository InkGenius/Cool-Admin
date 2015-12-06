package com.order.admin.service.impl;

import com.order.admin.dao.IExpendDao;
import com.order.admin.dao.IUserDao;
import com.order.admin.service.IExpendService;
import com.order.model.Expend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 2015/12/6
 * Time: 20:33
 * To change this template use File | Settings | File Templates.
 */
@Service
public class ExpendServiceImpl implements IExpendService {
    @Autowired
    private IExpendDao expendDao;
    public List<Expend> findAll() {
        return expendDao.findAll();
    }
}
