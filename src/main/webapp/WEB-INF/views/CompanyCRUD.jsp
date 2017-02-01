<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>

<html>
<head>
    <link href="<c:url value="/resources/css/crud.css" />" rel="stylesheet">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Company</title>
</head>
<body>

    <div class="myHeader">
        <%@ include file="header.jsp" %>
    </div>


    <div class="main">
        <div class="nameOfTable">
            Company
        </div>
        <div class="crudTable">
            <table>
                <tr>
                    <th>ID</th>
                    <th>Theme</th>
                </tr>
                <c:forEach items="${themeList}" var="theme" varStatus="status">
                    <tr>
                        <td>${theme.id}</td>
                        <td>${theme.name}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>


    <div class="myFooter">
        <%@ include file="footer.jsp" %>
    </div>


</body>

</html>
