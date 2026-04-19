<%--
Exercise 9(c):

Build a Session Management using JSP program for getting session expiry time 
and your name through text box and press submit to display the message by 
greeting "Hello your name!". Press the link to check it within the set session 
time or wait to see the session expiry.
--%>
 <%@ page language="java" contentType="text/html" %>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
</head>
<body>

<%
String name = request.getParameter("uname");
String t = request.getParameter("time");

// handle null
if(name == null || name.equals(""))
    name = "Guest";

// convert minutes to seconds
int time = Integer.parseInt(t) * 60;

// store in session
session.setAttribute("user", name);

// set expiry time
session.setMaxInactiveInterval(time);
%>

<h2>Welcome ! <%= name %></h2>

<p>Session has started ... <%= name %></p>

<p>Your name has been stored in session object</p>

<p>Session expiry time set to <%= t %> minutes</p>

<p>
Kindly press the following link to check it within the set session time 
or wait to see the session expiry
</p>

<a href="second.jsp">Display the value</a>

</body>
</html>