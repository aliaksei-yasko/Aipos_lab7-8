<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<%-- 
    Document   : errorPage
    Created on : 07.12.2011, 14:28:52
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="style.css" >
    </head>
    <body>
        <center>
            <h1>Error: <bean:write name="ViewAllForm" property="errorMessage" /> </h1>
        </center>
    </body>
</html>
