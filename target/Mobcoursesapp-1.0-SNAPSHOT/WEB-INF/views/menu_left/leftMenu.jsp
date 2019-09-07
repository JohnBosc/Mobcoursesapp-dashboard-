<%--<%@ include file="../includes/includes.jsp" %>--%>

<style>

    a.itemsMenu, span.myMenu{font-size: 12px!important; color: #fff!important; font-weight: bold!important;}

</style>

<ul class="sidebar navbar-nav bg-dark">
    <li class="nav-item">
        <hr class="sidebar-divider" style="background: #fff!important; margin:10px 15px!important;">
        <c:url value="/dashboard/" var="dashboard"/>
        <a class="nav-link itemsMenu" href="${dashboard}">
            <i class="fas fa-fw fa-tachometer-alt"></i>
             <span class="myMenu"><fmt:message key="common.dashboard"/> </span>
        </a>
        <hr class="sidebar-divider" style="background: #fff!important; margin:10px 15px!important;">
    </li>

    <li class="nav-item">
        <%--     dropdown-toggle   id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"--%>
        <c:url value="/course/" var="course"/>
        <a class="nav-link itemsMenu" href="${course}">
            <i class="fas fa-fw fa-graduation-cap"></i>
             <span class="myMenu"><fmt:message key="common.courses"/> </span>
        </a>

    </li>
<%--    <li class="nav-item">--%>
<%--        &lt;%&ndash;     dropdown-toggle   id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"&ndash;%&gt;--%>
<%--        <c:url value="/course/" var="course"/>--%>
<%--        <a class="nav-link itemsMenu" href="${course}">--%>
<%--            <i class="fas fa-fw fa-sitemap"></i>--%>
<%--             <span class="myMenu"><fmt:message key="common.course.IT"/> </span>--%>
<%--        </a>--%>
<%--    </li>--%>
<%--    <li class="nav-item">--%>
<%--        &lt;%&ndash;     dropdown-toggle   id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"&ndash;%&gt;--%>
<%--        <c:url value="/course/" var="course"/>--%>
<%--        <a class="nav-link itemsMenu" href="${course}">--%>
<%--            <i class="fas fa-fw fa-language"></i>--%>
<%--             <span class="myMenu"><fmt:message key="common.course.Language_menu"/> </span>--%>
<%--        </a>--%>
<%--    </li>--%>
<%--    <li class="nav-item">--%>
<%--        &lt;%&ndash;     dropdown-toggle   id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"&ndash;%&gt;--%>
<%--        <c:url value="/course/" var="course"/>--%>
<%--        <a class="nav-link itemsMenu"   href="${course}">--%>
<%--            <i class="fas fa-fw fa-bong"></i>--%>
<%--             <span class="myMenu"><fmt:message key="common.course.Science"/> </span>--%>
<%--        </a>--%>
<%--    </li>--%>
<%--    <li class="nav-item">--%>
<%--        &lt;%&ndash;     dropdown-toggle   id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"&ndash;%&gt;--%>
<%--        <c:url value="/course/" var="course"/>--%>
<%--        <a class="nav-link itemsMenu"   href="${course}">--%>
<%--            <i class="fas fa-fw fa-star-of-life"></i>--%>
<%--             <span class="myMenu"><fmt:message key="common.course.Health"/> </span>--%>
<%--        </a>--%>
<%--    </li>--%>
<%--    <li class="nav-item">--%>
<%--        &lt;%&ndash;     dropdown-toggle   id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"&ndash;%&gt;--%>
<%--        <c:url value="/course/" var="course"/>--%>
<%--        <a class="nav-link itemsMenu"   href="${course}">--%>
<%--            <i class="fas fa-fw fa-male"></i>--%>
<%--             <span class="myMenu"><fmt:message key="common.course.Humanities"/> </span>--%>
<%--        </a>--%>
<%--    </li>--%>
<%--    <li class="nav-item">--%>
<%--        &lt;%&ndash;     dropdown-toggle   id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"&ndash;%&gt;--%>
<%--        <c:url value="/course/" var="course"/>--%>
<%--        <a class="nav-link itemsMenu"   href="${course}">--%>
<%--            <i class="fas fa-fw fa-code"></i>--%>
<%--             <span class="myMenu"><fmt:message key="common.course.Software_Development"/> </span>--%>
<%--        </a>--%>
<%--    </li>--%>
<%--    <li class="nav-item">--%>
<%--        &lt;%&ndash;     dropdown-toggle   id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"&ndash;%&gt;--%>
<%--        <c:url value="/course/" var="course"/>--%>
<%--        <a class="nav-link itemsMenu"   href="${course}">--%>
<%--            <i class="fas fa-fw fa-ambulance"></i>--%>
<%--             <span class="myMenu"><fmt:message key="common.course.Health_Care"/> </span>--%>
<%--        </a>--%>
<%--    </li>--%>
<%--    <li class="nav-item">--%>
<%--        &lt;%&ndash;     dropdown-toggle   id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"&ndash;%&gt;--%>
<%--        <c:url value="/course/" var="course"/>--%>
<%--        <a class="nav-link itemsMenu"   href="${course}">--%>
<%--            <i class="fas fa-fw fa-ad"></i>--%>
<%--             <span class="myMenu"><fmt:message key="common.course.Marketing"/> </span>--%>
<%--        </a>--%>
<%--    </li>--%>
<%--    <li class="nav-item">--%>
<%--        &lt;%&ndash;     dropdown-toggle   id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"&ndash;%&gt;--%>
<%--        <c:url value="/course/" var="course"/>--%>
<%--        <a class="nav-link itemsMenu"   href="${course}">--%>
<%--            <i class="fas fa-fw fa-heartbeat"></i>--%>
<%--             <span class="myMenu"><fmt:message key="common.course.Life_Science"/> </span>--%>
<%--        </a>--%>
<%--    </li>--%>
<%--    <li class="nav-item">--%>
<%--        &lt;%&ndash;     dropdown-toggle   id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"&ndash;%&gt;--%>
<%--        <c:url value="/course/" var="course"/>--%>
<%--        <a class="nav-link itemsMenu"   href="${course}">--%>
<%--            <i class="fas fa-fw fa-business-time"></i>--%>
<%--             <span class="myMenu"><fmt:message key="common.course.Business"/> </span>--%>
<%--        </a>--%>
<%--    </li>--%>
<%--    <li class="nav-item">--%>
<%--        &lt;%&ndash;     dropdown-toggle   id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"&ndash;%&gt;--%>
<%--        <c:url value="/course/" var="course"/>--%>
<%--        <a class="nav-link itemsMenu"   href="${course}">--%>
<%--            <i class="fas fa-fw fa-industry"></i>--%>
<%--             <span class="myMenu"><fmt:message key="common.course.Operations"/> </span>--%>
<%--        </a>--%>
<%--    </li>--%>
<%--    <li class="nav-item">--%>
<%--        &lt;%&ndash;     dropdown-toggle   id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"&ndash;%&gt;--%>
<%--        <c:url value="/course/" var="course"/>--%>
<%--        <a class="nav-link itemsMenu"   href="${course}">--%>
<%--            <i class="fas fa-fw fa-square-root-alt"></i>--%>
<%--             <span class="myMenu"><fmt:message key="common.course.Math_menu"/> </span>--%>
<%--        </a>--%>
<%--    </li>--%>
<%--    <li class="nav-item">--%>
<%--        &lt;%&ndash;     dropdown-toggle   id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"&ndash;%&gt;--%>
<%--        <c:url value="/course/" var="course"/>--%>
<%--        <a class="nav-link itemsMenu"   href="${course}">--%>
<%--            <i class="fas fa-fw fa-sync"></i>--%>
<%--             <span class="myMenu"><fmt:message key="common.course.Software_Engineering"/> </span>--%>
<%--        </a>--%>
<%--    </li>--%>
<%--    <li class="nav-item">--%>
<%--        &lt;%&ndash;     dropdown-toggle   id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"&ndash;%&gt;--%>
<%--        <c:url value="/course/" var="course"/>--%>
<%--        <a class="nav-link itemsMenu"   href="${course}">--%>
<%--            <i class="fas fa-fw fa-wrench"></i>--%>
<%--             <span class="myMenu"><fmt:message key="common.course.Skilled_Trades"/> </span>--%>
<%--        </a>--%>
<%--    </li>--%>
<%--    <li class="nav-item">--%>
<%--        &lt;%&ndash;     dropdown-toggle   id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"&ndash;%&gt;--%>
<%--        <c:url value="/course/" var="course"/>--%>
<%--        <a class="nav-link itemsMenu"   href="${course}">--%>
<%--            <i class="fas fa-fw fa-music"></i>--%>
<%--             <span class="myMenu"><fmt:message key="common.course.Lifestyle"/> </span>--%>
<%--        </a>--%>
<%--    </li>--%>
<%--    <li class="nav-item">--%>
<%--        &lt;%&ndash;     dropdown-toggle   id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"&ndash;%&gt;--%>
<%--        <c:url value="/course/" var="course"/>--%>
<%--        <a class="nav-link itemsMenu"   href="${course}">--%>
<%--            <i class="fas fa-fw fa-coins"></i>--%>
<%--             <span class="myMenu"><fmt:message key="common.course.Finance"/> </span>--%>
<%--        </a>--%>
<%--    </li>--%>

</ul>