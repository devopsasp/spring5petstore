<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List,com.model.Item"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>
    Welcome to home page
</h2>
    
    <%
      List<Item> itemlist=(List)request.getAttribute("itemlist");
out.println("<ul>");    
    for(Item i:itemlist)
    {
    	out.println("<li>");
    	out.println(i.getItemName()+" "+i.getPrice()+" "+i.getQuantity());
       out.println("</li>");
    }
    out.println("</ul>");
    %>
    
    
    
    
    
    <form:form method="post" action="additem" modelAttribute="itemattribute">
    <form:label path="itemName">Item Name</form:label><br/>
    <form:input path="itemName"/><br/>
    <form:label path="price">Price</form:label><br/>
    <form:input path="price"/><br/>
    <form:label path="quantity">Quantity</form:label><br/>
    <form:input path="quantity"/><br/>
    <input type='submit' value='save'/>
    </form:form>
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

</body>
</html>