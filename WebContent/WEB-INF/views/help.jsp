<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
	<h1>This is help Page</h1>
	<%
	/* String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	LocalDateTime time = (LocalDateTime) request.getAttribute("time"); */
	%>

	<h1>
		Name is :
		<%-- <%=name%> --%>
		${name }
	</h1>
	<h1>
		Id is :
		<%-- <%=id%> --%>
		${id }
	</h1>

	<h1>
		Date and Time is
		<%-- <%=time.toString()%> --%>
		${time }
	</h1>
	<hr>
	<c:forEach var="item" items="${marks}">
		<h1>
			<c:out value="${item}"></c:out>
		</h1>
	</c:forEach>

<link rel="stylesheet" type="text/css" href="css/stylesheet.css"/>

</body>
</html>