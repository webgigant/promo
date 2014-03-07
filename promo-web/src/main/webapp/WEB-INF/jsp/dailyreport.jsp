<%@ include file="/WEB-INF/template/includes.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>
<h1>Ежедневный отчет</h1>
<h2>Бренды</h2>
<h5>нет, мало, много</h5>
<form role="form" method="POST" action='<c:url value="/task/dailyreport"/>' >
    <c:forEach items="${user.dailyReports}" var="report">
    <div class="form-group">
        <div class="form-control">
             <input type="radio" name="${report.brand.name}" value="NO" checked/>
             <input type="radio" name="${report.brand.name}" value="LOW"/>
             <input type="radio" name="${report.brand.name}" value="HIGH"/>
             <label>${report.brand.name}</label>
        </div>
    </div>
    </c:forEach>

<h2>Категории</h2>
<h5>нет, мало, много</h5>
    <c:forEach items="${user.productDailyReports}" var="report">
        <div class="form-group">
            <div class="form-control">
                <input type="radio" name="${report.category.name}" value="NO" checked/>
                <input type="radio" name="${report.category.name}" value="LOW"/>
                <input type="radio" name="${report.category.name}" value="HIGH"/>
                <label>${report.category.name}</label>
            </div>
        </div>
    </c:forEach>
    <button class="btn btn-lg btn-success" type="submit" >Выполнить задачу</button>
</form>
