<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="printdate.jsp" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>
	<h3>Welcome Home,  <%= session.getAttribute("keyName") %> !! </h3>	
	<%
		/* Date date = new Date();
		out.print("Its: "+date+"<br/>"); */
		
		/*Cookie[] ckArr = request.getCookies();
		for(Cookie ck : ckArr){
			out.print(ck.getName()+" - "+ck.getValue()+" - "+ck.getPath()+"<br/>");
		}*/
		
		/* pageContext.getAttribute("keyEmail", PageContext.SESSION_SCOPE); */
		
	%>
	<h3>Your Email is: <%= session.getAttribute("keyEmail") %></h3>
	
	<jsp:include page="printdate.jsp"/>
	
</body>
</html>