package com.order.admin.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: yifan
 * Date: 13-11-8
 * Time: 上午8:41
 * To change this template use File | Settings | File Templates.
 */
public interface IBaseModelDao<T extends Serializable,PK extends Serializable> {

    public boolean create(T t);
    public boolean update(T t);
    public boolean delete(T t);
    public boolean deleteById(PK id);
    public T findById(PK id);

    public T findUniqueResultByHsql(String sql);
    public List<T> findByHql(String hql, Object[] paramters);
    public List<T> findAll();

    public Map<String,Object> convertObjectToMap(T t);
}
