<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>View All Locations</title>
</head>

<body>

<h1>Locations</h1>

<table>
    <tr>
        <th>id</th>
        <th>code</th>
        <th>name</th>
        <th>type</th>
    </tr>

    <c:forEach items = "${locations}" var = "location" >
    <tr>
        <td>${location.id}</td>
        <td>${location.code}</td>
        <td>${location.name}</td>
        <td>${location.type}</td>
        <td>
            <a href="deleteLocation?id=${location.id}">delete</a>
        </td>
        <td>
            <a href="updateLocation?id=${location.id}">edit</a>
        </td>
    </tr>
    </c:forEach>

</table>
<a href="showCreate">Add Location</a>

</body>
</html>