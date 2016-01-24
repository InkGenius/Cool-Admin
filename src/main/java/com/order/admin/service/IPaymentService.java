package com.order.admin.service;

import com.order.model.Payment;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 16-1-24
 * Time: 11:25
 * To change this template use File | Settings | File Templates.
 */
public interface IPaymentService {

    Payment findPaymentByGuid(String guid);
    void updatePayment(Payment payment);
    void addPayment(Payment payment);
    void deletePayment(Payment payment);

    void deletePaymentByGuid(String guid);
    List<Payment> findAllPayments();

    List<Map<String,Object>> converPaymentsToMap(List<Payment> payments);
    Map<String,Object> convertPaymentToMap(Payment payment);
}
