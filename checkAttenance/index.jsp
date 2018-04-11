<%@page contentType="text/html;charset=UTF-8"%>
<%@page import="java.io.*,java.util.*"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
	<form action="index.jsp">
		学号<input type="text" name="number">
		姓名<input type="text" name="name">
		
		<input type="submit" value="签到">
	</form>
	所有用户
	<%
		String name=request.getParameter("name");
		String number=request.getParameter("number");
		if(name!=null){
			try{
			name=new String(name.getBytes("ISO-8859-1"),"UTF-8");}
			catch(Exception e){
			}			
			if(name!=null&&number!=null){
				PrintWriter cout=new PrintWriter(new FileWriter(new Date().toLocaleString()).substring(0,8)+".txt",true));
				cout.println(number + " "+ name+ new Date().toLocaleString());
				cout.close();
			}
		}
	%>
	姓名<%=name%> 学号=<%=number%>
</body>
</html>
