<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.model.Pets,java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h2>
    View our list of rescued friends 
     </h2>
     <h3>
    <%
      List<Pets> petlist=(List)request.getAttribute("petlist");
      for(Pets p:petlist)
      {%>
      
      <li>
      <% 
          out.println(p.getPetName());
          out.println(p.getAge());
          out.println(p.getType());
      }%>
      
     </li>
     </h2>
</body>
</html>