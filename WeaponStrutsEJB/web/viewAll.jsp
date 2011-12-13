<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<%-- 
    Document   : viewWeapon
    Created on : 06.12.2011, 22:37:53
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
        <center><h1>Содержимое</h1></center>
        <center>
            <html:form action="/delete">
                <div class="scroll-table">
                    <table>
                        <thead>
                            <tr>
                                <th></th>
                                <th>Название</th>
                                <th>Тип</th>
                                <th>Вес</th>
                                <th>Длина</th>
                                <th>Калибр</th>
                                <th>Скорость пули</th>
                            </tr>
                        </thead>
                    <tbody>
                        <logic:iterate id="weapon" name="ViewAllForm" property="weapons" indexId="index">
                       <tr>
                           <td>
                               <html:multibox name="SelectForm" property="selected">
                                   <bean:write name="weapon" property="name" />
                               </html:multibox>
                           </td>
                           <td> <a href="viewWeapon.do?name=<bean:write name="weapon" property="name"/>"> <bean:write name="weapon" property="name" /> </a></td>
                           <td> <bean:write name="weapon" property="type" /> </td>
                           <td> <bean:write name="weapon" property="weight" /> </td>
                           <td> <bean:write name="weapon" property="length" /> </td>
                           <td> <bean:write name="weapon" property="caliber" /> </td>
                           <td> <bean:write name="weapon" property="speadOfTheBullet" /> </td>
                       </tr>
                        </logic:iterate>
                        </tbody>
                    </table>
                </div>
                <p><html:submit value="Удалить" />
            </html:form>
            <form action="add.jsp">
                <input type="submit" value="Добавить" name="add" />
            </form>
        </center>
    </body>
</html>
