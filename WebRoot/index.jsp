<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c"uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0"> 
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
  </head>
  
  <body>
   <form action="getAllEmp!getAll" method="post">
    
   <input type="submit" value="查询emp表">
   </form>
   <c:forEach items="${list}" var="emp">
  	${emp.empno }--${emp.ename}
  	<a  href="delete.jsp?empno=${emp.empno }&ename=${emp.ename}&job=${emp.job}">删除</a>
  	
  	<a href="update.jsp?empno=${emp.empno }&ename=${emp.ename}&job=${emp.job}">更改</a><br>
   </c:forEach>
   
 	<a href="add.jsp">添加</a><br>
   	<a href="showDeptlist.jsp">查询dept表</a><br>
  </body>

</html>
