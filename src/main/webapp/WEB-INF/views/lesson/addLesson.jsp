<%@ include file="../includes/includes.jsp" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title><fmt:message key="common.addCourse"/></title>

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
                    <c:url value="/course/" var="courses"/>
                    <a href="${courses}"><fmt:message key="common.courses"/></a>
                </li>
                <li class="breadcrumb-item">
                    <%--                    ${course.getCourseTitle()}--%>
                    Course Title
                </li>
                <%--                <li class="breadcrumb-item">--%>
                <%--                    &lt;%&ndash;                    <c:url value="/lesson/" var="lessons"/>&ndash;%&gt;--%>
                <%--                    &lt;%&ndash;                    <a href="${lessons}">&ndash;%&gt;--%>
                <%--                    <fmt:message key="common.courses.lesson"/>--%>
                <%--                    &lt;%&ndash;                    </a>&ndash;%&gt;--%>
                <%--                </li>--%>
                <li class="breadcrumb-item active">
                    Add lesson
                </li>
            </ol>

            <!-- Page Content -->
            <hr>
            <style>
                .form-group {
                    margin: 0 !important;
                }

                label {
                    margin-bottom: 0 !important;
                    margin-top: 10px !important;
                }

            </style>

            <div class="row">
                <div class="col-sm col-lg col-md"></div>
                <div class="col-sm col-lg-6 col-md-6">
                    <!-- Form new lesson -->
                    <div class="panel-body form-add">
                        <c:url value="/lesson/save" var="urlSave"/>
                        <f:form modelAttribute="lesson" action="${urlSave}" method="post">
                            <f:hidden path="lessonID"/>


                            <div class="form-group" style="visibility: hidden!important;">
                                <label></label>
                                <input style="visibility: hidden!important;" class="form-control form-control-sm"/>
                            </div>

                            <div class="form-group">
                                <label><fmt:message key="common.course.lesson.name"/></label>
                                <f:input path="lessonTitle" class="form-control form-control-sm"/>
                            </div>
                            <div class="form-group" style="visibility: hidden!important;">
                                <label>Course ID</label>
                                <f:input path="course.courseID" value="${courseIdentity}" class="form-control form-control-sm"/>
                            </div>


                            <div class="panel-footer" style="margin-top: 30px;">
                                <a href="<c:url value="/lesson/${courseIdentity}"/> " class="btn btn-secondary" data-dismiss="modal"><i
                                        class="fas fa-fw fa-arrow-left"></i>&nbsp;Cancel</a>
                                <button type="submit" class="btn btn-primary"><i class="fas fa-fw fa-save"></i>&nbsp;Save
                                </button>
                            </div>
                        </f:form>
                    </div>
                </div>
                <div class="col-sm col-lg col-md"></div>
            </div>


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

<script src="<%=request.getContextPath()%>/resources/ckeditor/ckeditor.js"></script>
<script>
    CKEDITOR.replace('description');
</script>

</body>

</html>
