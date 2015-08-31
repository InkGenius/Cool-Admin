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
<%@include file="common.jsp"%>
<div class="row-fluid sortable">
    <div class="box span12">
        <div class="box-header well" data-original-title>
            <h2><i class="icon-user"></i>用户管理</h2>
            <div class="box-icon">
                <a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>
                <a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
            </div>
        </div>

        <div class="row-fluid custom-button">
            <a class="btn btn-info userDialogUpdate" href="#" data-target="/admin/addUser.html">
                <i class="icon-edit icon-white"></i>
                创建新用户
            </a>
        </div>
        <div class="box-content">
            <table class="table table-striped table-bordered bootstrap-datatable datatable">
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
                        <td>${user.username}</td>
                        <td>${user.realName}</td>
                        <td>${user.role.text}</td>
                        <td>${user.phoneNumber}</td>
                        <td>${user.email}</td>
                        <td>${user.registerDate}</td>
                        <td class="center">
                            <a class="btn btn-info userDialogUpdate" href="#" data-value="${user.id}" data-target="/admin/updateUser.html">
                                <i class="icon-edit icon-white"></i>
                                修改
                            </a>
                            <a class="btn btn-danger" href="/admin/deleteUser.html?id=${user.id}">
                                <i class="icon-trash icon-white"></i>
                                删除
                            </a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div><!--/span-->

</div><!--/row-->
<%--Member Management ends--%>