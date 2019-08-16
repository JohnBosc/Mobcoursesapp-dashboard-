<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ page session="true" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="true" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%
    String locale = "en_US";
%>

<fmt:setLocale value="${locale}" />
<fmt:setBundle basename="i18n.applicationresources_en_US"/>
<%--src/main/resources/i18n/applicationresources_en_US.properties--%>
