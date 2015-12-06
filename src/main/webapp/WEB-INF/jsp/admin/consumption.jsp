<%--
  Created by IntelliJ IDEA.
  User: daisong
  Date: 15-12-6
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--Member Management starts--%>
<div class="row">
    <div class="box col-md-12">
        <div class="box-inner">
            <div class="box-header well" data-original-title="">
                <h2><i class="glyphicon glyphicon-user"></i> 消费情况</h2>

                <div class="box-icon">
                    <a href="#" class="btn btn-minimize btn-round btn-default"><i
                            class="glyphicon glyphicon-chevron-up"></i></a>
                    <a href="#" class="btn btn-close btn-round btn-default"><i
                            class="glyphicon glyphicon-remove"></i></a>
                </div>
            </div>

            <div class="box-content">
                <table class="table table-striped table-bordered responsive">
                    <thead>
                    <tr>
                        <th class="center">时间</th>
                        <th class="center">地点</th>
                        <th class="center">金额</th>
                        <th class="center">菜单</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${expends}" var="user">
                        <tr>
                            <td class="center">${expends.date}</td
                            <td class="center">${expends.restaurant}</td>
                            <td class="center">${expends.amount}</td>
                            <td class="center">${expends.menu}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    <!--/span-->
</div>

<div class="consumption"></div>