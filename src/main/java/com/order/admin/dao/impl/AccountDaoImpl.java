package com.order.admin.dao.impl;

import com.order.admin.dao.IAccountDao;
import com.order.model.Account;
import com.order.model.Append;
import com.order.model.Consume;
import com.order.model.Expend;
import org.codehaus.jackson.map.ObjectMapper;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;


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
        Account res = (Account)getSession().createQuery(hsql).list().get(0);
        return res;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public Consume findAccountByDate() {
        Date date = new Date();
        DateFormat df1 = DateFormat.getDateInstance();//日期格式，精确到日
        String dateStr = "\'"+ df1.format(date)+"\'";

        String hql = "from Consume as a WHERE a.date =" + dateStr;

        List consumes = getSession().createQuery(hql).list();
        if(consumes.size() > 0){
            return (Consume)consumes.get(0);
        }
        return null;
    }

    public boolean update(Account account) {
        this.getHibernateTemplate().update(account);
        return true;
    }
    public boolean create(Consume consume) {

        this.getHibernateTemplate().save(consume);
        return true;
    }

    public boolean saveExpend(Expend expend) {
        if(expend != null ){
            System.out.println(expend.getMenu());
        }
        this.getHibernateTemplate().save(expend);
        return true;
    }

    public boolean save(Append append) {
        if (append != null && append.getDate() == null){
            Date date = new Date();
            append.setDate(date);
        }
        this.getHibernateTemplate().save(append);
        return true;
    }


    public Account findUniqueResultByHsql(String hsql) {

        Query query = getSession().createQuery(hsql);

        return (Account)query.uniqueResult();
    }

    private ObjectMapper mapper = new ObjectMapper();
    private Class<Account> entityClass;
}
