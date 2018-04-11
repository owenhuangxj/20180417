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
  <!-- form表单提交  method：提交方法：get/post:get:请求的参数会显示在url地址；不能上传文件；会显示在浏览记录里面；post：此三点与get相反-->
    <form action="loginServlet" method="post">
    	<!-- input type="submit"是提交表单的必须控件，当然可以不使用它，而通过js实现提交 -->
    	<input type="text" placeholder="用户名" required="required" name="username"/><br/>
    	<input type="password" placeholder="密码" required="required" name="pwd"/><br/>
    	<input type="submit" value="登录"/>
    </form>
  </body>
</html>
