<%-- 
    Document   : index
    Created on : Nov 14, 2016, 8:35:36 PM
    Author     : PT
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DB</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.2.3/css/bulma.min.css" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <style>
            #panel {
                display: none;
            }

            ul.tabs li{
                cursor: pointer;
            }

            ul.tabs li.current a{
                border: 1px solid #00d1b2;
                border-top-left-radius:5px;
                border-top-right-radius: 5px;
                color: #00d1b2;
            }
            .tab-content{
                display: none;
            }
            .tab-content.current{
                display: inherit;
            }
        </style>
    </head>
    <body>
        <section class="hero is-medium is-primary is-bold">
            <div class="hero-body">
                <div class="container">
                    <h1 class="title">
                        Information Management
                    </h1>
                    <h2 class="subtitle">
                        Project DB
                    </h2>
                </div>
            </div>
        </section>
        <section class="section">
            <br><br>
            <div class="container">
                <div class="columns">
                    <div class="column is-one-third">   
                    </div>
                    <c:choose>
                        <c:when test="${sessionScope.login2 == null}">
                            <div class="column">
                                <h1 class="title is-1">Login</h1>
                                <form action="LoginAdminServlet" method="get">
                                    <p class="control">
                                        <input class="input" name="username" type="text" placeholder="Username" required>
                                    </p>
                                    <p class="control">
                                        <input class="input" name="password" type="Password" placeholder="Password" required>
                                    </p>
                                    <p class="control is-pulled-right">
                                        <input type="submit" class="button is-primary is-outlined is-pulled-right" value="Login"> 
                                    </p>
                                </form>
