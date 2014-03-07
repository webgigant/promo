<%@ include file="/WEB-INF/template/includes.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>

<div class="page-header">
    <h1>Авторизация</h1>
</div>
<c:if test="${not empty errorMessage}">
    <div class="alert alert-danger">
        <button type="button" class="close" data-dismiss="alert">&times;</button>
        <spring:message code="${errorMessage}"/>
    </div>
</c:if>
<form class="form-signin" role="form" action="login" method="POST">

    <input name="email" type="email" class="form-control" placeholder="Email address" required autofocus>
    <input name="password" type="password" class="form-control" placeholder="пароль" required>

    <button class="btn btn-lg btn-primary btn-block" type="submit"><spring:message code="signin.button"/></button>
</form>
