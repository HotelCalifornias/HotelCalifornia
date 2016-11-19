<%-- 
    Document   : DetailRoom
    Created on : Nov 13, 2016, 9:46:57 PM
    Author     : PT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detail Room</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <h1>Detail Room</h1>
        <form action="Reservation" method="POST">
            <c:forEach items="${roomsDe}" var="r">
                <div class="container">
                    <div class="row blog">
                        <div class="col-md-3">
                            <img class="imgblog" src="Photo/${r.roomId}.jpg">
                        </div>
                        <div class="col-md-9">
                            <h1>Rooms ID :: ${r.roomId}</h1>
                            <p>${r.roomName}</p>
                            <p>${r.capacity}</p>
                            <p>${r.roomDes}</p>
                            <input type="text" name="roomPrice" value="${r.price}"/>
                            <input type="text" value="${stringDateStart}"/>
                            <input type="text" value="${stringDateEnd}"/>
                            <p>${days}</p>
                            <c:forEach items="${roomServices}" var="rs">
                                <p>${rs.serviceDes}</p> <input type="text" name="price" value="${rs.servicePrice}"/>
                            </c:forEach>
                            <input type="submit"/>
                        </div>
                    </div>
                </div>
            </c:forEach>
            
        </form>

    </body>
</html>
