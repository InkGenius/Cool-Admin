package com.order.admin.service.impl;

import com.order.admin.dao.ISiteGradeDao;
import com.order.admin.service.ISiteGradeService;
import com.order.model.SiteGrade;
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
public class SiteGradeServiceImpl implements ISiteGradeService{

    @Autowired
    private ISiteGradeDao siteGradeDao;

    public SiteGrade findSiteGradeByGuid(String guid) {
        return siteGradeDao.findByGuid(guid);
    }

    public void updateSiteGrade(SiteGrade siteGrade) {
        siteGradeDao.update(siteGrade);
    }

    public void addSiteGrade(SiteGrade siteGrade) {
        siteGradeDao.create(siteGrade);
    }

    public void deleteSiteGrade(SiteGrade siteGrade) {
        siteGradeDao.delete(siteGrade);
    }

    public void deleteSiteGradeByGuid(String guid) {
        siteGradeDao.deleteByGuid(guid);
    }

    public List<SiteGrade> findAllSiteGrades() {
        return siteGradeDao.findAll();
    }

    public List<Map<String, Object>> converSiteGradesToMap(List<SiteGrade> siteGrades) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        for(SiteGrade siteGrade:siteGrades){
            list.add(convertSiteGradeToMap(siteGrade));
        }
        return list;
    }

    public Map<String, Object> convertSiteGradeToMap(SiteGrade siteGrade) {
        return siteGradeDao.convertObjectToMap(siteGrade);
    }
}
