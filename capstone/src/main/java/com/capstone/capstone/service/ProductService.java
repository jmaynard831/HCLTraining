package com.capstone.capstone.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.capstone.dao.ProductDao;
import com.capstone.capstone.model.Product;

@Service
public class ProductService {

	@Autowired
	private ProductDao proddao;

	public boolean saveProduct(Product p) {
		try {
			proddao.save(p);
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return false;
	}

	public Product getProduct(UUID prod_id) {
		try {
			return proddao.findById(prod_id).get();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Product> getAllProducts() {
		try {
			return (List<Product>) proddao.findAll();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return null;
	}
}
