<%@page isErrorPage="true" %>
<%@page import="java.io.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manejo de Errores</title>
    </head>
    <body>
        <h1>Manejo de Errores</h1>
        <br/> <br/>
        Ocurrio una excepcion: <%= exception.getMessage()%>
        <br/>
        <textarea rows="10" cols="50">
            <% exception.printStackTrace(new PrintWriter(out));%>
        </textarea>
    </body>
</html>
