<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body{
background : pink ;
}

</style>
<body>
<a href = "http://localhost:8080/OnlineParkingSystem/">Back</a>
<%
String username = (String)request.getSession().getAttribute("username");
String password = (String)request.getSession().getAttribute("password");
String message = (String)request.getSession().getAttribute("message");
%>
<h1><%= message%></h1>
<% request.getSession().removeAttribute("message"); %>
</body>
</html>