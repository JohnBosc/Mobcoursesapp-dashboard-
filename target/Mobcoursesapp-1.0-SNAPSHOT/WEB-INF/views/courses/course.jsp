<%@ include file="../includes/includes.jsp" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <%@ include file="../ico.jsp" %>
    <title><fmt:message key="common.courses"/></title>

    <!-- Custom fonts for this template-->
    <link href="<%=request.getContextPath()%>/resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
          type="text/css">

    <%--    font family--%>
    <%--    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/comfortaa.css"/>--%>
    <link href="https://fonts.googleapis.com/css?family=Comfortaa:300,400,700&display=swap" rel="stylesheet">

    <!-- Page level plugin CSS-->
    <link href="<%=request.getContextPath()%>/resources/vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="<%=request.getContextPath()%>/resources/css/sb-admin.css" rel="stylesheet">

</head>

<style>
    body {
        font-family: 'Comfortaa', cursive !important;
        font-size: 12px !important;

    }

</style>

<body id="page-top" class="sidebar-toggled">

<%-- Top navigation bar--%>
<%@ include file="../menu_top/topMenu.jsp" %>


<div id="wrapper">

    <!-- Sidebar -->
    <%@ include file="../menu_left/leftMenu.jsp" %>

    <div id="content-wrapper" style="background: #F5F5F5!important;">

        <div class="container-fluid">

            <!-- Breadcrumbs-->
            <ol class="breadcrumb">
                <li class="breadcrumb-item">
                    <c:url value="/dashboard/" var="dashboard"/>
                    <a href="${dashboard}"><fmt:message key="common.dashboard"/> </a>
                </li>
                <li class="breadcrumb-item active"><fmt:message key="common.courses"/></li>
            </ol>

            <!-- Page Content -->
            <hr>
            <p>This is a list of all created courses.</p>


            <div class="row">
                <c:forEach items="${courses}" var="course">
                    <div class="col-6 col-lg-4 col-md-4 col-sm-12 col-xs-12">
                        <div class="">
                            <!-- Illustrations -->
                            <div class="card shadow mb-4" style="width: 20rem!important;">
                                <div class="card-header py-3">
                                    <h6 class="m-0 font-weight-bold text-primary">
                                            ${course.getCourseTitle()}
                                    </h6>
                                </div>
                                <div class="card-body">
                                    <div class="text-md-center" style="margin: 0!important; padding: 0!important;">
                                        <img class="img-fluid px-0 px-sm-1 mt-0 mb-1"
                                             style="width: 20rem!important; height: 10rem!important;"
                                             src="http://localhost/mobcoursesapp/thumbnails/${course.getCourseTitle()}.jpg"
                                             alt="${course.getCourseTitle()}">
                                    </div>

                                    <p style="height: 20px; width: 17rem; overflow: hidden!important; text-overflow: ellipsis!important; white-space: nowrap;">
                                            ${course.getCourseDescription()}
                                    </p>
                                        <%--                            add the id of the corresponding course to lesson--%>
                                    <c:url value="/lesson/${course.getCourseID()}" var="urlCourseLessons"/>
                                    <a rel="nofollow" href="${urlCourseLessons}" style="float: left!important; background: #007BFF; padding: 5px 10px; color: #fff;">
                                        <fmt:message key="common.course.display"/>
                                        <i class="fas fa-fw fa-arrow-right"></i></a>
                                        <%--                                Update course--%>
                                    <c:url value="/course/update/${course.getCourseID()}" var="urlUpdate"/>
                                    <a href="${urlUpdate}"> <i class="fas fa-fw fa-edit" style="float: right!important;"></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>

            <%--            Bottom right ADD button--%>
            <c:url value="/course/new" var="addCourse"/>
            <a href="${addCourse}"
               style="position: fixed;
    right: 15px;
    bottom: 90px;
    text-align: center;
    color: #fff;
    line-height: 46px;">
                <button type="button" class="btn btn-success btn-lg" style="border-radius: 30px!important;">
                    <span class="fas fa-fw fa-plus-circle"></span>
                    <b style="font-size: 12px;"> Add Course </b>
                </button>
            </a>
        </div>

    </div>
    <!-- /.content-wrapper -->

</div>
<!-- /#wrapper -->

<!-- Scroll to Top Button-->
<a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
</a>

<!-- Logout Modal-->
<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>
            <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
            <div class="modal-footer">
                <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                <a class="btn btn-primary" href="login.html">Logout</a>
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap core JavaScript-->
<script src="<%=request.getContextPath()%>/resources/vendor/jquery/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="<%=request.getContextPath()%>/resources/vendor/jquery-easing/jquery.easing.min.js"></script>

<!-- Custom scripts for all pages-->
<script src="<%=request.getContextPath()%>/resources/js/sb-admin.min.js"></script>

</body>

</html>
