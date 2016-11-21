<%-- 
    Document   : ReservationSuccess
    Created on : Nov 19, 2016, 2:25:11 AM
    Author     : Saraf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <style type="text/css">
            body{
                background-image: url(Photo/Daytrip3.jpg);
                background-size: 100%;
                width: 1450px;
                height: 950px;
                position: fixed;

                font-family: 'Josefin Sans', sans-serif;
            }
            h1{
                font-size: 50px;
                color: white;
                margin-top: 0px;
                padding-bottom: 5px;
            }
            .photo{
                height: 400px;
                width: 400px;
            }
            button{
                width: 150px;
            }
        </style>
        <link href="https://fonts.googleapis.com/css?family=Abel|Josefin+Sans" rel="stylesheet">
    </head>
    <body>
    <center>
        <br>
        <img class="photo" src="Photo/Daytrip02.png">
        <h1>Make Reservation Success !!</h1>
            <form action="RemoveSession" method="POST">
                <button type="submit" class="btn btn-success ">HOME</button>
            </form>
    </center>
</body>
</html>
