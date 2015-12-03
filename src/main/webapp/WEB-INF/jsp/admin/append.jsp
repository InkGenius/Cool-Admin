<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: daisong
  Date: 15-12-3
  Time: 21:43
  To change this template use File | Settings | File Templates.
--%>
<%--TODO: 实现验证输入框的功能： 如用户名长度，使用字符，密码重复匹配，数字验证，email验证 --%>

<div class="modal-dialog" role="document">
    <div class="modal-content">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                    aria-hidden="true">&times;</span></button>
            <h4 class="modal-title" id="myModalLabel">交钱</h4>
        </div>
        <div class="modal-body">

            <form class="form-horizontal" id="defaultForm" action="/admin/append.html" method="POST">

                <div class="form-group">
                    <label for="append" class="col-sm-2 control-label">交钱</label>

                    <div class="input-group col-sm-9">
                        <input type="text" class="form-control" name="append" id="append" placeholder="输入上交金额"/>
                        <%--<span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>--%>
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