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

	<%
	if(application.getAttribute("allUsers")==null)
				{
					application.setAttribute("allUsers",new TreeMap<String,String>());
				}
				TreeMap<String,String> allUsers=(TreeMap<String,String>)application.getAttribute("allUsers");
	%>
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
				session.setAttribute("name",name);
				session.setAttribute("number",number);

				PrintWriter cout=new PrintWriter(new FileWriter("users20180416.txt",true));
				cout.println(number + " "+ name+ new Date().toLocaleString());
				cout.close();
				
				if(!allUsers.containsKey(number)&&number.startsWith("27011501"))
				{
					allUsers.put(number,name);
				}

			}
		}
	%>
	姓名<%=session.getAttribute("name")%> 学号=<%=session.getAttribute("number")%>
	<%
		if(session.getAttribute("name")!=null)
		{
			out.println("<a href='logout.jsp'>注销账号</a>");
		}
	%>

	<div>
	<p>所有在线用户:
	<p>
	<%

		for(String id:allUsers.keySet())
			out.println("<p>"+id+" "+allUsers.get(id));
		out.println("<p> All User Counts="+allUsers.keySet().size());
	%>
	</div>
</body>
</html>