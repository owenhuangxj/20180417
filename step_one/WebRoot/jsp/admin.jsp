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
  	欢迎您,尊敬的用户 <%=session.getAttribute("user") %>
  	<h1>毛毛昨晚很规矩</h1>
  <body>
  
  </body>
</html>
