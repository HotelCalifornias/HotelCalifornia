<%-- 
    Document   : Login
    Created on : Nov 12, 2016, 10:09:07 PM
    Author     : PT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <!-- Bootstrap -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <style>
            body{
                display: flex;
                align-items: center;
                justify-content: center;
                background-color: #263238;
            }
            .loginform{
                background-color: #fff;
                padding: 30px;
                padding-bottom: 20px;
                width: 30%;
            }
            h1{
                color: #fff;
                text-align: center;
                font-size: 50px;
                font-weight: 100;
            }
        </style>
    </head>
    <body>
    <center>
        <div class="container">
            <br><br><br><br><br><br><br>
            <h1>Login now</h1>
            <div class="loginform">
                <form class="form" role="form" action="LoginServlet" method="post">
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Username" name="username" required/>
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" placeholder="Password" name="password" required/>
                    </div>
                    <div class="form__group">
                        <button type="submit" class="btn btn-primary btn-block">LOGIN</button>
                    </div>                  
                </form>
                <br>
                <a id="hovernav" href="#" data-toggle="modal" data-target="#myModal">Sign Up</a>
            </div>
        </div>
    </center>
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
</body>
<script type="text/javascript" src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script>
    $(document).ready(function () {
        $('.field .inputbox').keyup(function () {
            var empty = false;
            $('.field .inputbox').each(function () {
                if ($(this).val().length == 0) {
                    empty = true;
                }
            });
            if (empty) {
                $('.actions button').attr('disabled', 'disabled');
            } else if ($(this).val().length > 5) {
                $('.actions button').attr('disabled', false);
            }
        });
    });
</script>
</html>
