package com.order.admin.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 1-11-8
 * Time: 上午8:41
 * To change this template use File | Settings | File Templates.
 */
public interface IBaseModelDao<T extends Serializable,PK extends Serializable> {

    boolean create(T t);
    boolean update(T t);
    boolean delete(T t);
    boolean deleteById(PK id);
    T findById(PK id);

    T findUniqueResultByHsql(String sql);
    List<T> findByHql(String hql, Object[] paramters);
    List<T> findAll();
    Map<String,Object> convertObjectToMap(T t);
}
