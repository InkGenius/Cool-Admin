package com.order.admin.dao.impl;

import com.order.admin.dao.IAccountDao;
import com.order.model.*;
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
 * Created by daisong on 2015/11/23.
 */

@Repository
public class AccountDaoImpl extends BaseModelDaoImpl<Account,Long> implements IAccountDao {

}
