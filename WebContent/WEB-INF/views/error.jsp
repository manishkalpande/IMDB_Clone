<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Page</title>
</head>
<body>
	<h2>This is error Page</h2>
	<h2>Called by Global Controller</h2>

	<%
	//getting from global Controller
	//request is method of HttpServlet

	String name = (String) request.getAttribute("name");
	Integer age = (Integer) request.getAttribute("age");
	List<String> friends = (List<String>) request.getAttribute("f");
	%>

	<h1>
		Name is :<%=name%></h1>
	<h1>
		Age is :
		<%=age%></h1>

	<%
	for (String s : friends) {
	%>

	<h1><%=s%></h1>

	<%
	}
	%>
</body>
</html>