<%@ page import="java.sql.*" %>
<%
try {
    

    Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/Employee", "root", "rakshi");

    Statement st = con.createStatement();

    st.executeUpdate("INSERT INTO Emp VALUES (101,'Ramesh',25000)");
    st.executeUpdate("INSERT INTO Emp VALUES (102,'Ravi',20000)");
    st.executeUpdate("INSERT INTO Emp VALUES (103,'Suresh',30000)");
    st.executeUpdate("INSERT INTO Emp VALUES (104,'Divya',28000)");
    st.executeUpdate("INSERT INTO Emp VALUES (105,'Anitha',22000)");

    out.println("5 Records Inserted Successfully<br>");
    out.println("<a href='Employee.jsp'>View Salary Report</a>");

    con.close();

} catch(Exception e) {
    out.println(e);
}
%>
 