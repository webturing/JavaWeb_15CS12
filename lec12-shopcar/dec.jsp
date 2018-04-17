<%@page import="java.util.*"%>
<%
		String goods=(String)request.getParameter("goods");
		if(goods!=null)
		{
				TreeMap<String,Integer> shopcar=(TreeMap<String,Integer>)session.getAttribute("shopcar");
				if(shopcar.get(goods)>0)
						shopcar.put(goods,shopcar.get(goods)-1);

		}
		response.sendRedirect("index.jsp");
%>