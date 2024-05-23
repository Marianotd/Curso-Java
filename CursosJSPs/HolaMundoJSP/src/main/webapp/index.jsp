<%-- 
    Document   : index
    Created on : 3 may. 2024, 11:02:18
    Author     : Mariano
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>HolaMundo JSPs</title>
    </head>
    <body>
        <h1>HolaMundo JSPs</h1>
        <ul>
            <li><% out.print("HolaMundo con Scriptlets");%></li>
            <li>${"HolaMundo con Expression Language (EL)"}</li>
            <li><%= "HolaMundo con Expresiones"%></li>
            <li><c:out value="HolaMundo con JSTL" /></li>
        </ul>

    </body>
</html>
