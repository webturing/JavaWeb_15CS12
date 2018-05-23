<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="util.MD5" %>
<%@ page import="util.qrcode.QRTool" %>
<%@ page import="java.io.File" %>
<%@ page import="java.util.Date" %>
<div align="middle">
    <form action="qrcode.jsp">
        <p/>Enter URL or String:<input type="text" name="url" value="oj.ahstu.cc"/>

        <p/><input type="submit" value="生成二维码">


    </form>
</div>
<%

    String content = "http://www.ahstu.edu.cn";
    if (request.getParameter("url") != null) content = request.getParameter("url");
    String path = new File(request.getRealPath("qrcode.jsp")).getParent();
    String qrcode = MD5.md5(new Date().getTime() + "") + ".jpg";
    QRTool.url2qrcode(content, path, qrcode);
%>
<div align="middle"><img src="<%=qrcode%>" width="400" height="400"/></div>






