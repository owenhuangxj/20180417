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
  
  <body>
  	<a href="login.jsp">回到登录页面</a>
  </body>
</html>
