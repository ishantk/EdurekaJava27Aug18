package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import co.edureka.model.User;


@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {


	public void destroy() {
		System.out.println("==Filter Destroy==");
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<h3>==Filter PreProcessing==</h3>");
		
		User user = new User();
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		if(user.email.isEmpty() || user.password.isEmpty()){
			out.println("<h3>==Please Enter Details First !!==</h3>");	
		}else{
			// pass the request along the filter chain
			chain.doFilter(request, response); // forward the request to the LoginServlet linked as in Wow
		}
		out.println("<h3>==Filter PostProcessing==</h3>");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("==Filter Init==");
	}

}
