<%@page import="javax.ws.rs.core.MediaType"%>
<%@page import="javax.ws.rs.core.UriBuilder"%>
<%@ page import="javax.ws.rs.client.WebTarget"%>
<%@ page import="javax.ws.rs.client.ClientBuilder"%>
<%@ page import="javax.ws.rs.client.Client"%>
<%@ page import="org.glassfish.jersey.client.ClientConfig"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Web Service Consumer</title>
</head>
<body>

	<h3>Welcome to REST Web Service Demo</h3>
	
	<%
		// Consuming the Web Service
		ClientConfig cConfig = new ClientConfig();
		Client client = ClientBuilder.newClient(cConfig);
		WebTarget target = client.target(UriBuilder.fromUri("http://localhost:8080/Session20").build());
	
		//							  /rest/hello	
		String plainResponse = target.path("rest").path("hello").request().accept(MediaType.TEXT_PLAIN).get(String.class);
		String htmlResponse = target.path("rest").path("hello").request().accept(MediaType.TEXT_HTML).get(String.class);
		String xmlResponse = target.path("rest").path("hello").request().accept(MediaType.TEXT_XML).get(String.class);
		String jsonResponse = target.path("rest").path("hello").request().accept(MediaType.APPLICATION_JSON).get(String.class);
		
	%>
	
	<b><h3>Responses:</h3></b>
	
	<h3>Plain Response: <%= plainResponse %></h3>
	<h3>HTML Response: <%= htmlResponse %></h3>
	<h3>XML Response: <%= xmlResponse %></h3>
	<h3>JSON Response: <%= jsonResponse %></h3>

</body>
</html>