<%-- 
    Document   : index
    Created on : Oct 9, 2016, 10:24:29 PM
    Author     : PT
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HomePage</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- Bootstrap -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <!-- Slick -->
        <link rel="stylesheet" type="text/css" href="slick-1.6.0/slick/slick.css"/>
        <link rel="stylesheet" type="text/css" href="slick-1.6.0/slick/slick-theme.css"/>

        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" 
              rel="stylesheet" 
              integrity="sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1" 
              crossorigin="anonymous"/>
        <style>
            #login-dp{
                min-width: 44vh;
                padding: 15px 15px 0;              
            }
            #login-dp .form-group{
                margin-bottom: 20px;      
            }
            .fullwidth {
                width: 100%;
                margin-top: -20px;
                margin-left: auto;
                margin-right: auto;
                max-width: initial;
            }
            .slider {
                margin: 0;
            }
            .slider .slide {
                width: 100%; 
                height: 100%;
            }
            .slider .slide img{
                width: 100%;
                max-height: 100vh;
                min-height: 45vh;
            }

            .slick-prev {
                z-index: 1;
                left: 0;
            }
            .slick-next {
                z-index: 1;
                right: 0;
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
            .btn-circle {
                width: 70px;
                height: 70px;
                margin-top: 15px;
                padding: 7px 16px;
                border: 3px solid #fff;
                border-radius: 100%!important;
                font-size: 40px;
                color: #fff;
                background: rgba(255,255,255,0);
            }
            .bot{
                position:absolute;
                width:100px;
                height:100px;
                left:50%;
                top:90%;
                margin-left:-50px;
                margin-top:-50px;
            }
        </style>
    </head>
    <body id="page-top">
        <jsp:include page="header.jsp"></jsp:include>
        <div class="fullwidth ">
            <div class="container-fluid">
                <div class="row">
                    <div class="slider ">
                        <div class="text-center slide"><img src="http://cdn.wallpapersafari.com/47/90/jB4KV1.jpg"/></div>
                        <div class="text-center slide"><img src="http://cdn.wallpapersafari.com/54/26/Z6ioh9.jpg"/></div>
                        <div class="text-center slide"><img src="http://cdn.wallpapersafari.com/55/67/puqkWI.jpg"/></div>
                        <div class="text-center slide"><img src="https://jsis.washington.edu/wordpress/wp-content/uploads/2016/02/world-1138035_1280.jpg"/></div>
                    </div>
                    <div class="col-md-8 col-md-offset-2 bot">    
                        <a href="#bot" class="btn btn-circle page-scroll">
                            <i class="fa fa-angle-double-down animated"></i>
                        </a>
                    </div>
                </div>
            </div>
        </div>
        <br id="bot">
        <br>
        <div class="container text-center">
            <h1>Search</h1>
            <br>
            <br>
            <div class="row">
                <div class="col-md-offset-4 col-md-4 col-md-offset-4 well">
                    <p>A</p>
                    <p>A</p>
                    <p>A</p>
                    <p>A</p>
                    <p>A</p>
                    <p>A</p>
                    <p>A</p>
                    <p>A</p>
                    <p>A</p>
                    <p>A</p>
                    <p>A</p>
                    <p>A</p>
                    <p>A</p>
                    <p>A</p>
                    <p>A</p>
                    <p>A</p>
                    <p>A</p>
                    <p>A</p>
                    <p>A</p>
                    <p>A</p>
                    <p>A</p>
                    <p>A</p>
                    <p>A</p>
                    <p>A</p>
                </div>
            </div>
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
            $('.slider').slick({
                slidesToShow: 1,
                slidesToScroll: 1,
                autoplay: true,
                autoplaySpeed: 3000,
                responsive: [
                    {
                        breakpoint: 992,
                        settings: {
                            slidesToShow: 1,
                            slidesToScroll: 1,
                            infinite: true,
                            arrows: true
                        }
                    },
                    {
                        breakpoint: 768,
                        settings: {
                            arrows: false,
                            slidesToShow: 1,
                            slidesToScroll: 1

                        }
                    },
                    {
                        breakpoint: 480,
                        settings: {
                            arrows: false,
                            slidesToShow: 1,
                            slidesToScroll: 1
                        }
                    }]
            });
            $('a[href^="#"]').on('click', function (e) {
                e.preventDefault();

                var target = this.hash;
                var $target = $(target);

                $('html, body').stop().animate({
                    'scrollTop': $target.offset().top
                }, 2000, 'swing', function () {
                    window.location.hash = target;
                });
            });
        });

    </script>
</html>
