<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yifan
  Date: 13-11-11
  Time: 下午2:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal-dialog" role="document">
    <div class="modal-content">
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal">×</button>
    <h4 class="modal-title" id="myModalLabel">${user.username}用户信息</h4>
</div>

<div class="modal-body">
    <form class="form-horizontal" action="/admin/updateUser.html" method="POST">
            <input type="hidden" name="id" id="id" value="${user.id}" />

            <div class="form-group">
                <label for="realName" class="col-sm-2 control-label">真实姓名</label>
                <div class="input-group col-sm-9">
                    <input type="text" class="form-control" id="realName" name="realName" value="${user.realName}">
                </div>
            </div>

            <div class="form-group">
                <label for="email" class="col-sm-2 control-label">邮箱地址</label>

                <div class="input-group col-sm-9">
                    <input type="email" class="form-control" id="email" name="email" value="${user.email}">
                </div>
            </div>

            <div class="form-group">
                <label for="phoneNumber" class="col-sm-2 control-label">电话号码</label>

                <div class="input-group col-sm-9">
                    <input type="text" class="form-control" id="phoneNumber" name="phoneNumber" value="${user.phoneNumber}">
                </div>
            </div>

            <div class="form-group">
                <label for="userRole" class="col-sm-2 control-label">用户角色</label>

                <div class="btn-group">
                    <button type="button" class="btn btn-danger" id="role">${roles[0].text}</button>
                    <button type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <span class="caret"></span>
                        <span class="sr-only" name="role">${roles[0].text}</span>
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
    </form>
</div>
    </div>
</div>
<script type="text/javascript" src="/js/cancel.js"></script>
<script type="text/javascript" src="/js/updateDropdown.js"></script>
