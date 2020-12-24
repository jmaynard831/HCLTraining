package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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

		// make a product
		Product p = null;
		try {
			p = new Product(0, request.getParameter("productName"), request.getParameter("ProductDescription"),
					Integer.parseInt(request.getParameter("productCost")));

			HttpSession session = request.getSession();
			session.setAttribute("product", p);
			response.sendRedirect("error.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("AddProduct.jsp");
		}

	}

}
