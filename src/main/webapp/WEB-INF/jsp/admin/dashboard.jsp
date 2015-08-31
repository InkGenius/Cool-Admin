<%--
  Created by IntelliJ IDEA.
  User: yifan
  Date: 13-11-12
  Time: 上午9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common.jsp"%>
<div class="sortable row-fluid ui-sortable">
    <a data-rel="tooltip" class="well span3 top-block" href="userManage.html" data-original-title="6 new members.">
        <span class="icon32 icon-red icon-user"></span>
        <div>现有会员数</div>
        <div>${fn:length(users)}</div>
        <span class="notification">${fn:length(users)}</span>
    </a>

    <a data-rel="tooltip" class="well span3 top-block" href="#" data-original-title="4 new pro members.">
        <span class="icon32 icon-color icon-compose"></span>
        <div>现有文章数</div>
        <div>228</div>
        <span class="notification green">4</span>
    </a>

    <a data-rel="tooltip" class="well span3 top-block" href="#" data-original-title="4 new pro members.">
        <span class="icon32 icon-color icon-folder-open"></span>
        <div>现有栏目数</div>
        <div>228</div>
        <span class="notification green">4</span>
    </a>

</div>