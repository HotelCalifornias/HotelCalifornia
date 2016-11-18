<%-- 
    Document   : Mail.jsp
    Created on : Nov 16, 2016, 11:11:35 PM
    Author     : PT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Send Mail</title>
    </head>
    <body>
        <h1>Test Send Mail</h1>
        <form method="get" action="MailServlet">
            <label>To :</label><br>
            <input type="email" name="sendTo">
            <br>
            <label>Subject :</label><br>
            <input type="text" name="subject">
            <br>
            <label>Message :</label><br>
            <textarea name="message" cols="75" rows="6"></textarea><br>
            <input type="submit" value="Send">
        </form>
    </body>
</html>
