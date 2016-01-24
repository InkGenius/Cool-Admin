package com.order.admin.service;

import com.order.model.PayDetail;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 16-1-24
 * Time: 11:25
 * To change this template use File | Settings | File Templates.
 */
public interface IPayDetailService {

    PayDetail findPayDetailByGuid(String guid);
    void updatePayDetail(PayDetail payDetail);
    void addPayDetail(PayDetail payDetail);
    void deletePayDetail(PayDetail payDetail);

    void deletePayDetailByGuid(String guid);
    List<PayDetail> findAllPayDetails();

    List<Map<String,Object>> converPayDetailsToMap(List<PayDetail> payDetails);
    Map<String,Object> convertPayDetailToMap(PayDetail payDetail);
}
