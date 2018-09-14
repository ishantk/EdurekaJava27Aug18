<%@page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="errorpage.jsp" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Tags Demo</title>
</head>
<body>

	<%-- <h4>c is: <% out.print(c); %></h4>  error --%>
	<h4>PI is: <% out.print(pi); %></h4>

	<h3>ScriptLet:</h3>
	<%
		int a = 10;
		int b = 20;
		int c = a+b;
		out.print("c is: "+c); // out -> Ref Var which points to the object of PrintWriter to write back response
	%>

	<h4>c is: <% out.print(c); %></h4>
	
	<h3>Declaration:</h3>
	<%!
		double pi = 3.14;
		double areaCircle(double radius){
			double area = pi * radius * radius;
			return area;
		}
	%>
	
	<h4>PI is: <% out.print(pi); %></h4>
	<h4>Area of Circle with radius 5.67 is: <% out.print(areaCircle(5.67)); %></h4>
	
	<h4>PI is: <%= pi %></h4>
	<h4>Area of Circle with radius 6.67 is: <%= areaCircle(6.67) %></h4>


	<%
		int[] arr = {10,20,30,40,50};
		out.print("arr[3] is: "+arr[3]);
		/*try{
			out.print("arr[30] is: "+arr[30]);
		}catch(Exception e){
			out.print("Some Error "+e);
		}*/
	%>
	
	<%
		// Traditionally how we create java object
		User user1 = new User();
		user1.setName("John");
		user1.setEmail("john@example.com");
		user1.setPassword("pass123");
	%>
	<br/>
	Name: <%= user1.getName() %><br/>
	Email: <%= user1.getEmail() %><br/>
	Password: <%= user1.getPassword() %><br/>
	<br/>

	<jsp:useBean id="user2" class="co.edureka.model.User"/>
	
	<jsp:setProperty property="name" name="user2" value="Jennie"/>
	<jsp:setProperty property="email" name="user2" value="jennie@example.com"/>
	<jsp:setProperty property="password" name="user2" value="jennie123"/>
	
	<br/>
	<br/>
	Name: <jsp:getProperty name="user2" property="name"/><br/>
	Email: <jsp:getProperty name="user2" property="email"/><br/>
	Password: <jsp:getProperty name="user2" property="password"/><br/>
	<br/>

</body>
</html>