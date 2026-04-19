 <%@ page import="java.sql.*" %>

<%
String ch = request.getParameter("letter");

Connection con = null;
PreparedStatement ps = null;
ResultSet rs = null;

int total = 0;

try {
    Class.forName("com.mysql.cj.jdbc.Driver");

    con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/Employee", "root", "rakshi");

    String sql = "SELECT * FROM Emp WHERE Emp_Name LIKE ?";
    ps = con.prepareStatement(sql);
    ps.setString(1, ch + "%");

    rs = ps.executeQuery();
%>

<h3>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</h3>
<h2>Salary Report</h2>
<h3>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</h3>

<%
    while(rs.next()) {
        int empno = rs.getInt("Emp_No");
        String name = rs.getString("Emp_Name");
        int sal = rs.getInt("Basicsalary");

        total += sal;
%>

<pre>
Emp_No      : <%= empno %>
Emp_Name    : <%= name %>
Basic       : <%= sal %>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
</pre>

<%
    }
%>

<h3>Grand Salary : <%= total %></h3>
<h3>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</h3>

<%
} catch(Exception e) {
    out.println("Error: " + e);
} finally {
    if(rs != null) rs.close();
    if(ps != null) ps.close();
    if(con != null) con.close();
}
%>