<%@ include file="/WEB-INF/template/includes.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>

<div class="page-header">
    <h1>Конкуренты</h1>
</div>
<form role="form" method="POST" action='<c:url value="/task/competitor"/>' enctype="multipart/form-data">
    <div class="form-group">
        <input id="fileupload" type="file" name="file">
    </div>
    <div class="form-group">
        <textarea class="form-control input-lg" rows="5" placeholder="Примечание" name="comment"></textarea>
    </div>
    <div class="form-group">
        <input name="noChanges" type="checkbox"> Новых данных нет
    </div>

    <button class="btn btn-lg btn-success" type="submit" >Выполнить задачу</button>
</form>
