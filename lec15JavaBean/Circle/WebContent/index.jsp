<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="circle" scope="session" class="zj.Circle">
	
</jsp:useBean>

	工具bean<%=zj.Tool.add(3,4) %> 
	<form action="index.jsp">
	<input type="text" name="radius">
	<input type="submit" value="Calc"/>
	
	</form>
	
	<%
	String sr=request.getParameter("radius");
	if(sr!=null)
	circle.setRadius(Integer.parseInt(sr)); %>
	<%=circle.getCirclePerimeter()%>
</body>
</html>