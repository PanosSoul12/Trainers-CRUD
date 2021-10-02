<%-- 
    Document   : trainers
    Created on : 17 Ιουν 2021, 10:43:33 πμ
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css" />
        <title>JSP Page</title>
    </head>
    <body>
        <a href="<%=request.getContextPath()%>">Back to home</a></br>
        <u><h1 id="train">Trainers</h1></u>
           
             <c:forEach items="${view_trainer}" var="trainer">
        <p>
            
        <table id="tab">
            <tr>
                <td>Trainer Id : ${trainer.id}</td>
                <td> <a href="<%=request.getContextPath()%>/trainer/delete/${trainer.id}">Delete </a></td>
                 <td>&nbsp;&nbsp; <a href="<%=request.getContextPath()%>/trainer/update/${trainer.id}">Update </a></td>
            </tr>
            
            <tr>
                <td>Trainer FirstName : ${trainer.fName}</td>
            </tr>
            
            <tr>
                <td>Trainer LastName  : ${trainer.lName}</td>
            </tr>
            
            <tr>
                <td>Email : ${trainer.email}</td>
            </tr>
            
            <tr>
                <td>Subject : ${trainer.subject}</td>
            </tr>
            
        </table></br>
        </c:forEach>
    </p>
    
    </body>
</html>
