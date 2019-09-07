<style>
    .input-group > input:focus {
        box-shadow: 0 0 !important;
        border: 1px solid #CED4DA !important;
    }
</style>
<nav class="navbar navbar-expand navbar-light" style="background: #F4F4F4!important; border-bottom: 1px solid #DBDBDB!important;">

    <img src="<%request.getContextPath();%>/resources/images/logo.png" width="24px" style="margin-right: 20px!important;">
    <h2><a class="navbar-brand mr-1" href="#"><fmt:message key="common.appName"/></a></h2>

    <!-- Navbar Search -->
    <form class="d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0" role="search" action="<c:url value="/course/" />" method="get">
        <div class="input-group">
            <input type="text" class="form-control" placeholder="Search for..." aria-label="Search"
                   aria-describedby="basic-addon2">
            <div class="input-group-append">
                <button class="btn btn-primary" style="background: #F9AC19!important; border: #F9AC19!important;"
                        type="button">
                    <i class="fas fa-search"></i>
                </button>
            </div>
        </div>
    </form>

    <!-- Navbar -->
    <ul class="navbar-nav ml-auto ml-md-0">
<%--        <li class="nav-item dropdown no-arrow mx-1">--%>
<%--            <a class="nav-link dropdown-toggle" href="#" id="messagesDropdown" role="button" data-toggle="dropdown"--%>
<%--               aria-haspopup="true" aria-expanded="false">--%>
<%--                <span class="badge badge-danger" style="">7</span>--%>
<%--                <i class="fas fa-envelope fa-fw"></i>--%>
<%--            </a>--%>
<%--            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="messagesDropdown">--%>
<%--                <a class="dropdown-item" href="#" style="font-size: 12px!important;">View Questions</a>--%>
<%--            </div>--%>
<%--        </li>--%>
        <li class="nav-item dropdown no-arrow">
            <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown"
               aria-haspopup="true" aria-expanded="false">
                <i class="fas fa-user-circle fa-fw"></i>
            </a>
            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="userDropdown">
                <a class="dropdown-item" href="#" style="font-size: 12px!important;" data-toggle="modal"
                   data-target="#logoutModal">
                    <fmt:message key="common.logout"/>
                </a>
            </div>
        </li>
    </ul>

</nav>