<%@page language="java" contentType="text/html;charset=UTF-8"%>
<p>访问方法<%=request.getMethod()%></p>
<p>访问协议<%=request.getProtocol()%></p>
<p>客户端的IP地址<%=request.getRemoteAddr()%></p>
<p></p>
<p><%=request.isSecure()%></p>


