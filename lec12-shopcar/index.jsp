<%@page language="java" contentType="text/html;charset=UTF-8" %>
<%@page import="java.util.*"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
	<div align="center">	
	当前登陆用户<%=session.getAttribute("name")%>
	<p>	
		<%
		if(session.getAttribute("name")==null)
		{%>
			<a href="login.html">请登陆</a>
		<%}
		else{%>

		<a href="logout.jsp">注销</a>

		<%}
		%>

	</p>


	<p>	购物车详情:

				<table border="1">
				<tr>
					<td>商品名称</td>
					<td>商品数量</td>
					<td>商品单价</td>
					<td>增加</td>
					<td>减少</td>
					<td>清零</td>
				</tr>
		<%
					double totalPrice=0;
				if(session.getAttribute("shopcar")!=null){
					TreeMap<String,Integer> shopcar=(TreeMap<String,Integer>)session.getAttribute("shopcar");
					TreeMap<String,Double> price=(TreeMap<String,Double>)session.getAttribute("price");	
						for(String goods:shopcar.keySet()){
						totalPrice+=shopcar.get(goods)*price.get(goods);
						%>
						<tr>
						<td><%=goods%></td>
						<td><%=shopcar.get(goods)%></td>
						<td><%=price.get(goods)%>RMB </td>
						<td><%="<a href=inc.jsp?goods="+goods%>> INC</a></td>
						<td><%="<a href=dec.jsp?goods="+goods%>> DEC</a></td>
						<td><%="<a href=clear.jsp?goods="+goods%>> CLEAR</a></td>
						</tr>
						<%
						}					
						

					}

		%>

		</table>
<p>所有商品总价<%=totalPrice%>RMB</p>
</div>

	


</body>
</html>