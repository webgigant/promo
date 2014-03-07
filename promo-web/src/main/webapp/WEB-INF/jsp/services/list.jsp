<%@ include file="/WEB-INF/template/includes.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>
<div class="page-header">
    <h1>Дополнительные сервисы</h1>
</div>
<c:if test="${not empty successMessage}">
    <div class="alert alert-success">
        <button type="button" class="close" data-dismiss="alert">&times;</button>
        <spring:message code="${successMessage}"/>
    </div>
</c:if>
<c:if test="${not empty errorMessage}">
    <div class="alert alert-danger">
        <button type="button" class="close" data-dismiss="alert">&times;</button>
        <spring:message code="${errorMessage}"/>
    </div>
</c:if>
<p>
    <a href='<c:url value="/services/defectsearch"/>'>
        <button class="btn btn-lg btn-info" type="button">Брак</button>
    </a>
</p>

<p>
    <a href='<c:url value="/services/delivery"/>'>
        <button class="btn btn-lg btn-info" type="button">Контроль качества поставок</button>
    </a>
</p>
<p>
    <a href='<c:url value="/services/netimport"/>'>
        <button class="btn btn-lg btn-info" type="button">Импорт сети</button>
    </a>
</p>
<p>
    <a href='<c:url value="/services/storage"/>'>
        <button class="btn btn-lg btn-info" type="button">Хранение товара</button>
    </a>
</p>