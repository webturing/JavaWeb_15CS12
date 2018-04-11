<%@page import="java.util.*"%>


<%
Vector<String> vector=new Vector<String>();
vector.add("hello");
vector.add("world");
vector.add("hello");
vector.add("world");
vector.add("hello");
vector.add("world");

request.setAttribute("name","cat1231");
request.setAttribute("wordlist",vector);
%>



<%=request.getAttribute("name")%>


<%
//遍历Vector
Vector<String> vector2=(Vector<String>)request.getAttribute("wordlist");

for(String s:vector2)
	out.println(s+"<br>");
%>