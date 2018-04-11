# lec09- JSP页面开发

## JSP工作原理/语法

- JSP环境（复习）
- 表达式```<%=Expression%>```
- 输出```<%out.println(Expression)%>```
- 导入包```<%@page import="java.util.*"%>```

## 案例

### 计算A+B

- add.html

  ```html
  <form action="add.jsp" method="get">
      A<input type="text" name="A">
      +
      B<input type="text" name="B">    
      <input type="submit" value="ADD">
  </form>
  ```

- add.jsp

- ```jsp
  <%
  int ia=0,ib=0;
  try{
      ia=Integer.parseInt(request.getParameter("A"));
      ib=Integer.parseInt(request.getParameter("B"));
  }catch(Exception e){}
  out.println(ia+ib);
  %>
  ```

- ​

### 登录系统

- 使用post提交数据
- 密码框<input type="password">
- 字符串处理
- 多用户登录//文件读写
- 传递参数

