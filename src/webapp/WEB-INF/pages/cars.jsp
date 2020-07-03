<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>${title}</title>
</head>
<body>
<c:forEach var="car" items="${cars}">
    <h1>${car.model}</h1>
    <h2>${car.brand}</h2>
</c:forEach>
</body>
</html>
