<%@page import="java.util.*"%>
<%
		String goods=(String)request.getParameter("goods");
		if(goods!=null)
		{
				TreeMap<String,Integer> shopcar=(TreeMap<String,Integer>)session.getAttribute("shopcar");
				shopcar.put(goods,0);

		}
		response.sendRedirect("index.jsp");
%>