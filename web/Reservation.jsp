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
    </head>
    <body> 
        <form action="ConfirmReservation" method="POST">
            <c:forEach items="${login}" var="a" varStatus="ac">
                <table>
                    <tr>
                        <td>Account : <input type="text" value="${a.username}" disabled/></td>
                    </tr>
                    <tr>
                        <td>First Name : <input type="text"  value="${a.fname}" disabled/></td>
                    </tr>
                    <tr>
                        <td>Last Name : <input type="text" value="${a.lname}" disabled/></td>
                    </tr>
                    <tr>
                        <td>Email : <input type="text" value="${a.email}" disabled/></td>
                    </tr>
                    <tr>
                        <td>Address : <textarea rows="10" cols="60" disabled>${a.address}</textarea></td>
                    </tr>
                </table>  
            </c:forEach>
            <c:forEach items="${roomsDe}" var="r">
                <table>
                    <tr>
                        <td><input type="hidden" name="roomId" value="${r.roomId}"></td>
                        <td></td>
                            
                    </tr>
                    <tr>
                        <td>Room Number : </td>
                        <td><input type="text" value="${r.roomName}" disabled/></td>
                    </tr>
                    <tr>
                        <td>Room Type : </td>
                        <td><input type="text" value="${r.roomDes}" disabled/></td>
                    </tr>
                    <tr>
                        <td>Capacity : </td>
                        <td><input type="text" value="${r.capacity}" disabled/></td>
                    </tr>
                    <c:forEach items="${servicesChoose}" var="s" varStatus="sr">
                        <tr>
                            <td>Services : </td>
                            <td><input type="text" value="${s[sr.index].serviceDes}" disabled/></td>
                        </tr>
                    </c:forEach>
                    <tr>
                        <td>Total Price : </td>
                        <td><input type="hidden" name="t" value="${totalPrice}"/><input type="text" value="${totalPrice}" disabled/></td>
                    </tr>
                    <tr>
                        <td>Reservation Date From <input type="hidden"  name="startDate" value="${stringDateStart}"/>
                            <input type="text" value="${stringDateStart}" disabled/> To </td>
                        <td><input type="hidden" name="endDate" value="${stringDateEnd}"/>
                            <input type="text" value="${stringDateEnd}" disabled/></td>
                    </tr>
                    <tr>
                        <td>Total Days </td>
                        <td><input type="text" value="${days}" disabled/></td>
                    </tr>
                    <tr>
                        <td><input type="button" value="Cancel"/></td>
                        <td><input type="submit" value="Confirm"/></td>
                    </tr>

                </table>  
            </c:forEach>
        </form>

    </body> 







</html>
