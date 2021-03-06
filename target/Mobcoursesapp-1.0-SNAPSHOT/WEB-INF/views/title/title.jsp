<%@ page import="static com.mobcoursesapp.mvc.ctrl.WebCtrl.LessonController.courseIdentity" %>
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

    <div id="content-wrapper">

        <div class="container-fluid">

            <!-- Breadcrumbs-->
            <ol class="breadcrumb">
                <li class="breadcrumb-item">
                    <c:url value="/dashboard/" var="dashboard"/>
                    <a href="${dashboard}"><fmt:message key="common.dashboard"/> </a>
                </li>
                <li class="breadcrumb-item">
                    <c:url value="/dashboard/" var="dashboard"/>
                    <a href="${course}"><fmt:message key="common.courses"/> </a>
                </li>
                <li class="breadcrumb-item">
                    <c:url value="/dashboard/" var="dashboard"/>
                    <a href="/lesson/<%=courseIdentity%>"> <fmt:message key="common.courses.lesson"/> </a>
                </li>
                <li class="breadcrumb-item active">Titles</li>
            </ol>

            <!-- Page Content -->
            <hr>
            <p>This is a great starting point for new custom pages.</p>


            <div class="row">
                <div class="col-lg-2 col-md-1 col-sm-0"></div>
                <div class="col-lg-8 col-md-10 col-sm-12">
                    <c:forEach items="${titles}" var="title">

                        <div>

                            <!-- Illustrations -->
                            <div>
                                <div class="card-header py-3">
                                    <h6 class="m-0 font-weight-bold text-dark"
                                        style="float: left!important; width: 95%!important;">
                                            ${title.getTitleName()}
                                    </h6>
                                    <span style="float: right!important;">
                                    <c:url value="/title/update/${title.getTitleID()}" var="urlUpdate"/>
                                          <a href="${urlUpdate}"> <i class="fas fa-fw fa-edit"></i></a>&nbsp;
<%--                                          | &nbsp;&nbsp;--%>
<%--                                          <a href="javascript:void(0);" data-toggle="modal" data-target="#modalLesson${titles.getLessonID()}"><i class="fas fa-fw fa-trash" style="color: #CC0000;"></i></a>--%>
                                        <!-- Modal starts here -->

                                          <div class="modal fade" id="modalLesson${title.getTitleID()}" tabindex="-1"
                                               role="dialog" aria-labelledby="deleteModalLabel" aria-hidden="true">
                                            <div class="modal-dialog" role="document">
                                              <div class="modal-content">
                                                <div class="modal-header">
                                                  <h5 class="modal-title" id="deleteModalLabel">Confirm deletion</h5>
                                                  <button class="close" type="button" data-dismiss="modal"
                                                          aria-label="Close">
                                                    <span aria-hidden="true"><i
                                                            class="fas fa-fw fa-window-close"></i></span>
                                                  </button>
                                                </div>
                                                <div class="modal-body">Please confirm your choice</div>
                                                <div class="modal-footer">
                                                  <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                                                  <c:url value="/titles/remove/${title.getTitleID()}" var="urlRemove"/>
                                                  <a class="btn btn-danger" href="${urlRemove}"><i
                                                          class="fas fa-fw fa-trash" style="color: #FFFFFF;"></i>&nbsp;Delete</a>
                                                </div>
                                              </div>
                                            </div>
                                          </div>

                                        <!-- End Modal -->
                                </span>
                                    <br>
                                    <div class="container-fluid" style="text-align:justify!important;">
                                        <hr style="width: 100%!important; visibility: hidden!important;">
                                        <p style=" width: 100%!important; text-align:justify-all!important;">
                                                ${title.getContent()}
                                        </p>
                                    </div>
                                </div>
                            </div>

                        </div>

                    </c:forEach>
                </div>
                <div class="col-lg-2 col-md-1 col-sm-0"></div>
            </div>


            <%--            Bottom right ADD button--%>
            <c:url value="/title/new" var="addTitle"/>
            <a href="${addTitle}"
               style="position: fixed;
    right: 15px;
    bottom: 90px;
    text-align: center;
    color: #fff;
    line-height: 46px;">
                <button type="button" class="btn btn-success btn-lg" style="border-radius: 30px!important;">
                    <span class="fas fa-fw fa-plus-circle"></span>
                    <b style="font-size: 12px;"> Add Title </b>
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
