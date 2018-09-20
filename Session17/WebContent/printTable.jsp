<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	// Expects number in Request Object
	String number = request.getParameter("number");

	try{
		// Convert String format to Integer
		int n = Integer.parseInt(number);
		for(int i=1;i<=10;i++){
			out.print(n+" "+i+"'s are "+(n*i)+"<br/>");
		}
	}catch(Exception e){
		out.print("<b><i>Please Enter a Valid Number</i></b>");
	}
	
	// Implement JDBC/Hibernate Here:
	// String name = request.getParameter("name");
	// String sql = "Select * from Employee whene name like "+name+"%";
	// Whatever Data will be retrieve using ResultSet send it back as response.

%>    