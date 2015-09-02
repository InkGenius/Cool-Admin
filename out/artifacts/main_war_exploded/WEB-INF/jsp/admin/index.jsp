<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="utf-8">
    <title>通用后台模板</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="通用后台模板">
    <meta name="author" content="daisong">

    <!-- The styles -->
    <link id="bs-css" href="/css/bootstrap-cerulean.min.css" rel="stylesheet">

    <link href="/css/charisma-app.css" rel="stylesheet">
    <link href=/bower_components/fullcalendar/dist/fullcalendar.css' rel='stylesheet'>
    <link href=/bower_components/fullcalendar/dist/fullcalendar.print.css' rel='stylesheet' media='print'>
    <link href=/bower_components/chosen/chosen.min.css' rel='stylesheet'>
    <link href=/bower_components/colorbox/example3/colorbox.css' rel='stylesheet'>
    <link href=/bower_components/responsive-tables/responsive-tables.css' rel='stylesheet'>
    <link href=/bower_components/bootstrap-tour/build/css/bootstrap-tour.min.css' rel='stylesheet'>
    <link href=/css/jquery.noty.css' rel='stylesheet'>
    <link href=/css/noty_theme_default.css' rel='stylesheet'>
    <link href=/css/elfinder.min.css' rel='stylesheet'>
    <link href=/css/elfinder.theme.css' rel='stylesheet'>
    <link href=/css/jquery.iphone.toggle.css' rel='stylesheet'>
    <link href=/css/uploadify.css' rel='stylesheet'>
    <link href=/css/animate.min.css' rel='stylesheet'>

    <!-- jQuery -->
    <script src="/bower_components/jquery/jquery.min.js"></script>

    <!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <!-- The fav icon -->
    <link rel="shortcut icon" href="/img/favicon.ico">
</head>

<body>
<!-- topbar starts -->
<jsp:include page="navbar.jsp"/>

<div class="ch-container">
    <div class="row">
        <!-- left menu starts -->
        <jsp:include page="leftMenu.jsp"/>
        <div id="content" class="col-lg-10 col-sm-10">
            <!-- content starts -->
            <jsp:include page="breadcrumb.jsp"/>

            <c:forEach items="${contentpages}" var="content">
                <jsp:include page="./${content}"/>
            </c:forEach>
            <!--/span-->
        </div>
    </div>
    <!--/row-->
</div>
<!--/row-->

<%--id为myModal的悬浮框，用于接收Ajax请求--%>
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"></div>

<jsp:include page="foot.jsp"/>

<!-- external javascript -->
<script src="/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

<!-- library for cookie management -->
<script src="/js/jquery.cookie.js"></script>
<!-- calender plugin -->
<script src='/bower_components/moment/min/moment.min.js'></script>
<script src='/bower_components/fullcalendar/dist/fullcalendar.min.js'></script>
<!-- data table plugin -->
<script src='/js/jquery.dataTables.min.js'></script>

<!-- select or dropdown enhancer -->
<script src="/bower_components/chosen/chosen.jquery.min.js"></script>
<!-- plugin for gallery image view -->
<script src="/bower_components/colorbox/jquery.colorbox-min.js"></script>
<!-- notification plugin -->
<script src="/js/jquery.noty.js"></script>
<!-- library for making tables responsive -->
<script src="/bower_components/responsive-tables/responsive-tables.js"></script>
<!-- tour plugin -->
<script src="/bower_components/bootstrap-tour/build/js/bootstrap-tour.min.js"></script>
<!-- star rating plugin -->
<script src="/js/jquery.raty.min.js"></script>
<!-- for iOS style toggle switch -->
<script src="/js/jquery.iphone.toggle.js"></script>
<!-- autogrowing textarea plugin -->
<script src="/js/jquery.autogrow-textarea.js"></script>
<!-- multiple file upload plugin -->
<script src="/js/jquery.uploadify-3.1.min.js"></script>
<!-- history.js for cross-browser state change on ajax -->
<script src="/js/jquery.history.js"></script>
<!-- application script for Charisma demo -->
<script src="/js/charisma.js"></script>

<script src="/js/dialogUpdate.js"></script>
</body>
</html>
