<%--
  Created by IntelliJ IDEA.
  User: DaiSong
  Date: 13-11-12
  Time: 上午9:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<!DOCTYPE html>
<html lang="zh">
<head>

    <meta charset="utf-8">
    <title>后台管理系统</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="后台模板">
    <meta name="author" content="DaiSong">

    <!-- The styles -->
    <link id="bs-css" href="/res/css/new/bootstrap-cerulean.min.css" rel="stylesheet">

    <link href="/res/css/new/charisma-app.css" rel="stylesheet">
    <link href="/res/css/new/fullcalendar.css" rel='stylesheet'>
    <link href='/res/css/new/fullcalendar.print.css' rel='stylesheet' media='print'>
    <link href='/res/css/new/chosen.min.css' rel='stylesheet'>
    <link href='/res/css/new/colorbox.css' rel='stylesheet'>
    <link href='/res/css/new/responsive-tables.css' rel='stylesheet'>
    <link href='/res/css/new/bootstrap-tour.min.css' rel='stylesheet'>
    <link href='/res/css/new/jquery.noty.css' rel='stylesheet'>
    <link href='/res/css/new/noty_theme_default.css' rel='stylesheet'>
    <link href='/res/css/new/elfinder.min.css' rel='stylesheet'>
    <link href='/res/css/new/elfinder.theme.css' rel='stylesheet'>
    <link href='/res/css/new/jquery.iphone.toggle.css' rel='stylesheet'>
    <link href='/res/css/new/uploadify.css' rel='stylesheet'>
    <link href='/res/css/new/animate.min.css' rel='stylesheet'>

    <!-- jQuery -->
    <script src="/res/js/new/jquery.min.js"></script>

    <!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <!-- The fav icon -->
    <link rel="shortcut icon" href="/res/img/new/favicon.ico">
</head>

<body>

<%--<jsp:include page="navbar.jsp" flush="true"/>--%>

<%--<jsp:include page="navbar.jsp" />--%>
<div class="navbar navbar-default" role="navigation">

    <div class="navbar-inner">
        <button type="button" class="navbar-toggle pull-left animated flip">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="/admin/new/index.html"> <img alt="Charisma Logo" src="img/logo20.png" class="hidden-xs"/>
            <span>管理后台</span></a>

        <!-- user dropdown starts -->
        <div class="btn-group pull-right">
            <button class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                <i class="glyphicon glyphicon-user"></i><span class="hidden-sm hidden-xs">${username}</span>
                <span class="caret"></span>
            </button>
            <ul class="dropdown-menu">
                <li><a href="#">用户信息</a></li>
                <li class="divider"></li>
                <li><a href="/admin/new/logout.html"></a>安全退出</li>
            </ul>
        </div>
        <!-- user dropdown ends -->

        <!-- theme selector starts -->
        <div class="btn-group pull-right theme-container animated tada">
            <button class="btn btn-default dropdown-toggle" data-toggle="dropdown">
                <i class="glyphicon glyphicon-tint"></i><span
                    class="hidden-sm hidden-xs"> 更换主题</span>
                <span class="caret"></span>
            </button>
            <ul class="dropdown-menu" id="themes">
                <li><a data-value="classic" href="#"><i class="whitespace"></i> Classic</a></li>
                <li><a data-value="cerulean" href="#"><i class="whitespace"></i> Cerulean</a></li>
                <li><a data-value="cyborg" href="#"><i class="whitespace"></i> Cyborg</a></li>
                <li><a data-value="simplex" href="#"><i class="whitespace"></i> Simplex</a></li>
                <li><a data-value="darkly" href="#"><i class="whitespace"></i> Darkly</a></li>
                <li><a data-value="lumen" href="#"><i class="whitespace"></i> Lumen</a></li>
                <li><a data-value="slate" href="#"><i class="whitespace"></i> Slate</a></li>
                <li><a data-value="spacelab" href="#"><i class="whitespace"></i> Spacelab</a></li>
                <li><a data-value="united" href="#"><i class="whitespace"></i> United</a></li>
            </ul>
        </div>
        <!-- theme selector ends -->

        <ul class="collapse navbar-collapse nav navbar-nav top-menu">
            <li><a href="#"><i class="glyphicon glyphicon-globe"></i> Visit Site</a></li>
            <li class="dropdown">
                <a href="#" data-toggle="dropdown"><i class="glyphicon glyphicon-star"></i> Dropdown <span
                        class="caret"></span></a>
                <ul class="dropdown-menu" role="menu">
                    <li><a href="#">Action</a></li>
                    <li><a href="#">Another action</a></li>
                    <li><a href="#">Something else here</a></li>
                    <li class="divider"></li>
                    <li><a href="#">Separated link</a></li>
                    <li class="divider"></li>
                    <li><a href="#">One more separated link</a></li>
                </ul>
            </li>
            <li>
                <form class="navbar-search pull-left">
                    <input placeholder="Search" class="search-query form-control col-md-10" name="query"
                           type="text">
                </form>
            </li>
        </ul>

    </div>
</div>

<div class="container-fluid">
    <div class="row-fluid">
        <jsp:include page="leftMenu.jsp" />


        <div id="content" class="span10">
            <!-- content starts -->

            <jsp:include page="breadcrumb.jsp" />

            <c:forEach items="${contentpages}" var="content">
                <jsp:include page="./${content}" />
            </c:forEach>

            <!-- content ends -->
        </div><!--/#content.span10-->
    </div><!--/fluid-row-->

    <hr>

    <div class="modal hide fade" id="myModal">

    </div>

    <jsp:include page="foot.jsp" />

    <!-- external javascript -->

    <script src="/res/js/new/bootstrap.min.js"></script>

    <!-- library for cookie management -->
    <script src="/res/js/new/jquery.cookie.js"></script>
    <!-- calender plugin -->
    <script src='/res/js/new/moment.min.js'></script>
    <script src='/res/js/new/fullcalendar.min.js'></script>
    <!-- data table plugin -->
    <script src='/res/js/new/jquery.dataTables.min.js'></script>

    <!-- select or dropdown enhancer -->
    <script src="/res/js/new/chosen.jquery.min.js"></script>
    <!-- plugin for gallery image view -->
    <script src="/res/js/new/jquery.colorbox-min.js"></script>
    <!-- notification plugin -->
    <script src="/res/js/new/jquery.noty.js"></script>
    <!-- library for making tables responsive -->
    <script src="/res/js/new/responsive-tables.js"></script>
    <!-- tour plugin -->
    <script src="/res/js/new/bootstrap-tour.min.js"></script>
    <!-- star rating plugin -->
    <script src="/res/js/new/jquery.raty.min.js"></script>
    <!-- for iOS style toggle switch -->
    <script src="/res/js/new/jquery.iphone.toggle.js"></script>
    <!-- autogrowing textarea plugin -->
    <script src="/res/js/new/jquery.autogrow-textarea.js"></script>
    <!-- multiple file upload plugin -->
    <script src="/res/js/new/jquery.uploadify-3.1.min.js"></script>
    <!-- history.js for cross-browser state change on ajax -->
    <script src="/res/js/new/jquery.history.js"></script>
    <!-- application script for Charisma demo -->
    <script src="/res/js/new/charisma.js"></script>
</body>
</html>