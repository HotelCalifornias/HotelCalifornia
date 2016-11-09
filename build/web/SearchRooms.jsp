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
        <!-- hover.css -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/hover.css/2.0.2/hover-min.css">
        <!-- animate.css -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/animatecss/3.5.2/animate.min.css">
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
                margin-bottom: 2rem;
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
                    <img class="imgbg" src="http://www.statravel.co.th/static/th_division_web_live2/assets/Careers-960x400-why-travel-til.jpg"/>
                </div>
                <div class="row">
                    <form class="form-inline text-center topsearch">
                        <div class="form-group">
                            <label>Hotel:</label>
                            <input type="text" class="form-control" placeholder="Search"/>
                        </div>
                        <div class="form-group">
                            <label>Check in:</label>
                            <input type="date" name="start_date" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <label>Check out:</label>
                            <input type="date" name="end_date" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <button type="submit" class="btn btn-primary">Search</button>
                        </div>
                    </form>
                </div>
            </div>
            <br>
            <div class="container">
                <div class="row blog">
                    <div class="col-md-3">
                        <img class="imgblog" src="http://cdn.home-designing.com/wp-content/uploads/2010/10/living-room-artificial-light-by-ferdaviola.jpg">
                    </div>
                    <div class="col-md-9">
                        <h1>Test Rooms</h1>
                        Lorem ipsum dolor sit amet, consectetur adipisicing elit...
                            Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...
                    </div>
                </div>
            </div>
            <script type="text/javascript" src="//code.jquery.com/jquery-1.11.0.min.js"></script>
            <script type="text/javascript" src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
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
            </script>
    </body>
</html>
