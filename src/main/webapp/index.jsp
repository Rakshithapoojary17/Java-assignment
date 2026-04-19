 <%-- 
11 c. Develop a JDBC project using JSP to append the fields empno, empname and basicsalary into the table Emp of the database Employee by getting the fields through keyboard using index.jsp and generate the report using Employee.jsp.
--%>

  <html>
<body>

<h2>Employee Entry Form</h2>

<form action="insert.jsp" method="post">

Emp No: <input type="text" name="empno"><br><br>
Emp Name: <input type="text" name="empname"><br><br>
Salary: <input type="text" name="salary"><br><br>

<input type="submit" value="Insert">

</form>

</body>
</html>