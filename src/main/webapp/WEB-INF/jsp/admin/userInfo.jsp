<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yifan
  Date: 13-11-11
  Time: 下午2:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal">×</button>
    <h3>${user.username}用户信息</h3>
</div>

<div class="modal-body">
    <form class="form-horizontal" action="/admin/updateUser.html" method="POST">
        <fieldset>
            <input type="hidden" name="id" id="id" value="${user.id}" />
            <div class="control-group">
                <label class="control-label" for="realName">真实姓名</label>
                <div class="controls">
                    <input class="input-xlarge focused" name="realName" id="realName" type="text" value="${user.realName}">
                </div>
            </div>

            <div class="control-group">
                <label class="control-label" for="email">邮件地址</label>
                <div class="controls">
                    <input class="input-xlarge focused" name="email" id="email" type="text" value="${user.email}">
                </div>
            </div>

            <div class="control-group">
                <label class="control-label" for="phoneNumber">电话号码</label>
                <div class="controls">
                    <input class="input-xlarge focused" name="phoneNumber" id="phoneNumber" type="text" value="${user.phoneNumber}">
                </div>
            </div>

            <div class="control-group">
                <label class="control-label" for="userRole">用户角色</label>
                <div class=" controls btn-group">
                    <button type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown">
                        <span class="caret"></span>
                        <span class="sr-only" name="role">${user.role.text}</span>
                    </button>
                    <ul class="dropdown-menu" role="menu" id="userRole">
                        <c:forEach items="${roles}" var="role">
                            <li data-value="${role.text}"><a href="#">${role.text}</a></li>
                        </c:forEach>
                    </ul>
                </div>
            </div>

            <div class="form-actions">
                <button type="submit" class="btn btn-primary">确定</button>
                <button class="btn cancel">取消</button>
            </div>
        </fieldset>
    </form>
</div>

<script type="text/javascript" src="/res/js/cancel.js"></script>
<script type="text/javascript" src="/res/js/updateDropdown.js"></script>
