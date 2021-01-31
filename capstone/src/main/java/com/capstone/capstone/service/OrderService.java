package com.capstone.capstone.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.capstone.dao.OrderDao;
import com.capstone.capstone.model.Orders;
import com.capstone.capstone.model.User;

@Service
public class OrderService {

	@Autowired 
	private OrderDao orderdao;
	
	public boolean saveOrder(Orders o) {
		try {
			orderdao.save(o);
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return false;
	}

	public List<Orders> getUserOrders(User u) {
	/*
	 * we have a user. Find every order that has this user id.
	 */
		List<Orders> orderslist =( (List<Orders>) orderdao.findAll()).stream().filter(order -> 
			order.getUser().getUser_id().equals(u.getUser_id())
		).collect(Collectors.toList());
		
		return orderslist;
	}

	
}
