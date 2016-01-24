package com.order.admin.service;

import com.order.model.SiteGrade;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 16-1-24
 * Time: 11:25
 * To change this template use File | Settings | File Templates.
 */
public interface ISiteGradeService {

    SiteGrade findSiteGradeByGuid(String guid);
    void updateSiteGrade(SiteGrade siteGrade);
    void addSiteGrade(SiteGrade siteGrade);
    void deleteSiteGrade(SiteGrade siteGrade);

    void deleteSiteGradeByGuid(String guid);
    List<SiteGrade> findAllSiteGrades();

    List<Map<String,Object>> converSiteGradesToMap(List<SiteGrade> siteGrades);
    Map<String,Object> convertSiteGradeToMap(SiteGrade siteGrade);
}
