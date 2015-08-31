package com.article.model;

/**
 * Created with IntelliJ IDEA.
 * User: yifan
 * Date: 13-11-12
 * Time: 上午9:31
 * To change this template use File | Settings | File Templates.
 */
public enum  StepBean {

    UserManage("用户管理","/admin/userManage.html"),
    CatalogManage("目录管理","/admin/catalogManage.html"),
    ArticleManage("文章管理","/admin/articleManage.html");

    StepBean(String text,String url){
        this.text = text;
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public String getUrl() {
        return url;
    }

    private String text;
    private String url;
}
