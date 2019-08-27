<%@ include file="../includes/includes.jsp" %>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title><fmt:message key="common.registration"/> </title>

  <!-- Custom fonts for this template-->
  <link href="<%=request.getContextPath()%>/resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

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
    <div class="card card-register mx-auto mt-5">
      <div class="card-header" align="middle">
        <img src="<%=request.getContextPath()%>/resources/images/logo.png" height="24" width="24">
        <fmt:message key="common.createAccount"/> </div>
      <div class="card-body">
        <form>
          <div class="form-group">
                <div class="form-label-group">
                  <input type="text" id="firstName" class="form-control" placeholder="" required="required" autofocus="autofocus">
                  <label for="firstName">Name</label>
                </div>
          </div>
          <div class="form-group">
            <div class="form-label-group">
              <input type="email" id="inputEmail" class="form-control" placeholder="" required="required">
              <label for="inputEmail">Email address</label>
            </div>
          </div>
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <div class="form-label-group">
                  <input type="phone" id="inputPhone" class="form-control" placeholder="" required="required">
                  <label for="inputPhone">Phone</label>
                </div>
              </div>
              <div class="col-md-6">
                <div class="form-label-group">
                  <input type="password" id="inputPassword" class="form-control" placeholder="" required="required">
                  <label for="inputPassword">Create password</label>
                </div>
              </div>
            </div>
          </div>
          <a class="btn btn-primary btn-block" href="login.html" style="background: #F9AC19!important; border: 1px solid #F9AC19">Create Instructor Account</a>
        </form>
        <div class="text-center">
          <c:url value="/" var="login"/>
          <a class="d-block small mt-3" href="${login}">Login Page</a>
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
