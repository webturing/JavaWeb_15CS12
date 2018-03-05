<%@ page contentType="text/html;charset=gb2312"%>
<%
String sa=request.getParameter("A");
String sb=request.getParameter("B");
Integer ia=Integer.parseInt(sa);
Integer ib=Integer.parseInt(sb);
Integer ic=ia+ib;
%> 
<html>
<head><title>A+B</title></head>
  	<body>
  		<%=ia%>+
  		<%=ib%>=
  		<%out.println(ic);%>
</body>
</html>
