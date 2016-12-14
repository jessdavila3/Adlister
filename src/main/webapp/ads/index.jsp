<%--
  Created by IntelliJ IDEA.
  User: jessedavila
  Date: 12/14/16
  Time: 11:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Viewing All the Ads" />
    </jsp:include>
</head>
<body>
<jsp:include page="../partials/navbar.jsp"/>
<h1>
    Here are some ads and stuff
</h1>
<div class="container">
    <c:forEach var="ad" items="${ads}">
        <div class="col-md-6">
            <h2>${ad.title}</h2>
            <p>${ad.description}</p>
        </div>
    </c:forEach>
</div>
</body>
</html>
