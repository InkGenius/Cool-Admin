package com.order.admin.service.impl;

import com.order.admin.dao.ISiteDao;
import com.order.admin.service.ISiteService;
import com.order.model.Site;
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
public class SiteServiceImpl implements ISiteService{

    @Autowired
    private ISiteDao siteDao;

    public Site findSiteByGuid(String guid) {
        return siteDao.findByGuid(guid);
    }

    public void updateSite(Site site) {
        siteDao.update(site);
    }

    public void addSite(Site site) {
        siteDao.create(site);
    }

    public void deleteSite(Site site) {
        siteDao.delete(site);
    }

    public void deleteSiteByGuid(String guid) {
        siteDao.deleteByGuid(guid);
    }

    public List<Site> findAllSites() {
        return siteDao.findAll();
    }

    public List<Map<String, Object>> converSitesToMap(List<Site> sites) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        for(Site site:sites){
            list.add(convertSiteToMap(site));
        }
        return list;
    }

    public Map<String, Object> convertSiteToMap(Site site) {
        return siteDao.convertObjectToMap(site);
    }
}
