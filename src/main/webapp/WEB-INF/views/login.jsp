<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!-- Всі ці файли знаходиться у папці WEB-INF, бо файли в ній приховані від прмого доступу користувача -->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
    <link href="<c:url value="/resources/css/home.css" />" rel="stylesheet">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Home</title>
</head>

<body>

<button type="submit" name="addToCart">Add</button>
<button type="submit" name="favourite">Favourite This!</button>

<form:form method="post" action="/firstSpring/saveVendor.html" modelAttribute="vendor">
<table border="1">
    <tr>
        <td><form:label path="vendorId">VendorId:</form:label></td>
        <td><form:input path="vendorId" value=""/></td>
        <td><input type="button" value="add" name="addVendor" onClick="location.href='addVendor.html'" /></td>
        <td><input type="submit" value="save" /></td>
    </tr>
    </form:form>

<a href="/SpringBookLibrarySystem/loanbooks.htm">Loan Books</a>

    <form:form method="POST" commandName="userAuthorizationData" action="check-user" class="box login">

        <fieldset class="boxBody">

            <form:label path="login">Login:</form:label>
            <form:input path="login" placeholder="login"/>
            <form:errors path="login" cssClass="error"/>

            <form:label path="password">Password:</form:label>
            <form:password path="password" placeholder="password"/>
            <form:errors path="password" cssClass="error"/>

        </fieldset>

        <footer>
            <input type="submit" class="btnLogin" value="Login">
        </footer>

    </form:form>

    <%--<button type="submit" name="superButton">Click me ;)</button>--%>


</body>

</html>
