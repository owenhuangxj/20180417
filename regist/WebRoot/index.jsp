<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	
  </head>
  
  <body>
    <form action="RegistServlet" method="post">
    	<input type="text" placeholder="用户名" required="required">
    	<span></span>
    </form>
  </body>
  <script type="text/javascript" src="js/jquery-3.1.1.js"></script>
  <script type="text/javascript">
  	$(function(){
  		$("input").change(function(){
  			var input = $("input");
  			$.ajax({
  				type:"post",
  				url:"AjaxRegistServlet",
  				data:{username:$(this).val()},
  				dataType:"text",
  				success:function(data){
  					if("exist"==data.trim()){
  						input.val("");
  						input.focus();
  						$("span").text("*用户名已经存在").css("color","red");
  					}else if("ok"==data.trim()){
  						$("span").text("用户名可用").css("color","green");
  					}
  				}
  			});
  		});
  	});
  </script>
</html>
