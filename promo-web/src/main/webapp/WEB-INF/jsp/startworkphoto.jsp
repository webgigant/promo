<%@ include file="/WEB-INF/template/includes.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>
<div class="page-header">
    <h1>Фото (пришел на работу)</h1>
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
<form role="form" method="POST" action='<c:url value="/photoupload"/>' enctype="multipart/form-data">
    <input name="taskType" type="hidden" value="startworkphoto">
    <div class="form-group">
        <input id="fileupload" type="file" name="file">
    </div>
    <div class="form-group">
        <input name="partially" type="checkbox"> Не все на фото
    </div>
    <button class="btn btn-lg btn-success" type="submit" >Выполнить задачу</button>
</form>
