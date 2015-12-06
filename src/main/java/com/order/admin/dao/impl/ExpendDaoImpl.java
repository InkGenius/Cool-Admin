package com.order.admin.dao.impl;

import com.order.admin.dao.IExpendDao;
import com.order.model.Expend;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 2015/12/6
 * Time: 20:38
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class ExpendDaoImpl extends HibernateDaoSupport implements IExpendDao {

    @Autowired
    public void setSuperSessionFactory(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }

    public List<Expend> findAll() {
        String hql = "from Expend ";
        return this.getHibernateTemplate().find(hql);
    }
}
