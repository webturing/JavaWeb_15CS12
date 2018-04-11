# lec08 :JSP开发环境搭建

## HTTP工作原理

- 用户在浏览器地址输入网址（点击一个链接，扫一个二维码...)请求一个页面request 发送参数
- 服务器响应response这个请求 
  - 如果是静态页面(.html/htm)则直接通过Internet下载到客户机浏览器中
  - 如果是动态页面(.jsp/.asp)则要结合服务器的运行环境和数据库等来生成一个结果页(.html)，然后通过Internet下载到客户机浏览器中
- 用户下载完毕这个网页，浏览器停止旋转（表示</html>已经下载结束)

总结:HTTP是无状态连接，采用TCP/IP协议进行请求-应答的3次握手模型

## JSP开发环境搭建

- 安装jdk（>=1.7)

- 安装Tomcat

- 安装eclipse for JEE或者IntelliJ

- 根据需要安装数据库MYSQL

  ## 构建第一个JSP项目

  1. 掌握JSP开发的调试
  2. 掌握打包.war
  3. Tomcat服务器管理

