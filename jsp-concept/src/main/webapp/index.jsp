<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Login Page</title>
</head>
<body>
 <%@ include file="header.html" %> 
 <jsp:include page="dateDisplay.jsp"/>
 <fieldset>
    <legend>Login Form</legend>
	<div align="center">
		<div><form action="wecome.jsp" method="post">
		<label>User Name:</label><input type="text" name="userName"/>
		<label>Password:</label><input type="password" name="password"/>
		<input type="submit">
		</form></div>
	</div>
	</fieldset>

</body>
</html>