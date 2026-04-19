 <%--
12(c). Develop a JDBC project using MySQL to insert Emp_No, Emp_Name and BasicSalary 
into Emp table of Employee database using JSP (keyboard input) and generate 
a salary report for employees whose names start with 'R'.
--%>
 <html>
<body>
<h2>Employee Salary Report</h2>

<form action="report.jsp" method="post">
    Enter Starting Letter:
    <input type="text" name="letter" maxlength="1" required>
    <input type="submit" value="Generate Report">
</form>

</body>
</html>