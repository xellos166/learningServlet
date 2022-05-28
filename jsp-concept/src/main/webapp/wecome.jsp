<%@ page info="Welcome page" %>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="WEB-INF/mytags.tld" prefix="b" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user" class="com.aredent.demo.jsp.bean.User"/>
<jsp:setProperty property="*" name="user"/>  
<%
String userName=user.getUserName();
Date d=new Date();
%>
<h2>Welcome <%= userName %></h2>
<h3>Welcome by Get property jsp Action tag :<jsp:getProperty property="userName" name="user"/>   </h3>
<h4>Welcome by EL , ${param.userName}</h4>
<b:today/>
</body>
</html>