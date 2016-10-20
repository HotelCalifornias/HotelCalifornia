<%-- 
    Document   : AlertFile
    Created on : Oct 20, 2016, 4:04:16 PM
    Author     : Mikaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="sweetalert-master/dist/sweetalert.min.js"></script> 
        <link rel="stylesheet" type="text/css" href="sweetalert-master/dist/sweetalert.css">
        <script>
            function myFunction() {
            swal
            ({   
                title: "Error!",   
                text: "Here's my error message!",   
                type: "error",   
                confirmButtonText: "Cool" });
            }
        </script>
    </head>
    <body>
        <button onclick="myFunction()">Try it</button>
    </body>
</html>
