<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%-- 
    Document   : viewWeapon
    Created on : 07.12.2011, 23:03:42
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Просмотр</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <center>
            <h1><bean:write name="ViewWeaponForm" property="message" /></h1>
            <table border="0" width="500">
                <thead>
                    <tr>
                        <th colspan="2">Weapons  <bean:write name="ViewWeaponForm" property="name" /> </th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><strong>Название: </strong></td>
                        <td><span style="font-size:smaller; font-style:italic;"><bean:write name="ViewWeaponForm" property="name" /></span></td>
                    </tr>
                    <tr>
                        <td><strong>Тип: </strong></td>
                        <td>
                            <bean:write name="ViewWeaponForm" property="type" />
                        </td>
                    </tr>
                    <tr>
                        <td><strong>Вес: </strong></td>
                        <td>
                            <bean:write name="ViewWeaponForm" property="weight" />
                        </td>
                    </tr>
                    <tr>
                        <td><strong>Длина: </strong></td>
                        <td>
                            <bean:write name="ViewWeaponForm" property="length" />
                        </td>
                    </tr>
                    <tr>
                        <td><strong>Калибр: </strong></td>
                        <td>
                            <bean:write name="ViewWeaponForm" property="caliber" />
                        </td>
                    </tr>
                    <tr>
                        <td><strong>Скорость пули: </strong></td>
                        <td>
                            <bean:write name="ViewWeaponForm" property="speadOfTheBullet" />
                        </td>
                    </tr>
                    <tr>
                        <html:form action="/viewAll">
                            <td class="td_end">
                                <center><html:submit value="Вернуться" /></center>
                            </td>
                        </html:form>
                        <html:form action="/toChange">
                            <input type="hidden" name="name" value="<bean:write name="ViewWeaponForm" property="name" />" />
                            <td class="td_end">
                                <center><html:submit value="Изменить" /> </center>
                            </td>
                        </html:form>
                    </tr>
                </tbody>
            </table>
        </center>
    </body>
</html>
