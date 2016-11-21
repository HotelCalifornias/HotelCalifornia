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
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/animatecss/3.5.2/animate.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/hover.css/2.0.2/hover-min.css">
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" 
              rel="stylesheet" 
              integrity="sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1" 
              crossorigin="anonymous"/>
        <link rel="stylesheet" type="text/css" href="slick-1.6.0/slick/slick.css"/>
        <link rel="stylesheet" type="text/css" href="slick-1.6.0/slick/slick-theme.css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <style>
            body{
                background-image: url("http://eskipaper.com/images/aurora-wallpaper-10.jpg");
            }
            .imgRoom{
                width: 100%;
                height: 315px;
            }
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
            .navImg{
                height: 105px;
                width: 100%;
            }
            .gallary{
                height: 100%;
            }
            .current{
                border: 3px solid #179b77;
            }
        </style>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
            <br>
            <br>
            <br>
            <br>
            <div class="container well">
            <c:forEach items="${roomsDe}" var="r">
                <div class="row">
                    <div class="col-md-6 gallary">
                        <div class="slider-for">
                            <div>
                                <img class="imgblog imgRoom" src="Photo/${r.roomId}.jpg">
                            </div>
                            <div>
                                <img class="imgblog imgRoom" src="http://d2f29brjr0xbt3.cloudfront.net/498_vintageroundup/oldcameras-14.jpg">
                            </div>
                            <div>
                                <img class="imgblog imgRoom" src="http://camaracoleccion.es/imagenes/Nikon_F3_Canon.png">
                            </div>
                            <div>
                                <img class="imgblog imgRoom" src="http://camaracoleccion.es/imagenes/Nikon_F3_Canon.png">
                            </div>
                            <div>
                                <img class="imgblog imgRoom" src="http://camaracoleccion.es/imagenes/Nikon_F3_Canon.png">
                            </div>
                        </div>
                        <br>
                        <div class="slider-nav">
                            <div>
                                <img data-tab="tab-1" class="imgblog navImg current" src="Photo/${r.roomId}.jpg">
                            </div>
                            <div>
                                <img data-tab="tab-2" class="imgblog navImg" src="http://d2f29brjr0xbt3.cloudfront.net/498_vintageroundup/oldcameras-14.jpg">
                            </div>
                            <div>
                                <img data-tab="tab-3" class="imgblog navImg" src="http://camaracoleccion.es/imagenes/Nikon_F3_Canon.png">
                            </div>
                            <div>
                                <img data-tab="tab-4" class="imgblog navImg" src="http://camaracoleccion.es/imagenes/Nikon_F3_Canon.png">
                            </div>
                            <div>
                                <img data-tab="tab-5" class="imgblog navImg" src="http://camaracoleccion.es/imagenes/Nikon_F3_Canon.png">
                            </div>
                        </div>
<!--                            <img id="imgRoom" class="imgblog" src="Photo/${r.roomId}.jpg">-->
                    </div>
                    <div class="col-md-6">
                        <form action="Reservation" method="POST">
                            <div class="row">
                                <div class="col-md-12">
                                    <h1>Rooms ID :: ${r.roomId}</h1>
                                    <input type="hidden" name="roomid" value="${r.roomId}">
                                </div>
                            </div>
                                <div class="row">
                                <div class="col-md-12">
                                    <p>Rooms Name : ${r.roomName}</p>
                                    <input type="hidden" name="roomName" value="${r.roomName}">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                    <p>Type Room : ${r.roomTypeName}</p>
                                    <input type="hidden" name="roomType" value="${r.type}">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                    <p>Capacity : ${r.capacity}</p>
                                    <input type="hidden" name="roomCapacity" value="${r.capacity}">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                    <p>Price : ${r.price}</p>
                                    <input type="hidden" name="roomPrice" value="${r.price}">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                    <p>Check in : ${stringDateStart}</p>
                                    <input type="hidden" name="dateStart" value="${stringDateStart}">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                    <p>Check out : ${stringDateEnd}</p>
                                    <input type="hidden" name="days" value="${days}">
                                    <input type="hidden" name="dateEnd" value="${stringDateEnd}">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                    <p class="description">
                                        Description : ${r.roomDes}
                                    </p>
                                    <input type="hidden" name="roomid" value="${r.roomDes}">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                    <a id="flip" href="#">Service<i class="fa fa-chevron-down" aria-hidden="true"></i></a>
                                    <div id="panel" style="display:none;">
                                        <div class="checkbox">
                                            <label><input name="check1" type="checkbox" value="1">I'd like a non-smoking room</label>
                                        </div>
                                        <div class="checkbox">
                                            <label><input name="check2" type="checkbox" value="1">I'd like a late check-in</label>
                                        </div>
                                        <div class="checkbox">
                                            <label><input name="check3" type="checkbox" value="1">I'd like a large bed</label>
                                        </div>
                                        <div class="checkbox">
                                            <label><input name="check4" type="checkbox" value="1">I'd like twin beds</label>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-offset-6 col-md-5">
                                    <button  class="btn btn-success pull-right book">
                                        Book
                                    </button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </c:forEach>
        </div>
    </body>
    <script type="text/javascript" src="//code.jquery.com/jquery-1.11.0.min.js"></script>
    <script type="text/javascript" src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
    <script type="text/javascript" src="slick-1.6.0/slick/slick.min.js"></script>
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
        $(document).ready(function () {
            $('#flip').click(function () {
                $('#panel').slideToggle("slow");
                $("i", this).toggleClass("fa fa-chevron-up fa fa-chevron-down");
            });
            $('.slider-for').slick({
                slidesToShow: 1,
                slidesToScroll: 1,
                fade: true,
                arrows: false,
                asNavFor: '.slider-nav'
            });
            $('.slider-nav').slick({
                slidesToShow: 3,
                slidesToScroll: 1,
                asNavFor: '.slider-for',
                arrows: false,
                focusOnSelect: true,
                centerMode: true
            });
            $('.navImg').click(function () {
                var tab_id = $(this).attr('data-tab');

                $('.navImg').removeClass('current');

                $(this).addClass('current');
                $("#" + tab_id).addClass('current');
            });
        });
    </script>
</html>
