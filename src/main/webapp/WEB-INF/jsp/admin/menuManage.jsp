<%--
  Created by IntelliJ IDEA.
  User: daisong
  Date: 15-11-29
  Time: 上午12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--Member Management starts--%>
<div class="row">
    <div class="box col-md-12">
        <div class="box-inner">
            <div class="box-header well" data-original-title="">
                <h2><i class="glyphicon glyphicon-th"></i> Grid 12</h2>

                <div class="box-icon">
                    <a href="#" class="btn btn-setting btn-round btn-default"><i
                            class="glyphicon glyphicon-cog"></i></a>
                    <a href="#" class="btn btn-minimize btn-round btn-default"><i
                            class="glyphicon glyphicon-chevron-up"></i></a>
                    <a href="#" class="btn btn-close btn-round btn-default"><i
                            class="glyphicon glyphicon-remove"></i></a>
                </div>
            </div>

            <div class="box-content">
            <c:forEach var="item" items="${dishes}">
                <div class="row">
                    <div class="col-md-4"><h6>${dish.name}</h6></div>
                    <div class="col-md-4"><h6>${dish.price}</h6></div>
                    <div class="col-md-4"><h6>${dish.black}</h6></div>
                </div>
            </c:forEach>
            </div>
        </div>
    </div>
    <!--/span-->
</div><!--/row-->