<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<h2>List of users</h2>
<c:forEach begin="6" end="15" var="val">
    <c:out value="${val}"/>
</c:forEach>
<p>HELPPPP</p>
<table>
    <tr>
        <security:authorize access="hasRole('ADMIN')">
            <th>id</th>
        </security:authorize>
        <th>First name</th>
        <th>Email</th>
    </tr>
    <tr>
        <c:forEach items="${users}" var="user">
    <tr>
        <security:authorize access="hasRole('ADMIN')">
            <td>${user.id}</td>
        </security:authorize>
        <td>${user.firstName}</td>
        <td>${user.email}</td>
    </tr>
    </c:forEach>
</table>
<br>
<form:form
        action="${pageContext.request.contextPath}/logout" method="POST">
    <input type="submit"
           value="logout"/>
</form:form>
</html>