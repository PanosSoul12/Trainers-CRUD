<%-- 
    Document   : trainer_update
    Created on : 17 Ιουν 2021, 10:46:13 πμ
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="css/style.css" />
        <title>Trainers Update</title>
    </head>
    <body>
        <h1 id="updTr">Update Trainer</h1>
        <form method="POST" name="view_trainer"  
              action="<%=request.getContextPath()%>/trainer/update" id="formUpdate">
      
        <table>
            <tr>
                <td>Trainer Id : ${view_trainer.id}</td>
                 <td><input name="id" value="${id}" type="text" required></td>
            </tr>
            <tr>
                <td>Trainer First Name : ${view_trainer.fName}</td>
                     <td><input name="fName" value="${fName}" type="text" required></td>
            </tr>
            <tr>
                <td>Trainer Last Name : ${view_trainer.lName}</td>
                 <td><input name="lName" value="${lName}" type="text" required></td>

            </tr>
            <tr>
                <td>Trainer Email : ${view_trainer.email}</td>
                <td><input name="email" value="${email}" type="email" required></td>

            </tr>
            <tr>
                <td>Trainer Subject : ${view_trainer.subject}</td>
               <td><input name="subject" value="${subject}" type="text" required></td>
            </tr></br>
           
        </table>
         <input value="Update User" type="submit"/>
         </form>
        <br>
                   
        <a href="<%=request.getContextPath()%>">Back to home</a>
    </body>
</html>
