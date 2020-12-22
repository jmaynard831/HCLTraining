package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.cfg.*;

import com.entity.Product;

public class ProductRetrieval extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProductRetrieval() {
		super();
		// TODO Auto-generated constructor stub
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String productName = request.getParameter("product_name");
		
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		// Transaction trnx = session.getTransaction();
		List<Product> list = session.createQuery("FROM Product p where p.name='"+productName+"'" , Product.class).getResultList();

		if(list.size()==0) {
			HttpSession sess = request.getSession();
			sess.setAttribute("productName",productName);
			response.sendRedirect("error.jsp");
		}
		
		for(Product p: list) {
			response.getWriter().println(p);
		}

	    response.setContentType("text/html");
		response.getWriter().println("<br><form method=\"post\" action=\"ProductSearch.html\"><button type=\"submit\">Search Again</button></form>");
		
		
		
	}

}
