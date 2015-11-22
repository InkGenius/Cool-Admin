<%--
  Created by IntelliJ IDEA.
  User: yifan
  Date: 13-11-12
  Time: 上午9:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div>
    <ul class="breadcrumb">
        <li>
            <a href="/admin/index.html">首页</a> <span class="divider">/</span>
        </li>
        <c:forEach items="${steps}" var="step">
            <li>
                <a href="${step.url}">${step.text}</a>
            </li>
        </c:forEach>
    </ul>
</div>
