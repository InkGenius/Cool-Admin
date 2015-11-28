<%--
  Created by IntelliJ IDEA.
  User: daisong
  Date: 15-11-22
  Time: 上午9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<div class="row">
    <div class="col-md-3 col-sm-3 col-xs-6">
        <a data-toggle="tooltip" title="" class="well top-block" href="/userManage.html/admin">
            <i class="glyphicon glyphicon-user blue"></i>
            <div>现有会员数</div>
            <div>${fn:length(users)}</div>
            <span class="notification">${fn:length(users)}</span>
        </a>
    </div>

    <div class="col-md-3 col-sm-3 col-xs-6">
        <a data-toggle="tooltip" title="" class="well top-block userDialogUpdate" href="#" data-target="expense.html">
            <i class="glyphicon glyphicon-usd"></i>
            <div>总额</div>
            <div>${sum}</div>
            <span class="notification green">${sum}</span>
        </a>
    </div>

    <div class="col-md-3 col-sm-3 col-xs-6">
        <a data-toggle="tooltip" title="" class="well top-block" href="#">
            <i class="glyphicon glyphicon-shopping-cart yellow"></i>

            <div>今日消费</div>
            <div>${today}</div>
            <span class="notification yellow">${today}</span>
        </a>
    </div>

    <div class="col-md-3 col-sm-3 col-xs-6">
        <a data-toggle="tooltip" title="" class="well top-block" href="#">
            <i class="glyphicon glyphicon-envelope red"></i>
            <div>余额</div>
            <div>${remainder}</div>
            <span class="notification red">${remainder}</span>
        </a>
    </div>

    <div class="col-md-3 col-sm-3 col-xs-6">
        <a data-toggle="tooltip" title="" class="well top-block" href="#">
            <i class="glyphicon glyphicon-envelope red"></i>
            <div>余额</div>
            <div>${remainder}</div>
            <span class="notification red">${remainder}</span>
        </a>
    </div>

    <div class="col-md-3 col-sm-3 col-xs-6">
        <a data-toggle="tooltip" title="" class="well top-block" href="#">
            <i class="glyphicon glyphicon-envelope red"></i>
            <div>余额</div>
            <div>${remainder}</div>
            <span class="notification red">${remainder}</span>
        </a>
    </div>

    <div class="col-md-3 col-sm-3 col-xs-6">
        <a data-toggle="tooltip" title="" class="well top-block" href="#">
            <i class="glyphicon glyphicon-envelope red"></i>
            <div>余额</div>
            <div>${remainder}</div>
            <span class="notification red">${remainder}</span>
        </a>
    </div>

    <div class="col-md-3 col-sm-3 col-xs-6">
        <a data-toggle="tooltip" title="" class="well top-block" href="#">
            <i class="glyphicon glyphicon-envelope red"></i>
            <div>余额</div>
            <div>${remainder}</div>
            <span class="notification red">${remainder}</span>
        </a>
    </div>
</div>