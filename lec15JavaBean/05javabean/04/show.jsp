<%@ page contentType="text/html; charset=gb2312"%>
<%@ page import="com.yxq.toolbean.MyTools" %>

<!-- ��ȡrequest��Χ������ΪmyWord��WordSingle��ʵ�� -->
<jsp:useBean id="myWord" class="com.yxq.valuebean.WordSingle" scope="request"/>
<html>
	<title>��ʾ������Ϣ</title>
	<body>
		<table border="1" height="200" rules="rows">
			<tr>
				<td align="center">�� �� �ߣ�</td>
				<!-- ��ȡ�����ߺ����ת����� -->
				<td><%=MyTools.toChinese(myWord.getAuthor()) %></td>
			</tr>
			<tr height="30">
				<td align="center">���Ա��⣺</td>
				<!-- ��ȡ���Ա�������ת����� -->
				<td><%=MyTools.toChinese(myWord.getTitle()) %></td>
			</tr>
			<tr>
				<td align="center">�������ݣ�</td>
				<!-- ��ȡ�������ݺ����ת����� -->
				<td>
					<textarea rows="8" cols="34" readonly><%=MyTools.toChinese(myWord.getContent()) %></textarea>
				</td>
			</tr>
			<tr><td colspan="2" align="center"><a href="index.jsp">��������</a></td>
		</table>
	</body>
</html>
