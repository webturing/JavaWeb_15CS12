<%@page import="java.util.*"%>
<%
	TreeMap<String,String> userList=(TreeMap<String,String>)application.getAttribute("allUsers");
	String number=(String)session.getAttribute("number");
	if(userList!=null&&number!=null&&userList.containsKey(number))
	{
		userList.remove(number);
	}
	session.invalidate();

	response.sendRedirect("index.jsp");
%>