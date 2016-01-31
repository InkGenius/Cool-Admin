package com.order.admin.dao.impl;

import com.order.admin.dao.IBaseModelDao;
import com.order.model.Account;
import org.codehaus.jackson.map.ObjectMapper;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 15-12-24
 * Time: 上午8:43
 */
@Transactional
public class BaseModelDaoImpl<T extends Serializable, PK extends Serializable>  implements IBaseModelDao<T,PK> {

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    protected Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    public boolean create(T t) {
        this.currentSession().save(t);
        return true;
    }

    public boolean update(T t) {
        this.currentSession().update(t);
        return true;
    }

    public boolean delete(T t) {
        this.currentSession().delete(t);
        return false;
    }

    public boolean deleteByGuid(PK guid) {
        delete(findByGuid(guid));
        return false;
    }

    public T findByGuid(PK guid) {
        return (T)this.currentSession().load(getEntityClass(), guid);
    }

    public List<T> findByHql(String hsql, Object[] paramters) {
        Query query = currentSession().createQuery(hsql);

        for(int i = 0; i < paramters.length; i++){
            query.setParameter(i,paramters);
        }

        return query.list();
    }

    public T findUniqueResultByHsql(String hsql) {

        Query query = currentSession().createQuery(hsql);

        return (T)query.uniqueResult();
    }

    public List<T> findAll() {
        String hql = "from " + getEntityClass().getSimpleName();
        return this.currentSession().createQuery(hql).list();
    }

    public Map<String, Object> convertObjectToMap(T t) {
        return mapper.convertValue(t,Map.class);
    }


    @SuppressWarnings({ "unused", "unchecked" })
    private Class<T> getEntityClass(){
        if(entityClass==null){
            entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        }
        return entityClass;
    }

    private ObjectMapper mapper = new ObjectMapper();
    private Class<T> entityClass;
}
