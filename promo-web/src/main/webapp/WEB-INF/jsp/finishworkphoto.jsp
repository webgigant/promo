<%@ include file="/WEB-INF/template/includes.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>

<h1>Фото (ушел с работы)</h1>
<form role="form" method="POST" action='<c:url value="/photoupload"/>' enctype="multipart/form-data">
    <input name="taskType" type="hidden" value="finishworkphoto">
    <input id="fileupload" type="file" name="file">
    <div class="row">
        <div class="col-lg-6">
            <div class="input-group">
                <span class="input-group-addon">
                    <input name="partially" type="checkbox"> Не все на фото
                 </span>
            </div><!-- /input-group -->
        </div>
    </div><!-- /.row -->
    <button class="btn btn-lg btn-success" type="submit" >Выполнить задачу</button>
</form>
