<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ page import="org.displaytag.sample.*" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";


Object foo = session.getAttribute("test");
if( foo == null ) {
   session.setAttribute("test", new TestList(120, false) );
}
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
	<link rel="stylesheet" type="text/css" href="css/displaytag.css">  
    <link rel="stylesheet" type="text/css" href="css/screen.css">  
    <link rel="stylesheet" type="text/css" href="css/alternative.css">  
  </head>
  
  <body>
    <display:table name="sessionScope.test" export="true" pagesize="10" defaultsort="1">
	  	<display:caption>管理系统</display:caption>
		<display:column property="id" title="ID" sortable="true"/>
		<display:column property="name" maxLength="5"/>
		<display:column property="email" autolink="true" />
		<display:column property="status" href="detail.jsp" paramId="id" paramProperty="id"/>
		<display:column property="date" decorator="org.displaytag.sample.LongDateWrapper" />
		<display:column property="date" format="{0,date,yyyy-MM-dd HH:mm:ss}"  />
		<display:column property="description" title="Comments"/>
		<display:column property="url" autolink="true"></display:column>
		<display:footer><tr><th>版权所有</th></tr></display:footer>
	</display:table>
  </body>
</html>
