<%-- 
    Document   : trainer_add
    Created on : 17 Ιουν 2021, 10:44:30 πμ
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css" />
        <title>ADD Page</title>
    </head>
    <body>
        <section class="add">
        <div class="welcome">
            <h1 id="headAdd" style="color: white">ADD  Trainer</h1></br>
            <form method="POST" action="/Assignment2/trainer/add" id="formStyle">
         <table>
            <tr>
            <b><td>Trainer Id :</td></b>
            <td><input name="id" value="${id}" type="text" required></td>
            </tr>
            <tr>
                <b><td>First Name :</td></b>
                    <td><input name="fName" value="${fName}" type="text" required></td>

            </tr>
            <tr>
                <b><td>Last Name : </td></b>
            <td><input name="lName" value="${lName}" type="text" required></td>

            </tr>
            <tr>
                <b><td>Trainer Email :</td></b>
                <td><input name="email" value="${email}" type="email" required></td>
               
            </tr>
            <tr>
                <b><td>Subject :</td></b>
            <td><input name="subject" value="${subject}" type="text" required></td>
                
            </tr>
            
         </table> <br>
        
         <b><input value="Add Trainer" type="submit" style="height: 30px;font-size: 20px"></b>
            
        </form>
    </div>
         </section>
    </body>
</html>
