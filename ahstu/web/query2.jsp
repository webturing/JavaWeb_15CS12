<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="TagUtil" tagdir="/WEB-INF/tags" %>
<div align="middle">
    <form action="query2.jsp" method="get">
        <p/>
        按学号查询：<input type="text" name="id"/>

        <p/>
        按班级查询：<input type="text" name="class"/>

        <p/>
        <input type="submit" value="查找"/>
    </form>
</div>
<%
    request.setCharacterEncoding("UTF-8");
    String condition = "select * from users where true ";
    String id = request.getParameter("id");
    if (id != null && !id.trim().isEmpty())
        condition += "and id like '%%" + id.trim() + "%%' ";
    String clas = request.getParameter("class");
    if (clas != null && !clas.isEmpty()) {
        //clas = util.CharacterTools.ISO88591ToUnicode(clas);
        condition += "and  class like '%%" + clas + "%%'  ";
    }
    condition += "LIMIT 100";
%>
<div align="middle"><TagUtil:DBQuery sql="<%=condition%>"/></div>