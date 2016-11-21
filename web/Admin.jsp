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
        <!--<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>-->

        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
                        Hotel Management
                    </h1>
                    <h2 class="subtitle">
                        Admin only
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
                                <form action="LoginAdminServlet" method="post">
                                    <p class="control">
                                        <input class="input" name="username" type="text" placeholder="Username" required>
                                    </p>
                                    <p class="control">
                                        <input class="input" name="password" type="Password" placeholder="Password" required>
                                    </p>
                                    <p style="color: red;">
                                        ${message}
                                    </p>
                                    <p class="control is-pulled-right">
                                        <input type="submit" class="button is-primary is-outlined is-pulled-right" value="Login"> 
                                    </p>
                                </form>
                            </div>
                        </c:when>
                        <c:otherwise>
                            <div class="column">
                                <h1 class="title is-1">WELCOME</h1>
                                <h3 class="title is-3">${sessionScope.username}</h3>
                                <center>
                                    <form action="LogoutAdminServlet" method="post">
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

                        <button type="button" class="button is-primary is-outlined is-pulled-right" data-toggle="modal" data-target="#insert">Insert Room</button>
                        <div class="modal fade" id="insert" role="dialog">
                            <div class="modal-dialog">
                                <!-- Modal content-->
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                                        <h4 class="modal-title">Insert</h4>
                                    </div>

                                    <form action="InsertRoom" method="POST">
                                        <div class="modal-body">
                                            <p class="control">
                                                Room Number : <input class="input" type="text" value="" name="iren" placeholder="Text input">
                                            </p>
                                            <p class="control">
                                                Room Type : <br>
                                                <span class="select">
                                                    <select name="iret">
                                                        <option value="1">Normal</option>
                                                        <option value="2">Delux</option>
                                                    </select>
                                                </span>
                                                <!--<input class="input" type="text" value="" name="iret" placeholder="Text input">-->
                                            </p>
                                            <p class="control">
                                                Description : <input class="input" type="text" value="" name="ired" placeholder="Text input">
                                            </p>
                                            <p class="control">
                                                Capacity : <input class="input" type="text" value="" name="irec" placeholder="Text input">
                                            </p>
                                            <p class="control">
                                                Price : <input class="input" type="text" value="" name="irep" placeholder="Text input">
                                            </p>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="submit" class="btn btn-success">Save</button>
                                            <button type="button" class="button is-link" data-dismiss="modal">Close</button>
                                        </div>
                                    </form>

                                </div>

                            </div>
                        </div>

                        <div class="tabs is-centered">
                            <ul class="tabs">
                                <li class="tab-link current" data-tab="tab-1"><a href="LoginAdminServlet#tab1">Room Detail</a></li>
                                <li class="tab-link " data-tab="tab-2"><a href="LoginAdminServlet#tab2">Emtry Room</a></li>
                                <li class="tab-link " data-tab="tab-3"><a href="LoginAdminServlet#tab3">All account</a></li>
                                <li class="tab-link " data-tab="tab-4"><a href="LoginAdminServlet#tab4">Reservation Room</a></li>
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
                                        <th>Delete</th>
                                        <th>Edit</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${rooms}" var="r" varStatus="rs">
                                        <tr>
                                            <td>${r.roomName}</td>
                                            <td>${r.roomDes}</td>
                                            <td>${r.capacity}</td>
                                            <td>${r.price}</td>
                                            <td>
                                                <form action="DeleteRoom" method="POST">
                                                    <input type="hidden" name="rid" value="${r.roomId}"/>
                                                    <button type="submit" class="button is-danger is-outlined">
                                                        Delete
                                                    </button>

                                                </form>
                                            </td>
                                            <td>
                                                <!--                                                <a class="button is-primary is-large modal-button" data-target="#modal-ter">Edit</a>-->

                                                <button type="button" class="button is-primary is-outlined" data-toggle="modal" data-target="#myModal${r.roomId}">Edit</button>
                                                <div class="modal fade" id="myModal${r.roomId}" role="dialog">
                                                    <div class="modal-dialog">
                                                        <!-- Modal content-->
                                                        <div class="modal-content">
                                                            <div class="modal-header">
                                                                <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                                <h4 class="modal-title">Edit</h4>
                                                            </div>

                                                            <form action="EditRoom" method="POST">
                                                                <div class="modal-body">
                                                                    <p class="control">
                                                                        Room ID : <input class="input" type="text" value="${r.roomId}" name="reid" placeholder="Text input" >
                                                                    </p>
                                                                    <p class="control">
                                                                        Room Number : <input class="input" type="text" value="${r.roomName}" name="ren" placeholder="Text input">
                                                                    </p>
                                                                    <p class="control">
                                                                        Room Type : <input class="input" type="text" value="${r.type}" name="ret" placeholder="Text input">
                                                                    </p>
                                                                    <p class="control">
                                                                        Description : <input class="input" type="text" value="${r.roomDes}" name="red" placeholder="Text input">
                                                                    </p>
                                                                    <p class="control">
                                                                        Capacity : <input class="input" type="text" value="${r.capacity}" name="rec" placeholder="Text input">
                                                                    </p>
                                                                    <p class="control">
                                                                        Price : <input class="input" type="text" value="${r.price}" name="rep" placeholder="Text input">
                                                                    </p>
                                                                </div>
                                                                <div class="modal-footer">
                                                                    <button type="submit" class="btn btn-success">Save</button>
                                                                    <button type="button" class="button is-link" data-dismiss="modal">Close</button>
                                                                </div>
                                                            </form>

                                                        </div>

                                                    </div>
                                                </div> 


                                            </c:forEach>
                                        </td>
                                    </tr>
                                </tbody>
                                <tfoot>
                                    <tr>
                                        <th>Database</th>
                                        <th></th>
                                        <th></th>
                                        <th>Instrument</th>
                                        <th></th>
                                        <th></th>
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
                                        <th>Reservation ID</th>
                                        <th>Room ID</th>
                                        <th>From</th>
                                        <th>To</th>
                                        <th>Total Price</th>
                                        <th>Status</th>
                                        <th></th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${counts}" var="c">
                                        <tr>
                                            <td>${c.reservationId}</td>
                                            <td>${c.roomId}</td>
                                            <td>${c.dateFrom}</td>
                                            <td>${c.dateTo}</td>
                                            <td>${c.totalPrice}</td>
                                            <td>${c.status}</td>
                                            <td><form action="ChangeStatus" method="POST">
                                                    <input type="hidden" name="reid" value="${c.reservationId}"/>
                                                    <button type="submit" class="button is-danger is-outlined">
                                                        Change
                                                    </button>

                                                </form></td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                                <tfoot>
                                    <tr>
                                        <th>Database</th>
                                        <th></th>
                                        <th></th>
                                        <th>Instrument</th>
                                        <th></th>
                                        <th></th>
                                        <th></th>
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

            </div>
        </c:when>
    </c:choose>
</body>
<script>
    $(document).ready(function() {
        $("#flip").click(function() {
            $("#panel").slideToggle("slow");
        });
        $('ul.tabs li').click(function() {
            var tab_id = $(this).attr('data-tab');

            $('ul.tabs li').removeClass('current');
            $('.tab-content').removeClass('current');

            $(this).addClass('current');
            $("#" + tab_id).addClass('current');
        });
    });
    $(function() {
        $(".").click(function() {
            $(this).addClass("is-active");
        });
    });

</script>
</html>