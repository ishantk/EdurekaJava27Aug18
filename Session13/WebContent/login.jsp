<%@ page import="co.edureka.db.JDBCHelper"%>
<%@ page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	Validating User with Email ${param.txtEmail} ...
	<br/>
	<%
		User user = new User();
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		System.out.println("User Details: "+user);
		
		// Saving the Object into Table
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		boolean flag  = helper.loginUser(user);
		helper.closeConnection();
		
		if(flag){
			%>
				<h3>Login Successful for <%= user.email %></h3>
				<!-- <a href="welcome.jsp">Enter Home</a> -->
				<jsp:forward page="welcome.jsp"/>
			<%	
				// Session Tracking
				/*Cookie ck1 = new Cookie("keyEmail",user.email);
				Cookie ck2 = new Cookie("keyName","Naomi");	
				
				response.addCookie(ck1);
				response.addCookie(ck2);*/
				
				// HW: Try URL ReWriting and Hidden Form Fields
				
				session.setAttribute("keyEmail", user.email);
				session.setAttribute("keyName", "Naomi");
				
				pageContext.setAttribute("keyEmail", user.email, PageContext.SESSION_SCOPE);
						
				}else{
			%>
				<h3>Login Failed for <%= user.email %></h3>
			<%	
				
				response.sendRedirect("https://google.co.in");
				
				}
			%>


</body>
</html>