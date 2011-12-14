<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<%--
    Document   : addWeapon
    Created on : 27.11.2011, 14:29:13
    Author     : Alexei Yasko
--%>

<%-- Setup encodind of request --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add weapon</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <center>
            <h1>
                <logic:present name="AddForm" property="message">
                    <bean:write name="AddForm" property="message" />
                </logic:present>
            </h1>
            <html:form action="/addWeapon">
            <table border="0" width="500">
                <thead>
                    <tr>
                        <th colspan="2">Введите данные для добавления оружия в справочник</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Название:</td>
                        <td><html:text name="AddForm" property="name" /> </td>
                    </tr>
                    <tr>
                        <td>Тип:</td>
                        <td><html:text name="AddForm" property="type" /></td>
                    </tr>
                    <tr>
                        <td>Вес:</td>
                        <td><html:text name="AddForm" property="weight" /></td>
                    </tr>
                    <tr>
                        <td>Длина:</td>
                        <td><html:text name="AddForm" property="length" /></td>
                    </tr>
                    <tr>
                        <td>Калибр:</td>
                        <td><html:text name="AddForm" property="caliber" /></td>
                    </tr>
                    <tr>
                        <td>Скорость пули:</td>
                        <td><html:text name="AddForm" property="speadOfTheBullet" /></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" value="Добавить" name="addWeapon" /></td>
                    </tr>
                </tbody>
            </table>
            </html:form>
                <html:form action="/viewAll">
                <table border="0" width="500">
                    <thead>
                        <tr>
                            <th><center><html:submit value="Вернуться" /></center></th>
                        </tr>
                    </thead>
                    <tbody>
                    </tbody>
                </table>
            </html:form>
        </center>
    </body>
</html>
