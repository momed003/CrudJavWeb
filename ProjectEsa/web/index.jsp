<%-- 
    Document   : index
    Created on : Apr 7, 2025, 7:21:56 PM
    Author     : yassimin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crud Page</title>
        <link href="assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="assets/js/jquery-3.7.1.js"></script>
        <script src="assets/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>

        <form action="UserController" method="POST">
            <input type="text" name="user"/>
            <button class="btn btn-success" type="submit">Enviar</button>
        </form>
        <script>
            $(document).ready(function () {
                alert("bem-vindo!")
            });
        </script>
    </body>
</html>
