<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>

<html>

<head>
    <link href="<c:url value="/resources/css/home.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/crud.css" />" rel="stylesheet">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
</head>

<body>


    <div class="myHeader">
        <%@ include file="header.jsp" %>
    </div>


    <div class="main">

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

    </div>


    <div class="myFooter">
        <%@ include file="footer.jsp" %>
    </div>


</body>

</html>
