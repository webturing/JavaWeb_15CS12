<%@ page contentType="text/html; charset=gb2312"%>
<%@ page import="com.yxq.toolbean.MyTools" %>

<!-- 获取request范围内名称为myWord的WordSingle类实例 -->
<jsp:useBean id="myWord" class="com.yxq.valuebean.WordSingle" scope="request"/>
<html>
	<title>显示留言信息</title>
	<body>
		<table border="1" height="200" rules="rows">
			<tr>
				<td align="center">留 言 者：</td>
				<!-- 获取留言者后进行转码操作 -->
				<td><%=MyTools.toChinese(myWord.getAuthor()) %></td>
			</tr>
			<tr height="30">
				<td align="center">留言标题：</td>
				<!-- 获取留言标题后进行转码操作 -->
				<td><%=MyTools.toChinese(myWord.getTitle()) %></td>
			</tr>
			<tr>
				<td align="center">留言内容：</td>
				<!-- 获取留言内容后进行转码操作 -->
				<td>
					<textarea rows="8" cols="34" readonly><%=MyTools.toChinese(myWord.getContent()) %></textarea>
				</td>
			</tr>
			<tr><td colspan="2" align="center"><a href="index.jsp">继续留言</a></td>
		</table>
	</body>
</html>
