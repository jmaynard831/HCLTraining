package com.capstone.capstone.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.capstone.capstone.model.CartItem;
import com.capstone.capstone.model.Order_Inventory;
import com.capstone.capstone.model.Orders;
import com.capstone.capstone.model.Product;
import com.capstone.capstone.model.User;
import com.capstone.capstone.service.OIService;
import com.capstone.capstone.service.OrderService;
import com.capstone.capstone.service.ProductService;
import com.capstone.capstone.service.UserService;

@Controller
public class AppController {

	@Autowired
	private UserService userservice;

	@Autowired
	private ProductService prodservice;

	@Autowired
	private OrderService orderservice;

	@Autowired
	private OIService oiservice;

	@GetMapping("/AdminOrderList")
	public String adminOrderList(HttpSession session) {
		User u = (User) session.getAttribute("user");
		if (u != null && u.isAdmin()) {
			List<Orders> ordersList = orderservice.getUserOrders(u);
			session.setAttribute("Orders", ordersList);
			return "AdminOrderList";

		}
		return "redirect:/failure";
	}

	@PostMapping("/AdminOrderList")
	public String adminOrderListButton(HttpSession session, @RequestParam("orderID") String orderID) {
		User u = (User) session.getAttribute("user");
		if (u != null && u.isAdmin()) {
			List<Order_Inventory> OIList = oiservice.getOIbyOrderID(UUID.fromString(orderID));
			session.setAttribute("OIList", OIList);
			return "redirect:/AdminOrderEdit";
		}
		return "failure";
	}

	@GetMapping("/AdminOrderEdit")
	public String orderEdit(HttpSession session) {
		User u = (User) session.getAttribute("user");
		if (u != null && u.isAdmin()) {

			return "AdminOrderEdit";
		}

		return "failure";
	}

	@PostMapping("/AdminOrderEdit")
	public String orderEdit(HttpSession session, @RequestParam("OI_id") String oiID,
			@RequestParam("quantity") int qty) {
		User u = (User) session.getAttribute("user");
		if (u != null && u.isAdmin()) {
			// find the oi with that id, make its qty change, save it, redirect to admin
			// page
			Order_Inventory oi = oiservice.getOIbyOIID(UUID.fromString(oiID));
			oi.setQuantity(qty);
			oiservice.saveOrder_Inventory(oi);
			return "redirect:/AdminOrderList";
		}

		return "failure";
	}

	@GetMapping("/newprod")
	public String newprod(HttpSession session) {
		session.setAttribute("products", prodservice.getAllProducts());
		User u = (User) session.getAttribute("user");
		if (u != null && u.isAdmin()) {
			return "newprod";
		}
		return "failure";
	}

	@PostMapping("/newprod")
	public String newprod(Product p, HttpSession session) {
		User u = (User) session.getAttribute("user");
		if (u != null && u.isAdmin()) {
			prodservice.saveProduct(p);
			return "newprod";
		}
		return "failure";
	}

	@GetMapping("/orderform")
	public String orderNow(HttpSession session) {
		if (session.getAttribute("user") != null)
			return "orderform";

		return "failure";
	}

	@PostMapping("/orderform")
	public String orderNow(HttpSession session, @RequestParam("saStreet") String street,
			@RequestParam("saCity") String city, @RequestParam("saZip") String zipcode,
			@RequestParam("saState") String state) {
		if (session.getAttribute("user") != null) {
			// Pull out the user from the session
			User user = (User) session.getAttribute("user");
			// Create the order object from the data
			Orders order = new Orders(user, "right now!", street, city, state, zipcode);
			orderservice.saveOrder(order);
			// Get the shopping cart from the session
			ArrayList<CartItem> cart = ((ArrayList<CartItem>) session.getAttribute("ShoppingCart"));
			// For each item in the cart, create a order_inventory object and save it.
			cart.stream().forEach(cartitem -> {
				Order_Inventory oi = new Order_Inventory(order, cartitem.getProduct(), cartitem.getQuantity());
				oiservice.saveOrder_Inventory(oi);

			});
			// empty the shopping cart by overwriting it with a new one
			session.setAttribute("ShoppingCart", new ArrayList<CartItem>());
			return "orderform";
		}
		return "failure";
	}


