<%--
  Created by IntelliJ IDEA.
  User: yifan
  Date: 13-11-12
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
                <h2><i class="glyphicon glyphicon-user"></i> 用户管理</h2>

                <div class="box-icon">
                    <a href="#" class="btn btn-minimize btn-round btn-default"><i
                            class="glyphicon glyphicon-chevron-up"></i></a>
                    <a href="#" class="btn btn-close btn-round btn-default"><i
                            class="glyphicon glyphicon-remove"></i></a>
                </div>
            </div>

            <div class="box-content">

                <div class="row-fluid custom-button">
                    <a class="btn btn-info btn-sm userDialogUpdate" href="#" data-target="/admin/addUser.html">
                        <i class="glyphicon glyphicon-edit icon-white"></i>
                        创建新用户
                    </a>
                </div>
                <table class="table table-striped table-bordered responsive">
                    <thead>
                    <tr>
                        <th class="center">用户名</th>
                        <th class="center">真实姓名</th>
                        <th class="center">角色</th>
                        <th class="center">电话号码</th>
                        <th class="center">邮件地址</th>
                        <th class="center">注册时间</th>
                        <th class="center">操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${users}" var="user">
                        <tr>
                            <td class="center">${user.username}</td>
                            <td class="center">${user.realName}</td>
                            <td class="center">${user.role.text}</td>
                            <td class="center">${user.phoneNumber}</td>
                            <td class="center">${user.email}</td>
                            <td class="center">${user.registerDate}</td>
                            <td class="center">
                                <a class="btn btn-info userDialogUpdate" href="#" data-value="${user.id}"
                                   data-target="/admin/updateUser.html">
                                    <i class="glyphicon glyphicon-edit icon-white"></i>
                                    修改
                                </a>
                                <a class="btn btn-danger" href="/admin/deleteUser.html?id=${user.id}">
                                    <i class="glyphicon glyphicon-trash icon-white"></i>
                                    删除
                                </a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>

    <!--/span-->
</div>

