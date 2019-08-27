<%@ include file="../includes/includes.jsp" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Jean Mengue">

    <%@ include file="../ico.jsp" %>
    <title>Mobcoursesapp - Login</title>

    <!-- Custom fonts for this template-->
    <link href="<%=request.getContextPath()%>/resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
          type="text/css">

    <%--    font family--%>
    <%--    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/comfortaa.css"/>--%>
    <link href="https://fonts.googleapis.com/css?family=Comfortaa:300,400,700&display=swap" rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="<%=request.getContextPath()%>/resources/css/sb-admin.css" rel="stylesheet">

</head>

<style>
    body {
        font-family: 'Comfortaa', cursive !important;
        font-size: 12px !important;
    }

    .form-group> .form-label-group> input:focus {
        box-shadow: 0 0 !important;
        border: 1px solid #CED4DA!important;
    }

</style>

<body class="bg-dark" style="background: #F4F2F0!important;">

<div class="container">
    <div class="card card-login mx-auto mt-5">
        <div class="card-header" align="middle">
            <img src="<%=request.getContextPath()%>/resources/images/logo.png" height="24" width="24">Mobile Courses Application
        </div>
        <div class="card-body">
            <form>
                <div class="form-group">
                    <div class="form-label-group">
                        <input type="email" id="inputEmail" class="form-control" placeholder="Email address"
                               required="required" autofocus="autofocus">
                        <label for="inputEmail">Email address</label>
                    </div>
                </div>
                <div class="form-group">
                    <div class="form-label-group">
                        <input type="password" id="inputPassword" class="form-control" placeholder="Password"
                               required="required">
                        <label for="inputPassword">Password</label>
                    </div>
                </div>
<%--                <div class="form-group">--%>
<%--                    <div class="checkbox">--%>
<%--                        <label>--%>
<%--                            <input type="checkbox" value="remember-me">--%>
<%--                            Remember Password--%>
<%--                        </label>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--                <c:url value="" var=""/>--%>
                <a class="btn btn-primary btn-block" href="index.html" style="background: #F9AC19!important; border: 1px solid #F9AC19">Login</a>
            </form>
            <div class="text-center">
                <c:url value="/register/" var="register"/>
                <a class="d-block small mt-3" href="${register}">Register an Account</a>
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap core JavaScript-->
<script src="<%=request.getContextPath()%>/resources/vendor/jquery/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="<%=request.getContextPath()%>/resources/vendor/jquery-easing/jquery.easing.min.js"></script>

</body>

</html>
