<%@ include file="/WEB-INF/template/includes.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>

<c:forEach items="${user.currentTasks}" var="task" >
    <c:if test="${task.completed == false}">
        <p>
            <a href='<c:url value="/task/${task.type}"/>'>
                <button class="btn btn-lg btn-primary" type="button"><spring:message code="task.${task.type}"/></button>
            </a>
        </p>
    </c:if>
</c:forEach>
