package com.order.admin.service;

import com.order.model.Income;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 16-1-24
 * Time: 11:25
 * To change this template use File | Settings | File Templates.
 */
public interface IIncomeService {

    Income findIncomeByGuid(String guid);
    void updateIncome(Income income);
    void addIncome(Income income);
    void deleteIncome(Income income);

    void deleteIncomeByGuid(String guid);
    List<Income> findAllIncomes();

    List<Map<String,Object>> converIncomesToMap(List<Income> incomes);
    Map<String,Object> convertIncomeToMap(Income income);
}
