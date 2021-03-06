<%@ include file="/WEB-INF/template/includes.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>

<div class="page-header">
    <h1>Основные задачи</h1>
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
<c:forEach items="${user.currentTasks}" var="task" >
    <c:if test="${task.completed == false}">
        <p>
            <a href='<c:url value="/task/${task.type}"/>'>
                <button class="btn btn-lg btn-primary" type="button"><spring:message code="task.${task.type}"/></button>
            </a>
        </p>
    </c:if>
</c:forEach>
