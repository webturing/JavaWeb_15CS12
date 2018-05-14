<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="bbs.model.*,java.util.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>师琴湖畔</title>
</head>
<body>
	<%
		if (session.getAttribute("user") == null) {
	%>

	<form action="login" method="post">
		<br>账号<input type="text" name="user"> <br> <br />密码<input
			type="password" name="password"> <input type="submit"
			value="Login">
	</form>

	<%
		}else
			{
	%>
	当前登陆用户<%=session.getAttribute("user")%>
	<%
		}
	%>
	<form action="postMessage" method="post">
		<br>标题<input type="text" name="title"> <br>内容
		<textarea rows="20" cols=40 name="content">请遵守国家法律，文明上网</textarea>
		<input type="submit" value="发表大作" />
	</form>


	<%
		
		if(session.getAttribute("messages")==null)
			session.setAttribute("messages",new Vector<Message>());
			Vector<Message> messages=(Vector<Message>)session.getAttribute("messages");		
	%>
	<h1>帖子列表</h1>
	<%
		for(Message message :messages)
			out.println(String.format("<p>TITLE:<h2>%s</h2> <p>作者 %s <p>发表时间 %s <p>内容%s",message.getTitle(),message.getAuthor(),message.getTime(),message.getContent()));
	%>
</body>
</html>