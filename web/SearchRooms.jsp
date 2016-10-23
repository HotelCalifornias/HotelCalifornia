<%-- 
    Document   : SearchRooms
    Created on : Oct 23, 2016, 9:28:53 PM
    Author     : Saraf
--%>

<%@page import="model.SearchHotelRooms"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <link href="https://fonts.googleapis.com/css?family=Inconsolata" rel="stylesheet"> 
        <title>JSP Page</title>
    </head>
    <body>
        <h1 style="margin-left:20px">Rooms :::</h1>
        
        <table>
            <tr>
                <td></td>
            </tr>
        </table>
        <div class="table-responsive">
            <table class="table table-striped" style="margin-left:20px">
                <tr style ='background-color : antiquewhite'>
                    <td style='text-align: center'>Room Number</td>
                    <td style='text-align: center'>Type</td>
                    <td style='text-align: center'>Floor</td>
                    <td style='text-align: center'>Description</td>
                    <td style='text-align: center'>Price</td>
                </tr>
                <%
                    List<SearchHotelRooms> sr = (List)request.getAttribute("rooms");
                    if(sr != null){
                    for (SearchHotelRooms r : sr) {
                %>
                <tr>
                    <td><%= r.getRoomNumber()%></td>
                    <td><%= r.getRoomType()%></td>
                    <td><%= r.getRoomFloor()%></td>
                    <td><%= r.getRoomDescription()%></td>
                    <td><%= r.getRoomPrice()%></td>
                </tr>
                <%}}%>
                
            </table>
        </div>
        <hr>
    </body>
</html>
