<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>

<html>

<head>
    <link href="<c:url value="/resources/css/crud.css" />" rel="stylesheet">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Admin</title>
</head>

<body>


    <div class="myHeader">
        <%@ include file="header.jsp" %>
    </div>


    <div class="main">
        <label>Please, choose table you want to view:</label>

        <select>
            <option>Company</option>
        </select>

        <%--add other variants--%>
        <input type="button" value="Choose this" onClick="location.href='showCompanyTable'" />
    </div>


    <div class="myFooter">
        <%@ include file="footer.jsp" %>
    </div>


</body>

</html>
