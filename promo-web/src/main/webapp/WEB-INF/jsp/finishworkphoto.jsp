<%@ include file="/WEB-INF/template/includes.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>

<div class="page-header">
    <h1>Фото (ушел с работы)</h1>
</div>
<form role="form" method="POST" action='<c:url value="/photoupload"/>' enctype="multipart/form-data">
    <input name="taskType" type="hidden" value="finishworkphoto">
    <div class="form-group">
        <input id="fileupload" type="file" name="file">
    </div>
    <div class="form-group">
        <input name="partially" type="checkbox"> Не все на фото
    </div>
    <button class="btn btn-lg btn-success" type="submit" >Выполнить задачу</button>
</form>
