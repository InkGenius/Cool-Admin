package com.article.admin.service;

/**
 * Created with IntelliJ IDEA.
 * User: yifan
 * Date: 13-11-8
 * Time: 上午8:32
 * To change this template use File | Settings | File Templates.
 */
public interface IArticleService {

    /**
     * Add a new catalog with the given name, all properties.
     * @param catalogName:  catalog's name.
     * @param isNavigate:   if this catalog would be included in the navigate bar.
     * @param isImageItem:  if this catalog use image to take place of the text title.
     * @param isSideImage:  if this catalog use a side image to make the item beautiful.
     * @return
     *
     *      if add the given catalog successful return true, otherwise return false.
     */
    public boolean addNewCatalog(String catalogName, boolean isNavigate, boolean isImageItem, boolean isSideImage);

}
