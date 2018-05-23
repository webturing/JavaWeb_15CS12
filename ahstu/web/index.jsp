<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="TagUtil" tagdir="/WEB-INF/tags" %>

<%
    String id = (String) session.getAttribute("id");
    String condition = "select * from users where true ";
    if (id == null || id.isEmpty()) {

    } else {
        condition += " and id like '%%" + id + "%%'";
    }
    condition += " LIMIT 50";
%>

<div align="middle"><TagUtil:DBQuery sql="<%=condition%>"/></div>