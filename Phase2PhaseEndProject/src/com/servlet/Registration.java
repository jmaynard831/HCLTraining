package com.servlet;

import java.io.IOException;
//import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.service.UserService;

@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserService userService = new UserService();

		com.model.Registration reg = new com.model.Registration(request.getParameter("uname"),
				request.getParameter("email"), request.getParameter("city"));

		boolean regisFlag = userService.registration(reg);
		
		if(regisFlag) {
			HttpSession ses = request.getSession();
			ses.setAttribute("sesname", request.getParameter("uname"));
			response.sendRedirect("register.jsp");
		}
		

	}

}
