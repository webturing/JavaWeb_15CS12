<%@page language="java" contentType="text/html;charset=UTF-8"%>
<%@page import="java.util.*,java.io.*"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>第六周</title>
</head>
<body>
<h1>欢迎<%=request.getParameter("username")%></h1>
	<p>1+1=<%=1+1%></p>
	<p>现在时刻：<%=new Date().toLocaleString()%></p>
	<p></p>
	<p></p>
	<p></p>
</body>
</html>