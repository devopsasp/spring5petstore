<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h2>Add Pet Details</h2>
 <form:form method='post' action='addpetdetails' modelAttribute="pets">
 <form:label path="petName">Pet Name</form:label><br/>
 <form:input path="petName"/><br/>
 <form:label path="type">Pet Type</form:label><br/>
 <form:input path="type"/> <br/>
 <form:label path="age">Age</form:label><br/>
 <form:input path="age"/><br/>
 <input type='submit' value='save'/>
 </form:form>
 
 
  
  

</body>
</html>