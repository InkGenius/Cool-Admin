<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: daisong
  Date: 15-12-6
  Time: 12:16
  To change this template use File | Settings | File Templates.
--%>
<div class="row">
    <div class="box col-md-12">
        <div class="box-inner">

            <div class="box-header well" data-original-title="">
                <h2><i class="glyphicon glyphicon-th"></i>菜谱</h2>
            </div>
            <div class="row">
                <c:forEach var="item" items="${catagorys}">
                    <div class="box col-md-3">
                        <div class="box-inner">
                            <div class="box-header well" data-original-title="">
                                <h2><i class="glyphicon glyphicon-th"></i>${item.key}</h2>

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
                                <c:forEach items="${item.value}" var="dish">
                                    <div class="row">
                                        <div class="checkbox col-md-8">
                                            <label><input type="checkbox" name="checkbox" value="${dish.name},${dish.price}">${dish.name}</label>
                                        </div>
                                        <div class="col-md-3"><h6>${dish.price}</h6></div>
                                    </div>
                                </c:forEach>
                            </div>
                        </div>
                    </div>
                </c:forEach><!--/row-->
            </div>

            <div class="col-sm-2 control-group">
                <div class="controls">
                    <select  id="riches" data-rel="chosen">
                        <option>米饭（碗）</option>
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                        <option>5</option>
                        <option>6</option>
                        <option>7</option>
                        <option>8</option>
                        <option>9</option>
                        <option>10</option>
                    </select>
                </div>
            </div>
            <button class="btn btn-primary btn-sm order" data-target="/admin/dishSelect.html">点 餐</button>
        </div>
    </div>
</div>


