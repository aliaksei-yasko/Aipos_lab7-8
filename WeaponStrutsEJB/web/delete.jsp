<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<%-- 
    Document   : delete
    Created on : 07.12.2011, 21:17:20
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<% response.setContentType ("text/html; charset=UTF-8");
   request.setCharacterEncoding("UTF-8");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="style.css" >
    </head>
    <body>
        <html:form action="/viewAll" >
            <center>
                <table border="0">
                <thead>
                    <tr>
                        <th> <bean:write name="SelectForm" property="message" /> </th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td> <center> <html:submit value="Вернуться" /> </center> </td>
                    </tr>
                </tbody>
            </table>
            </center>
        </html:form>
    </body>
</html>
