<%-- 
    Document   : index
    Created on : Oct 9, 2016, 10:24:29 PM
    Author     : PT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HomePage</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <style>
            #login-dp{
                min-width: 44vh;
                padding: 15px 15px 0;              
            }
            #login-dp .form-group{
                margin-bottom: 20px;      
            }
            body{
                font-size: 1.6em;
            }
        </style>
    </head>
    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container-fluid  text-center">
                <div class="navbar-header">
                    <a href="#" class="navbar-brand">Brand</a>
                </div>
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
                                       <form action="LoginServlet" class="form" role="form" method="get">
                                            <div class="form-group" id="group">
                                                <label for="usr">Username : </label>
                                                <input type="text" class="form-control" name="username" placeholder="Username"/>                                       
                                            </div>
                                            <div class="form-group" id="group">
                                                <label for="pwd">Password : </label>
                                                <input type="password" class="form-control" name="password" placeholder="Password"/>
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
        </nav>
        <!-- Modal -->
        <div class="modal fade" id="myModal" role="dialog">
            <div class="modal-dialog">
                <!-- Content -->
                <div class="modal-content">
                    <form>
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h3 class="modal-title text-center">Sign Up</h3>
                    </div>
                    <div class="modal-body">        
                            <div class="form-group">
                                <label>Name :</label>
                                <input type="text" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>Surname :</label>
                                <input type="text" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>E-mail :</label>
                                <input type="text" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>Username :</label>
                                <input type="text" class="form-control">
                            </div>
                    </div>
                    <div class="modal-footer">
                        <div class="form-group">
                            <button type="Submit" class="btn btn-default">Submit</button>
                        </div>
                    </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
