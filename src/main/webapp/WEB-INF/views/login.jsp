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

<input type="number" value="1" name="quantity" class="input-mini"/>
<button class="btn btn-primary" type="submit" name="addToCart"><i class="icon-shopping-cart icon-white"><jsp:text /></i> Add</button>
<button class="btn btn-secondary" type="submit" name="favourite"><jsp:text /> Favourite This!</button>

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
