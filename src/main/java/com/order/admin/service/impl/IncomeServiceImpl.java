package com.order.admin.service.impl;

import com.order.admin.dao.IIncomeDao;
import com.order.admin.service.IIncomeService;
import com.order.model.Income;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 16-1-24
 * Time: 11:25
 * To change this template use File | Settings | File Templates.
 */
@Service
public class IncomeServiceImpl implements IIncomeService{

    @Autowired
    private IIncomeDao incomeDao;

    public Income findIncomeByGuid(String guid) {
        return incomeDao.findByGuid(guid);
    }

    public void updateIncome(Income income) {
        incomeDao.update(income);
    }

    public void addIncome(Income income) {
        incomeDao.create(income);
    }

    public void deleteIncome(Income income) {
        incomeDao.delete(income);
    }

    public void deleteIncomeByGuid(String guid) {
        incomeDao.deleteByGuid(guid);
    }

    public List<Income> findAllIncomes() {
        return incomeDao.findAll();
    }

    public List<Map<String, Object>> converIncomesToMap(List<Income> incomes) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        for(Income income:incomes){
            list.add(convertIncomeToMap(income));
        }
        return list;
    }

    public Map<String, Object> convertIncomeToMap(Income income) {
        return incomeDao.convertObjectToMap(income);
    }
}
