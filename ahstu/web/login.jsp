<%@page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="TagUtil" tagdir="/WEB-INF/tags" %>
<form action="login.jsp" method="post">
    <p/>用户名：<input type="text" name="id"/>

    <p/>密 码：<input type="password" name="password"/>

    <p/><input type="submit" value="登陆"/>
</form>
<%
    String id = request.getParameter("id");
    String password = request.getParameter("password");
    boolean flag = false;
    String query = String.format("select * from users where id='%s' and password='%s'", id, util.MD5.md5(password));
    out.println(query);

%>
<DBUtil:DBQuery sql="<%=query%>"/>
<%=result%>
