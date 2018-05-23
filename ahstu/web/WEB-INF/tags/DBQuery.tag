<%@ tag import="java.sql.Connection" %>
<%@ tag import="java.sql.DriverManager" %>
<%@ tag import="java.sql.ResultSet" %>
<%@ tag import="java.sql.Statement" %>
<%@ tag import="java.util.Properties" %>
<%@tag pageEncoding="UTF-8" %>
<%@attribute name="sql" required="true" %>
<%@variable name-given="result" variable-class="java.lang.Boolean" scope="AT_END" %>
<%
    boolean flag = false;

    try {
        Class.forName(application.getInitParameter("driver"));
        Properties props = new Properties();
        props.put("user", application.getInitParameter("user"));
        props.put("password", application.getInitParameter("pass"));
        props.put("characterEncoding", application.getInitParameter("characterEncoding"));
        Connection con = DriverManager.getConnection(application.getInitParameter("url"), props);
        //out.println("<p/>con=" + con);

        Statement stmt = con.createStatement();
        out.println("<p/>" + sql);
        ResultSet rs = stmt.executeQuery(sql);

        out.println("<table border='1'>");
        out.print("<tr>");
        out.println("<td>id</td>");
        out.println("<td>name</td>");
        out.println("<td>gender</td>");
        out.println("<td>birthday</td>");
        out.println("<td>class</td>");
        out.println("<td>school</td>");
        out.println("<td>password</td>");
        out.println("<td>qq</td>");
        out.println("<td>telephone</td>");
        out.println("<td>email</td>");
        out.println("<td>picture</td>");
        out.println("<td>memo</td>");
        out.println("</tr>");
        while (rs.next()) {
            flag = true;
            out.print("<tr>");
            for (int i = 1; i <= 12; i++)
                out.print("<td>" + rs.getObject(i) + "</td>");
            out.println("</tr>");

        }
        out.println("</table>");
        rs.close();
        stmt.close();
        con.close();

    } catch (Exception e) {
        out.println(e.toString());
    }
    jspContext.setAttribute("result", flag);
%>