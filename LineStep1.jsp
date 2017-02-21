<%-- 
    Document   : LineStep1
    Created on : Dec 19, 2016, 2:47:54 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="linestep2.jsp" Method="Post">
            No of Heads Required<input type="text" name="heads"/>
            Per Head No of values Required<input type="text" name="vals"/>
             Title of comparison <input type="text" name="comp"/>
             
            <input type="submit" value="Step2">
        </form>
    </body>
</html>
