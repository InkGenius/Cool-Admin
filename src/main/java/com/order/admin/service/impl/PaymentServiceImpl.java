package com.order.admin.service.impl;

import com.order.admin.dao.IPaymentDao;
import com.order.admin.service.IPaymentService;
import com.order.model.Payment;
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
public class PaymentServiceImpl implements IPaymentService{

    @Autowired
    private IPaymentDao paymentDao;

    public Payment findPaymentByGuid(String guid) {
        return paymentDao.findByGuid(guid);
    }

    public void updatePayment(Payment payment) {
        paymentDao.update(payment);
    }

    public void addPayment(Payment payment) {
        paymentDao.create(payment);
    }

    public void deletePayment(Payment payment) {
        paymentDao.delete(payment);
    }

    public void deletePaymentByGuid(String guid) {
        paymentDao.deleteByGuid(guid);
    }

    public List<Payment> findAllPayments() {
        return paymentDao.findAll();
    }

    public List<Map<String, Object>> converPaymentsToMap(List<Payment> payments) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        for(Payment payment:payments){
            list.add(convertPaymentToMap(payment));
        }
        return list;
    }

    public Map<String, Object> convertPaymentToMap(Payment payment) {
        return paymentDao.convertObjectToMap(payment);
    }

    public Payment getPaymentOfToday() {
        return paymentDao.getPaymentOfToday();
    }

}
