package com.capstone.capstone.service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.capstone.dao.OIDao;
import com.capstone.capstone.model.Order_Inventory;
import com.capstone.capstone.model.Orders;

@Service
public class OIService {

	@Autowired
	private OIDao oidao;

	public boolean saveOrder_Inventory(Order_Inventory o) {
		try {
			oidao.save(o);
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return false;
	}

	public Order_Inventory getOIbyOIID(UUID OrderID) {
		return oidao.findById(OrderID).get();
		
	}

	public List<Order_Inventory> getOIbyOrderID(UUID OrderID) {
		List<Order_Inventory> oilist = ((List<Order_Inventory>) oidao.findAll()).stream()
				.filter(oi -> oi.getOrder_id().getOrder_id().equals(OrderID)).collect(Collectors.toList());

		return oilist;
	}

}
