<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>


<%--
    Document   : login
    Created on : 06.12.2011, 18:59:38
    Author     : Admin
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Вход</title>
        <link rel="stylesheet" type="text/css" href="style.css" >
    </head>
    <body>
        <html:form action="/viewAll" >
            <center>
                <table border="0">
                <thead>
                    <tr>
                        <th>Справочник по различным видам оружия</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td> <center> <html:submit value="Вход" /> </center> </td>
                    </tr>
                </tbody>
            </table>
            </center>
        </html:form>
    </body>
</html>