	@GetMapping("/test")
	public String test() {
		// User a = new User("Jake","pass");
		// User b = new User("foo","foo");
		// User c = new User("Snicker","bars");
		// userservice.saveUser(a);
		// userservice.saveUser(b);
		// userservice.saveUser(c);
		// Orders order1 = new Orders(a,"today");
		// Orders order2 = new Orders(b,"May");
		// Orders order3 = new Orders(a,"tomorrow");
		// Orders order4 = new Orders(c,"Halloween");
		// orderservice.saveOrder(order1);
		// orderservice.saveOrder(order2);
		// orderservice.saveOrder(order3);
		// orderservice.saveOrder(order4);

		// Product p1 = new Product("Guitar");
		// Product p2 = new Product("Cactus");
		// Product p3 = new Product("ps5");
		// Product p4 = new Product("Opera's Greatest Hits 7");
		// Product p5 = new Product("Pants");
		// Product p6 = new Product("Ice Cream");
		//
		// prodservice.saveProduct(p1);
		// prodservice.saveProduct(p2);
		// prodservice.saveProduct(p3);
		// prodservice.saveProduct(p4);
		// prodservice.saveProduct(p5);
		// prodservice.saveProduct(p6);
		//
		return "test";
	}

	@GetMapping("/product_list")
	public String ListAllProducts(HttpSession session) {
		session.setAttribute("products", prodservice.getAllProducts());
		return "product_list";
	}

	@GetMapping("/product_list/{product_id}")
	public String ListAllProducts(@PathVariable("product_id") String product_id, HttpSession session) {
		// convert id to object right now
		Product p = prodservice.getProduct(UUID.fromString(product_id));
		session.setAttribute("thisProduct", p);
		return "shoppingPage";
	}

	@GetMapping("/shoppingcart")
	public String shoppingCartDisplay(HttpSession session) {
		if (session.getAttribute("user") != null)
			return "shoppingcart";

		return "failure";
	}

	@PostMapping("/shoppingcart")
	public String startOrderDisplay(HttpSession session) {
		if (session.getAttribute("user") != null)
			return "redirect:/orderform";

		return "failure";
	}

	@PostMapping("/test")
	public String test(@RequestParam("testname") String testname, HttpSession session) {

		return "redirect:/shoppingcart";
	}

	@GetMapping("/welcome")
	public String welcome(HttpSession session) {
		if (session.getAttribute("user") != null)
			return "welcome";

		return "failure";
	}

	@GetMapping("/failure")
	public String failure() {
		return "failure";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/addtocart")
	public String addToCart(@RequestParam("prod_id") String prod_id, @RequestParam("quantity") int quantity,
			HttpSession session) {
		if (session.getAttribute("user") != null) {
			Product p = prodservice.getProduct(UUID.fromString(prod_id));
			CartItem c = new CartItem(p, quantity);
			ArrayList<CartItem> cart = ((ArrayList<CartItem>) session.getAttribute("ShoppingCart"));
			cart.add(c);
			session.setAttribute("ShoppingCart", cart);
			return "redirect:/product_list";
		}

		return "redirect:/failure";
	}

	@PostMapping("/login")
	public String login(User u, HttpSession session) {

		User user = userservice.login(u);

		if (user != null) {
			session.setAttribute("user", user);
			session.setAttribute("ShoppingCart", new ArrayList<CartItem>());
			return "redirect:/product_list";
		} else {
			// send to error page
			return "redirect:/failure";
		}

	}

	@PostMapping("/register")
	public String register(User u) {
		if (userservice.saveUser(u)) {
			return "redirect:/login";
		} else {
			return "redirect:/failure";
		}

	}

	@GetMapping("/register")
	public String register() {
		return "register";
	}

}
