<%@ page contentType="text/html;charset=gb2312"%>
<form action="doword.jsp" method="post">
	<table border="1" rules="rows">
		<tr height="30">
			<td>�� �� �ߣ�</td>
			<td><input type="text" name="author" size="20"></td>
		</tr>
		<tr height="30">
			<td>���Ա��⣺</td>
			<td><input type="text" name="title" size="35"></td>
		</tr>
		<tr>
			<td>�������ݣ�</td>
			<td><textarea name="content" rows="8" cols="34"></textarea></td>
		</tr>
		<tr align="center" height="30">
			<td colspan="2">
				<input type="submit" value="�ύ">
				<input type="reset" value="����">
			</td>
	</table>
</form>