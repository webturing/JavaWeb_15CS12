<%@ page contentType="text/html; charset=gb2312" language="java" errorPage="" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title></title>
</head>

<body>
<%
//从request中获得Cookies集
Cookie[] cookies=request.getCookies();
//初始化Cookie对象为空
Cookie cookie_response=null;
if(cookies!=null){  
	  cookie_response=cookies[0];
	}
out.println("本次访问时间："+new java.util.Date()+"<br>");

if(cookie_response!=null){
 //输出上一次访问的时间。并设置cookie_response对象为最新时间。
   out.println("上一次访问时间："+cookie_response.getValue());
   cookie_response.setValue(new java.util.Date().toString());
 }
//如果Cookies集为空，创建cookie，并加入到response中
if(cookies==null){
   cookie_response=new Cookie("AccessTime","");
   cookie_response.setValue(new java.util.Date().toString());
   response.addCookie(cookie_response);
 }
%>
</body>
</html>
