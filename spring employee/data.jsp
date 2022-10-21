 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<!DOCTYPE html>
<html>
<head>
<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css'>  
<script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
        <h1>	 <center><b>Details of the Employee</b></center></h1>
<table border="2" width="100%" cellpadding="2">  

<tr><th>Id</th><th>Name</th><th>Address</th><th>Edit</th><th>Delete</th> </tr>  
   <c:forEach items="${list}" var="emp" >   
     <tr> 
   <td>${emp.id}</td>  
   <td>${emp.name}</td>  
   <td>${emp.address}</td>  
 <th><i class='far fa-edit'></i></th><th><i class='fas fa-trash-alt'></i></th> 
    
   </tr>  
   </c:forEach> 
   </table>  
   
</body>
</html>