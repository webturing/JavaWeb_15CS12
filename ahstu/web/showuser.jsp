<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="DBQuery" tagdir="/WEB-INF/tags" %>
<%
    String condition;
    if (request.getParameter("id") != null)
        condition = "select * from user where id='" + request.getParameter("id") + "'";
    else
        condition = "select * from user LIMIT 50";
%>
<div align="middle"><TagUtil:DBQuery sql="<%=condition%>"/></div>