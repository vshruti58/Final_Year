<%-- 
    Document   : linestep2
    Created on : Jan 26, 2017, 11:58:12 PM
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
         <h2>
        Heads Details
        </h2>
        
        <hr>
        <h2>
Step-2
        </h2>
        <form action="/onlinechart/lineChart" method="post">
        <table >
            
        <%
            String comp=request.getParameter("comp");
            int heads=Integer.valueOf(request.getParameter("heads"));
            
            int vals=Integer.valueOf(request.getParameter("vals"));
        for(int i=0;i<heads;i++)
        {
            out.println("<tr><td> Head " + (i+1) + " Title</td> <td><input type='text' name='headtitle'></td><td><table>" );
            
            
            for(int j=0;j<vals;j++)
            {
            out.println("<tr><td>" + comp +  " "+  (j+1) + ")</td><td><input type='text' name='secvalue'></td></tr>");
                
            }
            out.println("</table></td></tr>");
        }
            
            %>
            </table>
            <input type="hidden" name="comp" value=<%=comp %>  />
            <input type="hidden" name="vals" value=<%=vals %>  />
            
            <tr>
                <td>            <input type="checkbox" name="ch" value="ch"/> Do you want to see the data </td>
            </tr>
            <tr><td>
            <input type="submit" value="Generate Chart Image"/>
                </td>
            </tr>
    </body>
</html>
