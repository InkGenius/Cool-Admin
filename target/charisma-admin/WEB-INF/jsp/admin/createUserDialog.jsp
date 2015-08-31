<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yifan
  Date: 13-11-11
  Time: 下午2:24
  To change this template use File | Settings | File Templates.
--%>
<%--TODO: 实现验证输入框的功能： 如用户名长度，使用字符，密码重复匹配，数字验证，email验证 --%>

<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal">×</button>
    <h3>${user.username}用户信息</h3>
</div>

<div class="modal-body">
    <form class="form-horizontal" id="signUpForm" action="/admin/addUser.html" method="POST">
        <fieldset>
            <div class="control-group">
                <label class="control-label" for="username">用户名</label>
                <div class="controls">
                    <input class="input-xlarge focused" name="username" id="username" type="text" />
                </div>

            </div>

            <div class="control-group">
                <label class="control-label" for="password">密码</label>
                <div class="controls">
                    <input class="input-xlarge focused" name="password" id="password" type="password" />
                </div>

            </div>

            <div class="control-group">
                <label class="control-label" for="rePassword">重复一遍密码</label>
                <div class="controls">
                    <input class="input-xlarge focused" name="rePassword" id="rePassword" type="password" />
                </div>
            </div>

            <div class="control-group">
                <label class="control-label" for="realName">真实姓名</label>
                <div class="controls">
                    <input class="input-xlarge focused" name="realName" id="realName" type="text" />
                </div>

            </div>

            <div class="control-group">
                <label class="control-label" for="email">邮件地址</label>
                <div class="controls">
                    <input class="input-xlarge focused" name="email" id="email" type="text" />
                </div>

            </div>

            <div class="control-group">
                <label class="control-label" for="phoneNumber">电话号码</label>
                <div class="controls">
                    <input class="input-xlarge focused" name="phoneNumber" id="phoneNumber" type="text" />
                </div>

            </div>

            <div class="control-group">
                <label class="control-label" for="userRole">用户角色</label>
                <div class=" controls btn-group">
                    <button type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown">
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
        </fieldset>
    </form>
</div>

<script type="text/javascript" src="/res/js/cancel.js"></script>
<script type="text/javascript" src="/res/js/updateDropdown.js"></script>
<script type="text/javascript" src="/res/js/validator.js"></script>