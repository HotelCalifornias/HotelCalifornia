<%-- 
    Document   : Reservation
    Created on : Nov 18, 2016, 10:38:02 PM
    Author     : Saraf
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <form action="ConfirmReservation" method="POST">
            <div class="container">
                <c:forEach items="${roomsDe}" var="r">
                    <div class="row">
                        <h1 class="text-center">Confirmation</h1>
                        <div class="col-md-12">
                            <div class="alert alert-success">
                                <strong>Confirm!</strong> You should read this message.
                            </div>

                            <table class="table">
                                <thead>
                                    <tr>
                                        <th>Description</th>
                                        <th>Detail</th>
                                        <th>Price</th>
                                    </tr>
                                </thead>
                                <tbody>

                                    <tr>
                                        <td>${r.roomDes}
                                            <input type="hidden" name="rt" value="${r.roomDes}"/>
                                        </td>
                                        <td>RoomID : ${r.roomId}
                                            <input type="hidden" name="roomId" value="${r.roomId}"><br>
                                            Roomname : ${r.roomName}
                                            <input type="hidden" name="rn" value="${r.roomName}"/><br>
                                            Capacity : ${r.capacity}
                                            <input type="hidden" name="rc" value="${r.capacity}"/><br>
                                            From : ${stringDateStart}
                                            <input type="hidden"  name="startDate" value="${stringDateStart}"/><br>
                                            To : ${stringDateEnd}
                                            <input type="hidden" name="endDate" value="${stringDateEnd}"/><br>
                                            Total Days : ${days}
                                            <input type="hidden" name="d" value="${days}"/><br>
                                        </td>
                                        <td>${r.price}</td>
                                    </tr>

                                </tbody>
                            </table>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <h1>Service</h1>
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th>Service type</th>
                                        <th class="text-center">Price</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>Food<br>
                                            Food2<br>
                                            Twin Beds<br>
                                            Large
                                        </td>
                                        <td class="text-center">${ftype}<br>
                                            ${f2type}<br>
                                            ${twin}<br>
                                            ${large}
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                        <div class="col-md-6">
                            <h1>Detail Account</h1>
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th>Profile</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${login}" var="a" varStatus="ac">
                                        <tr>
                                            <td>Account :<br>
                                                First Name :<br>
                                                Last Name :<br>
                                                Email :<br>
                                                Address :</td>
                                            <td>${a.username}
                                                <input type="hidden" value="${a.username}"/><br>
                                                ${a.fname}
                                                <input type="hidden" name="f" value="${a.fname}"/><br>
                                                ${a.lname}
                                                <input type="hidden" name="l" value="${a.lname}"/><br>
                                                ${a.email}
                                                <input type="hidden" name="e" value="${a.email}"/><br>
                                                ${a.address}
                                                <input type="hidden" value="${a.address}"/>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12">
                            <h3 class="well text-right">Total : ${totalPrice}
                                <input type="hidden" name="t" value="${totalPrice}"/>
                            </h3>
                        </div>
                    </div>
                </c:forEach>
                <div class="row">
                    <div class="col-md-12">
                        <button type="submit" class="btn btn-success pull-right">Confirm</button>
                    </div>
                </div>
                <br><br>
            </div>
        </form>
    </body>
    <script type="text/javascript" src="//code.jquery.com/jquery-1.11.0.min.js"></script>
    <script type="text/javascript" src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
</html>
