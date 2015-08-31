package com.article.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: yifan
 * Date: 13-11-8
 * Time: 上午8:24
 * To change this template use File | Settings | File Templates.
 */
public class Article implements Serializable {

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRichContent() {
        return richContent;
    }

    public void setRichContent(String richContent) {
        this.richContent = richContent;
    }

    public Catalog getBelongCatalog() {
        return belongCatalog;
    }

    public void setBelongCatalog(Catalog belongCatalog) {
        this.belongCatalog = belongCatalog;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public User getPublisher() {
        return publisher;
    }

    public void setPublisher(User publisher) {
        this.publisher = publisher;
    }

    private String title;
    private String richContent;
    private Catalog belongCatalog;
    private Date publishDate;
    private Date updateDate;
    private User publisher;

}
