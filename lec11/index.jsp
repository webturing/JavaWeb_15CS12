<%@page language="java" contentType="text/html;charset=UTF-8"%>
<%@page import="java.util.*,java.io.*"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<%String user=(String)session.getAttribute("user");%>
<body>
	<div>
	当前登陆用户<%=user%>
	</div>
	<%
	if(user==null){
	
	out.println("<a href='login.html'>你还没有登陆，请登陆</a>");
	
	}else
	{
	out.println("<a href='logout.jsp'>注销登陆	</a>");
	}
	%>


	<div>
		您的购物车信息如下:
		<%
			if(session.getAttribute("shopcar")!=null)
			{
				HashMap<String,Integer> shopcar=(HashMap<String,Integer>)session.getAttribute("shopcar");

				for(String key:shopcar.keySet())
					out.println("<p>"+key+" "+shopcar.get(key));
			}

		%>



	</div>
</body>
</html>