<%-- 
    Document   : SearchRooms
    Created on : Oct 23, 2016, 9:28:53 PM
    Author     : Saraf
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <!-- hover.css -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/hover.css/2.0.2/hover-min.css">
        <!-- animate.css -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/animatecss/3.5.2/animate.min.css">

        <link rel="stylesheet" type="text/css" href="sweetalert-master/dist/sweetalert.css">
        <style>
            #custom-nav.affix {
                min-width: 100%;
                background-color: black;
                opacity: 0.8;
                -webkit-transition: background .5s ease-in-out, opacity .5s ease;
                -moz-transition: background .5s ease-in-out, opacity .5s ease;
                transition: background .5s ease-in-out, opacity .5s ease;
            }
            #hovernav{
                background-color: rgba(0,0,0,0);
                color: #fff;
            }
            #hovernav:hover{
                color: #179b77;
                opacity: 1; 
            }
            .icon-bar{
                background-color: #fff;
            }
            #login-dp{
                min-width: 44vh;
                padding: 15px 15px 0;              
            }
            #login-dp .form-group{
                margin-bottom: 20px;      
            }
            .hvr-underline-from-left:before{
                background: #179b77;
            }
            body{
                margin: 0;
                padding: 0;
            }
            .fullwidth {
                width: 100%;
                margin-top: -20px;
                margin-left: auto;
                margin-right: auto;
                max-width: initial;
            }
            .imgbg {
                width: 100%;   
                height: 265px;
            }
            .imgbg img {
                width: 100vh;
                height: 100%;
                min-height: 260px;
                max-height: 265px;
            }
            .topsearch {
                background-color: #313131;
                padding-top: 1em;
                padding-bottom: 1em;
                color: #fff;
            }
            .blog{
                border: 1px solid #e2e2e2;
                background-color: #fff;
                background-repeat: repeat-x;
                background-position: left bottom;
                margin-bottom: 2em;
                padding-top: 1em;
                padding-bottom: 1em;
                position: relative;
                z-index: 1;
                height: auto;
            }
            .imgblog{
                height: 208px;
                width: 256px;
            }
        </style>
        <title>Search Rooms</title>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
            <div class="fullwidth">
                <div class="container-fluid">
                    <div class="row">
                        <img class="imgbg" src="Photo/Header01.jpg"/>
                    </div>
                    <div class="row">
                        <form class="form-inline text-center topsearch" action="SearchHotelRooms" method="post">                          
                            <div class="form-group">
                                <label>Check in:</label>
                                <input onchange="DateCheck()" id="StartDate" type="date" name="start_date" class="form-control" required/>
                            </div>
                            <div class="form-group">
                                <label>Check out:</label>
                                <input onchange="DateCheck()" id="EndDate" type="date" name="end_date" class="form-control" required/>
                            </div>
                            <div class="form-group">
                                <label>Room Type</label>
                                <select class="form-control" name="rtype">
                                    <option value="1">Normal</option>
                                    <option value="2">Delux</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <button onclick="DateCheck()" id="butSearch" type="submit" class="btn btn-primary">Search</button>
                            </div>
                        </form>
                    </div>
                </div>
                <br>
                <br>
                <center>
                    <h1>${messageEmtry}</h1>
            </center>
            <c:forEach items="${rooms}" var="r">
                <div class="container">
                    <a href="DetailServlet?roomId=${r.roomId}">
                        <div class="row blog">
                            <div class="col-md-3">
                                <img class="imgblog" src="Photo/${r.roomId}.jpg">
                            </div>
                            <div class="col-md-9">
                                <h1>Rooms ID :: ${r.roomId}</h1>
                                <p>Room Name : ${r.roomName}</p>
                                <p>Room Type : ${r.type}</p>
                                <p>Capacity : ${r.capacity}</p>
                                <p>Description : ${r.roomDes}</p>
                                <p>Price : ${r.price}</p>
                            </div>
                        </div>
                    </a>
                </div>
            </c:forEach>
        </div>
    </body>
    <script type="text/javascript" src="//code.jquery.com/jquery-1.11.0.min.js"></script>
    <script type="text/javascript" src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
    <script src="sweetalert-master/dist/sweetalert.min.js"></script>
    <script>
        $(window).scroll(function () {
            if ($(".navbar").offset().top > 30) {
                $('#custom-nav').addClass('affix');
                $(".navbar-fixed-top").addClass("top-nav-collapse");
            } else {
                $('#custom-nav').removeClass('affix');
                $(".navbar-fixed-top").removeClass("top-nav-collapse");
            }
        });

        var today = new Date().toISOString().split('T')[0];
        document.getElementsByName("start_date")[0].setAttribute('min', today);
        document.getElementsByName("end_date")[0].setAttribute('min', today);

        function DateCheck()
        {
            var StartDate = document.getElementById('StartDate').value;
            var EndDate = document.getElementById('EndDate').value;
            var eDate = new Date(EndDate);
            var sDate = new Date(StartDate);
            if (StartDate != '' && StartDate != '' && sDate >= eDate)
            {
                swal("Wrong Input", "Please ensure that the End Date is greater than or equal to the Start Date.", "warning");
                document.getElementById("butSearch").disabled = true;
                return false;
            } else {
                document.getElementById("butSearch").disabled = false;
            }
        }
        ;
    </script>
</html>
