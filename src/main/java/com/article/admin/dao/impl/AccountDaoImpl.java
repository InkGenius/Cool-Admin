package com.article.admin.dao.impl;

import com.article.admin.dao.IAccountService;
import com.article.model.Account;
import org.codehaus.jackson.map.ObjectMapper;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

/**
 * Created by Administrator on 2015/11/23.
 */
@Transactional
public class AccountDaoImpl<T extends Serializable, PK extends Serializable> extends HibernateDaoSupport implements IAccountService<T,PK> {

    @Autowired
    public void setSuperSessionFactory(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }

    public T findAccountById(PK id) {
        String hsql = "FROM Account as a WHERE a.id =" + id;
        if (findUniqueResultByHsql(hsql) != null){
            return this.getHibernateTemplate().load(getEntityClass(),id);
        }
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
    public T findUniqueResultByHsql(String hsql) {

        Query query = getSession().createQuery(hsql);

        return (T)query.uniqueResult();
    }

    public int getSum() {
        return 0;
    }

    public int getReminder() {
        return 0;
    }

    public int getCount() {
        return 0;
    }

    public void consume(int amount) {

    }

    public void submit(int amount, int people) {

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
