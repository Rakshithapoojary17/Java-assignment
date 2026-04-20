 <%@ page import="javax.servlet.http.Cookie" %>
<html>
<body>

<%
    String name = request.getParameter("cname");
    String domain = request.getParameter("cdomain");
    int age = Integer.parseInt(request.getParameter("cage"));

    // Create cookie
    Cookie cookie = new Cookie(name, "Active");

    cookie.setDomain(domain);   // set domain
    cookie.setMaxAge(age);      // expiry time

    response.addCookie(cookie);
%>

<h2>Cookie Added Successfully!</h2>

<p><b>Name:</b> <%= name %></p>
<p><b>Domain:</b> <%= domain %></p>
<p><b>Max Age:</b> <%= age %> seconds</p>

<br>
<a href="listCookies.jsp">Go to Active Cookie List</a>

</body>
</html>