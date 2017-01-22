<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration</title>
</head>

<body>

<h1>My Version 4</h1>

<%
    for (int i = 1; i < 4; i++) {
%>
<h<%= i %>>Registration from "firstPage.jsp"<h<%= i %>>
        <%
        }
    %>

    <form action="firstServlet" method="post"> <!-- get/post -->
        <input name="name" type="text" value="">
        <input value="Submit Button" type="submit">
    </form>

</body>
</html>
