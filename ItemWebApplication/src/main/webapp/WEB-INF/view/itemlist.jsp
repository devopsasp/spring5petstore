<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List,com.model.Item"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List<Item> itemlist=(List)request.getAttribute("itemlist");
out.println("<ul>");
for(Item i:itemlist)
{
	out.println("<li>");
	out.println(i);
	out.println("</li>");
}
out.println("</ul>");
%>
</body>
</html>