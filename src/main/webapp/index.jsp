 <%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Student Result</title>
</head>
<body>

<h2>Enter Student Details</h2>

<form action="processResult" method="post">
Roll No: <input type="text" name="rollno" required><br><br>
Name: <input type="text" name="name" required><br><br>

Sub1: <input type="number" name="sub1" required><br>
Sub2: <input type="number" name="sub2" required><br>
Sub3: <input type="number" name="sub3" required><br>
Sub4: <input type="number" name="sub4" required><br>
Sub5: <input type="number" name="sub5" required><br><br>

<input type="submit" value="Calculate Result">
</form>

</body>
</html>