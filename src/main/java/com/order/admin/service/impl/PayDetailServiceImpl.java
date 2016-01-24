package com.order.admin.service.impl;

import com.order.admin.dao.IPayDetailDao;
import com.order.admin.service.IPayDetailService;
import com.order.model.PayDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 16-1-24
 * Time: 11:25
 * To change this template use File | Settings | File Templates.
 */
@Service
public class PayDetailServiceImpl implements IPayDetailService{

    @Autowired
    private IPayDetailDao payDetailDao;

    public PayDetail findPayDetailByGuid(String guid) {
        return payDetailDao.findByGuid(guid);
    }

    public void updatePayDetail(PayDetail payDetail) {
        payDetailDao.update(payDetail);
    }

    public void addPayDetail(PayDetail payDetail) {
        payDetailDao.create(payDetail);
    }

    public void deletePayDetail(PayDetail payDetail) {
        payDetailDao.delete(payDetail);
    }

    public void deletePayDetailByGuid(String guid) {
        payDetailDao.deleteByGuid(guid);
    }

    public List<PayDetail> findAllPayDetails() {
        return payDetailDao.findAll();
    }

    public List<Map<String, Object>> converPayDetailsToMap(List<PayDetail> payDetails) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        for(PayDetail payDetail:payDetails){
            list.add(convertPayDetailToMap(payDetail));
        }
        return list;
    }

    public Map<String, Object> convertPayDetailToMap(PayDetail payDetail) {
        return payDetailDao.convertObjectToMap(payDetail);
    }
}
