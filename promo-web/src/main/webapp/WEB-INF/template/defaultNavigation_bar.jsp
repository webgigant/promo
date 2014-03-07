<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="/WEB-INF/template/includes.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>

<nav role="navigation" class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <button data-target="#bs-example-navbar-collapse-5" data-toggle="collapse" class="navbar-toggle" type="button">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a href="#" class="navbar-brand"><fmt:formatDate value="${currentDate}"/></a>
        </div>
        <c:if test="${not empty user}">
            <div class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li><a href='<c:url value="/"/>'>На главную</a></li>
                    <li><a href='<c:url value="/services"/>'>Дополнительный сервис</a></li>
                </ul>
                <p class="navbar-text navbar-right">Добрый день, ${user.name}. <a href='<c:url value="/logout"/>'>Выход</a></p>
            </div>
        </c:if>
    </div>
</nav>
<p>У Вас новых <span class="badge">2</span> <a href="#">сообщений</a></p>