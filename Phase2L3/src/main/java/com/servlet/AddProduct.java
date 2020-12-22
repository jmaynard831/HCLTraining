package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Product;

/**
 * Servlet implementation class AddProduct
 */
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		// make a product
		Product p = new Product(request.getParameter("productName"), request.getParameter("ProductDescription"),
				Integer.parseInt(request.getParameter("productCost")),
				Double.parseDouble(request.getParameter("productWeight")));

		Session session = new Configuration().configure().buildSessionFactory().openSession();
		Transaction trnx = session.beginTransaction();

		try {
			session.save(p);
			trnx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("error.jsp");
		}

		response.getWriter().println("You have Committed.");

		response.setContentType("text/html");
		response.getWriter().println("<br><form method=\"post\" action=\"AddProduct.jsp\"><button type=\"submit\">"
				+ "Add Again</button></form>");

		System.out.println("Committed");

	}

}
