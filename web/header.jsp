<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<nav id="custom-nav" class="navbar navbar-fixed-top text-center">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a id="hovernav" href="/Hotel" class="navbar-brand page-scroll hvr-underline-from-left">Brand</a>
        </div>
        <c:choose>
            <c:when test="${sessionScope.login == null}">
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a class="hvr-underline-from-left" id="hovernav" href="#" data-toggle="modal" data-target="#myModal">
                                <span class="glyphicon glyphicon-user"></span>  Sign Up
                            </a>
                        </li>
                        <li class="dropdown">
                            <a class="hvr-underline-from-left" id="hovernav" class="dropdown-toggle" data-toggle="dropdown" href="#">
                                <span class="glyphicon glyphicon-log-in"></span>  Login
                            </a>
                            <ul class="dropdown-menu animated zoomIn" id="login-dp">
                                <li class="dropdown-header text-center" style="font-size: 1.8em">Login</li>
                                <li>                               
                                    <div class="row">
                                        <div class="col-xs-12">
                                            <form class="form" role="form" action="LoginServlet" method="post">
                                                <div class="form-group" id="group">
                                                    <label for="usr">Username : </label>
                                                    <input type="text" class="form-control" placeholder="Username" name="username" required/>                                       
                                                </div>
                                                <div class="form-group" id="group">
                                                    <label for="pwd">Password : </label>
                                                    <input type="password" class="form-control" placeholder="Password" name="password" required/>
                                                </div>
                                                <div class="form-group" id="group">
                                                    <button type="submit" class="btn btn-primary btn-block">Login</button>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </li>
                            </ul>
                        </li>                  
                    </ul>
                </div>
            </c:when>
            <c:otherwise>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a class="hvr-underline-from-left" id="hovernav" href="#" data-toggle="modal" data-target="#ProfileModal">
                                <span class="glyphicon glyphicon-user"></span>  Profile
                            </a>
                        </li>
                        <li>
                            <a class="hvr-underline-from-left" id="hovernav" href="LogoutServlet">  
                                <form action='LogoutServlet' method="post">                       
                                    <span class="glyphicon glyphicon-log-out"></span>  Logout                          
                                </form>
                            </a>
                        </li>
                    </ul>
                </div>
            </c:otherwise>
        </c:choose>
    </div>
</nav>


<!-- Modal Profile -->
<div class="modal fade" id="ProfileModal" role="dialog">
    <div class="modal-dialog">
        <!-- content -->
        <div class="modal-content">
            <div class="modal-header" style="background-color: #179b77">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h3 class="modal-title text-center" style="color: #fff">Profile</h3>
            </div>
            <div class="modal-body">
                <h3>${login}</h3><br>
            </div>
            <div class="modal-footer">

            </div>
        </div>
    </div>
</div>
<!-- Modal SignUp -->
<div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
        <!-- Content -->
        <div class="modal-content">
            <form action="RegisterServlet" method="get">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h3 class="modal-title text-center">Sign Up</h3>
                </div>
                <div class="modal-body">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group field">
                                <label>Username :</label>
                                <input type="text" class="form-control inputbox" name="username" id="username" required>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group field">
                                <label>Password :</label>
                                <input type="password" class="form-control inputbox" name="password" id="password" required>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group field">
                                <label>First Name :</label>
                                <input type="text" class="form-control inputbox" name="fname" id="fname" required>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group field">
                                <label>Last Name :</label>
                                <input type="text" class="form-control inputbox" name="lname" id="lname" required>
                            </div>
                        </div>
                    </div>
                    <div class="form-group field">
                        <label>E-mail :</label>
                        <input type="email" class="form-control inputbox" name="email" id="email" required>
                    </div>
                    <div class="form-group field">
                        <label>Address :</label>
                        <textarea class="form-control inputbox" rows="5" name="address" id="address" required></textarea>
                    </div>
                    <!--                    <div class="form-group">
                                            <label>City :</label>
                                            <input type="text" class="form-control" name="city">
                                        </div>
                                        <div class="form-group">
                                            <label>Country :</label>
                                            <input type="text" class="form-control" name="country">
                                        </div>-->
                </div>
                <div class="modal-footer">
                    <div class="form-group actions">
                        <button type="Submit" class="btn btn-default" id="valid" disabled="disabled">Submit</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
<br>