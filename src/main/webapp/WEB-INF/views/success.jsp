<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.model.Pets"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
 Pets pets=(Pets)request.getAttribute("newpet");
 out.println(pets.getPetName()+" added to pet details");
%>
</body>
</html>