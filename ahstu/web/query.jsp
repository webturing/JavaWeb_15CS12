<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="TagUtil" tagdir="/WEB-INF/tags" %>
<div align="middle">
    <form action="query.jsp" method="get">
        <p/>
        全字段模糊查询：<input type="text" name="kw"/>

        <p/>
        限制条数<input type="text" name="limit" value="50"/>

        <p/>
        <input type="submit" value="查找"/>
    </form>
</div>
<%
    request.setCharacterEncoding("UTF-8");
    String condition = "select * from users  ";
    String kw = request.getParameter("kw");
    if (kw != null && !kw.trim().isEmpty()) {
        condition += " where id like '%%" + kw + "%%' ";
        condition += " or name like '%%" + kw + "%%' ";
        condition += " or class like '%%" + kw + "%%'  ";
        condition += " or memo like '%%" + kw + "%%'";
    }

    condition += " LIMIT " + request.getParameter("limit");

%>
<div align="middle"><TagUtil:DBQuery sql="<%=condition%>"/></div>