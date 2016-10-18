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
                max-height: 80vh;
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
            .slick-dots {
                bottom: 0px;
                margin-left: 10;
            }
        </style>
    </head>
    <body>
<<<<<<< HEAD
        <div class="container-fluid">
            <nav class="navbar navbar-inverse navbar-fixed-top">
                <div class="container-fluid  text-center">
                    <div class="navbar-header">
                        <a href="#" class="navbar-brand">Brand</a>
                    </div>
                    <c:choose>
                        <c:when test="${sessionScope.login == null}">    
                            <ul class="nav navbar-nav navbar-right">
                                <li>
                                    <a href="#" data-toggle="modal" data-target="#myModal">
                                        <span class="glyphicon glyphicon-user"></span>  Sign Up
                                    </a>
                                </li>
                                <li class="dropdown">
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                                        <span class="glyphicon glyphicon-log-in"></span>  Login
                                    </a>
                                    <ul class="dropdown-menu" id="login-dp">
                                        <li class="dropdown-header text-center" style="font-size:2em;">Login</li>
                                        <li>                               
                                            <div class="row">
                                                <div class="col-xs-12">
                                                    <form class="form" role="form" action="LoginServlet" method="post">
                                                        <div class="form-group" id="group">
                                                            <label for="usr">Username : </label>
                                                            <input type="text" class="form-control" placeholder="Username" name="username"/>                                       
                                                        </div>
                                                        <div class="form-group" id="group">
                                                            <label for="pwd">Password : </label>
                                                            <input type="password" class="form-control" placeholder="Password" name="password"/>
                                                        </div>
                                                        <div class="form-group" id="group">
                                                            <button type="submit" class="btn btn-primary btn-block">Login</button>
                                                        </div>
                                                    </form>
                                                    <h3><%=request.getAttribute("message")%></h3>
                                                    <h3><%=request.getAttribute("Success")%></h3>
                                                </div>
                                            </div>
                                        </li>
                                    </ul>
                                </li>                  
                            </ul>
                        </c:when>
                        <c:otherwise>               
                            <ul class="nav navbar-nav navbar-right">
                                <li>
                                    <a href="#" data-toggle="modal" data-target="#ProfileModal">
                                        <span class="glyphicon glyphicon-user"></span>  Profile
                                    </a>
                                </li>
                                <li>
                                    <a href="LogoutServlet">  
                                        <form action='LogoutServlet' method="post">                       
                                            <span class="glyphicon glyphicon-log-out"></span>  Logout                          
                                        </form>
                                    </a>
                                </li>
                            </ul>
                        </c:otherwise>
                    </c:choose>
                </div>
            </nav>
        
            
        <!-- Modal Profile -->
        <div class="modal fade" id="ProfileModal" role="dialog">
            <div class="modal-dialog">
                <!-- content -->
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h3 class="modal-title text-center">Profile</h3>
                    </div>
                    <div class="modal-body">
                        <h3>${sessionScope.login}</h3><br>
                    </div>
                    <div class="modal-footer">
=======
        <jsp:include page="header.jsp"></jsp:include>
>>>>>>> d5bb4e82cdbf71e210c36b1e7186610daa353961

            <div class="row fullwidth ">
                <div class="slider ">
                    <div class="text-center slide"><img src="http://cdn.wallpapersafari.com/47/90/jB4KV1.jpg"/></div>
                    <div class="text-center slide"><img src="http://cdn.wallpapersafari.com/54/26/Z6ioh9.jpg"/></div>
                    <div class="text-center slide"><img src="http://cdn.wallpapersafari.com/55/67/puqkWI.jpg"/></div>
                    <div class="text-center slide"><img src="http://cdn.wallpapersafari.com/55/67/puqkWI.jpg"/></div>
                </div>
            </div>
<<<<<<< HEAD
        </div>
        <!-- Modal SignUp -->
        <div class="modal fade" id="myModal" role="dialog">
            <div class="modal-dialog">
                <!-- Content -->
                <div class="modal-content">
                    <form action="RegisterServlet" method="post">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h3 class="modal-title text-center">Sign Up</h3>
                        </div>
                        <div class="modal-body">        
                            <div class="form-group">
                                <label>ID :</label>
                                <input type="text" class="form-control" name="id">
                            </div>
                            
                            <div class="form-group">
                                <label>Username :</label>
                                <input type="text" class="form-control" name="username">
                            </div>
                            <div class="form-group">
                                <label>Password :</label>
                                <input type="text" class="form-control" name="password">
                            </div>
                            
                        </div>
                        <div class="modal-footer">
                            <div class="form-group">
                                <button type="Submit" class="btn btn-default">Submit</button>
                            </div>
                        </div>
                    </form>
                    <h3><%=request.getAttribute("message")%></h3>
                </div>
            </div>
        </div>
                </div>
                <br><br>
                <div class="container-fluid">
                    <h1>${sessionScope.login}</h1>
                </div>
=======
            <div class="container-fluid">
                <h1>${sessionScope.login}</h1>
            </div>

        <script type="text/javascript" src="//code.jquery.com/jquery-1.11.0.min.js"></script>
        <script type="text/javascript" src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
        <script type="text/javascript" src="slick-1.6.0/slick/slick.min.js"></script>
        <script>
            $(document).ready(function () {
                $('.slider').slick({
                    dots: true,
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
                                dots: true,
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
            });
        </script>
>>>>>>> d5bb4e82cdbf71e210c36b1e7186610daa353961
    </body>
</html>
