<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: daisong
  Date: 15-11-22
  Time: 下午2:24
  To change this template use File | Settings | File Templates.
--%>
<%--TODO: 实现验证输入框的功能： 如用户名长度，使用字符，密码重复匹配，数字验证，email验证 --%>

<div class="modal-dialog" role="document">
    <div class="modal-content">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                    aria-hidden="true">&times;</span></button>
            <h4 class="modal-title" id="myModalLabel">用户信息</h4>
        </div>
        <div class="modal-body">

            <form class="form-horizontal" id="defaultForm" action="/admin/addUser.html" method="POST">

                <div class="form-group">
                    <label for="username" class="col-sm-2 control-label">用户名</label>

                    <div class="input-group col-sm-9">
                        <input type="text" class="form-control" name="username" id="username" placeholder="输入用户名"
                               >
                        <%--<span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>--%>
                    </div>
                </div>

                <div class="form-group">
                    <label for="password" class="col-sm-2 control-label">密码</label>

                    <div class="input-group col-sm-9">
                        <input type="password" class="form-control" name="password" id="password" placeholder="输入密码"
                               >
                        <%--<span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>--%>
                    </div>
                </div>
                <div class="form-group">
                    <label for="confirmPassword" class="col-sm-2 control-label">确认密码</label>

                    <div class="input-group col-sm-9">
                        <input type="password" class="form-control" id="confirmPassword" name="confirmPassword" placeholder="确认密码"
                               >
                        <%--<span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>--%>
                    </div>
                </div>
                <div class="form-group">
                    <label for="realName" class="col-sm-2 control-label">真实姓名</label>

                    <div class="input-group col-sm-9">
                        <input type="text" class="form-control" id="realName" name="realName" placeholder="输入姓名"
                               >
                        <%--<span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>--%>
                    </div>
                </div>
                <div class="form-group">
                    <label for="email" class="col-sm-2 control-label">邮箱地址</label>

                    <div class="input-group col-sm-9">
                        <input type="email" class="form-control" id="email" name="email" placeholder="输入邮箱" >
                        <%--<span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>--%>
                    </div>
                </div>
                <div class="form-group">
                    <label for="phoneNumber" class="col-sm-2 control-label">电话号码</label>

                    <div class="input-group col-sm-9">
                        <input type="text" class="form-control" min="4" id="phoneNumber" name="phoneNumber" placeholder="输入电话号码"
                               >
                        <%--<span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>--%>
                    </div>
                </div>

                <div class="form-group">
                    <label for="roleText" class="col-sm-2 control-label">用户角色</label>
                    <div class="btn-group">
                        <input type="text" class="btn btn-danger" name="roleText" id="roleText" value='${roles[0].text}'>
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
<script type="text/javascript" src="/js/validator.js" ></script>