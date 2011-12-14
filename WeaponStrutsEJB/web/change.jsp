<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<%-- 
    Document   : change
    Created on : 07.12.2011, 23:52:25
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Изменение оружия</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>

    <body>
        <center>
            <h1><bean:write name="ChangeWeaponForm" property="message" /></h1>
            <html:form action="/changeWeapon">
            <table border="0" width="500">
                <thead>
                    <tr>
                        <th colspan="2">Изменение информации об оружии: <bean:write name="ChangeWeaponForm" property="name" /> </th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Название:</td>
                        <td>
                            <html:text name="ChangeWeaponForm" property="name" />
                        </td>
                    </tr>
                    <tr>
                        <td>Тип:</td>
                        <td>
                            <html:text name="ChangeWeaponForm" property="type" />
                        </td>
                    </tr>
                    <tr>
                        <td>Вес:</td>
                        <td>
                            <html:text name="ChangeWeaponForm" property="weight" />
                        </td>
                    </tr>
                    <tr>
                        <td>Длина:</td>
                        <td>
                            <html:text name="ChangeWeaponForm" property="length" />
                        </td>
                    </tr>
                    <tr>
                        <td>Калибр:</td>
                        <td>
                            <html:text name="ChangeWeaponForm" property="caliber" />
                        </td>
                    </tr>
                    <tr>
                        <td>Скорость пули:</td>
                        <td>
                            <html:text name="ChangeWeaponForm" property="speadOfTheBullet" />
                        </td>
                    </tr>
                    <tr>
                        <html:hidden name="ChangeWeaponForm" property="oldName" />
                        <td colspan="2"><html:submit value="Изменить" /></td>
                    </tr>
                </tbody>
            </table>
            </html:form>
            <html:form action="viewAll">
                <table border="0" width="500">
                    <thead>
                        <tr>
                            <th><center> <html:submit value="Вернуться" /> </center></th>
                        </tr>
                    </thead>
                    <tbody>
                    </tbody>
                </table>
            </html:form>
        </center>
    </body>
</html>
