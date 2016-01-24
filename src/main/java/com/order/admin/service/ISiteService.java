package com.order.admin.service;

import com.order.model.Site;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: daisong
 * Date: 16-1-24
 * Time: 11:25
 * To change this template use File | Settings | File Templates.
 */
public interface ISiteService {

    Site findSiteByGuid(String guid);
    void updateSite(Site site);
    void addSite(Site site);
    void deleteSite(Site site);

    void deleteSiteByGuid(String guid);
    List<Site> findAllSites();

    List<Map<String,Object>> converSitesToMap(List<Site> sites);
    Map<String,Object> convertSiteToMap(Site site);
}
