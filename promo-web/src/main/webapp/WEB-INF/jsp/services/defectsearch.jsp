<%@ include file="/WEB-INF/template/includes.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>
<div class="page-header">
    <h1>Брак</h1>
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
<form role="form" method="POST" action='<c:url value="/services/defectsearch"/>'>
    <div class="input-group">
          <input name="itemCode" type="text" class="form-control">
          <span class="input-group-btn">
            <button class="btn btn-default" type="submit">Найти</button>
          </span>
    </div>
</form>