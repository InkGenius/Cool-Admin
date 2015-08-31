package com.article.admin.dao.impl;

import com.article.admin.dao.IBaseModelDao;
import org.codehaus.jackson.map.ObjectMapper;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: yifan
 * Date: 13-11-8
 * Time: 上午8:43
 * To change this template use File | Settings | File Templates.
 * TODO:    to implements the base model add、update、delete、search basic actions.
 */
@Transactional
public class BaseModelDaoImpl<T extends Serializable, PK extends Serializable> extends HibernateDaoSupport implements IBaseModelDao<T,PK> {

    @Autowired
    public void setSuperSessionFactory(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }

    @Override
    public boolean create(T t) {
        this.getHibernateTemplate().save(t);

        return true;    //TODO: If there need to update.
    }

    @Override
    public boolean update(T t) {
        this.getHibernateTemplate().update(t);

        return true;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean delete(T t) {
        this.getHibernateTemplate().delete(t);

        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean deleteById(PK id) {
        delete(findById(id));
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public T findById(PK id) {
        String hsql = "FROM User as u WHERE u.id =" + id;
        if (findUniqueResultByHsql(hsql) != null){
            return this.getHibernateTemplate().load(getEntityClass(),id);
        }
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<T> findByHql(String hsql, Object[] paramters) {
        Query query = getSession().createQuery(hsql);

        for(int i = 0; i < paramters.length; i++){
            query.setParameter(i,paramters);
        }

        return query.list();  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public T findUniqueResultByHsql(String hsql) {

        Query query = getSession().createQuery(hsql);

        return (T)query.uniqueResult();
    }

    @Override
    public List<T> findAll() {
        String hql = "from " + getEntityClass().getSimpleName();

        return this.getHibernateTemplate().find(hql);
    }

    @Override
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