<!--                                <button id="flip" type="button" class="button is-danger is-outlined is-pulled-right" style="margin-right:5px;" 
                                        data-toggle="modal" data-target="#myModal">
                                    Register
                                </button>
                                <br><br>
                                <div id="panel">
                                    <h2 class="title is-2">Register now</h2>
                                    <form action="RegisterServlet" method="get">
                                        <p class="control">
                                            <input class="input" name="fname" type="text" placeholder="First name">
                                        </p>
                                        <p class="control">
                                            <input class="input" name="lname" type="text" placeholder="Last name">
                                        </p>
                                        <p class="control">
                                            <input class="input" name="username" type="text" placeholder="Username">
                                        </p>
                                        <p class="control">
                                            <input class="input" name="password" type="Password" placeholder="Passwword">
                                        </p>
                                        <p class="control">
                                            <input class="input" name="email" type="email" placeholder="Email">
                                        </p>
                                        <p class="control is-pulled-right">
                                            <button type="submit" class="button is-info is-outlined">
                                                Submit
                                            </button> 
                                        </p>
                                    </form>
                                </div>-->
                            </div>
                        </c:when>
                        <c:otherwise>
                            <div class="column">
                                <h1 class="title is-1">WELCOME</h1>
                                <h3 class="title is-3">${sessionScope.username}</h3>
                                <center>
                                    <form action="LogoutAdminServlet" method="get">
                                        <p class="control">
                                            <button type="submit" class="button is-info is-outlined">
                                                Logout
                                            </button> 
                                        </p>
                                    </form>
                                </center>
                            </div>
                        </c:otherwise>
                    </c:choose>
                    <div class="column">   
                    </div>
                </div>              
            </div>
            <br><br>
        </section>
        <c:choose>
            <c:when test="${sessionScope.login2 != null}">
                <section class="section">
                    <div class="container">
                        <h1 class="title has-text-centered">Title</h1>
                        <h2 class="subtitle has-text-centered">Subtitle</h2>

                        <div class="tabs is-centered">
                            <ul class="tabs">
                                <li class="tab-link current" data-tab="tab-1"><a href="#tab1">Room Detail</a></li>
                                <li class="tab-link " data-tab="tab-2"><a href="#tab2">Emtry Room</a></li>
                                <li class="tab-link " data-tab="tab-3"><a href="#tab3">All account</a></li>
                                <li class="tab-link " data-tab="tab-4"><a href="#tab4">Reservation Room</a></li>
                            </ul>
                        </div>
                        <div id="tab-1" class="tab-content current">
                            <table class="table" >
                                <thead>
                                    <tr>
                                        <th>Room</th>
                                        <th>Description</th>
                                        <th>Capacity</th>
                                        <th>Price</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${rooms}" var="r">
                                        <tr>
                                            <td>${r.roomName}</td>
                                            <td>${r.roomDes}</td>
                                            <td>${r.capacity}</td>
                                            <td>${r.price}</td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                                <tfoot>
                                    <tr>
                                        <th>Database</th>
                                        <th></th>
                                        <th></th>
                                        <th>Instrument</th>
                                    </tr>
                                </tfoot>
                            </table>
                        </div>
                        <div id="tab-2" class="tab-content">
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th>Room</th>
                                        <th>Capacity</th>
                                        <th>Description</th>
                                        <th>Price</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${roomH}" var="rh">
                                        <tr>
                                            <td>${rh.roomName}</td>
                                            <td>${rh.capacity}</td>
                                            <td>${rh.roomDes}</td>
                                            <td>${rh.price}</td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                                <tfoot>
                                    <tr>
                                        <th>Database</th>
                                        <th></th>
                                        <th></th>
                                        <th>Instrument</th>
                                    </tr>
                                </tfoot>
                            </table>
                        </div>
                        <div id="tab-3" class="tab-content">
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th>Account ID</th>
                                        <th>Firstname</th>
                                        <th>Lastname</th>
                                        <th>Email</th>
                                        <th>Address</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${account}" var="ac">
                                        <tr>
                                            <td>${ac.accountId}</td>
                                            <td>${ac.fname}</td>
                                            <td>${ac.lname}</td>
                                            <td>${ac.email}</td>
                                            <td>${ac.address}</td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                                <tfoot>
                                    <tr>
                                        <th>Database</th>
                                        <th></th>
                                        <th></th>
                                        <th>Detail</th>
                                        <th></th>
                                    </tr>
                                </tfoot>
                            </table>
                        </div>
                        <div id="tab-4" class="tab-content">
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th>Room</th>
                                        <th>Capacity</th>
                                        <th>Description</th>
                                        <th>Price</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${reserRoom}" var="rr">
                                        <tr>
                                            <td>${rr.roomId}</td>
                                            <td>${rr.capacity}</td>
                                            <td>${rr.roomDes}</td>
                                            <td>${rr.price}</td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                                <tfoot>
                                    <tr>
                                        <th>Database</th>
                                        <th></th>
                                        <th></th>
                                        <th>Instrument</th>
                                    </tr>
                                </tfoot>
                            </table>
                        </div>
                        <nav class="level">
                            <div class="level-item">
                            </div>
                            <div class="level-item has-text-centered">
                                <p class="heading">Total Reservation</p>
                                <p class="title">
                                    ${fn:length(counts)}
                                </p>
                            </div>
                            <div class="level-item has-text-centered">
                                <p class="heading">Total Account</p>
                                <p class="title">${fn:length(totals)}</p>
                            </div>
                            <div class="level-item">
                            </div>
                        </nav>
                </section>
            </c:when>
        </c:choose>
    </body>
    <script>
        $(document).ready(function () {
            $("#flip").click(function () {
                $("#panel").slideToggle("slow");
            });
            $('ul.tabs li').click(function () {
                var tab_id = $(this).attr('data-tab');

                $('ul.tabs li').removeClass('current');
                $('.tab-content').removeClass('current');

                $(this).addClass('current');
                $("#" + tab_id).addClass('current');
            });
        });
        $(function () {
            $(".").click(function () {
                $(this).addClass("is-active");
            });
        });

    </script>
</html>