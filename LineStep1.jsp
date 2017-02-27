
/*this is the first page where user enter no of heads ,values or title required */
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">/*it specifies the character encoding for the HTML document*/
        <title>JSP Page</title>
    </head>
    <body>
        <form action="linestep2.jsp" Method="Post"> /*it is connected to the linestep2.jsp page*/
            No of Heads Required<input type="text" name="heads"/>
            Per Head No of values Required<input type="text" name="vals"/>
             Title of comparison <input type="text" name="comp"/>
             
            <input type="submit" value="Step2">
        </form>
    </body>
</html>
