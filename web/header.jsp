<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                                                    <h3>${message}</h3>
                                                    <h3>${Success}</h3>
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

                    </div>
                </div>
            </div>
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