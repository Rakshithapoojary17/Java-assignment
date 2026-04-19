 <%@ page language="java" contentType="text/html" %>
<!DOCTYPE html>
<html>
<head>
    <title>Session Check</title>
</head>
<body>

<h2>Display the session value on this page</h2>

<%
String name = (String)session.getAttribute("user");

if(name == null)
{
%>
    <h3>Sorry the session has ended</h3>
<%
}
else
{
%>
    <h3>Hello <%= name %></h3>
<%
}
%>

</body>
</html>