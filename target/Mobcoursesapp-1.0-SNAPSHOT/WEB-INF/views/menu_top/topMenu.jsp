<style>
    .input-group> input:focus {
        box-shadow: 0 0 !important;
        border: 1px solid #CED4DA!important;
    }
</style>
<nav class="navbar navbar-expand navbar-light bg-light static-top" style="background: #F4F2F0!important; ">

    <button class="btn btn-link btn-sm text-dark order-1 order-sm-0" id="sidebarToggle" href="#">
        <i class="fas fa-bars"></i>
    </button>
    <a class="navbar-brand mr-1" href="index.html"><fmt:message key="comon.appName"/></a>

    <!-- Navbar Search -->
    <form class="d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0">
        <div class="input-group">
            <input type="text" class="form-control" placeholder="Search for..." aria-label="Search"
                   aria-describedby="basic-addon2">
            <div class="input-group-append">
                <button class="btn btn-primary" style="background: #F9AC19!important; border: #F9AC19!important;" type="button">
                    <i class="fas fa-search"></i>
                </button>
            </div>
        </div>
    </form>

    <!-- Navbar -->
    <ul class="navbar-nav ml-auto ml-md-0">
        <li class="nav-item dropdown no-arrow mx-1">
            <a class="nav-link dropdown-toggle" href="#" id="alertsDropdown" role="button" data-toggle="dropdown"
               aria-haspopup="true" aria-expanded="false">
                <i class="fas fa-bell fa-fw"></i>
                <span class="badge badge-danger">9+</span>
            </a>
            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="alertsDropdown">
                <a class="dropdown-item" href="#" style="font-size: 12px!important;">Action</a>
                <a class="dropdown-item" href="#" style="font-size: 12px!important;">Another action</a>
                <div class="dropdown-divider" style="font-size: 12px!important;"></div>
                <a class="dropdown-item" href="#" style="font-size: 12px!important;">Something else here</a>
            </div>
        </li>
        <li class="nav-item dropdown no-arrow mx-1">
            <a class="nav-link dropdown-toggle" href="#" id="messagesDropdown" role="button" data-toggle="dropdown"
               aria-haspopup="true" aria-expanded="false">
                <i class="fas fa-envelope fa-fw"></i>
                <span class="badge badge-danger">7</span>
            </a>
            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="messagesDropdown">
                <a class="dropdown-item" href="#" style="font-size: 12px!important;">Action</a>
                <a class="dropdown-item" href="#" style="font-size: 12px!important;">Another action</a>
                <div class="dropdown-divider" style="font-size: 12px!important;"></div>
                <a class="dropdown-item" href="#" style="font-size: 12px!important;">Something else here</a>
            </div>
        </li>
        <li class="nav-item dropdown no-arrow">
            <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown"
               aria-haspopup="true" aria-expanded="false">
                <i class="fas fa-user-circle fa-fw"></i>
            </a>
            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="userDropdown">
                <a class="dropdown-item" href="#" style="font-size: 12px!important;">Settings</a>
                <a class="dropdown-item" href="#" style="font-size: 12px!important;">Activity Log</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#" style="font-size: 12px!important;" data-toggle="modal" data-target="#logoutModal">Logout</a>
            </div>
        </li>
    </ul>

</nav>