<%@ include file="/WEB-INF/template/includes.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>

<div class="page-header">
    <h1>Брак</h1>
</div>
<h3>${defectProduct.name} - ${defectProduct.code}</h3>
<form role="form" method="POST" action='<c:url value="/services/defect"/>' enctype="multipart/form-data">
    <input type="hidden" value="${defectProduct.code}">
    <div class="form-group">
        <input id="fileupload" type="file" name="file">
    </div>
    <div class="form-group">
        <textarea class="form-control input-lg" rows="5" placeholder="Примечание" name="comment"></textarea>
    </div>
    <button class="btn btn-lg btn-success" type="submit" >Выполнить задачу</button>
</form>
