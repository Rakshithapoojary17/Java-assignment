 <%@ page import="java.sql.*" %>
<%
try {
    String ch = request.getParameter("ch");

    String url = "jdbc:mysql://localhost:3306/Employee";
    String user = "root";
    String pass = "rakshi";   // no password

    Connection con = DriverManager.getConnection(url, user, pass);

    out.println("Successfully connected to MySQL database Employee<br>");

    // DELETE records starting with given letter
    String deleteQuery = "DELETE FROM Emp WHERE Emp_Name LIKE ?";
    PreparedStatement ps = con.prepareStatement(deleteQuery);
    ps.setString(1, ch + "%");
    ps.executeUpdate();
    ps.close();

    // DISPLAY remaining records
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM Emp");

    out.println("<br>Salary Report");
    out.println("<br>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    while (rs.next()) {
        out.println("<br>Emp_No     : " + rs.getInt("Emp_NO"));
        out.println("<br>Emp_Name   : " + rs.getString("Emp_Name"));
        out.println("<br>Basic      : " + rs.getInt("Basicsalary"));
        out.println("<br>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    rs.close();
    st.close();
    con.close();

} catch(Exception e) {
    out.println("Error: " + e.getMessage());
}
%>