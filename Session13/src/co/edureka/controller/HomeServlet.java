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


@WebServlet({ "/HomeServlet", "/Welcome" })
public class HomeServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Writing the Response back to the client
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); 
		out.print("<html><body><center>");
		Date date = new Date();
		out.print("<h3>Welcome Home User !!<br/> Its: "+date.toString()+"</h3>");
		
		//Cookie[] ckArr = request.getCookies(); // Read All the cookies for our app Session13
		//for(Cookie ck : ckArr){
		//	out.print(ck.getName()+" : "+ck.getValue()+"<br/>");
		//}

		//String name = request.getParameter("keyName");
		//String email = request.getParameter("keyEmail");
		
		HttpSession session = request.getSession();
		
		String name = (String)session.getAttribute("keyName");
		String email = (String)session.getAttribute("keyEmail");
		
		
		//session.invalidate(); // remove the session data
		
		out.print("Name: "+name+"<br/>Email:"+email);
		
		out.print("</center></body></html>");
	}

}
