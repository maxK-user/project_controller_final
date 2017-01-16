<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--
Це щоб працював виклик атрибутів по ${...}
Щоб використати $ як звичайний символ, тепер пишеться \$
--%>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Secret</title>
</head>
<body>

<%-- чогось не працює: --%>
<h1>Hello ${name}</h1>

<%-- більш довгий варіант, який працює: --%>
<h2>Hello <%= request.getAttribute("name") %></h2>

<a href="secondServlet">Go to secret page (if you are correct user)</a>
</body>
</html>
