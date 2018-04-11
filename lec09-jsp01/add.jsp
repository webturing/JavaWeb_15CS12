<%
String sa=request.getParameter("A");
String sb=request.getParameter("B");
int ia=0;
int ib=0;
try{
	ia=Integer.parseInt(sa);
	ib=Integer.parseInt(sb);
}catch(Exception e){
	
	response.sendRedirect("add.html");
}


out.println(ia+ib);
%>