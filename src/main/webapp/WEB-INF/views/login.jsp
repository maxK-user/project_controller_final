<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>

<head>
    <link href="<c:url value="/resources/css/home.css" />" rel="stylesheet">
    <title>Home</title>
</head>

<body>
<!--
    <form class="box login">
        <fieldset class="boxBody">
            <label>Username</label>
            <input type="text" tabindex="1" placeholder="username" required/>
            <label><a href="#" class="rLink" tabindex="5">Forget your password?</a>Password</label>
            <input type="password" tabindex="2" required placeholder="password"/>
        </fieldset>
        <footer>
            <label><input type="checkbox" tabindex="3">Keep me logged in</label>
            <input type="submit" class="btnLogin" value="Login" tabindex="4">
        </footer>
    </form>
-->
    <form:form method="POST" commandName="userAuthorizationData" action="check-user" class="box login">

        <fieldset class="boxBody">

            <form:label path="login">Name:</form:label>
            <form:input path="login" />

            <form:label path="password">Password:</form:label>
            <form:password path="password"/>

        </fieldset>

        <footer>
            <input type="submit" class="btnLogin" value="Login" tabindex="4">
        </footer>

    </form:form>

</body>

</html>