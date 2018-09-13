package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edureka.model.User;


@WebServlet({ "/FrontController", "/Controller" })
public class FrontController extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Writing the Response back to the client
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); // PrintWriter API is used to write back the response !!
				
		// Response Sent back by FrontController	
		out.print("<html><body><center>");
		out.print("<h3>Welcome to FrontController</h3>");
		
		
		
		String requestType = request.getParameter("txtType"); 
		
		User user = new User();
		
		
		
		if(requestType.equals("Login")){
			
			
			
			user.email = request.getParameter("txtEmail");
			user.password = request.getParameter("txtPassword");
			
			if(user.email.isEmpty() || user.password.isEmpty()){
				RequestDispatcher dispatcher = request.getRequestDispatcher("existinguser.html");
				dispatcher.include(request, response);
				out.print("<h3>Please Enter Suitable Details First !!</h3>");
			}else{
				RequestDispatcher dispatcher = request.getRequestDispatcher("Wow");
				dispatcher.forward(request, response);
			}
			
		}else{ // Register

			user.name = request.getParameter("txtName");
			user.email = request.getParameter("txtEmail");
			user.password = request.getParameter("txtPassword");
			
			if(user.name.isEmpty() || user.email.isEmpty() || user.password.isEmpty()){
				RequestDispatcher dispatcher = request.getRequestDispatcher("newuser.html");
				dispatcher.include(request, response);
				out.print("<h3>Please Enter Suitable Details First !!</h3>");
			}else{
				RequestDispatcher dispatcher = request.getRequestDispatcher("Awesome");
				dispatcher.forward(request, response);
			}
			
		}
		
		out.print("</center></body></html>");		
	}

}
