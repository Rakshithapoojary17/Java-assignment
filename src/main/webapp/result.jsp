 <%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Result</title>
</head>
<body>

<h2>Student Result</h2>

Roll No: <%= request.getAttribute("rollno") %><br>
Name: <%= request.getAttribute("name") %><br><br>

Marks:<br>
Sub1: <%= request.getAttribute("sub1") %><br>
Sub2: <%= request.getAttribute("sub2") %><br>
Sub3: <%= request.getAttribute("sub3") %><br>
Sub4: <%= request.getAttribute("sub4") %><br>
Sub5: <%= request.getAttribute("sub5") %><br><br>

Average: <%= request.getAttribute("avg") %><br>
Result: <%= request.getAttribute("result") %><br><br>

<a href="index.jsp">Back</a>

</body>
</html>