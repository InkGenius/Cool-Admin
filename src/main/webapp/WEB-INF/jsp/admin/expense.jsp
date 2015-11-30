<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: daisong
  Date: 15-11-28
  Time: 下午2:24
  To change this template use File | Settings | File Templates.
--%>
<%--TODO: 实现验证输入框的功能： 如用户名长度，使用字符，密码重复匹配，数字验证，email验证 --%>

<div class="modal-dialog" role="document">
    <div class="modal-content">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                    aria-hidden="true">&times;</span></button>
            <h4 class="modal-title" id="myModalLabel">今日花费</h4>
        </div>
        <div class="modal-body">

            <form class="form-horizontal" id="defaultForm" action="/admin/expense.html" method="POST">

                <div class="form-group">
                    <label for="expense" class="col-sm-2 control-label">花费</label>

                    <div class="input-group col-sm-9">
                        <input type="text" class="form-control" name="expense" id="expense" placeholder="输入今日花费"
                               >
                        <%--<span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>--%>
                    </div>
                </div>

                <div class="form-group">
                    <label for="location" class="col-sm-2 control-label">地点</label>

                    <div class="input-group col-sm-9">
                        <input type="text" class="form-control" name="location" id="location" placeholder="输入地点"
                               >
                        <%--<span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>--%>
                    </div>
                </div>
                <div class="form-group">
                    <label for="dishOne" class="col-sm-2 control-label">第一道菜</label>

                    <div class="input-group col-sm-9">
                        <input type="text" class="form-control" id="dishOne" name="dishOne" placeholder="输入菜名"
                               >
                        <%--<span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>--%>
                    </div>
                </div>

                <div class="form-group">
                    <label for="dishTwo" class="col-sm-2 control-label">第二道菜</label>

                    <div class="input-group col-sm-9">
                        <input type="text" class="form-control" id="dishTwo" name="dishTwo" placeholder="输入菜名"
                                >
                        <%--<span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>--%>
                    </div>
                </div>
                <div class="form-group">
                    <label for="dishThree" class="col-sm-2 control-label">第三道菜</label>

                    <div class="input-group col-sm-9">
                        <input type="text" class="form-control" id="dishThree" name="dishThree" placeholder="输入菜名"
                                >
                        <%--<span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>--%>
                    </div>
                </div>
                <div class="form-group">
                    <label for="dishFour" class="col-sm-2 control-label">第四道菜</label>

                    <div class="input-group col-sm-9">
                        <input type="text" class="form-control" id="dishFour" name="dishFour" placeholder="输入菜名"
                                >
                        <%--<span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>--%>
                    </div>
                </div>
                <div class="form-group">
                    <label for="dishFive" class="col-sm-2 control-label">第五道菜</label>

                    <div class="input-group col-sm-9">
                        <input type="text" class="form-control" id="dishFive" name="dishFive" placeholder="输入菜名"
                                >
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