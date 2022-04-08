<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>
 Welcome to My Application
</h2>
<h3>
Add item details in below form
</h3>

 <form:form method="post" action="additem" modelAttribute="frmitem">
 <form:label path="itemName">Item Name</form:label><br/>
 <form:input  path="itemName"/><br/>
 <form:label path="price">Item Price</form:label><br/>
 <form:input path="price"/><br/>
 <input type='submit' value='save'/>
 
 
 </form:form>


</body>
</html>