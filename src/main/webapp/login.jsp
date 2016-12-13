<%--
  Created by IntelliJ IDEA.
  User: jessedavila
  Date: 12/13/16
  Time: 1:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="partials/navbar.jsp" %>

<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String username = request.getParameter("username");
        String pass = request.getParameter("password");
        if (username.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("password")) {
            response.sendRedirect("profile.jsp");
        }
    }
%>

<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <jsp:include page="partials/header.jsp">
        <jsp:param name="title" value="log in"/>
    </jsp:include>
</head>
<body>
<div class="container">
    <form method="post">
        <div class="form-group">
            <label for="username">username</label>
            <input name="username" type="text" class="form-control" id="username" placeholder="username">
        </div>
        <div class="form-group">
            <label for="password">password</label>
            <input name="password" type="password" class="form-control" id="password" placeholder="Password">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>

    </form>
</div>
</body>
</html>


