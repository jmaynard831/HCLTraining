package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Login;
import com.service.LoginService;

/**
 * Servlet implementation class LoginServlets
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// So login.html contacts this method
		// and so now it needs make a loginServce obj
		// and then make a login obj
		// and then call service.login(login obj)

		LoginService ls = new LoginService();
		Login login = new Login(request.getParameter("uname"), request.getParameter("pass"));
		boolean loginFlag = ls.login(login);

		if(loginFlag) {
			response.getWriter().print("You have logged in.");
			HttpSession session = request.getSession();
			session.setAttribute("sessionName", request.getParameter("uname"));
			response.sendRedirect("dashboard.jsp");
		}
		else {
			response.setContentType("text/html");
			response.getWriter().println("Login Failed. Try again<br>");
			response.getWriter().println("<a href=\"login.html\">LOGIN</a><br>");
		}
		

	}

}
