package com.article.admin.dao.impl;

import com.article.admin.dao.IAccountDao;
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
@Repository
public class AccountDaoImpl extends HibernateDaoSupport implements IAccountDao {

    @Autowired
    public void setSuperSessionFactory(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }

    public Account findAccountById(Long id) {
        String hsql = "FROM Account as a WHERE a.id =" + id;
        if (findUniqueResultByHsql(hsql) != null){
            return this.getHibernateTemplate().load(getEntityClass(),id);
        }
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public boolean update(Account account) {
        this.getHibernateTemplate().update(account);
        return true;
    }


    public Account findUniqueResultByHsql(String hsql) {

        Query query = getSession().createQuery(hsql);

        return (Account)query.uniqueResult();
    }

    @SuppressWarnings({ "unused", "unchecked" })
    private Class<Account> getEntityClass(){
        if(entityClass==null){
            entityClass = (Class<Account>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        }
        return entityClass;

    }
    private ObjectMapper mapper = new ObjectMapper();
    private Class<Account> entityClass;
}
