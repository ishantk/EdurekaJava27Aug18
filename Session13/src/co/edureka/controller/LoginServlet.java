package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.edureka.db.JDBCHelper;
import co.edureka.model.User;


@WebServlet({ "/LoginServlet", "/Login" })
public class LoginServlet extends HttpServlet {
	
	// doPost will entertain only post request sent by client
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("==doPost Executed==");
		
		User user = new User();
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		System.out.println("User Details: "+user);
		
		// Saving the Object into Table
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		boolean flag  = helper.loginUser(user);
		helper.closeConnection();
		
		// Writing the Response back to the client
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); // PrintWriter API is used to write back the response !!
		
		out.print("<html><body><center>");
		if(flag){
			String dateTime = new Date().toString();
			out.print("<h3>"+user.email+" Logged In Succesfully</h3><br/>Loogged on: "+dateTime);
			
			//out.print("<h4><a href='Welcome'>Enter Home</a></h4>");

			// 1. Session Tracking - Cookies
			// Cookie is a HashMap i.e. a key value pair created on user's machine i.e. in the browser app
			/*Cookie ck1 = new Cookie("keyEmail", user.email);
			Cookie ck2 = new Cookie("keyName", "Ben");
			Cookie ck3 = new Cookie("keyAge", String.valueOf(30)); // Cookies are saved as Strings

			//ck1.setMaxAge(expiry);
			
			response.addCookie(ck1);
			response.addCookie(ck2);
			response.addCookie(ck3);*/
			
			// 2. Session Tracking - URL Re-Writing
			//out.print("<h4><a href='Welcome?keyName=Ben&keyEmail="+user.email+"'>Enter Home</a></h4>");
			
			// 3. Session Tracking - Hidden Form Fields
			/*String form = "<form action='Welcome' method='post'>"
						+ "<input type='hidden' name='keyName' value='Ben'/>"
						+ "<input type='hidden' name='keyEmail' value='"+user.email+"'/>"
						+ "<input type='submit' value='Enter Home'/>"
						+ "</form>";
			
			out.print(form);*/
			
			// 4. Session Tracking - HTTPSession API
			
			HttpSession session = request.getSession();
			session.setAttribute("keyName", "Sia");
			session.setAttribute("keyEmail", user.email);
			out.print("<h4><a href='Welcome'>Enter Home</a></h4>");
			
		}else{
			out.print("<h3>"+user.email+" Not Logged In Succesfully</h3>");
			//response.sendRedirect("https://google.co.in"); // redirect the user to some other web resource
		}
		out.print("</center></body></html>");
	}

}
