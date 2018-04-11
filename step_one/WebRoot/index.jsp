<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
/* request.getContextPath()获取项目名 */
String path = request.getContextPath();
/* request.getScheme()：协议；request.getServerName()：服务区所在地址->域名；request.getServerPort()：服务器监测端口 */
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>

  <head>
  <meta charset="utf-8">
  	<!-- 设置基准url地址 -->
    <base href="<%=basePath%>">
    <title>登录页面</title>
  </head>
  	<!-- session.getAttribute("user") 获取到存入session中的javaBean,javaBean：属性、setter、getter、构造器、toString，实现serializable接口
  	承载数据的作用，传递它方便 此处是显示user对象，会调用toString方法-->
  	欢迎您,尊敬的用户 <%=session.getAttribute("user") %>
  	<a href="jsp/admin.jsp">去到管理页面</a>
  <body>
  
  </body>
</html>
