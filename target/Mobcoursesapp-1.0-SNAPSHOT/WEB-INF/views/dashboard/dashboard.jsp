<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
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
    <title><fmt:message key="common.dashboard"/> </title>

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
        font-size: 12px!important;
    }
</style>

<body id="page-top" class="sidebar-toggled">

<%-- Top navigation bar--%>
<%@ include file="../menu_top/topMenu.jsp" %>


<div id="wrapper">

    <!-- Sidebar -->
    <%@ include file="../menu_left/leftMenu.jsp" %>

    <div id="content-wrapper">

        <div class="container-fluid">
            <!-- Breadcrumbs-->
            <ol class="breadcrumb">
                <li class="breadcrumb-item">
                    <fmt:message key="common.dashboard"/>
                </li>
            </ol>

            <!-- Page Content -->
            <hr>

<%--            Icon Cards--%>
            <div class="row">
                <div class="col-xl-3 col-sm-6 mb-3">
                    <div class="card text-white bg-primary o-hidden h-100">
                        <div class="card-body">
                            <div class="card-body-icon">
                                <i class="fas fa-fw fa-graduation-cap"></i>
                            </div>
                            <div class="mr-5">

                                <%
                                    Object nbCourse = 0;
                                    try {
                                        Class.forName("com.mysql.cj.jdbc.Driver");
                                        Connection cx = DriverManager.getConnection("jdbc:mysql://localhost:3309/MobcoursesAppdb?createDatabaseIfNotExist=true && useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                                        Statement st = cx.createStatement();
                                        ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM Course");
                                        while (rs.next()) {
                                            nbCourse = rs.getInt(1);
                                        }
                                    }
                                    catch (Exception e){

                                    }
                                %>
                                <h4><%=nbCourse%><p>

                                    Courses</h4>
                            </div>
                        </div>
                        <a class="card-footer text-white clearfix small z-1" href="/course/">
                            <span class="float-left">View Details</span>
                            <span class="float-right">
                  <i class="fas fa-angle-right"></i>
                </span>
                        </a>
                    </div>
                </div>
                <div class="col-xl-3 col-sm-6 mb-3">
                    <div class="card text-white bg-warning o-hidden h-100">
                        <div class="card-body">
                            <div class="card-body-icon">
                                <i class="fas fa-fw fa-user-graduate"></i>
                            </div>
                            <div class="mr-5">


                                <%
                                    Object nbStudent = 0;
                                    try {
                                        Class.forName("com.mysql.cj.jdbc.Driver");
                                        Connection cx = DriverManager.getConnection("jdbc:mysql://localhost:3309/MobcoursesAppdb?createDatabaseIfNotExist=true && useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                                        Statement st = cx.createStatement();
                                        ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM Student");
                                        while (rs.next()) {
                                            nbStudent = rs.getInt(1);
                                        }
                                    }
                                    catch (Exception e){

                                    }
                                %>
                                <h4><%=nbStudent%><p>

                                    Students</h4>


                            </div>
                        </div>
                        <a class="card-footer text-white clearfix small z-1" href="#">
                            <span class="float-left">View Details</span>
                            <span class="float-right">
                  <i class="fas fa-angle-right"></i>
                </span>
                        </a>
                    </div>
                </div>
                <div class="col-xl-3 col-sm-6 mb-3">
                    <div class="card text-white bg-success o-hidden h-100">
                        <div class="card-body">
                            <div class="card-body-icon">
                                <i class="fas fa-fw fa-user-circle"></i>
                            </div>
                            <div class="mr-5">

                                <%
                                    Object nbCourseAuthor = 0;
                                    try {
                                        Class.forName("com.mysql.cj.jdbc.Driver");
                                        Connection cx = DriverManager.getConnection("jdbc:mysql://localhost:3309/MobcoursesAppdb?createDatabaseIfNotExist=true && useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                                        Statement st = cx.createStatement();
                                        ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM CourseAuthor");
                                        while (rs.next()) {
                                            nbCourseAuthor = rs.getInt(1);
                                        }
                                    }
                                    catch (Exception e){

                                    }
                                %>
                                <h4><%=nbCourseAuthor%><p>

                                    Instructors</h4>

                            </div>
                        </div>
                        <a class="card-footer text-white clearfix small z-1" href="#">
                            <span class="float-left">View Details</span>
                            <span class="float-right">
                  <i class="fas fa-angle-right"></i>
                </span>
                        </a>
                    </div>
                </div>
                <div class="col-xl-3 col-sm-6 mb-3">
                    <div class="card text-white bg-danger o-hidden h-100">
                        <div class="card-body">
                            <div class="card-body-icon">
                                <i class="fas fa-fw fa-school"></i>
                            </div>
                            <div class="mr-5">

                                <%
                                    Object nbSubject = 0;
                                    try {
                                        Class.forName("com.mysql.cj.jdbc.Driver");
                                        Connection cx = DriverManager.getConnection("jdbc:mysql://localhost:3309/MobcoursesAppdb?createDatabaseIfNotExist=true && useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
                                        Statement st = cx.createStatement();
                                        ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM Subject");
                                        while (rs.next()) {
                                            nbSubject = rs.getInt(1);
                                        }
                                    }
                                    catch (Exception e){

                                    }
                                %>
                                <h4><%=nbSubject%><p>

                                    Subjects</h4>

                            </div>
                        </div>
                        <a class="card-footer text-white clearfix small z-1" href="#">
                            <span class="float-left">View Details</span>
                            <span class="float-right">
                  <i class="fas fa-angle-right"></i>
                </span>
                        </a>
                    </div>
                </div>
            </div>

        </div>
        <!-- /.container-fluid -->



<%--        Area chart --%>

<%--        <div class="card mb-3">--%>
<%--            <div class="card-header">--%>
<%--                <i class="fas fa-chart-area"></i>--%>
<%--                Area Chart Example</div>--%>
<%--            <div class="card-body"><div class="chartjs-size-monitor"><div class="chartjs-size-monitor-expand"><div class=""></div></div><div class="chartjs-size-monitor-shrink"><div class=""></div></div></div>--%>
<%--                <canvas id="myAreaChart" width="1004" height="301" style="display: block; width: 1004px; height: 301px;" class="chartjs-render-monitor"></canvas>--%>
<%--            </div>--%>
<%--            <div class="card-footer small text-muted">Updated yesterday at 11:59 PM</div>--%>
<%--        </div>--%>


        <!-- Sticky Footer -->
        <%--        <footer class="sticky-footer">--%>
        <%--            <div class="container my-auto">--%>
        <%--                <div class="copyright text-center my-auto">--%>
        <%--                    <span>Copyright © Your Website 2019</span>--%>
        <%--                </div>--%>
        <%--            </div>--%>
        <%--        </footer>--%>

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

<!-- Page level plugin JavaScript-->
<script src="<%=request.getContextPath()%>/resources/vendor/chart.js/Chart.min.js"></script>

<!-- Demo scripts for this page-->
<script src="<%=request.getContextPath()%>/resources/js/demo/chart-area-demo.js"></script>


</body>

</html>
