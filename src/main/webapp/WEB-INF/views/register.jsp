<%-- 
    Document   : register
    Created on : Nov 13, 2016, 12:04:56 PM
    Author     : razamd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registration Page</h1>
        <div>
            <h3>${requestScope.message}</h3>
            <form action="signup" method="post">
                <table>
                    <tr><td><input type="text" name="username" placeholder="Name" /></td></tr>
                    <tr><td><input type="text" name="email" placeholder="Email Id" /></td></tr>
                    <tr><td><input type="password" name="password" placeholder="Password"/></td></tr>
                    <tr><td><input type="submit" value="Register" /></td></tr>
                </table>               
            </form>
        </div>
    </body>
</html>
